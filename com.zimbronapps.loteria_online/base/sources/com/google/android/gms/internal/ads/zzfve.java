package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzfve implements Continuation {
    private final /* synthetic */ zzavm zza;
    private final /* synthetic */ int zzb;

    public /* synthetic */ zzfve(zzavm zzavmVar, int i) {
        this.zza = zzavmVar;
        this.zzb = i;
    }

    public final /* synthetic */ Object then(Task task) {
        int i = zzfvh.zza;
        if (!task.isSuccessful()) {
            return Boolean.FALSE;
        }
        int i2 = this.zzb;
        zzfxc zza = ((zzfxd) task.getResult()).zza(((zzavq) this.zza.zzbm()).zzaN());
        zza.zzc(i2);
        zza.zza();
        return Boolean.TRUE;
    }
}
