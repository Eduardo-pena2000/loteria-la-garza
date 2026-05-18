package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfzs extends Ia.l implements Qa.p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfzs(zzfyu zzfyuVar, Ga.e eVar) {
        super(2, eVar);
        this.zzb = zzfyuVar;
    }

    public final Ga.e create(Object obj, Ga.e eVar) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, eVar);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zzfyy) obj, (Ga.e) obj2).invokeSuspend(Ca.I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        Ca.t.b(obj);
        zzfza zza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzbp());
        zziev zzb = zza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String zza2 = zzfyuVar.zza();
        kotlin.jvm.internal.t.f(zza2, "getGwsQueryId(...)");
        zza.zzc(zzb, zza2, zzfyuVar);
        return zza.zza();
    }
}
