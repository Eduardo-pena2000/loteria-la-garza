package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbrv implements zzcep {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzbsl zzc;

    public zzbrv(zzbsl zzbslVar, zzbsk zzbskVar, zzfoe zzfoeVar) {
        this.zza = zzbskVar;
        this.zzb = zzfoeVar;
        Objects.requireNonNull(zzbslVar);
        this.zzc = zzbslVar;
    }

    public final void zza() {
        o0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        zzbsl zzbslVar = this.zzc;
        synchronized (zzbslVar.zzg()) {
            try {
                o0.k("loadNewJavascriptEngine (failure): Lock acquired");
                zzbslVar.zzl(1);
                o0.k("Failed loading new engine. Marking new engine destroyable.");
                this.zza.zzc();
                if (((Boolean) zzbix.zzd.zze()).booleanValue() && zzbslVar.zzh() != null) {
                    zzfor zzh = zzbslVar.zzh();
                    zzfoe zzfoeVar = this.zzb;
                    zzfoeVar.zzk("Failed loading new engine");
                    zzfoeVar.zzd(false);
                    zzh.zzb(zzfoeVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
