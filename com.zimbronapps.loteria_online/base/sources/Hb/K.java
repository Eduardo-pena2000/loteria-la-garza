package hb;

import cb.V;
import cb.Y;
import cb.g0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class k extends cb.K implements Y {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(k.class, "runningWorkers$volatile");
    public final /* synthetic */ Y b;
    public final cb.K c;
    public final int d;
    public final String e;
    public final p f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final class a implements Runnable {
        public Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.a.run();
                } catch (Throwable th) {
                    cb.M.a(Ga.j.a, th);
                }
                Runnable G = k.G(k.this);
                if (G == null) {
                    return;
                }
                this.a = G;
                i++;
                if (i >= 16 && k.E(k.this).z(k.this)) {
                    k.E(k.this).x(k.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(cb.K k, int i, String str) {
        Y y = k instanceof Y ? (Y) k : null;
        this.b = y == null ? V.a() : y;
        this.c = k;
        this.d = i;
        this.e = str;
        this.f = new p(false);
        this.g = new Object();
    }

    public static final /* synthetic */ cb.K E(k kVar) {
        return kVar.c;
    }

    public static final /* synthetic */ Runnable G(k kVar) {
        return kVar.L();
    }

    public static final /* synthetic */ AtomicIntegerFieldUpdater J() {
        return h;
    }

    public cb.K B(int i, String str) {
        l.a(i);
        return i >= this.d ? l.b(this, str) : super.B(i, str);
    }

    public final Runnable L() {
        while (true) {
            Runnable runnable = (Runnable) this.f.e();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                J().decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                J().incrementAndGet(this);
            }
        }
    }

    public final boolean M() {
        synchronized (this.g) {
            if (J().get(this) >= this.d) {
                return false;
            }
            J().incrementAndGet(this);
            return true;
        }
    }

    public void m(long j, cb.n nVar) {
        this.b.m(j, nVar);
    }

    public String toString() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        return this.c + ".limitedParallelism(" + this.d + ')';
    }

    public g0 v(long j, Runnable runnable, Ga.i iVar) {
        return this.b.v(j, runnable, iVar);
    }

    public void x(Ga.i iVar, Runnable runnable) {
        Runnable L;
        this.f.a(runnable);
        if (J().get(this) >= this.d || !M() || (L = L()) == null) {
            return;
        }
        this.c.x(this, new a(L));
    }

    public void y(Ga.i iVar, Runnable runnable) {
        Runnable L;
        this.f.a(runnable);
        if (J().get(this) >= this.d || !M() || (L = L()) == null) {
            return;
        }
        this.c.y(this, new a(L));
    }
}
