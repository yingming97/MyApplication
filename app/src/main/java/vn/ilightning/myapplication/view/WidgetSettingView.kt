package vn.ilightning.myapplication.view

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.view_battery_finish_1.view.*
import kotlinx.android.synthetic.main.view_battery_finish_1.view.imv_back
import kotlinx.android.synthetic.main.view_setting.view.*
import kotlinx.android.synthetic.main.view_widget_seting.view.*
import vn.ilightning.myapplication.R

class WidgetSettingView : RelativeLayout, View.OnClickListener {

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
        val rootView: View = inflater.inflate(R.layout.view_widget_seting, this)
        rootView.imv_back.setOnClickListener(this)
        lnl_add_widget_4x2.setOnClickListener(this)
        lnl_add_widget_4x1_clean.setOnClickListener(this)
        lnl_add_widget_4x1_cooler.setOnClickListener(this)
        lnl_add_widget_4x1_optimize.setOnClickListener(this)
        lnl_add_widget_4x1_speed_up.setOnClickListener(this)
        imv_setting_help.setOnClickListener(this)
        tv_how_to_add_widget.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> visibility = GONE
            lnl_add_widget_4x2, lnl_add_widget_4x1_clean,
            lnl_add_widget_4x1_optimize, lnl_add_widget_4x1_speed_up, lnl_add_widget_4x1_cooler ->
                Toast.makeText(
                    mContext,
                    "Your version Android is not supported yet",
                    Toast.LENGTH_LONG
                ).show()
            imv_setting_help,tv_how_to_add_widget -> ctv_widget_setting_tutorial_view.openView()
        }
    }

    fun openView() {
        if (visibility == GONE) {
            visibility = VISIBLE
        }
    }
}