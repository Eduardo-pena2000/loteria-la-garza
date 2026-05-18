package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzckw {
    private final zzckv zza;
    private final zzckx zzb;

    public zzckw(zzckx zzckxVar, zzckv zzckvVar) {
        this.zza = zzckvVar;
        this.zzb = zzckxVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            o0.k("Click string is empty, not proceeding.");
            return "";
        }
        zzckx zzckxVar = this.zzb;
        zzazh zzS = ((zzcle) zzckxVar).zzS();
        if (zzS == null) {
            o0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzazc zzb = zzS.zzb();
        if (zzb == null) {
            o0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckxVar.getContext() != null) {
            return zzb.zzf(zzckxVar.getContext(), str, ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
        }
        o0.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzckx zzckxVar = this.zzb;
        zzazh zzS = ((zzcle) zzckxVar).zzS();
        if (zzS == null) {
            o0.k("Signal utils is empty, ignoring.");
            return "";
        }
        zzazc zzb = zzS.zzb();
        if (zzb == null) {
            o0.k("Signals object is empty, ignoring.");
            return "";
        }
        if (zzckxVar.getContext() != null) {
            return zzb.zzj(zzckxVar.getContext(), ((zzclg) zzckxVar).zzE(), zzckxVar.zzj());
        }
        o0.k("Context is null, ignoring.");
        return "";
    }

    @JavascriptInterface
    public String getViewSignalsJson() {
        zzckx zzckxVar = this.zzb;
        zzbhe.zza(zzckxVar.getContext());
        String viewSignals = getViewSignals();
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzpi)).booleanValue()) {
            return viewSignals;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ms", viewSignals);
            zzclj zzP = ((zzcjl) zzckxVar).zzP();
            zzczz zzK = zzP != null ? zzP.zzK() : null;
            if (zzK != null) {
                long zza = zzK.zza();
                if (zza > 0) {
                    jSONObject.put("plcmtid", zza);
                }
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            o0.l("Error constructing JSON.", e);
            return "";
        }
    }

    @JavascriptInterface
    public void notify(String str) {
        if (!TextUtils.isEmpty(str)) {
            F0.l.post(new zzckt(this, str));
        } else {
            int i = o0.b;
            W5.p.f("URL is empty, ignoring message");
        }
    }

    public final /* synthetic */ void zza(String str) {
        this.zza.zza(Uri.parse(str));
    }
}
