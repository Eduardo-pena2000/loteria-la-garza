package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.m;
import i6.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzac extends d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, a aVar, h hVar, boolean z) {
        super(aVar, hVar);
        this.zza = z;
    }

    public final m createFailedResult(Status status) {
        return new zzaj(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((g) ((zzam) bVar).getService()).zzf(this.zza);
        setResult((m) new zzaj(Status.f));
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((m) obj);
    }
}
