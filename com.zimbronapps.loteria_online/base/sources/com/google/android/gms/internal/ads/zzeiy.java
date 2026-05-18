package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeiy implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzejf zza;
    private final /* synthetic */ U5.z zzb;

    public /* synthetic */ zzeiy(zzejf zzejfVar, U5.z zVar) {
        this.zza = zzejfVar;
        this.zzb = zVar;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzm(this.zzb, dialogInterface, i);
    }
}
