package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxk extends zzalf implements zzamo {
    private static final zzxk zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzalm zzf = zzalf.zzp();

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxo zzxoVar) {
            this();
        }

        public final zza zza(zzb zzbVar) {
            zzg();
            zzxk.zza((zzxk) this.zza, zzbVar);
            return this;
        }

        private zza() {
            super(zzxk.zzb());
        }

        public final zza zza(int i) {
            zzg();
            zzxk.zza((zzxk) this.zza, i);
            return this;
        }
    }

    public static final class zzb extends zzalf implements zzamo {
        private static final zzb zzc;
        private static volatile zzamv zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        public static final class zza extends zzalf.zzb implements zzamo {
            public /* synthetic */ zza(zzxo zzxoVar) {
                this();
            }

            public final zza zza(int i) {
                zzg();
                zzb.zza((zzb) this.zza, i);
                return this;
            }

            private zza() {
                super(zzb.zzb());
            }

            public final zza zza(zzxz zzxzVar) {
                zzg();
                zzb.zza((zzb) this.zza, zzxzVar);
                return this;
            }

            public final zza zza(zzxc zzxcVar) {
                zzg();
                zzb.zza((zzb) this.zza, zzxcVar);
                return this;
            }

            public final zza zza(String str) {
                zzg();
                zzb.zza((zzb) this.zza, str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzalf.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zza() {
            return (zza) zzc.zzm();
        }

        public static /* bridge */ /* synthetic */ zzb zzb() {
            return zzc;
        }

        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzxm.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzalf.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzamv zzamvVar = zzd;
                    if (zzamvVar == null) {
                        synchronized (zzb.class) {
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

        public static /* synthetic */ void zza(zzb zzbVar, int i) {
            zzbVar.zzg = i;
        }

        public static /* synthetic */ void zza(zzb zzbVar, zzxz zzxzVar) {
            zzbVar.zzh = zzxzVar.zza();
        }

        public static /* synthetic */ void zza(zzb zzbVar, zzxc zzxcVar) {
            zzbVar.zzf = zzxcVar.zza();
        }

        public static /* synthetic */ void zza(zzb zzbVar, String str) {
            str.getClass();
            zzbVar.zze = str;
        }
    }

    static {
        zzxk zzxkVar = new zzxk();
        zzc = zzxkVar;
        zzalf.zza(zzxk.class, zzxkVar);
    }

    private zzxk() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxk zzb() {
        return zzc;
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxm.zza[i - 1]) {
            case 1:
                return new zzxk();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxk.class) {
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

    public static /* synthetic */ void zza(zzxk zzxkVar, zzb zzbVar) {
        zzbVar.getClass();
        zzalm zzalmVar = zzxkVar.zzf;
        if (!zzalmVar.zzc()) {
            zzxkVar.zzf = zzalf.zza(zzalmVar);
        }
        zzxkVar.zzf.add(zzbVar);
    }

    public static /* synthetic */ void zza(zzxk zzxkVar, int i) {
        zzxkVar.zze = i;
    }
}
