package com.demo.androidtest

import android.content.Intent
import android.os.IBinder
import java.security.Provider
import java.security.Provider.Service

class CustomService : android.app.Service() {
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}