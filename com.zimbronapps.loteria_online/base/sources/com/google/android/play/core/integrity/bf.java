package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bf extends bm {
    final /* synthetic */ long a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.a = j;
        this.b = taskCompletionSource2;
    }

    public final void b() {
        if (bn.k(this.c)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.c;
            ((r7.w) bnVar.a.e()).M0(bn.b(bnVar, this.a, 0), new bl(this.c, this.b));
        } catch (RemoteException e) {
            bn.i(this.c).c(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
