package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzapv implements zzapn {
    final /* synthetic */ zzapx zza;
    private final zzeq zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzapv(zzapx zzapxVar, int i) {
        Objects.requireNonNull(zzapxVar);
        this.zza = zzapxVar;
        this.zzb = new zzeq(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    public final void zza(zzfg zzfgVar, zzaex zzaexVar, zzaqb zzaqbVar) {
    }

    public final void zzb(zzer zzerVar) {
        zzfg zzfgVar;
        int i;
        zzfg zzfgVar2;
        int i2;
        zzeq zzeqVar;
        int i3;
        if (zzerVar.zzs() == 2) {
            zzapx zzapxVar = this.zza;
            zzfg zzfgVar3 = (zzfg) zzapxVar.zzh().get(0);
            if ((zzerVar.zzs() & 128) != 0) {
                zzerVar.zzk(1);
                int zzt = zzerVar.zzt();
                int i4 = 3;
                zzerVar.zzk(3);
                zzeq zzeqVar2 = this.zzb;
                zzerVar.zzl(zzeqVar2, 2);
                zzeqVar2.zzh(3);
                int i5 = 13;
                zzapxVar.zzq(zzeqVar2.zzj(13));
                zzerVar.zzl(zzeqVar2, 2);
                int i6 = 4;
                zzeqVar2.zzh(4);
                int i7 = 12;
                zzerVar.zzk(zzeqVar2.zzj(12));
                SparseArray sparseArray = this.zzc;
                sparseArray.clear();
                SparseIntArray sparseIntArray = this.zzd;
                sparseIntArray.clear();
                int zzd = zzerVar.zzd();
                while (zzd > 0) {
                    int i8 = 5;
                    zzerVar.zzl(zzeqVar2, 5);
                    int zzj = zzeqVar2.zzj(8);
                    zzeqVar2.zzh(i4);
                    int zzj2 = zzeqVar2.zzj(i5);
                    zzeqVar2.zzh(i6);
                    int zzj3 = zzeqVar2.zzj(i7);
                    int zzg = zzerVar.zzg();
                    int i9 = zzg + zzj3;
                    String str = null;
                    List list = null;
                    int i10 = -1;
                    int i11 = 0;
                    while (zzerVar.zzg() < i9) {
                        int zzs = zzerVar.zzs();
                        int zzg2 = zzerVar.zzg() + zzerVar.zzs();
                        if (zzg2 > i9) {
                            break;
                        }
                        if (zzs == i8) {
                            long zzz = zzerVar.zzz();
                            if (zzz != 1094921523) {
                                if (zzz != 1161904947) {
                                    if (zzz != 1094921524) {
                                        if (zzz == 1212503619) {
                                            i3 = 36;
                                            i10 = i3;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                    }
                                    zzfgVar2 = zzfgVar3;
                                    i2 = zzt;
                                    zzeqVar = zzeqVar2;
                                    i10 = 172;
                                }
                                zzfgVar2 = zzfgVar3;
                                i2 = zzt;
                                zzeqVar = zzeqVar2;
                                i10 = 135;
                            }
                            zzfgVar2 = zzfgVar3;
                            i2 = zzt;
                            zzeqVar = zzeqVar2;
                            i10 = 129;
                        } else {
                            if (zzs != 106) {
                                if (zzs != 122) {
                                    if (zzs == 127) {
                                        int zzs2 = zzerVar.zzs();
                                        if (zzs2 != 21) {
                                            if (zzs2 == 14) {
                                                i3 = 136;
                                            } else {
                                                if (zzs2 == 33) {
                                                    i3 = 139;
                                                }
                                                zzfgVar2 = zzfgVar3;
                                                i2 = zzt;
                                                zzeqVar = zzeqVar2;
                                            }
                                            i10 = i3;
                                            zzfgVar2 = zzfgVar3;
                                            i2 = zzt;
                                            zzeqVar = zzeqVar2;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                        i10 = 172;
                                    } else if (zzs == 123) {
                                        i3 = 138;
                                        i10 = i3;
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                    } else if (zzs == 10) {
                                        String trim = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        i11 = zzerVar.zzs();
                                        str = trim;
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                    } else if (zzs == 89) {
                                        List arrayList = new ArrayList();
                                        while (zzerVar.zzg() < zzg2) {
                                            zzeq zzeqVar3 = zzeqVar2;
                                            String trim2 = zzerVar.zzK(3, StandardCharsets.UTF_8).trim();
                                            int zzs3 = zzerVar.zzs();
                                            zzfg zzfgVar4 = zzfgVar3;
                                            byte[] bArr = new byte[4];
                                            zzerVar.zzm(bArr, 0, 4);
                                            arrayList.add(new zzapy(trim2, zzs3, bArr));
                                            zzfgVar3 = zzfgVar4;
                                            zzeqVar2 = zzeqVar3;
                                            zzt = zzt;
                                        }
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                        list = arrayList;
                                        i10 = 89;
                                    } else {
                                        zzfgVar2 = zzfgVar3;
                                        i2 = zzt;
                                        zzeqVar = zzeqVar2;
                                        if (zzs == 111) {
                                            i10 = 257;
                                        }
                                    }
                                }
                                zzfgVar2 = zzfgVar3;
                                i2 = zzt;
                                zzeqVar = zzeqVar2;
                                i10 = 135;
                            }
                            zzfgVar2 = zzfgVar3;
                            i2 = zzt;
                            zzeqVar = zzeqVar2;
                            i10 = 129;
                        }
                        zzerVar.zzk(zzg2 - zzerVar.zzg());
                        zzfgVar3 = zzfgVar2;
                        zzeqVar2 = zzeqVar;
                        zzt = i2;
                        i8 = 5;
                    }
                    zzfg zzfgVar5 = zzfgVar3;
                    int i12 = zzt;
                    zzeq zzeqVar4 = zzeqVar2;
                    zzerVar.zzh(i9);
                    zzapz zzapzVar = new zzapz(i10, str, i11, list, Arrays.copyOfRange(zzerVar.zzi(), zzg, i9));
                    if (zzj == 6 || zzj == 5) {
                        zzj = zzapzVar.zza;
                    }
                    zzd -= zzj3 + 5;
                    if (!zzapxVar.zzk().get(zzj2)) {
                        zzaqc zzb = zzapxVar.zzi().zzb(zzj, zzapzVar);
                        sparseIntArray.put(zzj2, zzj2);
                        sparseArray.put(zzj2, zzb);
                    }
                    i6 = 4;
                    zzfgVar3 = zzfgVar5;
                    zzeqVar2 = zzeqVar4;
                    zzt = i12;
                    i4 = 3;
                    i5 = 13;
                    i7 = 12;
                }
                zzfg zzfgVar6 = zzfgVar3;
                int i13 = zzt;
                int size = sparseIntArray.size();
                int i14 = 0;
                while (i14 < size) {
                    int keyAt = sparseIntArray.keyAt(i14);
                    int valueAt = sparseIntArray.valueAt(i14);
                    zzapxVar.zzk().put(keyAt, true);
                    zzapxVar.zzl().put(valueAt, true);
                    zzaqc zzaqcVar = (zzaqc) sparseArray.valueAt(i14);
                    if (zzaqcVar != null) {
                        i = i13;
                        zzfgVar = zzfgVar6;
                        zzaqcVar.zza(zzfgVar, zzapxVar.zzm(), new zzaqb(i, keyAt, 8192));
                        zzapxVar.zzj().put(valueAt, zzaqcVar);
                    } else {
                        zzfgVar = zzfgVar6;
                        i = i13;
                    }
                    i14++;
                    zzfgVar6 = zzfgVar;
                    i13 = i;
                }
                zzapxVar.zzj().remove(this.zze);
                zzapxVar.zzo(0);
                if (zzapxVar.zzn() == 0) {
                    zzapxVar.zzm().zzv();
                    zzapxVar.zzp(true);
                }
            }
        }
    }
}
