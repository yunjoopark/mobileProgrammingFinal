package com.ewha.graduate.mobileprogramming.finalproject;

import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

/**
 * Created by lab on 2015-12-09.
 */
public class RestaurantElement {
    private ImageView selectPictureImageView;
    private EditText restaurantNameEditText;
    private RatingBar ratingBar;

    public RestaurantElement() {
        super();
    }

    public ImageView getSelectPictureImageView() {
        return selectPictureImageView;
    }

    public void setSelectPictureImageView(ImageView selectPictureImageView) {
        this.selectPictureImageView = selectPictureImageView;
    }

    public TextView getRestaurantNameText() {
        return restaurantNameEditText;
    }

    public void setRestaurantNameText(EditText restaurantNameEditText) {
        this.restaurantNameEditText = restaurantNameEditText;
    }

    public RatingBar getRatingBar() {
        return ratingBar;
    }

    public void setRatingBar(RatingBar ratingBar) {
        this.ratingBar = ratingBar;
    }
}
