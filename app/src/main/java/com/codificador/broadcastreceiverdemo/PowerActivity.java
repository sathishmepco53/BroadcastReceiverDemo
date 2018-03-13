package com.codificador.broadcastreceiverdemo;

import android.app.NotificationManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PowerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        String action = getIntent().getStringExtra("action");
        int notificationId = getIntent().getIntExtra("id",0);

        TextView textView = findViewById(R.id.textview);
        textView.setText(action);

        NotificationManager notificationManager = (NotificationManager) PowerActivity.this.getSystemService(NOTIFICATION_SERVICE);
        notificationManager.cancel(notificationId);
    }
}
