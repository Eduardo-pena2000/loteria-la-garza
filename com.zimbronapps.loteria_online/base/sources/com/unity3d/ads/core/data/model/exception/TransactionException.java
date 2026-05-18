package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionException(String message) {
        super(message);
        t.g(message, "message");
    }
}
