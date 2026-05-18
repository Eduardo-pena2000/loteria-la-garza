package com.unity3d.services.ads.gmascar.managers;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ BiddingBaseManager a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(BiddingBaseManager biddingBaseManager, String str) {
        this.a = biddingBaseManager;
        this.b = str;
    }

    public final void run() {
        BiddingBaseManager.b(this.a, this.b);
    }
}
