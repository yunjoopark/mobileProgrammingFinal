package com.ewha.graduate.mobileprogramming.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by lab on 2015-12-09.
 */
public class RestaurantAdapter extends ArrayAdapter<RestaurantElement> {

    private final Context context;
    private final ArrayList<RestaurantElement> restaurantArrayList;

    public RestaurantAdapter(Context context, ArrayList<RestaurantElement> restaurantArrayList) {

        super(context, R.layout.sample_restaurant_element_view, restaurantArrayList);

        this.context = context;
        this.restaurantArrayList = restaurantArrayList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        RestaurantHolder holder = null;
//            holder = new RestaurantHolder();
//            holder.selectPictureImageView = (ImageView) rowView.findViewById(R.id.selectPictureView);
//            holder.restaurantNameText = (EditText) rowView.findViewById(R.id.restaurantNameTextView);
//            holder.ratingBar = (RatingBar) rowView.findViewById(R.id.myRatingBar);

//        RestaurantElement restaurantElement = null;

// 1. Create inflater
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // 2. Get rowView from inflater
//        View rowView = inflater.inflate(R.layout.sample_restaurant_element_view, null, true);
        View rowView = inflater.inflate(R.layout.sample_restaurant_element_view, parent, false);


        if (convertView == null) {
//            restaurantElement = new RestaurantElement();
//            restaurantElement.setSelectPictureImageView((ImageView) rowView.findViewById(R.id.selectPictureView));
//            restaurantElement.setRestaurantNameText((EditText) rowView.findViewById(R.id.restaurantNameTextView));
//            restaurantElement.setRatingBar((RatingBar) rowView.findViewById(R.id.myRatingBar));

//            convertView.setTag(restaurantElement);
//            restaurantArrayList.add(restaurantElement);
        }
        else {
//            holder = (RestaurantHolder)convertView.getTag();
//            restaurantElement = (RestaurantElement)convertView.getTag();
//            restaurantArrayList
        }

//        restaurantElement = restaurantArrayList.get(position);
//        restaurantElement.getSelectPictureImageView().get

//        restaurantElement.setRestaurantNameText(restaurantElement.getRestaurantNameText().getText());
//        restaurantElement.ratingBar.setRating(restaurantElement.getRatingBar().getRating());

        // 3. Get the views from the rowView
//        ImageView selectPictureImageView = (ImageView) rowView.findViewById(R.id.selectPictureView);
//        TextView restaurantNameText = (TextView) rowView.findViewById(R.id.restaurantNameTextView);
//        RatingBar ratingBar = (RatingBar) rowView.findViewById(R.id.myRatingBar);

        // 4. Set initial values for the views

        // 5. retrn rowView
        return rowView;
    }

    @Override
    public void add(RestaurantElement restaurantElement) {
        super.add(restaurantElement);
    }
}
