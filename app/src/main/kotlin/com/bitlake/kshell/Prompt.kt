/*
* Copyright (c) 2025, Patrick Wilmes <p.wilmes89@gmail.com>
* All rights reserved.
*
* SPDX-License-Identifier: BSD-2-Clause
*/
package com.bitlake.kshell

import com.bitlake.ak.Environment

object Prompt {
    private object PathDecorator {
        fun decorate(path: String): String = path.replace(Environment.userHome, "~")
    }

    fun render() {
        val userName = Environment.userName
        val currentWorkingDirectory = PathDecorator.decorate(Environment.currentWorkingDirectory)
        print("$userName @ ${PathDecorator.decorate(currentWorkingDirectory)} >> ")
    }
}
