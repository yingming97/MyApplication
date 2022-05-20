package vn.ilightning.myapplication.view

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.dialog_stop_scan.*
import kotlinx.android.synthetic.main.view_cpu_cooler.*
import vn.ilightning.myapplication.R

class CoolerActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_cpu_cooler)
        imv_back.setOnClickListener(this)
        Handler().postDelayed({ startActivity(Intent(this, CoolingDownActivity::class.java)) }, 3000)
    }



    override fun onClick(view: View?) {
        when (view) {
            imv_back -> StopScanDialog(this).showDialog()
        }
    }
}