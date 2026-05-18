package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxw extends zzalf implements zzamo {
    private static final zzxw zzc;
    private static volatile zzamv zzd;
    private int zze;
    private String zzf = "";
    private zzxb zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzya zzyaVar) {
            this();
        }

        public final zza zza(zzxb zzxbVar) {
            zzg();
            zzxw.zza((zzxw) this.zza, zzxbVar);
            return this;
        }

        private zza() {
            super(zzxw.zzc());
        }

        public final zza zza(String str) {
            zzg();
            zzxw.zza((zzxw) this.zza, str);
            return this;
        }
    }

    static {
        zzxw zzxwVar = new zzxw();
        zzc = zzxwVar;
        zzalf.zza(zzxw.class, zzxwVar);
    }

    private zzxw() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxw zzc() {
        return zzc;
    }

    public static zzxw zzd() {
        return zzc;
    }

    public final zzxb zza() {
        zzxb zzxbVar = this.zzg;
        return zzxbVar == null ? zzxb.zzc() : zzxbVar;
    }

    public final String zze() {
        return this.zzf;
    }

    public static zzxw zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzxw) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxy.zza[i - 1]) {
            case 1:
                return new zzxw();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxw.class) {
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

    public static /* synthetic */ void zza(zzxw zzxwVar, zzxb zzxbVar) {
        zzxbVar.getClass();
        zzxwVar.zzg = zzxbVar;
        zzxwVar.zze |= 1;
    }

    public static /* synthetic */ void zza(zzxw zzxwVar, String str) {
        str.getClass();
        zzxwVar.zzf = str;
    }
}
