package com.unity3d.services.store.core;

import com.unity3d.services.store.StoreEvent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GatewayStoreExceptionHandler implements StoreExceptionHandler {
    public void handleStoreException(StoreEvent storeEvent, int i, Exception exception) {
        t.g(storeEvent, "storeEvent");
        t.g(exception, "exception");
        throw exception;
    }
}
