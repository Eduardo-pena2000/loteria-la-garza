package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h0 extends B0 {
    public d a;
    public final int b;

    public h0(d dVar, int i) {
        this.a = dVar;
        this.b = i;
    }

    public final void C(int i, IBinder iBinder, Bundle bundle) {
        t.m(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.onPostInitHandler(i, iBinder, bundle, this.b);
        this.a = null;
    }

    public final void S0(int i, IBinder iBinder, m0 m0Var) {
        d dVar = this.a;
        t.m(dVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        t.l(m0Var);
        dVar.zzc(m0Var);
        C(i, iBinder, m0Var.a);
    }

    public final void v0(int i, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
