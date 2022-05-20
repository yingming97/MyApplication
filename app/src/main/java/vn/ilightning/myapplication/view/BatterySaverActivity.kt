package vn.ilightning.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.view_cpu_cooler.*
import vn.ilightning.myapplication.R

class BatterySaverActivity : AppCompatActivity(),View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_battery_saver)
        imv_back.setOnClickListener(this)
        Handler().postDelayed({ startActivity(Intent(this, SavingActivity::class.java)) }, 3000)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> StopScanDialog(this).showDialog()
        }
    }
}