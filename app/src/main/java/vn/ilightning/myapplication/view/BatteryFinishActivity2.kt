package vn.ilightning.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.view_cpu_cooler.*
import vn.ilightning.myapplication.R

class BatteryFinishActivity2 : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_battery_finish_2)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> startActivity(Intent(this, MainActivity::class.java))
        }
    }
}