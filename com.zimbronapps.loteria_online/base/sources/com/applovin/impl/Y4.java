package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class y4 {
    protected final com.applovin.impl.sdk.k a;
    protected final Context b;
    protected final SharedPreferences c;
    private final Map d = new HashMap();
    private final Object e = new Object();

    public y4(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        Context o = com.applovin.impl.sdk.k.o();
        this.b = o;
        this.c = o.getSharedPreferences("com.applovin.sdk.1", 0);
        try {
            Class.forName(x4.class.getName());
            Class.forName(r3.class.getName());
        } catch (Throwable unused) {
        }
        d();
    }

    private void d() {
        String b = ((Boolean) a5.a(z4.j, Boolean.FALSE, com.applovin.impl.sdk.k.o())).booleanValue() ? "" : b();
        synchronized (this.e) {
            try {
                for (x4 x4Var : x4.c()) {
                    try {
                        Object a = this.a.a(b + x4Var.b(), null, x4Var.a().getClass(), this.c);
                        if (a != null) {
                            this.d.put(x4Var.b(), a);
                        }
                    } catch (Throwable th) {
                        com.applovin.impl.sdk.o.c("SettingsManager", "Unable to load \"" + x4Var.b() + "\"", th);
                        this.a.D().a("SettingsManager", "initSettings", th);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Object a(x4 x4Var) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        synchronized (this.e) {
            try {
                Object obj = this.d.get(x4Var.b());
                if (obj == null) {
                    return x4Var.a();
                }
                return x4Var.a(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public List b(x4 x4Var) {
        ArrayList arrayList = new ArrayList(6);
        Iterator it = c(x4Var).iterator();
        while (it.hasNext()) {
            arrayList.add(MaxAdFormat.formatFromString((String) it.next()));
        }
        return arrayList;
    }

    public List c(x4 x4Var) {
        return CollectionUtils.explode((String) a(x4Var));
    }

    public void e() {
        Boolean bool = (Boolean) a5.a(z4.j, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        String b = b();
        synchronized (this.e) {
            try {
                SharedPreferences.Editor edit = this.c.edit();
                for (x4 x4Var : x4.c()) {
                    Object obj = this.d.get(x4Var.b());
                    if (obj != null) {
                        String b2 = x4Var.b();
                        this.a.a(b + x4Var.b(), obj, edit);
                        if (bool.booleanValue()) {
                            this.a.a(b2, obj, edit);
                        }
                    }
                }
                if (((Boolean) this.a.a(x4.F6)).booleanValue()) {
                    a5.a(edit);
                } else {
                    edit.apply();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c() {
        return this.a.n0().isVerboseLoggingEnabled() || ((Boolean) a(x4.k)).booleanValue();
    }

    private String b() {
        return "com.applovin.sdk." + n7.f(this.a.i0()) + ".";
    }

    public void a(x4 x4Var, Object obj) {
        if (x4Var == null) {
            throw new IllegalArgumentException("No setting type specified");
        }
        if (obj != null) {
            synchronized (this.e) {
                this.d.put(x4Var.b(), obj);
            }
            return;
        }
        throw new IllegalArgumentException("No new value specified");
    }

    public void a(JSONObject jSONObject) {
        synchronized (this.e) {
            try {
                boolean booleanValue = JsonUtils.getBoolean(jSONObject, x4.u.b(), Boolean.FALSE).booleanValue();
                HashMap hashMap = booleanValue ? new HashMap() : null;
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    if (str != null && str.length() > 0) {
                        try {
                            x4 a = x4.a(str);
                            if (a != null) {
                                Object a2 = booleanValue ? a(a) : null;
                                Object a3 = a(str, jSONObject, a.a());
                                this.d.put(a.b(), a3);
                                if (a == x4.H5) {
                                    this.d.put(x4.I5.b(), Long.valueOf(System.currentTimeMillis()));
                                }
                                if (booleanValue && !a3.equals(a2)) {
                                    hashMap.put(a, a2);
                                }
                            }
                        } catch (JSONException e) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to parse JSON settingsValues array", e);
                            this.a.D().a("SettingsManager", "loadSettingsException", e);
                        } catch (Throwable th) {
                            com.applovin.impl.sdk.o.c("SettingsManager", "Unable to convert setting object ", th);
                            this.a.D().a("SettingsManager", "loadSettingsThrowable", th);
                        }
                    }
                }
                if (booleanValue && hashMap.size() > 0) {
                    v2 v2Var = new v2();
                    v2Var.a("========== UPDATED SETTINGS ==========");
                    for (x4 x4Var : hashMap.keySet()) {
                        v2Var.a(x4Var.b(), a(x4Var) + " (" + hashMap.get(x4Var) + ")");
                    }
                    v2Var.a("========== END ==========");
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("SettingsManager", v2Var.toString());
                    }
                }
                a5.b(z4.j, (Boolean) a(x4.T6), com.applovin.impl.sdk.k.o());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.e) {
            this.d.clear();
        }
        this.a.a(this.c);
    }

    private static Object a(String str, JSONObject jSONObject, Object obj) {
        if (obj instanceof Boolean) {
            return Boolean.valueOf(jSONObject.getBoolean(str));
        }
        if (obj instanceof Float) {
            return Float.valueOf((float) jSONObject.getDouble(str));
        }
        if (obj instanceof Double) {
            return Double.valueOf(jSONObject.getDouble(str));
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        if (obj instanceof Long) {
            return Long.valueOf(jSONObject.getLong(str));
        }
        if (obj instanceof String) {
            return jSONObject.getString(str);
        }
        throw new RuntimeException("SDK Error: unknown value type: " + obj.getClass());
    }
}
