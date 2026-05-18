package com.revenuecat.purchases.utils;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class SerializationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializationException(String message, Throwable th) {
        super(message, th);
        t.g(message, "message");
    }

    public /* synthetic */ SerializationException(String str, Throwable th, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
