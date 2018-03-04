package com.example.android.coffeeorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;
import android.widget.EditText;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

      /*  TextView quantityTextView = (TextView) findViewById(R.id.quant);
        int number=Integer.parseInt(quantityTextView.getText().toString());
        displayPrice(5*number); */
        int price = 5 * quantity;
        displayPrice(price);
        EditText username = (EditText) findViewById(R.id.name);
        String name = username.getText().toString().trim();
        String str = "Total Amount:" + price + "\nHave a nice day ahead!!";
        displayMessage(name, str);
    }

    public void Inc(View view) {

        /*TextView quantityTextView = (TextView) findViewById(R.id.quant);

        int number=Integer.parseInt(quantityTextView.getText().toString());
        number++;
        display(number);*/
        quantity++;
        display(quantity);
    }

    public void Dec(View view) {
        /*TextView quantityTextView = (TextView) findViewById(R.id.quant);
        int number=Integer.parseInt(quantityTextView.getText().toString());

        if(number>0)
        number--;
        display(number);*/
        if (quantity > 0)
            quantity--;
        display(quantity);

    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quant);
        quantityTextView.setText("" + number);

    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_TV);
        priceTextView.setText("Total:" + NumberFormat.getCurrencyInstance().format(number));

    }

    private void displayMessage(String name, String str) {

        TextView priceTextView = (TextView) findViewById(R.id.price_TV);

        priceTextView.setText(name + " Thank you for visiting us\n" + str);

    }
}
