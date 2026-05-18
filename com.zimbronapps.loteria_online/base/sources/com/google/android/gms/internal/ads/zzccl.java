package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzccl {
    private Context zza;
    private E6.f zzb;
    private q0 zzc;
    private zzccq zzd;

    private zzccl() {
        throw null;
    }

    public final zzccl zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzccl zzb(E6.f fVar) {
        fVar.getClass();
        this.zzb = fVar;
        return this;
    }

    public final zzccl zzc(q0 q0Var) {
        this.zzc = q0Var;
        return this;
    }

    public final zzccl zzd(zzccq zzccqVar) {
        this.zzd = zzccqVar;
        return this;
    }

    public final zzccr zze() {
        zziko.zzc(this.zza, Context.class);
        zziko.zzc(this.zzb, E6.f.class);
        zziko.zzc(this.zzc, q0.class);
        zziko.zzc(this.zzd, zzccq.class);
        return new zzccm(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public /* synthetic */ zzccl(byte[] bArr) {
    }
}
