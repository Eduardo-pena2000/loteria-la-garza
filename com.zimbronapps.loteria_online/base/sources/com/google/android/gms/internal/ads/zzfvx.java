package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfvx {
    private final Context zza;
    private final Executor zzb;
    private final zzfvh zzc;
    private final zzfvw zzd;
    private Task zze;

    public zzfvx(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar, zzfvt zzfvtVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfvhVar;
        this.zzd = zzfvtVar;
    }

    public static zzfvx zza(Context context, Executor executor, zzfvh zzfvhVar, zzfvj zzfvjVar) {
        zzfvx zzfvxVar = new zzfvx(context, executor, zzfvhVar, zzfvjVar, new zzfvt());
        zzfvv zzfvvVar = new zzfvv(zzfvxVar);
        Executor executor2 = zzfvxVar.zzb;
        zzfvxVar.zze = Tasks.call(executor2, zzfvvVar).addOnFailureListener(executor2, new zzfvu(zzfvxVar));
        return zzfvxVar;
    }

    public final zzaxg zzb() {
        zzfvw zzfvwVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfvwVar.zza() : (zzaxg) task.getResult();
    }

    public final /* synthetic */ zzaxg zzc() {
        Context context = this.zza;
        return zzfvo.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
