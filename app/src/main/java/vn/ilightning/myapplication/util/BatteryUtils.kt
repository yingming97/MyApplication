package vn.ilightning.myapplication.util

import android.annotation.SuppressLint
import android.content.Context
import vn.ilightning.myapplication.model.Battery

class BatteryUtils {
  fun getCurrentBatteryModel(): Battery? = null

    fun convertFromFahrenheitToCelsius(temperatureF: Int): Int {
        return Math.round(((temperatureF - 32) * 5 / 9).toFloat())
    }

    fun convertFromCelsiusToFahrenheit(temperatureC: Int): Int {
        return Math.round((temperatureC * 9 / 5 + 32).toFloat())
    }

    @SuppressLint("PrivateApi")
    fun getBatteryCapacity(context: Context?): Double {
        val mPowerProfile: Any
        var batteryCapacity = 0.0
        val POWER_PROFILE_CLASS = "com.android.internal.os.PowerProfile"
        try {
            mPowerProfile = Class.forName(POWER_PROFILE_CLASS)
                .getConstructor(Context::class.java)
                .newInstance(context)
            batteryCapacity = Class
                .forName(POWER_PROFILE_CLASS)
                .getMethod("getBatteryCapacity")
                .invoke(mPowerProfile) as Double
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return batteryCapacity
    }
}