package com.example.networking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private String[] mountName;
    private ArrayList<String> mountList = new ArrayList<>(Arrays.asList(mountName));
    private ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.list_view);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
