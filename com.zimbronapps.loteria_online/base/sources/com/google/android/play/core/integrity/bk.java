package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import r7.G;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bk extends bi {
    final /* synthetic */ bn c;
    private final G d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new G("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    public static /* bridge */ /* synthetic */ long f(bk bkVar) {
        return bkVar.e;
    }

    public final void c(Bundle bundle) throws RemoteException {
        super.c(bundle);
        this.d.d("onRequestExpressIntegrityToken", new Object[0]);
        Exception a = bn.g(this.c).a(bundle);
        if (a != null) {
            this.a.trySetException(a);
            return;
        }
        bj bjVar = new bj(this, bn.j(this.c), bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
