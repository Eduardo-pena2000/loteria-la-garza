package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkb;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzkh extends zzli {
    private final zzkb zza;
    private final ECPoint zzb;
    private final zzaaj zzc;
    private final zzaaj zzd;
    private final Integer zze;

    private zzkh(zzkb zzkbVar, ECPoint eCPoint, zzaaj zzaajVar, zzaaj zzaajVar2, Integer num) {
        this.zza = zzkbVar;
        this.zzb = eCPoint;
        this.zzc = zzaajVar;
        this.zzd = zzaajVar2;
        this.zze = num;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzkb) zzc();
    }

    public final Integer zzb() {
        return this.zze;
    }

    public final /* synthetic */ zzlg zzc() {
        return this.zza;
    }

    public final zzaaj zzd() {
        return this.zzd;
    }

    public final zzaaj zze() {
        return this.zzc;
    }

    public final ECPoint zzf() {
        return this.zzb;
    }

    public static zzkh zza(zzkb zzkbVar, zzaaj zzaajVar, Integer num) throws GeneralSecurityException {
        if (!zzkbVar.zzd().equals(zzkb.zzc.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzkbVar.zzg(), num);
        if (zzaajVar.zza() == 32) {
            return new zzkh(zzkbVar, null, zzaajVar, zza(zzkbVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    private static void zzb(zzkb.zzd zzdVar, Integer num) throws GeneralSecurityException {
        zzkb.zzd zzdVar2 = zzkb.zzd.zzc;
        if (zzdVar.equals(zzdVar2) || num != null) {
            if (zzdVar.equals(zzdVar2) && num != null) {
                throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
            }
        } else {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzdVar) + " variant.");
        }
    }

    public static zzkh zza(zzkb zzkbVar, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        if (!zzkbVar.zzd().equals(zzkb.zzc.zzd)) {
            zzb(zzkbVar.zzg(), num);
            zzkb.zzc zzd = zzkbVar.zzd();
            if (zzd == zzkb.zzc.zza) {
                curve = zznj.zza.getCurve();
            } else if (zzd == zzkb.zzc.zzb) {
                curve = zznj.zzb.getCurve();
            } else if (zzd == zzkb.zzc.zzc) {
                curve = zznj.zzc.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzd));
            }
            zznj.zza(eCPoint, curve);
            return new zzkh(zzkbVar, eCPoint, null, zza(zzkbVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzaaj zza(zzkb.zzd zzdVar, Integer num) {
        if (zzdVar == zzkb.zzd.zzc) {
            return zzpe.zza;
        }
        if (num != null) {
            if (zzdVar == zzkb.zzd.zzb) {
                return zzpe.zza(num.intValue());
            }
            if (zzdVar == zzkb.zzd.zza) {
                return zzpe.zzb(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: " + String.valueOf(zzdVar));
        }
        throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + String.valueOf(zzdVar));
    }
}
