package com.google.android.gms.internal.ads;

import S5.W1;
import S5.Y;
import S5.i0;
import V5.o0;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfqw {
    private final Map zza;
    private final zzfsb zzb;
    private final zzfrf zzc;
    private final Context zzd;
    private volatile ConnectivityManager zze;
    private final AtomicBoolean zzf = new AtomicBoolean(false);
    private final E6.f zzg;
    private AtomicInteger zzh;
    private final zzfqr zzi;

    public zzfqw(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, E6.f fVar, zzfqr zzfqrVar) {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        hashMap.put(L5.c.APP_OPEN_AD, new HashMap());
        hashMap.put(L5.c.INTERSTITIAL, new HashMap());
        hashMap.put(L5.c.REWARDED, new HashMap());
        this.zzb = zzfsbVar;
        this.zzc = zzfrfVar;
        this.zzd = context;
        this.zzg = fVar;
        this.zzi = zzfqrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzk(boolean z) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzy)).booleanValue()) {
            zzl(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzl(boolean z) {
        try {
            Iterator it = this.zza.values().iterator();
            while (it.hasNext()) {
                for (zzfsa zzfsaVar : ((Map) it.next()).values()) {
                    if (z) {
                        zzfsaVar.zzj();
                    } else {
                        zzfsaVar.zzi();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized Object zzo(Class cls, L5.c cVar, String str) {
        zzfrf zzfrfVar = this.zzc;
        E6.f fVar = this.zzg;
        zzfrfVar.zze(fVar.a(), "2");
        Map map = this.zza;
        if (!map.containsKey(cVar)) {
            return null;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(cVar)).get(str);
        if (zzfsaVar != null && cVar.equals(zzfsaVar.zzo())) {
            zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.a, zzfsaVar.zzo());
            zzfrlVar.zza(str);
            zzfrm zzfrmVar = new zzfrm(zzfrlVar, null);
            zzfrfVar.zzf(fVar.a(), zzfrmVar, zzfsaVar.zze.d, zzfsaVar.zzp(), "2");
            try {
                String zzk = zzfsaVar.zzk();
                Object zzg = zzfsaVar.zzg();
                Object cast = zzg == null ? null : cls.cast(zzg);
                if (cast != null) {
                    zzfrfVar.zzh(fVar.a(), zzfsaVar.zze.d, zzfsaVar.zzp(), zzk, zzfrmVar, "2");
                }
                return cast;
            } catch (ClassCastException e) {
                R5.t.l().zzg(e, "PreloadAdManager.pollAd");
                o0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
                return null;
            }
        }
        return null;
    }

    private final synchronized boolean zzp(L5.c cVar) {
        int size;
        int ordinal;
        try {
            Map map = this.zza;
            size = map.containsKey(cVar) ? ((Map) map.get(cVar)).size() : 0;
            ordinal = cVar.ordinal();
        } finally {
        }
        return size < (ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? 0 : Math.max(((Integer) S5.D.c().zzd(zzbhe.zzfu)).intValue(), 1) : Math.max(((Integer) S5.D.c().zzd(zzbhe.zzft)).intValue(), 1) : Math.max(((Integer) S5.D.c().zzd(zzbhe.zzfs)).intValue(), 1));
    }

    public final synchronized boolean zza(String str, W1 w1, i0 i0Var) {
        zzfsa zzb;
        try {
            if (!this.zzf.getAndSet(true)) {
                if (this.zze == null) {
                    synchronized (this) {
                        if (this.zze == null) {
                            try {
                                this.zze = (ConnectivityManager) this.zzd.getSystemService("connectivity");
                            } catch (ClassCastException e) {
                                int i = o0.b;
                                W5.p.g("Failed to get connectivity manager", e);
                            }
                        }
                    }
                }
                if (!E6.q.g() || this.zze == null) {
                    this.zzh = new AtomicInteger(((Integer) S5.D.c().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zze.registerDefaultNetworkCallback(new zzfqu(this));
                    } catch (RuntimeException e2) {
                        int i2 = o0.b;
                        W5.p.g("Failed to register network callback", e2);
                        this.zzh = new AtomicInteger(((Integer) S5.D.c().zzd(zzbhe.zzI)).intValue());
                    }
                }
                R5.t.k().zzb(new zzfqv(this));
            }
            L5.c a = L5.c.a(w1.b);
            if (a != null) {
                Map map = this.zza;
                if (map.containsKey(a) && !((Map) map.get(a)).containsKey(str) && zzp(a) && (zzb = this.zzb.zzb(str, w1, i0Var)) != null) {
                    AtomicInteger atomicInteger = this.zzh;
                    if (atomicInteger != null) {
                        zzb.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzc;
                    zzb.zzl(zzfrfVar);
                    zzfqr zzfqrVar = this.zzi;
                    if (zzfqrVar != null) {
                        zzfqrVar.zzd(str, a, zzb);
                    } else {
                        zzb.zzd();
                    }
                    ((Map) map.get(a)).put(str, zzb);
                    zzfrl zzfrlVar = new zzfrl(w1.a, a);
                    zzfrlVar.zza(str);
                    zzfrfVar.zza(w1.d, this.zzg.a(), new zzfrm(zzfrlVar, null), "2");
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(L5.c cVar, String str) {
        zzfrm zzfrmVar;
        try {
            E6.f fVar = this.zzg;
            long a = fVar.a();
            Map map = this.zza;
            int i = 0;
            if (!map.containsKey(cVar)) {
                return false;
            }
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(cVar)).get(str);
            String zzk = zzfsaVar == null ? null : zzfsaVar.zzk();
            boolean z = zzk != null && cVar.equals(zzfsaVar.zzo());
            Long valueOf = z ? Long.valueOf(fVar.a()) : null;
            if (zzfsaVar == null) {
                zzfrmVar = null;
            } else {
                zzfrl zzfrlVar = new zzfrl(zzfsaVar.zze.a, cVar);
                zzfrlVar.zza(str);
                zzfrmVar = new zzfrm(zzfrlVar, null);
            }
            zzfrf zzfrfVar = this.zzc;
            int i2 = zzfsaVar == null ? 0 : zzfsaVar.zze.d;
            if (zzfsaVar != null) {
                i = zzfsaVar.zzp();
            }
            zzfrfVar.zzd(i2, i, a, valueOf, zzk, zzfrmVar, "2");
            return z;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzo(zzcaz.class, L5.c.REWARDED, str);
    }

    public final synchronized zzbex zzd(String str) {
        return (zzbex) zzo(zzbex.class, L5.c.APP_OPEN_AD, str);
    }

    public final synchronized Y zze(String str) {
        return (Y) zzo(Y.class, L5.c.INTERSTITIAL, str);
    }

    public final synchronized W1 zzf(L5.c cVar, String str) {
        Map map = this.zza;
        if (map.containsKey(cVar)) {
            zzfsa zzfsaVar = (zzfsa) ((Map) map.get(cVar)).get(str);
            this.zzc.zzo(this.zzg.a(), str, zzfsaVar == null ? null : zzfsaVar.zze.a, cVar, zzfsaVar == null ? -1 : zzfsaVar.zze.d, zzfsaVar != null ? zzfsaVar.zzp() : -1);
            if (zzfsaVar != null) {
                return zzfsaVar.zze;
            }
        }
        return null;
    }

    public final synchronized int zzg(L5.c cVar, String str) {
        Map map = this.zza;
        int i = 0;
        if (!map.containsKey(cVar)) {
            return 0;
        }
        zzfsa zzfsaVar = (zzfsa) ((Map) map.get(cVar)).get(str);
        if (zzfsaVar != null) {
            i = zzfsaVar.zzp();
        }
        this.zzc.zzp(i, this.zzg.a(), str, zzfsaVar == null ? null : zzfsaVar.zze.a, cVar, zzfsaVar == null ? -1 : zzfsaVar.zze.d);
        return i;
    }

    public final synchronized Map zzh(int i) {
        try {
            HashMap hashMap = new HashMap();
            L5.c a = L5.c.a(i);
            if (a != null) {
                Map map = this.zza;
                if (map.containsKey(a)) {
                    for (zzfsa zzfsaVar : ((Map) map.get(a)).values()) {
                        hashMap.put(zzfsaVar.zzn(), zzfsaVar.zze);
                    }
                    this.zzc.zzn(a, this.zzg.a(), hashMap.size());
                    return hashMap;
                }
            }
            return hashMap;
        } finally {
        }
    }

    public final synchronized boolean zzi(L5.c cVar, String str) {
        zzfsa zzfsaVar;
        try {
            Map map = this.zza;
            if (map.containsKey(cVar) && (zzfsaVar = (zzfsa) ((Map) map.get(cVar)).get(str)) != null) {
                ((Map) map.get(cVar)).remove(str);
                zzfsaVar.zzh();
                zzfqr zzfqrVar = this.zzi;
                if (zzfqrVar != null) {
                    zzfqrVar.zze(str, cVar);
                }
                zzfsaVar.zzr();
                zzfrf zzfrfVar = this.zzc;
                long a = this.zzg.a();
                W1 w1 = zzfsaVar.zze;
                zzfrfVar.zzm(a, str, w1.a, cVar, w1.d, zzfsaVar.zzp());
                return true;
            }
            return false;
        } finally {
        }
    }

    public final synchronized void zzj(int i) {
        try {
            L5.c a = L5.c.a(i);
            if (a != null) {
                Map map = this.zza;
                if (map.containsKey(a)) {
                    Map map2 = (Map) map.get(a);
                    int size = map2.size();
                    for (String str : map2.keySet()) {
                        zzfsa zzfsaVar = (zzfsa) map2.get(str);
                        if (zzfsaVar != null) {
                            zzfsaVar.zzh();
                            zzfqr zzfqrVar = this.zzi;
                            if (zzfqrVar != null) {
                                zzfqrVar.zze(str, a);
                            }
                            zzfsaVar.zzr();
                            String valueOf = String.valueOf(str);
                            int i2 = o0.b;
                            W5.p.e("Destroyed ad preloader for preloadId: ".concat(valueOf));
                        }
                    }
                    map2.clear();
                    String concat = "Destroyed all ad preloaders for ad format: ".concat(a.toString());
                    int i3 = o0.b;
                    W5.p.e(concat);
                    this.zzc.zzl(this.zzg.a(), a, size);
                }
            }
        } finally {
        }
    }
}
