package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeyy implements zzfav {
    private final zzfjk zza;
    private final PackageInfo zzb;
    private final q0 zzc;

    public zzeyy(zzfjk zzfjkVar, PackageInfo packageInfo, q0 q0Var) {
        this.zza = zzfjkVar;
        this.zzb = packageInfo;
        this.zzc = q0Var;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbkh zzbkhVar = this.zza.zzj;
        if (zzbkhVar == null || (i = zzbkhVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbkhVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeyy.zza(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzdah zzdahVar = (zzdah) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzdahVar.zzb);
    }
}
