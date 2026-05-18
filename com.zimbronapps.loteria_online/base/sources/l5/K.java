package L5;

import S5.c1;
import S5.u2;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k {
    public final u2 a;
    public final b b;

    public k(u2 u2Var) {
        this.a = u2Var;
        c1 c1Var = u2Var.c;
        this.b = c1Var == null ? null : c1Var.M1();
    }

    public static k i(u2 u2Var) {
        if (u2Var != null) {
            return new k(u2Var);
        }
        return null;
    }

    public b a() {
        return this.b;
    }

    public String b() {
        return this.a.f;
    }

    public String c() {
        return this.a.h;
    }

    public String d() {
        return this.a.g;
    }

    public String e() {
        return this.a.e;
    }

    public String f() {
        return this.a.a;
    }

    public Bundle g() {
        return this.a.d;
    }

    public long h() {
        return this.a.b;
    }

    public final JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        u2 u2Var = this.a;
        jSONObject.put("Adapter", u2Var.a);
        jSONObject.put("Latency", u2Var.b);
        String e = e();
        if (e == null) {
            jSONObject.put("Ad Source Name", "null");
        } else {
            jSONObject.put("Ad Source Name", e);
        }
        String b = b();
        if (b == null) {
            jSONObject.put("Ad Source ID", "null");
        } else {
            jSONObject.put("Ad Source ID", b);
        }
        String d = d();
        if (d == null) {
            jSONObject.put("Ad Source Instance Name", "null");
        } else {
            jSONObject.put("Ad Source Instance Name", d);
        }
        String c = c();
        if (c == null) {
            jSONObject.put("Ad Source Instance ID", "null");
        } else {
            jSONObject.put("Ad Source Instance ID", c);
        }
        JSONObject jSONObject2 = new JSONObject();
        Bundle bundle = u2Var.d;
        for (String str : bundle.keySet()) {
            jSONObject2.put(str, bundle.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        b bVar = this.b;
        if (bVar == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", bVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return j().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
