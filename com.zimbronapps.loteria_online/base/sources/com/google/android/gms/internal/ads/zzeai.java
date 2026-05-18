package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeai implements Runnable {
    private final /* synthetic */ zzcen zza;

    public /* synthetic */ zzeai(zzeak zzeakVar, zzcen zzcenVar) {
        this.zza = zzcenVar;
    }

    public final /* synthetic */ void run() {
        String zzd = R5.t.l().zzo().zzi().zzd();
        boolean isEmpty = TextUtils.isEmpty(zzd);
        zzcen zzcenVar = this.zza;
        if (isEmpty) {
            zzcenVar.zzd(new Exception());
        } else {
            zzcenVar.zzc(zzd);
        }
    }
}
