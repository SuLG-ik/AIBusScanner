package ru.sulgik.aibusscanner.utils.managers.logger

import android.util.Log

interface ILoggerService{

    val builtTag:String

    fun d(message: String)
    fun i(message: String)
    fun e(message: String)
    fun w(message: String)
    fun v(message: String)

}