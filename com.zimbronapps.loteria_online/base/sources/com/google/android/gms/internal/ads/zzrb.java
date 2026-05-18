package com.google.android.gms.internal.ads;

import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzrb {
    private final Handler zza;
    private final zzrc zzb;

    public zzrb(Handler handler, zzrc zzrcVar) {
        this.zza = zzrcVar == null ? null : handler;
        this.zzb = zzrcVar;
    }

    public final /* synthetic */ void zzA(int i) {
        String str = zzfj.zza;
        this.zzb.zzx(i);
    }

    public final /* synthetic */ void zzB(zzil zzilVar) {
        String str = zzfj.zza;
        this.zzb.zzy(zzilVar);
    }

    public final void zza(zzin zzinVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzra(this, zzinVar));
        }
    }

    public final void zzb(String str, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqn(this, str, j, j2));
        }
    }

    public final void zzc(zzv zzvVar, zzio zzioVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqr(this, zzvVar, zzioVar));
        }
    }

    public final void zzd(long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqs(this, j));
        }
    }

    public final void zze(int i, long j, long j2) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqt(this, i, j, j2));
        }
    }

    public final void zzf(String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqu(this, str));
        }
    }

    public final void zzg(zzin zzinVar) {
        zzinVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqv(this, zzinVar));
        }
    }

    public final void zzh(boolean z) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqw(this, z));
        }
    }

    public final void zzi(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqx(this, exc));
        }
    }

    public final void zzj(Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqy(this, exc));
        }
    }

    public final void zzk(zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqz(this, zzrdVar));
        }
    }

    public final void zzl(zzrd zzrdVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqo(this, zzrdVar));
        }
    }

    public final void zzm(int i) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqp(this, i));
        }
    }

    public final void zzn(zzil zzilVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new zzqq(this, zzilVar));
        }
    }

    public final /* synthetic */ void zzo(zzin zzinVar) {
        String str = zzfj.zza;
        this.zzb.zzl(zzinVar);
    }

    public final /* synthetic */ void zzp(String str, long j, long j2) {
        String str2 = zzfj.zza;
        this.zzb.zzm(str, j, j2);
    }

    public final /* synthetic */ void zzq(zzv zzvVar, zzio zzioVar) {
        String str = zzfj.zza;
        this.zzb.zzn(zzvVar, zzioVar);
    }

    public final /* synthetic */ void zzr(long j) {
        String str = zzfj.zza;
        this.zzb.zzo(j);
    }

    public final /* synthetic */ void zzs(int i, long j, long j2) {
        String str = zzfj.zza;
        this.zzb.zzp(i, j, j2);
    }

    public final /* synthetic */ void zzt(String str) {
        String str2 = zzfj.zza;
        this.zzb.zzq(str);
    }

    public final /* synthetic */ void zzu(zzin zzinVar) {
        zzinVar.zza();
        String str = zzfj.zza;
        this.zzb.zzr(zzinVar);
    }

    public final /* synthetic */ void zzv(boolean z) {
        String str = zzfj.zza;
        this.zzb.zzs(z);
    }

    public final /* synthetic */ void zzw(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzt(exc);
    }

    public final /* synthetic */ void zzx(Exception exc) {
        String str = zzfj.zza;
        this.zzb.zzu(exc);
    }

    public final /* synthetic */ void zzy(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzv(zzrdVar);
    }

    public final /* synthetic */ void zzz(zzrd zzrdVar) {
        String str = zzfj.zza;
        this.zzb.zzw(zzrdVar);
    }
}
