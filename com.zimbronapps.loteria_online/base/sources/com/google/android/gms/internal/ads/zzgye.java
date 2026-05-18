package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgye extends zzgyg {
    public zzgye(x7.e eVar, Class cls, zzgyw zzgywVar) {
        super(eVar, cls, zzgywVar);
    }

    public final /* synthetic */ void zze(Object obj) {
        zzk((x7.e) obj);
    }

    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        x7.e zza = zzgywVar.zza(th);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}
