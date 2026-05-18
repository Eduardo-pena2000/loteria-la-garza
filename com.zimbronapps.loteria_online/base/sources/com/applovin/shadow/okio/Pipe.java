package com.applovin.shadow.okio;

import Ca.I;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Pipe {
    private final Buffer buffer = new Buffer();
    private boolean canceled;
    private final Condition condition;
    private Sink foldedSink;
    private final ReentrantLock lock;
    private final long maxBufferSize;
    private final Sink sink;
    private boolean sinkClosed;
    private final Source source;
    private boolean sourceClosed;

    public static final class 1 implements Sink {
        private final Timeout timeout = new Timeout();

        public 1() {
        }

        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed$okio()) {
                    lock.unlock();
                    return;
                }
                Sink foldedSink$okio = pipe.getFoldedSink$okio();
                if (foldedSink$okio == null) {
                    if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    pipe.setSinkClosed$okio(true);
                    pipe.getCondition().signalAll();
                    foldedSink$okio = null;
                }
                I i = I.a;
                lock.unlock();
                if (foldedSink$okio != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink$okio.timeout();
                    Timeout timeout2 = pipe2.sink().timeout();
                    long timeoutNanos = timeout.timeoutNanos();
                    long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(minTimeout, timeUnit);
                    if (!timeout.hasDeadline()) {
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th;
                        }
                    }
                    long deadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink$okio.close();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        }

        public void flush() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSinkClosed$okio()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled$okio()) {
                    throw new IOException("canceled");
                }
                Sink foldedSink$okio = pipe.getFoldedSink$okio();
                if (foldedSink$okio == null) {
                    if (pipe.getSourceClosed$okio() && pipe.getBuffer$okio().size() > 0) {
                        throw new IOException("source is closed");
                    }
                    foldedSink$okio = null;
                }
                I i = I.a;
                lock.unlock();
                if (foldedSink$okio != null) {
                    Pipe pipe2 = Pipe.this;
                    Timeout timeout = foldedSink$okio.timeout();
                    Timeout timeout2 = pipe2.sink().timeout();
                    long timeoutNanos = timeout.timeoutNanos();
                    long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(minTimeout, timeUnit);
                    if (!timeout.hasDeadline()) {
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.flush();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th;
                        }
                    }
                    long deadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink$okio.flush();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                lock.unlock();
                throw th3;
            }
        }

        public Timeout timeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        
            r1 = Ca.I.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        
            r0.unlock();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        
            if (r2 == null) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        
            r0 = r12.this$0;
            r1 = r2.timeout();
            r0 = r0.sink().timeout();
            r3 = r1.timeoutNanos();
            r5 = com.applovin.shadow.okio.Timeout.Companion.minTimeout(r0.timeoutNanos(), r1.timeoutNanos());
            r7 = java.util.concurrent.TimeUnit.NANOSECONDS;
            r1.timeout(r5, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00a8, code lost:
        
            if (r1.hasDeadline() == false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
        
            r5 = r1.deadlineNanoTime();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        
            if (r0.hasDeadline() == false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
        
            r1.deadlineNanoTime(java.lang.Math.min(r1.deadlineNanoTime(), r0.deadlineNanoTime()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
        
            if (r0.hasDeadline() == false) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00d4, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
        
            if (r0.hasDeadline() != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00df, code lost:
        
            r1.deadlineNanoTime(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        
            if (r0.hasDeadline() == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00e9, code lost:
        
            r1.deadlineNanoTime(r0.deadlineNanoTime());
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
        
            r2.write(r13, r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00f3, code lost:
        
            r1.timeout(r3, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fa, code lost:
        
            if (r0.hasDeadline() == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x0100, code lost:
        
            r13 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0101, code lost:
        
            r1.timeout(r3, java.util.concurrent.TimeUnit.NANOSECONDS);
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x010a, code lost:
        
            if (r0.hasDeadline() != false) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x010c, code lost:
        
            r1.clearDeadline();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x010f, code lost:
        
            throw r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0110, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void write(com.applovin.shadow.okio.Buffer r13, long r14) {
            /*
                Method dump skipped, instructions count: 291
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Pipe.sink.1.write(com.applovin.shadow.okio.Buffer, long):void");
        }
    }

    public static final class 1 implements Source {
        private final Timeout timeout = new Timeout();

        public 1() {
        }

        public void close() {
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                pipe.setSourceClosed$okio(true);
                pipe.getCondition().signalAll();
                I i = I.a;
            } finally {
                lock.unlock();
            }
        }

        public long read(Buffer buffer, long j) {
            kotlin.jvm.internal.t.g(buffer, "sink");
            ReentrantLock lock = Pipe.this.getLock();
            Pipe pipe = Pipe.this;
            lock.lock();
            try {
                if (pipe.getSourceClosed$okio()) {
                    throw new IllegalStateException("closed");
                }
                if (pipe.getCanceled$okio()) {
                    throw new IOException("canceled");
                }
                while (pipe.getBuffer$okio().size() == 0) {
                    if (pipe.getSinkClosed$okio()) {
                        lock.unlock();
                        return -1L;
                    }
                    this.timeout.awaitSignal(pipe.getCondition());
                    if (pipe.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                }
                long read = pipe.getBuffer$okio().read(buffer, j);
                pipe.getCondition().signalAll();
                lock.unlock();
                return read;
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        }

        public Timeout timeout() {
            return this.timeout;
        }
    }

    public Pipe(long j) {
        this.maxBufferSize = j;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.t.f(newCondition, "newCondition(...)");
        this.condition = newCondition;
        if (j >= 1) {
            this.sink = new 1();
            this.source = new 1();
        } else {
            throw new IllegalArgumentException(("maxBufferSize < 1: " + j).toString());
        }
    }

    private final void forward(Sink sink, Qa.l lVar) {
        Timeout timeout = sink.timeout();
        Timeout timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long minTimeout = Timeout.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(minTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(sink);
                I i = I.a;
                kotlin.jvm.internal.r.b(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.r.a(1);
                return;
            } catch (Throwable th) {
                kotlin.jvm.internal.r.b(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.r.a(1);
                throw th;
            }
        }
        long deadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(sink);
            I i2 = I.a;
            kotlin.jvm.internal.r.b(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.a(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.r.b(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.a(1);
            throw th2;
        }
    }

    @Ca.e
    public final Sink -deprecated_sink() {
        return this.sink;
    }

    @Ca.e
    public final Source -deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.canceled = true;
            this.buffer.clear();
            this.condition.signalAll();
            I i = I.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void fold(Sink sink) throws IOException {
        kotlin.jvm.internal.t.g(sink, "sink");
        while (true) {
            this.lock.lock();
            try {
                if (this.foldedSink != null) {
                    throw new IllegalStateException("sink already folded");
                }
                if (this.canceled) {
                    this.foldedSink = sink;
                    throw new IOException("canceled");
                }
                if (this.buffer.exhausted()) {
                    this.sourceClosed = true;
                    this.foldedSink = sink;
                    return;
                }
                boolean z = this.sinkClosed;
                Buffer buffer = new Buffer();
                Buffer buffer2 = this.buffer;
                buffer.write(buffer2, buffer2.size());
                this.condition.signalAll();
                I i = I.a;
                try {
                    sink.write(buffer, buffer.size());
                    if (z) {
                        sink.close();
                    } else {
                        sink.flush();
                    }
                } catch (Throwable th) {
                    this.lock.lock();
                    try {
                        this.sourceClosed = true;
                        this.condition.signalAll();
                        I i2 = I.a;
                        throw th;
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final Buffer getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final Condition getCondition() {
        return this.condition;
    }

    public final Sink getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final ReentrantLock getLock() {
        return this.lock;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z) {
        this.canceled = z;
    }

    public final void setFoldedSink$okio(Sink sink) {
        this.foldedSink = sink;
    }

    public final void setSinkClosed$okio(boolean z) {
        this.sinkClosed = z;
    }

    public final void setSourceClosed$okio(boolean z) {
        this.sourceClosed = z;
    }

    public final Sink sink() {
        return this.sink;
    }

    public final Source source() {
        return this.source;
    }
}
