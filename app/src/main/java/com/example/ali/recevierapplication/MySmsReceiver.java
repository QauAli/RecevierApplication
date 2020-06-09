package com.example.ali.recevierapplication;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MySmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "hahaha", Toast.LENGTH_SHORT).show();

    }
}
