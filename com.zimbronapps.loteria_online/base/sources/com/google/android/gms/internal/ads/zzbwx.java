package com.google.android.gms.internal.ads;

import V5.o0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzbwx {
    private final zzcjl zza;
    private final String zzb;

    public zzbwx(zzcjl zzcjlVar, String str) {
        this.zza = zzcjlVar;
        this.zzb = str;
    }

    public final void zzg(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.zzb);
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar != null) {
                zzcjlVar.zzd("onError", put);
            }
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.zza.zzd("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = o0.b;
            W5.p.d("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.zza.zzd("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            int i5 = o0.b;
            W5.p.d("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.zza.zzd("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            int i = o0.b;
            W5.p.d("Error occurred while dispatching state change.", e);
        }
    }

    public final void zzl(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.zza.zzd("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            int i6 = o0.b;
            W5.p.d("Error occurred while obtaining screen information.", e);
        }
    }
}
