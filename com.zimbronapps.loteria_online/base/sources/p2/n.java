package P2;

import M2.p;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final P2.c a;
    public final k b;
    public final b c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public interface a {
        void invoke(Object obj);
    }

    public interface b {
        void a(Object obj, M2.p pVar);
    }

    public static final class c {
        public final Object a;
        public p.b b = new p.b();
        public boolean c;
        public boolean d;

        public c(Object obj) {
            this.a = obj;
        }

        public void a(int i, a aVar) {
            if (this.d) {
                return;
            }
            if (i != -1) {
                this.b.a(i);
            }
            this.c = true;
            aVar.invoke(this.a);
        }

        public void b(b bVar) {
            if (this.d || !this.c) {
                return;
            }
            M2.p e = this.b.e();
            this.b = new p.b();
            this.c = false;
            bVar.a(this.a, e);
        }

        public void c(b bVar) {
            this.d = true;
            if (this.c) {
                this.c = false;
                bVar.a(this.a, this.b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.a.equals(((c) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public n(Looper looper, P2.c cVar, b bVar) {
        this(new CopyOnWriteArraySet(), looper, cVar, bVar, true);
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        h(copyOnWriteArraySet, i, aVar);
    }

    public static /* synthetic */ boolean b(n nVar, Message message) {
        return nVar.g(message);
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i, aVar);
        }
    }

    public void c(Object obj) {
        P2.a.e(obj);
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public n d(Looper looper, P2.c cVar, b bVar) {
        return new n(this.d, looper, cVar, bVar, this.i);
    }

    public n e(Looper looper, b bVar) {
        return d(looper, this.a, bVar);
    }

    public void f() {
        l();
        if (this.f.isEmpty()) {
            return;
        }
        if (!this.b.c(1)) {
            k kVar = this.b;
            kVar.b(kVar.a(1));
        }
        boolean isEmpty = this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (isEmpty) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.c);
            if (this.b.c(1)) {
                break;
            }
        }
        return true;
    }

    public void i(int i, a aVar) {
        l();
        this.f.add(new m(new CopyOnWriteArraySet(this.d), i, aVar));
    }

    public void j() {
        l();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.c);
        }
        this.d.clear();
    }

    public void k(int i, a aVar) {
        i(i, aVar);
        f();
    }

    public final void l() {
        if (this.i) {
            P2.a.f(Thread.currentThread() == this.b.g().getThread());
        }
    }

    public n(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, P2.c cVar, b bVar, boolean z) {
        this.a = cVar;
        this.d = copyOnWriteArraySet;
        this.c = bVar;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = cVar.d(looper, new l(this));
        this.i = z;
    }
}
