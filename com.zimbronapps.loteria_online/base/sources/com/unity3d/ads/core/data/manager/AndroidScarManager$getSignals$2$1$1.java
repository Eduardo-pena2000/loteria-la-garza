package com.unity3d.ads.core.data.manager;

import Ca.s;
import Ca.t;
import cb.n;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidScarManager$getSignals$2$1$1 implements IBiddingSignalsListener {
    final /* synthetic */ n $continuation;

    public AndroidScarManager$getSignals$2$1$1(n nVar) {
        this.$continuation = nVar;
    }

    public void onSignalsFailure(String str) {
        n nVar = this.$continuation;
        s.a aVar = s.b;
        nVar.resumeWith(s.b(t.a(new Exception(str))));
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.$continuation.resumeWith(s.b(biddingSignals));
    }
}
