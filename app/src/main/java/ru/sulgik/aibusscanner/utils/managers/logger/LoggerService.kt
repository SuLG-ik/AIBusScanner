package ru.sulgik.aibusscanner.utils.managers.logger

import android.util.Log
import ru.sulgik.aibusscanner.utils.AIBusActivity
import ru.sulgik.aibusscanner.utils.Tagged

class LoggerService(private val TAG: String):
    ILoggerService {

    constructor(tagged: Tagged) : this (tagged.TAG)

    private val postfix: String = ":${AIBusActivity.AI_VERSION}"

    override val builtTag = "$TAG:$postfix"

    override fun d(message: String){
        Log.d(builtTag, message)
    }
    override fun i(message: String){
        Log.i(builtTag, message)
    }
    override fun e(message: String){
        Log.e(builtTag, message)
    }
    override fun w(message: String){
        Log.w(builtTag, message)
    }
    override fun v(message: String){
        Log.v(builtTag, message)
    }

}