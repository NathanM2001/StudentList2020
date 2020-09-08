package com.cs315.studentlist2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ProfTannerActivity extends AppCompatActivity {


    ListView languageList;

    // Array of strings...
    String langArray[] = {
            "C#",
            "Objective-C",
            "Swift",
            "Java",
            "Kotlin",
            "C",
            "C++",
            "HTML ... is it a real language?",
            "CSS",
            "PHP",
            "JavaScript (some)",
            "ActionScript (ye olde days of Flash)",
            "!Python",
            "!LUA",
            "BASIC (4evr ago)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prof_tanner);

        languageList = (ListView)findViewById(R.id.App_List);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, langArray);
        languageList.setAdapter(arrayAdapter);
    }
}