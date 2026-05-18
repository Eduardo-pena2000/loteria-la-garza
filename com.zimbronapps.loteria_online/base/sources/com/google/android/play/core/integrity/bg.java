package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bg extends bm {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    public final void b() {
        if (bn.k(this.e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            ((r7.w) bnVar.a.e()).X0(bn.a(bnVar, this.a, this.b, this.c, 0), new bk(this.e, this.d, this.b));
        } catch (RemoteException e) {
            bn.i(this.e).c(e, "requestExpressIntegrityToken(%s, %s)", this.a, Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
