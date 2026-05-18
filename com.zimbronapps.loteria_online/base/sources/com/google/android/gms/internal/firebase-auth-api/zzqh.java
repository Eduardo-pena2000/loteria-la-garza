package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzqh {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzqh() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public static /* bridge */ /* synthetic */ Map zza(zzqh zzqhVar) {
        return zzqhVar.zzb;
    }

    public static /* bridge */ /* synthetic */ Map zzb(zzqh zzqhVar) {
        return zzqhVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzqh zzqhVar) {
        return zzqhVar.zzd;
    }

    public static /* bridge */ /* synthetic */ Map zzd(zzqh zzqhVar) {
        return zzqhVar.zzc;
    }

    public final zzqh zza(zznt zzntVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzntVar.zzb(), zzntVar.zza(), null);
        if (this.zzb.containsKey(zzqkVar)) {
            zznt zzntVar2 = (zznt) this.zzb.get(zzqkVar);
            if (!zzntVar2.equals(zzntVar) || !zzntVar.equals(zzntVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqkVar));
            }
        } else {
            this.zzb.put(zzqkVar, zzntVar);
        }
        return this;
    }

    public zzqh(zzqi zzqiVar) {
        this.zza = new HashMap(zzqi.zzb(zzqiVar));
        this.zzb = new HashMap(zzqi.zza(zzqiVar));
        this.zzc = new HashMap(zzqi.zzd(zzqiVar));
        this.zzd = new HashMap(zzqi.zzc(zzqiVar));
    }

    public final zzqh zza(zznx zznxVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zznxVar.zza(), zznxVar.zzb(), null);
        if (this.zza.containsKey(zzqjVar)) {
            zznx zznxVar2 = (zznx) this.zza.get(zzqjVar);
            if (!zznxVar2.equals(zznxVar) || !zznxVar.equals(zznxVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqjVar));
            }
        } else {
            this.zza.put(zzqjVar, zznxVar);
        }
        return this;
    }

    public final zzqh zza(zzpd zzpdVar) throws GeneralSecurityException {
        zzqk zzqkVar = new zzqk(zzpdVar.zzb(), zzpdVar.zza(), null);
        if (this.zzd.containsKey(zzqkVar)) {
            zzpd zzpdVar2 = (zzpd) this.zzd.get(zzqkVar);
            if (!zzpdVar2.equals(zzpdVar) || !zzpdVar.equals(zzpdVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzqkVar));
            }
        } else {
            this.zzd.put(zzqkVar, zzpdVar);
        }
        return this;
    }

    public final zzqh zza(zzph zzphVar) throws GeneralSecurityException {
        zzqj zzqjVar = new zzqj(zzphVar.zza(), zzphVar.zzb(), null);
        if (this.zzc.containsKey(zzqjVar)) {
            zzph zzphVar2 = (zzph) this.zzc.get(zzqjVar);
            if (!zzphVar2.equals(zzphVar) || !zzphVar.equals(zzphVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzqjVar));
            }
        } else {
            this.zzc.put(zzqjVar, zzphVar);
        }
        return this;
    }

    public final zzqi zza() {
        return new zzqi(this, null);
    }
}
