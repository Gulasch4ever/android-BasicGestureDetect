/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.common.logger

import android.util.Log

class LogWrapper extends LogNode {
  private var mNext: LogNode = null

  def getNext: LogNode = {
    return mNext
  }

  def setNext(node: LogNode) {
    mNext = node
  }

  def println(priority: Int, tag: String, msg: String, tr: Throwable) = {
    if (mNext != null) {
      getNext.println(Log.NONE, null, msg, null)
    }


  /**
    * Returns the next LogNode in the chain.
    */
  def getNext: LogNode = mNext

  /**
    * Sets the LogNode data will be sent to..
    */
  def setNext(node: LogNode) {
    mNext = node
  }
  }
//    var useMsg: String = msg
//    if (useMsg == null) {
//      useMsg = ""
//    }
//    if (tr != null) {
//      msg += "\n" + Log.getStackTraceString(tr)
//    }
//    Log.println(priority, tag, useMsg)
//    if (mNext != null) {
//      mNext.println(priority, tag, msg, tr)
//    }
//  }
}
