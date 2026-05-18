package xb;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class j implements Closeable {
    public final boolean a;
    public boolean b;
    public int c;
    public final ReentrantLock d = P.b();

    public static final class a implements L {
        public final j a;
        public long b;
        public boolean c;

        public a(j fileHandle, long j) {
            kotlin.jvm.internal.t.g(fileHandle, "fileHandle");
            this.a = fileHandle;
            this.b = j;
        }

        public long F(e sink, long j) {
            kotlin.jvm.internal.t.g(sink, "sink");
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            long c = j.c(this.a, this.b, sink, j);
            if (c != -1) {
                this.b += c;
            }
            return c;
        }

        public void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            ReentrantLock f = this.a.f();
            f.lock();
            try {
                j.d(this.a, j.b(r1) - 1);
                if (j.b(this.a) == 0 && j.a(this.a)) {
                    Ca.I i = Ca.I.a;
                    f.unlock();
                    this.a.g();
                }
            } finally {
                f.unlock();
            }
        }

        public M timeout() {
            return M.e;
        }
    }

    public j(boolean z) {
        this.a = z;
    }

    public static final /* synthetic */ boolean a(j jVar) {
        return jVar.b;
    }

    public static final /* synthetic */ int b(j jVar) {
        return jVar.c;
    }

    public static final /* synthetic */ long c(j jVar, long j, e eVar, long j2) {
        return jVar.m(j, eVar, j2);
    }

    public static final /* synthetic */ void d(j jVar, int i) {
        jVar.c = i;
    }

    public final void close() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                return;
            }
            this.b = true;
            if (this.c != 0) {
                return;
            }
            Ca.I i = Ca.I.a;
            reentrantLock.unlock();
            g();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final ReentrantLock f() {
        return this.d;
    }

    public abstract void g();

    public abstract int h(long j, byte[] bArr, int i, int i2);

    public abstract long k();

    public final long m(long j, e eVar, long j2) {
        if (j2 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j2).toString());
        }
        long j3 = j2 + j;
        long j4 = j;
        while (true) {
            if (j4 >= j3) {
                break;
            }
            G E = eVar.E(1);
            int h = h(j4, E.a, E.c, (int) Math.min(j3 - j4, 8192 - r7));
            if (h == -1) {
                if (E.b == E.c) {
                    eVar.a = E.b();
                    H.b(E);
                }
                if (j == j4) {
                    return -1L;
                }
            } else {
                E.c += h;
                long j5 = h;
                j4 += j5;
                eVar.z(eVar.A() + j5);
            }
        }
        return j4 - j;
    }

    public final long o() {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            Ca.I i = Ca.I.a;
            reentrantLock.unlock();
            return k();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final L r(long j) {
        ReentrantLock reentrantLock = this.d;
        reentrantLock.lock();
        try {
            if (this.b) {
                throw new IllegalStateException("closed");
            }
            this.c++;
            reentrantLock.unlock();
            return new a(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
