package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebView;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import t4.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfst implements i.a {
    final /* synthetic */ zzfsv zza;

    public zzfst(zzfsv zzfsvVar) {
        Objects.requireNonNull(zzfsvVar);
        this.zza = zzfsvVar;
    }

    public final void onPostMessage(WebView webView, t4.e eVar, Uri uri, boolean z, t4.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject(eVar.b());
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getJSONObject("data").getString("adSessionId");
            if (string.equals("startSession")) {
                this.zza.zzf(string2);
            } else if (string.equals("finishSession")) {
                this.zza.zzg(string2);
            } else {
                zzfsg.zza.booleanValue();
            }
        } catch (JSONException e) {
            zzfue.zza("Error parsing JS message in JavaScriptSessionService.", e);
        }
    }
}
