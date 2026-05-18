package com.google.android.gms.internal.firebase-auth-api;

import J7.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzafp implements zzafg {
    private final zzaff zza;
    private final TaskCompletionSource zzb;

    public zzafp(zzaff zzaffVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzaffVar;
        this.zzb = taskCompletionSource;
    }

    public final void zza(Object obj, Status status) {
        t.m(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(obj);
            return;
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zzq != null) {
            TaskCompletionSource taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaffVar.zzc);
            zzaff zzaffVar2 = this.zza;
            taskCompletionSource.setException(zzaen.zza(firebaseAuth, zzaffVar2.zzq, ("reauthenticateWithCredential".equals(zzaffVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        h hVar = zzaffVar.zzn;
        if (hVar != null) {
            this.zzb.setException(zzaen.zza(status, hVar, zzaffVar.zzo, zzaffVar.zzp));
        } else {
            this.zzb.setException(zzaen.zza(status));
        }
    }
}
