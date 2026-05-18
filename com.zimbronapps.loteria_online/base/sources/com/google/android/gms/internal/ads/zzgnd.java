package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;
import s1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzgnd implements PackageManager.OnChecksumsReadyListener {
    private final /* synthetic */ c.a zza;

    public /* synthetic */ zzgnd(c.a aVar) {
        this.zza = aVar;
    }

    public final /* synthetic */ void onChecksumsReady(List list) {
        c.a aVar = this.zza;
        if (list == null) {
            aVar.c("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum a = j.a(list.get(i));
                if (k.a(a) == 8) {
                    zzgxa zzi = zzgxa.zzn().zzi();
                    byte[] a2 = l.a(a);
                    aVar.c(zzi.zzj(a2, 0, a2.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        aVar.c("");
    }
}
