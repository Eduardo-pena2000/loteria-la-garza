package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i) {
        t.g(byteString, "<this>");
        return byteString.byteAt(i);
    }

    public static final boolean isNotEmpty(ByteString byteString) {
        t.g(byteString, "<this>");
        return !byteString.isEmpty();
    }

    public static final ByteString plus(ByteString byteString, ByteString byteString2) {
        t.g(byteString, "<this>");
        t.g(byteString2, "other");
        ByteString concat = byteString.concat(byteString2);
        t.f(concat, "concat(other)");
        return concat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        t.g(bArr, "<this>");
        ByteString copyFrom = ByteString.copyFrom(bArr);
        t.f(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        t.g(str, "<this>");
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        t.f(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        t.g(byteBuffer, "<this>");
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        t.f(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}
