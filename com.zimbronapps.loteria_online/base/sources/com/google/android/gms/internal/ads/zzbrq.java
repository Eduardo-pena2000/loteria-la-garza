package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbrq implements zzboh {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbsk zzb;
    final /* synthetic */ zzbrg zzc;
    final /* synthetic */ zzbsl zzd;

    public zzbrq(zzbsl zzbslVar, long j, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zza = j;
        this.zzb = zzbskVar;
        this.zzc = zzbrgVar;
        Objects.requireNonNull(zzbslVar);
        this.zzd = zzbslVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        long a = R5.t.o().a() - this.zza;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 42);
        sb.append("onGmsg /jsLoaded. JsLoaded latency is ");
        sb.append(a);
        sb.append(" ms.");
        o0.k(sb.toString());
        o0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzbsl zzbslVar = this.zzd;
        synchronized (zzbslVar.zzg()) {
            o0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzbsk zzbskVar = this.zzb;
            if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                zzbslVar.zzl(0);
                zzbrg zzbrgVar = this.zzc;
                zzbrgVar.zzm("/log", zzbog.zzg);
                zzbrgVar.zzm("/result", zzbog.zzo);
                zzbskVar.zzf(zzbrgVar);
                zzbslVar.zzj(zzbskVar);
                o0.k("Successfully loaded JS Engine.");
                o0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            o0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
