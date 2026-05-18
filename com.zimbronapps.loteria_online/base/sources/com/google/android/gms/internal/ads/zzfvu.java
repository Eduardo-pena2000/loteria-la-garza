package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfvu implements OnFailureListener {
    private final /* synthetic */ zzfvx zza;

    public /* synthetic */ zzfvu(zzfvx zzfvxVar) {
        this.zza = zzfvxVar;
    }

    public final /* synthetic */ void onFailure(Exception exc) {
        this.zza.zzd(exc);
    }
}
