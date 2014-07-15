package com.oyvindrobertsen.kotlog

enum class Level {
    NONE
    ERROR
    WARN
    INFO
    DEBUG
    TRACE
}

class Logger {
    fun log(message: String) {
        println(message)
    }
}

class Log {
    val level = Level.INFO
    val logger = Logger()

    fun info(message: String) {
        logger.log(message)
    }
}