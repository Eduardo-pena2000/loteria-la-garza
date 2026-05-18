package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfzl extends Ia.l implements Qa.p {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzl(String str, Ga.e eVar) {
        super(2, eVar);
        this.zzb = str;
    }

    public final Ga.e create(Object obj, Ga.e eVar) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, eVar);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zzfyy) obj, (Ga.e) obj2).invokeSuspend(Ca.I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        Ca.t.b(obj);
        zzfza zza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzbp());
        zza.zzd(zza.zzb(), this.zzb);
        return zza.zza();
    }
}
