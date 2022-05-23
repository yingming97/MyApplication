package vn.ilightning.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import vn.ilightning.myapplication.R

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imv_setting.setOnClickListener(this)
        lnl_cpu_cooler.setOnClickListener(this)
        lnl_battery_saver.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_setting -> ctv_main_activity_setting_view.openView()
            lnl_cpu_cooler -> ctv_main_activity_cooler_view.openView()
            lnl_battery_saver -> ctv_main_activity_battery_saver_view.openView()
        }
    }
}