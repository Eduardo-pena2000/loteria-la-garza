package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.j;
import com.google.android.gms.common.api.internal.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzv extends j {
    private final List zza;

    private zzv(k kVar) {
        super(kVar);
        this.zza = new ArrayList();
        ((j) this).mLifecycleFragment.j("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzvVar;
        k fragment = j.getFragment(activity);
        synchronized (fragment) {
            try {
                zzvVar = (zzv) fragment.n("TaskOnStopCallback", zzv.class);
                if (zzvVar == null) {
                    zzvVar = new zzv(fragment);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzvVar;
    }

    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzq zzqVar = (zzq) ((WeakReference) it.next()).get();
                    if (zzqVar != null) {
                        zzqVar.zzb();
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(zzq zzqVar) {
        List list = this.zza;
        synchronized (list) {
            list.add(new WeakReference(zzqVar));
        }
    }
}
