package com.example.railwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText placeFromIn;
    private EditText placeToIn;
    private EditText timeFromIn;
    private EditText timeToIn;
    private EditText priceIn;
    private Button button;

    private String name;
    private String placeFrom;
    private String placeTo;
    private String timeFrom;
    private String timeTo;
    private String price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        placeFromIn = findViewById(R.id.placeFromIn);
        placeToIn = findViewById(R.id.placeToIn);
        timeFromIn = findViewById(R.id.timeFromIn);
        timeToIn = findViewById(R.id.timeToIn);
        priceIn = findViewById(R.id.priceIn);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            name = nameIn.getText().toString();
            placeFrom = placeFromIn.getText().toString();
            placeTo = placeToIn.getText().toString();
            timeFrom = timeFromIn.getText().toString();
            timeTo = timeToIn.getText().toString();
            price = priceIn.getText().toString();

            Ticket ticket = new Ticket(name, placeFrom, placeTo, timeFrom, timeTo, price);

            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(Ticket.class.getSimpleName(), ticket);
            startActivity(intent);
        }
    };
}