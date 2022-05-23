package vn.ilightning.myapplication.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.view_battery_finish_1.view.*
import vn.ilightning.myapplication.R

class BatterySaverView : RelativeLayout, View.OnClickListener {
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
        val rootView: View = inflater.inflate(R.layout.view_battery_saver, this)
        rootView.imv_back.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> StopScanDialog(
                mContext!!,
                ctv_main_activity_battery_saver_view
            ).showDialog()
        }
    }

    fun openView() {
        if (visibility == RelativeLayout.GONE) {
            visibility = RelativeLayout.VISIBLE
        }
    }
}