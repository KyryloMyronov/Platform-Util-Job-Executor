package com.gearsofleo.platform.corrector.executor

import mu.KLogging
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.stereotype.Component

@Component
abstract class JobExecutor : ApplicationListener<ApplicationReadyEvent> {
    override fun onApplicationEvent(event: ApplicationReadyEvent) {
        executeJob()
    }

    abstract fun executeJob()

    companion object : KLogging()
}
