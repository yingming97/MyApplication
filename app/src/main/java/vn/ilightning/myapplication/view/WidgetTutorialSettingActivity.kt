package vn.ilightning.myapplication.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.view_widget_seting.*
import vn.ilightning.myapplication.R

class WidgetTutorialSettingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_widget_tutorial)
        imv_back.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> finish()
        }
    }
}