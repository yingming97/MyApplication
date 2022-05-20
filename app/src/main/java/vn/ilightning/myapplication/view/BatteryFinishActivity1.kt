package vn.ilightning.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.view_cpu_cooler.*
import kotlinx.android.synthetic.main.view_cpu_cooler.imv_back
import kotlinx.android.synthetic.main.view_cpu_finish_1.*
import vn.ilightning.myapplication.R

class BatteryFinishActivity1 : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_battery_finish_1)
        imv_back.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> startActivity(Intent(this, MainActivity::class.java))
        }
    }
}