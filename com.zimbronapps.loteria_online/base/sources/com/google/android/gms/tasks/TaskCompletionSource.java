package com.google.android.gms.tasks;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class TaskCompletionSource {
    private final zzw zza = new zzw();

    public TaskCompletionSource() {
    }

    public Task getTask() {
        return this.zza;
    }

    public void setException(Exception exc) {
        this.zza.zzc(exc);
    }

    public void setResult(Object obj) {
        this.zza.zza(obj);
    }

    public boolean trySetException(Exception exc) {
        return this.zza.zzd(exc);
    }

    public boolean trySetResult(Object obj) {
        return this.zza.zzb(obj);
    }

    public final /* synthetic */ zzw zza() {
        return this.zza;
    }

    public TaskCompletionSource(CancellationToken cancellationToken) {
        cancellationToken.onCanceledRequested(new zzs(this));
    }
}
