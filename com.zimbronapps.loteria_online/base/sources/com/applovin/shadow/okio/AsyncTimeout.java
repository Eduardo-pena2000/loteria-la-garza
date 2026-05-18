package com.applovin.shadow.okio;

import Ca.I;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AsyncTimeout extends Timeout {
    public static final Companion Companion = new Companion(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ boolean access$cancelScheduledTimeout(Companion companion, AsyncTimeout asyncTimeout) {
            return companion.cancelScheduledTimeout(asyncTimeout);
        }

        public static final /* synthetic */ void access$scheduleTimeout(Companion companion, AsyncTimeout asyncTimeout, long j, boolean z) {
            companion.scheduleTimeout(asyncTimeout, j, z);
        }

        private final boolean cancelScheduledTimeout(AsyncTimeout asyncTimeout) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (!AsyncTimeout.access$getInQueue$p(asyncTimeout)) {
                    return false;
                }
                AsyncTimeout.access$setInQueue$p(asyncTimeout, false);
                for (AsyncTimeout access$getHead$cp = AsyncTimeout.access$getHead$cp(); access$getHead$cp != null; access$getHead$cp = AsyncTimeout.access$getNext$p(access$getHead$cp)) {
                    if (AsyncTimeout.access$getNext$p(access$getHead$cp) == asyncTimeout) {
                        AsyncTimeout.access$setNext$p(access$getHead$cp, AsyncTimeout.access$getNext$p(asyncTimeout));
                        AsyncTimeout.access$setNext$p(asyncTimeout, null);
                        return false;
                    }
                }
                lock.unlock();
                return true;
            } finally {
                lock.unlock();
            }
        }

        private final void scheduleTimeout(AsyncTimeout asyncTimeout, long j, boolean z) {
            ReentrantLock lock = AsyncTimeout.Companion.getLock();
            lock.lock();
            try {
                if (AsyncTimeout.access$getInQueue$p(asyncTimeout)) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                AsyncTimeout.access$setInQueue$p(asyncTimeout, true);
                if (AsyncTimeout.access$getHead$cp() == null) {
                    AsyncTimeout.access$setHead$cp(new AsyncTimeout());
                    new Watchdog().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0 && z) {
                    AsyncTimeout.access$setTimeoutAt$p(asyncTimeout, Math.min(j, asyncTimeout.deadlineNanoTime() - nanoTime) + nanoTime);
                } else if (j != 0) {
                    AsyncTimeout.access$setTimeoutAt$p(asyncTimeout, j + nanoTime);
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    AsyncTimeout.access$setTimeoutAt$p(asyncTimeout, asyncTimeout.deadlineNanoTime());
                }
                long access$remainingNanos = AsyncTimeout.access$remainingNanos(asyncTimeout, nanoTime);
                AsyncTimeout access$getHead$cp = AsyncTimeout.access$getHead$cp();
                kotlin.jvm.internal.t.d(access$getHead$cp);
                while (AsyncTimeout.access$getNext$p(access$getHead$cp) != null) {
                    AsyncTimeout access$getNext$p = AsyncTimeout.access$getNext$p(access$getHead$cp);
                    kotlin.jvm.internal.t.d(access$getNext$p);
                    if (access$remainingNanos < AsyncTimeout.access$remainingNanos(access$getNext$p, nanoTime)) {
                        break;
                    }
                    access$getHead$cp = AsyncTimeout.access$getNext$p(access$getHead$cp);
                    kotlin.jvm.internal.t.d(access$getHead$cp);
                }
                AsyncTimeout.access$setNext$p(asyncTimeout, AsyncTimeout.access$getNext$p(access$getHead$cp));
                AsyncTimeout.access$setNext$p(access$getHead$cp, asyncTimeout);
                if (access$getHead$cp == AsyncTimeout.access$getHead$cp()) {
                    AsyncTimeout.Companion.getCondition().signal();
                }
                I i = I.a;
                lock.unlock();
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }

        public final AsyncTimeout awaitTimeout$okio() throws InterruptedException {
            AsyncTimeout access$getHead$cp = AsyncTimeout.access$getHead$cp();
            kotlin.jvm.internal.t.d(access$getHead$cp);
            AsyncTimeout access$getNext$p = AsyncTimeout.access$getNext$p(access$getHead$cp);
            if (access$getNext$p == null) {
                long nanoTime = System.nanoTime();
                getCondition().await(AsyncTimeout.access$getIDLE_TIMEOUT_MILLIS$cp(), TimeUnit.MILLISECONDS);
                AsyncTimeout access$getHead$cp2 = AsyncTimeout.access$getHead$cp();
                kotlin.jvm.internal.t.d(access$getHead$cp2);
                if (AsyncTimeout.access$getNext$p(access$getHead$cp2) != null || System.nanoTime() - nanoTime < AsyncTimeout.access$getIDLE_TIMEOUT_NANOS$cp()) {
                    return null;
                }
                return AsyncTimeout.access$getHead$cp();
            }
            long access$remainingNanos = AsyncTimeout.access$remainingNanos(access$getNext$p, System.nanoTime());
            if (access$remainingNanos > 0) {
                getCondition().await(access$remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout access$getHead$cp3 = AsyncTimeout.access$getHead$cp();
            kotlin.jvm.internal.t.d(access$getHead$cp3);
            AsyncTimeout.access$setNext$p(access$getHead$cp3, AsyncTimeout.access$getNext$p(access$getNext$p));
            AsyncTimeout.access$setNext$p(access$getNext$p, null);
            return access$getNext$p;
        }

        public final Condition getCondition() {
            return AsyncTimeout.access$getCondition$cp();
        }

        public final ReentrantLock getLock() {
            return AsyncTimeout.access$getLock$cp();
        }

        private Companion() {
        }
    }

    public static final class Watchdog extends Thread {
        public Watchdog() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        public void run() {
            ReentrantLock lock;
            AsyncTimeout awaitTimeout$okio;
            while (true) {
                try {
                    Companion companion = AsyncTimeout.Companion;
                    lock = companion.getLock();
                    lock.lock();
                    try {
                        awaitTimeout$okio = companion.awaitTimeout$okio();
                    } finally {
                        lock.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (awaitTimeout$okio == AsyncTimeout.access$getHead$cp()) {
                    AsyncTimeout.access$setHead$cp(null);
                    return;
                }
                I i = I.a;
                lock.unlock();
                if (awaitTimeout$okio != null) {
                    awaitTimeout$okio.timedOut();
                }
            }
        }
    }

    public static final class 1 implements Sink {
        final /* synthetic */ Sink $sink;

        public 1(Sink sink) {
            this.$sink = sink;
        }

        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.$sink;
            asyncTimeout.enter();
            try {
                sink.close();
                I i = I.a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        public void flush() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Sink sink = this.$sink;
            asyncTimeout.enter();
            try {
                sink.flush();
                I i = I.a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.$sink + ')';
        }

        public void write(Buffer buffer, long j) {
            kotlin.jvm.internal.t.g(buffer, "source");
            -SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
            while (true) {
                long j2 = 0;
                if (j <= 0) {
                    return;
                }
                Segment segment = buffer.head;
                kotlin.jvm.internal.t.d(segment);
                while (true) {
                    if (j2 >= 65536) {
                        break;
                    }
                    j2 += segment.limit - segment.pos;
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        segment = segment.next;
                        kotlin.jvm.internal.t.d(segment);
                    }
                }
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                Sink sink = this.$sink;
                asyncTimeout.enter();
                try {
                    sink.write(buffer, j2);
                    I i = I.a;
                    if (asyncTimeout.exit()) {
                        throw asyncTimeout.access$newTimeoutException(null);
                    }
                    j -= j2;
                } catch (IOException e) {
                    if (!asyncTimeout.exit()) {
                        throw e;
                    }
                    throw asyncTimeout.access$newTimeoutException(e);
                } finally {
                    asyncTimeout.exit();
                }
            }
        }

        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }
    }

    public static final class 1 implements Source {
        final /* synthetic */ Source $source;

        public 1(Source source) {
            this.$source = source;
        }

        public void close() {
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.$source;
            asyncTimeout.enter();
            try {
                source.close();
                I i = I.a;
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
            } catch (IOException e) {
                if (!asyncTimeout.exit()) {
                    throw e;
                }
                throw asyncTimeout.access$newTimeoutException(e);
            } finally {
                asyncTimeout.exit();
            }
        }

        public long read(Buffer buffer, long j) {
            kotlin.jvm.internal.t.g(buffer, "sink");
            AsyncTimeout asyncTimeout = AsyncTimeout.this;
            Source source = this.$source;
            asyncTimeout.enter();
            try {
                long read = source.read(buffer, j);
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e) {
                if (asyncTimeout.exit()) {
                    throw asyncTimeout.access$newTimeoutException(e);
                }
                throw e;
            } finally {
                asyncTimeout.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.$source + ')';
        }

        public AsyncTimeout timeout() {
            return AsyncTimeout.this;
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.f(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final /* synthetic */ Condition access$getCondition$cp() {
        return condition;
    }

    public static final /* synthetic */ AsyncTimeout access$getHead$cp() {
        return head;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_MILLIS$cp() {
        return IDLE_TIMEOUT_MILLIS;
    }

    public static final /* synthetic */ long access$getIDLE_TIMEOUT_NANOS$cp() {
        return IDLE_TIMEOUT_NANOS;
    }

    public static final /* synthetic */ boolean access$getInQueue$p(AsyncTimeout asyncTimeout) {
        return asyncTimeout.inQueue;
    }

    public static final /* synthetic */ ReentrantLock access$getLock$cp() {
        return lock;
    }

    public static final /* synthetic */ AsyncTimeout access$getNext$p(AsyncTimeout asyncTimeout) {
        return asyncTimeout.next;
    }

    public static final /* synthetic */ long access$remainingNanos(AsyncTimeout asyncTimeout, long j) {
        return asyncTimeout.remainingNanos(j);
    }

    public static final /* synthetic */ void access$setHead$cp(AsyncTimeout asyncTimeout) {
        head = asyncTimeout;
    }

    public static final /* synthetic */ void access$setInQueue$p(AsyncTimeout asyncTimeout, boolean z) {
        asyncTimeout.inQueue = z;
    }

    public static final /* synthetic */ void access$setNext$p(AsyncTimeout asyncTimeout, AsyncTimeout asyncTimeout2) {
        asyncTimeout.next = asyncTimeout2;
    }

    public static final /* synthetic */ void access$setTimeoutAt$p(AsyncTimeout asyncTimeout, long j) {
        asyncTimeout.timeoutAt = j;
    }

    private final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.access$scheduleTimeout(Companion, this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.access$cancelScheduledTimeout(Companion, this);
    }

    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final Sink sink(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        return new 1(sink);
    }

    public final Source source(Source source) {
        kotlin.jvm.internal.t.g(source, "source");
        return new 1(source);
    }

    public void timedOut() {
    }

    public final Object withTimeout(Qa.a aVar) {
        kotlin.jvm.internal.t.g(aVar, "block");
        enter();
        try {
            try {
                Object invoke = aVar.invoke();
                kotlin.jvm.internal.r.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.r.a(1);
                return invoke;
            } catch (IOException e) {
                if (exit()) {
                    throw access$newTimeoutException(e);
                }
                throw e;
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.r.b(1);
            exit();
            kotlin.jvm.internal.r.a(1);
            throw th;
        }
    }
}
