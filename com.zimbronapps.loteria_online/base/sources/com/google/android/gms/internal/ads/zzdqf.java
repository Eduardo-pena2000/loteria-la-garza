package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzdqf implements zzgzl {
    final /* synthetic */ zzdqh zza;

    public zzdqf(zzdqh zzdqhVar) {
        Objects.requireNonNull(zzdqhVar);
        this.zza = zzdqhVar;
    }

    public final void zza(Throwable th) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgr)).booleanValue()) {
            R5.t.l().zzg(th, "omid native display exp");
        }
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcjl zzcjlVar = (zzcjl) list.get(0);
            if (zzcjlVar != null) {
                this.zza.zza(zzcjlVar);
            }
        } catch (IndexOutOfBoundsException | ClassCastException e) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzgr)).booleanValue()) {
                R5.t.l().zzg(e, "omid native display exp");
            }
        }
    }
}
