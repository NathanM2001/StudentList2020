package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{


    ListView AppList;

    //array of app ideas
    String AppArray [] = {
            "Fitness App(Click to learn more!!)",
            "Countdown Timer",
            "Calorie Counter",
            "To-Do App",
            "Tip Calculator App",
            "Food Recommendation App"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppList = (ListView)findViewById(R.id.App_List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, AppArray);
        AppList.setAdapter(arrayAdapter);
        AppList.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String appSelected = (String) AppList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            case 0:
                // by specific index
                Toast.makeText(this, appSelected + " is weird", Toast.LENGTH_LONG).show();
                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, appSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (appSelected == "Fitness App(Click to learn more!!)") {
            // go to a new activity
            Context context = AppList.getContext();
            Intent intent = new Intent(context, AppInfo.class);
            context.startActivity(intent);
        }
    }

}