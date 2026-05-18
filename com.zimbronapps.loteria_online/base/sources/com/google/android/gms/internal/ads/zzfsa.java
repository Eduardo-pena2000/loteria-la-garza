package com.google.android.gms.internal.ads;

import S5.W1;
import S5.c1;
import S5.d1;
import S5.g0;
import S5.i0;
import S5.l2;
import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class zzfsa {
    protected final ClientApi zza;
    protected final Context zzb;
    protected final int zzc;
    protected final zzfkg zzd;
    protected W1 zze;
    protected final zzfqr zzf;
    protected AtomicBoolean zzg;
    protected i0 zzh;
    private g0 zzi;
    private final Queue zzj;
    private final zzfra zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfmy zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfrf zzr;
    private final E6.f zzs;
    private final zzfrm zzt;

    public zzfsa(ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, g0 g0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar) {
        this("none", clientApi, context, i, zzfkgVar, w1, scheduledExecutorService, zzfmyVar, zzfraVar, fVar, null);
        this.zzi = g0Var;
    }

    public static final /* synthetic */ String zzL(d1 d1Var) {
        return zzX(d1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(Object obj) {
        try {
            this.zzm.set(false);
            if (obj != null) {
                this.zzk.zza();
                this.zzq.set(true);
                zzP(obj);
            }
            if (obj == null || this.zzf == null) {
                zzQ(obj == null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzN, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(Throwable th) {
        try {
            this.zzm.set(false);
            if ((th instanceof zzfqs) && ((zzfqs) th).zza() == 0) {
                throw null;
            }
            zzQ(true);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(c1 c1Var) {
        try {
            if (this.zzp.get()) {
                F0.l.post(new zzfrt(this, c1Var));
            }
            this.zzm.set(false);
            int i = c1Var.a;
            if (i != 1 && i != 8 && i != 10 && i != 11) {
                zzQ(true);
                return;
            }
            W1 w1 = this.zze;
            int i2 = w1.b;
            String str = w1.a;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26 + String.valueOf(str).length() + 61);
            sb.append("Preloading ");
            sb.append(i2);
            sb.append(", for adUnitId:");
            sb.append(str);
            sb.append(", Ad load failed. Stop preloading due to non-retriable error:");
            String sb2 = sb.toString();
            int i3 = o0.b;
            W5.p.e(sb2);
            this.zzg.set(false);
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zza(this);
            }
            zzfrl zzfrlVar = new zzfrl(this.zze.a, zzo());
            zzfrlVar.zza(this.zzl);
            this.zzr.zzk(this.zzs.a(), new zzfrm(zzfrlVar, null), c1Var, this.zze.d, zzp(), zzH());
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzP(Object obj) {
        try {
            d1 zzc = zzc(obj);
            double zzl = !(zzc instanceof zzday) ? 0.0d : ((zzday) zzc).zzl();
            d1 zzc2 = zzc(obj);
            int zzm = zzc2 instanceof zzday ? ((zzday) zzc2).zzm() : 2;
            E6.f fVar = this.zzs;
            zzfro zzfroVar = new zzfro(obj, fVar, zzl, zzm);
            this.zzj.add(zzfroVar);
            d1 zzc3 = zzc(obj);
            long a = fVar.a();
            if (this.zzp.get()) {
                F0.l.post(new zzfrr(this, zzc3));
            }
            ScheduledExecutorService scheduledExecutorService = this.zzn;
            scheduledExecutorService.execute(new zzfrs(this, a, zzc3));
            if (this.zzf != null) {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzE)).booleanValue()) {
                    this.zzo.zzb(new zzfry(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                } else {
                    scheduledExecutorService.schedule(new zzfrx(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                    return;
                }
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzE)).booleanValue()) {
                this.zzo.zzb(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            } else {
                scheduledExecutorService.schedule(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzQ(boolean z) {
        try {
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                if (z) {
                    this.zzk.zzc();
                }
                zzfqrVar.zza(this);
            } else {
                zzfra zzfraVar = this.zzk;
                if (zzfraVar.zze()) {
                    return;
                }
                if (z) {
                    zzfraVar.zzc();
                }
                this.zzn.schedule(new zzfrq(this), zzfraVar.zzb(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzz() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfro) it.next()).zzb()) {
                it.remove();
                zzfqr zzfqrVar = this.zzf;
                if (zzfqrVar != null) {
                    zzfqrVar.zza(this);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE(c1 c1Var) {
        i0 i0Var = this.zzh;
        if (i0Var != null) {
            try {
                i0Var.n1(this.zzl, c1Var);
            } catch (RemoteException unused) {
                int i = o0.b;
                W5.p.f("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028 A[DONT_GENERATE] */
    /* renamed from: zzT, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzF(S5.d1 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            S5.g0 r0 = r2.zzi     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            S5.W1 r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.W0(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r3 = move-exception
            goto L2a
        Ld:
            int r0 = V5.o0.b     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsAvailable"
            W5.p.f(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            S5.i0 r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzl     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.E(r1, r3)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r3 = V5.o0.b     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Failed to call onAdPreloaded"
            W5.p.f(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsa.zzF(S5.d1):void");
    }

    private final synchronized void zzU() {
        try {
            if (this.zzq.get() && this.zzj.isEmpty()) {
                this.zzq.set(false);
                if (this.zzp.get()) {
                    F0.l.post(new zzfru(this));
                }
                this.zzn.execute(new zzfrv(this));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028 A[DONT_GENERATE] */
    /* renamed from: zzV, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzG() {
        /*
            r2 = this;
            monitor-enter(r2)
            S5.g0 r0 = r2.zzi     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L14
            S5.W1 r1 = r2.zze     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            r0.o1(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> Ld
            goto L14
        Lb:
            r0 = move-exception
            goto L2a
        Ld:
            int r0 = V5.o0.b     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            W5.p.f(r0)     // Catch: java.lang.Throwable -> Lb
        L14:
            S5.i0 r0 = r2.zzh     // Catch: java.lang.Throwable -> Lb
            if (r0 == 0) goto L28
            java.lang.String r1 = r2.zzl     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            r0.zzf(r1)     // Catch: java.lang.Throwable -> Lb android.os.RemoteException -> L1f
            monitor-exit(r2)
            return
        L1f:
            int r0 = V5.o0.b     // Catch: java.lang.Throwable -> Lb
            java.lang.String r0 = "Failed to call onAdsExhausted"
            W5.p.f(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)
            return
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfsa.zzG():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != "none".equals(this.zzl) ? "2" : "1";
    }

    private static final String zzX(d1 d1Var) {
        if (d1Var instanceof zzday) {
            return ((zzday) d1Var).zzk();
        }
        return null;
    }

    public final /* synthetic */ zzfrf zzI() {
        return this.zzr;
    }

    public final /* synthetic */ E6.f zzJ() {
        return this.zzs;
    }

    public final /* synthetic */ zzfrm zzK() {
        return this.zzt;
    }

    public abstract x7.e zza(Context context);

    public long zzb() {
        throw null;
    }

    public abstract d1 zzc(Object obj);

    public final synchronized zzfsa zzd() {
        this.zzn.submit(new zzfrq(this));
        return this;
    }

    public final synchronized void zze() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.d) {
            this.zzm.set(true);
            this.zzn.submit(new zzfrz(this));
        }
    }

    public final synchronized boolean zzf() {
        try {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzK)).booleanValue()) {
                this.zzk.zza();
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzD)).booleanValue() && this.zzf == null) {
                zzu();
            } else {
                zzz();
            }
        } catch (Throwable th) {
            throw th;
        }
        return !this.zzj.isEmpty();
    }

    public final synchronized Object zzg() {
        try {
            boolean z = true;
            if (((Boolean) S5.D.c().zzd(zzbhe.zzN)).booleanValue()) {
                if (!((Boolean) S5.D.c().zzd(zzbhe.zzL)).booleanValue()) {
                    this.zzk.zza();
                } else if (this.zzj.size() == 1) {
                    this.zzk.zza();
                }
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzM)).booleanValue()) {
                zzz();
            }
            Queue queue = this.zzj;
            zzfro zzfroVar = (zzfro) queue.poll();
            AtomicBoolean atomicBoolean = this.zzq;
            if (zzfroVar == null) {
                z = false;
            }
            atomicBoolean.set(z);
            if (zzfroVar == null) {
                zzfroVar = null;
            } else if (!queue.isEmpty()) {
                zzfro zzfroVar2 = (zzfro) queue.peek();
                L5.c a = L5.c.a(this.zze.b);
                String zzX = zzX(zzc(zzfroVar.zza()));
                if (zzfroVar2 != null && a != null && zzX != null && zzfroVar2.zzd() < zzfroVar.zzd()) {
                    this.zzr.zzg(this.zzs.a(), this.zze.d, zzp(), zzX, this.zzt, zzH());
                }
            }
            zzfqr zzfqrVar = this.zzf;
            if (zzfqrVar != null) {
                zzfqrVar.zzb(this);
            } else {
                long zzy = zzy();
                if (zzy > 0) {
                    this.zzn.schedule(new zzfrq(this), zzy, TimeUnit.MILLISECONDS);
                } else {
                    zzu();
                }
            }
            if (zzfroVar == null) {
                return null;
            }
            return zzfroVar.zza();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    public final synchronized void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfrq(this));
        }
    }

    public final synchronized String zzk() {
        Object zzs;
        zzs = zzs();
        return zzX(zzs == null ? null : zzc(zzs));
    }

    public final void zzl(zzfrf zzfrfVar) {
        this.zzr = zzfrfVar;
    }

    public final synchronized void zzm(int i) {
        com.google.android.gms.common.internal.t.a(i >= 5);
        this.zzk.zzf(i);
    }

    public final String zzn() {
        return this.zzl;
    }

    public final L5.c zzo() {
        return L5.c.a(this.zze.b);
    }

    public final synchronized int zzp() {
        return this.zzj.size();
    }

    public final boolean zzq() {
        return this.zzg.get() && !this.zzm.get() && zzp() < this.zze.d && !this.zzk.zzd();
    }

    public final synchronized void zzr() {
        this.zzj.clear();
    }

    public final synchronized Object zzs() {
        zzfro zzfroVar = (zzfro) this.zzj.peek();
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    public final boolean zzt() {
        return this.zzm.get();
    }

    public final synchronized void zzu() {
        zzz();
        zzU();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.d) {
            this.zzm.set(true);
            zzv();
        }
    }

    public final synchronized void zzv() {
        x7.e zza;
        try {
            Activity zzd = R5.t.k().zzd();
            if (zzd == null) {
                String valueOf = String.valueOf(this.zze.a);
                int i = o0.b;
                W5.p.f("Empty activity context at preloading: ".concat(valueOf));
                zza = zza(this.zzb);
            } else {
                zza = zza(zzd);
            }
            zzgzo.zzr(zza, new zzfrp(this), this.zzn);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzw(int i) {
        zzfqr zzfqrVar;
        com.google.android.gms.common.internal.t.a(i > 0);
        L5.c a = L5.c.a(this.zze.b);
        int i2 = this.zze.d;
        int size = this.zzj.size();
        synchronized (this) {
            try {
                W1 w1 = this.zze;
                this.zze = new W1(w1.a, w1.b, w1.c, i > 0 ? i : w1.d);
                Queue queue = this.zzj;
                if (queue.size() > i) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzx)).booleanValue()) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < i; i3++) {
                            zzfro zzfroVar = (zzfro) queue.poll();
                            if (zzfroVar != null) {
                                arrayList.add(zzfroVar);
                            }
                        }
                        queue.clear();
                        queue.addAll(arrayList);
                        if (size > arrayList.size() && (zzfqrVar = this.zzf) != null) {
                            int size2 = size - arrayList.size();
                            if (arrayList.isEmpty()) {
                                size2--;
                            }
                            zzfqrVar.zzc(this, size2);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzfrf zzfrfVar = this.zzr;
        if (zzfrfVar == null || a == null) {
            return;
        }
        zzfrfVar.zzc(i2, i, this.zzs.a(), new zzfrm(new zzfrl(this.zze.a, a), null));
    }

    public final void zzx(l2 l2Var) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzC)).booleanValue()) {
            Bundle bundle = l2Var.B;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.d);
            bundle.putString("plid", this.zzl);
        }
    }

    public final long zzy() {
        long zzb = zzb();
        if (zzb >= 0) {
            return zzb;
        }
        return ((Long) S5.D.c().zzd(zzbhe.zzP)).longValue();
    }

    public zzfsa(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, i0 i0Var, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar, zzfqr zzfqrVar) {
        this(str, clientApi, context, i, zzfkgVar, w1, scheduledExecutorService, zzfmyVar, zzfraVar, fVar, zzfqrVar);
        this.zzh = i0Var;
    }

    private zzfsa(String str, ClientApi clientApi, Context context, int i, zzfkg zzfkgVar, W1 w1, ScheduledExecutorService scheduledExecutorService, zzfmy zzfmyVar, zzfra zzfraVar, E6.f fVar, zzfqr zzfqrVar) {
        zzfsd priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i;
        this.zzd = zzfkgVar;
        this.zze = w1;
        int max = Math.max(1, w1.d);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzX)).booleanValue()) {
            priorityQueue = new zzfsd();
        } else {
            priorityQueue = new PriorityQueue(max, zzfrw.zza);
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzfmyVar;
        this.zzk = zzfraVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = fVar;
        zzfrl zzfrlVar = new zzfrl(w1.a, L5.c.a(this.zze.b));
        zzfrlVar.zza(str);
        this.zzt = new zzfrm(zzfrlVar, null);
        this.zzf = zzfqrVar;
    }
}
