package com.oyvindrobertsen.kotlog


open class Logger {
    open fun log(level: Int, message: String) {
        println(message)
    }
}

object Log {

    public val LEVEL_NONE: Int = 6
    public val LEVEL_ERROR: Int = 5
    public val LEVEL_WARN: Int = 4
    public val LEVEL_INFO: Int = 3
    public val LEVEL_DEBUG: Int = 2
    public val LEVEL_TRACE: Int = 1

    var level: Int = LEVEL_INFO
        public set(value) {
            $level = value
            ERROR = level <= LEVEL_ERROR
            WARN: Boolean = level <= LEVEL_WARN
            INFO: Boolean = level <= LEVEL_INFO
            DEBUG: Boolean = level <= LEVEL_DEBUG
            TRACE: Boolean = level <= LEVEL_TRACE
        }

    private var ERROR: Boolean = level <= LEVEL_ERROR
    private var WARN: Boolean = level <= LEVEL_WARN
    private var INFO: Boolean = level <= LEVEL_INFO
    private var DEBUG: Boolean = level <= LEVEL_DEBUG
    private var TRACE: Boolean = level <= LEVEL_TRACE

    var logger: Logger = Logger()
        public set

    fun error(message: String) {
        if (ERROR) logger.log(LEVEL_ERROR, message)
    }

    fun warn(message: String) {
        if (WARN) logger.log(LEVEL_WARN, message)
    }

    fun info(message: String) {
        if (INFO) logger.log(LEVEL_INFO, message)
    }

    fun debug(message: String) {
        if (DEBUG) logger.log(LEVEL_DEBUG, message)
    }

    fun trace(message: String) {
        if (TRACE) logger.log(LEVEL_TRACE, message)
    }
}