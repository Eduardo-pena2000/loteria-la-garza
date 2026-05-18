package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxq extends zzalf implements zzamo {
    private static final zzxq zzc;
    private static volatile zzamv zzd;
    private String zze = "";

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxu zzxuVar) {
            this();
        }

        public final zza zza(String str) {
            zzg();
            zzxq.zza((zzxq) this.zza, str);
            return this;
        }

        private zza() {
            super(zzxq.zzb());
        }
    }

    static {
        zzxq zzxqVar = new zzxq();
        zzc = zzxqVar;
        zzalf.zza(zzxq.class, zzxqVar);
    }

    private zzxq() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxq zzb() {
        return zzc;
    }

    public static zzxq zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzxq zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzxq) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxs.zza[i - 1]) {
            case 1:
                return new zzxq();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxq.class) {
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

    public static /* synthetic */ void zza(zzxq zzxqVar, String str) {
        str.getClass();
        zzxqVar.zze = str;
    }
}
