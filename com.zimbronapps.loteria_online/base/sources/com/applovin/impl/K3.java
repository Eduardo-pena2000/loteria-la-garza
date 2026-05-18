package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k3 {
    protected final com.applovin.impl.sdk.k a;
    private final JSONObject b;
    protected final JSONObject d;
    private final Map f;
    private final h5 g;
    protected final h5 h;
    private String i;
    private String j;
    private final Object c = new Object();
    protected final Object e = new Object();

    public k3(Map map, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No full response specified");
        }
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        this.a = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.g = new h5(jSONObject2);
            this.h = new h5(jSONObject);
            this.b = null;
            this.d = null;
        } else {
            this.b = jSONObject2;
            this.d = jSONObject;
            this.g = null;
            this.h = null;
        }
        this.f = map;
    }

    public static /* synthetic */ Bundle h(h5 h5Var) {
        return a(h5Var);
    }

    private int j() {
        return a("mute_state", b("mute_state", ((Integer) this.a.a(r3.b8)).intValue()));
    }

    public JSONObject a() {
        JSONObject jSONObject;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.e) {
            jSONObject = this.d;
        }
        return jSONObject;
    }

    public Boolean b(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.c) {
            bool2 = JsonUtils.getBoolean(this.b, str, bool);
        }
        return bool2;
    }

    public boolean c(String str) {
        boolean has;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.e) {
            has = this.d.has(str);
        }
        return has;
    }

    public boolean d(String str) {
        boolean has;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.c) {
            has = this.b.has(str);
        }
        return has;
    }

    public Object e(String str) {
        Object opt;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.b(str);
        }
        synchronized (this.e) {
            opt = this.d.opt(str);
        }
        return opt;
    }

    public Bundle f() {
        return BundleUtils.getBundle("custom_parameters", new Bundle(), l());
    }

    public JSONObject g() {
        JSONObject jSONObject;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a();
        }
        synchronized (this.c) {
            jSONObject = this.b;
        }
        return jSONObject;
    }

    public String getAdUnitId() {
        return b("ad_unit_id", "");
    }

    public String getPlacement() {
        return this.i;
    }

    public Map i() {
        return this.f;
    }

    public String k() {
        return c().split("_")[0];
    }

    public Bundle l() {
        Bundle bundle;
        if (e("server_parameters") instanceof JSONObject) {
            h5 h5Var = this.h;
            bundle = h5Var != null ? (Bundle) h5Var.a(new V1()) : JsonUtils.toBundle(a("server_parameters", (JSONObject) null));
        } else {
            bundle = new Bundle();
        }
        int j = j();
        if (j != -1) {
            if (j == 2) {
                bundle.putBoolean("is_muted", this.a.n0().isMuted());
            } else {
                bundle.putBoolean("is_muted", j == 0);
            }
        }
        if (!bundle.containsKey("amount")) {
            bundle.putLong("amount", b("amount", 0L));
        }
        if (!bundle.containsKey("currency")) {
            bundle.putString("currency", b("currency", ""));
        }
        return bundle;
    }

    public long m() {
        return a("adapter_timeout_ms", ((Long) this.a.a(r3.x7)).longValue());
    }

    public Boolean n() {
        String str = (String) this.a.n0().getExtraParameters().get("huc");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("huc") ? a("huc", Boolean.FALSE) : b("huc", (Boolean) null);
    }

    public Boolean o() {
        String str = (String) this.a.n0().getExtraParameters().get("dns");
        return StringUtils.isValidString(str) ? Boolean.valueOf(str) : c("dns") ? a("dns", Boolean.FALSE) : b("dns", (Boolean) null);
    }

    public boolean p() {
        return a("is_testing", Boolean.FALSE).booleanValue();
    }

    public boolean q() {
        return a("reinitialize_if_init_fails", Boolean.FALSE).booleanValue();
    }

    public boolean r() {
        return a("run_on_ui_thread", Boolean.TRUE).booleanValue();
    }

    public boolean s() {
        return a("eagerly_initialize", Boolean.TRUE).booleanValue();
    }

    public String toString() {
        return "MediationAdapterSpec{adapterClass='" + b() + "', adapterName='" + c() + "', isTesting=" + p() + '}';
    }

    public void f(String str) {
        this.j = str;
    }

    public long h() {
        return a("init_completion_delay_ms", -1L);
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, bool);
        }
        synchronized (this.e) {
            bool2 = JsonUtils.getBoolean(this.d, str, bool);
        }
        return bool2;
    }

    public int b(String str, int i) {
        int i2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, i);
        }
        synchronized (this.c) {
            i2 = JsonUtils.getInt(this.b, str, i);
        }
        return i2;
    }

    public void c(String str, int i) {
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.b(str, i);
            return;
        }
        synchronized (this.e) {
            JsonUtils.putInt(this.d, str, i);
        }
    }

    public String d() {
        if (c("consent_string")) {
            return a("consent_string", (String) null);
        }
        if (d("consent_string")) {
            return b("consent_string", (String) null);
        }
        return this.a.r0().j();
    }

    public String e() {
        return this.j;
    }

    public void g(String str) {
        this.i = str;
    }

    public float a(String str, float f) {
        float f2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, f);
        }
        synchronized (this.e) {
            f2 = JsonUtils.getFloat(this.d, str, f);
        }
        return f2;
    }

    public JSONArray b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.c) {
            jSONArray2 = JsonUtils.getJSONArray(this.b, str, jSONArray);
        }
        return jSONArray2;
    }

    public void c(String str, long j) {
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.b(str, j);
            return;
        }
        synchronized (this.e) {
            JsonUtils.putLong(this.d, str, j);
        }
    }

    public int a(String str, int i) {
        int i2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, i);
        }
        synchronized (this.e) {
            i2 = JsonUtils.getInt(this.d, str, i);
        }
        return i2;
    }

    public long b(String str, long j) {
        long j2;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.c) {
            j2 = JsonUtils.getLong(this.b, str, j);
        }
        return j2;
    }

    public void c(String str, String str2) {
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.b(str, str2);
            return;
        }
        synchronized (this.e) {
            JsonUtils.putString(this.d, str, str2);
        }
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.e) {
            jSONArray2 = JsonUtils.getJSONArray(this.d, str, jSONArray);
        }
        return jSONArray2;
    }

    public String b(String str, String str2) {
        String string;
        h5 h5Var = this.g;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.c) {
            string = JsonUtils.getString(this.b, str, str2);
        }
        return string;
    }

    public String c() {
        return a("name", (String) null);
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.e) {
            jSONObject2 = JsonUtils.getJSONObject(this.d, str, jSONObject);
        }
        return jSONObject2;
    }

    public String b() {
        return a("class", (String) null);
    }

    public List b(String str) {
        List optList;
        List optList2;
        if (str != null) {
            h5 h5Var = this.g;
            if (h5Var != null) {
                optList = h5Var.b(str, Collections.emptyList());
            } else {
                optList = JsonUtils.optList(b(str, new JSONArray()), Collections.emptyList());
            }
            h5 h5Var2 = this.h;
            if (h5Var2 != null) {
                optList2 = h5Var2.b(str, Collections.emptyList());
            } else {
                optList2 = JsonUtils.optList(a(str, new JSONArray()), Collections.emptyList());
            }
            ArrayList arrayList = new ArrayList(optList.size() + optList2.size());
            arrayList.addAll(optList);
            arrayList.addAll(optList2);
            return arrayList;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public long a(String str, long j) {
        long j2;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.e) {
            j2 = JsonUtils.getLong(this.d, str, j);
        }
        return j2;
    }

    public String a(String str, String str2) {
        String string;
        h5 h5Var = this.h;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.e) {
            string = JsonUtils.getString(this.d, str, str2);
        }
        return string;
    }

    public void a(String str, Object obj) {
        h5 h5Var = this.h;
        if (h5Var != null) {
            h5Var.a(str, obj);
            return;
        }
        synchronized (this.e) {
            JsonUtils.putObject(this.d, str, obj);
        }
    }

    private static /* synthetic */ Bundle a(h5 h5Var) {
        return JsonUtils.toBundle(h5Var.a("server_parameters", (JSONObject) null));
    }

    public String a(String str) {
        String a = a(str, "");
        return StringUtils.isValidString(a) ? a : b(str, "");
    }
}
