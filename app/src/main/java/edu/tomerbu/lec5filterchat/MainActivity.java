package edu.tomerbu.lec5filterchat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent theClientIntent = getIntent();

        String text = theClientIntent.getStringExtra(Intent.EXTRA_TEXT);

        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
