package com.pengmj.androideventdispatch.conflict

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.core.widget.NestedScrollView
import com.pengmj.androideventdispatch.R

/**
 * @author MinKin
 * @date 2023/5/18
 * @desc
 */
class MyNestedScrollView : NestedScrollView {
    constructor(context: Context) : super(context) {
        doInit(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?
    ) : super(context, attrs) {
        doInit(context)
    }

    constructor(
        context: Context,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        doInit(context)
    }

    private var editTextHeight: Int = 0

    private fun doInit(context: Context) {
        editTextHeight =
                context.resources.getDimensionPixelSize(R.dimen.edit_text_height)
    }

    private var downY: Int = 0

    override fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
        var intercepted = super.onInterceptTouchEvent(ev)
        when (ev.action) {
            MotionEvent.ACTION_DOWN -> {
                downY = ev.y.toInt()
                intercepted = false
            }
            MotionEvent.ACTION_MOVE -> {
                intercepted = downY > editTextHeight
            }
            MotionEvent.ACTION_UP   -> {
                intercepted = false
            }
        }
        return intercepted
    }


}