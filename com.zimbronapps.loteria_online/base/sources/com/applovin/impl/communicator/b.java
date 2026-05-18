package com.applovin.impl.communicator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ CommunicatorMessageImpl a;

    public /* synthetic */ b(CommunicatorMessageImpl communicatorMessageImpl) {
        this.a = communicatorMessageImpl;
    }

    public final void run() {
        MessagingServiceImpl.d(this.a);
    }
}
