package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mountain> mountainArrayList = new ArrayList<>();


    ListView myListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mountainArrayList.add(new Mountain("Matterhorn","Alps",4478));
        mountainArrayList.add(new Mountain("Mont Blanc","Alps",4808));
        mountainArrayList.add(new Mountain("Denali","Alaska",6190));
        ArrayAdapter<Mountain> mountainArrayAdapter = new ArrayAdapter<Mountain>(this, R.layout.list_item, R.id.list_item, mountainArrayList);

        myListView = findViewById(R.id.my_listview);
        myListView.setAdapter(mountainArrayAdapter);
    }
}
