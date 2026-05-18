package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzsm {
    private final Context zza;
    private Boolean zzb;

    public zzsm() {
        this(null);
    }

    public final zzpz zza(zzv zzvVar, zzd zzdVar) {
        int i;
        boolean booleanValue;
        zzvVar.getClass();
        zzdVar.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || (i = zzvVar.zzH) == -1) {
            return zzpz.zza;
        }
        Context context = this.zza;
        Boolean bool = this.zzb;
        boolean z = false;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = zzcj.zza(context).getParameters("offloadVariableRateSupported");
                this.zzb = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.zzb = Boolean.FALSE;
            }
            booleanValue = this.zzb.booleanValue();
        }
        String str = zzvVar.zzo;
        str.getClass();
        int zzg = zzas.zzg(str, zzvVar.zzk);
        if (zzg == 0 || i2 < zzfj.zzC(zzg)) {
            return zzpz.zza;
        }
        int zzB = zzfj.zzB(zzvVar.zzG);
        if (zzB == 0) {
            return zzpz.zza;
        }
        try {
            AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(zzB).setEncoding(zzg).build();
            if (i2 < 31) {
                if (!V2.C.a(build, zzdVar.zza())) {
                    return zzpz.zza;
                }
                zzpy zzpyVar = new zzpy();
                zzpyVar.zza(true);
                zzpyVar.zzc(booleanValue);
                return zzpyVar.zzd();
            }
            int a = V2.E.a(build, zzdVar.zza());
            if (a == 0) {
                return zzpz.zza;
            }
            zzpy zzpyVar2 = new zzpy();
            if (i2 > 32 && a == 2) {
                z = true;
            }
            zzpyVar2.zza(true);
            zzpyVar2.zzb(z);
            zzpyVar2.zzc(booleanValue);
            return zzpyVar2.zzd();
        } catch (IllegalArgumentException unused) {
            return zzpz.zza;
        }
    }

    public zzsm(Context context) {
        this.zza = context == null ? null : context.getApplicationContext();
    }
}
