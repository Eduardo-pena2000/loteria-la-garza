package g3;

import M2.u;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import g3.S;
import g3.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends h {
    public static final M2.u w = new u.c().e(Uri.EMPTY).a();
    public final List k;
    public final Set l;
    public Handler m;
    public final List n;
    public final IdentityHashMap o;
    public final Map p;
    public final Set q;
    public final boolean r;
    public final boolean s;
    public boolean t;
    public Set u;
    public S v;

    public static final class b extends T2.a {
        public final int h;
        public final int i;
        public final int[] j;
        public final int[] k;
        public final M2.G[] l;
        public final Object[] m;
        public final HashMap n;

        public b(Collection collection, S s, boolean z) {
            super(z, s);
            int size = collection.size();
            this.j = new int[size];
            this.k = new int[size];
            this.l = new M2.G[size];
            this.m = new Object[size];
            this.n = new HashMap();
            Iterator it = collection.iterator();
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                e eVar = (e) it.next();
                this.l[i3] = eVar.a.Z();
                this.k[i3] = i;
                this.j[i3] = i2;
                i += this.l[i3].p();
                i2 += this.l[i3].i();
                Object[] objArr = this.m;
                Object obj = eVar.b;
                objArr[i3] = obj;
                this.n.put(obj, Integer.valueOf(i3));
                i3++;
            }
            this.h = i;
            this.i = i2;
        }

        public int A(int i) {
            return this.k[i];
        }

        public M2.G D(int i) {
            return this.l[i];
        }

        public int i() {
            return this.i;
        }

        public int p() {
            return this.h;
        }

        public int s(Object obj) {
            Integer num = (Integer) this.n.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public int t(int i) {
            return P2.K.g(this.j, i + 1, false, false);
        }

        public int u(int i) {
            return P2.K.g(this.k, i + 1, false, false);
        }

        public Object x(int i) {
            return this.m[i];
        }

        public int z(int i) {
            return this.j[i];
        }
    }

    public static final class c extends g3.a {
        public c() {
        }

        public M2.u f() {
            return l.N();
        }

        public v l(w.b bVar, k3.b bVar2, long j) {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        public void B() {
        }

        public void n() {
        }

        public void c(v vVar) {
        }

        public void z(R2.x xVar) {
        }
    }

    public static final class d {
        public final Handler a;
        public final Runnable b;

        public d(Handler handler, Runnable runnable) {
            this.a = handler;
            this.b = runnable;
        }

        public void a() {
            this.a.post(this.b);
        }
    }

    public static final class e {
        public final t a;
        public int d;
        public int e;
        public boolean f;
        public final List c = new ArrayList();
        public final Object b = new Object();

        public e(w wVar, boolean z) {
            this.a = new t(wVar, z);
        }

        public void a(int i, int i2) {
            this.d = i;
            this.e = i2;
            this.f = false;
            this.c.clear();
        }
    }

    public static final class f {
        public final int a;
        public final Object b;
        public final d c;

        public f(int i, Object obj, d dVar) {
            this.a = i;
            this.b = obj;
            this.c = dVar;
        }
    }

    public l(w... wVarArr) {
        this(false, wVarArr);
    }

    public static /* synthetic */ boolean M(l lVar, Message message) {
        return lVar.f0(message);
    }

    public static /* synthetic */ M2.u N() {
        return w;
    }

    public static Object Y(Object obj) {
        return T2.a.v(obj);
    }

    public static Object a0(Object obj) {
        return T2.a.w(obj);
    }

    public static Object b0(e eVar, Object obj) {
        return T2.a.y(eVar.b, obj);
    }

    public synchronized void B() {
        try {
            super.B();
            this.n.clear();
            this.q.clear();
            this.p.clear();
            this.v = this.v.f();
            Handler handler = this.m;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                this.m = null;
            }
            this.t = false;
            this.u.clear();
            W(this.l);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void O(int i, e eVar) {
        if (i > 0) {
            e eVar2 = (e) this.n.get(i - 1);
            eVar.a(i, eVar2.e + eVar2.a.Z().p());
        } else {
            eVar.a(i, 0);
        }
        T(i, 1, eVar.a.Z().p());
        this.n.add(i, eVar);
        this.p.put(eVar.b, eVar);
        K(eVar, eVar.a);
        if (y() && this.o.isEmpty()) {
            this.q.add(eVar);
        } else {
            D(eVar);
        }
    }

    public synchronized void P(int i, Collection collection, Handler handler, Runnable runnable) {
        S(i, collection, handler, runnable);
    }

    public synchronized void Q(Collection collection) {
        S(this.k.size(), collection, null, null);
    }

    public final void R(int i, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            O(i, (e) it.next());
            i++;
        }
    }

    public final void S(int i, Collection collection, Handler handler, Runnable runnable) {
        P2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            P2.a.e((w) it.next());
        }
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(new e((w) it2.next(), this.s));
        }
        this.k.addAll(i, arrayList);
        if (handler2 != null && !collection.isEmpty()) {
            handler2.obtainMessage(1, new f(i, arrayList, U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public final void T(int i, int i2, int i3) {
        while (i < this.n.size()) {
            e eVar = (e) this.n.get(i);
            eVar.d += i2;
            eVar.e += i3;
            i++;
        }
    }

    public final d U(Handler handler, Runnable runnable) {
        if (handler == null || runnable == null) {
            return null;
        }
        d dVar = new d(handler, runnable);
        this.l.add(dVar);
        return dVar;
    }

    public final void V() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.c.isEmpty()) {
                D(eVar);
                it.remove();
            }
        }
    }

    public final synchronized void W(Set set) {
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a();
            }
            this.l.removeAll(set);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void X(e eVar) {
        this.q.add(eVar);
        E(eVar);
    }

    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public w.b F(e eVar, w.b bVar) {
        for (int i = 0; i < eVar.c.size(); i++) {
            if (((w.b) eVar.c.get(i)).d == bVar.d) {
                return bVar.a(b0(eVar, bVar.a));
            }
        }
        return null;
    }

    public void c(v vVar) {
        e eVar = (e) P2.a.e((e) this.o.remove(vVar));
        eVar.a.c(vVar);
        eVar.c.remove(((s) vVar).a);
        if (!this.o.isEmpty()) {
            V();
        }
        g0(eVar);
    }

    public final Handler c0() {
        return (Handler) P2.a.e(this.m);
    }

    public synchronized int d0() {
        return this.k.size();
    }

    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public int H(e eVar, int i) {
        return i + eVar.e;
    }

    public M2.u f() {
        return w;
    }

    public final boolean f0(Message message) {
        switch (message.what) {
            case 1:
                f fVar = (f) P2.K.i(message.obj);
                this.v = this.v.h(fVar.a, ((Collection) fVar.b).size());
                R(fVar.a, (Collection) fVar.b);
                p0(fVar.c);
                return true;
            case 2:
                f fVar2 = (f) P2.K.i(message.obj);
                int i = fVar2.a;
                int intValue = ((Integer) fVar2.b).intValue();
                if (i == 0 && intValue == this.v.a()) {
                    this.v = this.v.f();
                } else {
                    this.v = this.v.b(i, intValue);
                }
                for (int i2 = intValue - 1; i2 >= i; i2--) {
                    l0(i2);
                }
                p0(fVar2.c);
                return true;
            case 3:
                f fVar3 = (f) P2.K.i(message.obj);
                S s = this.v;
                int i3 = fVar3.a;
                S b2 = s.b(i3, i3 + 1);
                this.v = b2;
                this.v = b2.h(((Integer) fVar3.b).intValue(), 1);
                i0(fVar3.a, ((Integer) fVar3.b).intValue());
                p0(fVar3.c);
                return true;
            case 4:
                f fVar4 = (f) P2.K.i(message.obj);
                this.v = (S) fVar4.b;
                p0(fVar4.c);
                return true;
            case 5:
                t0();
                return true;
            case 6:
                W((Set) P2.K.i(message.obj));
                return true;
            default:
                throw new IllegalStateException();
        }
    }

    public final void g0(e eVar) {
        if (eVar.f && eVar.c.isEmpty()) {
            this.q.remove(eVar);
            L(eVar);
        }
    }

    public synchronized void h0(int i, int i2, Handler handler, Runnable runnable) {
        j0(i, i2, handler, runnable);
    }

    public final void i0(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        int i3 = ((e) this.n.get(min)).e;
        List list = this.n;
        list.add(i2, (e) list.remove(i));
        while (min <= max) {
            e eVar = (e) this.n.get(min);
            eVar.d = min;
            eVar.e = i3;
            i3 += eVar.a.Z().p();
            min++;
        }
    }

    public final void j0(int i, int i2, Handler handler, Runnable runnable) {
        P2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.m;
        List list = this.k;
        list.add(i2, (e) list.remove(i));
        if (handler2 != null) {
            handler2.obtainMessage(3, new f(i, Integer.valueOf(i2), U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void J(e eVar, w wVar, M2.G g) {
        s0(eVar, g);
    }

    public v l(w.b bVar, k3.b bVar2, long j) {
        Object a0 = a0(bVar.a);
        w.b a2 = bVar.a(Y(bVar.a));
        e eVar = (e) this.p.get(a0);
        if (eVar == null) {
            eVar = new e(new c(null), this.s);
            eVar.f = true;
            K(eVar, eVar.a);
        }
        X(eVar);
        eVar.c.add(a2);
        s W = eVar.a.W(a2, bVar2, j);
        this.o.put(W, eVar);
        V();
        return W;
    }

    public final void l0(int i) {
        e eVar = (e) this.n.remove(i);
        this.p.remove(eVar.b);
        T(i, -1, -eVar.a.Z().p());
        eVar.f = true;
        g0(eVar);
    }

    public synchronized void m0(int i, int i2, Handler handler, Runnable runnable) {
        n0(i, i2, handler, runnable);
    }

    public final void n0(int i, int i2, Handler handler, Runnable runnable) {
        P2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.m;
        P2.K.V0(this.k, i, i2);
        if (handler2 != null) {
            handler2.obtainMessage(2, new f(i, Integer.valueOf(i2), U(handler, runnable))).sendToTarget();
        } else {
            if (runnable == null || handler == null) {
                return;
            }
            handler.post(runnable);
        }
    }

    public boolean o() {
        return false;
    }

    public final void o0() {
        p0(null);
    }

    public synchronized M2.G p() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return new b(this.k, this.v.a() != this.k.size() ? this.v.f().h(0, this.k.size()) : this.v, this.r);
    }

    public final void p0(d dVar) {
        if (!this.t) {
            c0().obtainMessage(5).sendToTarget();
            this.t = true;
        }
        if (dVar != null) {
            this.u.add(dVar);
        }
    }

    public final void q0(S s, Handler handler, Runnable runnable) {
        P2.a.a((handler == null) == (runnable == null));
        Handler handler2 = this.m;
        if (handler2 != null) {
            int d0 = d0();
            if (s.a() != d0) {
                s = s.f().h(0, d0);
            }
            handler2.obtainMessage(4, new f(0, s, U(handler, runnable))).sendToTarget();
            return;
        }
        if (s.a() > 0) {
            s = s.f();
        }
        this.v = s;
        if (runnable == null || handler == null) {
            return;
        }
        handler.post(runnable);
    }

    public synchronized void r0(S s) {
        q0(s, null, null);
    }

    public final void s0(e eVar, M2.G g) {
        if (eVar.d + 1 < this.n.size()) {
            int p = g.p() - (((e) this.n.get(eVar.d + 1)).e - eVar.e);
            if (p != 0) {
                T(eVar.d + 1, 0, p);
            }
        }
        o0();
    }

    public final void t0() {
        this.t = false;
        Set set = this.u;
        this.u = new HashSet();
        A(new b(this.n, this.v, this.r));
        c0().obtainMessage(6, set).sendToTarget();
    }

    public void v() {
        super.v();
        this.q.clear();
    }

    public synchronized void z(R2.x xVar) {
        try {
            super.z(xVar);
            this.m = new Handler(new k(this));
            if (this.k.isEmpty()) {
                t0();
            } else {
                this.v = this.v.h(0, this.k.size());
                R(0, this.k);
                o0();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public l(boolean z, w... wVarArr) {
        this(z, new S.a(0), wVarArr);
    }

    public l(boolean z, S s, w... wVarArr) {
        this(z, false, s, wVarArr);
    }

    public l(boolean z, boolean z2, S s, w... wVarArr) {
        for (w wVar : wVarArr) {
            P2.a.e(wVar);
        }
        this.v = s.a() > 0 ? s.f() : s;
        this.o = new IdentityHashMap();
        this.p = new HashMap();
        this.k = new ArrayList();
        this.n = new ArrayList();
        this.u = new HashSet();
        this.l = new HashSet();
        this.q = new HashSet();
        this.r = z;
        this.s = z2;
        Q(Arrays.asList(wVarArr));
    }

    public void w() {
    }
}
