package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        String s = i.getExtras().getString("testString");

        textView2 = findViewById(R.id.textView2);
        textView2.setText(s);

    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("ImageID", imageID);

        setResult(RESULT_OK, intent);
        super.finish();
    }
}
