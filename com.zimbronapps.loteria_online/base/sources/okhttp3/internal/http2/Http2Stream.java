package okhttp3.internal.http2;

import Ca.I;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.internal.Util;
import xb.J;
import xb.L;
import xb.M;
import xb.c;
import xb.e;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Stream {
    public static final Companion o = new Companion(null);
    public final int a;
    public final Http2Connection b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final FramingSource i;
    public final FramingSink j;
    public final StreamTimeout k;
    public final StreamTimeout l;
    public ErrorCode m;
    public IOException n;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public final class FramingSink implements J {
        public boolean a;
        public final e b;
        public Headers c;
        public boolean d;
        public final /* synthetic */ Http2Stream e;

        public FramingSink(Http2Stream this$0, boolean z) {
            t.g(this$0, "this$0");
            this.e = this$0;
            this.a = z;
            this.b = new e();
        }

        public final void a(boolean z) {
            long min;
            boolean z2;
            Http2Stream http2Stream = this.e;
            synchronized (http2Stream) {
                try {
                    http2Stream.s().w();
                    while (http2Stream.r() >= http2Stream.q() && !c() && !b() && http2Stream.h() == null) {
                        try {
                            http2Stream.F();
                        } finally {
                            http2Stream.s().D();
                        }
                    }
                    http2Stream.s().D();
                    http2Stream.c();
                    min = Math.min(http2Stream.q() - http2Stream.r(), this.b.A());
                    http2Stream.D(http2Stream.r() + min);
                    z2 = z && min == this.b.A();
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.e.s().w();
            try {
                this.e.g().t0(this.e.j(), z2, this.b, min);
            } finally {
                http2Stream = this.e;
            }
        }

        public final boolean b() {
            return this.d;
        }

        public final boolean c() {
            return this.a;
        }

        public void close() {
            Http2Stream http2Stream = this.e;
            if (Util.h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.e;
            synchronized (http2Stream2) {
                if (b()) {
                    return;
                }
                boolean z = http2Stream2.h() == null;
                I i = I.a;
                if (!this.e.o().a) {
                    boolean z2 = this.b.A() > 0;
                    if (this.c != null) {
                        while (this.b.A() > 0) {
                            a(false);
                        }
                        Http2Connection g = this.e.g();
                        int j = this.e.j();
                        Headers headers = this.c;
                        t.d(headers);
                        g.u0(j, z, Util.P(headers));
                    } else if (z2) {
                        while (this.b.A() > 0) {
                            a(true);
                        }
                    } else if (z) {
                        this.e.g().t0(this.e.j(), true, null, 0L);
                    }
                }
                synchronized (this.e) {
                    d(true);
                    I i2 = I.a;
                }
                this.e.g().flush();
                this.e.b();
            }
        }

        public final void d(boolean z) {
            this.d = z;
        }

        public void flush() {
            Http2Stream http2Stream = this.e;
            if (Util.h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = this.e;
            synchronized (http2Stream2) {
                http2Stream2.c();
                I i = I.a;
            }
            while (this.b.A() > 0) {
                a(false);
                this.e.g().flush();
            }
        }

        public void j1(e source, long j) {
            t.g(source, "source");
            Http2Stream http2Stream = this.e;
            if (!Util.h || !Thread.holdsLock(http2Stream)) {
                this.b.j1(source, j);
                while (this.b.A() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
        }

        public M timeout() {
            return this.e.s();
        }
    }

    public final class FramingSource implements L {
        public final long a;
        public boolean b;
        public final e c;
        public final e d;
        public Headers e;
        public boolean f;
        public final /* synthetic */ Http2Stream g;

        public FramingSource(Http2Stream this$0, long j, boolean z) {
            t.g(this$0, "this$0");
            this.g = this$0;
            this.a = j;
            this.b = z;
            this.c = new e();
            this.d = new e();
        }

        public long F(e sink, long j) {
            Throwable th;
            boolean z;
            long j2;
            t.g(sink, "sink");
            long j3 = 0;
            if (j < 0) {
                throw new IllegalArgumentException(t.o("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            while (true) {
                Http2Stream http2Stream = this.g;
                synchronized (http2Stream) {
                    http2Stream.m().w();
                    try {
                        if (http2Stream.h() == null || b()) {
                            th = null;
                        } else {
                            th = http2Stream.i();
                            if (th == null) {
                                ErrorCode h = http2Stream.h();
                                t.d(h);
                                th = new StreamResetException(h);
                            }
                        }
                        if (a()) {
                            throw new IOException("stream closed");
                        }
                        z = false;
                        if (c().A() > j3) {
                            j2 = c().F(sink, Math.min(j, c().A()));
                            http2Stream.C(http2Stream.l() + j2);
                            long l = http2Stream.l() - http2Stream.k();
                            if (th == null && l >= http2Stream.g().M().c() / 2) {
                                http2Stream.g().z0(http2Stream.j(), l);
                                http2Stream.B(http2Stream.l());
                            }
                        } else {
                            if (!b() && th == null) {
                                http2Stream.F();
                                z = true;
                            }
                            j2 = -1;
                        }
                        http2Stream.m().D();
                        I i = I.a;
                    } finally {
                    }
                }
                if (!z) {
                    if (j2 != -1) {
                        m(j2);
                        return j2;
                    }
                    if (th == null) {
                        return -1L;
                    }
                    throw th;
                }
                j3 = 0;
            }
        }

        public final boolean a() {
            return this.f;
        }

        public final boolean b() {
            return this.b;
        }

        public final e c() {
            return this.d;
        }

        public void close() {
            long A;
            Http2Stream http2Stream = this.g;
            synchronized (http2Stream) {
                g(true);
                A = c().A();
                c().a();
                http2Stream.notifyAll();
                I i = I.a;
            }
            if (A > 0) {
                m(A);
            }
            this.g.b();
        }

        public final e d() {
            return this.c;
        }

        public final void f(g source, long j) {
            boolean b;
            boolean z;
            long j2;
            t.g(source, "source");
            Http2Stream http2Stream = this.g;
            if (Util.h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            while (j > 0) {
                synchronized (this.g) {
                    b = b();
                    z = c().A() + j > this.a;
                    I i = I.a;
                }
                if (z) {
                    source.skip(j);
                    this.g.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (b) {
                    source.skip(j);
                    return;
                }
                long F = source.F(this.c, j);
                if (F == -1) {
                    throw new EOFException();
                }
                j -= F;
                Http2Stream http2Stream2 = this.g;
                synchronized (http2Stream2) {
                    try {
                        if (a()) {
                            j2 = d().A();
                            d().a();
                        } else {
                            boolean z2 = c().A() == 0;
                            c().p1(d());
                            if (z2) {
                                http2Stream2.notifyAll();
                            }
                            j2 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (j2 > 0) {
                    m(j2);
                }
            }
        }

        public final void g(boolean z) {
            this.f = z;
        }

        public final void h(boolean z) {
            this.b = z;
        }

        public final void k(Headers headers) {
            this.e = headers;
        }

        public final void m(long j) {
            Http2Stream http2Stream = this.g;
            if (!Util.h || !Thread.holdsLock(http2Stream)) {
                this.g.g().r0(j);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public M timeout() {
            return this.g.m();
        }
    }

    public final class StreamTimeout extends c {
        public final /* synthetic */ Http2Stream o;

        public StreamTimeout(Http2Stream this$0) {
            t.g(this$0, "this$0");
            this.o = this$0;
        }

        public void C() {
            this.o.f(ErrorCode.CANCEL);
            this.o.g().i0();
        }

        public final void D() {
            if (x()) {
                throw y(null);
            }
        }

        public IOException y(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public Http2Stream(int i, Http2Connection connection, boolean z, boolean z2, Headers headers) {
        t.g(connection, "connection");
        this.a = i;
        this.b = connection;
        this.f = connection.N().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new FramingSource(this, connection.M().c(), z2);
        this.j = new FramingSink(this, z);
        this.k = new StreamTimeout(this);
        this.l = new StreamTimeout(this);
        if (headers == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    public final void A(IOException iOException) {
        this.n = iOException;
    }

    public final void B(long j) {
        this.d = j;
    }

    public final void C(long j) {
        this.c = j;
    }

    public final void D(long j) {
        this.e = j;
    }

    public final synchronized Headers E() {
        Object removeFirst;
        this.k.w();
        while (this.g.isEmpty() && this.m == null) {
            try {
                F();
            } catch (Throwable th) {
                this.k.D();
                throw th;
            }
        }
        this.k.D();
        if (this.g.isEmpty()) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.m;
            t.d(errorCode);
            throw new StreamResetException(errorCode);
        }
        removeFirst = this.g.removeFirst();
        t.f(removeFirst, "headersQueue.removeFirst()");
        return (Headers) removeFirst;
    }

    public final void F() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final M G() {
        return this.l;
    }

    public final void a(long j) {
        this.f += j;
        if (j > 0) {
            notifyAll();
        }
    }

    public final void b() {
        boolean z;
        boolean u;
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z = !p().b() && p().a() && (o().c() || o().b());
                u = u();
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            d(ErrorCode.CANCEL, null);
        } else {
            if (u) {
                return;
            }
            this.b.g0(this.a);
        }
    }

    public final void c() {
        if (this.j.b()) {
            throw new IOException("stream closed");
        }
        if (this.j.c()) {
            throw new IOException("stream finished");
        }
        if (this.m != null) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.m;
            t.d(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void d(ErrorCode rstStatusCode, IOException iOException) {
        t.g(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.b.x0(this.a, rstStatusCode);
        }
    }

    public final boolean e(ErrorCode errorCode, IOException iOException) {
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            if (p().b() && o().c()) {
                return false;
            }
            z(errorCode);
            A(iOException);
            notifyAll();
            I i = I.a;
            this.b.g0(this.a);
            return true;
        }
    }

    public final void f(ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.b.y0(this.a, errorCode);
        }
    }

    public final Http2Connection g() {
        return this.b;
    }

    public final synchronized ErrorCode h() {
        return this.m;
    }

    public final IOException i() {
        return this.n;
    }

    public final int j() {
        return this.a;
    }

    public final long k() {
        return this.d;
    }

    public final long l() {
        return this.c;
    }

    public final StreamTimeout m() {
        return this.k;
    }

    public final J n() {
        synchronized (this) {
            try {
                if (!this.h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.j;
    }

    public final FramingSink o() {
        return this.j;
    }

    public final FramingSource p() {
        return this.i;
    }

    public final long q() {
        return this.f;
    }

    public final long r() {
        return this.e;
    }

    public final StreamTimeout s() {
        return this.l;
    }

    public final boolean t() {
        return this.b.C() == ((this.a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.m != null) {
                return false;
            }
            if (this.i.b() || this.i.a()) {
                if (this.j.c() || this.j.b()) {
                    if (this.h) {
                        return false;
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final M v() {
        return this.k;
    }

    public final void w(g source, int i) {
        t.g(source, "source");
        if (!Util.h || !Thread.holdsLock(this)) {
            this.i.f(source, i);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(Headers headers, boolean z) {
        boolean u;
        t.g(headers, "headers");
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.h && z) {
                    p().k(headers);
                } else {
                    this.h = true;
                    this.g.add(headers);
                }
                if (z) {
                    p().h(true);
                }
                u = u();
                notifyAll();
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (u) {
            return;
        }
        this.b.g0(this.a);
    }

    public final synchronized void y(ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        if (this.m == null) {
            this.m = errorCode;
            notifyAll();
        }
    }

    public final void z(ErrorCode errorCode) {
        this.m = errorCode;
    }
}
