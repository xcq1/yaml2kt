package com.xcq1.yaml2kt

import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 2 || args.any { it.isBlank() }) {
        println("Syntax: yaml2kt [in-yaml] [out-folder]")
        exitProcess(1)
    }
    Yaml2Kt(File(args[0]), File(args[1])).convert()
}
