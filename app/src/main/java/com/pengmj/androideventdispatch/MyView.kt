package com.pengmj.androideventdispatch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import android.view.View

/**
 * @author MinKin
 * @date 2023/5/13
 * @desc
 */
class MyView : View {

    constructor(context: Context?) : super(context)
    constructor(
        context: Context?,
        attrs: AttributeSet?
    ) : super(context, attrs)

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr)

    private val TAG = MyView::class.java.simpleName

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_ACTION_DOWN) Log.e(TAG, "dispatchTouchEvent -> ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE   -> {
                if (LOG_ACTION_MOVE) Log.e(TAG, "dispatchTouchEvent -> ACTION_MOVE")
            }
            MotionEvent.ACTION_UP     -> {
                if (LOG_ACTION_UP) Log.e(TAG, "dispatchTouchEvent -> ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> {
                if (LOG_ACTION_CANCEL) Log.e(TAG, "dispatchTouchEvent -> ACTION_CANCEL")
            }
        }
        return super.dispatchTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_ACTION_DOWN) Log.e(TAG, "onTouchEvent -> ACTION_DOWN")
                return true
            }
            MotionEvent.ACTION_MOVE   -> {
                if (LOG_ACTION_MOVE) Log.e(TAG, "onTouchEvent -> ACTION_MOVE")
            }
            MotionEvent.ACTION_UP     -> {
                if (LOG_ACTION_UP) Log.e(TAG, "onTouchEvent -> ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> {
                if (LOG_ACTION_CANCEL) Log.e(TAG, "onTouchEvent -> ACTION_CANCEL")
            }
        }
        return super.onTouchEvent(event)
    }
}