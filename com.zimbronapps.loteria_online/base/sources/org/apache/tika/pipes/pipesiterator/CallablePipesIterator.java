package org.apache.tika.pipes.pipesiterator;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.pipes.FetchEmitTuple;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CallablePipesIterator implements Callable {
    private final int numConsumers;
    private final PipesIterator pipesIterator;
    private final ArrayBlockingQueue queue;
    private final long timeoutMillis;

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue arrayBlockingQueue) {
        this(pipesIterator, arrayBlockingQueue, -1L);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue arrayBlockingQueue, long j) {
        this(pipesIterator, arrayBlockingQueue, j, 1);
    }

    public Long call() throws Exception {
        long j = 0;
        int i = 0;
        if (this.timeoutMillis > 0) {
            Iterator it = this.pipesIterator.iterator();
            while (it.hasNext()) {
                if (!this.queue.offer((FetchEmitTuple) it.next(), this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer tuple");
                }
                j++;
            }
            while (i < this.numConsumers) {
                if (!this.queue.offer(PipesIterator.COMPLETED_SEMAPHORE, this.timeoutMillis, TimeUnit.MILLISECONDS)) {
                    throw new TimeoutException("timed out trying to offer the completed semaphore");
                }
                i++;
            }
        } else {
            Iterator it2 = this.pipesIterator.iterator();
            while (it2.hasNext()) {
                this.queue.put((FetchEmitTuple) it2.next());
                j++;
            }
            while (i < this.numConsumers) {
                this.queue.put(PipesIterator.COMPLETED_SEMAPHORE);
                i++;
            }
        }
        return Long.valueOf(j);
    }

    public CallablePipesIterator(PipesIterator pipesIterator, ArrayBlockingQueue arrayBlockingQueue, long j, int i) {
        this.pipesIterator = pipesIterator;
        this.queue = arrayBlockingQueue;
        this.timeoutMillis = j;
        this.numConsumers = i;
    }
}
