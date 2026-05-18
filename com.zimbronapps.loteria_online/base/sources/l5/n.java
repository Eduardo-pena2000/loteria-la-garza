package L5;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends b {
    public final z e;

    public n(int i, String str, String str2, b bVar, z zVar) {
        super(i, str, str2, bVar);
        this.e = zVar;
    }

    public final JSONObject e() {
        JSONObject e = super.e();
        z f = f();
        if (f == null) {
            e.put("Response Info", "null");
        } else {
            e.put("Response Info", f.f());
        }
        return e;
    }

    public z f() {
        return this.e;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
