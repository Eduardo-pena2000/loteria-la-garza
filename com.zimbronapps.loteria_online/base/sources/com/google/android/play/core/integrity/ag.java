package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import r7.B;
import r7.H;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class ag extends H {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    public final void b() {
        try {
            B b = (B) this.e.a.e();
            Bundle bundle = this.a;
            aj ajVar = this.e;
            b.b(bundle, aj.e(ajVar).a(this.b, this.c, ajVar.a));
        } catch (RemoteException e) {
            aj.f(this.e).c(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
