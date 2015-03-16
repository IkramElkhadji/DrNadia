package com.android.drnelkhadjiikram.app.drnadia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;

public class HomeActivity extends Activity {
    Button buttonCalcul;
    Button buttonRequest;
    Button buttonAbout;
    Button buttonForms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

// Locate the button in activity_main.xml
        buttonCalcul = (Button) findViewById(R.id.calcul);
        buttonRequest = (Button) findViewById(R.id.appointment);
            buttonAbout = (Button) findViewById(R.id.about);
        buttonForms = (Button) findViewById(R.id.Forms);



        // Capture button share clicks
        buttonCalcul.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(HomeActivity.this,CalculActivity.class);
                startActivity(myIntent);
            }
        }
        );

        // Capture button Request clicks
        buttonRequest.setOnClickListener(new OnClickListener() {
                                           public void onClick(View arg0) {

                                               // Start RequestActivity.class
           Intent myIntent = new Intent(HomeActivity.this,RequestActivity.class);
                   startActivity(myIntent);
                                           }
                                       }
        );



        // Capture button Forms clicks
        buttonForms.setOnClickListener(new OnClickListener() {
                                             public void onClick(View arg0) {

                                                 // Start RequestActivity.class
               Intent myIntent = new Intent(HomeActivity.this,NutritionConsultationForms.class);
                                                 startActivity(myIntent);
                                             }
                                         }
        );


        // Capture button about clicks
        buttonAbout.setOnClickListener(new OnClickListener() {
                                           public void onClick(View arg0) {

                                               // Start RequestActivity.class
                                               Intent myIntent = new Intent(HomeActivity.this,About.class);
                                               startActivity(myIntent);
                                           }
                                       }
        );






    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}



