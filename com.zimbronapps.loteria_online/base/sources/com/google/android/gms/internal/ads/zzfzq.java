package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfzq extends Ia.l implements Qa.p {
    int zza;
    final /* synthetic */ zzgaf zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzq(zzgaf zzgafVar, Ga.e eVar) {
        super(2, eVar);
        this.zzb = zzgafVar;
    }

    public final Ga.e create(Object obj, Ga.e eVar) {
        return new zzfzq(this.zzb, eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((cb.O) obj, (Ga.e) obj2).invokeSuspend(Ca.I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = Ha.c.f();
        int i = this.zza;
        Ca.t.b(obj);
        if (i == 0) {
            zzgaf zzgafVar = this.zzb;
            this.zza = 1;
            if (zzgafVar.zzj(this) == f) {
                return f;
            }
        }
        return Ca.I.a;
    }
}
