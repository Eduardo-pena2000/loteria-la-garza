package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class g implements Handler.Callback {
    public static final Status p = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status q = new Status(4, "The user must be signed in to make this API call.");
    public static final Object r = new Object();
    public static g s;
    public com.google.android.gms.common.internal.x c;
    public com.google.android.gms.common.internal.z d;
    public final Context e;
    public final v6.g f;
    public final com.google.android.gms.common.internal.L g;
    public final Handler n;
    public volatile boolean o;
    public long a = 10000;
    public boolean b = false;
    public final AtomicInteger h = new AtomicInteger(1);
    public final AtomicInteger i = new AtomicInteger(0);
    public final Map j = new ConcurrentHashMap(5, 0.75f, 1);
    public C k = null;
    public final Set l = new w.b();
    public final Set m = new w.b();

    public g(Context context, Looper looper, v6.g gVar) {
        this.o = true;
        this.e = context;
        zau zauVar = new zau(looper, this);
        this.n = zauVar;
        this.f = gVar;
        this.g = new com.google.android.gms.common.internal.L(gVar);
        if (E6.j.a(context)) {
            this.o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static /* bridge */ /* synthetic */ Map A(g gVar) {
        return gVar.j;
    }

    public static /* bridge */ /* synthetic */ Set B(g gVar) {
        return gVar.l;
    }

    public static /* bridge */ /* synthetic */ void C(g gVar, boolean z) {
        gVar.b = true;
    }

    public static void a() {
        synchronized (r) {
            try {
                g gVar = s;
                if (gVar != null) {
                    gVar.i.incrementAndGet();
                    Handler handler = gVar.n;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean d(g gVar) {
        return gVar.o;
    }

    public static Status g(b bVar, v6.b bVar2) {
        return new Status(bVar2, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(bVar2));
    }

    public static /* bridge */ /* synthetic */ long m(g gVar) {
        return gVar.a;
    }

    public static /* bridge */ /* synthetic */ Context n(g gVar) {
        return gVar.e;
    }

    public static /* bridge */ /* synthetic */ Handler o(g gVar) {
        return gVar.n;
    }

    public static /* bridge */ /* synthetic */ v6.g p(g gVar) {
        return gVar.f;
    }

    public static /* bridge */ /* synthetic */ Status q() {
        return q;
    }

    public static /* bridge */ /* synthetic */ Status r(b bVar, v6.b bVar2) {
        return g(bVar, bVar2);
    }

    public static /* bridge */ /* synthetic */ C s(g gVar) {
        return gVar.k;
    }

    public static g u(Context context) {
        g gVar;
        synchronized (r) {
            try {
                if (s == null) {
                    s = new g(context.getApplicationContext(), com.google.android.gms.common.internal.j.b().getLooper(), v6.g.o());
                }
                gVar = s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.internal.L v(g gVar) {
        return gVar.g;
    }

    public static /* bridge */ /* synthetic */ Object z() {
        return r;
    }

    public final void D(com.google.android.gms.common.api.g gVar, int i, d dVar) {
        this.n.sendMessage(this.n.obtainMessage(4, new Z(new l0(i, dVar), this.i.get(), gVar)));
    }

    public final void E(com.google.android.gms.common.api.g gVar, int i, w wVar, TaskCompletionSource taskCompletionSource, u uVar) {
        k(taskCompletionSource, wVar.zaa(), gVar);
        this.n.sendMessage(this.n.obtainMessage(4, new Z(new n0(i, wVar, taskCompletionSource, uVar), this.i.get(), gVar)));
    }

    public final void F(com.google.android.gms.common.internal.q qVar, int i, long j, int i2) {
        this.n.sendMessage(this.n.obtainMessage(18, new Y(qVar, i, j, i2)));
    }

    public final void G(v6.b bVar, int i) {
        if (f(bVar, i)) {
            return;
        }
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(5, i, 0, bVar));
    }

    public final void H() {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void I(com.google.android.gms.common.api.g gVar) {
        Handler handler = this.n;
        handler.sendMessage(handler.obtainMessage(7, gVar));
    }

    public final void b(C c) {
        synchronized (r) {
            try {
                if (this.k != c) {
                    this.k = c;
                    this.l.clear();
                }
                this.l.addAll(c.i());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(C c) {
        synchronized (r) {
            try {
                if (this.k == c) {
                    this.k = null;
                    this.l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        if (this.b) {
            return false;
        }
        com.google.android.gms.common.internal.v a = com.google.android.gms.common.internal.u.b().a();
        if (a != null && !a.O1()) {
            return false;
        }
        int a2 = this.g.a(this.e, 203400000);
        return a2 == -1 || a2 == 0;
    }

    public final boolean f(v6.b bVar, int i) {
        return this.f.y(this.e, bVar, i);
    }

    public final L h(com.google.android.gms.common.api.g gVar) {
        Map map = this.j;
        b apiKey = gVar.getApiKey();
        L l = (L) map.get(apiKey);
        if (l == null) {
            l = new L(this, gVar);
            this.j.put(apiKey, l);
        }
        if (l.a()) {
            this.m.add(apiKey);
        }
        l.B();
        return l;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        L l = null;
        switch (i) {
            case 1:
                this.a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.n.removeMessages(12);
                for (b bVar : this.j.keySet()) {
                    Handler handler = this.n;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (L l2 : this.j.values()) {
                    l2.A();
                    l2.B();
                }
                return true;
            case 4:
            case 8:
            case 13:
                Z z = (Z) message.obj;
                L l3 = (L) this.j.get(z.c.getApiKey());
                if (l3 == null) {
                    l3 = h(z.c);
                }
                if (!l3.a() || this.i.get() == z.b) {
                    l3.C(z.a);
                } else {
                    z.a.a(p);
                    l3.H();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                v6.b bVar2 = (v6.b) message.obj;
                Iterator it = this.j.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        L l4 = (L) it.next();
                        if (l4.p() == i2) {
                            l = l4;
                        }
                    }
                }
                if (l == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i2 + " while trying to fail enqueued calls.", new Exception());
                } else if (bVar2.N1() == 13) {
                    L.v(l, new Status(17, "Error resolution was canceled by the user, original error message: " + this.f.e(bVar2.N1()) + ": " + bVar2.O1()));
                } else {
                    L.v(l, g(L.t(l), bVar2));
                }
                return true;
            case 6:
                if (this.e.getApplicationContext() instanceof Application) {
                    c.c(this.e.getApplicationContext());
                    c.b().a(new G(this));
                    if (!c.b().e(true)) {
                        this.a = 300000L;
                    }
                }
                return true;
            case 7:
                h((com.google.android.gms.common.api.g) message.obj);
                return true;
            case 9:
                if (this.j.containsKey(message.obj)) {
                    ((L) this.j.get(message.obj)).G();
                }
                return true;
            case 10:
                Iterator it2 = this.m.iterator();
                while (it2.hasNext()) {
                    L l5 = (L) this.j.remove((b) it2.next());
                    if (l5 != null) {
                        l5.H();
                    }
                }
                this.m.clear();
                return true;
            case 11:
                if (this.j.containsKey(message.obj)) {
                    ((L) this.j.get(message.obj)).I();
                }
                return true;
            case 12:
                if (this.j.containsKey(message.obj)) {
                    ((L) this.j.get(message.obj)).b();
                }
                return true;
            case 14:
                D d = (D) message.obj;
                b a = d.a();
                if (this.j.containsKey(a)) {
                    d.b().setResult(Boolean.valueOf(L.K((L) this.j.get(a), false)));
                } else {
                    d.b().setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                N n = (N) message.obj;
                if (this.j.containsKey(N.b(n))) {
                    L.y((L) this.j.get(N.b(n)), n);
                }
                return true;
            case 16:
                N n2 = (N) message.obj;
                if (this.j.containsKey(N.b(n2))) {
                    L.z((L) this.j.get(N.b(n2)), n2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                Y y = (Y) message.obj;
                if (y.c == 0) {
                    i().a(new com.google.android.gms.common.internal.x(y.b, Arrays.asList(new com.google.android.gms.common.internal.q[]{y.a})));
                } else {
                    com.google.android.gms.common.internal.x xVar = this.c;
                    if (xVar != null) {
                        List N1 = xVar.N1();
                        if (xVar.M1() != y.b || (N1 != null && N1.size() >= y.d)) {
                            this.n.removeMessages(17);
                            j();
                        } else {
                            this.c.O1(y.a);
                        }
                    }
                    if (this.c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(y.a);
                        this.c = new com.google.android.gms.common.internal.x(y.b, arrayList);
                        Handler handler2 = this.n;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), y.c);
                    }
                }
                return true;
            case 19:
                this.b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i);
                return false;
        }
    }

    public final com.google.android.gms.common.internal.z i() {
        if (this.d == null) {
            this.d = com.google.android.gms.common.internal.y.a(this.e);
        }
        return this.d;
    }

    public final void j() {
        com.google.android.gms.common.internal.x xVar = this.c;
        if (xVar != null) {
            if (xVar.M1() > 0 || e()) {
                i().a(xVar);
            }
            this.c = null;
        }
    }

    public final void k(TaskCompletionSource taskCompletionSource, int i, com.google.android.gms.common.api.g gVar) {
        X a;
        if (i == 0 || (a = X.a(this, i, gVar.getApiKey())) == null) {
            return;
        }
        Task task = taskCompletionSource.getTask();
        Handler handler = this.n;
        handler.getClass();
        task.addOnCompleteListener(new F(handler), a);
    }

    public final int l() {
        return this.h.getAndIncrement();
    }

    public final L t(b bVar) {
        return (L) this.j.get(bVar);
    }

    public final Task w(com.google.android.gms.common.api.g gVar) {
        D d = new D(gVar.getApiKey());
        this.n.sendMessage(this.n.obtainMessage(14, d));
        return d.b().getTask();
    }

    public final Task x(com.google.android.gms.common.api.g gVar, p pVar, y yVar, Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, pVar.zaa(), gVar);
        this.n.sendMessage(this.n.obtainMessage(8, new Z(new m0(new a0(pVar, yVar, runnable), taskCompletionSource), this.i.get(), gVar)));
        return taskCompletionSource.getTask();
    }

    public final Task y(com.google.android.gms.common.api.g gVar, l.a aVar, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k(taskCompletionSource, i, gVar);
        this.n.sendMessage(this.n.obtainMessage(13, new Z(new o0(aVar, taskCompletionSource), this.i.get(), gVar)));
        return taskCompletionSource.getTask();
    }
}
