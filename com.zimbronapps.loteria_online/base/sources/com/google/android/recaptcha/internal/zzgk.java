package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzgk implements zzgx {
    public static final zzgk zza = new zzgk();

    private zzgk() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length == 0) {
            throw new zzce(4, 3, null);
        }
        zztf zzf = zzti.zzf();
        for (zzue zzueVar : zzueVarArr) {
            Object zza2 = zzgdVar.zzc().zza(zzueVar);
            if (zza2 == null) {
                throw new zzce(4, 4, null);
            }
            zztg zzf2 = zzth.zzf();
            if (zza2 instanceof Integer) {
                zzf2.zzu(((Number) zza2).intValue());
            } else if (zza2 instanceof Short) {
                zzf2.zzt(((Number) zza2).shortValue());
            } else if (zza2 instanceof Byte) {
                zzf2.zzf(zzle.zzk(new byte[]{((Number) zza2).byteValue()}, 0, 1));
            } else if (zza2 instanceof Long) {
                zzf2.zzv(((Number) zza2).longValue());
            } else if (zza2 instanceof Double) {
                zzf2.zzr(((Number) zza2).doubleValue());
            } else if (zza2 instanceof Float) {
                zzf2.zzs(((Number) zza2).floatValue());
            } else if (zza2 instanceof Boolean) {
                zzf2.zze(((Boolean) zza2).booleanValue());
            } else if (zza2 instanceof Character) {
                zzf2.zzq(String.valueOf(((Character) zza2).charValue()));
            } else if (zza2 instanceof String) {
                zzf2.zzw((String) zza2);
            } else {
                zzf2.zzw(zza2.toString());
            }
            zzf.zzf((zzth) zzf2.zzi());
        }
        zzge zzc = zzgdVar.zzc();
        byte[] zzd = ((zzti) zzf.zzi()).zzd();
        zzc.zze(i, zzkh.zzh().zzi(zzd, 0, zzd.length));
    }
}
