package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfzo extends Ia.l implements Qa.p {
    public zzfzo(Ga.e eVar) {
        super(2, eVar);
    }

    public final Ga.e create(Object obj, Ga.e eVar) {
        return new zzfzo(eVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((zzfyy) obj, (Ga.e) obj2).invokeSuspend(Ca.I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Ha.c.f();
        Ca.t.b(obj);
        zzfyy zzd = zzfyy.zzd();
        kotlin.jvm.internal.t.f(zzd, "getDefaultInstance(...)");
        return zzd;
    }
}
