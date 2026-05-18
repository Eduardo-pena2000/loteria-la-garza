package com.applovin.shadow.okio;

import Ca.I;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Throttler {
    private long allocatedUntil;
    private long bytesPerSecond;
    private final Condition condition;
    private final ReentrantLock lock;
    private long maxByteCount;
    private long waitByteCount;

    public static final class 1 extends ForwardingSink {
        final /* synthetic */ Throttler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Sink sink, Throttler throttler) {
            super(sink);
            this.this$0 = throttler;
        }

        public void write(Buffer buffer, long j) throws IOException {
            kotlin.jvm.internal.t.g(buffer, "source");
            while (j > 0) {
                try {
                    long take$okio = this.this$0.take$okio(j);
                    super.write(buffer, take$okio);
                    j -= take$okio;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    public static final class 1 extends ForwardingSource {
        final /* synthetic */ Throttler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Source source, Throttler throttler) {
            super(source);
            this.this$0 = throttler;
        }

        public long read(Buffer buffer, long j) {
            kotlin.jvm.internal.t.g(buffer, "sink");
            try {
                return super.read(buffer, this.this$0.take$okio(j));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public Throttler(long j) {
        this.allocatedUntil = j;
        this.waitByteCount = 8192L;
        this.maxByteCount = 262144L;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.f(newCondition, "newCondition(...)");
        this.condition = newCondition;
    }

    public static /* synthetic */ void bytesPerSecond$default(Throttler throttler, long j, long j2, long j3, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = throttler.waitByteCount;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            j3 = throttler.maxByteCount;
        }
        throttler.bytesPerSecond(j, j4, j3);
    }

    private final long bytesToNanos(long j) {
        return (j * 1000000000) / this.bytesPerSecond;
    }

    private final long nanosToBytes(long j) {
        return (j * this.bytesPerSecond) / 1000000000;
    }

    public final long byteCountOrWaitNanos$okio(long j, long j2) {
        if (this.bytesPerSecond == 0) {
            return j2;
        }
        long max = Math.max(this.allocatedUntil - j, 0L);
        long nanosToBytes = this.maxByteCount - nanosToBytes(max);
        if (nanosToBytes >= j2) {
            this.allocatedUntil = j + max + bytesToNanos(j2);
            return j2;
        }
        long j3 = this.waitByteCount;
        if (nanosToBytes >= j3) {
            this.allocatedUntil = j + bytesToNanos(this.maxByteCount);
            return nanosToBytes;
        }
        long min = Math.min(j3, j2);
        long bytesToNanos = max + bytesToNanos(min - this.maxByteCount);
        if (bytesToNanos != 0) {
            return -bytesToNanos;
        }
        this.allocatedUntil = j + bytesToNanos(this.maxByteCount);
        return min;
    }

    public final void bytesPerSecond(long j) {
        bytesPerSecond$default(this, j, 0L, 0L, 6, null);
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final Sink sink(Sink sink) {
        kotlin.jvm.internal.t.g(sink, "sink");
        return new 1(sink, this);
    }

    public final Source source(Source source) {
        kotlin.jvm.internal.t.g(source, "source");
        return new 1(source, this);
    }

    public final long take$okio(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        while (true) {
            try {
                long byteCountOrWaitNanos$okio = byteCountOrWaitNanos$okio(System.nanoTime(), j);
                if (byteCountOrWaitNanos$okio >= 0) {
                    return byteCountOrWaitNanos$okio;
                }
                this.condition.awaitNanos(-byteCountOrWaitNanos$okio);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void bytesPerSecond(long j, long j2) {
        bytesPerSecond$default(this, j, j2, 0L, 4, null);
    }

    public final void bytesPerSecond(long j, long j2, long j3) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (j < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j2 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j3 >= j2) {
                this.bytesPerSecond = j;
                this.waitByteCount = j2;
                this.maxByteCount = j3;
                this.condition.signalAll();
                I i = I.a;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        } finally {
            reentrantLock.unlock();
        }
    }

    public Throttler() {
        this(System.nanoTime());
    }
}
