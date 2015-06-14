package com.example.rajec.funapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int numberOfGifts = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the add button is clicked.
     */
    public void increment(View view) {
      /**  int numberOfGifts = 3 ;
        numberOfGifts = numberOfGifts + 1 ; */
        numberOfGifts = numberOfGifts + 1;
        display(numberOfGifts);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view) {
        /** int numberOfGifts = 1 ; */
        numberOfGifts--;
        display(numberOfGifts);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void orderGifts(View view) {
        /* int numberOfGifts = 2 ; */
        display(numberOfGifts);
        displayPrice(numberOfGifts*5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}