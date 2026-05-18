package com.google.android.gms.internal.ads;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgyl extends zzgyn {
    public zzgyl(x7.e eVar, zzgyw zzgywVar) {
        super(eVar, zzgywVar);
    }

    public final /* synthetic */ void zze(Object obj) {
        zzk((x7.e) obj);
    }

    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Object obj2) throws Exception {
        zzgyw zzgywVar = (zzgyw) obj;
        x7.e zza = zzgywVar.zza(obj2);
        zzgrc.zzl(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgywVar);
        return zza;
    }
}
