package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzajp implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private final zzer zzb;
    private final zzafr zzc;
    private final zzafn zzd;
    private final zzafp zze;
    private final zzagh zzf;
    private zzaex zzg;
    private zzagh zzh;
    private zzagh zzi;
    private int zzj;
    private zzap zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private zzajr zzq;
    private boolean zzr;

    static {
        int i = zzajn.zza;
    }

    public zzajp() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzi(com.google.android.gms.internal.ads.zzaev r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajp.zzi(com.google.android.gms.internal.ads.zzaev):int");
    }

    private final long zzj(long j) {
        return this.zzl + ((j * 1000000) / this.zzc.zzd);
    }

    private final boolean zzk(zzaev zzaevVar, boolean z) throws IOException {
        int i;
        int i2;
        int zza2;
        zzaevVar.zzl();
        if (zzaevVar.zzn() == 0) {
            zzap zza3 = this.zze.zza(zzaevVar, null, 131072);
            this.zzk = zza3;
            if (zza3 != null) {
                this.zzd.zza(zza3);
            }
            i = (int) zzaevVar.zzm();
            if (!z) {
                zzaevVar.zzf(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = i2;
        int i4 = i3;
        while (true) {
            if (!zzl(zzaevVar)) {
                zzer zzerVar = this.zzb;
                zzerVar.zzh(0);
                int zzB = zzerVar.zzB();
                if ((i2 == 0 || zzn(zzB, i2)) && (zza2 = zzafs.zza(zzB)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzc.zza(zzB);
                        i2 = zzB;
                    }
                    zzaevVar.zzk(zza2 - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == 131072) {
                        if (z) {
                            return false;
                        }
                        zzm();
                        throw new EOFException();
                    }
                    if (z) {
                        zzaevVar.zzl();
                        zzaevVar.zzk(i + i5);
                    } else {
                        zzaevVar.zzf(1);
                    }
                    i3 = 0;
                    i4 = i5;
                    i2 = 0;
                }
            } else if (i3 <= 0) {
                zzm();
                throw new EOFException();
            }
        }
        if (z) {
            zzaevVar.zzf(i + i4);
        } else {
            zzaevVar.zzl();
        }
        this.zzj = i2;
        return true;
    }

    private final boolean zzl(zzaev zzaevVar) throws IOException {
        zzajr zzajrVar = this.zzq;
        if (zzajrVar != null) {
            long zzf = zzajrVar.zzf();
            if (zzf != -1 && zzaevVar.zzm() > zzf - 4) {
                return true;
            }
        }
        try {
            return !zzaevVar.zzh(this.zzb.zzi(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final void zzm() {
        zzajr zzajrVar = this.zzq;
        if ((zzajrVar instanceof zzajk) && zzajrVar.zzb()) {
            long j = this.zzo;
            if (j == -1 || j == this.zzq.zzf()) {
                return;
            }
            this.zzq = ((zzajk) this.zzq).zzh(this.zzo);
            zzaex zzaexVar = this.zzg;
            zzaexVar.getClass();
            zzaexVar.zzw(this.zzq);
            this.zzh.getClass();
            this.zzq.zza();
        }
    }

    private static boolean zzn(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        return zzk(zzaevVar, true);
    }

    public final void zzc(zzaex zzaexVar) {
        this.zzg = zzaexVar;
        zzagh zzu = zzaexVar.zzu(0, 1);
        this.zzh = zzu;
        this.zzi = zzu;
        this.zzg.zzv();
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        this.zzh.getClass();
        String str = zzfj.zza;
        int zzi = zzi(zzaevVar);
        if (zzi == -1 && (this.zzq instanceof zzajl)) {
            if (this.zzq.zza() != zzj(this.zzm)) {
                throw null;
            }
        }
        return zzi;
    }

    public final void zze(long j, long j2) {
        this.zzj = 0;
        this.zzl = -9223372036854775807L;
        this.zzm = 0L;
        this.zzp = 0;
        this.zzo = -1L;
        if (this.zzq instanceof zzajl) {
            throw null;
        }
    }

    public final void zzf() {
    }

    public final void zzh() {
        this.zzr = true;
    }

    public zzajp(int i) {
        this.zzb = new zzer(10);
        this.zzc = new zzafr();
        this.zzd = new zzafn();
        this.zzl = -9223372036854775807L;
        this.zze = new zzafp();
        zzaer zzaerVar = new zzaer();
        this.zzf = zzaerVar;
        this.zzi = zzaerVar;
        this.zzo = -1L;
    }
}
