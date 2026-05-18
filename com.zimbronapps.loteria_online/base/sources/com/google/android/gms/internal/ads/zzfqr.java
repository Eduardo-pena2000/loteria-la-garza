package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfqr {
    private final int zzc;
    private ScheduledFuture zze;
    private final ScheduledExecutorService zzf;
    private final zzfrf zzg;
    private final E6.f zzh;
    private final AtomicBoolean zzd = new AtomicBoolean(false);
    final Map zza = new LinkedHashMap();
    final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzfqr(int i, ScheduledExecutorService scheduledExecutorService, zzfrf zzfrfVar, E6.f fVar) {
        this.zzc = i;
        this.zzf = scheduledExecutorService;
        this.zzg = zzfrfVar;
        this.zzh = fVar;
    }

    private static String zzl(String str, L5.c cVar) {
        return String.format("%s:%s", new Object[]{str, cVar});
    }

    private final boolean zzm(zzfsa zzfsaVar) {
        L5.c zzo = zzfsaVar.zzo();
        if (zzo == null) {
            return true;
        }
        Map map = this.zza;
        synchronized (map) {
            try {
                return !map.containsKey(zzl(zzfsaVar.zzn(), zzo));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean zzn() {
        Map map = this.zza;
        synchronized (map) {
            try {
                for (zzfsa zzfsaVar : map.values()) {
                    if (zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzo(long j) {
        if (this.zzb.compareAndSet(false, true)) {
            if (j > 0) {
                this.zze = this.zzf.schedule(new zzfqn(this), j, TimeUnit.MILLISECONDS);
            } else {
                this.zzf.execute(new zzfqm(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzp, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzk() {
        zzguf zzq;
        try {
            if (this.zzd.get()) {
                return;
            }
            zzfsa zzfsaVar = null;
            this.zze = null;
            if (zzf() < this.zzc || zzn()) {
                Map map = this.zza;
                synchronized (map) {
                    zzq = zzguf.zzq(map.values());
                }
                int size = zzq.size();
                double d = Double.MAX_VALUE;
                for (int i = 0; i < size; i++) {
                    zzfsa zzfsaVar2 = (zzfsa) zzq.get(i);
                    if (zzfsaVar2.zzq()) {
                        double zzp = zzfsaVar2.zzp() / zzfsaVar2.zze.d;
                        if (zzp < d) {
                            d = zzp;
                        }
                        if (zzp < d) {
                            zzfsaVar = zzfsaVar2;
                        }
                    }
                }
                if (zzfsaVar != null) {
                    zzfsaVar.zze();
                    if (zzfsaVar.zzp() > 0) {
                        this.zzg.zzq(this.zzh.a(), zzfsaVar.zzn(), zzfsaVar.zze.a, zzfsaVar.zzo(), zzfsaVar.zze.d, zzfsaVar.zzp(), zzf(), this.zzc);
                    }
                }
                int zzf = zzf();
                int i2 = this.zzc;
                if (zzf >= i2) {
                    zzr();
                }
                if (zzf() >= i2) {
                    if (zzn()) {
                    }
                }
                if (zzn()) {
                    this.zzf.execute(new zzfqp(this));
                    return;
                }
                this.zze = this.zzf.schedule(new zzfqo(this), ((Long) S5.D.c().zzd(zzbhe.zzV)).longValue(), TimeUnit.MILLISECONDS);
                return;
            }
            zzr();
            this.zzb.set(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg() {
        this.zzd.set(false);
        zzk();
    }

    private final void zzr() {
        int size;
        Map map = this.zza;
        synchronized (map) {
            size = map.size();
        }
        zzfrf zzfrfVar = this.zzg;
        E6.f fVar = this.zzh;
        zzfrfVar.zzs(fVar.a(), this.zzc, size);
    }

    private final void zzs(zzfsa zzfsaVar, int i) {
        this.zzg.zzr(this.zzh.a(), zzfsaVar.zzn(), zzfsaVar.zze.a, zzfsaVar.zzo(), zzfsaVar.zze.d, zzfsaVar.zzp(), i, zzf(), this.zzc);
    }

    private final synchronized boolean zzt(zzfsa zzfsaVar) {
        if (!this.zzd.get() && zzfsaVar.zzp() == 0 && zzfsaVar.zzq()) {
            zzfsaVar.zze();
            return true;
        }
        return false;
    }

    private static final int zzu(zzfsa zzfsaVar) {
        int zzp = zzfsaVar.zzp();
        int i = zzp - 1;
        if (!zzfsaVar.zzt()) {
            zzp = i;
        }
        return Math.max(zzp, 0);
    }

    public final void zza(zzfsa zzfsaVar) {
        int i = 1;
        if (zzfsaVar.zzp() <= 0 && !zzfsaVar.zzt()) {
            i = 0;
        }
        zzc(zzfsaVar, i);
    }

    public final synchronized void zzb(zzfsa zzfsaVar) {
        try {
            if (zzm(zzfsaVar)) {
                return;
            }
            long zzy = zzfsaVar.zzy();
            if (zzy <= 0) {
                zza(zzfsaVar);
                return;
            }
            if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
                zzs(zzfsaVar, 1);
            }
            this.zzd.set(true);
            ScheduledFuture scheduledFuture = this.zze;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.zze = null;
            this.zzb.set(true);
            this.zze = this.zzf.schedule(new zzfqq(this), zzy, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzc(zzfsa zzfsaVar, int i) {
        if (zzm(zzfsaVar)) {
            return;
        }
        if (i > 0) {
            zzs(zzfsaVar, i);
        }
        if (!zzt(zzfsaVar)) {
            zzo(0L);
        } else {
            zzo(((Long) S5.D.c().zzd(zzbhe.zzU)).longValue());
        }
    }

    public final void zzd(String str, L5.c cVar, zzfsa zzfsaVar) {
        Map map = this.zza;
        String zzl = zzl(str, cVar);
        synchronized (map) {
            try {
                if (!map.containsKey(zzl)) {
                    map.put(zzl, zzfsaVar);
                    zzt(zzfsaVar);
                    zzo(((Long) S5.D.c().zzd(zzbhe.zzU)).longValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze(String str, L5.c cVar) {
        zzfsa zzfsaVar;
        Map map = this.zza;
        String zzl = zzl(str, cVar);
        synchronized (map) {
            zzfsaVar = (zzfsa) map.remove(zzl);
        }
        if (zzfsaVar == null) {
            return;
        }
        int zzu = zzu(zzfsaVar);
        if (zzu > 0) {
            zzs(zzfsaVar, zzu);
        }
        if (zzfsaVar.zzp() > 0 || zzfsaVar.zzt()) {
            zzo(0L);
        }
    }

    public final int zzf() {
        int i;
        Map map = this.zza;
        synchronized (map) {
            try {
                Iterator it = map.values().iterator();
                i = 0;
                while (it.hasNext()) {
                    i += zzu((zzfsa) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
