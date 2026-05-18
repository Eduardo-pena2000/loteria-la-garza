package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzbca implements PackageManager.OnChecksumsReadyListener {
    private final /* synthetic */ zzhah zza;

    public /* synthetic */ zzbca(zzhah zzhahVar) {
        this.zza = zzhahVar;
    }

    public final /* synthetic */ void onChecksumsReady(List list) {
        zzhah zzhahVar = this.zza;
        if (list == null) {
            zzhahVar.zza((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum a = j.a(list.get(i));
                if (k.a(a) == 8) {
                    zzhahVar.zza(zzban.zza(l.a(a)));
                    return;
                }
            }
            zzhahVar.zza((Object) null);
        } catch (Throwable unused) {
            zzhahVar.zza((Object) null);
        }
    }
}
