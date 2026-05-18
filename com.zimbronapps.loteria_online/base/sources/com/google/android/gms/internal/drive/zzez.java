package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzez extends zzkk implements zzls {
    private static final zzez zzhj;
    private static volatile zzmb zzhk;
    private int zzhd;
    private byte zzhi = 2;
    private int zzhe = 1;
    private long zzhf = -1;
    private long zzhg = -1;
    private long zzhh = -1;

    public static final class zza extends zzkk.zza implements zzls {
        private zza() {
            super(zzez.zzak());
        }

        public final zza zzc(long j) {
            zzdb();
            zzez.zza((zzez) this.zzru, j);
            return this;
        }

        public final zza zzd(long j) {
            zzdb();
            zzez.zzb((zzez) this.zzru, j);
            return this;
        }

        public final zza zze(long j) {
            zzdb();
            zzez.zzc((zzez) this.zzru, j);
            return this;
        }

        public final zza zzk(int i) {
            zzdb();
            zzez.zza((zzez) this.zzru, 1);
            return this;
        }

        public /* synthetic */ zza(zzfa zzfaVar) {
            this();
        }
    }

    static {
        zzez zzezVar = new zzez();
        zzhj = zzezVar;
        zzkk.zza(zzez.class, zzezVar);
    }

    private zzez() {
    }

    private final void setSequenceNumber(long j) {
        this.zzhd |= 2;
        this.zzhf = j;
    }

    private final void zza(long j) {
        this.zzhd |= 4;
        this.zzhg = j;
    }

    public static zza zzaj() {
        return (zza) zzhj.zzcw();
    }

    public static /* synthetic */ zzez zzak() {
        return zzhj;
    }

    private final void zzb(long j) {
        this.zzhd |= 8;
        this.zzhh = j;
    }

    public static /* synthetic */ void zzc(zzez zzezVar, long j) {
        zzezVar.zzb(j);
    }

    private final void zzj(int i) {
        this.zzhd |= 1;
        this.zzhe = i;
    }

    public static /* synthetic */ void zzb(zzez zzezVar, long j) {
        zzezVar.zza(j);
    }

    /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb] */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzfa.zzhl[i - 1]) {
            case 1:
                return new zzez();
            case 2:
                return new zza(null);
            case 3:
                return zzkk.zza(zzhj, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԑ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003", new Object[]{"zzhd", "zzhe", "zzhf", "zzhg", "zzhh"});
            case 4:
                return zzhj;
            case 5:
                zzmb zzmbVar = zzhk;
                zzmb zzmbVar2 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (zzez.class) {
                        try {
                            zzmb zzmbVar3 = zzhk;
                            zzmb zzmbVar4 = zzmbVar3;
                            if (zzmbVar3 == null) {
                                ?? zzbVar = new zzkk.zzb(zzhj);
                                zzhk = zzbVar;
                                zzmbVar4 = zzbVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzmbVar2;
            case 6:
                return Byte.valueOf(this.zzhi);
            case 7:
                this.zzhi = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static /* synthetic */ void zza(zzez zzezVar, int i) {
        zzezVar.zzj(1);
    }

    public static /* synthetic */ void zza(zzez zzezVar, long j) {
        zzezVar.setSequenceNumber(j);
    }
}
