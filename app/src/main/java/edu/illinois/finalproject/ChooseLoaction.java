package edu.illinois.finalproject;

import android.app.DownloadManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import org.json.JSONException;
import org.json.JSONObject;

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
        isr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openIsr();
            }
        });
        final Button quad = (Button) findViewById(R.id.quad);
        quad.setOnClickListener(new View.OnClickListener() {
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
    public void weatherAPICall() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                    "http://api.openweathermap.org/data/2.5/weather?zip=61820,us&appid="
                            + BuildConfig.API_KEY,
                    null,
                    new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(final JSONObject response) {
                        }
                    }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(final VolleyError error) {
                    Log.e(TAG, error.toString());
                }
            });
            requestQueue.add(jsonObjectRequest);
    }
}
