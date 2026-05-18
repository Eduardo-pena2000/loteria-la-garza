package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxe extends zzalf implements zzamo {
    private static final zzxe zzc;
    private static volatile zzamv zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxi zzxiVar) {
            this();
        }

        private zza() {
            super(zzxe.zza());
        }
    }

    static {
        zzxe zzxeVar = new zzxe();
        zzc = zzxeVar;
        zzalf.zza(zzxe.class, zzxeVar);
    }

    private zzxe() {
    }

    public static /* bridge */ /* synthetic */ zzxe zza() {
        return zzc;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxg.zza[i - 1]) {
            case 1:
                return new zzxe();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxe.class) {
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
