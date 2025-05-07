/*
* Copyright (c) 2025, Patrick Wilmes <p.wilmes89@gmail.com>
* All rights reserved.
*
* SPDX-License-Identifier: BSD-2-Clause
*/
package com.bitlake.kshell

object Repl {

    private var isActive = true

    fun run() {
        do {
            Prompt.render()
            val input = readInput()
            processInput(input)
        } while (isActive)
    }

    private fun readInput(): String? = readLine()

    private fun processInput(input: String?) {
        when (input) {
            "exit" -> isActive = false
            else -> println(input)
        }
    }
}
