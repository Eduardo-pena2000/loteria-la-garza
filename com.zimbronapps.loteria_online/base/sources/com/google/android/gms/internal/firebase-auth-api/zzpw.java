package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpw {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzpw(zzpy zzpyVar, zzqa zzqaVar) {
        this(zzpyVar);
    }

    public static zzpy zza() {
        return new zzpy((zzqa) null);
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzpw zzpwVar) {
        return zzpwVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzpw zzpwVar) {
        return zzpwVar.zzb;
    }

    private zzpw(zzpy zzpyVar) {
        this.zza = new HashMap(zzpy.zza(zzpyVar));
        this.zzb = new HashMap(zzpy.zzb(zzpyVar));
    }

    public static zzpy zza(zzpw zzpwVar) {
        return new zzpy(zzpwVar, null);
    }

    public static /* synthetic */ Object zza(zzpw zzpwVar, zzpz zzpzVar, zzoa zzoaVar) {
        return zzpwVar.zza(zzoaVar.zzb(), zzpzVar.zza());
    }

    public final Object zza(zzbi zzbiVar, Class cls) throws GeneralSecurityException {
        zzpx zzpxVar = new zzpx(zzbiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzpxVar)) {
            return ((zzps) this.zza.get(zzpxVar)).zza(zzbiVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzpxVar) + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final Object zza(zzob zzobVar, zzok zzokVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzpz zzpzVar = (zzpz) this.zzb.get(cls);
            return zzpzVar.zza(zzobVar, zzokVar, new zzpv(this, zzpzVar));
        }
        throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
    }
}
