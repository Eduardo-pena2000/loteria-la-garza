package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfzu extends Ia.l implements Qa.p {
    int zza;
    final /* synthetic */ zzgaf zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzu(zzgaf zzgafVar, String str, Ga.e eVar) {
        super(2, eVar);
        this.zzb = zzgafVar;
        this.zzc = str;
    }

    public final Ga.e create(Object obj, Ga.e eVar) {
        return new zzfzu(this.zzb, this.zzc, eVar);
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
            String str = this.zzc;
            this.zza = 1;
            if (zzgafVar.zzi(str, this) == f) {
                return f;
            }
        }
        return Ca.I.a;
    }
}
