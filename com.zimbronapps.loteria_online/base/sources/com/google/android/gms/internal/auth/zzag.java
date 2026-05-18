package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.m;
import i6.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzag extends d {
    final /* synthetic */ Account zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzal zzalVar, a aVar, h hVar, Account account) {
        super(aVar, hVar);
        this.zza = account;
    }

    public final m createFailedResult(Status status) {
        return new zzak(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((g) ((zzam) bVar).getService()).c(new zzaf(this), this.zza);
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((m) obj);
    }
}
