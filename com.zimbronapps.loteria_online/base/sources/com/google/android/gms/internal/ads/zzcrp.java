package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.InputEvent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcrp implements zzgyw {
    private final /* synthetic */ zzcrv zza;
    private final /* synthetic */ Uri.Builder zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ InputEvent zzd;

    public /* synthetic */ zzcrp(zzcrv zzcrvVar, Uri.Builder builder, String str, InputEvent inputEvent) {
        this.zza = zzcrvVar;
        this.zzb = builder;
        this.zzc = str;
        this.zzd = inputEvent;
    }

    public final /* synthetic */ x7.e zza(Object obj) {
        return this.zza.zze(this.zzb, this.zzc, this.zzd, (Integer) obj);
    }
}
