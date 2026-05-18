package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ BiddingBaseManager a;
    public final /* synthetic */ BiddingSignals b;

    public /* synthetic */ a(BiddingBaseManager biddingBaseManager, BiddingSignals biddingSignals) {
        this.a = biddingBaseManager;
        this.b = biddingSignals;
    }

    public final void run() {
        BiddingBaseManager.a(this.a, this.b);
    }
}
