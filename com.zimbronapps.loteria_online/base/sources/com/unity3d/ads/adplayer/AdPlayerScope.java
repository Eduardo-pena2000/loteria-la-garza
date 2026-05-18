package com.unity3d.ads.adplayer;

import Ga.i;
import cb.K;
import cb.O;
import cb.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdPlayerScope implements O {
    private final /* synthetic */ O $$delegate_0;
    private final K defaultDispatcher;

    public AdPlayerScope(K defaultDispatcher) {
        t.g(defaultDispatcher, "defaultDispatcher");
        this.defaultDispatcher = defaultDispatcher;
        this.$$delegate_0 = P.a(defaultDispatcher);
    }

    public i getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
