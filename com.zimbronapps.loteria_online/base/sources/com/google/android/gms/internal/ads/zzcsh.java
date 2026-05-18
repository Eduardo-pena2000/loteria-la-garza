package com.google.android.gms.internal.ads;

import S5.c1;
import V5.F0;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcsh implements zzdbf, zzdct, zzdbz, S5.a, zzdbv, zzdjd, zzdea {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfjc zze;
    private final zzfir zzf;
    private final zzfqg zzg;
    private final zzfjx zzh;
    private final zzazh zzi;
    private final zzbil zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;
    private final zzdag zzm;
    private final zzddu zzn;
    private final zzczz zzo;
    private final Set zzp;
    private boolean zzq;
    private final AtomicBoolean zzr = new AtomicBoolean();
    private zzcdv zzs = null;

    public zzcsh(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfjc zzfjcVar, zzfir zzfirVar, zzfqg zzfqgVar, zzfjx zzfjxVar, View view, zzcjl zzcjlVar, zzazh zzazhVar, zzbil zzbilVar, zzbin zzbinVar, zzfoo zzfooVar, zzdag zzdagVar, zzddu zzdduVar, zzczz zzczzVar, Set set) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfjcVar;
        this.zzf = zzfirVar;
        this.zzg = zzfqgVar;
        this.zzh = zzfjxVar;
        this.zzi = zzazhVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcjlVar);
        this.zzj = zzbilVar;
        this.zzm = zzdagVar;
        this.zzn = zzdduVar;
        this.zzo = zzczzVar;
        this.zzp = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzA, reason: merged with bridge method [inline-methods] */
    public final List zzp() {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzmQ)).booleanValue()) {
            R5.t.g();
            Context context = this.zza;
            if (F0.g(context)) {
                R5.t.g();
                Integer j0 = F0.j0(context);
                if (j0 != null) {
                    int min = Math.min(j0.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(min)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    private final void zzy(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzo();
        } else {
            this.zzd.schedule(new zzcsd(this, i, i2), i2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public final void zzo() {
        String str;
        int i;
        zzfir zzfirVar = this.zzf;
        List list = zzfirVar.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpj)).booleanValue() && this.zzs == null) {
            this.zzs = R5.t.l().zzr().zzn(this.zzp, this.zze.zza.zza.zzg);
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzes)).booleanValue()) {
            str = this.zzi.zzb().zzj(this.zza, (View) this.zzk.get(), null);
        } else {
            str = null;
        }
        if ((((Boolean) S5.D.c().zzd(zzbhe.zzaZ)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbjd.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzb(this.zze, zzfirVar, false, str, null, zzp(), this.zzo, this.zzs), this.zzn);
            return;
        }
        if (((Boolean) zzbjd.zzg.zze()).booleanValue() && ((i = zzfirVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgzo.zzr((zzgzg) zzgzo.zzi(zzgzg.zzw(zzgzo.zza(null)), ((Long) S5.D.c().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcsb(this, str), this.zzb);
    }

    public final void onAdClicked() {
        if (!(((Boolean) S5.D.c().zzd(zzbhe.zzaZ)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbjd.zzd.zze()).booleanValue()) {
            zzgzo.zzr((zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzj.zzb()), Throwable.class, zzcsg.zza, zzcei.zzg), new zzcsa(this), this.zzb);
            return;
        }
        zzfjx zzfjxVar = this.zzh;
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zzb(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzc), true == R5.t.l().zzs(this.zza) ? 2 : 1);
    }

    public final void zzd(zzcag zzcagVar, String str, String str2) {
        zzfqg zzfqgVar = this.zzg;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zzc(zzfirVar, zzfirVar.zzh, zzcagVar), null);
    }

    public final void zzdJ() {
    }

    public final void zzdr() {
        if (this.zzr.compareAndSet(false, true)) {
            int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzeB)).intValue();
            if (intValue > 0) {
                zzy(intValue, ((Integer) S5.D.c().zzd(zzbhe.zzeC)).intValue());
                return;
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzeA)).booleanValue()) {
                this.zzc.execute(new zzcsc(this));
            } else {
                zzo();
            }
        }
    }

    public final void zzds() {
    }

    public final void zzdt() {
    }

    public final void zze() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzg), null);
    }

    public final void zzf() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzi), null);
    }

    public final synchronized void zzg() {
        zzdag zzdagVar;
        try {
            if (this.zzq) {
                List arrayList = new ArrayList(zzp());
                zzfir zzfirVar = this.zzf;
                arrayList.addAll(zzfirVar.zzf);
                this.zzh.zza(this.zzg.zzb(this.zze, zzfirVar, true, null, null, arrayList, null, null), null);
            } else {
                zzfjx zzfjxVar = this.zzh;
                zzfqg zzfqgVar = this.zzg;
                zzfjc zzfjcVar = this.zze;
                zzfir zzfirVar2 = this.zzf;
                zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar2, zzfirVar2.zzm), null);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzex)).booleanValue() && (zzdagVar = this.zzm) != null) {
                    List list = zzdagVar.zzb().zzm;
                    String zzg = zzdagVar.zzc().zzg();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(zzfqg.zzd((String) it.next(), "@gw_adnetstatus@", zzg));
                    }
                    long zzh = zzdagVar.zzc().zzh();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(zzfqg.zzd((String) it2.next(), "@gw_ttr@", Long.toString(zzh, 10)));
                    }
                    zzfjxVar.zza(zzfqgVar.zza(zzdagVar.zza(), zzdagVar.zzb(), arrayList3), null);
                }
                zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar2, zzfirVar2.zzf), null);
            }
            this.zzq = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zzi() {
        zzfqg zzfqgVar = this.zzg;
        zzfjc zzfjcVar = this.zze;
        zzfjx zzfjxVar = this.zzh;
        zzfir zzfirVar = this.zzf;
        zzfjxVar.zza(zzfqgVar.zza(zzfjcVar, zzfirVar, zzfirVar.zzau), null);
    }

    public final void zzj(c1 c1Var) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcb)).booleanValue()) {
            int i = c1Var.a;
            zzfir zzfirVar = this.zzf;
            List arrayList = new ArrayList();
            for (String str : zzfirVar.zzo) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2);
                sb.append("2.");
                sb.append(i);
                arrayList.add(zzfqg.zzd(str, "@gw_mpe@", sb.toString()));
            }
            this.zzh.zza(this.zzg.zza(this.zze, zzfirVar, arrayList), null);
        }
    }

    public final void zzk() {
        zzfir zzfirVar = this.zzf;
        if (zzfirVar.zze == 4) {
            this.zzh.zza(this.zzg.zza(this.zze, zzfirVar, zzfirVar.zzaA), null);
        }
    }

    public final /* synthetic */ void zzl() {
        this.zzb.execute(new zzcsf(this));
    }

    public final /* synthetic */ void zzm(int i, int i2) {
        this.zzb.execute(new zzcse(this, i, i2));
    }

    public final /* synthetic */ void zzn(int i, int i2) {
        zzy(i - 1, i2);
    }

    public final /* synthetic */ Context zzq() {
        return this.zza;
    }

    public final /* synthetic */ zzfjc zzr() {
        return this.zze;
    }

    public final /* synthetic */ zzfir zzs() {
        return this.zzf;
    }

    public final /* synthetic */ zzfqg zzt() {
        return this.zzg;
    }

    public final /* synthetic */ zzfjx zzu() {
        return this.zzh;
    }

    public final /* synthetic */ zzddu zzv() {
        return this.zzn;
    }

    public final /* synthetic */ zzczz zzw() {
        return this.zzo;
    }

    public final /* synthetic */ zzcdv zzx() {
        return this.zzs;
    }
}
