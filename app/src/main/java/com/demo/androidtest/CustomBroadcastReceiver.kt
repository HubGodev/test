package com.demo.androidtest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class CustomBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val message = intent?.getStringExtra("message")
        Toast.makeText(context,"custom message : ${message}",Toast.LENGTH_LONG).show()
        if(intent.action == Intent.ACTION_BATTERY_LOW){

        }
    }

}