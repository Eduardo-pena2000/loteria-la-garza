package G5;

import A5.g;
import C5.c;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class r {
    public final Context a;
    public final A5.e b;
    public final H5.d c;
    public final x d;
    public final Executor e;
    public final I5.b f;
    public final J5.a g;
    public final J5.a h;
    public final H5.c i;

    public r(Context context, A5.e eVar, H5.d dVar, x xVar, Executor executor, I5.b bVar, J5.a aVar, J5.a aVar2, H5.c cVar) {
        this.a = context;
        this.b = eVar;
        this.c = dVar;
        this.d = xVar;
        this.e = executor;
        this.f = bVar;
        this.g = aVar;
        this.h = aVar2;
        this.i = cVar;
    }

    public static /* synthetic */ Iterable a(r rVar, z5.p pVar) {
        return rVar.m(pVar);
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, z5.p pVar, long j) {
        return rVar.n(iterable, pVar, j);
    }

    public static /* synthetic */ Object c(r rVar) {
        return rVar.p();
    }

    public static /* synthetic */ Boolean d(r rVar, z5.p pVar) {
        return rVar.l(pVar);
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        return rVar.o(iterable);
    }

    public static /* synthetic */ Object f(r rVar, z5.p pVar, int i) {
        return rVar.s(pVar, i);
    }

    public static /* synthetic */ Object g(r rVar, z5.p pVar, long j) {
        return rVar.r(pVar, j);
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        return rVar.q(map);
    }

    public static /* synthetic */ void i(r rVar, z5.p pVar, int i, Runnable runnable) {
        rVar.t(pVar, i, runnable);
    }

    public z5.i j(A5.m mVar) {
        I5.b bVar = this.f;
        H5.c cVar = this.i;
        Objects.requireNonNull(cVar);
        return mVar.a(z5.i.a().i(this.g.a()).o(this.h.a()).n("GDT_CLIENT_METRICS").h(new z5.h(w5.c.b("proto"), ((C5.a) bVar.b(new h(cVar))).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(z5.p pVar) {
        return Boolean.valueOf(this.c.H(pVar));
    }

    public final /* synthetic */ Iterable m(z5.p pVar) {
        return this.c.Q(pVar);
    }

    public final /* synthetic */ Object n(Iterable iterable, z5.p pVar, long j) {
        this.c.o0(iterable);
        this.c.r1(pVar, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.c.l(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.i.a();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.i.c(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(z5.p pVar, long j) {
        this.c.r1(pVar, this.g.a() + j);
        return null;
    }

    public final /* synthetic */ Object s(z5.p pVar, int i) {
        this.d.a(pVar, i + 1);
        return null;
    }

    public final /* synthetic */ void t(z5.p pVar, int i, Runnable runnable) {
        try {
            try {
                I5.b bVar = this.f;
                H5.d dVar = this.c;
                Objects.requireNonNull(dVar);
                bVar.b(new i(dVar));
                if (k()) {
                    u(pVar, i);
                } else {
                    this.f.b(new j(this, pVar, i));
                }
            } catch (I5.a unused) {
                this.d.a(pVar, i + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public A5.g u(z5.p pVar, int i) {
        A5.g b;
        A5.m mVar = this.b.get(pVar.b());
        long j = 0;
        A5.g e = A5.g.e(0L);
        while (true) {
            long j2 = j;
            while (((Boolean) this.f.b(new k(this, pVar))).booleanValue()) {
                Iterable iterable = (Iterable) this.f.b(new l(this, pVar));
                if (!iterable.iterator().hasNext()) {
                    return e;
                }
                if (mVar == null) {
                    D5.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b = A5.g.a();
                } else {
                    Iterable arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((H5.k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(mVar));
                    }
                    b = mVar.b(A5.f.a().b(arrayList).c(pVar.c()).a());
                }
                e = b;
                if (e.c() == g.a.TRANSIENT_ERROR) {
                    this.f.b(new m(this, iterable, pVar, j2));
                    this.d.b(pVar, i + 1, true);
                    return e;
                }
                this.f.b(new n(this, iterable));
                if (e.c() == g.a.OK) {
                    j = Math.max(j2, e.b());
                    if (pVar.e()) {
                        this.f.b(new o(this));
                    }
                } else if (e.c() == g.a.INVALID_PAYLOAD) {
                    HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String n = ((H5.k) it2.next()).b().n();
                        if (hashMap.containsKey(n)) {
                            hashMap.put(n, Integer.valueOf(((Integer) hashMap.get(n)).intValue() + 1));
                        } else {
                            hashMap.put(n, 1);
                        }
                    }
                    this.f.b(new p(this, hashMap));
                }
            }
            this.f.b(new q(this, pVar, j2));
            return e;
        }
    }

    public void v(z5.p pVar, int i, Runnable runnable) {
        this.e.execute(new g(this, pVar, i, runnable));
    }
}
