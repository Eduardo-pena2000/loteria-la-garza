package com.google.android.gms.internal.ads;

import V5.l0;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfdq implements Callable {
    static final /* synthetic */ zzfdq zza = new zzfdq();

    private /* synthetic */ zzfdq() {
    }

    public final /* synthetic */ Object call() {
        HashMap hashMap = new HashMap();
        String str = (String) S5.D.c().zzd(zzbhe.zzat);
        if (str != null && !str.isEmpty()) {
            if (Build.VERSION.SDK_INT >= ((Integer) S5.D.c().zzd(zzbhe.zzau)).intValue()) {
                for (String str2 : str.split(",", -1)) {
                    hashMap.put(str2, l0.a(str2));
                }
            }
        }
        return new zzfds(hashMap);
    }
}
