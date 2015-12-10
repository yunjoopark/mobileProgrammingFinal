package com.ewha.graduate.mobileprogramming.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    RestaurantAdapter restaurantAdapter;
    ListView restaurantListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        restaurantAdapter = new RestaurantAdapter(this, generateElement());
        restaurantListView = (ListView) findViewById(R.id.restaurantListView);

        restaurantListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Clicked at " + position, Toast.LENGTH_LONG).show();

                // set onClick for the selectPicture
                view.findViewById(R.id.selectPicture).setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {

                        //selectPicture(v);

                    }
                });
            }
        });
        restaurantListView.setAdapter(restaurantAdapter);
    }

    private ArrayList<RestaurantElement> generateElement() {
        ArrayList<RestaurantElement> restaurantElementArrayList = new ArrayList<RestaurantElement>();

        return restaurantElementArrayList;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void addRestaurant(View view) {
        RestaurantElement restaurantElement = new RestaurantElement();
        restaurantAdapter.add(restaurantElement);
    }

    public void selectPicture(View view) {
        Intent intent = new Intent(MainActivity.this, SelectPictureActivity.class);
        View rootView = view.getRootView();
        EditText restaurantNameEditText = (EditText) rootView.findViewById(R.id.restaurantNameEditText);

        String restaurantName = restaurantNameEditText.getText().toString();
        intent.putExtra("restaurantName", restaurantName);
        /**
         * TODO: Add serializable/parcelable object.....
         *
         * RestaurantElement implements Serializable/parcelable;
         *
         * and then set Flag if the picture set.
         */

        //intent.addFlags(1);

        startActivity(intent);
    }

}
