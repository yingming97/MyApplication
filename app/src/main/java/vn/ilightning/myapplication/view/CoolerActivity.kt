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
        Handler().postDelayed({ startActivity(Intent(this, CpuFinishActivity1::class.java)) }, 2000)
    }

     fun showDialog() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_stop_scan)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.bg_white_rd_20)
        dialog.tv_cancel.setOnClickListener { dialog.dismiss() }
        dialog.tv_stop_scan.setOnClickListener {
           finish()
        }
        dialog.show()
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> showDialog()
        }
    }
}