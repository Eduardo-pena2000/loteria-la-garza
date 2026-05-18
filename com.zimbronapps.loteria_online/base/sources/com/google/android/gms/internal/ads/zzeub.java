package com.google.android.gms.internal.ads;

import S5.w2;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeub implements zzfav {
    private final w2 zza;
    private final boolean zzb;

    public zzeub(w2 w2Var, boolean z) {
        this.zza = w2Var;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgt)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        w2 w2Var = this.zza;
        if (w2Var != null) {
            int i = w2Var.a;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
