package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbru implements zzcer {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzfoe zzb;
    final /* synthetic */ zzbsl zzc;

    public zzbru(zzbsl zzbslVar, zzbsk zzbskVar, zzfoe zzfoeVar) {
        this.zza = zzbskVar;
        this.zzb = zzfoeVar;
        Objects.requireNonNull(zzbslVar);
        this.zzc = zzbslVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        o0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        zzbsl zzbslVar = this.zzc;
        synchronized (zzbslVar.zzg()) {
            try {
                o0.k("loadNewJavascriptEngine (success): Lock acquired");
                zzbslVar.zzl(0);
                if (zzbslVar.zzi() != null && this.zza != zzbslVar.zzi()) {
                    o0.k("New JS engine is loaded, marking previous one as destroyable.");
                    zzbslVar.zzi().zzc();
                }
                zzbslVar.zzj(this.zza);
                if (((Boolean) zzbix.zzd.zze()).booleanValue() && zzbslVar.zzh() != null) {
                    zzfor zzh = zzbslVar.zzh();
                    zzfoe zzfoeVar = this.zzb;
                    zzfoeVar.zzd(true);
                    zzh.zzb(zzfoeVar.zzm());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
