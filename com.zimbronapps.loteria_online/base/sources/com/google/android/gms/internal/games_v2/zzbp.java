package com.google.android.gms.internal.games_v2;

import G6.b;
import W6.x;
import android.app.Activity;
import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzbp implements zzbm {
    private final Application zza;
    private final x zzb;
    private final zzaw zzc;

    public zzbp(Application application, x xVar, zzaw zzawVar) {
        this.zza = application;
        this.zzb = xVar;
        this.zzc = zzawVar;
    }

    private final zzk zzc() {
        Activity a = this.zzb.a();
        if (a != null) {
            return zzj.zza(a, this.zzc.zzb);
        }
        zzaw zzawVar = this.zzc;
        return zzj.zza(zzawVar.zza, zzawVar.zzb);
    }

    public final Task zza(zzq zzqVar) {
        boolean z = false;
        if (zzqVar.zza() == 0 && !b.a(this.zza)) {
            z = true;
        }
        Task zza = zzc().zza(zzqVar, z);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        zza.continueWithTask(zzge.zza(), new zzbn(this, zzqVar, z)).addOnCompleteListener(zzge.zza(), new zzbo(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public final /* synthetic */ Task zzb(zzq zzqVar, boolean z, Task task) throws Exception {
        if (!task.isSuccessful()) {
            com.google.android.gms.common.api.b exception = task.getException();
            if ((exception instanceof com.google.android.gms.common.api.b) && exception.getStatusCode() == 20) {
                zzfg.zza("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                return zzc().zza(zzqVar, z);
            }
        }
        return task;
    }
}
