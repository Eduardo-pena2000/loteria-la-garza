package com.google.android.gms.internal.firebase-auth-api;

import K7.q;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzabt implements zzafv {
    private final /* synthetic */ zzaio zza;
    private final /* synthetic */ zzael zzb;

    public zzabt(zzaar zzaarVar, zzaio zzaioVar, zzael zzaelVar) {
        this.zza = zzaioVar;
        this.zzb = zzaelVar;
        Objects.requireNonNull(zzaarVar);
    }

    public final void zza(String str) {
        this.zzb.zza(q.a(str));
    }

    public final /* synthetic */ void zza(Object obj) {
        zzair zzairVar = (zzair) obj;
        zzaio zzaioVar = this.zza;
        if (zzaioVar instanceof zzais) {
            this.zzb.zzb(zzairVar.zza());
            return;
        }
        if (zzaioVar instanceof zzaiu) {
            this.zzb.zza(zzairVar);
            return;
        }
        throw new IllegalArgumentException("startMfaEnrollmentRequest must be an instance of either StartPhoneMfaEnrollmentRequest or StartTotpMfaEnrollmentRequest but was " + this.zza.getClass().getName() + ".");
    }
}
