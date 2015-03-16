package com.android.drnelkhadjiikram.app.drnadia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class NutritionConsultationForms extends Activity {
    Button button;
    Button buttonPNC;
    Button buttonGrocery;
    Button buttonCooking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_consultation_forms);
        addListenerOnButton();
        buttonPNC = (Button) findViewById(R.id.pnc);
        buttonGrocery = (Button) findViewById(R.id.Grocery);
        buttonCooking = (Button) findViewById(R.id.cooking);
        // Capture button PNC clicks
        buttonPNC.setOnClickListener(new OnClickListener() {
                                         public void onClick(View arg0) {

                                             // Start RequestActivity.class
                                             Intent myIntent = new Intent(NutritionConsultationForms.this,PNC.class);
                                             startActivity(myIntent);
                                         }
                                     }
        );


// Capture button Grocery clicks
    buttonGrocery.setOnClickListener(new OnClickListener() {
        public void onClick(View arg0) {

            // Start RequestActivity.class
            Intent myIntent = new Intent(NutritionConsultationForms.this,GroceryStoreTours.class);
            startActivity(myIntent);
        }
    }
    );
        // Capture button cooking clicks
        buttonCooking.setOnClickListener(new OnClickListener() {
                                         public void onClick(View arg0) {

                                             // Start RequestActivity.class
                                             Intent myIntent = new Intent(NutritionConsultationForms.this,CookingDemos.class);
                                             startActivity(myIntent);
                                         }
                                     }
        );

}



    public void addListenerOnButton() {

        button = (Button) findViewById(R.id.button1);

        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent browserIntent =
                        new Intent(Intent.ACTION_VIEW, Uri.parse("http://goo.gl/forms/UH6bBG3L5k"));
                startActivity(browserIntent);

            }

        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nutrition_consultation_forms, menu);
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





