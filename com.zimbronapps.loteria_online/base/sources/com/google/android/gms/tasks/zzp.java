package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzp implements OnSuccessListener, OnFailureListener, OnCanceledListener, zzq {
    private final Executor zza;
    private final SuccessContinuation zzb;
    private final zzw zzc;

    public zzp(Executor executor, SuccessContinuation successContinuation, zzw zzwVar) {
        this.zza = executor;
        this.zzb = successContinuation;
        this.zzc = zzwVar;
    }

    public final void onCanceled() {
        this.zzc.zze();
    }

    public final void onFailure(Exception exc) {
        this.zzc.zzc(exc);
    }

    public final void onSuccess(Object obj) {
        this.zzc.zza(obj);
    }

    public final void zza(Task task) {
        this.zza.execute(new zzo(this, task));
    }

    public final void zzb() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ SuccessContinuation zzc() {
        return this.zzb;
    }
}
