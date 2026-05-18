package okhttp3.internal.http2;

import Ca.I;
import Qa.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskQueue$execute$1;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import xb.e;
import xb.f;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection implements Closeable {
    public static final Companion C = new Companion(null);
    public static final Settings D;
    public final ReaderRunnable A;
    public final Set B;
    public final boolean a;
    public final Listener b;
    public final Map c;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final TaskRunner h;
    public final TaskQueue i;
    public final TaskQueue j;
    public final TaskQueue k;
    public final PushObserver l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public final Settings s;
    public Settings t;
    public long u;
    public long v;
    public long w;
    public long x;
    public final Socket y;
    public final Http2Writer z;

    public static final class Builder {
        public boolean a;
        public final TaskRunner b;
        public Socket c;
        public String d;
        public g e;
        public f f;
        public Listener g;
        public PushObserver h;
        public int i;

        public Builder(boolean z, TaskRunner taskRunner) {
            t.g(taskRunner, "taskRunner");
            this.a = z;
            this.b = taskRunner;
            this.g = Listener.b;
            this.h = PushObserver.b;
        }

        public final Http2Connection a() {
            return new Http2Connection(this);
        }

        public final boolean b() {
            return this.a;
        }

        public final String c() {
            String str = this.d;
            if (str != null) {
                return str;
            }
            t.v("connectionName");
            return null;
        }

        public final Listener d() {
            return this.g;
        }

        public final int e() {
            return this.i;
        }

        public final PushObserver f() {
            return this.h;
        }

        public final f g() {
            f fVar = this.f;
            if (fVar != null) {
                return fVar;
            }
            t.v("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.c;
            if (socket != null) {
                return socket;
            }
            t.v("socket");
            return null;
        }

        public final g i() {
            g gVar = this.e;
            if (gVar != null) {
                return gVar;
            }
            t.v("source");
            return null;
        }

        public final TaskRunner j() {
            return this.b;
        }

        public final Builder k(Listener listener) {
            t.g(listener, "listener");
            n(listener);
            return this;
        }

        public final Builder l(int i) {
            o(i);
            return this;
        }

        public final void m(String str) {
            t.g(str, "<set-?>");
            this.d = str;
        }

        public final void n(Listener listener) {
            t.g(listener, "<set-?>");
            this.g = listener;
        }

        public final void o(int i) {
            this.i = i;
        }

        public final void p(f fVar) {
            t.g(fVar, "<set-?>");
            this.f = fVar;
        }

        public final void q(Socket socket) {
            t.g(socket, "<set-?>");
            this.c = socket;
        }

        public final void r(g gVar) {
            t.g(gVar, "<set-?>");
            this.e = gVar;
        }

        public final Builder s(Socket socket, String peerName, g source, f sink) {
            String o;
            t.g(socket, "socket");
            t.g(peerName, "peerName");
            t.g(source, "source");
            t.g(sink, "sink");
            q(socket);
            if (b()) {
                o = Util.i + ' ' + peerName;
            } else {
                o = t.o("MockWebServer ", peerName);
            }
            m(o);
            r(source);
            p(sink);
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Settings a() {
            return Http2Connection.d();
        }

        private Companion() {
        }
    }

    public static abstract class Listener {
        public static final Companion a = new Companion(null);
        public static final Listener b = new Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1();

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private Companion() {
            }
        }

        public void a(Http2Connection connection, Settings settings) {
            t.g(connection, "connection");
            t.g(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    public final class ReaderRunnable implements Http2Reader.Handler, a {
        public final Http2Reader a;
        public final /* synthetic */ Http2Connection b;

        public ReaderRunnable(Http2Connection this$0, Http2Reader reader) {
            t.g(this$0, "this$0");
            t.g(reader, "reader");
            this.b = this$0;
            this.a = reader;
        }

        public void a(boolean z, Settings settings) {
            t.g(settings, "settings");
            Http2Connection.r(this.b).i(new Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(t.o(this.b.E(), " applyAndAckSettings"), true, this, z, settings), 0L);
        }

        public void ackSettings() {
        }

        public void b(int i, ErrorCode errorCode, h debugData) {
            int i2;
            Object[] array;
            t.g(errorCode, "errorCode");
            t.g(debugData, "debugData");
            debugData.size();
            Http2Connection http2Connection = this.b;
            synchronized (http2Connection) {
                i2 = 0;
                array = http2Connection.R().values().toArray(new Http2Stream[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                Http2Connection.y(http2Connection, true);
                I i3 = I.a;
            }
            Http2Stream[] http2StreamArr = (Http2Stream[]) array;
            int length = http2StreamArr.length;
            while (i2 < length) {
                Http2Stream http2Stream = http2StreamArr[i2];
                i2++;
                if (http2Stream.j() > i && http2Stream.t()) {
                    http2Stream.y(ErrorCode.REFUSED_STREAM);
                    this.b.g0(http2Stream.j());
                }
            }
        }

        public void c(boolean z, int i, g source, int i2) {
            t.g(source, "source");
            if (this.b.f0(i)) {
                this.b.a0(i, source, i2, z);
                return;
            }
            Http2Stream P = this.b.P(i);
            if (P == null) {
                this.b.y0(i, ErrorCode.PROTOCOL_ERROR);
                long j = i2;
                this.b.r0(j);
                source.skip(j);
                return;
            }
            P.w(source, i2);
            if (z) {
                P.x(Util.b, true);
            }
        }

        public void e(int i, ErrorCode errorCode) {
            t.g(errorCode, "errorCode");
            if (this.b.f0(i)) {
                this.b.d0(i, errorCode);
                return;
            }
            Http2Stream g0 = this.b.g0(i);
            if (g0 == null) {
                return;
            }
            g0.y(errorCode);
        }

        public final void f(boolean z, Settings settings) {
            long c;
            int i;
            Http2Stream[] http2StreamArr;
            t.g(settings, "settings");
            O o = new O();
            Http2Writer W = this.b.W();
            Http2Connection http2Connection = this.b;
            synchronized (W) {
                synchronized (http2Connection) {
                    try {
                        Settings N = http2Connection.N();
                        if (!z) {
                            Settings settings2 = new Settings();
                            settings2.g(N);
                            settings2.g(settings);
                            settings = settings2;
                        }
                        o.a = settings;
                        c = settings.c() - N.c();
                        i = 0;
                        if (c == 0 || http2Connection.R().isEmpty()) {
                            http2StreamArr = null;
                        } else {
                            Object[] array = http2Connection.R().values().toArray(new Http2Stream[0]);
                            if (array == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            }
                            http2StreamArr = (Http2Stream[]) array;
                        }
                        http2Connection.l0((Settings) o.a);
                        Http2Connection.m(http2Connection).i(new Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1(t.o(http2Connection.E(), " onSettings"), true, http2Connection, o), 0L);
                        I i2 = I.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.W().a((Settings) o.a);
                } catch (IOException e) {
                    Http2Connection.a(http2Connection, e);
                }
                I i3 = I.a;
            }
            if (http2StreamArr != null) {
                int length = http2StreamArr.length;
                while (i < length) {
                    Http2Stream http2Stream = http2StreamArr[i];
                    i++;
                    synchronized (http2Stream) {
                        http2Stream.a(c);
                        I i4 = I.a;
                    }
                }
            }
        }

        public void g() {
            Closeable closeable;
            Closeable closeable2 = ErrorCode.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    this.a.c(this);
                    while (this.a.b(false, this)) {
                    }
                    Closeable closeable3 = ErrorCode.NO_ERROR;
                    try {
                        this.b.A(closeable3, ErrorCode.CANCEL, null);
                        closeable = closeable3;
                    } catch (IOException e2) {
                        e = e2;
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        Http2Connection http2Connection = this.b;
                        http2Connection.A(errorCode, errorCode, e);
                        closeable = http2Connection;
                        closeable2 = this.a;
                        Util.m(closeable2);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.b.A(closeable, closeable2, e);
                    Util.m(this.a);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
                closeable = closeable2;
                this.b.A(closeable, closeable2, e);
                Util.m(this.a);
                throw th;
            }
            closeable2 = this.a;
            Util.m(closeable2);
        }

        public void headers(boolean z, int i, int i2, List headerBlock) {
            t.g(headerBlock, "headerBlock");
            if (this.b.f0(i)) {
                this.b.b0(i, headerBlock, z);
                return;
            }
            Http2Connection http2Connection = this.b;
            synchronized (http2Connection) {
                Http2Stream P = http2Connection.P(i);
                if (P != null) {
                    I i3 = I.a;
                    P.x(Util.Q(headerBlock), z);
                    return;
                }
                if (Http2Connection.s(http2Connection)) {
                    return;
                }
                if (i <= http2Connection.G()) {
                    return;
                }
                if (i % 2 == http2Connection.L() % 2) {
                    return;
                }
                Http2Stream http2Stream = new Http2Stream(i, http2Connection, false, z, Util.Q(headerBlock));
                http2Connection.j0(i);
                http2Connection.R().put(Integer.valueOf(i), http2Stream);
                Http2Connection.o(http2Connection).i().i(new Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1(http2Connection.E() + '[' + i + "] onStream", true, http2Connection, http2Stream), 0L);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            g();
            return I.a;
        }

        public void ping(boolean z, int i, int i2) {
            if (!z) {
                Http2Connection.r(this.b).i(new Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1(t.o(this.b.E(), " ping"), true, this.b, i, i2), 0L);
                return;
            }
            Http2Connection http2Connection = this.b;
            synchronized (http2Connection) {
                try {
                    if (i == 1) {
                        Http2Connection.x(http2Connection, Http2Connection.h(http2Connection) + 1);
                    } else if (i != 2) {
                        if (i == 3) {
                            Http2Connection.t(http2Connection, Http2Connection.b(http2Connection) + 1);
                            http2Connection.notifyAll();
                        }
                        I i3 = I.a;
                    } else {
                        Http2Connection.u(http2Connection, Http2Connection.f(http2Connection) + 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void priority(int i, int i2, int i3, boolean z) {
        }

        public void pushPromise(int i, int i2, List requestHeaders) {
            t.g(requestHeaders, "requestHeaders");
            this.b.c0(i2, requestHeaders);
        }

        public void windowUpdate(int i, long j) {
            if (i == 0) {
                Http2Connection http2Connection = this.b;
                synchronized (http2Connection) {
                    Http2Connection.z(http2Connection, http2Connection.T() + j);
                    http2Connection.notifyAll();
                    I i2 = I.a;
                }
                return;
            }
            Http2Stream P = this.b.P(i);
            if (P != null) {
                synchronized (P) {
                    P.a(j);
                    I i3 = I.a;
                }
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.h(7, 65535);
        settings.h(5, 16384);
        D = settings;
    }

    public Http2Connection(Builder builder) {
        t.g(builder, "builder");
        boolean b = builder.b();
        this.a = b;
        this.b = builder.d();
        this.c = new LinkedHashMap();
        String c = builder.c();
        this.d = c;
        this.f = builder.b() ? 3 : 2;
        TaskRunner j = builder.j();
        this.h = j;
        TaskQueue i = j.i();
        this.i = i;
        this.j = j.i();
        this.k = j.i();
        this.l = builder.f();
        Settings settings = new Settings();
        if (builder.b()) {
            settings.h(7, 16777216);
        }
        this.s = settings;
        this.t = D;
        this.x = r2.c();
        this.y = builder.h();
        this.z = new Http2Writer(builder.g(), b);
        this.A = new ReaderRunnable(this, new Http2Reader(builder.i(), b));
        this.B = new LinkedHashSet();
        if (builder.e() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            i.i(new Http2Connection$special$$inlined$schedule$1(t.o(c, " ping"), this, nanos), nanos);
        }
    }

    public static final /* synthetic */ void a(Http2Connection http2Connection, IOException iOException) {
        http2Connection.B(iOException);
    }

    public static final /* synthetic */ long b(Http2Connection http2Connection) {
        return http2Connection.q;
    }

    public static final /* synthetic */ Set c(Http2Connection http2Connection) {
        return http2Connection.B;
    }

    public static final /* synthetic */ Settings d() {
        return D;
    }

    public static final /* synthetic */ long f(Http2Connection http2Connection) {
        return http2Connection.p;
    }

    public static final /* synthetic */ long g(Http2Connection http2Connection) {
        return http2Connection.m;
    }

    public static final /* synthetic */ long h(Http2Connection http2Connection) {
        return http2Connection.n;
    }

    public static final /* synthetic */ PushObserver k(Http2Connection http2Connection) {
        return http2Connection.l;
    }

    public static final /* synthetic */ TaskQueue m(Http2Connection http2Connection) {
        return http2Connection.k;
    }

    public static final /* synthetic */ TaskRunner o(Http2Connection http2Connection) {
        return http2Connection.h;
    }

    public static /* synthetic */ void q0(Http2Connection http2Connection, boolean z, TaskRunner taskRunner, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            taskRunner = TaskRunner.i;
        }
        http2Connection.p0(z, taskRunner);
    }

    public static final /* synthetic */ TaskQueue r(Http2Connection http2Connection) {
        return http2Connection.i;
    }

    public static final /* synthetic */ boolean s(Http2Connection http2Connection) {
        return http2Connection.g;
    }

    public static final /* synthetic */ void t(Http2Connection http2Connection, long j) {
        http2Connection.q = j;
    }

    public static final /* synthetic */ void u(Http2Connection http2Connection, long j) {
        http2Connection.p = j;
    }

    public static final /* synthetic */ void v(Http2Connection http2Connection, long j) {
        http2Connection.m = j;
    }

    public static final /* synthetic */ void x(Http2Connection http2Connection, long j) {
        http2Connection.n = j;
    }

    public static final /* synthetic */ void y(Http2Connection http2Connection, boolean z) {
        http2Connection.g = z;
    }

    public static final /* synthetic */ void z(Http2Connection http2Connection, long j) {
        http2Connection.x = j;
    }

    public final void A(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i;
        Object[] objArr;
        t.g(connectionCode, "connectionCode");
        t.g(streamCode, "streamCode");
        if (Util.h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            n0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (R().isEmpty()) {
                    objArr = null;
                } else {
                    objArr = R().values().toArray(new Http2Stream[0]);
                    if (objArr == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    R().clear();
                }
                I i2 = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            W().close();
        } catch (IOException unused3) {
        }
        try {
            O().close();
        } catch (IOException unused4) {
        }
        this.i.o();
        this.j.o();
        this.k.o();
    }

    public final void B(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        A(errorCode, errorCode, iOException);
    }

    public final boolean C() {
        return this.a;
    }

    public final String E() {
        return this.d;
    }

    public final int G() {
        return this.e;
    }

    public final Listener J() {
        return this.b;
    }

    public final int L() {
        return this.f;
    }

    public final Settings M() {
        return this.s;
    }

    public final Settings N() {
        return this.t;
    }

    public final Socket O() {
        return this.y;
    }

    public final synchronized Http2Stream P(int i) {
        return (Http2Stream) this.c.get(Integer.valueOf(i));
    }

    public final Map R() {
        return this.c;
    }

    public final long T() {
        return this.x;
    }

    public final long V() {
        return this.w;
    }

    public final Http2Writer W() {
        return this.z;
    }

    public final synchronized boolean X(long j) {
        if (this.g) {
            return false;
        }
        if (this.p < this.o) {
            if (j >= this.r) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream Y(int i, List list, boolean z) {
        int L;
        Http2Stream http2Stream;
        boolean z2 = true;
        boolean z3 = !z;
        synchronized (this.z) {
            try {
                synchronized (this) {
                    try {
                        if (L() > 1073741823) {
                            n0(ErrorCode.REFUSED_STREAM);
                        }
                        if (this.g) {
                            throw new ConnectionShutdownException();
                        }
                        L = L();
                        k0(L() + 2);
                        http2Stream = new Http2Stream(L, this, z3, false, null);
                        if (z && V() < T() && http2Stream.r() < http2Stream.q()) {
                            z2 = false;
                        }
                        if (http2Stream.u()) {
                            R().put(Integer.valueOf(L), http2Stream);
                        }
                        I i2 = I.a;
                    } finally {
                    }
                }
                if (i == 0) {
                    W().h(z3, L, list);
                } else {
                    if (C()) {
                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                    }
                    W().o(i, L, list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2) {
            this.z.flush();
        }
        return http2Stream;
    }

    public final Http2Stream Z(List requestHeaders, boolean z) {
        t.g(requestHeaders, "requestHeaders");
        return Y(0, requestHeaders, z);
    }

    public final void a0(int i, g source, int i2, boolean z) {
        t.g(source, "source");
        e eVar = new e();
        long j = i2;
        source.require(j);
        source.F(eVar, j);
        this.j.i(new Http2Connection$pushDataLater$$inlined$execute$default$1(this.d + '[' + i + "] onData", true, this, i, eVar, i2, z), 0L);
    }

    public final void b0(int i, List requestHeaders, boolean z) {
        t.g(requestHeaders, "requestHeaders");
        this.j.i(new Http2Connection$pushHeadersLater$$inlined$execute$default$1(this.d + '[' + i + "] onHeaders", true, this, i, requestHeaders, z), 0L);
    }

    public final void c0(int i, List requestHeaders) {
        t.g(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i))) {
                y0(i, ErrorCode.PROTOCOL_ERROR);
                return;
            }
            this.B.add(Integer.valueOf(i));
            this.j.i(new Http2Connection$pushRequestLater$$inlined$execute$default$1(this.d + '[' + i + "] onRequest", true, this, i, requestHeaders), 0L);
        }
    }

    public void close() {
        A(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final void d0(int i, ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        this.j.i(new Http2Connection$pushResetLater$$inlined$execute$default$1(this.d + '[' + i + "] onReset", true, this, i, errorCode), 0L);
    }

    public final boolean f0(int i) {
        return i != 0 && (i & 1) == 0;
    }

    public final void flush() {
        this.z.flush();
    }

    public final synchronized Http2Stream g0(int i) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return http2Stream;
    }

    public final void i0() {
        synchronized (this) {
            long j = this.p;
            long j2 = this.o;
            if (j < j2) {
                return;
            }
            this.o = j2 + 1;
            this.r = System.nanoTime() + 1000000000;
            I i = I.a;
            this.i.i(new Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(t.o(this.d, " ping"), true, this), 0L);
        }
    }

    public final void j0(int i) {
        this.e = i;
    }

    public final void k0(int i) {
        this.f = i;
    }

    public final void l0(Settings settings) {
        t.g(settings, "<set-?>");
        this.t = settings;
    }

    public final void n0(ErrorCode statusCode) {
        t.g(statusCode, "statusCode");
        synchronized (this.z) {
            M m = new M();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                m.a = G();
                I i = I.a;
                W().g(m.a, statusCode, Util.a);
            }
        }
    }

    public final void p0(boolean z, TaskRunner taskRunner) {
        t.g(taskRunner, "taskRunner");
        if (z) {
            this.z.b();
            this.z.s(this.s);
            if (this.s.c() != 65535) {
                this.z.t(0, r5 - 65535);
            }
        }
        taskRunner.i().i(new TaskQueue$execute$1(this.d, true, this.A), 0L);
    }

    public final synchronized void r0(long j) {
        long j2 = this.u + j;
        this.u = j2;
        long j3 = j2 - this.v;
        if (j3 >= this.s.c() / 2) {
            z0(0, j3);
            this.v += j3;
        }
    }

    public final void t0(int i, boolean z, e eVar, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.z.c(z, i, eVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (V() >= T()) {
                    try {
                        try {
                            if (!R().containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                min = Math.min((int) Math.min(j, T() - V()), W().k());
                j2 = min;
                this.w = V() + j2;
                I i2 = I.a;
            }
            j -= j2;
            this.z.c(z && j == 0, i, eVar, min);
        }
    }

    public final void u0(int i, boolean z, List alternating) {
        t.g(alternating, "alternating");
        this.z.h(z, i, alternating);
    }

    public final void w0(boolean z, int i, int i2) {
        try {
            this.z.m(z, i, i2);
        } catch (IOException e) {
            B(e);
        }
    }

    public final void x0(int i, ErrorCode statusCode) {
        t.g(statusCode, "statusCode");
        this.z.r(i, statusCode);
    }

    public final void y0(int i, ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        this.i.i(new Http2Connection$writeSynResetLater$$inlined$execute$default$1(this.d + '[' + i + "] writeSynReset", true, this, i, errorCode), 0L);
    }

    public final void z0(int i, long j) {
        this.i.i(new Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(this.d + '[' + i + "] windowUpdate", true, this, i, j), 0L);
    }
}
