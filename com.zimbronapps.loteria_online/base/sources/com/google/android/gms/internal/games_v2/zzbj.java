package com.google.android.gms.internal.games_v2;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class zzbj implements OnCompleteListener {
    public final /* synthetic */ zzbk zza;

    public /* synthetic */ zzbj(zzbk zzbkVar) {
        this.zza = zzbkVar;
    }

    public final void onComplete(Task task) {
        this.zza.zzb(task);
    }
}
