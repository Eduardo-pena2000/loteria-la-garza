package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzadl {
    private final Handler zza;
    private final zzadm zzb;

    public zzadl(Handler handler, zzadm zzadmVar) {
        if (zzadmVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.zza = handler;
        this.zzb = zzadmVar;
    }

    public final void zza(zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadk(this, zzinVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadb(this, str, j, j2));
        }
    }

    public final void zzc(zzv zzvVar, zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadc(this, zzvVar, zzioVar));
        }
    }

    public final void zzd(int i, long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadd(this, i, j));
        }
    }

    public final void zze(long j, int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzade(this, j, i));
        }
    }

    public final void zzf(zzbv zzbvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadf(this, zzbvVar));
        }
    }

    public final void zzg(Object obj) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadg(this, obj, SystemClock.elapsedRealtime()));
        }
    }

    public final void zzh(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadh(this, str));
        }
    }

    public final void zzi(zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadi(this, zzinVar));
        }
    }

    public final void zzj(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzadj(this, exc));
        }
    }

    public final /* synthetic */ void zzk(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzb(zzinVar);
    }

    public final /* synthetic */ void zzl(String str, long j, long j2) {
        String str2 = zzfj.zza;
        this.zzb.zzc(str, j, j2);
    }

    public final /* synthetic */ void zzm(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzd(zzvVar, zzioVar);
    }

    public final /* synthetic */ void zzn(int i, long j) {
        String str = zzfj.zza;
        this.zzb.zze(i, j);
    }

    public final /* synthetic */ void zzo(long j, int i) {
        String str = zzfj.zza;
        this.zzb.zzj(j, i);
    }

    public final /* synthetic */ void zzp(zzbv zzbvVar) {
        String str = zzfj.zza;
        this.zzb.zzf(zzbvVar);
    }

    public final /* synthetic */ void zzq(Object obj, long j) {
        String str = zzfj.zza;
        this.zzb.zzg(obj, j);
    }

    public final /* synthetic */ void zzr(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzh(str);
    }

    public final /* synthetic */ void zzs(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzi(zzinVar);
    }

    public final /* synthetic */ void zzt(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzk(exc);
    }
}
