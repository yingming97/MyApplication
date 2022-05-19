package vn.ilightning.myapplication.util

import android.util.Log
import java.io.BufferedReader
import java.io.FileReader

class CpuUtils {

    fun getTemperature(): Long {
        var temp: Long = 0
        temp = getCpuTemperature(temp, "/sys/devices/system/cpu/cpu0/cpufreq/cpu_temp")
        temp = getCpuTemperature(temp, "/sys/devices/system/cpu/cpu0/cpufreq/FakeShmoo_cpu_temp")
        temp = getCpuTemperature(temp, "/sys/class/thermal/thermal_zone1/temp")
        temp = getCpuTemperature(temp, "/sys/class/i2c-adapter/i2c-4/4-004c/temperature")
        temp = getCpuTemperature(temp, "/sys/devices/platform/tegra-i2c.3/i2c-4/4-004c/temperature")
        temp = getCpuTemperature(temp, "/sys/devices/platform/omap/omap_temp_sensor.0/temperature")
        temp = getCpuTemperature(temp, "/sys/devices/platform/tegra_tmon/temp1_input")
        temp = getCpuTemperature(temp, "/sys/kernel/debug/tegra_thermal/temp_tj")
        temp = getCpuTemperature(temp, "/sys/devices/platform/s5p-tmu/temperature")
        temp = getCpuTemperature(temp, "/sys/class/thermal/thermal_zone0/temp")
        temp = getCpuTemperature(temp, "/sys/devices/virtual/thermal/thermal_zone0/temp")
        temp = getCpuTemperature(temp, "/sys/class/hwmon/hwmon0/device/temp1_input")
        temp = getCpuTemperature(temp, "/sys/devices/virtual/thermal/thermal_zone1/temp")
        temp = getCpuTemperature(temp, "/sys/devices/platform/s5p-tmu/curr_temp")
        return temp
    }

    private fun getCpuTemperature(temp: Long, sys: String): Long {
        return if (temp == 0L) {
            var result: Long = 0
            val br: BufferedReader
            val line: String?
            try {
                br = BufferedReader(FileReader(sys))
                line = br.readLine()
                if (line != null) {
                    val temperature = line.toLong()
                    if (temperature >= 0) {
                        result = getTemperature(temperature)
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
            result
        } else temp
    }

    private fun getTemperature(temperature: Long): Long {
        var currentTemperature: Long = 0
        currentTemperature = when (temperature) {
            in 100..999 -> {
                (temperature.toInt() / 10).toLong()
            }
            in 1000..9999 -> {
                (temperature.toInt() / 100).toLong()
            }
            in 10000..99999 -> {
                (temperature.toInt() / 1000).toLong()
            }
            else -> {
                temperature.toInt().toLong()
            }
        }
        return currentTemperature
    }

}