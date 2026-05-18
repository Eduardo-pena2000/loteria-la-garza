package com.google.android.recaptcha.internal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlp implements zznh {
    static final zznh zza = new zzlp();

    private zzlp() {
    }

    public final boolean zza(int i) {
        zzlq zzlqVar;
        zzlq zzlqVar2 = zzlq.zza;
        if (i == 0) {
            zzlqVar = zzlq.zza;
        } else if (i == 1) {
            zzlqVar = zzlq.zzg;
        } else if (i == 2) {
            zzlqVar = zzlq.zzh;
        } else if (i == 900) {
            zzlqVar = zzlq.zzb;
        } else if (i != Integer.MAX_VALUE) {
            switch (i) {
                case 998:
                    zzlqVar = zzlq.zzc;
                    break;
                case 999:
                    zzlqVar = zzlq.zzd;
                    break;
                case 1000:
                    zzlqVar = zzlq.zze;
                    break;
                case 1001:
                    zzlqVar = zzlq.zzf;
                    break;
                default:
                    switch (i) {
                        case 99997:
                            zzlqVar = zzlq.zzi;
                            break;
                        case 99998:
                            zzlqVar = zzlq.zzj;
                            break;
                        case 99999:
                            zzlqVar = zzlq.zzk;
                            break;
                        default:
                            zzlqVar = null;
                            break;
                    }
            }
        } else {
            zzlqVar = zzlq.zzl;
        }
        return zzlqVar != null;
    }
}
