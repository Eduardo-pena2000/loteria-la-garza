package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzewc implements zzikg {
    public static zzewc zza() {
        return zzewb.zza;
    }

    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbgv zzbgvVar = zzbhe.zzni;
        if (!((String) S5.D.c().zzd(zzbgvVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) S5.D.c().zzd(zzbgvVar)).split(","));
        }
        zziko.zzb(arrayList);
        return arrayList;
    }
}
