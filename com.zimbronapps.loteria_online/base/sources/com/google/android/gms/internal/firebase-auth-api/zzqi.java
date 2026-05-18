package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqi {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzqi(zzqh zzqhVar, zzqm zzqmVar) {
        this(zzqhVar);
    }

    public static /* bridge */ /* synthetic */ Map zza(zzqi zzqiVar) {
        return zzqiVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzqi zzqiVar) {
        return zzqiVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzqi zzqiVar) {
        return zzqiVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzd(zzqi zzqiVar) {
        return zzqiVar.zzc;
    }

    private zzqi(zzqh zzqhVar) {
        this.zza = new HashMap(zzqh.zzb(zzqhVar));
        this.zzb = new HashMap(zzqh.zza(zzqhVar));
        this.zzc = new HashMap(zzqh.zzd(zzqhVar));
        this.zzd = new HashMap(zzqh.zzc(zzqhVar));
    }

    public final zzbi zza(zzqf zzqfVar, zzch zzchVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzqfVar.getClass(), zzqfVar.zzc(), null);
        if (this.zzb.containsKey(zzqkVar)) {
            return ((zznt) this.zzb.get(zzqkVar)).zza(zzqfVar, zzchVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + String.valueOf(zzqkVar) + " available");
    }

    public final boolean zzb(zzqf zzqfVar) {
        return this.zzb.containsKey(new zzqk(zzqfVar.getClass(), zzqfVar.zzc(), null));
    }

    public final boolean zzc(zzqf zzqfVar) {
        return this.zzd.containsKey(new zzqk(zzqfVar.getClass(), zzqfVar.zzc(), null));
    }

    public final zzcb zza(zzqf zzqfVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzqfVar.getClass(), zzqfVar.zzc(), null);
        if (this.zzd.containsKey(zzqkVar)) {
            return ((zzpd) this.zzd.get(zzqkVar)).zza(zzqfVar);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + String.valueOf(zzqkVar) + " available");
    }

    public final zzqf zza(zzbi zzbiVar, Class cls, zzch zzchVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zzbiVar.getClass(), cls, null);
        if (this.zza.containsKey(zzqjVar)) {
            return ((zznx) this.zza.get(zzqjVar)).zza(zzbiVar, zzchVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + String.valueOf(zzqjVar) + " available");
    }

    public final zzqf zza(zzcb zzcbVar, Class cls) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zzcbVar.getClass(), cls, null);
        if (this.zzc.containsKey(zzqjVar)) {
            return ((zzph) this.zzc.get(zzqjVar)).zza(zzcbVar);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(zzqjVar) + " available");
    }
}
