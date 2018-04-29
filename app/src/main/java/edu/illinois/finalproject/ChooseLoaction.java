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
        final Button far = (Button) findViewById(R.id.far);
        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFar();
            }
        });
        final Button isr = (Button) findViewById(R.id.isr);
        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIsr();
            }
        });
        final Button quad = (Button) findViewById(R.id.quad);
        far.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuad();
            }
        });
    }
    public void openIke() {
        Intent intent = new Intent(this, ike.class);
        startActivity(intent);
    }
    public void openGreen() {
        Intent intent = new Intent(this, green.class);
        startActivity(intent);
    }
    public void openFar() {
        Intent intent = new Intent(this, far.class);
        startActivity(intent);
    }
    public void openIsr() {
        Intent intent = new Intent(this, isr.class);
        startActivity(intent);
    }
    public void openQuad() {
        Intent intent = new Intent(this, quad.class);
        startActivity(intent);
    }
}
