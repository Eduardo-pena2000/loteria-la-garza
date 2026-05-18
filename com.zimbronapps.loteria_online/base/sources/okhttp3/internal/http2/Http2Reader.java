package okhttp3.internal.http2;

import Wa.n;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import xb.L;
import xb.M;
import xb.e;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Reader implements Closeable {
    public static final Companion e = new Companion(null);
    public static final Logger f;
    public final g a;
    public final boolean b;
    public final ContinuationSource c;
    public final Hpack.Reader d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Logger a() {
            return Http2Reader.a();
        }

        public final int b(int i, int i2, int i3) {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            throw new IOException("PROTOCOL_ERROR padding " + i3 + " > remaining length " + i);
        }

        private Companion() {
        }
    }

    public static final class ContinuationSource implements L {
        public final g a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;

        public ContinuationSource(g source) {
            t.g(source, "source");
            this.a = source;
        }

        public long F(e sink, long j) {
            t.g(sink, "sink");
            while (true) {
                int i = this.e;
                if (i != 0) {
                    long F = this.a.F(sink, Math.min(j, i));
                    if (F == -1) {
                        return -1L;
                    }
                    this.e -= (int) F;
                    return F;
                }
                this.a.skip(this.f);
                this.f = 0;
                if ((this.c & 4) != 0) {
                    return -1L;
                }
                b();
            }
        }

        public final int a() {
            return this.e;
        }

        public final void b() {
            int i = this.d;
            int K = Util.K(this.a);
            this.e = K;
            this.b = K;
            int d = Util.d(this.a.readByte(), 255);
            this.c = Util.d(this.a.readByte(), 255);
            Companion companion = Http2Reader.e;
            if (companion.a().isLoggable(Level.FINE)) {
                companion.a().fine(Http2.a.c(true, this.d, this.b, d, this.c));
            }
            int readInt = this.a.readInt() & Integer.MAX_VALUE;
            this.d = readInt;
            if (d == 9) {
                if (readInt != i) {
                    throw new IOException("TYPE_CONTINUATION streamId changed");
                }
            } else {
                throw new IOException(d + " != TYPE_CONTINUATION");
            }
        }

        public final void c(int i) {
            this.c = i;
        }

        public void close() {
        }

        public final void d(int i) {
            this.e = i;
        }

        public final void f(int i) {
            this.b = i;
        }

        public final void g(int i) {
            this.f = i;
        }

        public final void h(int i) {
            this.d = i;
        }

        public M timeout() {
            return this.a.timeout();
        }
    }

    public interface Handler {
        void a(boolean z, Settings settings);

        void ackSettings();

        void b(int i, ErrorCode errorCode, h hVar);

        void c(boolean z, int i, g gVar, int i2);

        void e(int i, ErrorCode errorCode);

        void headers(boolean z, int i, int i2, List list);

        void ping(boolean z, int i, int i2);

        void priority(int i, int i2, int i3, boolean z);

        void pushPromise(int i, int i2, List list);

        void windowUpdate(int i, long j);
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        t.f(logger, "getLogger(Http2::class.java.name)");
        f = logger;
    }

    public Http2Reader(g source, boolean z) {
        t.g(source, "source");
        this.a = source;
        this.b = z;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.c = continuationSource;
        this.d = new Hpack.Reader(continuationSource, 4096, 0, 4, null);
    }

    public static final /* synthetic */ Logger a() {
        return f;
    }

    public final boolean b(boolean z, Handler handler) {
        t.g(handler, "handler");
        try {
            this.a.require(9L);
            int K = Util.K(this.a);
            if (K > 16384) {
                throw new IOException(t.o("FRAME_SIZE_ERROR: ", Integer.valueOf(K)));
            }
            int d = Util.d(this.a.readByte(), 255);
            int d2 = Util.d(this.a.readByte(), 255);
            int readInt = this.a.readInt() & Integer.MAX_VALUE;
            Logger logger = f;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.a.c(true, readInt, K, d, d2));
            }
            if (z && d != 4) {
                throw new IOException(t.o("Expected a SETTINGS frame but was ", Http2.a.b(d)));
            }
            switch (d) {
                case 0:
                    d(handler, K, d2, readInt);
                    return true;
                case 1:
                    h(handler, K, d2, readInt);
                    return true;
                case 2:
                    o(handler, K, d2, readInt);
                    return true;
                case 3:
                    s(handler, K, d2, readInt);
                    return true;
                case 4:
                    t(handler, K, d2, readInt);
                    return true;
                case 5:
                    r(handler, K, d2, readInt);
                    return true;
                case 6:
                    k(handler, K, d2, readInt);
                    return true;
                case 7:
                    f(handler, K, d2, readInt);
                    return true;
                case 8:
                    u(handler, K, d2, readInt);
                    return true;
                default:
                    this.a.skip(K);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void c(Handler handler) {
        t.g(handler, "handler");
        if (this.b) {
            if (!b(true, handler)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            return;
        }
        g gVar = this.a;
        h hVar = Http2.b;
        h readByteString = gVar.readByteString(hVar.size());
        Logger logger = f;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Util.t(t.o("<< CONNECTION ", readByteString.l()), new Object[0]));
        }
        if (!t.c(hVar, readByteString)) {
            throw new IOException(t.o("Expected a connection header but was ", readByteString.H()));
        }
    }

    public void close() {
        this.a.close();
    }

    public final void d(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        if ((i2 & 32) != 0) {
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        int d = (i2 & 8) != 0 ? Util.d(this.a.readByte(), 255) : 0;
        handler.c(z, i3, this.a, e.b(i, i2, d));
        this.a.skip(d);
    }

    public final void f(Handler handler, int i, int i2, int i3) {
        if (i < 8) {
            throw new IOException(t.o("TYPE_GOAWAY length < 8: ", Integer.valueOf(i)));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int readInt = this.a.readInt();
        int readInt2 = this.a.readInt();
        int i4 = i - 8;
        ErrorCode a = ErrorCode.b.a(readInt2);
        if (a == null) {
            throw new IOException(t.o("TYPE_GOAWAY unexpected error code: ", Integer.valueOf(readInt2)));
        }
        h hVar = h.e;
        if (i4 > 0) {
            hVar = this.a.readByteString(i4);
        }
        handler.b(readInt, a, hVar);
    }

    public final List g(int i, int i2, int i3, int i4) {
        this.c.d(i);
        ContinuationSource continuationSource = this.c;
        continuationSource.f(continuationSource.a());
        this.c.g(i2);
        this.c.c(i3);
        this.c.h(i4);
        this.d.k();
        return this.d.e();
    }

    public final void h(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
        }
        boolean z = (i2 & 1) != 0;
        int d = (i2 & 8) != 0 ? Util.d(this.a.readByte(), 255) : 0;
        if ((i2 & 32) != 0) {
            m(handler, i3);
            i -= 5;
        }
        handler.headers(z, i3, -1, g(e.b(i, i2, d), d, i2, i3));
    }

    public final void k(Handler handler, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException(t.o("TYPE_PING length != 8: ", Integer.valueOf(i)));
        }
        if (i3 != 0) {
            throw new IOException("TYPE_PING streamId != 0");
        }
        handler.ping((i2 & 1) != 0, this.a.readInt(), this.a.readInt());
    }

    public final void m(Handler handler, int i) {
        int readInt = this.a.readInt();
        handler.priority(i, readInt & Integer.MAX_VALUE, Util.d(this.a.readByte(), 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    public final void o(Handler handler, int i, int i2, int i3) {
        if (i == 5) {
            if (i3 == 0) {
                throw new IOException("TYPE_PRIORITY streamId == 0");
            }
            m(handler, i3);
        } else {
            throw new IOException("TYPE_PRIORITY length: " + i + " != 5");
        }
    }

    public final void r(Handler handler, int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
        }
        int d = (i2 & 8) != 0 ? Util.d(this.a.readByte(), 255) : 0;
        handler.pushPromise(i3, this.a.readInt() & Integer.MAX_VALUE, g(e.b(i - 4, i2, d), d, i2, i3));
    }

    public final void s(Handler handler, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException("TYPE_RST_STREAM length: " + i + " != 4");
        }
        if (i3 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int readInt = this.a.readInt();
        ErrorCode a = ErrorCode.b.a(readInt);
        if (a == null) {
            throw new IOException(t.o("TYPE_RST_STREAM unexpected error code: ", Integer.valueOf(readInt)));
        }
        handler.e(i3, a);
    }

    public final void t(Handler handler, int i, int i2, int i3) {
        int readInt;
        if (i3 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((i2 & 1) != 0) {
            if (i != 0) {
                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
            }
            handler.ackSettings();
            return;
        }
        if (i % 6 != 0) {
            throw new IOException(t.o("TYPE_SETTINGS length % 6 != 0: ", Integer.valueOf(i)));
        }
        Settings settings = new Settings();
        Wa.g v = n.v(n.w(0, i), 6);
        int f2 = v.f();
        int g = v.g();
        int h = v.h();
        if ((h > 0 && f2 <= g) || (h < 0 && g <= f2)) {
            while (true) {
                int i4 = f2 + h;
                int e2 = Util.e(this.a.readShort(), 65535);
                readInt = this.a.readInt();
                if (e2 != 2) {
                    if (e2 == 3) {
                        e2 = 4;
                    } else if (e2 != 4) {
                        if (e2 == 5 && (readInt < 16384 || readInt > 16777215)) {
                            break;
                        }
                    } else {
                        if (readInt < 0) {
                            throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                        }
                        e2 = 7;
                    }
                } else if (readInt != 0 && readInt != 1) {
                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                }
                settings.h(e2, readInt);
                if (f2 == g) {
                    break;
                } else {
                    f2 = i4;
                }
            }
            throw new IOException(t.o("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", Integer.valueOf(readInt)));
        }
        handler.a(false, settings);
    }

    public final void u(Handler handler, int i, int i2, int i3) {
        if (i != 4) {
            throw new IOException(t.o("TYPE_WINDOW_UPDATE length !=4: ", Integer.valueOf(i)));
        }
        long f2 = Util.f(this.a.readInt(), 2147483647L);
        if (f2 == 0) {
            throw new IOException("windowSizeIncrement was 0");
        }
        handler.windowUpdate(i3, f2);
    }
}
