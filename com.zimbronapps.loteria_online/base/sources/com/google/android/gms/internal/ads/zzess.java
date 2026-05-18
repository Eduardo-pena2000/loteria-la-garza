package com.google.android.gms.internal.ads;

import S5.q2;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzess implements zzfav {
    public final Context zza;
    public final q2 zzb;
    public final List zzc;

    public zzess(Context context, q2 q2Var, List list) {
        this.zza = context;
        this.zzb = q2Var;
        this.zzc = list;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzdah zzdahVar = (zzdah) obj;
        if (((Boolean) zzbjh.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            R5.t.g();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = (ActivityManager.RunningTaskInfo) runningTasks.get(0)) != null && v.a(runningTaskInfo) != null) {
                    str = v.a(runningTaskInfo).getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", str);
            Bundle bundle2 = new Bundle();
            q2 q2Var = this.zzb;
            bundle2.putInt("width", q2Var.e);
            bundle2.putInt("height", q2Var.b);
            bundle.putBundle("size", bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzdahVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
