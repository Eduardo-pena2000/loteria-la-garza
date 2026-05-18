package com.applovin.impl.communicator;

import java.util.concurrent.ThreadFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class a implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return MessagingServiceImpl.e(runnable);
    }
}
