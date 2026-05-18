package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeja implements DialogInterface.OnClickListener {
    private final /* synthetic */ zzejf zza;
    private final /* synthetic */ Activity zzb;
    private final /* synthetic */ U5.z zzc;

    public /* synthetic */ zzeja(zzejf zzejfVar, Activity activity, U5.z zVar) {
        this.zza = zzejfVar;
        this.zzb = activity;
        this.zzc = zVar;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzo(this.zzb, this.zzc, dialogInterface, i);
    }
}
