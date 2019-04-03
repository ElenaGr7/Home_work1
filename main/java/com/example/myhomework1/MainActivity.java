package com.example.myhomework1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button linkButton = findViewById(R.id.button2);
        linkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viw) {
                Intent browserIntent = new
                        Intent(Intent.ACTION_VIEW, Uri.parse("https://devfest-spb.com/"));
                startActivity(browserIntent);
            }
        });
    }
}



