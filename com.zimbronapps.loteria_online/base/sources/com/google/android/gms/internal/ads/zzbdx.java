package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbdx implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private final AtomicBoolean zzd = new AtomicBoolean(true);
    private boolean zze = false;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            try {
                if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                    this.zza = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            try {
                Activity activity2 = this.zza;
                if (activity2 == null) {
                    return;
                }
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        ((zzdvh) it.next()).zzg(activity);
                    } catch (Exception e) {
                        R5.t.l().zzg(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        int i = o0.b;
                        W5.p.d("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdvh) it.next()).zzf(activity);
                } catch (Exception e) {
                    R5.t.l().zzg(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    int i = o0.b;
                    W5.p.d("", e);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            F0.l.removeCallbacks(runnable);
        }
        zzfyn zzfynVar = F0.l;
        zzbdw zzbdwVar = new zzbdw(this);
        this.zzh = zzbdwVar;
        zzfynVar.postDelayed(zzbdwVar, this.zzj);
    }

    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean andSet = this.zzd.getAndSet(true);
        Runnable runnable = this.zzh;
        if (runnable != null) {
            F0.l.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            Iterator it = this.zzg.iterator();
            while (it.hasNext()) {
                try {
                    ((zzdvh) it.next()).zze(activity);
                } catch (Exception e) {
                    R5.t.l().zzg(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    int i = o0.b;
                    W5.p.d("", e);
                }
            }
            if (andSet) {
                int i2 = o0.b;
                W5.p.a("App is still foreground.");
            } else {
                Iterator it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    try {
                        ((zzbdy) it2.next()).zza(true);
                    } catch (Exception e2) {
                        int i3 = o0.b;
                        W5.p.d("", e2);
                    }
                }
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void zza(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) S5.D.c().zzd(zzbhe.zzbA)).longValue();
        this.zzi = true;
    }

    public final void zzb(zzbdy zzbdyVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbdyVar);
        }
    }

    public final void zzc(zzbdy zzbdyVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbdyVar);
        }
    }

    public final Activity zzd() {
        return this.zza;
    }

    public final Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzc;
    }

    public final /* synthetic */ AtomicBoolean zzg() {
        return this.zzd;
    }

    public final /* synthetic */ boolean zzh() {
        return this.zze;
    }

    public final /* synthetic */ List zzi() {
        return this.zzf;
    }

    public final void zzj(zzdvh zzdvhVar) {
        synchronized (this.zzc) {
            this.zzg.add(zzdvhVar);
        }
    }
}
