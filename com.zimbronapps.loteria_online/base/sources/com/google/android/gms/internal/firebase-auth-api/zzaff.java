package com.google.android.gms.internal.firebase-auth-api;

import B7.g;
import J7.A;
import J7.h;
import K7.w;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.internal.t;
import com.google.firebase.auth.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
abstract class zzaff implements zzafq {
    protected final int zza;
    protected g zzc;
    protected A zzd;
    protected Object zze;
    protected w zzf;
    protected zzafg zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected h zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List zzh = new ArrayList();

    public static class zza extends j {
        private final List zza;

        private zza(k kVar, List list) {
            super(kVar);
            ((j) this).mLifecycleFragment.j("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List list) {
            k fragment = j.getFragment(activity);
            if (((zza) fragment.n("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i) {
        this.zza = i;
    }

    public final zzaff zza(Object obj) {
        this.zze = t.m(obj, "external callback cannot be null");
        return this;
    }

    public abstract void zzb();

    public final void zzb(Object obj) {
        this.zzu = true;
        this.zzg.zza(obj, null);
    }

    public final zzaff zza(w wVar) {
        this.zzf = (w) t.m(wVar, "external failure callback cannot be null");
        return this;
    }

    public final zzaff zza(g gVar) {
        this.zzc = (g) t.m(gVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzaff zza(A a) {
        this.zzd = (A) t.m(a, "firebaseUser cannot be null");
        return this;
    }

    public final zzaff zza(b.b bVar, Activity activity, Executor executor, String str) {
        b.b zza2 = zzagb.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((b.b) t.l(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) t.l(executor);
        return this;
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        t.p(zzaffVar.zzu, "no success or failure set on method implementation");
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        w wVar = zzaffVar.zzf;
        if (wVar != null) {
            wVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}
