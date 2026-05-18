package L5;

import S5.c1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b {
    public final int a;
    public final String b;
    public final String c;
    public final b d;

    public b(int i, String str, String str2, b bVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = bVar;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public final c1 d() {
        c1 c1Var;
        b bVar = this.d;
        if (bVar == null) {
            c1Var = null;
        } else {
            String str = bVar.c;
            c1Var = new c1(bVar.a, bVar.b, str, null, null);
        }
        return new c1(this.a, this.b, this.c, c1Var, null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.a);
        jSONObject.put("Message", this.b);
        jSONObject.put("Domain", this.c);
        b bVar = this.d;
        if (bVar == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", bVar.e());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    public b(int i, String str, String str2) {
        this(i, str, str2, null);
    }
}
