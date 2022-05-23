package vn.ilightning.myapplication.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_battery_finish_1.view.imv_back
import kotlinx.android.synthetic.main.view_setting.view.*
import vn.ilightning.myapplication.R

class SettingsView : RelativeLayout, View.OnClickListener {
    private var mContext: Context?

    constructor(context: Context) : super(context) {
        mContext = context
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        mContext = context
        initView()
    }

    private fun initView() {
        val inflater =
            mContext!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView: View = inflater.inflate(R.layout.view_setting, this)
        rootView.imv_back.setOnClickListener(this)
        rootView.lnl_change_language.setOnClickListener(this)
        rootView.imv_change_langguge.setOnClickListener(this)
        rootView.lnl_wiget.setOnClickListener(this)
        rootView.imv_widget.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> visibility = GONE
            lnl_change_language,imv_change_langguge -> ChangeLangugeDialog(mContext).showDialog()
            lnl_wiget,imv_widget -> ctv_widget_setting_view.openView()
        }
    }

    fun openView() {
        if (visibility == GONE) {
            visibility = VISIBLE
        }
    }
}