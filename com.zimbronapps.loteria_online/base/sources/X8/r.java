package x8;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class r {
    public final l8.b a;
    public final Map b = Collections.synchronizedMap(new HashMap());

    public r(l8.b bVar) {
        this.a = bVar;
    }

    public void a(String str, com.google.firebase.remoteconfig.internal.b bVar) {
        JSONObject optJSONObject;
        F7.a aVar = (F7.a) this.a.get();
        if (aVar == null) {
            return;
        }
        JSONObject i = bVar.i();
        if (i.length() < 1) {
            return;
        }
        JSONObject g = bVar.g();
        if (g.length() >= 1 && (optJSONObject = i.optJSONObject(str)) != null) {
            String optString = optJSONObject.optString("choiceId");
            if (optString.isEmpty()) {
                return;
            }
            synchronized (this.b) {
                try {
                    if (optString.equals(this.b.get(str))) {
                        return;
                    }
                    this.b.put(str, optString);
                    Bundle bundle = new Bundle();
                    bundle.putString("arm_key", str);
                    bundle.putString("arm_value", g.optString(str));
                    bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                    bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                    bundle.putString("group", optJSONObject.optString("group"));
                    aVar.a("fp", "personalization_assignment", bundle);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("_fpid", optString);
                    aVar.a("fp", "_fpc", bundle2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
