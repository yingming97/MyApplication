package vn.ilightning.myapplication.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import vn.ilightning.myapplication.model.Battery
import vn.ilightning.myapplication.util.BatteryUtils

class BatteryReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null) {
            val action = intent.action
            if (action != null) {
                if (action == Intent.ACTION_BOOT_COMPLETED || action == Intent.ACTION_BATTERY_CHANGED || action == Intent.ACTION_BATTERY_LOW) {
                    val isPresent = intent.getBooleanExtra("present", false)
                    val technology = intent.getStringExtra("technology")
                    val plugged = intent.getIntExtra("plugged", -1)
                    val scale = intent.getIntExtra("scale", -1)
                    val health = intent.getIntExtra("health", 0)
                    val status = intent.getIntExtra("status", 0)
                    val rawlevel = intent.getIntExtra("level", -1)
                    val voltage = intent.getIntExtra("voltage", 0)
                    val temperature = intent.getIntExtra("temperature", 0)
                    val charge_counter = intent.getIntExtra("charge_counter", 0)
                    val capacity = intent.getIntExtra("capacity", 0)
                    val batteryModel = Battery(
                        isPresent,
                        technology,
                        plugged,
                        scale,
                        health,
                        status,
                        rawlevel,
                        voltage,
                        temperature,
                        charge_counter,
                        capacity
                    )
                }

            }
        }
    }
}