package io.raif.smarthome.util

import org.eclipse.jetty.util.component.AbstractLifeCycle
import org.eclipse.jetty.util.thread.ThreadPool
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

/**
 * Copied from https://github.com/jetty-project/jetty-loom/blob/master/src/main/java/org/eclipse/jetty/loom/LoomThreadPool.java
 */
class LoomThreadPool : AbstractLifeCycle(), ThreadPool {

    private val executor: ExecutorService = Executors.newVirtualThreadPerTaskExecutor()

    override fun execute(command: Runnable) {
        executor.submit(command)
    }

    override fun join() {
        while (!executor.isTerminated) {
            Thread.onSpinWait()
        }
    }

    override fun doStop() {
        super.doStop()
        executor.shutdown()
    }

    override fun getThreads(): Int = Integer.MAX_VALUE

    override fun getIdleThreads(): Int = Int.MAX_VALUE

    override fun isLowOnThreads(): Boolean = false
}