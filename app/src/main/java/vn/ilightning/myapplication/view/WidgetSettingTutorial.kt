package vn.ilightning.myapplication.view

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.view_battery_finish_1.view.*
import vn.ilightning.myapplication.R

class WidgetSettingTutorial : LinearLayout ,View.OnClickListener{

    private var mContext: Context?

    constructor(context: Context) : super(context) {
        mContext = context
        initView()
    }
    constructor(context: Context, attrs: AttributeSet?):super(context, attrs) {
        mContext = context
        initView()
    }
    private fun initView() {
        val inflater =
            mContext!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val rootView: View = inflater.inflate(R.layout.view_widget_tutorial, this)
        rootView.imv_back.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view) {
            imv_back -> visibility = GONE
        }
    }

    fun openView() {
        if (visibility == GONE) {
            visibility = VISIBLE
        }
    }
}