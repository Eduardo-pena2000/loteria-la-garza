package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzclt {
    private final zzclk zza;
    private final zzdxz zzb;

    public zzclt(zzclk zzclkVar, zzdxz zzdxzVar) {
        this.zza = zzclkVar;
        this.zzb = zzdxzVar;
    }

    public final void zza(Context context, W5.a aVar) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpr)).booleanValue()) {
            ThreadPoolExecutor threadPoolExecutor = zzcei.zza;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpt)).booleanValue()) {
                zzcls zzclsVar = new zzcls(((Integer) S5.D.c().zzd(zzbhe.zzpv)).intValue(), null);
                int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzpu)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(intValue, intValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzclsVar);
            }
            threadPoolExecutor.execute(new zzclq(this, context, aVar));
        }
    }

    public final /* synthetic */ void zzb(Context context, W5.a aVar) {
        long b = R5.t.o().b();
        R5.t.g().R(context, aVar.a);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzps)).booleanValue()) {
            long b2 = R5.t.o().b() - b;
            zzdxy zza = this.zzb.zza();
            zza.zzc("action", "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length());
            sb.append(b2);
            zza.zzc("webview_startup_l", sb.toString());
            zza.zzd();
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpy)).booleanValue()) {
            zzcei.zzf.execute(new zzclp(this));
        }
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzb(new zzclo(this, R5.t.o().b()));
    }

    public final /* synthetic */ zzdxz zzd() {
        return this.zzb;
    }
}
