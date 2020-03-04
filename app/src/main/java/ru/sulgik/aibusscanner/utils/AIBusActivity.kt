package ru.sulgik.aibusscanner.utils

import androidx.appcompat.app.AppCompatActivity
import ru.sulgik.aibusscanner.utils.managers.logger.LoggerService

abstract class AIBusActivity:
    AppCompatActivity(), Tagged
{
    abstract val log : LoggerService

    abstract override val TAG: String

    companion object{
        const val AI_VERSION = "0.01"

        const val PACKAGE_NAME = "ru.sulgik.aibusscanner"
    }
}