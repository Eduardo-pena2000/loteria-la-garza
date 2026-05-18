package com.google.android.recaptcha.internal;

import Ca.l;
import Ca.m;
import Ga.e;
import Za.B;
import cb.P;
import com.google.android.recaptcha.RecaptchaException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzff {
    private final l zza;
    private final l zzb;
    private final l zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = m.b(zzfc.zza);
        this.zzb = m.b(zzfd.zza);
        this.zzc = m.b(zzfe.zza);
    }

    public static final /* synthetic */ zzey zza(zzff zzffVar) {
        return zzffVar.zzg();
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, e eVar) throws zzbd {
        String zza;
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    zza = zzffVar.zzf().zza(zzM);
                } catch (Exception e) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
                if (zza != null) {
                    zzf2.zza();
                    str = zza;
                } else {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    str = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, str);
                        }
                        zzf5.zza();
                    } catch (Exception e2) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzf4.zzb(e3);
                    throw e3;
                }
            }
            return B.H(zzscVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    private final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, e eVar) throws RecaptchaException {
        return P.e(new zzfb(this, str, zztoVar, null), eVar);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, e eVar) throws zzbd {
        return zze(this, zzscVar, zzekVar, eVar);
    }
}
