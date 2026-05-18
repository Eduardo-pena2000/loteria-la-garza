package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbge implements Runnable {
    private final /* synthetic */ zzbgi zza;
    private final /* synthetic */ Context zzb;

    public /* synthetic */ zzbge(zzbgi zzbgiVar, Context context) {
        this.zza = zzbgiVar;
        this.zzb = context;
    }

    public final /* synthetic */ void run() {
        boolean booleanValue = ((Boolean) S5.D.c().zzd(zzbhe.zzgd)).booleanValue();
        Context context = this.zzb;
        zzbgi zzbgiVar = this.zza;
        if (booleanValue) {
            try {
                zzbgiVar.zza = (zzbda) W5.t.a(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", zzbgf.zza);
                zzbgiVar.zza.zze(N6.b.s1(context), "GMA_SDK");
                zzbgiVar.zzb = true;
            } catch (W5.s | RemoteException | NullPointerException unused) {
                W5.p.a("Cannot dynamite load clearcut");
            }
        }
    }
}
