package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzalf;
import com.google.android.gms.internal.firebase-auth-api.zzwx;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzxh extends zzalf implements zzamo {
    private static final zzxh zzc;
    private static volatile zzamv zzd;
    private int zze;
    private zzalm zzf = zzalf.zzp();

    public static final class zza extends zzalf.zzb implements zzamo {
        public /* synthetic */ zza(zzxl zzxlVar) {
            this();
        }

        public final zza zza(zzb zzbVar) {
            zzg();
            zzxh.zza((zzxh) this.zza, zzbVar);
            return this;
        }

        private zza() {
            super(zzxh.zzd());
        }

        public final zza zza(int i) {
            zzg();
            zzxh.zza((zzxh) this.zza, i);
            return this;
        }
    }

    public static final class zzb extends zzalf implements zzamo {
        private static final zzb zzc;
        private static volatile zzamv zzd;
        private int zze;
        private zzwx zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public static final class zza extends zzalf.zzb implements zzamo {
            public /* synthetic */ zza(zzxl zzxlVar) {
                this();
            }

            public final zza zza(zzwx.zza zzaVar) {
                zzg();
                zzb.zza((zzb) this.zza, (zzwx) ((zzalf) zzaVar.zze()));
                return this;
            }

            private zza() {
                super(zzb.zze());
            }

            public final zza zza(zzwx zzwxVar) {
                zzg();
                zzb.zza((zzb) this.zza, zzwxVar);
                return this;
            }

            public final zza zza(int i) {
                zzg();
                zzb.zza((zzb) this.zza, i);
                return this;
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
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzalf.zza(zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zzd() {
            return (zza) zzc.zzm();
        }

        public static /* bridge */ /* synthetic */ zzb zze() {
            return zzc;
        }

        public final int zza() {
            return this.zzh;
        }

        public final zzwx zzb() {
            zzwx zzwxVar = this.zzf;
            return zzwxVar == null ? zzwx.zzd() : zzwxVar;
        }

        public final zzxc zzc() {
            zzxc zza2 = zzxc.zza(this.zzg);
            return zza2 == null ? zzxc.UNRECOGNIZED : zza2;
        }

        public final zzxz zzf() {
            zzxz zza2 = zzxz.zza(this.zzi);
            return zza2 == null ? zzxz.zzf : zza2;
        }

        public final boolean zzg() {
            return (this.zze & 1) != 0;
        }

        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzxj.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(null);
                case 3:
                    return zzalf.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public static /* synthetic */ void zza(zzb zzbVar, zzwx zzwxVar) {
            zzwxVar.getClass();
            zzbVar.zzf = zzwxVar;
            zzbVar.zze |= 1;
        }

        public static /* synthetic */ void zza(zzb zzbVar, int i) {
            zzbVar.zzh = i;
        }

        public static /* synthetic */ void zza(zzb zzbVar, zzxz zzxzVar) {
            zzbVar.zzi = zzxzVar.zza();
        }

        public static /* synthetic */ void zza(zzb zzbVar, zzxc zzxcVar) {
            zzbVar.zzg = zzxcVar.zza();
        }
    }

    static {
        zzxh zzxhVar = new zzxh();
        zzc = zzxhVar;
        zzalf.zza(zzxh.class, zzxhVar);
    }

    private zzxh() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static /* bridge */ /* synthetic */ zzxh zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final List zze() {
        return this.zzf;
    }

    public final zzb zza(int i) {
        return (zzb) this.zzf.get(i);
    }

    public static zzxh zza(InputStream inputStream, zzaku zzakuVar) throws IOException {
        return (zzxh) zzalf.zza(zzc, inputStream, zzakuVar);
    }

    public static zzxh zza(byte[] bArr, zzaku zzakuVar) throws zzall {
        return (zzxh) zzalf.zza(zzc, bArr, zzakuVar);
    }

    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzxj.zza[i - 1]) {
            case 1:
                return new zzxh();
            case 2:
                return new zza(null);
            case 3:
                return zzalf.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzamv zzamvVar = zzd;
                if (zzamvVar == null) {
                    synchronized (zzxh.class) {
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

    public static /* synthetic */ void zza(zzxh zzxhVar, zzb zzbVar) {
        zzbVar.getClass();
        zzalm zzalmVar = zzxhVar.zzf;
        if (!zzalmVar.zzc()) {
            zzxhVar.zzf = zzalf.zza(zzalmVar);
        }
        zzxhVar.zzf.add(zzbVar);
    }

    public static /* synthetic */ void zza(zzxh zzxhVar, int i) {
        zzxhVar.zze = i;
    }
}
