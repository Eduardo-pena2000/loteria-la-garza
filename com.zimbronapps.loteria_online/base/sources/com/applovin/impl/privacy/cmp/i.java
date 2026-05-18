package com.applovin.impl.privacy.cmp;

import com.applovin.impl.k0;
import com.applovin.impl.privacy.cmp.a;
import com.google.android.ump.FormError;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ a a;
    public final /* synthetic */ FormError b;
    public final /* synthetic */ k0 c;
    public final /* synthetic */ a.a d;

    public /* synthetic */ i(a aVar, FormError formError, k0 k0Var, a.a aVar2) {
        this.a = aVar;
        this.b = formError;
        this.c = k0Var;
        this.d = aVar2;
    }

    public final void run() {
        a.d(this.a, this.b, this.c, this.d);
    }
}
