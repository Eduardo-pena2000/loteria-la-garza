package com.applovin.impl.sdk;

import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e {
    private final k a;
    private final o b;
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private final Object c = new Object();

    public e(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        for (com.applovin.impl.u uVar : com.applovin.impl.u.a()) {
            this.d.put(uVar, new q());
            this.e.put(uVar, new q());
        }
    }

    private q c(com.applovin.impl.u uVar) {
        synchronized (this.c) {
            try {
                q b = b(uVar);
                if (b.b() > 0) {
                    return b;
                }
                return d(uVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private q d(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.c) {
            try {
                qVar = (q) this.d.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.d.put(uVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public void a(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            try {
                d(appLovinAdImpl.getAdZone()).a(appLovinAdImpl);
                if (o.a()) {
                    this.b.a("AdPreloadManager", "Ad enqueued: " + appLovinAdImpl);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(AppLovinAdImpl appLovinAdImpl) {
        synchronized (this.c) {
            c(appLovinAdImpl.getAdZone()).b(appLovinAdImpl);
        }
    }

    public AppLovinAdImpl e(com.applovin.impl.u uVar) {
        com.applovin.impl.sdk.ad.c cVar;
        synchronized (this.c) {
            try {
                q d = d(uVar);
                if (d.b() > 0) {
                    b(uVar).a(d.a());
                    cVar = new com.applovin.impl.sdk.ad.c(uVar, this.a);
                } else {
                    cVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cVar != null) {
            if (o.a()) {
                this.b.a("AdPreloadManager", "Retrieved ad of zone " + uVar + "...");
            }
        } else if (o.a()) {
            this.b.a("AdPreloadManager", "Unable to retrieve ad of zone " + uVar + "...");
        }
        return cVar;
    }

    public AppLovinAdBase f(com.applovin.impl.u uVar) {
        AppLovinAdImpl d;
        synchronized (this.c) {
            d = c(uVar).d();
        }
        return d;
    }

    private q b(com.applovin.impl.u uVar) {
        q qVar;
        synchronized (this.c) {
            try {
                qVar = (q) this.e.get(uVar);
                if (qVar == null) {
                    qVar = new q();
                    this.e.put(uVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    public AppLovinAdImpl a(com.applovin.impl.u uVar) {
        AppLovinAdImpl a;
        synchronized (this.c) {
            a = c(uVar).a();
        }
        return a;
    }
}
