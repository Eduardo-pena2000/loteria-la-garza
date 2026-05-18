package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzagt implements zzaeu {
    private final zzer zza;
    private final zzags zzb;
    private final boolean zzc;
    private final zzamd zzd;
    private int zze;
    private zzaex zzf;
    private zzagu zzg;
    private long zzh;
    private zzagw[] zzi;
    private long zzj;
    private zzagw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzagt() {
        this(1, zzamd.zza);
    }

    private final zzagw zzi(int i) {
        for (zzagw zzagwVar : this.zzi) {
            if (zzagwVar.zzc(i)) {
                return zzagwVar;
            }
        }
        return null;
    }

    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzaevVar.zzi(zzerVar.zzi(), 0, 12);
        zzerVar.zzh(0);
        if (zzerVar.zzC() != 1179011410) {
            return false;
        }
        zzerVar.zzk(4);
        return zzerVar.zzC() == 541677121;
    }

    public final void zzc(zzaex zzaexVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaexVar = new zzamg(zzaexVar, this.zzd);
        }
        this.zzf = zzaexVar;
        this.zzj = -1L;
    }

    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean z;
        long j;
        long j2 = this.zzj;
        if (j2 != -1) {
            long zzn = zzaevVar.zzn();
            if (j2 < zzn || j2 > 262144 + zzn) {
                zzafvVar.zza = j2;
                z = true;
            } else {
                zzaevVar.zzf((int) (j2 - zzn));
                z = false;
            }
        } else {
            z = false;
        }
        this.zzj = -1L;
        if (z) {
            return 1;
        }
        int i = this.zze;
        zzagw zzagwVar = null;
        if (i == 0) {
            if (!zza(zzaevVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzaevVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i == 1) {
            zzer zzerVar = this.zza;
            zzaevVar.zzc(zzerVar.zzi(), 0, 12);
            zzerVar.zzh(0);
            zzags zzagsVar = this.zzb;
            zzagsVar.zza(zzerVar);
            int i2 = zzagsVar.zza;
            if (i2 != 1414744396) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 22);
                sb.append("LIST expected, found: ");
                sb.append(i2);
                throw zzat.zzb(sb.toString(), null);
            }
            int zzC = zzerVar.zzC();
            if (zzC == 1819436136) {
                this.zzl = zzagsVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(zzC).length() + 22);
            sb2.append("hdrl expected, found: ");
            sb2.append(zzC);
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i == 2) {
            int i3 = this.zzl - 4;
            zzer zzerVar2 = new zzer(i3);
            zzaevVar.zzc(zzerVar2.zzi(), 0, i3);
            zzagx zzb = zzagx.zzb(1819436136, zzerVar2);
            if (zzb.zza() != 1819436136) {
                int zza = zzb.zza();
                StringBuilder sb3 = new StringBuilder(String.valueOf(zza).length() + 28);
                sb3.append("Unexpected header list type ");
                sb3.append(zza);
                throw zzat.zzb(sb3.toString(), null);
            }
            zzagu zzaguVar = (zzagu) zzb.zzc(zzagu.class);
            if (zzaguVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaguVar;
            this.zzh = zzaguVar.zzc * zzaguVar.zza;
            ArrayList arrayList = new ArrayList();
            zzguf zzgufVar = zzb.zza;
            int size = zzgufVar.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size) {
                zzagq zzagqVar = (zzagq) zzgufVar.get(i4);
                if (zzagqVar.zza() == 1819440243) {
                    zzagx zzagxVar = (zzagx) zzagqVar;
                    int i6 = i5 + 1;
                    zzagv zzagvVar = (zzagv) zzagxVar.zzc(zzagv.class);
                    zzagy zzagyVar = (zzagy) zzagxVar.zzc(zzagy.class);
                    if (zzagvVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzagyVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long zzd = zzagvVar.zzd();
                        zzv zzvVar = zzagyVar.zza;
                        zzt zza2 = zzvVar.zza();
                        zza2.zzb(i5);
                        int i7 = zzagvVar.zze;
                        if (i7 != 0) {
                            zza2.zzn(i7);
                        }
                        zzagz zzagzVar = (zzagz) zzagxVar.zzc(zzagz.class);
                        if (zzagzVar != null) {
                            zza2.zzc(zzagzVar.zza);
                        }
                        int zzf = zzas.zzf(zzvVar.zzo);
                        if (zzf == 1) {
                            zzagh zzu = this.zzf.zzu(i5, zzf);
                            zzu.zzz(zza2.zzM());
                            zzu.zzN(zzd);
                            this.zzh = Math.max(this.zzh, zzd);
                            zzagwVar = new zzagw(i5, zzagvVar, zzu);
                        } else if (zzf == 2) {
                            zzf = 2;
                            zzagh zzu2 = this.zzf.zzu(i5, zzf);
                            zzu2.zzz(zza2.zzM());
                            zzu2.zzN(zzd);
                            this.zzh = Math.max(this.zzh, zzd);
                            zzagwVar = new zzagw(i5, zzagvVar, zzu2);
                        } else {
                            zzagwVar = null;
                        }
                    }
                    if (zzagwVar != null) {
                        arrayList.add(zzagwVar);
                    }
                    i5 = i6;
                }
                i4++;
                zzagwVar = null;
            }
            this.zzi = (zzagw[]) arrayList.toArray(new zzagw[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i == 3) {
            long j3 = this.zzm;
            if (j3 != -1 && zzaevVar.zzn() != j3) {
                this.zzj = j3;
                return 0;
            }
            zzer zzerVar3 = this.zza;
            zzaevVar.zzi(zzerVar3.zzi(), 0, 12);
            zzaevVar.zzl();
            zzerVar3.zzh(0);
            zzags zzagsVar2 = this.zzb;
            zzagsVar2.zza(zzerVar3);
            int zzC2 = zzerVar3.zzC();
            int i8 = zzagsVar2.zza;
            if (i8 == 1179011410) {
                zzaevVar.zzf(12);
                return 0;
            }
            if (i8 != 1414744396 || zzC2 != 1769369453) {
                this.zzj = zzaevVar.zzn() + zzagsVar2.zzb + 8;
                return 0;
            }
            long zzn2 = zzaevVar.zzn();
            this.zzm = zzn2;
            long j4 = zzn2 + zzagsVar2.zzb + 8;
            this.zzn = j4;
            if (!this.zzp) {
                zzagu zzaguVar2 = this.zzg;
                zzaguVar2.getClass();
                if ((zzaguVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j4;
                    return 0;
                }
                this.zzf.zzw(new zzafx(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzaevVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i == 4) {
            zzer zzerVar4 = this.zza;
            zzaevVar.zzc(zzerVar4.zzi(), 0, 8);
            zzerVar4.zzh(0);
            int zzC3 = zzerVar4.zzC();
            int zzC4 = zzerVar4.zzC();
            if (zzC3 == 829973609) {
                this.zze = 5;
                this.zzo = zzC4;
            } else {
                this.zzj = zzaevVar.zzn() + zzC4;
            }
            return 0;
        }
        if (i == 5) {
            zzer zzerVar5 = new zzer(this.zzo);
            zzaevVar.zzc(zzerVar5.zzi(), 0, this.zzo);
            if (zzerVar5.zzd() < 16) {
                j = 0;
            } else {
                int zzg = zzerVar5.zzg();
                zzerVar5.zzk(8);
                long zzC5 = zzerVar5.zzC();
                long j5 = this.zzm;
                j = zzC5 > j5 ? 0L : 8 + j5;
                zzerVar5.zzh(zzg);
            }
            while (zzerVar5.zzd() >= 16) {
                int zzC6 = zzerVar5.zzC();
                int zzC7 = zzerVar5.zzC();
                long zzC8 = zzerVar5.zzC() + j;
                zzerVar5.zzk(4);
                zzagw zzi = zzi(zzC6);
                if (zzi != null) {
                    zzi.zza(zzC8, (zzC7 & 16) == 16);
                }
            }
            for (zzagw zzagwVar2 : this.zzi) {
                zzagwVar2.zzb();
            }
            this.zzp = true;
            if (this.zzi.length == 0) {
                this.zzf.zzw(new zzafx(this.zzh, 0L));
            } else {
                this.zzf.zzw(new zzagr(this, this.zzh));
            }
            this.zze = 6;
            this.zzj = this.zzm;
            return 0;
        }
        if (zzaevVar.zzn() >= this.zzn) {
            return -1;
        }
        zzagw zzagwVar3 = this.zzk;
        if (zzagwVar3 != null) {
            if (!zzagwVar3.zze(zzaevVar)) {
                return 0;
            }
            this.zzk = null;
            return 0;
        }
        if ((zzaevVar.zzn() & 1) == 1) {
            zzaevVar.zzf(1);
        }
        zzer zzerVar6 = this.zza;
        zzaevVar.zzi(zzerVar6.zzi(), 0, 12);
        zzerVar6.zzh(0);
        int zzC9 = zzerVar6.zzC();
        if (zzC9 == 1414744396) {
            zzerVar6.zzh(8);
            zzaevVar.zzf(zzerVar6.zzC() != 1769369453 ? 8 : 12);
            zzaevVar.zzl();
            return 0;
        }
        int zzC10 = zzerVar6.zzC();
        if (zzC9 == 1263424842) {
            this.zzj = zzaevVar.zzn() + zzC10 + 8;
            return 0;
        }
        zzaevVar.zzf(8);
        zzaevVar.zzl();
        zzagw zzi2 = zzi(zzC9);
        if (zzi2 == null) {
            this.zzj = zzaevVar.zzn() + zzC10;
            return 0;
        }
        zzi2.zzd(zzC10);
        this.zzk = zzi2;
        return 0;
    }

    public final void zze(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzagw zzagwVar : this.zzi) {
            zzagwVar.zzf(j);
        }
        if (j == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    public final void zzf() {
    }

    public final /* synthetic */ zzagw[] zzh() {
        return this.zzi;
    }

    public zzagt(int i, zzamd zzamdVar) {
        this.zzd = zzamdVar;
        this.zzc = 1 == (i ^ 1);
        this.zza = new zzer(12);
        this.zzb = new zzags(null);
        this.zzf = new zzaft();
        this.zzi = new zzagw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
