package com.google.android.gms.internal.ads;

import S5.V0;
import S5.c1;
import S5.p0;
import S5.s2;
import S5.w0;
import V5.o0;
import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzerp implements M5.e, zzdel, zzdct, zzdbi, zzdbz, S5.a, zzdbf, zzddw, zzdbv, zzdjm {
    final zzdxz zza;
    private final AtomicReference zzc = new AtomicReference();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    private final AtomicReference zzf = new AtomicReference();
    private final AtomicReference zzg = new AtomicReference();
    private final AtomicBoolean zzh = new AtomicBoolean(true);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    private final AtomicBoolean zzj = new AtomicBoolean(false);
    final BlockingQueue zzb = new ArrayBlockingQueue(((Integer) S5.D.c().zzd(zzbhe.zzkn)).intValue());

    public zzerp(zzdxz zzdxzVar) {
        this.zza = zzdxzVar;
    }

    private final void zzr() {
        if (this.zzi.get() && this.zzj.get()) {
            BlockingQueue blockingQueue = this.zzb;
            Iterator it = blockingQueue.iterator();
            while (it.hasNext()) {
                zzffy.zza(this.zzd, new zzera((Pair) it.next()));
            }
            blockingQueue.clear();
            this.zzh.set(false);
        }
    }

    public final void onAdClicked() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
            return;
        }
        zzffy.zza(this.zzc, zzerf.zza);
    }

    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.zzh.get()) {
            zzffy.zza(this.zzd, new zzeqy(str, str2));
            return;
        }
        if (!this.zzb.offer(new Pair(str, str2))) {
            int i = o0.b;
            W5.p.a("The queue for app events is full, dropping the new event.");
            zzdxz zzdxzVar = this.zza;
            if (zzdxzVar != null) {
                zzdxy zza = zzdxzVar.zza();
                zza.zzc("action", "dae_action");
                zza.zzc("dae_name", str);
                zza.zzc("dae_data", str2);
                zza.zzd();
            }
        }
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
    }

    public final void zzdI(c1 c1Var) {
        zzerb zzerbVar = new zzerb(c1Var);
        AtomicReference atomicReference = this.zzc;
        zzffy.zza(atomicReference, zzerbVar);
        zzffy.zza(atomicReference, new zzeqv(c1Var));
        zzffy.zza(this.zzf, new zzeqw(c1Var));
        this.zzh.set(false);
        this.zzb.clear();
    }

    public final void zzdJ() {
        zzffy.zza(this.zzc, zzerc.zza);
    }

    public final void zzdO(zzbzu zzbzuVar) {
    }

    public final void zzdP(zzfjc zzfjcVar) {
        this.zzh.set(true);
        this.zzj.set(false);
    }

    public final void zzdQ() {
        zzffy.zza(this.zzc, zzerg.zza);
    }

    public final void zzdr() {
        zzffy.zza(this.zzc, zzeri.zza);
    }

    public final void zzds() {
        zzffy.zza(this.zzc, zzerj.zza);
        zzffy.zza(this.zzg, zzero.zza);
    }

    public final void zzdt() {
        zzffy.zza(this.zzc, zzere.zza);
        AtomicReference atomicReference = this.zzg;
        zzffy.zza(atomicReference, zzerl.zza);
        zzffy.zza(atomicReference, zzerm.zza);
    }

    public final void zzdu() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmj)).booleanValue()) {
            zzffy.zza(this.zzc, zzerh.zza);
        }
        zzffy.zza(this.zzg, zzern.zza);
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final synchronized void zzg() {
        zzffy.zza(this.zzc, zzerd.zza);
        zzffy.zza(this.zzf, zzerk.zza);
        this.zzj.set(true);
        zzr();
    }

    public final synchronized S5.K zzi() {
        return (S5.K) this.zzc.get();
    }

    public final void zzj(c1 c1Var) {
        zzffy.zza(this.zzg, new zzeqz(c1Var));
    }

    public final synchronized p0 zzk() {
        return (p0) this.zzd.get();
    }

    public final void zzl(S5.K k) {
        this.zzc.set(k);
    }

    public final void zzm(s2 s2Var) {
        zzffy.zza(this.zze, new zzeqx(s2Var));
    }

    public final void zzn(p0 p0Var) {
        this.zzd.set(p0Var);
        this.zzi.set(true);
        zzr();
    }

    public final void zzo(V0 v0) {
        this.zze.set(v0);
    }

    public final void zzp(S5.N n) {
        this.zzf.set(n);
    }

    public final void zzq(w0 w0Var) {
        this.zzg.set(w0Var);
    }
}
