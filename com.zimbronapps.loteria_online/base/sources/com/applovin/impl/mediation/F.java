package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.f2;
import com.applovin.impl.i6;
import com.applovin.impl.k3;
import com.applovin.impl.k5;
import com.applovin.impl.l1;
import com.applovin.impl.r3;
import com.applovin.impl.s4;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.mediation.adapter.MaxAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f {
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final AtomicBoolean c = new AtomicBoolean();
    private final Set d = new HashSet();
    private final Object e = new Object();
    private final JSONArray f = new JSONArray();
    private final LinkedHashMap g = new LinkedHashMap();
    private final Object h = new Object();
    private final Map i = new HashMap();
    private final Map j = new HashMap();
    private final Object k = new Object();
    private List l;

    public f(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
    }

    public static /* synthetic */ void b(s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        a(s4Var, initializationStatus, str);
    }

    public void a(Activity activity) {
        if (this.c.compareAndSet(false, true)) {
            String str = (String) this.a.a(z4.G);
            if (StringUtils.isValidString(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    List<k3> a = a(JsonUtils.getJSONArray(jSONObject, this.a.s0().c() ? "test_mode_auto_init_adapters" : "auto_init_adapters", new JSONArray()), jSONObject);
                    this.l = a;
                    for (k3 k3Var : a) {
                        this.i.put(k3Var.b(), k3Var);
                    }
                    long parseLong = StringUtils.parseLong((String) this.a.n0().getExtraParameters().get("adapter_initialization_delay_ms"), -1L);
                    k5 k5Var = new k5(a, activity, this.a);
                    if (parseLong > 0) {
                        this.a.q0().a(k5Var, d6.b.MEDIATION, parseLong);
                    } else {
                        this.a.q0().a(k5Var);
                    }
                } catch (JSONException e) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.b.a("MediationAdapterInitializationManager", "Failed to parse auto-init adapters JSON", e);
                    }
                    l1.a(e);
                }
            }
        }
    }

    public boolean c() {
        return this.c.get();
    }

    private void c(k3 k3Var) {
        String b = k3Var.b();
        synchronized (this.e) {
            try {
                if (this.d.contains(b)) {
                    return;
                }
                this.d.add(b);
                this.a.P().d(d2.c0, f2.a(k3Var));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public JSONArray b() {
        JSONArray shallowCopy;
        synchronized (this.h) {
            shallowCopy = JsonUtils.shallowCopy(this.f);
        }
        return shallowCopy;
    }

    public boolean b(k3 k3Var) {
        boolean containsKey;
        synchronized (this.h) {
            containsKey = this.g.containsKey(k3Var.b());
        }
        return containsKey;
    }

    public s4 a(k3 k3Var, Activity activity) {
        k3 a = a(k3Var);
        if (a == null) {
            return s4.a("AdapterInitialization:" + k3Var.c(), MaxAdapter.InitializationStatus.DOES_NOT_APPLY);
        }
        String b = k3Var.b();
        synchronized (this.k) {
            try {
                s4 s4Var = (s4) this.j.get(b);
                if (s4Var != null) {
                    boolean z = false;
                    boolean z2 = a.q() && s4Var.e();
                    if (((Boolean) this.a.a(x4.U6)).booleanValue() && s4Var.a()) {
                        z = true;
                    }
                    if (!z2 && !z) {
                        return s4Var;
                    }
                }
                s4 s4Var2 = new s4("AdapterInitialization:" + k3Var.c());
                this.j.put(b, s4Var2);
                h a2 = this.a.T().a(a);
                if (a2 == null) {
                    s4Var2.a("Adapter implementation not found");
                    return s4Var2;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.d("MediationAdapterInitializationManager", "Initializing adapter " + a);
                }
                c(a);
                a2.a(MaxAdapterParametersImpl.a(a), activity, new v(s4Var2));
                i6.a(a.m(), s4Var2, "The adapter (" + k3Var.c() + ") timed out initializing", "MediationAdapterInitializationManager", this.a);
                return s4Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static /* synthetic */ void a(s4 s4Var, MaxAdapter.InitializationStatus initializationStatus, String str) {
        if (initializationStatus != null && initializationStatus != MaxAdapter.InitializationStatus.INITIALIZING) {
            if (initializationStatus == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE) {
                s4Var.a(str);
                return;
            } else {
                s4Var.b(initializationStatus);
                return;
            }
        }
        l1.a("Adapters should never report a null or INITIALIZING status.", new Object[0]);
        s4Var.a("Adapter reported INITIALIZING");
    }

    private k3 a(k3 k3Var) {
        List<k3> list;
        if (((Boolean) this.a.a(r3.v8)).booleanValue()) {
            k3 k3Var2 = (k3) this.i.get(k3Var.b());
            return k3Var2 != null ? k3Var2 : k3Var;
        }
        if (!this.a.s0().c() || (list = this.l) == null) {
            return k3Var;
        }
        for (k3 k3Var3 : list) {
            if (k3Var3.b().equals(k3Var.b())) {
                return k3Var3;
            }
        }
        return null;
    }

    public Integer a(String str) {
        Integer num;
        synchronized (this.h) {
            num = (Integer) this.g.get(str);
        }
        return num;
    }

    public Set a() {
        HashSet hashSet;
        synchronized (this.h) {
            hashSet = new HashSet(this.g.keySet());
        }
        return hashSet;
    }

    public void a(k3 k3Var, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        boolean b;
        if (initializationStatus == null || initializationStatus == MaxAdapter.InitializationStatus.INITIALIZING) {
            return;
        }
        synchronized (this.h) {
            try {
                b = b(k3Var);
                if (!b) {
                    this.g.put(k3Var.b(), Integer.valueOf(initializationStatus.getCode()));
                    JSONObject jSONObject = new JSONObject();
                    JsonUtils.putString(jSONObject, "class", k3Var.b());
                    JsonUtils.putString(jSONObject, "init_status", String.valueOf(initializationStatus.getCode()));
                    JsonUtils.putLong(jSONObject, "init_time_ms", j);
                    JsonUtils.putString(jSONObject, "error_message", JSONObject.quote(str));
                    this.f.put(jSONObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b) {
            return;
        }
        this.a.a(k3Var);
        this.a.X().processAdapterInitializationPostback(k3Var, j, initializationStatus, str);
        this.a.t().a(initializationStatus, k3Var.b());
    }

    private List a(JSONArray jSONArray, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(new k3(Collections.EMPTY_MAP, JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null), jSONObject, this.a));
        }
        return arrayList;
    }

    public void a(MaxAdapter.InitializationStatus initializationStatus) {
        synchronized (this.h) {
            this.g.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", Integer.valueOf(initializationStatus.getCode()));
        }
        this.a.t().a(initializationStatus, "com.applovin.mediation.adapters.AppLovinMediationAdapter");
    }
}
