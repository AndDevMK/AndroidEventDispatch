package com.pengmj.androideventdispatch

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.MotionEvent
import androidx.constraintlayout.widget.ConstraintLayout

/**
 * @author MinKin
 * @date 2023/5/13
 * @desc
 */
class MyViewGroup2 : ConstraintLayout {
    constructor(context: Context) : super(context)
    constructor(
        context: Context,
        attrs: AttributeSet?
    ) : super(context, attrs)

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr)

    private val TAG = MyViewGroup2::class.java.simpleName

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

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        when (ev?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_INTERCEPT_TOUCH_EVENT && LOG_ACTION_DOWN) Log.e(TAG, "onInterceptTouchEvent -> ACTION_DOWN")
            }
            MotionEvent.ACTION_MOVE   -> {
                if (LOG_INTERCEPT_TOUCH_EVENT && LOG_ACTION_MOVE) Log.e(TAG, "onInterceptTouchEvent -> ACTION_MOVE")
            }
            MotionEvent.ACTION_UP     -> {
                if (LOG_INTERCEPT_TOUCH_EVENT && LOG_ACTION_UP) Log.e(TAG, "onInterceptTouchEvent -> ACTION_UP")
            }
            MotionEvent.ACTION_CANCEL -> {
                if (LOG_INTERCEPT_TOUCH_EVENT && LOG_ACTION_CANCEL) Log.e(TAG, "onInterceptTouchEvent -> ACTION_CANCEL")
            }
        }
        return super.onInterceptTouchEvent(ev)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        when (event?.action) {
            MotionEvent.ACTION_DOWN   -> {
                if (LOG_ACTION_DOWN) Log.e(TAG, "onTouchEvent -> ACTION_DOWN")
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