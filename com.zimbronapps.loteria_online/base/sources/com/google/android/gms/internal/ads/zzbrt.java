package com.google.android.gms.internal.ads;

import V5.o0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbrt implements Runnable {
    final /* synthetic */ zzbsk zza;
    final /* synthetic */ zzbrg zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbsl zze;

    public zzbrt(zzbsl zzbslVar, zzbsk zzbskVar, zzbrg zzbrgVar, ArrayList arrayList, long j) {
        this.zza = zzbskVar;
        this.zzb = zzbrgVar;
        this.zzc = arrayList;
        this.zzd = j;
        Objects.requireNonNull(zzbslVar);
        this.zze = zzbslVar;
    }

    public final void run() {
        String sb;
        o0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbsl zzbslVar = this.zze;
        synchronized (zzbslVar.zzg()) {
            try {
                o0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbsk zzbskVar = this.zza;
                if (zzbskVar.zzi() != -1 && zzbskVar.zzi() != 1) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zziK)).booleanValue()) {
                        zzbskVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbskVar.zzg();
                    }
                    zzgzy zzgzyVar = zzcei.zzf;
                    zzbrg zzbrgVar = this.zzb;
                    Objects.requireNonNull(zzbrgVar);
                    zzgzyVar.execute(new zzbrs(zzbrgVar));
                    String valueOf = String.valueOf(S5.D.c().zzd(zzbhe.zze));
                    int zzi = zzbskVar.zzi();
                    int zzk = zzbslVar.zzk();
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        sb = ". Still waiting for the engine to be loaded";
                    } else {
                        String valueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(valueOf2);
                        sb = sb2.toString();
                    }
                    long a = R5.t.o().a() - this.zzd;
                    StringBuilder sb3 = new StringBuilder(valueOf.length() + 107 + String.valueOf(zzi).length() + 36 + String.valueOf(zzk).length() + sb.length() + 39 + String.valueOf(a).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(valueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(zzi);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(zzk);
                    sb3.append(sb);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(a);
                    sb3.append(" ms at timeout. Rejecting.");
                    o0.k(sb3.toString());
                    o0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                o0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
