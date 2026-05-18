package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    public final void zzc(boolean z) {
        this.zza.setResult((m) new zzak(z ? Status.f : zzal.zza()));
    }
}
