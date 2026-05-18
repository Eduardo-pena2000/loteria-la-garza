package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbrz implements zzbrf {
    private final /* synthetic */ zzbsl zza;
    private final /* synthetic */ ArrayList zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ zzbsk zzd;
    private final /* synthetic */ zzbrg zze;

    public /* synthetic */ zzbrz(zzbsl zzbslVar, ArrayList arrayList, long j, zzbsk zzbskVar, zzbrg zzbrgVar) {
        this.zza = zzbslVar;
        this.zzb = arrayList;
        this.zzc = j;
        this.zzd = zzbskVar;
        this.zze = zzbrgVar;
    }

    public final /* synthetic */ void zza() {
        long a = R5.t.o().a();
        long j = this.zzc;
        ArrayList arrayList = this.zzb;
        arrayList.add(Long.valueOf(a - j));
        String valueOf = String.valueOf(arrayList.get(0));
        StringBuilder sb = new StringBuilder(valueOf.length() + 52);
        sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
        sb.append(valueOf);
        sb.append(" ms.");
        o0.k(sb.toString());
        F0.l.postDelayed(new zzbsa(this.zza, this.zzd, this.zze, arrayList, j), ((Integer) S5.D.c().zzd(zzbhe.zzd)).intValue());
    }
}
