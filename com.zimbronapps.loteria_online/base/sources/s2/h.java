package S2;

import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h implements d {
    public final Thread a;
    public final f[] e;
    public final g[] f;
    public int g;
    public int h;
    public f i;
    public e j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public class a extends Thread {
        public a(String str) {
            super(str);
        }

        public void run() {
            h.g(h.this);
        }
    }

    public h(f[] fVarArr, g[] gVarArr) {
        this.e = fVarArr;
        this.g = fVarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = i();
        }
        this.f = gVarArr;
        this.h = gVarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.a = aVar;
        aVar.start();
    }

    public static /* synthetic */ void g(h hVar) {
        hVar.v();
    }

    public final void d(long j) {
        synchronized (this.b) {
            try {
                P2.a.f(this.g == this.e.length || this.k);
                this.n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(f fVar) {
        synchronized (this.b) {
            r();
            P2.a.a(fVar == this.i);
            this.c.addLast(fVar);
            q();
            this.i = null;
        }
    }

    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                f fVar = this.i;
                if (fVar != null) {
                    s(fVar);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    s((f) this.c.removeFirst());
                }
                while (!this.d.isEmpty()) {
                    ((g) this.d.removeFirst()).o();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        return !this.c.isEmpty() && this.h > 0;
    }

    public abstract f i();

    public abstract g j();

    public abstract e k(Throwable th);

    public abstract e l(f fVar, g gVar, boolean z);

    public final boolean m() {
        e k;
        synchronized (this.b) {
            while (!this.l && !h()) {
                try {
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            f fVar = (f) this.c.removeFirst();
            g[] gVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            g gVar = gVarArr[i];
            boolean z = this.k;
            this.k = false;
            if (fVar.i()) {
                gVar.e(4);
            } else {
                gVar.b = fVar.f;
                if (fVar.k()) {
                    gVar.e(134217728);
                }
                if (!p(fVar.f)) {
                    gVar.d = true;
                }
                try {
                    k = l(fVar, gVar, z);
                } catch (RuntimeException e) {
                    k = k(e);
                } catch (OutOfMemoryError e2) {
                    k = k(e2);
                }
                if (k != null) {
                    synchronized (this.b) {
                        this.j = k;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        gVar.o();
                    } else if (gVar.d) {
                        this.m++;
                        gVar.o();
                    } else {
                        gVar.c = this.m;
                        this.m = 0;
                        this.d.addLast(gVar);
                    }
                    s(fVar);
                } finally {
                }
            }
            return true;
        }
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final f e() {
        f fVar;
        synchronized (this.b) {
            r();
            P2.a.f(this.i == null);
            int i = this.g;
            if (i == 0) {
                fVar = null;
            } else {
                f[] fVarArr = this.e;
                int i2 = i - 1;
                this.g = i2;
                fVar = fVarArr[i2];
            }
            this.i = fVar;
        }
        return fVar;
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final g a() {
        synchronized (this.b) {
            try {
                r();
                if (this.d.isEmpty()) {
                    return null;
                }
                return (g) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(long j) {
        boolean z;
        synchronized (this.b) {
            long j2 = this.n;
            z = j2 == -9223372036854775807L || j >= j2;
        }
        return z;
    }

    public final void q() {
        if (h()) {
            this.b.notify();
        }
    }

    public final void r() {
        e eVar = this.j;
        if (eVar != null) {
            throw eVar;
        }
    }

    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final void s(f fVar) {
        fVar.f();
        f[] fVarArr = this.e;
        int i = this.g;
        this.g = i + 1;
        fVarArr[i] = fVar;
    }

    public void t(g gVar) {
        synchronized (this.b) {
            u(gVar);
            q();
        }
    }

    public final void u(g gVar) {
        gVar.f();
        g[] gVarArr = this.f;
        int i = this.h;
        this.h = i + 1;
        gVarArr[i] = gVar;
    }

    public final void v() {
        do {
            try {
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        } while (m());
    }

    public final void w(int i) {
        P2.a.f(this.g == this.e.length);
        for (f fVar : this.e) {
            fVar.p(i);
        }
    }
}
