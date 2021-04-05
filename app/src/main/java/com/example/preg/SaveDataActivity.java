package com.example.preg;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SaveDataActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.save_items_activity);

        textView = (TextView) findViewById(R.id.textView5);
        editText = (EditText) findViewById(R.id.editText2);

        loadData();
    }

    private void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);

        String data = sharedPreferences.getString("message", "");

        textView.setText(data);
    }

    public void saveData(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("pref", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        String data = editText.getText().toString();
        textView.setText(data);

        editor.putString("message", data);
        editor.apply();

        Toast.makeText(SaveDataActivity.this, "Data saved", Toast.LENGTH_SHORT).show();
    }
}
