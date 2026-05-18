package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzwl extends zzalf implements zzamo {
    private static final zzwl zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzwo zzf;

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzwp zzwpVar) {
            this();
        }

        public final zza zza(zzwo zzwoVar) {
            zzg();
            zzwl.zza((zzwl) this.zza, zzwoVar);
            return this;
        }

        private zza() {
            super(zzwl.zzb());
        }
    }

    static {
        zzwl zzwlVar = new zzwl();
        zzc = zzwlVar;
        zzalf.zza(zzwl.class, zzwlVar);
    }

    private zzwl() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzwl zzb() {
        return zzc;
    }

    public final zzwo zzc() {
        zzwo zzwoVar = this.zzf;
        return zzwoVar == null ? zzwo.zzf() : zzwoVar;
    }

    public static zzwl zza(zzajv zzajvVar, zzaku zzakuVar) throws zzall {
        return (zzwl) zzalf.zza(zzc, zzajvVar, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzwn.zza[i - 1]) {
            case 1:
                return new zzwl();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzwl.class) {
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

    public static /* synthetic */ void zza(zzwl zzwlVar, zzwo zzwoVar) {
        zzwoVar.getClass();
        zzwlVar.zzf = zzwoVar;
        zzwlVar.zze |= 1;
    }
}
