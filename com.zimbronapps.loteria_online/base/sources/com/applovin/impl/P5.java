package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.c5;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p5 extends i5 {
    private static JSONObject j;
    private static final Object k = new Object();
    private static final Map l = Collections.synchronizedMap(new HashMap());
    private final a3 g;
    private final Context h;
    private final b i;

    public interface b {
        void a(JSONArray jSONArray);
    }

    public static class c implements c5.a, Runnable {
        private final b a;
        private final Object b;
        private int c;
        private final AtomicBoolean d;
        private final Collection e;
        private final com.applovin.impl.sdk.k f;
        private final com.applovin.impl.sdk.o g;

        public /* synthetic */ c(int i, b bVar, com.applovin.impl.sdk.k kVar, a aVar) {
            this(i, bVar, kVar);
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.a();
        }

        public void run() {
            if (this.d.compareAndSet(false, true)) {
                a();
            }
        }

        private c(int i, b bVar, com.applovin.impl.sdk.k kVar) {
            this.c = i;
            this.a = bVar;
            this.f = kVar;
            this.g = kVar.O();
            this.b = new Object();
            this.e = new ArrayList(i);
            this.d = new AtomicBoolean();
        }

        public void a(c5 c5Var) {
            boolean z;
            synchronized (this.b) {
                this.e.add(c5Var);
                int i = this.c - 1;
                this.c = i;
                z = i < 1;
            }
            if (z && this.d.compareAndSet(false, true)) {
                if (n7.i() && ((Boolean) this.f.a(x4.P)).booleanValue()) {
                    this.f.q0().a((i5) new r6(this.f, "handleSignalCollectionCompleted", new C4(this)), d6.b.MEDIATION);
                } else {
                    a();
                }
            }
        }

        private void a() {
            ArrayList<c5> arrayList;
            synchronized (this.b) {
                arrayList = new ArrayList(this.e);
            }
            JSONArray jSONArray = new JSONArray();
            for (c5 c5Var : arrayList) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    d5 f = c5Var.f();
                    jSONObject.put("name", f.c());
                    jSONObject.put("class", f.b());
                    jSONObject.put("adapter_version", c5Var.a());
                    jSONObject.put("sdk_version", c5Var.d());
                    JSONObject jSONObject2 = new JSONObject();
                    MaxError c = c5Var.c();
                    if (c != null) {
                        jSONObject2.put("error_message", c.getMessage());
                    } else {
                        jSONObject2.put("signal", c5Var.e());
                    }
                    jSONObject2.put("signal_collection_time_ms", c5Var.b());
                    jSONObject2.put("is_cached", c5Var.g());
                    jSONObject.put("data", jSONObject2);
                    jSONArray.put(jSONObject);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.g.a("TaskCollectSignals", "Collected signal from " + f);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.g.a("TaskCollectSignals", "Failed to create signal data", e);
                    }
                    this.f.D().c("TaskCollectSignals", "createSignalsData", e);
                }
            }
            a(jSONArray);
        }

        private void a(JSONArray jSONArray) {
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(jSONArray);
            }
        }
    }

    public p5(a3 a3Var, Context context, com.applovin.impl.sdk.k kVar, b bVar) {
        super("TaskCollectSignals", kVar);
        this.g = a3Var;
        this.h = context;
        this.i = bVar;
    }

    private void a(JSONArray jSONArray, JSONObject jSONObject) {
        c cVar = new c(jSONArray.length(), this.i, this.a, null);
        this.a.q0().a(new r6(this.a, "timeoutCollectSignal", cVar), d6.b.TIMEOUT, ((Long) this.a.a(r3.w7)).longValue());
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new d5(this.g, jSONArray.getJSONObject(i), jSONObject, this.a), cVar);
        }
    }

    private void b(JSONArray jSONArray, JSONObject jSONObject) {
        Set set = (Set) l.get(this.g.b());
        if (set == null || set.isEmpty()) {
            a("No signal providers found for ad unit: " + this.g.b(), (Throwable) null);
            return;
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (set.contains(JsonUtils.getString(jSONObject2, "name", null))) {
                jSONArray2.put(jSONObject2);
            }
        }
        a(jSONArray2, jSONObject);
    }

    public static /* synthetic */ void e(p5 p5Var, d5 d5Var, c5.a aVar) {
        p5Var.b(d5Var, aVar);
    }

    public void run() {
        JSONArray jSONArray;
        try {
            synchronized (k) {
                jSONArray = JsonUtils.getJSONArray(j, "signal_providers", null);
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                if (l.size() > 0) {
                    b(jSONArray, j);
                    return;
                } else {
                    a(jSONArray, j);
                    return;
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k(this.b, "Unable to find cached signal providers, fetching signal providers from SharedPreferences.");
            }
            JSONObject jSONObject = new JSONObject((String) this.a.a(z4.F, "{}"));
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            if (jSONArray2 != null && jSONArray2.length() != 0) {
                if (l.size() > 0) {
                    b(jSONArray2, jSONObject);
                    return;
                } else {
                    a(jSONArray2, jSONObject);
                    return;
                }
            }
            a("No signal providers found", (Throwable) null);
        } catch (JSONException e) {
            a("Failed to parse signals JSON", e);
            this.a.D().c("TaskCollectSignals", "parseSignalsJSON", e);
        } catch (InterruptedException e2) {
            a("Failed to wait for signals", e2);
            this.a.D().c("TaskCollectSignals", "waitForSignals", e2);
        } catch (Throwable th) {
            a("Failed to collect signals", th);
            this.a.D().c("TaskCollectSignals", "collectSignals", th);
        }
    }

    private void a(d5 d5Var, c5.a aVar) {
        if (d5Var.r()) {
            AppLovinSdkUtils.runOnUiThread(new B4(this, d5Var, aVar));
        } else {
            this.a.X().collectSignal(d5Var, this.h, aVar);
        }
    }

    private /* synthetic */ void b(d5 d5Var, c5.a aVar) {
        this.a.X().collectSignal(d5Var, this.h, aVar);
    }

    private void a(String str, Throwable th) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "No signals collected: " + str, th);
        }
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(new JSONArray());
        }
    }

    public static void a(JSONObject jSONObject) {
        synchronized (k) {
            j = jSONObject;
        }
    }

    public static void a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        try {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "ad_unit_signal_providers", (JSONObject) null);
            if (jSONObject2 != null) {
                for (String str : JsonUtils.toList(jSONObject2.names())) {
                    l.put(str, new HashSet(JsonUtils.getList(jSONObject2, str, null)));
                }
            }
        } catch (JSONException e) {
            com.applovin.impl.sdk.o.c("TaskCollectSignals", "Failed to parse ad unit signal providers for JSON object: " + jSONObject, e);
            kVar.D().c("TaskCollectSignals", "parseAdUnitSignalProvidersJSON", e);
        }
    }
}
