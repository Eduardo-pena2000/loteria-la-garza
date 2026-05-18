package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import xb.e;
import xb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Writer implements Closeable {
    public static final Companion g = new Companion(null);
    public static final Logger h = Logger.getLogger(Http2.class.getName());
    public final f a;
    public final boolean b;
    public final e c;
    public int d;
    public boolean e;
    public final Hpack.Writer f;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public Http2Writer(f sink, boolean z) {
        t.g(sink, "sink");
        this.a = sink;
        this.b = z;
        e eVar = new e();
        this.c = eVar;
        this.d = 16384;
        this.f = new Hpack.Writer(0, false, eVar, 3, null);
    }

    public final synchronized void a(Settings peerSettings) {
        try {
            t.g(peerSettings, "peerSettings");
            if (this.e) {
                throw new IOException("closed");
            }
            this.d = peerSettings.e(this.d);
            if (peerSettings.b() != -1) {
                this.f.e(peerSettings.b());
            }
            f(0, 0, 4, 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.e) {
                throw new IOException("closed");
            }
            if (this.b) {
                Logger logger = h;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.t(t.o(">> CONNECTION ", Http2.b.l()), new Object[0]));
                }
                this.a.m0(Http2.b);
                this.a.flush();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, e eVar, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        d(i, z ? 1 : 0, eVar, i2);
    }

    public synchronized void close() {
        this.e = true;
        this.a.close();
    }

    public final void d(int i, int i2, e eVar, int i3) {
        f(i, i3, 0, i2);
        if (i3 > 0) {
            f fVar = this.a;
            t.d(eVar);
            fVar.j1(eVar, i3);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        Logger logger = h;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(Http2.a.c(false, i, i2, i3, i4));
        }
        if (i2 > this.d) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.d + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(t.o("reserved bit set: ", Integer.valueOf(i)).toString());
        }
        Util.c0(this.a, i2);
        this.a.writeByte(i3 & 255);
        this.a.writeByte(i4 & 255);
        this.a.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void flush() {
        if (this.e) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void g(int i, ErrorCode errorCode, byte[] debugData) {
        try {
            t.g(errorCode, "errorCode");
            t.g(debugData, "debugData");
            if (this.e) {
                throw new IOException("closed");
            }
            if (errorCode.b() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            f(0, debugData.length + 8, 7, 0);
            this.a.writeInt(i);
            this.a.writeInt(errorCode.b());
            if (!(debugData.length == 0)) {
                this.a.write(debugData);
            }
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void h(boolean z, int i, List headerBlock) {
        t.g(headerBlock, "headerBlock");
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(headerBlock);
        long A = this.c.A();
        long min = Math.min(this.d, A);
        int i2 = A == min ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        f(i, (int) min, 1, i2);
        this.a.j1(this.c, min);
        if (A > min) {
            u(i, A - min);
        }
    }

    public final int k() {
        return this.d;
    }

    public final synchronized void m(boolean z, int i, int i2) {
        if (this.e) {
            throw new IOException("closed");
        }
        f(0, 8, 6, z ? 1 : 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public final synchronized void o(int i, int i2, List requestHeaders) {
        t.g(requestHeaders, "requestHeaders");
        if (this.e) {
            throw new IOException("closed");
        }
        this.f.g(requestHeaders);
        long A = this.c.A();
        int min = (int) Math.min(this.d - 4, A);
        long j = min;
        f(i, min + 4, 5, A == j ? 4 : 0);
        this.a.writeInt(i2 & Integer.MAX_VALUE);
        this.a.j1(this.c, j);
        if (A > j) {
            u(i, A - j);
        }
    }

    public final synchronized void r(int i, ErrorCode errorCode) {
        t.g(errorCode, "errorCode");
        if (this.e) {
            throw new IOException("closed");
        }
        if (errorCode.b() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        f(i, 4, 3, 0);
        this.a.writeInt(errorCode.b());
        this.a.flush();
    }

    public final synchronized void s(Settings settings) {
        try {
            t.g(settings, "settings");
            if (this.e) {
                throw new IOException("closed");
            }
            int i = 0;
            f(0, settings.i() * 6, 4, 0);
            while (i < 10) {
                int i2 = i + 1;
                if (settings.f(i)) {
                    this.a.writeShort(i != 4 ? i != 7 ? i : 4 : 3);
                    this.a.writeInt(settings.a(i));
                }
                i = i2;
            }
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void t(int i, long j) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(t.o("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ", Long.valueOf(j)).toString());
        }
        f(i, 4, 8, 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }

    public final void u(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.d, j);
            j -= min;
            f(i, (int) min, 9, j == 0 ? 4 : 0);
            this.a.j1(this.c, min);
        }
    }
}
