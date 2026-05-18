package com.applovin.impl;

import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class o6 extends q6 {
    public o6(String str, com.applovin.impl.sdk.k kVar) {
        super(str, kVar);
    }

    private JSONObject a(o4 o4Var) {
        JSONObject e = e();
        JsonUtils.putString(e, "result", o4Var.b());
        Map a2 = o4Var.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(e, "params", new JSONObject(a2));
        }
        return e;
    }

    public abstract void b(JSONObject jSONObject);

    public int g() {
        return ((Integer) this.a.a(x4.f1)).intValue();
    }

    public abstract o4 h();

    public abstract void i();

    public void run() {
        o4 h = h();
        if (h == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Pending reward not found");
            }
            i();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Reporting pending reward: " + h + "...");
        }
        a(a(h), new a());
    }

    public class a implements q0.e {
        public a() {
        }

        public void a(String str, JSONObject jSONObject, int i) {
            o6.this.b(jSONObject);
        }

        public void a(String str, int i, String str2, JSONObject jSONObject) {
            o6.this.a(i);
        }
    }
}
