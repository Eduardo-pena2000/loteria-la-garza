package com.applovin.shadow.okio;

import Ca.I;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class HashingSink extends ForwardingSink implements Sink {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final HashingSink hmacSha1(Sink sink, ByteString byteString) {
            kotlin.jvm.internal.t.g(sink, "sink");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA1");
        }

        public final HashingSink hmacSha256(Sink sink, ByteString byteString) {
            kotlin.jvm.internal.t.g(sink, "sink");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA256");
        }

        public final HashingSink hmacSha512(Sink sink, ByteString byteString) {
            kotlin.jvm.internal.t.g(sink, "sink");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSink(sink, byteString, "HmacSHA512");
        }

        public final HashingSink md5(Sink sink) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return new HashingSink(sink, "MD5");
        }

        public final HashingSink sha1(Sink sink) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return new HashingSink(sink, "SHA-1");
        }

        public final HashingSink sha256(Sink sink) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return new HashingSink(sink, "SHA-256");
        }

        public final HashingSink sha512(Sink sink) {
            kotlin.jvm.internal.t.g(sink, "sink");
            return new HashingSink(sink, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, MessageDigest messageDigest) {
        super(sink);
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(messageDigest, "digest");
        this.messageDigest = messageDigest;
        this.mac = null;
    }

    public static final HashingSink hmacSha1(Sink sink, ByteString byteString) {
        return Companion.hmacSha1(sink, byteString);
    }

    public static final HashingSink hmacSha256(Sink sink, ByteString byteString) {
        return Companion.hmacSha256(sink, byteString);
    }

    public static final HashingSink hmacSha512(Sink sink, ByteString byteString) {
        return Companion.hmacSha512(sink, byteString);
    }

    public static final HashingSink md5(Sink sink) {
        return Companion.md5(sink);
    }

    public static final HashingSink sha1(Sink sink) {
        return Companion.sha1(sink);
    }

    public static final HashingSink sha256(Sink sink) {
        return Companion.sha256(sink);
    }

    public static final HashingSink sha512(Sink sink) {
        return Companion.sha512(sink);
    }

    @Ca.e
    public final ByteString -deprecated_hash() {
        return hash();
    }

    public final ByteString hash() {
        byte[] doFinal;
        MessageDigest messageDigest = this.messageDigest;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.mac;
            kotlin.jvm.internal.t.d(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.t.d(doFinal);
        return new ByteString(doFinal);
    }

    public void write(Buffer buffer, long j) throws IOException {
        kotlin.jvm.internal.t.g(buffer, "source");
        -SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j);
        Segment segment = buffer.head;
        kotlin.jvm.internal.t.d(segment);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, segment.limit - segment.pos);
            MessageDigest messageDigest = this.messageDigest;
            if (messageDigest != null) {
                messageDigest.update(segment.data, segment.pos, min);
            } else {
                Mac mac = this.mac;
                kotlin.jvm.internal.t.d(mac);
                mac.update(segment.data, segment.pos, min);
            }
            j2 += min;
            segment = segment.next;
            kotlin.jvm.internal.t.d(segment);
        }
        super.write(buffer, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, String str) {
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        kotlin.jvm.internal.t.f(messageDigest, "getInstance(...)");
        this(sink, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSink(Sink sink, Mac mac) {
        super(sink);
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSink(Sink sink, ByteString byteString, String str) {
        kotlin.jvm.internal.t.g(sink, "sink");
        kotlin.jvm.internal.t.g(byteString, "key");
        kotlin.jvm.internal.t.g(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            I i = I.a;
            kotlin.jvm.internal.t.d(mac);
            this(sink, mac);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
