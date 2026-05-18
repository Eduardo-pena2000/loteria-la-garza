package okhttp3;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import xb.A;
import xb.L;
import xb.M;
import xb.e;
import xb.g;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MultipartReader implements Closeable {
    public static final Companion e = new Companion(null);
    public static final A f;
    public final g a;
    public final h b;
    public boolean c;
    public PartSource d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Part implements Closeable {
        public final g a;

        public void close() {
            this.a.close();
        }
    }

    public final class PartSource implements L {
        public final M a;
        public final /* synthetic */ MultipartReader b;

        public long F(e sink, long j) {
            t.g(sink, "sink");
            if (j < 0) {
                throw new IllegalArgumentException(t.o("byteCount < 0: ", Long.valueOf(j)).toString());
            }
            if (!t.c(MultipartReader.b(this.b), this)) {
                throw new IllegalStateException("closed");
            }
            M timeout = MultipartReader.c(this.b).timeout();
            M m = this.a;
            MultipartReader multipartReader = this.b;
            long h = timeout.h();
            long a = M.d.a(m.h(), timeout.h());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.g(a, timeUnit);
            if (!timeout.e()) {
                if (m.e()) {
                    timeout.d(m.c());
                }
                try {
                    long a2 = MultipartReader.a(multipartReader, j);
                    long F = a2 == 0 ? -1L : MultipartReader.c(multipartReader).F(sink, a2);
                    timeout.g(h, timeUnit);
                    if (m.e()) {
                        timeout.a();
                    }
                    return F;
                } catch (Throwable th) {
                    timeout.g(h, TimeUnit.NANOSECONDS);
                    if (m.e()) {
                        timeout.a();
                    }
                    throw th;
                }
            }
            long c = timeout.c();
            if (m.e()) {
                timeout.d(Math.min(timeout.c(), m.c()));
            }
            try {
                long a3 = MultipartReader.a(multipartReader, j);
                long F2 = a3 == 0 ? -1L : MultipartReader.c(multipartReader).F(sink, a3);
                timeout.g(h, timeUnit);
                if (m.e()) {
                    timeout.d(c);
                }
                return F2;
            } catch (Throwable th2) {
                timeout.g(h, TimeUnit.NANOSECONDS);
                if (m.e()) {
                    timeout.d(c);
                }
                throw th2;
            }
        }

        public void close() {
            if (t.c(MultipartReader.b(this.b), this)) {
                MultipartReader.d(this.b, null);
            }
        }

        public M timeout() {
            return this.a;
        }
    }

    static {
        A.a aVar = A.c;
        h.a aVar2 = h.d;
        f = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    public static final /* synthetic */ long a(MultipartReader multipartReader, long j) {
        return multipartReader.f(j);
    }

    public static final /* synthetic */ PartSource b(MultipartReader multipartReader) {
        return multipartReader.d;
    }

    public static final /* synthetic */ g c(MultipartReader multipartReader) {
        return multipartReader.a;
    }

    public static final /* synthetic */ void d(MultipartReader multipartReader, PartSource partSource) {
        multipartReader.d = partSource;
    }

    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.d = null;
        this.a.close();
    }

    public final long f(long j) {
        this.a.require(this.b.size());
        long m = this.a.getBuffer().m(this.b);
        return m == -1 ? Math.min(j, (this.a.getBuffer().A() - this.b.size()) + 1) : Math.min(j, m);
    }
}
