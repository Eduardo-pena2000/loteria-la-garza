package com.google.android.gms.internal.ads;

import V5.Y;
import V5.o0;
import java.util.Map;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbrr implements zzboh {
    final /* synthetic */ zzbrg zza;
    final /* synthetic */ Y zzb;
    final /* synthetic */ zzbsl zzc;

    public zzbrr(zzbsl zzbslVar, zzazh zzazhVar, zzbrg zzbrgVar, Y y) {
        this.zza = zzbrgVar;
        this.zzb = y;
        Objects.requireNonNull(zzbslVar);
        this.zzc = zzbslVar;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        o0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzbsl zzbslVar = this.zzc;
        synchronized (zzbslVar.zzg()) {
            try {
                o0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                W5.p.e("JS Engine is requesting an update");
                if (zzbslVar.zzk() == 0) {
                    W5.p.e("Starting reload.");
                    zzbslVar.zzl(2);
                    zzbslVar.zza(null);
                }
                this.zza.zzn("/requestReload", (zzboh) this.zzb.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        o0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
