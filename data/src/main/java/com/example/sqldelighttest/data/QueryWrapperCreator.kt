package com.example.sqldelighttest.data

import android.content.Context
import com.squareup.sqldelight.android.create

/**
 * Created by Vincent on 8/17/18
 */
object QueryWrapperCreator {

  fun createQueryWrapper(context: Context) {
    val queryWrapper = QueryWrapper.create(context, "test.db")
  }
}