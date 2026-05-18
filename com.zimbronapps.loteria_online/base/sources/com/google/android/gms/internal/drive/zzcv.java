package com.google.android.gms.internal.drive;

import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzcv extends y {
    private final /* synthetic */ zzg zzfu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcv(zzch zzchVar, l.a aVar, zzg zzgVar) {
        super(aVar);
        this.zzfu = zzgVar;
    }

    public final /* synthetic */ void unregisterListener(a.b bVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(Boolean.valueOf(this.zzfu.cancel()));
    }
}
