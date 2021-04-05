package com.example.preg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayMessageActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message_activity);
        textView = (TextView) findViewById(R.id.yourMessageText);

        Intent intent = getIntent();
        String message=intent.getStringExtra("message");
        textView.setText(message);
    }
}
