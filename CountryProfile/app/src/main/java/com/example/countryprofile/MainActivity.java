package com.example.countryprofile;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshbutton, indiabutton, pakistanbutton;

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshbutton = findViewById(R.id.bangladeshId);
        indiabutton = findViewById(R.id.indiaId);
        pakistanbutton = findViewById(R.id.pakistanId);

        bangladeshbutton.setOnClickListener(this);
        indiabutton.setOnClickListener(this);
        pakistanbutton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.bangladeshId) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        if (v.getId() == R.id.indiaId) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }

        if (v.getId() == R.id.pakistanId) {
            Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }



    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.emergency_alert_icon_alert_icon_8);
        alertDialogBuilder.setTitle(R.string.title_text);
        alertDialogBuilder.setMessage(R.string.message_text);
        alertDialogBuilder.setCancelable(false);

        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();

            }
        });

        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
        
    }
}