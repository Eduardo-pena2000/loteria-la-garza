package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcmw implements zzikg {
    private final zzikp zza;
    private final zzikp zzb;

    private zzcmw(zzikp zzikpVar, zzikp zzikpVar2) {
        this.zza = zzikpVar;
        this.zzb = zzikpVar2;
    }

    public static zzcmw zza(zzikp zzikpVar, zzikp zzikpVar2) {
        return new zzcmw(zzikpVar, zzikpVar2);
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return G6.e.a(((zzcmj) this.zza).zza()).f(((ApplicationInfo) this.zzb.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
