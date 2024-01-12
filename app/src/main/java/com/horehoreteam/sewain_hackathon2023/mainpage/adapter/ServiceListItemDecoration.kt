package com.horehoreteam.sewain_hackathon2023.mainpage.adapter

import android.graphics.Rect
import android.util.DisplayMetrics
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.horehoreteam.sewain_hackathon2023.toDp

class ServiceListItemDecoration (
    private val displayMetrics: DisplayMetrics,
    private val includeLastOne:Boolean = false,
    private val paddingTop:Int = -1,
    private val paddingBottom:Int = -1,
    private val paddingStart:Int = -1,
    private val paddingEnd:Int = -1,
): RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        if (includeLastOne){
            outRect.apply {
                val paddings = listOf(
                    paddingTop,
                    paddingBottom,
                    paddingEnd,
                    paddingStart
                )
                for (i in paddings.indices){
                    val currPadding = paddings[i]
                    if (currPadding != -1){
                        when(i){
                            0 -> top = paddingTop.toDp(displayMetrics)
                            1 -> bottom = paddingBottom.toDp(displayMetrics)
                            2 -> right = paddingEnd.toDp(displayMetrics)
                            3 -> left = paddingStart.toDp(displayMetrics)
                        }
                    }
                }
            }
        }else if (parent.getChildAdapterPosition(view) % 2 == 1){
            outRect.apply {
                val paddings = listOf(
                    paddingTop,
                    paddingBottom,
                    paddingEnd,
                    paddingStart
                )
                for (i in paddings.indices){
                    val currPadding = paddings[i]
                    if (currPadding != -1){
                        when(i){
                            2 -> right = paddingEnd.toDp(displayMetrics)
                            3 -> left = paddingStart.toDp(displayMetrics)
                        }
                    }
                }
            }
        }

        if (paddingBottom == -1) return

        outRect.bottom = paddingBottom.toDp(displayMetrics)
    }


}