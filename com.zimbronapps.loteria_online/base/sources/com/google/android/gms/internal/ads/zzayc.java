package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzayc implements PackageManager.OnChecksumsReadyListener {
    final zzhah zza = zzhah.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum a = j.a(list.get(i));
                if (k.a(a) == 8) {
                    zzhah zzhahVar = this.zza;
                    zzgxa zzi = zzgxa.zzn().zzi();
                    byte[] a2 = l.a(a);
                    zzhahVar.zza(zzi.zzj(a2, 0, a2.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}
