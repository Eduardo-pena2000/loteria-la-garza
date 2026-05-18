package com.unity3d.ads.core.extensions;

import Za.c;
import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z) {
        t.g(str, "<this>");
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, z ? 10 : 2));
        t.f(copyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    public static final String toBase64(ByteString byteString, boolean z) {
        t.g(byteString, "<this>");
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), z ? 10 : 2);
        t.f(encodeToString, "encodeToString(this.toByteArray(), flag)");
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    public static final ByteString toByteString(UUID uuid) {
        t.g(uuid, "<this>");
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        t.f(copyFrom, "copyFrom(bytes.array())");
        return copyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        t.g(str, "<this>");
        byte[] bytes = str.getBytes(c.g);
        t.f(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        t.f(copyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return copyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        t.g(byteString, "<this>");
        String byteString2 = byteString.toString(c.g);
        t.f(byteString2, "this.toString(Charsets.ISO_8859_1)");
        return byteString2;
    }

    public static final UUID toUUID(ByteString byteString) {
        t.g(byteString, "<this>");
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        t.f(asReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            t.f(fromString, "fromString(uuidString)");
            return fromString;
        }
        if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
