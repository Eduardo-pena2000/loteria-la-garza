package b6;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdjy;
import com.google.android.gms.internal.ads.zzdxt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class s0 implements zzdjy {
    public final zzdxt a;
    public final r0 b;
    public final String c;
    public final int d;

    public s0(zzdxt zzdxtVar, r0 r0Var, String str, int i) {
        this.a = zzdxtVar;
        this.b = r0Var;
        this.c = str;
        this.d = i;
    }

    public final void zzd(M m) {
        String str;
        if (m == null || this.d == 2) {
            return;
        }
        if (TextUtils.isEmpty(m.c)) {
            this.b.a(this.c, m.b, this.a);
            return;
        }
        try {
            str = new JSONObject(m.c).optString("request_id");
        } catch (JSONException e) {
            R5.t.l().zzg(e, "RenderSignals.getRequestId");
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.b.a(str, m.c, this.a);
    }

    public final void zze(String str) {
    }
}
