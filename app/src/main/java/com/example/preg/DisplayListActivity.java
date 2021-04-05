package com.example.preg;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DisplayListActivity extends AppCompatActivity {

    private ArrayList<String> items = new ArrayList<>();
    private ListView listView;
    private EditText addItemTextEdit;
    private ArrayAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_list_activity);

        listView = (ListView) findViewById(R.id.itemsList);
        addItemTextEdit = (EditText) findViewById(R.id.addItemTextEdit);

        items.add("Ciubi");
        items.add("Deni");
        items.add("Mana");
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        listView.setAdapter(adapter);
    }

    public void addItem(View view){
        String item = addItemTextEdit.getText().toString();
        items.add(item);
        adapter.notifyDataSetChanged();
    }
}
