package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Collections;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class v6 extends q6 {
    public v6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    public static /* synthetic */ void a(v6 v6Var, JSONObject jSONObject) {
        v6Var.c(jSONObject);
    }

    private o4 b(JSONObject jSONObject) {
        Map emptyMap;
        String str;
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        r0.c(jSONObject2, this.a);
        r0.b(jSONObject, this.a);
        r0.a(jSONObject, this.a);
        try {
            emptyMap = JsonUtils.toStringMap((JSONObject) jSONObject2.get("params"));
        } catch (Throwable unused) {
            emptyMap = Collections.emptyMap();
        }
        try {
            str = jSONObject2.getString("result");
        } catch (Throwable unused2) {
            str = "network_timeout";
        }
        return o4.a(str, emptyMap);
    }

    private void c(JSONObject jSONObject) {
        o4 b = b(jSONObject);
        a(b);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Pending reward handled: " + b);
        }
    }

    public abstract void a(o4 o4Var);

    public int g() {
        return ((Integer) this.a.a(x4.e1)).intValue();
    }

    public abstract boolean h();

    public void run() {
        a(e(), new a());
    }

    public class a implements q0.e {
        public a() {
        }

        public void a(String str, JSONObject jSONObject, int i) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.c.b(v6Var.b, "Reward validation succeeded with code " + i + " but task was cancelled already");
                }
                com.applovin.impl.sdk.o oVar2 = v6.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var2 = v6.this;
                    v6Var2.c.b(v6Var2.b, "Response: " + jSONObject);
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar3 = v6.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var3 = v6.this;
                v6Var3.c.a(v6Var3.b, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
            }
            v6.a(v6.this, jSONObject);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            if (v6.this.h()) {
                com.applovin.impl.sdk.o oVar = v6.this.c;
                if (com.applovin.impl.sdk.o.a()) {
                    v6 v6Var = v6.this;
                    v6Var.c.b(v6Var.b, "Reward validation failed with error code " + i + " but task was cancelled already");
                    return;
                }
                return;
            }
            com.applovin.impl.sdk.o oVar2 = v6.this.c;
            if (com.applovin.impl.sdk.o.a()) {
                v6 v6Var2 = v6.this;
                v6Var2.c.b(v6Var2.b, "Reward validation failed with code " + i + " and error: " + str2);
            }
            v6.this.a(i);
        }
    }
}
