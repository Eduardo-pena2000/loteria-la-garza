package androidx.lifecycle;

import androidx.lifecycle.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import s.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class t extends k {
    public static final a j = new a(null);
    public final boolean a;
    public s.a b;
    public k.b c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public ArrayList h;
    public final fb.z i;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final t a(r rVar) {
            kotlin.jvm.internal.t.g(rVar, "owner");
            return new t(rVar, false, null);
        }

        public final k.b b(k.b bVar, k.b bVar2) {
            kotlin.jvm.internal.t.g(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public static final class b {
        public k.b a;
        public o b;

        public b(q qVar, k.b bVar) {
            kotlin.jvm.internal.t.g(bVar, "initialState");
            kotlin.jvm.internal.t.d(qVar);
            this.b = x.f(qVar);
            this.a = bVar;
        }

        public final void a(r rVar, k.a aVar) {
            kotlin.jvm.internal.t.g(aVar, "event");
            k.b c = aVar.c();
            this.a = t.j.b(this.a, c);
            o oVar = this.b;
            kotlin.jvm.internal.t.d(rVar);
            oVar.onStateChanged(rVar, aVar);
            this.a = c;
        }

        public final k.b b() {
            return this.a;
        }
    }

    public /* synthetic */ t(r rVar, boolean z, kotlin.jvm.internal.k kVar) {
        this(rVar, z);
    }

    public void addObserver(q qVar) {
        r rVar;
        kotlin.jvm.internal.t.g(qVar, "observer");
        e("addObserver");
        k.b bVar = this.c;
        k.b bVar2 = k.b.a;
        if (bVar != bVar2) {
            bVar2 = k.b.b;
        }
        b bVar3 = new b(qVar, bVar2);
        if (((b) this.b.g(qVar, bVar3)) == null && (rVar = (r) this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            k.b d = d(qVar);
            this.e++;
            while (bVar3.b().compareTo(d) < 0 && this.b.contains(qVar)) {
                k(bVar3.b());
                k.a b2 = k.a.Companion.b(bVar3.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(rVar, b2);
                j();
                d = d(qVar);
            }
            if (!z) {
                m();
            }
            this.e--;
        }
    }

    public final void c(r rVar) {
        Iterator descendingIterator = this.b.descendingIterator();
        kotlin.jvm.internal.t.f(descendingIterator, "descendingIterator(...)");
        while (descendingIterator.hasNext() && !this.g) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            kotlin.jvm.internal.t.d(entry);
            q qVar = (q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.c) > 0 && !this.g && this.b.contains(qVar)) {
                k.a a2 = k.a.Companion.a(bVar.b());
                if (a2 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                k(a2.c());
                bVar.a(rVar, a2);
                j();
            }
        }
    }

    public final k.b d(q qVar) {
        b bVar;
        Map.Entry i = this.b.i(qVar);
        k.b bVar2 = null;
        k.b b2 = (i == null || (bVar = (b) i.getValue()) == null) ? null : bVar.b();
        if (!this.h.isEmpty()) {
            bVar2 = (k.b) this.h.get(r0.size() - 1);
        }
        a aVar = j;
        return aVar.b(aVar.b(this.c, b2), bVar2);
    }

    public final void e(String str) {
        if (!this.a || v.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void f(r rVar) {
        b.d c = this.b.c();
        kotlin.jvm.internal.t.f(c, "iteratorWithAdditions(...)");
        while (c.hasNext() && !this.g) {
            Map.Entry entry = (Map.Entry) c.next();
            q qVar = (q) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.c) < 0 && !this.g && this.b.contains(qVar)) {
                k(bVar.b());
                k.a b2 = k.a.Companion.b(bVar.b());
                if (b2 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(rVar, b2);
                j();
            }
        }
    }

    public void g(k.a aVar) {
        kotlin.jvm.internal.t.g(aVar, "event");
        e("handleLifecycleEvent");
        i(aVar.c());
    }

    public k.b getCurrentState() {
        return this.c;
    }

    public fb.N getCurrentStateFlow() {
        return fb.g.b(this.i);
    }

    public final boolean h() {
        if (this.b.size() == 0) {
            return true;
        }
        Map.Entry a2 = this.b.a();
        kotlin.jvm.internal.t.d(a2);
        k.b b2 = ((b) a2.getValue()).b();
        Map.Entry e = this.b.e();
        kotlin.jvm.internal.t.d(e);
        k.b b3 = ((b) e.getValue()).b();
        return b2 == b3 && this.c == b3;
    }

    public final void i(k.b bVar) {
        if (this.c == bVar) {
            return;
        }
        u.a((r) this.d.get(), this.c, bVar);
        this.c = bVar;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        m();
        this.f = false;
        if (this.c == k.b.a) {
            this.b = new s.a();
        }
    }

    public final void j() {
        this.h.remove(r0.size() - 1);
    }

    public final void k(k.b bVar) {
        this.h.add(bVar);
    }

    public void l(k.b bVar) {
        kotlin.jvm.internal.t.g(bVar, "state");
        e("setCurrentState");
        i(bVar);
    }

    public final void m() {
        r rVar = (r) this.d.get();
        if (rVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!h()) {
            this.g = false;
            k.b bVar = this.c;
            Map.Entry a2 = this.b.a();
            kotlin.jvm.internal.t.d(a2);
            if (bVar.compareTo(((b) a2.getValue()).b()) < 0) {
                c(rVar);
            }
            Map.Entry e = this.b.e();
            if (!this.g && e != null && this.c.compareTo(((b) e.getValue()).b()) > 0) {
                f(rVar);
            }
        }
        this.g = false;
        this.i.setValue(getCurrentState());
    }

    public void removeObserver(q qVar) {
        kotlin.jvm.internal.t.g(qVar, "observer");
        e("removeObserver");
        this.b.h(qVar);
    }

    public t(r rVar, boolean z) {
        this.a = z;
        this.b = new s.a();
        k.b bVar = k.b.b;
        this.c = bVar;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
        this.i = fb.P.a(bVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t(r rVar) {
        this(rVar, true);
        kotlin.jvm.internal.t.g(rVar, "provider");
    }
}
