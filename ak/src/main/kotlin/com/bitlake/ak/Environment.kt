/*
* Copyright (c) 2025, Patrick Wilmes <p.wilmes89@gmail.com>
* All rights reserved.
*
* SPDX-License-Identifier: BSD-2-Clause
*/
package com.bitlake.ak

object Environment {
    val userName: String = System.getProperty("user.name")
    val userHome: String = System.getProperty("user.home")
    val currentWorkingDirectory: String = System.getProperty("user.dir")
}
