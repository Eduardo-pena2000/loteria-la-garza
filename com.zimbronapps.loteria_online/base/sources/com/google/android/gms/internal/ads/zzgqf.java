package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgqf {
    private final Context zzb;
    private final zzgqg zzc;
    private boolean zzf;
    private final Intent zzg;
    private ServiceConnection zzi;
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final zzgru zza = zzgry.zza(new zzgqe("OverlayDisplayService"));
    private final IBinder.DeathRecipient zzh = new zzgqa(this);

    public zzgqf(Context context, zzgqg zzgqgVar, String str, Intent intent, zzgpw zzgpwVar) {
        this.zzb = context;
        this.zzc = zzgqgVar;
        this.zzg = intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzo, reason: merged with bridge method [inline-methods] */
    public final void zzh(Runnable runnable) {
        ((Handler) this.zza.zza()).post(new zzgqd(this, runnable));
    }

    public final void zza(Runnable runnable) {
        zzh(new zzgqb(this, runnable));
    }

    public final void zzb() {
        zzh(new zzgqc(this));
    }

    public final IInterface zzc() {
        return this.zzj;
    }

    public final /* synthetic */ void zzd() {
        this.zzc.zza("%s : Binder has died.", this.zzd);
        List list = this.zze;
        synchronized (list) {
            list.clear();
        }
    }

    public final /* synthetic */ void zze(Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zza("Waiting to bind to the service.", new Object[0]);
            List list = this.zze;
            synchronized (list) {
                list.add(runnable);
            }
            return;
        }
        this.zzc.zza("Initiate binding to the service.", new Object[0]);
        List list2 = this.zze;
        synchronized (list2) {
            list2.add(runnable);
        }
        zzgpz zzgpzVar = new zzgpz(this, null);
        this.zzi = zzgpzVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzgpzVar, 1)) {
            return;
        }
        this.zzc.zza("Failed to bind to the service.", new Object[0]);
        this.zzf = false;
        List list3 = this.zze;
        synchronized (list3) {
            list3.clear();
        }
    }

    public final /* synthetic */ void zzf() {
        if (this.zzj != null) {
            this.zzc.zza("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            List list = this.zze;
            synchronized (list) {
                list.clear();
            }
        }
    }

    public final /* synthetic */ void zzg(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            this.zzc.zzc("error caused by ", e);
        }
    }

    public final /* synthetic */ zzgqg zzi() {
        return this.zzc;
    }

    public final /* synthetic */ List zzj() {
        return this.zze;
    }

    public final /* synthetic */ void zzk(boolean z) {
        this.zzf = false;
    }

    public final /* synthetic */ IBinder.DeathRecipient zzl() {
        return this.zzh;
    }

    public final /* synthetic */ IInterface zzm() {
        return this.zzj;
    }

    public final /* synthetic */ void zzn(IInterface iInterface) {
        this.zzj = iInterface;
    }
}
