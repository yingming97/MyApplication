package vn.ilightning.myapplication.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.view_widget_seting.*
import vn.ilightning.myapplication.R

class WidgetSettingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_widget_seting)
        imv_back.setOnClickListener(this)
        imv_setting_help.setOnClickListener(this)
        tv_ho_to_add_widget.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> finish()
            imv_setting_help, tv_ho_to_add_widget -> startActivity(
                Intent(
                    this,
                    WidgetTutorialSettingActivity::class.java
                )
            )
        }
    }
}