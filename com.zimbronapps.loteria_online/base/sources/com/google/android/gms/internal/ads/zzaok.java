package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaok implements zzaqa {
    private final List zza;

    public zzaok(int i, List list) {
        this.zza = list;
    }

    private final zzapq zzc(zzapz zzapzVar) {
        return new zzapq(zze(zzapzVar), "video/mp2t");
    }

    private final zzaqf zzd(zzapz zzapzVar) {
        return new zzaqf(zze(zzapzVar), "video/mp2t");
    }

    private final List zze(zzapz zzapzVar) {
        String str;
        int i;
        List list;
        zzer zzerVar = new zzer(zzapzVar.zze);
        ArrayList arrayList = this.zza;
        while (zzerVar.zzd() > 0) {
            int zzs = zzerVar.zzs();
            int zzg = zzerVar.zzg() + zzerVar.zzs();
            if (zzs == 134) {
                arrayList = new ArrayList();
                int zzs2 = zzerVar.zzs() & 31;
                for (int i2 = 0; i2 < zzs2; i2++) {
                    String zzK = zzerVar.zzK(3, StandardCharsets.UTF_8);
                    int zzs3 = zzerVar.zzs();
                    boolean z = (zzs3 & 128) != 0;
                    if (z) {
                        i = zzs3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte zzs4 = (byte) zzerVar.zzs();
                    zzerVar.zzk(1);
                    if (z) {
                        int i3 = zzs4 & 64;
                        int i4 = zzdo.zza;
                        list = Collections.singletonList(i3 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzt zztVar = new zzt();
                    zztVar.zzm(str);
                    zztVar.zze(zzK);
                    zztVar.zzJ(i);
                    zztVar.zzp(list);
                    arrayList.add(zztVar.zzM());
                }
            }
            zzerVar.zzh(zzg);
        }
        return arrayList;
    }

    public final SparseArray zza() {
        return new SparseArray();
    }

    public final zzaqc zzb(int i, zzapz zzapzVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new zzapg(new zzaoz(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i == 21) {
                return new zzapg(new zzaox("video/mp2t"));
            }
            if (i == 27) {
                return new zzapg(new zzaou(zzc(zzapzVar), false, false, "video/mp2t"));
            }
            if (i == 36) {
                return new zzapg(new zzaow(zzc(zzapzVar), "video/mp2t"));
            }
            if (i == 45) {
                return new zzapg(new zzapa("video/mp2t"));
            }
            if (i == 89) {
                return new zzapg(new zzaom(zzapzVar.zzd, "video/mp2t"));
            }
            if (i == 172) {
                return new zzapg(new zzaog(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
            if (i == 257) {
                return new zzapo(new zzapf("application/vnd.dvb.ait", "video/mp2t"));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i != 138) {
                        if (i == 139) {
                            return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 5408, "video/mp2t"));
                        }
                        switch (i) {
                            case 15:
                                return new zzapg(new zzaoj(false, zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            case 16:
                                return new zzapg(new zzaos(zzd(zzapzVar), "video/mp2t"));
                            case 17:
                                return new zzapg(new zzaoy(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
                            default:
                                switch (i) {
                                    case 134:
                                        return new zzapo(new zzapf("application/x-scte35", "video/mp2t"));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                    }
                    return new zzapg(new zzaol(zzapzVar.zzb, zzapzVar.zza(), 4096, "video/mp2t"));
                }
                return new zzapg(new zzaod(zzapzVar.zzb, zzapzVar.zza(), "video/mp2t"));
            }
        }
        return new zzapg(new zzaop(zzd(zzapzVar), "video/mp2t"));
    }

    public zzaok() {
        this(0);
    }

    public zzaok(int i) {
        this.zza = zzguf.zzi();
    }
}
