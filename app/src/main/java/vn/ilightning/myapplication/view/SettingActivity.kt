package vn.ilightning.myapplication.view

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.dialog_stop_scan.*
import kotlinx.android.synthetic.main.view_setting.*
import vn.ilightning.myapplication.R

class SettingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_setting)
        imv_back.setOnClickListener(this)
        lnl_change_language.setOnClickListener(this)
        lnl_wiget.setOnClickListener(this)
        imv_widget.setOnClickListener(this)
    }

    private fun showDialogChangeLanguge() {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_change_language)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.bg_white_rd_20)
        dialog.show()
    }

    override fun onClick(p0: View?) {
        when (p0) {
            imv_back -> finish()
            lnl_change_language, imv_change_langguge -> showDialogChangeLanguge()
            lnl_wiget,imv_widget -> startActivity(Intent(this,WidgetSettingActivity::class.java))
        }
    }
}