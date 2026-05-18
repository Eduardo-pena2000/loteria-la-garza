package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzhs implements zzgx {
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 2) {
            if (length != 0) {
                throw new zzce(4, 3, null);
            }
            zzgdVar.zzc().zze(i, new zzbn());
            return;
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof zzbn)) {
            zza3 = null;
        }
        zzbn zzbnVar = (zzbn) zza3;
        if (zzbnVar == null) {
            throw new zzce(4, 5, null);
        }
        byte[] zzd = zzev.zza(zzgdVar.zzb(), zzbnVar).zzd();
        zzgdVar.zzi().zzb(str, zzkh.zzh().zzi(zzd, 0, zzd.length));
    }
}
