package com.google.android.gms.internal.ads;

import V5.o0;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcss implements zzbde, zzdca, U5.E, zzdbz {
    private final zzcsn zza;
    private final zzcso zzb;
    private final zzbtl zzd;
    private final Executor zze;
    private final E6.f zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcsr zzh = new zzcsr();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcss(zzbti zzbtiVar, zzcso zzcsoVar, Executor executor, zzcsn zzcsnVar, E6.f fVar) {
        this.zza = zzcsnVar;
        zzbst zzbstVar = zzbsw.zza;
        this.zzd = zzbtiVar.zza("google.afma.activeView.handleUpdate", zzbstVar, zzbstVar);
        this.zzb = zzcsoVar;
        this.zze = executor;
        this.zzf = fVar;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcjl) it.next());
        }
        this.zza.zzd();
    }

    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    public final synchronized void zzc(Context context) {
        this.zzh.zze = "u";
        zzl();
        zzp();
        this.zzi = true;
    }

    public final void zzdS() {
    }

    public final void zzdT(int i) {
    }

    public final synchronized void zzdj(zzbdd zzbddVar) {
        zzcsr zzcsrVar = this.zzh;
        zzcsrVar.zza = zzbddVar.zzj;
        zzcsrVar.zzf = zzbddVar;
        zzl();
    }

    public final void zzdo() {
    }

    public final void zzdp() {
    }

    public final void zzdq() {
    }

    public final synchronized void zzdr() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    public final void zzdv() {
    }

    public final synchronized void zzdw() {
        this.zzh.zzb = true;
        zzl();
    }

    public final synchronized void zzdx() {
        this.zzh.zzb = false;
        zzl();
    }

    public final void zzdy() {
    }

    public final void zzdz() {
    }

    public final void zzh() {
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcsr zzcsrVar = this.zzh;
                zzcsrVar.zzd = this.zzf.b();
                JSONObject zzb = this.zzb.zzb(zzcsrVar);
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    this.zze.execute(new zzcsq(zzb, (zzcjl) it.next()));
                }
                zzcel.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                o0.l("Failed to call ActiveViewJS", e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcjl zzcjlVar) {
        this.zzc.add(zzcjlVar);
        this.zza.zzb(zzcjlVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }
}
