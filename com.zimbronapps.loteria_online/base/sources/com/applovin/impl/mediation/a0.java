package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.mediation.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ h.b a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ a0(h.b bVar, Bundle bundle) {
        this.a = bVar;
        this.b = bundle;
    }

    public final void run() {
        h.b.b(this.a, this.b);
    }
}
