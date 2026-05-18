package com.revenuecat.purchases.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(s sVar, byte[] bArr) {
        t.g(sVar, "<this>");
        t.g(bArr, "byteArray");
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
