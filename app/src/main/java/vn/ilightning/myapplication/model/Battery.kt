package vn.ilightning.myapplication.model

import android.os.BatteryManager

class Battery {
    private var isPresent = false
    private var technology: String? = null
    private var plugged = 0
    private var scale = 0
    private var health = 0
    private var status = 0
    private var rawLevel = 0
    private var voltage = 0
    private var temperature = 0
    private var chargeCounter = 0
    private var capacity = 0

    constructor()

    constructor(
        isPresent: Boolean,
        technology: String?,
        plugged: Int,
        scale: Int,
        health: Int,
        status: Int,
        rawLevel: Int,
        voltage: Int,
        temperature: Int,
        chargeCounter: Int,
        capacity: Int
    ) {
        this.isPresent = isPresent
        this.technology = technology
        this.plugged = plugged
        this.scale = scale
        this.health = health
        this.status = status
        this.rawLevel = rawLevel
        this.voltage = voltage
        this.temperature = temperature
        this.chargeCounter = chargeCounter
        this.capacity = capacity
    }

    fun isPresent(): Boolean {
        return isPresent
    }

    fun getTechnology(): String? {
        return technology
    }


    fun getScale(): Int {
        return scale
    }

    fun getHealth(): String? {
        var healthString = "Unknown"
        when (health) {
            BatteryManager.BATTERY_HEALTH_DEAD -> healthString = "Dead"
            BatteryManager.BATTERY_HEALTH_GOOD -> healthString = "Good"
            BatteryManager.BATTERY_HEALTH_OVER_VOLTAGE -> healthString = "Over Voltage"
            BatteryManager.BATTERY_HEALTH_OVERHEAT -> healthString = "Over Heat"
            BatteryManager.BATTERY_HEALTH_UNSPECIFIED_FAILURE -> healthString = "Failure"
        }
        return healthString
    }


    fun getStatus(): String? {
        var statusString = "Unknown"
        when (status) {
            BatteryManager.BATTERY_STATUS_CHARGING -> statusString = "Charging"
            BatteryManager.BATTERY_STATUS_DISCHARGING -> statusString = "Discharging"
            BatteryManager.BATTERY_STATUS_FULL -> statusString = "Full"
            BatteryManager.BATTERY_STATUS_NOT_CHARGING -> statusString = "Not Charging"
        }
        return statusString
    }

    fun getRawLevel(): Int {
        return rawLevel
    }

    fun getVoltage(): Int {
        return voltage
    }

    fun getTemperature(): Float {
        var currentTemperature = 0f
        currentTemperature = when (temperature) {
            in 100..999 -> {
                temperature.toFloat() / 10
            }
            in 1000..9999 -> {
                temperature.toFloat() / 100
            }
            in 10000..99999 -> {
                temperature.toFloat() / 1000
            }
            else -> {
                temperature.toFloat()
            }
        }
        return currentTemperature
    }

    fun getLevel(): Int {
        return rawLevel * 100 / scale
    }

    fun getChargeCounter(): Int {
        return chargeCounter
    }

    fun getCapacity(): Int {
        return capacity
    }

    override fun toString(): String {
        return "BatteryModel{" +
                "isPresent=" + isPresent +
                ", technology='" + technology + '\'' +
                ", plugged=" + plugged +
                ", scale=" + scale +
                ", health=" + health +
                ", status=" + status +
                ", rawlevel=" + rawLevel +
                ", voltage=" + voltage +
                ", temperature=" + temperature +
                ", charge_counter=" + chargeCounter +
                ", capacity=" + capacity +
                '}'
    }
}