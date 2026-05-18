package androidx.lifecycle;

import androidx.lifecycle.k;
import java.util.Map;
import s.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final Object k = new Object();
    public final Object a = new Object();
    public s.b b = new s.b();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (y.this.a) {
                obj = y.this.f;
                y.this.f = y.k;
            }
            y.this.n(obj);
        }
    }

    public class b extends d {
        public b(B b) {
            super(b);
        }

        public boolean e() {
            return true;
        }
    }

    public class c extends d implements o {
        public final r e;

        public c(r rVar, B b) {
            super(b);
            this.e = rVar;
        }

        public void c() {
            this.e.getLifecycle().removeObserver(this);
        }

        public boolean d(r rVar) {
            return this.e == rVar;
        }

        public boolean e() {
            return this.e.getLifecycle().getCurrentState().b(k.b.d);
        }

        public void onStateChanged(r rVar, k.a aVar) {
            k.b currentState = this.e.getLifecycle().getCurrentState();
            if (currentState == k.b.a) {
                y.this.m(this.a);
                return;
            }
            k.b bVar = null;
            while (bVar != currentState) {
                b(e());
                bVar = currentState;
                currentState = this.e.getLifecycle().getCurrentState();
            }
        }
    }

    public abstract class d {
        public final B a;
        public boolean b;
        public int c = -1;

        public d(B b) {
            this.a = b;
        }

        public void b(boolean z) {
            if (z == this.b) {
                return;
            }
            this.b = z;
            y.this.c(z ? 1 : -1);
            if (this.b) {
                y.this.e(this);
            }
        }

        public void c() {
        }

        public boolean d(r rVar) {
            return false;
        }

        public abstract boolean e();
    }

    public y() {
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }

    public static void b(String str) {
        if (r.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public void c(int i) {
        int i2 = this.c;
        this.c = i + i2;
        if (this.d) {
            return;
        }
        this.d = true;
        while (true) {
            try {
                int i3 = this.c;
                if (i2 == i3) {
                    this.d = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    j();
                } else if (z2) {
                    k();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        }
    }

    public final void d(d dVar) {
        if (dVar.b) {
            if (!dVar.e()) {
                dVar.b(false);
                return;
            }
            int i = dVar.c;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            dVar.c = i2;
            dVar.a.a(this.e);
        }
    }

    public void e(d dVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                b.d c2 = this.b.c();
                while (c2.hasNext()) {
                    d((d) ((Map.Entry) c2.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public Object f() {
        Object obj = this.e;
        if (obj != k) {
            return obj;
        }
        return null;
    }

    public boolean g() {
        return this.c > 0;
    }

    public void h(r rVar, B b2) {
        b("observe");
        if (rVar.getLifecycle().getCurrentState() == k.b.a) {
            return;
        }
        c cVar = new c(rVar, b2);
        d dVar = (d) this.b.g(b2, cVar);
        if (dVar != null && !dVar.d(rVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        rVar.getLifecycle().addObserver(cVar);
    }

    public void i(B b2) {
        b("observeForever");
        b bVar = new b(b2);
        d dVar = (d) this.b.g(b2, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.b(true);
    }

    public void j() {
    }

    public void k() {
    }

    public void l(Object obj) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = obj;
        }
        if (z) {
            r.c.g().c(this.j);
        }
    }

    public void m(B b2) {
        b("removeObserver");
        d dVar = (d) this.b.h(b2);
        if (dVar == null) {
            return;
        }
        dVar.c();
        dVar.b(false);
    }

    public void n(Object obj) {
        b("setValue");
        this.g++;
        this.e = obj;
        e(null);
    }
}
