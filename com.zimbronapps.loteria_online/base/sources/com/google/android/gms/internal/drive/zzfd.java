package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfd extends zzkk implements zzls {
    private static volatile zzmb zzhk;
    private static final zzfd zzhq;
    private int zzhd;
    private byte zzhi = 2;
    private long zzhn = -1;
    private long zzhg = -1;

    public static final class zza extends zzkk.zza implements zzls {
        private zza() {
            super(zzfd.zzaq());
        }

        public final zza zzi(long j) {
            zzdb();
            zzfd.zza((zzfd) this.zzru, j);
            return this;
        }

        public final zza zzj(long j) {
            zzdb();
            zzfd.zzb((zzfd) this.zzru, j);
            return this;
        }

        public /* synthetic */ zza(zzfe zzfeVar) {
            this();
        }
    }

    static {
        zzfd zzfdVar = new zzfd();
        zzhq = zzfdVar;
        zzkk.zza(zzfd.class, zzfdVar);
    }

    private zzfd() {
    }

    private final void zza(long j) {
        this.zzhd |= 2;
        this.zzhg = j;
    }

    public static zza zzap() {
        return (zza) zzhq.zzcw();
    }

    public static /* synthetic */ zzfd zzaq() {
        return zzhq;
    }

    public static /* synthetic */ void zzb(zzfd zzfdVar, long j) {
        zzfdVar.zza(j);
    }

    private final void zzf(long j) {
        this.zzhd |= 1;
        this.zzhn = j;
    }

    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb] */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzfe.zzhl[i - 1]) {
            case 1:
                return new zzfd();
            case 2:
                return new zza(null);
            case 3:
                return zzkk.zza(zzhq, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԑ\u0000\u0002Ԑ\u0001", new Object[]{"zzhd", "zzhn", "zzhg"});
            case 4:
                return zzhq;
            case 5:
                zzmb zzmbVar = zzhk;
                zzmb zzmbVar2 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (zzfd.class) {
                        try {
                            zzmb zzmbVar3 = zzhk;
                            zzmb zzmbVar4 = zzmbVar3;
                            if (zzmbVar3 == null) {
                                ?? zzbVar = new zzkk.zzb(zzhq);
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

    public static /* synthetic */ void zza(zzfd zzfdVar, long j) {
        zzfdVar.zzf(j);
    }
}
