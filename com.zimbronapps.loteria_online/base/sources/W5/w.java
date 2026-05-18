package W5;

import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w {
    public final y a;

    public w(y yVar) {
        this.a = yVar;
    }

    public static w b(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("ping_strategy");
        return new w(optJSONObject == null ? new o(1, 0, 1.0d, false) : new o(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
    }

    public final y a() {
        return this.a;
    }
}
