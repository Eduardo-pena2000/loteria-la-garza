package com.google.android.gms.tasks;

import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzf implements OnSuccessListener, OnFailureListener, OnCanceledListener, zzq {
    private final Executor zza;
    private final Continuation zzb;
    private final zzw zzc;

    public zzf(Executor executor, Continuation continuation, zzw zzwVar) {
        this.zza = executor;
        this.zzb = continuation;
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
        this.zza.execute(new zze(this, task));
    }

    public final void zzb() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Continuation zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzw zzd() {
        return this.zzc;
    }
}
