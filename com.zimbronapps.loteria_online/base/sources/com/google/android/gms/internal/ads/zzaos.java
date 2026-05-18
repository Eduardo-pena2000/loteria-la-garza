package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;
    private final zzape zzf = new zzape(178, 128);
    private final zzer zzc = new zzer();

    public zzaos(zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        zzagh zzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = zzu;
        this.zzg = new zzaor(zzu);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }

    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    public final void zzd(zzer zzerVar) {
        int i;
        int i2 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzerVar.zzg();
        int zze = zzerVar.zze();
        byte[] zzi = zzerVar.zzi();
        this.zzh += zzerVar.zzd();
        this.zzj.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int zzi2 = zzgm.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i3 = zzi2 + 3;
            int i4 = zzerVar.zzi()[i3] & 255;
            int i5 = zzi2 - zzg;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i6 = i5 < 0 ? -i5 : 0;
                zzaoq zzaoqVar = this.zze;
                if (zzaoqVar.zzb(i4, i6)) {
                    zzagh zzaghVar = this.zzj;
                    int i7 = zzaoqVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = Arrays.copyOf(zzaoqVar.zzc, zzaoqVar.zza);
                    zzeq zzeqVar = new zzeq(copyOf, copyOf.length);
                    zzeqVar.zzo(i7);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(i2);
                    }
                    int zzj = zzeqVar.zzj(4);
                    float f = 1.0f;
                    if (zzj == 15) {
                        int zzj2 = zzeqVar.zzj(8);
                        int zzj3 = zzeqVar.zzj(8);
                        if (zzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = zzj2 / zzj3;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                        }
                    }
                    if (zzeqVar.zzj(2) != 0) {
                        zzee.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzeqVar.zzg();
                    int zzj4 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                        if (zzj4 == 0) {
                            zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i8 = zzj4 - 1;
                            int i9 = 0;
                            while (i8 > 0) {
                                i8 >>= 1;
                                i9++;
                            }
                            zzeqVar.zzh(i9);
                        }
                    }
                    zzeqVar.zzg();
                    int zzj5 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int zzj6 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl("video/mp2t");
                    zztVar.zzm("video/mp4v-es");
                    zztVar.zzt(zzj5);
                    zztVar.zzu(zzj6);
                    zztVar.zzz(f2);
                    zztVar.zzp(Collections.singletonList(copyOf));
                    zzaghVar.zzz(zztVar.zzM());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(zzi, zzg, zzi2);
            zzape zzapeVar = this.zzf;
            if (i5 > 0) {
                zzapeVar.zzd(zzi, zzg, zzi2);
                i = 0;
            } else {
                i = -i5;
            }
            if (zzapeVar.zze(i)) {
                int zza2 = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                zzer zzerVar2 = this.zzc;
                String str2 = zzfj.zza;
                zzerVar2.zzb(zzapeVar.zza, zza2);
                this.zzb.zzb(this.zzl, zzerVar2);
            }
            if (i4 == 178) {
                if (zzerVar.zzi()[zzi2 + 2] == 1) {
                    zzapeVar.zzc(178);
                }
                i4 = 178;
            }
            int i10 = zze - zzi2;
            this.zzg.zzd(this.zzh - i10, i10, this.zzk);
            this.zzg.zzb(i4, this.zzl);
            zzg = i3;
            i2 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    public final void zze(boolean z) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
