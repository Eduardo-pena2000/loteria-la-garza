package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcvp implements zzbde {
    private final zzcjl zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcvp(zzcjl zzcjlVar, Executor executor) {
        this.zza = zzcjlVar;
        this.zzb = executor;
    }

    public final synchronized void zzdj(zzbdd zzbddVar) {
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar != null) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzob)).booleanValue()) {
                if (zzbddVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        this.zzb.execute(new zzcvo(zzcjlVar));
                    }
                } else {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        this.zzb.execute(new zzcvn(zzcjlVar));
                    }
                }
            }
        }
    }
}
