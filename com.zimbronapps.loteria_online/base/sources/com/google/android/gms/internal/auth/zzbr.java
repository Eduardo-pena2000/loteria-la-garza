package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbr extends zzbd {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbsVar) {
        this.zza = zzbsVar;
    }

    public final void zzc(String str) {
        if (str != null) {
            this.zza.setResult((m) new zzbv(str));
        } else {
            this.zza.setResult((m) new zzbv(new Status(3006)));
        }
    }
}
