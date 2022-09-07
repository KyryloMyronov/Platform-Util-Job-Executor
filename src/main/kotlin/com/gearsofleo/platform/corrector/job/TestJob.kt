package com.gearsofleo.platform.corrector.job

import com.gearsofleo.platform.corrector.executor.JobExecutor
import org.springframework.stereotype.Service

@Service
class TestJob : JobExecutor() {
    override fun executeJob() {
        logger.info { "TestJob service works!!!" }
    }
}
