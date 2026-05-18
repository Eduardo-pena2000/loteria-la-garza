package com.applovin.impl.mediation;

import com.applovin.impl.s4;
import com.applovin.mediation.adapter.MaxAdapter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class v implements MaxAdapter.OnCompletionListener {
    public final /* synthetic */ s4 a;

    public /* synthetic */ v(s4 s4Var) {
        this.a = s4Var;
    }

    public final void onCompletion(MaxAdapter.InitializationStatus initializationStatus, String str) {
        f.b(this.a, initializationStatus, str);
    }
}
