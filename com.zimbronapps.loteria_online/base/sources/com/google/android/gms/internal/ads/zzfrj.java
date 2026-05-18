package com.google.android.gms.internal.ads;

import S5.W1;
import S5.Y;
import S5.g0;
import V5.o0;
import android.content.Context;
import android.net.ConnectivityManager;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfrj {
    private final zzfsb zzc;
    private final zzfrf zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final E6.f zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    public zzfrj(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, E6.f fVar) {
        this.zzc = zzfsbVar;
        this.zzd = zzfrfVar;
        this.zze = context;
        this.zzh = fVar;
    }

    public static String zzh(String str, L5.c cVar) {
        String name = cVar == null ? "NULL" : cVar.name();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length());
        sb.append(str);
        sb.append("#");
        sb.append(name);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzy)).booleanValue()) {
            zzj(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z) {
        try {
            if (z) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfsa) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfsa) it2.next()).zzi();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:25:0x0034, B:31:0x003c, B:28:0x004b, B:9:0x0051, B:16:0x0059, B:22:0x0067, B:19:0x0076, B:12:0x007a, B:34:0x007e, B:35:0x0088, B:37:0x008e, B:40:0x00a0, B:45:0x00b5, B:46:0x00bf, B:48:0x00c5, B:50:0x00e6, B:52:0x00fb, B:55:0x0101, B:59:0x00f8), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized java.util.List zzm(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48
            r1.<init>()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            S5.W1 r2 = (S5.W1) r2     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r2.a     // Catch: java.lang.Throwable -> L48
            int r4 = r2.b     // Catch: java.lang.Throwable -> L48
            L5.c r4 = L5.c.a(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = zzh(r3, r4)     // Catch: java.lang.Throwable -> L48
            r0.add(r3)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.ConcurrentMap r4 = r8.zza     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzfsa r5 = (com.google.android.gms.internal.ads.zzfsa) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L51
            S5.W1 r6 = r5.zze     // Catch: java.lang.Throwable -> L48
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r6 != 0) goto L4b
            java.util.concurrent.ConcurrentMap r6 = r8.zzb     // Catch: java.lang.Throwable -> L48
            r6.put(r3, r5)     // Catch: java.lang.Throwable -> L48
            r4.remove(r3)     // Catch: java.lang.Throwable -> L48
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L48:
            r9 = move-exception
            goto L107
        L4b:
            int r2 = r2.d     // Catch: java.lang.Throwable -> L48
            r5.zzw(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L51:
            java.util.concurrent.ConcurrentMap r5 = r8.zzb     // Catch: java.lang.Throwable -> L48
            boolean r6 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L48
            if (r6 == 0) goto L7a
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzfsa r6 = (com.google.android.gms.internal.ads.zzfsa) r6     // Catch: java.lang.Throwable -> L48
            S5.W1 r7 = r6.zze     // Catch: java.lang.Throwable -> L48
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L76
            int r2 = r2.d     // Catch: java.lang.Throwable -> L48
            r6.zzw(r2)     // Catch: java.lang.Throwable -> L48
            r6.zzj()     // Catch: java.lang.Throwable -> L48
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L48
            r5.remove(r3)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L76:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7a:
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto Lf
        L7e:
            java.util.concurrent.ConcurrentMap r9 = r8.zza     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        L88:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L48
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L48
            if (r3 != 0) goto L88
            java.util.concurrent.ConcurrentMap r3 = r8.zzb     // Catch: java.lang.Throwable -> L48
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L48
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzfsa r2 = (com.google.android.gms.internal.ads.zzfsa) r2     // Catch: java.lang.Throwable -> L48
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L48
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto L88
        Lb5:
            java.util.concurrent.ConcurrentMap r9 = r8.zzb     // Catch: java.lang.Throwable -> L48
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L48
        Lbf:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L105
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L48
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzfsa r0 = (com.google.android.gms.internal.ads.zzfsa) r0     // Catch: java.lang.Throwable -> L48
            r0.zzh()     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzA     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbhc r3 = S5.D.c()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto Lf8
            com.google.android.gms.internal.ads.zzbgv r2 = com.google.android.gms.internal.ads.zzbhe.zzB     // Catch: java.lang.Throwable -> L48
            com.google.android.gms.internal.ads.zzbhc r3 = S5.D.c()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r2 = r3.zzd(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L48
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto Lfb
        Lf8:
            r0.zzr()     // Catch: java.lang.Throwable -> L48
        Lfb:
            boolean r0 = r0.zzf()     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto Lbf
            r9.remove()     // Catch: java.lang.Throwable -> L48
            goto Lbf
        L105:
            monitor-exit(r8)
            return r1
        L107:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L48
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfrj.zzm(java.util.List):java.util.List");
    }

    private final synchronized void zzn(String str, zzfsa zzfsaVar) {
        zzfsaVar.zzd();
        this.zza.put(str, zzfsaVar);
    }

    private final synchronized boolean zzo(String str, L5.c cVar) {
        boolean z;
        try {
            E6.f fVar = this.zzh;
            long a = fVar.a();
            zzfsa zzq = zzq(str, cVar);
            z = zzq != null && zzq.zzf();
            this.zzd.zzd(zzq == null ? 0 : zzq.zze.d, zzq == null ? 0 : zzq.zzp(), a, z ? Long.valueOf(fVar.a()) : null, zzq == null ? null : zzq.zzk(), new zzfrm(new zzfrl(str, cVar), null), "1");
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    private final synchronized Object zzp(Class cls, String str, L5.c cVar) {
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, cVar), null);
        zzfrf zzfrfVar = this.zzd;
        E6.f fVar = this.zzh;
        zzfrfVar.zzf(fVar.a(), zzfrmVar, -1, -1, "1");
        zzfsa zzq = zzq(str, cVar);
        if (zzq == null) {
            return null;
        }
        try {
            String zzk = zzq.zzk();
            Object zzg = zzq.zzg();
            Object cast = zzg == null ? null : cls.cast(zzg);
            if (cast != null) {
                zzfrfVar.zzh(fVar.a(), zzq.zze.d, zzq.zzp(), zzk, zzfrmVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            R5.t.l().zzg(e, "PreloadAdManager.pollAd");
            o0.l("Unable to cast ad to the requested type:".concat(cls.getName()), e);
            return null;
        }
    }

    private final synchronized zzfsa zzq(String str, L5.c cVar) {
        return (zzfsa) this.zza.get(zzh(str, cVar));
    }

    public final synchronized void zza(List list, g0 g0Var) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (this.zzf == null) {
                    synchronized (this) {
                        if (this.zzf == null) {
                            try {
                                this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                            } catch (ClassCastException e) {
                                int i = o0.b;
                                W5.p.g("Failed to get connectivity manager", e);
                            }
                        }
                    }
                }
                if (!E6.q.g() || this.zzf == null) {
                    this.zzi = new AtomicInteger(((Integer) S5.D.c().zzd(zzbhe.zzI)).intValue());
                } else {
                    try {
                        this.zzf.registerDefaultNetworkCallback(new zzfri(this));
                    } catch (RuntimeException e2) {
                        int i2 = o0.b;
                        W5.p.g("Failed to register network callback", e2);
                        this.zzi = new AtomicInteger(((Integer) S5.D.c().zzd(zzbhe.zzI)).intValue());
                    }
                }
                R5.t.k().zzb(new zzfrh(this));
            }
            List<W1> zzm = zzm(list);
            Map enumMap = new EnumMap(L5.c.class);
            for (W1 w1 : zzm) {
                String str = w1.a;
                L5.c a = L5.c.a(w1.b);
                zzfsa zza = this.zzc.zza(w1, g0Var);
                if (a != null && zza != null) {
                    AtomicInteger atomicInteger = this.zzi;
                    if (atomicInteger != null) {
                        zza.zzm(atomicInteger.get());
                    }
                    zzfrf zzfrfVar = this.zzd;
                    zza.zzl(zzfrfVar);
                    zzn(zzh(str, a), zza);
                    enumMap.put(a, Integer.valueOf(((Integer) W5.g.m(enumMap, a, 0)).intValue() + 1));
                    zzfrfVar.zza(w1.d, this.zzh.a(), new zzfrm(new zzfrl(str, a), null), "1");
                }
            }
            this.zzd.zzb(enumMap, this.zzh.a(), "1");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, L5.c.REWARDED);
    }

    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzp(zzcaz.class, str, L5.c.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, L5.c.APP_OPEN_AD);
    }

    public final synchronized zzbex zze(String str) {
        return (zzbex) zzp(zzbex.class, str, L5.c.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, L5.c.INTERSTITIAL);
    }

    public final synchronized Y zzg(String str) {
        return (Y) zzp(Y.class, str, L5.c.INTERSTITIAL);
    }
}
