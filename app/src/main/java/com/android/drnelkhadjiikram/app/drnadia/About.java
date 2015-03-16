package com.android.drnelkhadjiikram.app.drnadia;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class About extends ActionBarActivity {

    TextView phone;
    TextView address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);



        phone = (TextView) findViewById(R.id.phone);
        address = (TextView) findViewById(R.id.address);

       phone.setOnClickListener(new View.OnClickListener() {
                                         public void onClick(View arg0) {

                      Intent callIntent = new Intent(Intent.ACTION_CALL);
                        callIntent.setData(Uri.parse("tel:+" + phone.getText().toString().trim()));
                         startActivity(callIntent );

                                         }
                                     }
        );







    address.setOnClickListener(new View.OnClickListener() {
        public void onClick(View arg0) {




            // Start RequestActivity.class
            Intent myIntent = new Intent(About.this,MapsActivity.class);
            startActivity(myIntent);
        }





    }
    );


    }









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
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
