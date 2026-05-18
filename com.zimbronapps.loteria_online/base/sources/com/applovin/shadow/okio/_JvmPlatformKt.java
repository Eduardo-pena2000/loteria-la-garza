package com.applovin.shadow.okio;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class _JvmPlatformKt {
    public static final byte[] asUtf8ToByteArray(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        byte[] bytes = str.getBytes(Za.c.b);
        kotlin.jvm.internal.t.f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock newLock() {
        return new ReentrantLock();
    }

    public static final String toUtf8String(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        return new String(bArr, Za.c.b);
    }

    public static final Object withLock(ReentrantLock reentrantLock, Qa.a aVar) {
        kotlin.jvm.internal.t.g(reentrantLock, "<this>");
        kotlin.jvm.internal.t.g(aVar, "action");
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.r.b(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.r.a(1);
        }
    }
}
