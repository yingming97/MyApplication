package vn.ilightning.myapplication.view

import android.app.Dialog
import android.content.Context
import android.content.Intent
import kotlinx.android.synthetic.main.dialog_stop_scan.*
import vn.ilightning.myapplication.R

class ChangeLangugeDialog{
    private var mContext:Context?
   constructor(context: Context?){
       this.mContext = context
   }
    fun showDialog() {
        val dialog = Dialog(mContext!!)
        dialog.setContentView(R.layout.dialog_change_language)
        dialog.window!!.setBackgroundDrawableResource(R.drawable.bg_white_rd_20)
        dialog.show()
    }
}