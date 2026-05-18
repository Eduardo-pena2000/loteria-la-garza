package com.google.android.gms.internal.drive;

import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfb extends zzkk implements zzls {
    private static volatile zzmb zzhk;
    private static final zzfb zzhp;
    private int zzhd;
    private byte zzhi = 2;
    private int zzhe = 1;
    private String zzhm = "";
    private long zzhn = -1;
    private long zzhg = -1;
    private int zzho = -1;

    public static final class zza extends zzkk.zza implements zzls {
        private zza() {
            super(zzfb.zzao());
        }

        public final zza zze(String str) {
            zzdb();
            zzfb.zza((zzfb) this.zzru, str);
            return this;
        }

        public final zza zzg(long j) {
            zzdb();
            zzfb.zza((zzfb) this.zzru, j);
            return this;
        }

        public final zza zzh(long j) {
            zzdb();
            zzfb.zzb((zzfb) this.zzru, j);
            return this;
        }

        public final zza zzm(int i) {
            zzdb();
            zzfb.zza((zzfb) this.zzru, 1);
            return this;
        }

        public final zza zzn(int i) {
            zzdb();
            zzfb.zzb((zzfb) this.zzru, i);
            return this;
        }

        public /* synthetic */ zza(zzfc zzfcVar) {
            this();
        }
    }

    static {
        zzfb zzfbVar = new zzfb();
        zzhp = zzfbVar;
        zzkk.zza(zzfb.class, zzfbVar);
    }

    private zzfb() {
    }

    private final void zza(long j) {
        this.zzhd |= 8;
        this.zzhg = j;
    }

    public static zza zzan() {
        return (zza) zzhp.zzcw();
    }

    public static /* synthetic */ zzfb zzao() {
        return zzhp;
    }

    public static /* synthetic */ void zzb(zzfb zzfbVar, long j) {
        zzfbVar.zza(j);
    }

    private final void zzd(String str) {
        str.getClass();
        this.zzhd |= 2;
        this.zzhm = str;
    }

    private final void zzf(long j) {
        this.zzhd |= 4;
        this.zzhn = j;
    }

    private final void zzj(int i) {
        this.zzhd |= 1;
        this.zzhe = i;
    }

    private final void zzl(int i) {
        this.zzhd |= 16;
        this.zzho = i;
    }

    public final String getResourceId() {
        return this.zzhm;
    }

    public final int getResourceType() {
        return this.zzho;
    }

    public final long zzal() {
        return this.zzhn;
    }

    public final long zzam() {
        return this.zzhg;
    }

    public static /* synthetic */ void zzb(zzfb zzfbVar, int i) {
        zzfbVar.zzl(i);
    }

    public static zzfb zza(byte[] bArr, zzjx zzjxVar) throws zzkq {
        return (zzfb) zzkk.zza(zzhp, bArr, zzjxVar);
    }

    /* JADX WARN: Type inference failed for: r7v13, types: [com.google.android.gms.internal.drive.zzkk$zzb, com.google.android.gms.internal.drive.zzmb] */
    public final Object zza(int i, Object obj, Object obj2) {
        switch (zzfc.zzhl[i - 1]) {
            case 1:
                return new zzfb();
            case 2:
                return new zza(null);
            case 3:
                return zzkk.zza(zzhp, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001Ԅ\u0000\u0002Ԉ\u0001\u0003Ԑ\u0002\u0004Ԑ\u0003\u0005\u0004\u0004", new Object[]{"zzhd", "zzhe", "zzhm", "zzhn", "zzhg", "zzho"});
            case 4:
                return zzhp;
            case 5:
                zzmb zzmbVar = zzhk;
                zzmb zzmbVar2 = zzmbVar;
                if (zzmbVar == null) {
                    synchronized (zzfb.class) {
                        try {
                            zzmb zzmbVar3 = zzhk;
                            zzmb zzmbVar4 = zzmbVar3;
                            if (zzmbVar3 == null) {
                                ?? zzbVar = new zzkk.zzb(zzhp);
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

    public static /* synthetic */ void zza(zzfb zzfbVar, int i) {
        zzfbVar.zzj(1);
    }

    public static /* synthetic */ void zza(zzfb zzfbVar, String str) {
        zzfbVar.zzd(str);
    }

    public static /* synthetic */ void zza(zzfb zzfbVar, long j) {
        zzfbVar.zzf(j);
    }
}
