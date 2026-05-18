package com.applovin.impl.sdk.network;

import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.t2;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinPostbackListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final o b;
    private final int c;
    private final c d;
    private final Object e = new Object();
    private final List f;
    private final Set g;
    private final List h;

    public class a implements AppLovinPostbackListener {
        final /* synthetic */ d a;
        final /* synthetic */ AppLovinPostbackListener b;

        public a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
            this.a = dVar;
            this.b = appLovinPostbackListener;
        }

        public void onPostbackFailure(String str, int i) {
            b.a(b.this);
            if (o.a()) {
                b.a(b.this).d("PersistentPostbackManager", "Failed to submit postback: " + this.a + " with error code: " + i + "; will retry later...");
            }
            b.b(b.this, this.a);
            t2.a(this.b, str, i);
            if (this.a.c() == 1) {
                b.c(b.this).D().a("dispatchPostback", str, i, (String) null);
            }
        }

        public void onPostbackSuccess(String str) {
            b.a(b.this, this.a);
            b.a(b.this);
            if (o.a()) {
                b.a(b.this).a("PersistentPostbackManager", "Successfully submit postback: " + this.a);
            }
            b.b(b.this);
            t2.a(this.b, str);
        }
    }

    public b(k kVar) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.g = new HashSet();
        this.h = new ArrayList();
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.O();
        int intValue = ((Integer) kVar.a(x4.J2)).intValue();
        this.c = intValue;
        if (!((Boolean) kVar.a(x4.M2)).booleanValue()) {
            this.d = null;
            return;
        }
        c cVar = new c(this, kVar);
        this.d = cVar;
        arrayList.addAll(cVar.a(intValue));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
    }

    public static /* synthetic */ void a(b bVar, d dVar) {
        bVar.a(dVar);
    }

    public static /* synthetic */ void b(b bVar) {
        bVar.c();
    }

    public static /* synthetic */ k c(b bVar) {
        return bVar.a;
    }

    public static /* synthetic */ void d(b bVar) {
        bVar.e();
    }

    public static /* synthetic */ void e(b bVar, d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        bVar.b(dVar, appLovinPostbackListener);
    }

    public void onReceive(Intent intent, Map map) {
        this.a.q0().a((i5) this.d, d6.b.OTHER);
    }

    public static /* synthetic */ o a(b bVar) {
        return bVar.b;
    }

    public static /* synthetic */ void b(b bVar, d dVar) {
        bVar.d(dVar);
    }

    private void c(d dVar) {
        synchronized (this.e) {
            while (this.f.size() > this.c) {
                try {
                    this.f.remove(0);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f.add(dVar);
        }
        if (o.a()) {
            this.b.a("PersistentPostbackManager", "Enqueued postback: " + dVar);
        }
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            try {
                if (((Boolean) this.a.a(x4.L2)).booleanValue()) {
                    arrayList.ensureCapacity(this.h.size());
                    arrayList.addAll(this.h);
                } else {
                    arrayList.ensureCapacity(this.f.size());
                    arrayList.addAll(this.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public void e(d dVar) {
        a(dVar, true);
    }

    private /* synthetic */ void b(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        synchronized (this.e) {
            c(dVar);
            a(dVar, appLovinPostbackListener);
        }
    }

    private /* synthetic */ void e() {
        synchronized (this.e) {
            try {
                Iterator it = new ArrayList(this.f).iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(d dVar, boolean z) {
        a(dVar, z, (AppLovinPostbackListener) null);
    }

    public void a(d dVar, boolean z, AppLovinPostbackListener appLovinPostbackListener) {
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.b.b("PersistentPostbackManager", "Requested a postback dispatch for empty URL; nothing to do...");
            }
        } else {
            if (z) {
                dVar.a();
            }
            a(new f(this, dVar, appLovinPostbackListener), n7.i(), dVar.m());
        }
    }

    public void b() {
        a((Runnable) new g(this), true, false);
    }

    private void b(d dVar) {
        a(dVar, (AppLovinPostbackListener) null);
    }

    private void c() {
        synchronized (this.e) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    b((d) it.next());
                }
                this.h.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a() {
        synchronized (this.e) {
            this.f.clear();
            this.h.clear();
        }
        this.a.q0().a((i5) this.d, d6.b.OTHER);
    }

    private void d(d dVar) {
        synchronized (this.e) {
            this.g.remove(dVar);
            this.h.add(dVar);
        }
    }

    private void a(d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        if (o.a()) {
            this.b.a("PersistentPostbackManager", "Preparing to submit postback: " + dVar);
        }
        if (this.a.E0() && !dVar.m()) {
            if (o.a()) {
                this.b.a("PersistentPostbackManager", "Skipping postback dispatch because SDK is still initializing - postback will be dispatched afterwards");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dVar.k())) {
            if (o.a()) {
                this.b.b("PersistentPostbackManager", "Skipping empty postback dispatch...");
                return;
            }
            return;
        }
        synchronized (this.e) {
            try {
                if (this.g.contains(dVar)) {
                    if (o.a()) {
                        this.b.a("PersistentPostbackManager", "Skipping in progress postback: " + dVar.k());
                    }
                    return;
                }
                dVar.l();
                Integer num = (Integer) this.a.a(x4.I2);
                if (dVar.c() > num.intValue()) {
                    if (o.a()) {
                        this.b.k("PersistentPostbackManager", "Exceeded maximum persisted attempt count of " + num + ". Dequeuing postback: " + dVar);
                    }
                    a(dVar);
                    return;
                }
                synchronized (this.e) {
                    this.g.add(dVar);
                }
                e b = e.b(this.a).f(dVar.k()).d(dVar.d()).d(dVar.i()).g(dVar.h()).c(dVar.g()).b(dVar.j() != null ? new JSONObject(dVar.j()) : null).i(dVar.o()).g(dVar.n()).b(dVar.f()).h(dVar.p()).e(dVar.e()).b();
                if (o.a()) {
                    this.b.a("PersistentPostbackManager", "Submitting postback: " + dVar);
                }
                this.a.g0().dispatchPostbackRequest(b, new a(dVar, appLovinPostbackListener));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(d dVar) {
        synchronized (this.e) {
            this.g.remove(dVar);
            this.f.remove(dVar);
        }
        if (o.a()) {
            this.b.a("PersistentPostbackManager", "Dequeued postback: " + dVar);
        }
    }

    private void a(Runnable runnable, boolean z, boolean z2) {
        if (z) {
            this.a.q0().a((i5) new r6(this.a, z2, "runPostbackTask", runnable), d6.b.OTHER);
        } else {
            runnable.run();
        }
    }
}
