package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzpy {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzpy(zzpw zzpwVar, zzqa zzqaVar) {
        this(zzpwVar);
    }

    public static /* bridge */ /* synthetic */ Map zza(zzpy zzpyVar) {
        return zzpyVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzpy zzpyVar) {
        return zzpyVar.zzb;
    }

    public /* synthetic */ zzpy(zzqa zzqaVar) {
        this();
    }

    public final zzpy zza(zzps zzpsVar) throws GeneralSecurityException {
        if (zzpsVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzpx zzpxVar = new zzpx(zzpsVar.zza(), zzpsVar.zzb(), null);
        if (this.zza.containsKey(zzpxVar)) {
            zzps zzpsVar2 = (zzps) this.zza.get(zzpxVar);
            if (!zzpsVar2.equals(zzpsVar) || !zzpsVar.equals(zzpsVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzpxVar));
            }
        } else {
            this.zza.put(zzpxVar, zzpsVar);
        }
        return this;
    }

    private zzpy() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzpy(zzpw zzpwVar) {
        this.zza = new HashMap(zzpw.zzb(zzpwVar));
        this.zzb = new HashMap(zzpw.zzc(zzpwVar));
    }

    public final zzpy zza(zzpz zzpzVar) throws GeneralSecurityException {
        if (zzpzVar != null) {
            Class zzb = zzpzVar.zzb();
            if (this.zzb.containsKey(zzb)) {
                zzpz zzpzVar2 = (zzpz) this.zzb.get(zzb);
                if (!zzpzVar2.equals(zzpzVar) || !zzpzVar.equals(zzpzVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(zzb));
                }
            } else {
                this.zzb.put(zzb, zzpzVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }

    public final zzpw zza() {
        return new zzpw(this, null);
    }
}
