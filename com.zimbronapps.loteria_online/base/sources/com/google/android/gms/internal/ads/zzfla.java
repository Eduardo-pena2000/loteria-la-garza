package com.google.android.gms.internal.ads;

import S5.l2;
import S5.w2;
import V5.o0;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbgj;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfla implements zzfkz {
    private final ConcurrentHashMap zza;
    private final zzflg zzb;
    private final zzflc zzc = new zzflc();

    public zzfla(zzflg zzflgVar) {
        this.zza = new ConcurrentHashMap(zzflgVar.zzd);
        this.zzb = zzflgVar;
    }

    private final void zzf() {
        Parcelable.Creator creator = zzflg.CREATOR;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzhl)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            zzflg zzflgVar = this.zzb;
            sb.append(zzflgVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzflj) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfky) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((zzfky) entry.getValue()).zzc(); zzc < zzflgVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfky) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzflgVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            String sb2 = sb.toString();
            int i3 = o0.b;
            W5.p.a(sb2);
        }
    }

    public final synchronized zzfli zza(zzflj zzfljVar) {
        zzfli zzfliVar;
        try {
            zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
            if (zzfkyVar != null) {
                zzfliVar = zzfkyVar.zzb();
                if (zzfliVar == null) {
                    this.zzc.zzb();
                }
                zzflw zzh = zzfkyVar.zzh();
                if (zzfliVar != null) {
                    zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
                    zzbgj.zzb.zza.zza zzs2 = zzbgj.zzb.zza.zzs();
                    zzs2.zzc(zzbgj.zzb.zzd.zzb);
                    zzbgj.zzb.zze.zza zzq = zzbgj.zzb.zze.zzq();
                    zzq.zzc(zzh.zza);
                    zzq.zzg(zzh.zzb);
                    zzs2.zzh(zzq);
                    zzs.zzh(zzs2);
                    zzfliVar.zza.zza().zzd().zzj((zzbgj.zzb) zzs.zzbm());
                }
                zzf();
            } else {
                this.zzc.zza();
                zzf();
                zzfliVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzfliVar;
    }

    public final synchronized boolean zzb(zzflj zzfljVar, zzfli zzfliVar) {
        boolean zza;
        try {
            ConcurrentHashMap concurrentHashMap = this.zza;
            zzfky zzfkyVar = (zzfky) concurrentHashMap.get(zzfljVar);
            zzfliVar.zzd = R5.t.o().a();
            if (zzfkyVar == null) {
                zzflg zzflgVar = this.zzb;
                zzfky zzfkyVar2 = new zzfky(zzflgVar.zzd, zzflgVar.zze * 1000);
                if (concurrentHashMap.size() == zzflgVar.zzc) {
                    int i = zzflgVar.zzg;
                    int i2 = i - 1;
                    zzflj zzfljVar2 = null;
                    if (i == 0) {
                        throw null;
                    }
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry.getValue()).zzd() < j) {
                                j = ((zzfky) entry.getValue()).zzd();
                                zzfljVar2 = (zzflj) entry.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry2.getValue()).zze() < j) {
                                j = ((zzfky) entry2.getValue()).zze();
                                zzfljVar2 = (zzflj) entry2.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : concurrentHashMap.entrySet()) {
                            if (((zzfky) entry3.getValue()).zzf() < i3) {
                                i3 = ((zzfky) entry3.getValue()).zzf();
                                zzfljVar2 = (zzflj) entry3.getKey();
                            }
                        }
                        if (zzfljVar2 != null) {
                            concurrentHashMap.remove(zzfljVar2);
                        }
                    }
                    this.zzc.zzd();
                }
                concurrentHashMap.put(zzfljVar, zzfkyVar2);
                this.zzc.zzc();
                zzfkyVar = zzfkyVar2;
            }
            zza = zzfkyVar.zza(zzfliVar);
            zzflc zzflcVar = this.zzc;
            zzflcVar.zze();
            zzflb zzf = zzflcVar.zzf();
            zzflw zzh = zzfkyVar.zzh();
            zzbgj.zzb.zzc zzs = zzbgj.zzb.zzs();
            zzbgj.zzb.zza.zza zzs2 = zzbgj.zzb.zza.zzs();
            zzs2.zzc(zzbgj.zzb.zzd.zzb);
            zzbgj.zzb.zzg.zza zzs3 = zzbgj.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfliVar.zza.zza().zzd().zzk((zzbgj.zzb) zzs.zzbm());
            zzf();
        } catch (Throwable th) {
            throw th;
        }
        return zza;
    }

    public final synchronized boolean zzc(zzflj zzfljVar) {
        zzfky zzfkyVar = (zzfky) this.zza.get(zzfljVar);
        if (zzfkyVar == null) {
            return true;
        }
        return zzfkyVar.zzc() < this.zzb.zzd;
    }

    @Deprecated
    public final zzflj zzd(l2 l2Var, String str, w2 w2Var) {
        zzflg zzflgVar = this.zzb;
        return new zzflk(l2Var, str, new zzbzx(zzflgVar.zza).zza().zzj, zzflgVar.zzf, w2Var);
    }

    public final zzflg zze() {
        return this.zzb;
    }
}
