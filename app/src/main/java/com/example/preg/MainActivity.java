package com.example.preg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText messageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageEditText = (EditText) findViewById(R.id.messageEditText);
    }

    public void openGoogle(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com"));
        startActivity(intent);
    }

    public void sendMessage(View view) {
        String message = messageEditText.getText().toString();
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        intent.putExtra("message", message);

        startActivity(intent);
    }

    public void openList(View view) {
        Intent intent = new Intent(this, DisplayListActivity.class);
        startActivity(intent);
    }

    public void openSave(View view){
        Intent intent = new Intent(this, SaveDataActivity.class);
        startActivity(intent);
    }
}