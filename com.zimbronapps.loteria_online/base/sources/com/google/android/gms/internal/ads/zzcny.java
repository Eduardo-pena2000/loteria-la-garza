package com.google.android.gms.internal.ads;

import S5.q2;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzcny implements zzffh {
    private final zzcnp zza;
    private Context zzb;
    private String zzc;
    private q2 zzd;

    public /* synthetic */ zzcny(zzcnp zzcnpVar, byte[] bArr) {
        this.zza = zzcnpVar;
    }

    public final zzffi zza() {
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, String.class);
        zziko.zzc(this.zzd, q2.class);
        return new zzcnz(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final /* bridge */ /* synthetic */ zzffh zzb(q2 q2Var) {
        q2Var.getClass();
        this.zzd = q2Var;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzffh zzc(String str) {
        str.getClass();
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzffh zzd(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }
}
