package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxb extends zzalf implements zzamo {
    private static final zzxb zzc;
    private static volatile zzamv zzd;
    private String zze = "";
    private zzajv zzf = zzajv.zza;
    private int zzg;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxf zzxfVar) {
            this();
        }

        public final zza zza(zzxz zzxzVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzxzVar);
            return this;
        }

        private zza() {
            super(zzxb.zzb());
        }

        public final zza zza(String str) {
            zzg();
            zzxb.zza((zzxb) this.zza, str);
            return this;
        }

        public final zza zza(zzajv zzajvVar) {
            zzg();
            zzxb.zza((zzxb) this.zza, zzajvVar);
            return this;
        }
    }

    static {
        zzxb zzxbVar = new zzxb();
        zzc = zzxbVar;
        zzalf.zza(zzxb.class, zzxbVar);
    }

    private zzxb() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxb zzb() {
        return zzc;
    }

    public static zzxb zzc() {
        return zzc;
    }

    public final zzxz zzd() {
        zzxz zza2 = zzxz.zza(this.zzg);
        return zza2 == null ? zzxz.zzf : zza2;
    }

    public final zzajv zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public static zza zza(zzxb zzxbVar) {
        return (zza) zzc.zzm().zza(zzxbVar);
    }

    public static zzxb zza(byte[] bArr, zzaku zzakuVar) throws zzall {
        return (zzxb) zzalf.zza(zzc, bArr, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxd.zza[i - 1]) {
            case 1:
                return new zzxb();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxb.class) {
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

    public static /* synthetic */ void zza(zzxb zzxbVar, zzxz zzxzVar) {
        zzxbVar.zzg = zzxzVar.zza();
    }

    public static /* synthetic */ void zza(zzxb zzxbVar, String str) {
        str.getClass();
        zzxbVar.zze = str;
    }

    public static /* synthetic */ void zza(zzxb zzxbVar, zzajv zzajvVar) {
        zzajvVar.getClass();
        zzxbVar.zzf = zzajvVar;
    }
}
