package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzis implements zzlj {
    public static final zzguf zza = zzguf.zzn("file", "content", "data", "android.resource", "rawresource", "asset");
    private final zzbe zzb;
    private final zzbd zzc;
    private final zzaat zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final long zzk;
    private final long zzl;
    private final long zzm;
    private final zzgui zzn;
    private final ConcurrentHashMap zzo;
    private long zzp;

    public zzis() {
        zzaat zzaatVar = new zzaat(true, 65536);
        zzgui zza2 = zzgui.zza();
        zzq(1000, 0, "bufferForPlaybackMs", "0");
        zzq(1000, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        zzq(2000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        zzq(1000, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        zzq(50000, 1000, "minBufferMs", "bufferForPlaybackMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        zzq(50000, 2000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        zzq(1000, 1000, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        zzq(50000, 50000, "maxBufferMs", "minBufferMs");
        zzq(50000, 1000, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        zzq(0, 0, "backBufferDurationMs", "0");
        this.zzb = new zzbe();
        this.zzc = new zzbd();
        this.zzd = zzaatVar;
        this.zze = zzfj.zzq(50000L);
        this.zzf = zzfj.zzq(1000L);
        this.zzg = zzfj.zzq(50000L);
        this.zzh = zzfj.zzq(50000L);
        this.zzi = zzfj.zzq(1000L);
        this.zzj = zzfj.zzq(1000L);
        this.zzk = zzfj.zzq(2000L);
        this.zzl = zzfj.zzq(1000L);
        this.zzm = zzfj.zzq(0L);
        this.zzo = new ConcurrentHashMap();
        this.zzn = zzgui.zzc(zza2);
        this.zzp = -1L;
    }

    private final int zzm(zzpq zzpqVar) {
        Integer num = (Integer) this.zzn.get(zzpqVar.zzb);
        if (num == null || num.intValue() == -1) {
            return -1;
        }
        return num.intValue();
    }

    private final void zzn(zzpq zzpqVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar != null) {
            int i = zzirVar.zza - 1;
            zzirVar.zza = i;
            if (i == 0) {
                concurrentHashMap.remove(zzpqVar);
                zzo();
            }
        }
    }

    private final void zzo() {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        if (concurrentHashMap.isEmpty()) {
            this.zzd.zze();
            return;
        }
        zzaat zzaatVar = this.zzd;
        Iterator it = concurrentHashMap.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zzir) it.next()).zzc;
        }
        zzaatVar.zzf(i);
    }

    private final boolean zzp(zzli zzliVar) {
        zzbf zzbfVar = zzliVar.zzb;
        zzag zzagVar = zzbfVar.zzb(zzbfVar.zzo(zzliVar.zzc.zza, this.zzc).zzc, this.zzb, 0L).zzd.zzb;
        if (zzagVar == null) {
            return false;
        }
        String scheme = zzagVar.zza.getScheme();
        return TextUtils.isEmpty(scheme) || zza.contains(scheme);
    }

    private static void zzq(int i, int i2, String str, String str2) {
        zzgrc.zzh(i >= i2, "%s cannot be less than %s", str, str2);
    }

    private final int zzr(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc() * 65536;
    }

    private final int zzs(zzpq zzpqVar) {
        zzir zzirVar = (zzir) this.zzo.get(zzpqVar);
        zzirVar.getClass();
        return zzirVar.zzc;
    }

    private static final boolean zzt(boolean z) {
        return z;
    }

    public final void zza(zzpq zzpqVar) {
        long id = Thread.currentThread().getId();
        long j = this.zzp;
        zzgrc.zzj(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.zzp = id;
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        if (zzirVar == null) {
            concurrentHashMap.put(zzpqVar, new zzir());
        } else {
            zzirVar.zza++;
        }
        zzir zzirVar2 = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar2.getClass();
        int zzm = zzm(zzpqVar);
        if (zzm == -1) {
            zzm = 13107200;
        }
        zzirVar2.zzc = zzm;
        zzirVar2.zzb = false;
    }

    public final void zzb(zzli zzliVar, zzyn zzynVar, zzaac[] zzaacVarArr) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        int zzm = zzm(zzpqVar);
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        if (zzm == -1) {
            boolean zzp = zzp(zzliVar);
            int length = zzaacVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    zzaac zzaacVar = zzaacVarArr[i];
                    if (zzaacVar != null) {
                        switch (zzaacVar.zza().zzc) {
                            case -1:
                            case 1:
                                break;
                            case 0:
                                i3 = 144310272;
                                break;
                            case 2:
                                if (!zzp) {
                                    i3 = 131072000;
                                    break;
                                } else {
                                    i3 = 19660800;
                                    break;
                                }
                            case 3:
                            case 5:
                            default:
                                i3 = 131072;
                                break;
                            case 4:
                                i3 = 26214400;
                                break;
                        }
                        i2 += i3;
                    }
                    i++;
                } else {
                    zzm = Math.max(13107200, i2);
                }
            }
        }
        zzirVar.zzc = zzm;
        zzo();
    }

    public final void zzc(zzpq zzpqVar) {
        zzn(zzpqVar);
    }

    public final void zzd(zzpq zzpqVar) {
        zzn(zzpqVar);
        if (this.zzo.isEmpty()) {
            this.zzp = -1L;
        }
    }

    public final zzaan zze(zzpq zzpqVar) {
        return new zziq(this, zzpqVar);
    }

    public final long zzf(zzpq zzpqVar) {
        return this.zzm;
    }

    public final boolean zzg(zzpq zzpqVar) {
        return false;
    }

    public final boolean zzh(zzli zzliVar) {
        ConcurrentHashMap concurrentHashMap = this.zzo;
        zzpq zzpqVar = zzliVar.zza;
        zzir zzirVar = (zzir) concurrentHashMap.get(zzpqVar);
        zzirVar.getClass();
        int zzr = zzr(zzpqVar);
        int zzs = zzs(zzpqVar);
        if (zzpqVar.equals(zzpq.zza)) {
            return zzr < zzs;
        }
        boolean zzp = zzp(zzliVar);
        long j = zzp ? this.zzf : this.zze;
        long j2 = zzp ? this.zzh : this.zzg;
        float f = zzliVar.zzf;
        if (f > 1.0f) {
            j = Math.min(zzfj.zzv(j, f), j2);
        }
        long j3 = zzliVar.zze;
        if (j3 < Math.max(j, 500000L)) {
            boolean z = zzt(zzp) || zzr < zzs;
            zzirVar.zzb = z;
            if (!z && j3 < 500000) {
                zzee.zzc("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j2 || zzr >= zzs) {
            zzirVar.zzb = false;
        }
        return zzirVar.zzb;
    }

    public final boolean zzi(zzli zzliVar) {
        long j;
        boolean z;
        boolean z2 = zzliVar.zzg;
        long j2 = zzliVar.zze;
        float f = zzliVar.zzf;
        boolean zzp = zzp(zzliVar);
        long zzw = zzfj.zzw(j2, f);
        if (z2) {
            if (zzp) {
                j = this.zzl;
                z = true;
            } else {
                j = this.zzk;
                z = false;
            }
        } else if (zzp) {
            j = this.zzj;
            z = true;
        } else {
            j = this.zzi;
            z = false;
        }
        long j3 = zzliVar.zzh;
        if (j3 != -9223372036854775807L) {
            j = Math.min(j3 / 2, j);
        }
        if (j > 0 && zzw < j) {
            if (zzt(z)) {
                return false;
            }
            zzpq zzpqVar = zzliVar.zza;
            if (zzr(zzpqVar) < zzs(zzpqVar)) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzj(zzpq zzpqVar, zzbf zzbfVar, zzwk zzwkVar, long j) {
        Iterator it = this.zzo.values().iterator();
        while (it.hasNext()) {
            if (((zzir) it.next()).zzb) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ zzaat zzk() {
        return this.zzd;
    }

    public final /* synthetic */ ConcurrentHashMap zzl() {
        return this.zzo;
    }
}
