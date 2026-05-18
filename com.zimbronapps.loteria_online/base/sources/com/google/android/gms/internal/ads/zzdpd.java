package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdpd implements zzbkf {
    final /* synthetic */ zzdqe zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdpd(zzdqe zzdqeVar, ViewGroup viewGroup) {
        this.zza = zzdqeVar;
        this.zzb = viewGroup;
    }

    public final void zza() {
        zzguf zzgufVar = zzdpc.zza;
        zzdqe zzdqeVar = this.zza;
        Map zzk = zzdqeVar.zzk();
        if (zzk == null) {
            return;
        }
        int size = zzgufVar.size();
        int i = 0;
        while (i < size) {
            Object obj = zzk.get((String) zzgufVar.get(i));
            i++;
            if (obj != null) {
                zzdqeVar.onClick(this.zzb);
                return;
            }
        }
    }

    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }

    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
