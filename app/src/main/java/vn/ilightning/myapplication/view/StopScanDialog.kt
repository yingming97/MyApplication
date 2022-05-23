package vn.ilightning.myapplication.view

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.view.View
import android.view.View.GONE
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.dialog_stop_scan.*
import vn.ilightning.myapplication.R

class StopScanDialog {
    private var mContext: Context?
    private var mV: RelativeLayout?

    constructor(context: Context, v: RelativeLayout) {
        this.mContext = context
        this.mV = v

    }

    fun showDialog() {
        val dialog = Dialog(mContext!!)
        dialog.setContentView(R.layout.dialog_stop_scan)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.bg_white_rd_20)
        dialog.tv_cancel.setOnClickListener { dialog.dismiss() }
        dialog.tv_stop_scan.setOnClickListener {
            dialog.dismiss()
            mV!!.visibility = GONE
        }
        dialog.show()
    }
}