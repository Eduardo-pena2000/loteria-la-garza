package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzkg;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzkq extends zzli {
    private final zzkg zza;
    private final zzaaj zzb;
    private final zzaaj zzc;
    private final Integer zzd;

    private zzkq(zzkg zzkgVar, zzaaj zzaajVar, zzaaj zzaajVar2, Integer num) {
        this.zza = zzkgVar;
        this.zzb = zzaajVar;
        this.zzc = zzaajVar2;
        this.zzd = num;
    }

    public final /* synthetic */ zzcb zza() {
        return (zzkg) zzc();
    }

    public final Integer zzb() {
        return this.zzd;
    }

    public final /* synthetic */ zzlg zzc() {
        return this.zza;
    }

    public final zzaaj zzd() {
        return this.zzc;
    }

    public final zzaaj zze() {
        return this.zzb;
    }

    public static zzkq zza(zzkg zzkgVar, zzaaj zzaajVar, Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        zzaaj zzb;
        zzkg.zze zzf = zzkgVar.zzf();
        zzkg.zze zzeVar = zzkg.zze.zzc;
        if (!zzf.equals(zzeVar) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzf) + " variant.");
        }
        if (zzf.equals(zzeVar) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        zzkg.zzf zze = zzkgVar.zze();
        int zza = zzaajVar.zza();
        String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        zzkg.zzf zzfVar = zzkg.zzf.zza;
        if (zze == zzfVar) {
            if (zza != 65) {
                throw new GeneralSecurityException(String.format(str, new Object[]{65}));
            }
        } else if (zze == zzkg.zzf.zzb) {
            if (zza != 97) {
                throw new GeneralSecurityException(String.format(str, new Object[]{97}));
            }
        } else if (zze == zzkg.zzf.zzc) {
            if (zza != 133) {
                throw new GeneralSecurityException(String.format(str, new Object[]{133}));
            }
        } else {
            if (zze != zzkg.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zze));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
        }
        if (zze == zzfVar || zze == zzkg.zzf.zzb || zze == zzkg.zzf.zzc) {
            if (zze == zzfVar) {
                curve = zznj.zza.getCurve();
            } else if (zze == zzkg.zzf.zzb) {
                curve = zznj.zzb.getCurve();
            } else {
                if (zze != zzkg.zzf.zzc) {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zze));
                }
                curve = zznj.zzc.getCurve();
            }
            zznj.zza(zzzf.zza(curve, zzzh.UNCOMPRESSED, zzaajVar.zzb()), curve);
        }
        zzkg.zze zzf2 = zzkgVar.zzf();
        if (zzf2 == zzeVar) {
            zzb = zzpe.zza;
        } else {
            if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzf2));
            }
            if (zzf2 == zzkg.zze.zzb) {
                zzb = zzpe.zza(num.intValue());
            } else {
                if (zzf2 != zzkg.zze.zza) {
                    throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzf2));
                }
                zzb = zzpe.zzb(num.intValue());
            }
        }
        return new zzkq(zzkgVar, zzaajVar, zzb, num);
    }
}
