package com.applovin.shadow.okio;

import Ca.I;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class HashingSource extends ForwardingSource implements Source {
    public static final Companion Companion = new Companion(null);
    private final Mac mac;
    private final MessageDigest messageDigest;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final HashingSource hmacSha1(Source source, ByteString byteString) {
            kotlin.jvm.internal.t.g(source, "source");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA1");
        }

        public final HashingSource hmacSha256(Source source, ByteString byteString) {
            kotlin.jvm.internal.t.g(source, "source");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA256");
        }

        public final HashingSource hmacSha512(Source source, ByteString byteString) {
            kotlin.jvm.internal.t.g(source, "source");
            kotlin.jvm.internal.t.g(byteString, "key");
            return new HashingSource(source, byteString, "HmacSHA512");
        }

        public final HashingSource md5(Source source) {
            kotlin.jvm.internal.t.g(source, "source");
            return new HashingSource(source, "MD5");
        }

        public final HashingSource sha1(Source source) {
            kotlin.jvm.internal.t.g(source, "source");
            return new HashingSource(source, "SHA-1");
        }

        public final HashingSource sha256(Source source) {
            kotlin.jvm.internal.t.g(source, "source");
            return new HashingSource(source, "SHA-256");
        }

        public final HashingSource sha512(Source source) {
            kotlin.jvm.internal.t.g(source, "source");
            return new HashingSource(source, "SHA-512");
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, MessageDigest messageDigest) {
        super(source);
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(messageDigest, "digest");
        this.messageDigest = messageDigest;
        this.mac = null;
    }

    public static final HashingSource hmacSha1(Source source, ByteString byteString) {
        return Companion.hmacSha1(source, byteString);
    }

    public static final HashingSource hmacSha256(Source source, ByteString byteString) {
        return Companion.hmacSha256(source, byteString);
    }

    public static final HashingSource hmacSha512(Source source, ByteString byteString) {
        return Companion.hmacSha512(source, byteString);
    }

    public static final HashingSource md5(Source source) {
        return Companion.md5(source);
    }

    public static final HashingSource sha1(Source source) {
        return Companion.sha1(source);
    }

    public static final HashingSource sha256(Source source) {
        return Companion.sha256(source);
    }

    public static final HashingSource sha512(Source source) {
        return Companion.sha512(source);
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

    public long read(Buffer buffer, long j) throws IOException {
        kotlin.jvm.internal.t.g(buffer, "sink");
        long read = super.read(buffer, j);
        if (read != -1) {
            long size = buffer.size() - read;
            long size2 = buffer.size();
            Segment segment = buffer.head;
            kotlin.jvm.internal.t.d(segment);
            while (size2 > size) {
                segment = segment.prev;
                kotlin.jvm.internal.t.d(segment);
                size2 -= segment.limit - segment.pos;
            }
            while (size2 < buffer.size()) {
                int i = (int) ((segment.pos + size) - size2);
                MessageDigest messageDigest = this.messageDigest;
                if (messageDigest != null) {
                    messageDigest.update(segment.data, i, segment.limit - i);
                } else {
                    Mac mac = this.mac;
                    kotlin.jvm.internal.t.d(mac);
                    mac.update(segment.data, i, segment.limit - i);
                }
                size2 += segment.limit - segment.pos;
                segment = segment.next;
                kotlin.jvm.internal.t.d(segment);
                size = size2;
            }
        }
        return read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, String str) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        kotlin.jvm.internal.t.f(messageDigest, "getInstance(...)");
        this(source, messageDigest);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashingSource(Source source, Mac mac) {
        super(source);
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(mac, "mac");
        this.mac = mac;
        this.messageDigest = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HashingSource(Source source, ByteString byteString, String str) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(byteString, "key");
        kotlin.jvm.internal.t.g(str, "algorithm");
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.toByteArray(), str));
            I i = I.a;
            kotlin.jvm.internal.t.d(mac);
            this(source, mac);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
