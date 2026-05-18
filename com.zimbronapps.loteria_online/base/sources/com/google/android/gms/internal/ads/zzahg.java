package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzahg implements zzaeu {
    private final byte[] zza;
    private final zzer zzb;
    private final zzafb zzc;
    private zzaex zzd;
    private zzagh zze;
    private int zzf;
    private zzap zzg;
    private zzafh zzh;
    private int zzi;
    private int zzj;
    private zzahe zzk;
    private int zzl;
    private long zzm;

    static {
        int i = zzahf.zza;
    }

    public zzahg() {
        throw null;
    }

    private final long zzh(zzer zzerVar, boolean z) {
        boolean z2;
        this.zzh.getClass();
        int zzg = zzerVar.zzg();
        while (zzg <= zzerVar.zze() - 16) {
            zzerVar.zzh(zzg);
            zzafh zzafhVar = this.zzh;
            int i = this.zzj;
            zzafb zzafbVar = this.zzc;
            if (zzafc.zza(zzerVar, zzafhVar, i, zzafbVar)) {
                zzerVar.zzh(zzg);
                return zzafbVar.zza;
            }
            zzg++;
        }
        if (!z) {
            zzerVar.zzh(zzg);
            return -1L;
        }
        while (zzg <= zzerVar.zze() - this.zzi) {
            zzerVar.zzh(zzg);
            try {
                z2 = zzafc.zza(zzerVar, this.zzh, this.zzj, this.zzc);
            } catch (IndexOutOfBoundsException unused) {
                z2 = false;
            }
            if (zzerVar.zzg() <= zzerVar.zze() && z2) {
                zzerVar.zzh(zzg);
                return this.zzc.zza;
            }
            zzg++;
        }
        zzerVar.zzh(zzerVar.zze());
        return -1L;
    }

    private final void zzi() {
        long j = this.zzm * 1000000;
        zzafh zzafhVar = this.zzh;
        String str = zzfj.zza;
        this.zze.zze(j / zzafhVar.zze, 1, this.zzl, 0, null);
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzafe.zza(zzaevVar, false);
        zzer zzerVar = new zzer(4);
        ((zzael) zzaevVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == 1716281667;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zzd = zzaexVar;
        this.zze = zzaexVar.zzu(0, 1);
        zzaexVar.zzv();
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean zzb;
        zzafh zzafhVar;
        zzafy zzafxVar;
        boolean z;
        int i = this.zzf;
        if (i == 0) {
            zzaevVar.zzl();
            long zzm = zzaevVar.zzm();
            zzap zza = zzafe.zza(zzaevVar, true);
            zzaevVar.zzf((int) (zzaevVar.zzm() - zzm));
            this.zzg = zza;
            this.zzf = 1;
            return 0;
        }
        if (i == 1) {
            zzaevVar.zzi(this.zza, 0, 42);
            zzaevVar.zzl();
            this.zzf = 2;
            return 0;
        }
        if (i == 2) {
            zzer zzerVar = new zzer(4);
            zzaevVar.zzc(zzerVar.zzi(), 0, 4);
            if (zzerVar.zzz() != 1716281667) {
                throw zzat.zzb("Failed to read FLAC stream marker.", null);
            }
            this.zzf = 3;
            return 0;
        }
        if (i == 3) {
            zzafd zzafdVar = new zzafd(this.zzh);
            do {
                zzb = zzafe.zzb(zzaevVar, zzafdVar);
                zzafhVar = zzafdVar.zza;
                String str = zzfj.zza;
                this.zzh = zzafhVar;
            } while (!zzb);
            zzafhVar.getClass();
            this.zzi = Math.max(zzafhVar.zzc, 6);
            zzv zzc = this.zzh.zzc(this.zza, this.zzg);
            zzagh zzaghVar = this.zze;
            zzt zza2 = zzc.zza();
            zza2.zzl("audio/flac");
            zzaghVar.zzz(zza2.zzM());
            this.zze.zzN(this.zzh.zza());
            this.zzf = 4;
            return 0;
        }
        if (i == 4) {
            zzaevVar.zzl();
            zzer zzerVar2 = new zzer(2);
            zzaevVar.zzi(zzerVar2.zzi(), 0, 2);
            int zzt = zzerVar2.zzt();
            if ((zzt >> 2) != 16382) {
                zzaevVar.zzl();
                throw zzat.zzb("First frame does not start with sync code.", null);
            }
            zzaevVar.zzl();
            this.zzj = zzt;
            zzaex zzaexVar = this.zzd;
            String str2 = zzfj.zza;
            long zzn = zzaevVar.zzn();
            long zzo = zzaevVar.zzo();
            zzafh zzafhVar2 = this.zzh;
            zzafhVar2.getClass();
            zzafg zzafgVar = zzafhVar2.zzk;
            if (zzafgVar != null && zzafgVar.zza.length > 0) {
                zzafxVar = new zzaff(zzafhVar2, zzn);
            } else if (zzo == -1 || zzafhVar2.zzj <= 0) {
                zzafxVar = new zzafx(zzafhVar2.zza(), 0L);
            } else {
                zzahe zzaheVar = new zzahe(zzafhVar2, this.zzj, zzn, zzo);
                this.zzk = zzaheVar;
                zzafxVar = zzaheVar.zza();
            }
            zzaexVar.zzw(zzafxVar);
            this.zzf = 5;
            return 0;
        }
        this.zze.getClass();
        zzafh zzafhVar3 = this.zzh;
        zzafhVar3.getClass();
        zzahe zzaheVar2 = this.zzk;
        if (zzaheVar2 != null && zzaheVar2.zzc()) {
            return zzaheVar2.zzd(zzaevVar, zzafvVar);
        }
        if (this.zzm == -1) {
            this.zzm = zzafc.zzb(zzaevVar, zzafhVar3);
            return 0;
        }
        zzer zzerVar3 = this.zzb;
        int zze = zzerVar3.zze();
        if (zze < 32768) {
            int zza3 = zzaevVar.zza(zzerVar3.zzi(), zze, 32768 - zze);
            z = zza3 == -1;
            if (!z) {
                zzerVar3.zzf(zze + zza3);
            } else if (zzerVar3.zzd() == 0) {
                zzi();
                return -1;
            }
        } else {
            z = false;
        }
        int zzg = zzerVar3.zzg();
        int i2 = this.zzl;
        int i3 = this.zzi;
        if (i2 < i3) {
            zzerVar3.zzk(Math.min(i3 - i2, zzerVar3.zzd()));
        }
        long zzh = zzh(zzerVar3, z);
        int zzg2 = zzerVar3.zzg() - zzg;
        zzerVar3.zzh(zzg);
        this.zze.zzc(zzerVar3, zzg2);
        this.zzl += zzg2;
        if (zzh != -1) {
            zzi();
            this.zzl = 0;
            this.zzm = zzh;
        }
        int length = zzerVar3.zzi().length - zzerVar3.zze();
        if (zzerVar3.zzd() >= 16 || length >= 16) {
            return 0;
        }
        int zzd = zzerVar3.zzd();
        System.arraycopy(zzerVar3.zzi(), zzerVar3.zzg(), zzerVar3.zzi(), 0, zzd);
        zzerVar3.zzh(0);
        zzerVar3.zzf(zzd);
        return 0;
    }

    public final void zze(long j, long j2) {
        if (j == 0) {
            this.zzf = 0;
        } else {
            zzahe zzaheVar = this.zzk;
            if (zzaheVar != null) {
                zzaheVar.zzb(j2);
            }
        }
        this.zzm = j2 != 0 ? -1L : 0L;
        this.zzl = 0;
        this.zzb.zza(0);
    }

    public final void zzf() {
    }

    public zzahg(int i) {
        this.zza = new byte[42];
        this.zzb = new zzer(new byte[32768], 0);
        this.zzc = new zzafb();
        this.zzf = 0;
    }
}
