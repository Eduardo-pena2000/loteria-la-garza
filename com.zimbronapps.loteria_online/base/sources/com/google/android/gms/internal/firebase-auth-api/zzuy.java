package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzuy extends zzalf implements zzamo {
    private static final zzuy zzc;
    private static volatile zzamv zzd;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzvc zzvcVar) {
            this();
        }

        private zza() {
            super(zzuy.zza());
        }
    }

    static {
        zzuy zzuyVar = new zzuy();
        zzc = zzuyVar;
        zzalf.zza(zzuy.class, zzuyVar);
    }

    private zzuy() {
    }

    public static /* bridge */ /* synthetic */ zzuy zza() {
        return zzc;
    }

    public static zzuy zzb() {
        return zzc;
    }

    public static zzuy zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzuy) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzva.zza[i - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzuy.class) {
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
