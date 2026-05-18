package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class bh extends bm {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    public final void b() {
        if (bn.k(this.e)) {
            super.a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            r7.f fVar = bnVar.a;
            ((r7.w) fVar.e()).b(this.a, bn.h(bnVar).a(this.b, this.c, fVar));
        } catch (RemoteException e) {
            bn.i(this.e).c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
