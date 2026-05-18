package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzejd implements DialogInterface.OnCancelListener {
    private final /* synthetic */ U5.z zza;

    public /* synthetic */ zzejd(U5.z zVar) {
        this.zza = zVar;
    }

    public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
        U5.z zVar = this.zza;
        if (zVar != null) {
            zVar.zzb();
        }
    }
}
