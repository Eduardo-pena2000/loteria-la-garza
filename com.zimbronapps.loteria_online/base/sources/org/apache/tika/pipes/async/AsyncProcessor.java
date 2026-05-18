package org.apache.tika.pipes.async;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.tika.exception.TikaException;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.PipesClient;
import org.apache.tika.pipes.PipesException;
import org.apache.tika.pipes.PipesReporter;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;
import org.apache.tika.pipes.pipesiterator.TotalCounter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AsyncProcessor implements Closeable {
    private static final Wb.c LOG = Wb.e.l(AsyncProcessor.class);
    private static long MAX_OFFER_WAIT_MS = 120000;
    static final int PARSER_FUTURE_CODE = 1;
    static final int WATCHER_FUTURE_CODE = 3;
    private boolean addedEmitterSemaphores;
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue emitData;
    private final ExecutorCompletionService executorCompletionService;
    private final ExecutorService executorService;
    private final ArrayBlockingQueue fetchEmitTuples;
    boolean isShuttingDown;
    private volatile int numEmitterThreadsFinished;
    private volatile int numParserThreadsFinished;
    private final AtomicLong totalProcessed;

    public class FetchEmitWorker implements Callable {
        private final AsyncConfig asyncConfig;
        private final ArrayBlockingQueue emitDataQueue;
        private final ArrayBlockingQueue fetchEmitTuples;

        public /* synthetic */ FetchEmitWorker(AsyncProcessor asyncProcessor, AsyncConfig asyncConfig, ArrayBlockingQueue arrayBlockingQueue, ArrayBlockingQueue arrayBlockingQueue2, h hVar) {
            this(asyncConfig, arrayBlockingQueue, arrayBlockingQueue2);
        }

        private boolean shouldEmit(PipesResult pipesResult) {
            if (pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS || pipesResult.getStatus() == PipesResult.STATUS.PARSE_SUCCESS_WITH_EXCEPTION) {
                return true;
            }
            return pipesResult.isIntermediate() && this.asyncConfig.isEmitIntermediateResults();
        }

        private FetchEmitWorker(AsyncConfig asyncConfig, ArrayBlockingQueue arrayBlockingQueue, ArrayBlockingQueue arrayBlockingQueue2) {
            this.asyncConfig = asyncConfig;
            this.fetchEmitTuples = arrayBlockingQueue;
            this.emitDataQueue = arrayBlockingQueue2;
        }

        public Integer call() throws Exception {
            PipesResult pipesResult;
            PipesClient pipesClient = new PipesClient(this.asyncConfig);
            while (true) {
                try {
                    FetchEmitTuple fetchEmitTuple = (FetchEmitTuple) this.fetchEmitTuples.poll(1L, TimeUnit.SECONDS);
                    if (fetchEmitTuple == null) {
                        if (AsyncProcessor.d().h()) {
                            AsyncProcessor.d().x("null fetch emit tuple");
                        }
                    } else {
                        if (fetchEmitTuple == PipesIterator.COMPLETED_SEMAPHORE) {
                            if (AsyncProcessor.d().h()) {
                                AsyncProcessor.d().x("hit completed semaphore");
                            }
                            pipesClient.close();
                            return 1;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            pipesResult = pipesClient.process(fetchEmitTuple);
                        } catch (IOException e) {
                            AsyncProcessor.d().k("pipesClient crash", e);
                            pipesResult = PipesResult.UNSPECIFIED_CRASH;
                        }
                        if (AsyncProcessor.d().h()) {
                            AsyncProcessor.d().q("timer -- pipes client process: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (shouldEmit(pipesResult)) {
                            AsyncProcessor.d().x("adding result to emitter queue: " + String.valueOf(pipesResult.getEmitData()));
                            if (!this.emitDataQueue.offer(pipesResult.getEmitData(), AsyncProcessor.f(), TimeUnit.MILLISECONDS)) {
                                throw new RuntimeException("Couldn't offer emit data to queue within " + AsyncProcessor.f() + " ms");
                            }
                        }
                        if (AsyncProcessor.d().h()) {
                            AsyncProcessor.d().q("timer -- offered: {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2));
                        }
                        this.asyncConfig.getPipesReporter().report(fetchEmitTuple, pipesResult, System.currentTimeMillis() - currentTimeMillis);
                        AsyncProcessor.c(AsyncProcessor.this).incrementAndGet();
                    }
                } catch (Throwable th) {
                    try {
                        pipesClient.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    public AsyncProcessor(Path path) throws TikaException, IOException {
        this(path, null);
    }

    public static /* synthetic */ void a(AsyncProcessor asyncProcessor, TotalCounter totalCounter) {
        asyncProcessor.lambda$startCounter$1(totalCounter);
    }

    public static /* synthetic */ Integer b(AsyncProcessor asyncProcessor) {
        return asyncProcessor.lambda$new$0();
    }

    public static /* bridge */ /* synthetic */ AtomicLong c(AsyncProcessor asyncProcessor) {
        return asyncProcessor.totalProcessed;
    }

    public static /* bridge */ /* synthetic */ Wb.c d() {
        return LOG;
    }

    public static /* bridge */ /* synthetic */ long f() {
        return MAX_OFFER_WAIT_MS;
    }

    private /* synthetic */ Integer lambda$new$0() throws Exception {
        while (true) {
            try {
                Thread.sleep(500L);
                checkActive();
            } catch (InterruptedException unused) {
                return 3;
            }
        }
    }

    private /* synthetic */ void lambda$startCounter$1(TotalCounter totalCounter) {
        totalCounter.startTotalCount();
        PipesReporter pipesReporter = this.asyncConfig.getPipesReporter();
        TotalCountResult.STATUS status = totalCounter.getTotalCount().getStatus();
        while (status == TotalCountResult.STATUS.NOT_COMPLETED) {
            try {
                Thread.sleep(500L);
                TotalCountResult totalCount = totalCounter.getTotalCount();
                LOG.d("counter total  {} {} ", totalCount.getStatus(), Long.valueOf(totalCount.getTotalCount()));
                pipesReporter.report(totalCount);
                status = totalCount.getStatus();
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private void startCounter(TotalCounter totalCounter) {
        Thread thread = new Thread(new f(this, totalCounter));
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized boolean checkActive() throws InterruptedException {
        boolean z;
        try {
            Future poll = this.executorCompletionService.poll();
            z = true;
            if (poll != null) {
                try {
                    Integer num = (Integer) poll.get();
                    int intValue = num.intValue();
                    if (intValue == 1) {
                        this.numParserThreadsFinished++;
                        LOG.t("fetchEmitWorker finished, total {}", Integer.valueOf(this.numParserThreadsFinished));
                    } else if (intValue == 2) {
                        this.numEmitterThreadsFinished++;
                        LOG.t("emitter thread finished, total {}", Integer.valueOf(this.numEmitterThreadsFinished));
                    } else {
                        if (intValue != 3) {
                            throw new IllegalArgumentException("Don't recognize this future code: " + num);
                        }
                        LOG.debug("watcher thread finished");
                    }
                } catch (ExecutionException e) {
                    LOG.error("execution exception", e);
                    this.asyncConfig.getPipesReporter().error(e);
                    throw new RuntimeException(e);
                }
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && !this.addedEmitterSemaphores) {
                for (int i = 0; i < this.asyncConfig.getNumEmitters(); i++) {
                    try {
                        if (!this.emitData.offer(AsyncEmitter.EMIT_DATA_STOP_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                            throw new RuntimeException("Couldn't offer emit data stop semaphore within " + MAX_OFFER_WAIT_MS + " ms");
                        }
                    } catch (InterruptedException e2) {
                        throw new RuntimeException(e2);
                    }
                }
                this.addedEmitterSemaphores = true;
            }
            if (this.numParserThreadsFinished == this.asyncConfig.getNumClients() && this.numEmitterThreadsFinished == this.asyncConfig.getNumEmitters()) {
                z = false;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    public void close() throws IOException {
        this.executorService.shutdownNow();
        this.asyncConfig.getPipesReporter().close();
    }

    public void finished() throws InterruptedException {
        for (int i = 0; i < this.asyncConfig.getNumClients(); i++) {
            if (!this.fetchEmitTuples.offer(PipesIterator.COMPLETED_SEMAPHORE, MAX_OFFER_WAIT_MS, TimeUnit.MILLISECONDS)) {
                throw new RuntimeException("Couldn't offer completed semaphore within " + MAX_OFFER_WAIT_MS + " ms");
            }
        }
    }

    public int getCapacity() {
        return this.fetchEmitTuples.remainingCapacity();
    }

    public long getTotalProcessed() {
        return this.totalProcessed.get();
    }

    public synchronized boolean offer(List list, long j) throws PipesException, InterruptedException {
        if (this.isShuttingDown) {
            throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
        }
        if (list.size() > this.asyncConfig.getQueueSize()) {
            throw new OfferLargerThanQueueSize(list.size(), this.asyncConfig.getQueueSize());
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (long currentTimeMillis2 = System.currentTimeMillis(); currentTimeMillis2 - currentTimeMillis < j; currentTimeMillis2 = System.currentTimeMillis()) {
            if (this.fetchEmitTuples.remainingCapacity() > list.size()) {
                try {
                    this.fetchEmitTuples.addAll(list);
                    return true;
                } catch (IllegalStateException e) {
                    LOG.v("couldn't add full list", e);
                }
            }
            Thread.sleep(100L);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncProcessor(Path path, PipesIterator pipesIterator) throws TikaException, IOException {
        this.totalProcessed = new AtomicLong(0L);
        this.numParserThreadsFinished = 0;
        this.numEmitterThreadsFinished = 0;
        this.addedEmitterSemaphores = false;
        this.isShuttingDown = false;
        AsyncConfig load = AsyncConfig.load(path);
        this.asyncConfig = load;
        this.fetchEmitTuples = new ArrayBlockingQueue(load.getQueueSize());
        this.emitData = new ArrayBlockingQueue(100);
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(load.getNumClients() + load.getNumEmitters() + 1);
        this.executorService = newFixedThreadPool;
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
        this.executorCompletionService = executorCompletionService;
        try {
            if (!e.a(org.apache.tika.detect.a.a(path), org.apache.tika.detect.a.a(load.getTikaConfig()))) {
                LOG.g("TikaConfig for AsyncProcessor ({}) is different from TikaConfig for workers ({}). If this is intended, please ignore this warning.", org.apache.tika.detect.a.a(path), org.apache.tika.detect.a.a(load.getTikaConfig()));
            }
            executorCompletionService.submit(new g(this));
            if (pipesIterator != 0 && (pipesIterator instanceof TotalCounter)) {
                LOG.debug("going to total counts");
                startCounter((TotalCounter) pipesIterator);
            }
            for (int i = 0; i < this.asyncConfig.getNumClients(); i++) {
                this.executorCompletionService.submit(new FetchEmitWorker(this, this.asyncConfig, this.fetchEmitTuples, this.emitData, null));
            }
            EmitterManager load2 = EmitterManager.load(this.asyncConfig.getTikaConfig());
            for (int i2 = 0; i2 < this.asyncConfig.getNumEmitters(); i2++) {
                this.executorCompletionService.submit(new AsyncEmitter(this.asyncConfig, this.emitData, load2));
            }
        } catch (Exception e) {
            LOG.error("problem initializing AsyncProcessor", e);
            this.executorService.shutdownNow();
            this.asyncConfig.getPipesReporter().error(e);
            throw e;
        }
    }

    public synchronized boolean offer(FetchEmitTuple fetchEmitTuple, long j) throws PipesException, InterruptedException {
        if (this.fetchEmitTuples != null) {
            if (!this.isShuttingDown) {
                checkActive();
            } else {
                throw new IllegalStateException("Can't call offer after calling close() or shutdownNow()");
            }
        } else {
            throw new IllegalStateException("queue hasn't been initialized yet.");
        }
        return this.fetchEmitTuples.offer(fetchEmitTuple, j, TimeUnit.MILLISECONDS);
    }
}
