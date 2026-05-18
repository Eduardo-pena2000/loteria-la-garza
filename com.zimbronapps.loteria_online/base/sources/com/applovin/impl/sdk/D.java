package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.l1;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinAdType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d implements AppLovinBroadcastManager.Receiver {
    private final k a;
    private final c b;
    private final List c = Collections.synchronizedList(new ArrayList());

    public interface a {
        void a(com.applovin.impl.sdk.ad.b bVar);
    }

    public d(k kVar) {
        this.a = kVar;
        this.b = new c(kVar);
    }

    public static /* synthetic */ void a(d dVar, a aVar, c.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        dVar.a(aVar, aVar2, uVar, bVar, str);
    }

    public static /* synthetic */ void b(d dVar, c.a aVar) {
        dVar.c(aVar);
    }

    public static /* synthetic */ void c(d dVar) {
        dVar.d();
    }

    public static /* synthetic */ void d(d dVar) {
        dVar.c();
    }

    private void e() {
        String str = (String) this.a.p0().a(z4.E);
        if (str == null) {
            return;
        }
        JSONArray jsonArray = JsonUtils.toJsonArray(str, new JSONArray());
        for (int length = jsonArray.length() - 1; length >= 0; length--) {
            try {
                c.a a2 = c.a.a(JsonUtils.getJSONObject(jsonArray, length, new JSONObject()), this.a);
                if (a2 != null) {
                    if (a(a2)) {
                        long c = a2.c() - SystemClock.elapsedRealtime();
                        this.a.g().d(d2.Z, CollectionUtils.map("details", "ttl = " + c + "ms"));
                    } else {
                        this.c.add(0, a2);
                    }
                }
            } catch (Throwable th) {
                this.a.O();
                if (o.a()) {
                    this.a.O().a("AdPersistenceManager", "Failed to deserialize persisted ad file path", th);
                }
                this.a.D().a("AdPersistenceManager", "deserializePersistedAdFilePath", th);
            }
        }
    }

    private void f() {
        this.a.q0().a((i5) new r6(this.a, "loadPersistedAdFilesQueueAndCleanupAsync", new D(this)), d6.b.OTHER);
    }

    private void h() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.c) {
            try {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(((c.a) it.next()).a());
                    } catch (Throwable th) {
                        this.a.O();
                        if (o.a()) {
                            this.a.O().a("AdPersistenceManager", "Failed to serialize persisted ad file path", th);
                        }
                        this.a.D().a("AdPersistenceManager", "serializePersistedAdFilePath", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.p0().b(z4.E, new JSONArray(arrayList).toString());
    }

    public void g() {
        this.a.q0().a((i5) new r6(this.a, "resetManagerState", new E(this)), d6.b.OTHER);
    }

    public void onReceive(Intent intent, Map map) {
        h();
    }

    private /* synthetic */ void c(c.a aVar) {
        if (aVar == null) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("AdPersistenceManager", "Ad failed to persist");
                return;
            }
            return;
        }
        this.c.add(aVar);
        if (((Boolean) this.a.a(x4.Y0)).booleanValue()) {
            h();
        }
    }

    private /* synthetic */ void d() {
        this.a.p0().b(z4.E);
        this.b.a();
    }

    public void a(com.applovin.impl.u uVar, a aVar) {
        if (aVar == null) {
            this.a.O();
            if (o.a()) {
                this.a.O().b("AdPersistenceManager", "Persisted ad could not be retrieved: listener is null");
            }
            l1.a("Persisted ad could not be retrieved: listener is null", new Object[0]);
            return;
        }
        if (uVar == null) {
            a(aVar, null, null, "Persisted ad could not be retrieved: adZone is null");
            return;
        }
        this.a.g().a(d2.W, uVar, (AppLovinError) null);
        c.a a2 = a(uVar.g());
        this.b.a(a2, new C(this, aVar, a2, uVar));
    }

    public void b() {
        f();
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
    }

    private void d(c.a aVar) {
        if (aVar != null && this.c.remove(aVar)) {
            this.b.b(aVar);
        }
    }

    public void b(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        this.a.g().a(d2.T, bVar);
        this.b.b(bVar, new F(this));
    }

    private boolean b(c.a aVar) {
        long b = aVar.b();
        return (b == 0 || b == k.n()) ? false : true;
    }

    private /* synthetic */ void c() {
        e();
        a();
    }

    private /* synthetic */ void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar, String str) {
        if (bVar != null && !StringUtils.isValidString(str)) {
            a(aVar, bVar, aVar2);
        } else {
            a(aVar, aVar2, uVar, str);
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            return;
        }
        d(c.a.a(bVar));
    }

    private c.a a(AppLovinAdType appLovinAdType) {
        c.a aVar;
        synchronized (this.c) {
            try {
                Iterator it = this.c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = (c.a) it.next();
                    if (aVar.f().equals(appLovinAdType) && !a(aVar) && b(aVar)) {
                        break;
                    }
                }
                this.c.remove(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    private void a(a aVar, c.a aVar2, com.applovin.impl.u uVar, String str) {
        if (aVar == null) {
            return;
        }
        this.a.O();
        if (o.a()) {
            this.a.O().a("AdPersistenceManager", str);
        }
        aVar.a(null);
        this.b.b(aVar2);
        this.a.g().a(d2.Y, uVar, new AppLovinError(-1, str));
    }

    private void a(a aVar, com.applovin.impl.sdk.ad.b bVar, c.a aVar2) {
        if (aVar == null) {
            return;
        }
        this.a.O();
        if (o.a()) {
            this.a.O().a("AdPersistenceManager", "Loading persisted ad");
        }
        aVar.a(bVar);
        this.b.b(aVar2);
        this.a.g().a(d2.X, bVar);
    }

    private boolean a(c.a aVar) {
        return SystemClock.elapsedRealtime() + ((Long) this.a.a(x4.a1)).longValue() >= aVar.c();
    }

    private void a() {
        synchronized (this.c) {
            this.b.a((List) new ArrayList(this.c));
        }
    }
}
