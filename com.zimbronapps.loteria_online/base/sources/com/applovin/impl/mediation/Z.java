package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ MaxAdapter.OnCompletionListener b;
    public final /* synthetic */ MaxAdapterInitializationParameters c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ z(h hVar, MaxAdapter.OnCompletionListener onCompletionListener, MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity) {
        this.a = hVar;
        this.b = onCompletionListener;
        this.c = maxAdapterInitializationParameters;
        this.d = activity;
    }

    public final void run() {
        h.o(this.a, this.b, this.c, this.d);
    }
}
