package org.apache.tika.pipes.pipesiterator;

import Wb.c;
import Wb.e;
import com.applovin.shadow.okio.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.tika.config.ConfigBase;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.exception.TikaTimeoutException;
import org.apache.tika.pipes.FetchEmitTuple;
import org.apache.tika.pipes.HandlerConfig;
import org.apache.tika.sax.BasicContentHandlerFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PipesIterator extends ConfigBase implements Callable, Iterable, Initializable {
    public static final long DEFAULT_MAX_WAIT_MS = 300000;
    public static final int DEFAULT_QUEUE_SIZE = 1000;
    private String emitterName;
    private String fetcherName;
    private FutureTask futureTask;
    public static final FetchEmitTuple COMPLETED_SEMAPHORE = new FetchEmitTuple(null, null, null, null, null, null);
    private static final c LOGGER = e.l(PipesIterator.class);
    private long maxWaitMs = 300000;
    private ArrayBlockingQueue queue = null;
    private int queueSize = 1000;
    private FetchEmitTuple.ON_PARSE_EXCEPTION onParseException = FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT;
    private BasicContentHandlerFactory.HANDLER_TYPE handlerType = BasicContentHandlerFactory.HANDLER_TYPE.TEXT;
    private HandlerConfig.PARSE_MODE parseMode = HandlerConfig.PARSE_MODE.RMETA;
    private boolean throwOnWriteLimitReached = false;
    private int writeLimit = -1;
    private int maxEmbeddedResources = -1;
    private int added = 0;

    public class TupleIterator implements Iterator {
        FetchEmitTuple next;

        public /* synthetic */ TupleIterator(PipesIterator pipesIterator, a aVar) {
            this();
        }

        private void checkThreadOk() throws InterruptedException {
            if (PipesIterator.a(PipesIterator.this).isDone()) {
                try {
                    PipesIterator.a(PipesIterator.this).get();
                } catch (ExecutionException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }

        private FetchEmitTuple pollNext() throws TikaTimeoutException {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                FetchEmitTuple fetchEmitTuple = null;
                while (fetchEmitTuple == null) {
                    if (currentTimeMillis2 >= PipesIterator.b(PipesIterator.this)) {
                        break;
                    }
                    checkThreadOk();
                    fetchEmitTuple = (FetchEmitTuple) PipesIterator.c(PipesIterator.this).poll(100L, TimeUnit.MILLISECONDS);
                    currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                }
                if (fetchEmitTuple != null) {
                    return fetchEmitTuple;
                }
                throw new TikaTimeoutException("waited longer than " + PipesIterator.b(PipesIterator.this) + "ms for the next tuple");
            } catch (InterruptedException unused) {
                PipesIterator.f().w("interrupted");
                return PipesIterator.COMPLETED_SEMAPHORE;
            }
        }

        public boolean hasNext() {
            if (this.next == null) {
                this.next = pollNext();
            }
            return this.next != PipesIterator.COMPLETED_SEMAPHORE;
        }

        private TupleIterator() {
            this.next = null;
        }

        public FetchEmitTuple next() {
            FetchEmitTuple fetchEmitTuple = this.next;
            if (fetchEmitTuple == PipesIterator.COMPLETED_SEMAPHORE) {
                throw new IllegalStateException("don't call next() after hasNext() has returned false!");
            }
            this.next = pollNext();
            return fetchEmitTuple;
        }
    }

    public static /* bridge */ /* synthetic */ FutureTask a(PipesIterator pipesIterator) {
        return pipesIterator.futureTask;
    }

    public static /* bridge */ /* synthetic */ long b(PipesIterator pipesIterator) {
        return pipesIterator.maxWaitMs;
    }

    public static PipesIterator build(Path path) throws IOException, TikaConfigException {
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            PipesIterator pipesIterator = (PipesIterator) ConfigBase.buildSingle("pipesIterator", PipesIterator.class, a);
            if (a != null) {
                a.close();
            }
            return pipesIterator;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ ArrayBlockingQueue c(PipesIterator pipesIterator) {
        return pipesIterator.queue;
    }

    public static /* bridge */ /* synthetic */ c f() {
        return LOGGER;
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
    }

    public abstract void enqueue() throws IOException, TimeoutException, InterruptedException;

    public String getEmitterName() {
        return this.emitterName;
    }

    public String getFetcherName() {
        return this.fetcherName;
    }

    public HandlerConfig getHandlerConfig() {
        return new HandlerConfig(this.handlerType, this.parseMode, this.writeLimit, this.maxEmbeddedResources, this.throwOnWriteLimitReached);
    }

    public FetchEmitTuple.ON_PARSE_EXCEPTION getOnParseException() {
        return this.onParseException;
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    public Iterator iterator() {
        if (this.futureTask != null) {
            throw new IllegalStateException("Can't call iterator more than once!");
        }
        this.futureTask = new FutureTask(this);
        this.queue = new ArrayBlockingQueue(this.queueSize);
        new Thread(this.futureTask).start();
        return new TupleIterator(this, null);
    }

    @Field
    public void setEmitterName(String str) {
        this.emitterName = str;
    }

    @Field
    public void setFetcherName(String str) {
        this.fetcherName = str;
    }

    @Field
    public void setHandlerType(String str) {
        this.handlerType = BasicContentHandlerFactory.parseHandlerType(str, BasicContentHandlerFactory.HANDLER_TYPE.TEXT);
    }

    @Field
    public void setMaxEmbeddedResources(int i) {
        this.maxEmbeddedResources = i;
    }

    @Field
    public void setMaxWaitMs(long j) {
        this.maxWaitMs = j;
    }

    @Field
    public void setOnParseException(String str) throws TikaConfigException {
        if ("skip".equalsIgnoreCase(str)) {
            setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION.SKIP);
        } else {
            if ("emit".equalsIgnoreCase(str)) {
                setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION.EMIT);
                return;
            }
            throw new TikaConfigException("must be either 'skip' or 'emit': " + str);
        }
    }

    @Field
    public void setParseMode(String str) {
        setParseMode(HandlerConfig.PARSE_MODE.parseMode(str));
    }

    @Field
    public void setQueueSize(int i) {
        this.queueSize = i;
    }

    @Field
    public void setThrowOnWriteLimitReached(boolean z) {
        this.throwOnWriteLimitReached = z;
    }

    @Field
    public void setWriteLimit(int i) {
        this.writeLimit = i;
    }

    public void tryToAdd(FetchEmitTuple fetchEmitTuple) throws InterruptedException, TimeoutException {
        this.added++;
        if (!this.queue.offer(fetchEmitTuple, this.maxWaitMs, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException("timed out while offering");
        }
    }

    public Integer call() throws Exception {
        enqueue();
        tryToAdd(COMPLETED_SEMAPHORE);
        return Integer.valueOf(this.added);
    }

    public void setParseMode(HandlerConfig.PARSE_MODE parse_mode) {
        this.parseMode = parse_mode;
    }

    public void setOnParseException(FetchEmitTuple.ON_PARSE_EXCEPTION on_parse_exception) {
        this.onParseException = on_parse_exception;
    }
}
