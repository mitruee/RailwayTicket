package com.example.railwayticket;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView dataTicket;
    private Button button;

    private Ticket ticket;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        dataTicket = findViewById(R.id.dataTicket);
        button = findViewById(R.id.button);

        Bundle bundleIntent = getIntent().getExtras();

        if (bundleIntent != null) {
            ticket = (Ticket) bundleIntent.getSerializable(Ticket.class.getSimpleName());

            dataTicket.setText("ID пользователя: " + ticket.getName() + "\n" +
                               "Место отбытия: " +  ticket.getPlaceFrom() + "\n" +
                               "Место прибытия: " + ticket.getPlaceTo() + "\n" +
                               "Время отбытия: " + ticket.getTimeFrom() + "\n" +
                               "Время прибытия: " + ticket.getTimeTo() + "\n" +
                               "Цена билета: " + ticket.getPrice());
        }

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };
}