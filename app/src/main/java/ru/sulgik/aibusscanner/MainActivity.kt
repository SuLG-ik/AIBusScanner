package ru.sulgik.aibusscanner

import android.os.Bundle
import ru.sulgik.aibusscanner.utils.AIBusActivity
import ru.sulgik.aibusscanner.utils.managers.logger.LoggerService

class MainActivity : AIBusActivity() {

    override val log: LoggerService =
        LoggerService(this)

    override val TAG: String
        get() = "$PACKAGE_NAME.MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log.i("onCreate")

    }
}
