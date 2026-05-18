package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzyc extends zzalf implements zzamo {
    private static final zzyc zzc;
    private static volatile zzamv zzd;
    private String zze = "";
    private zzalm zzf = zzalf.zzp();

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzyd zzydVar) {
            this();
        }

        private zza() {
            super(zzyc.zza());
        }
    }

    static {
        zzyc zzycVar = new zzyc();
        zzc = zzycVar;
        zzalf.zza(zzyc.class, zzycVar);
    }

    private zzyc() {
    }

    public static /* bridge */ /* synthetic */ zzyc zza() {
        return zzc;
    }

    public static zzyc zzb() {
        return zzc;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzyb.zza[i - 1]) {
            case 1:
                return new zzyc();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzxe.class});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzyc.class) {
                        try {
                            zzamvVar = zzd;
                            if (zzamvVar == null) {
                                zzamvVar = new zzalf.zza(zzc);
                                zzd = zzamvVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzamvVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
