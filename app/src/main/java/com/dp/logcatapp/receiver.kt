package com.dp.logcatapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.content.ContextCompat
import com.dp.logcatapp.services.LogcatService


class receiver : BroadcastReceiver()
{
    override fun onReceive(context: Context?, intent: Intent?) {
        if (Intent.ACTION_BOOT_COMPLETED == intent!!.action) {
            val serviceIntent = Intent(context, LogcatService::class.java)
            ContextCompat.startForegroundService(context!!, serviceIntent)
        }
    }
}