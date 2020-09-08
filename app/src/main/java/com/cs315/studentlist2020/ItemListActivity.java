package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ItemListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView simpleList;

    // Array of strings...
    String peopleList[] = {
            "Fisher Coburn",
            "Brady Cox",
            "Anthony Cuthbert",
            "Zach Elledge-McGhee",
            "Will Gibbs",
            "Caleb Jackson",
            "Carson Kelley",
            "Ben Lamont",
            "Sean Logsdon",
            "Julio Lopez",
            "Nathan McKenzie",
            "Tanner Parker",
            "Matthew Pietrucha",
            "Garrett Powell",
            "Justin Raitz",
            "Miranda Ramirez Cospin",
            "Will Stanley",
            "Prof Tanner"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textViewInLists, peopleList);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(this);  // set THIS class as the listener
    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
        // we got notified that something was selected!  AND we know WHICH ITEM was selected!

        // get the value of the string in the specific position of the array that was selected (tapped on)
        String personSelected = (String) simpleList.getAdapter().getItem(position);

        /** do something cool based on the INDEX (int) of the selected item **/
        switch (position) {
            case 10:
                // by specific index
                Toast.makeText(this, personSelected + " likes to blackout", Toast.LENGTH_LONG).show();
                break;
            default:
                // every case that wasn't specifically called out
                Toast.makeText(this, personSelected + " selected", Toast.LENGTH_LONG).show();
                break;
        }

        /** do something cool based on the VALUE (string) of the selected item **/
        if (personSelected == "Nathan McKenzie") {
            // go to a new activity
            Context context = simpleList.getContext();
            Intent intent = new Intent(context, MainActivity.class);
            context.startActivity(intent);
        }
    }
}