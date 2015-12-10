package com.ewha.graduate.mobileprogramming.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SelectPictureActivity extends Activity {

    private static final int SELECT_PICTURE = 1;

    TextView restaurantNameText;
    ImageView restaurantImage;
    ImageView selectPictureImageView;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_picture);
        i = getIntent();

        restaurantImage = (ImageView) findViewById(R.id.restaurantImageView);
        restaurantNameText = (TextView) findViewById(R.id.restaurantNameTextView);
        setRestaurantInformation();
        init();
    }

    private void setRestaurantInformation() {
        String restaurantName = (String) i.getStringExtra("restaurantName");
        restaurantNameText.setText(restaurantName);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_select_picture, menu);
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

    public void init() {
        Intent intent = new Intent(Intent.ACTION_PICK);

        intent.setType("image/*");
        startActivityForResult(intent, SELECT_PICTURE);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == SELECT_PICTURE && resultCode == RESULT_OK) {
            Uri selectedImageUri = data.getData();
            restaurantImage.setImageURI(selectedImageUri);

        }

    }

}
