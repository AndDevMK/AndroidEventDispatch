package com.pengmj.androideventdispatch.conflict

import android.content.Intent
import android.view.View

/**
 * @author MinKin
 * @date 2023/5/18
 * @desc
 */
class MyPresenter {

    fun openMyActivity(view: View) =
            view.context.startActivity(Intent(view.context, MyActivity::class.java))
}