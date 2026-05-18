package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdss implements zzbkf {
    final /* synthetic */ String zza = "_videoMediaView";
    final /* synthetic */ zzdst zzb;

    public zzdss(zzdst zzdstVar, String str) {
        Objects.requireNonNull(zzdstVar);
        this.zzb = zzdstVar;
    }

    public final void zza() {
        zzdst zzdstVar = this.zzb;
        if (zzdstVar.zzc() != null) {
            zzdstVar.zzc().zza(this.zza);
        }
    }

    public final void zzb(MotionEvent motionEvent) {
    }

    public final JSONObject zzc() {
        return null;
    }

    public final JSONObject zzd() {
        return null;
    }
}
