package com.example.sonu.notemakingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);

        DBActivity1 db = new DBActivity1(getApplicationContext());

        ListView list = findViewById(R.id.notesList);

        ArrayList<String> list2 = db.getNotes();

        Log.d("list", list2.get(0));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list2);
        list.setAdapter(adapter);



    }
}