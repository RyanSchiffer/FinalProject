package edu.illinois.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseLoaction extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_loaction);
        final Button ike = (Button) findViewById(R.id.ike);
        ike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIke();
            }
        });
        final Button green = (Button) findViewById(R.id.green);
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGreen();
            }
        });
        final Button
    }
    public void openIke() {
        Intent intent = new Intent(this, ike.class);
        startActivity(intent);
    }
    public void openGreen() {
        Intent intent = new Intent(this, green.class);
        startActivity(intent);
    }
}
