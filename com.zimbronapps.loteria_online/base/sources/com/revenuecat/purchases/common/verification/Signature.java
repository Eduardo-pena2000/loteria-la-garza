package com.revenuecat.purchases.common.verification;

import Da.p;
import android.util.Base64;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Signature {
    public static final Companion Companion = new Companion(null);
    private final byte[] intermediateKey;
    private final byte[] intermediateKeyExpiration;
    private final byte[] intermediateKeySignature;
    private final byte[] payload;
    private final byte[] salt;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Signature fromString$purchases_defaultsBc8Release(String str) {
            t.g(str, "signature");
            byte[] decode = Base64.decode(str, 0);
            int totalSize = Component.Companion.getTotalSize();
            if (decode.length == totalSize) {
                t.f(decode, "signatureBytes");
                return new Signature(SignatureKt.access$copyOf(decode, Component.INTERMEDIATE_KEY), SignatureKt.access$copyOf(decode, Component.INTERMEDIATE_KEY_EXPIRATION), SignatureKt.access$copyOf(decode, Component.INTERMEDIATE_KEY_SIGNATURE), SignatureKt.access$copyOf(decode, Component.SALT), SignatureKt.access$copyOf(decode, Component.PAYLOAD));
            }
            throw new InvalidSignatureSizeException("Invalid signature size. Expected " + totalSize + ", got " + decode.length + " bytes");
        }

        private Companion() {
        }
    }

    public enum Component {
        INTERMEDIATE_KEY(32),
        INTERMEDIATE_KEY_EXPIRATION(4),
        INTERMEDIATE_KEY_SIGNATURE(64),
        SALT(16),
        PAYLOAD(64);

        public static final Companion Companion = new Companion(null);
        private final int size;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final int getTotalSize() {
                int i = 0;
                for (Component component : Component.values()) {
                    i += component.getSize();
                }
                return i;
            }

            private Companion() {
            }
        }

        Component(int i) {
            this.size = i;
        }

        public final int getEndByte() {
            return getStartByte() + this.size;
        }

        public final int getSize() {
            return this.size;
        }

        public final int getStartByte() {
            int i = 0;
            for (Object obj : p.r(values(), 0, ordinal())) {
                i += ((Component) obj).size;
            }
            return i;
        }
    }

    public Signature(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        t.g(bArr, "intermediateKey");
        t.g(bArr2, "intermediateKeyExpiration");
        t.g(bArr3, "intermediateKeySignature");
        t.g(bArr4, "salt");
        t.g(bArr5, "payload");
        this.intermediateKey = bArr;
        this.intermediateKeyExpiration = bArr2;
        this.intermediateKeySignature = bArr3;
        this.salt = bArr4;
        this.payload = bArr5;
    }

    public static /* synthetic */ Signature copy$default(Signature signature, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = signature.intermediateKey;
        }
        if ((i & 2) != 0) {
            bArr2 = signature.intermediateKeyExpiration;
        }
        byte[] bArr6 = bArr2;
        if ((i & 4) != 0) {
            bArr3 = signature.intermediateKeySignature;
        }
        byte[] bArr7 = bArr3;
        if ((i & 8) != 0) {
            bArr4 = signature.salt;
        }
        byte[] bArr8 = bArr4;
        if ((i & 16) != 0) {
            bArr5 = signature.payload;
        }
        return signature.copy(bArr, bArr6, bArr7, bArr8, bArr5);
    }

    public final byte[] component1() {
        return this.intermediateKey;
    }

    public final byte[] component2() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] component3() {
        return this.intermediateKeySignature;
    }

    public final byte[] component4() {
        return this.salt;
    }

    public final byte[] component5() {
        return this.payload;
    }

    public final Signature copy(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        t.g(bArr, "intermediateKey");
        t.g(bArr2, "intermediateKeyExpiration");
        t.g(bArr3, "intermediateKeySignature");
        t.g(bArr4, "salt");
        t.g(bArr5, "payload");
        return new Signature(bArr, bArr2, bArr3, bArr4, bArr5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(Signature.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.Signature");
        Signature signature = (Signature) obj;
        return Arrays.equals(this.intermediateKey, signature.intermediateKey) && Arrays.equals(this.intermediateKeyExpiration, signature.intermediateKeyExpiration) && Arrays.equals(this.intermediateKeySignature, signature.intermediateKeySignature) && Arrays.equals(this.salt, signature.salt) && Arrays.equals(this.payload, signature.payload);
    }

    public final byte[] getIntermediateKey() {
        return this.intermediateKey;
    }

    public final byte[] getIntermediateKeyExpiration() {
        return this.intermediateKeyExpiration;
    }

    public final byte[] getIntermediateKeySignature() {
        return this.intermediateKeySignature;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final byte[] getSalt() {
        return this.salt;
    }

    public int hashCode() {
        return (((((((Arrays.hashCode(this.intermediateKey) * 31) + Arrays.hashCode(this.intermediateKeyExpiration)) * 31) + Arrays.hashCode(this.intermediateKeySignature)) * 31) + Arrays.hashCode(this.salt)) * 31) + Arrays.hashCode(this.payload);
    }

    public String toString() {
        return "Signature(intermediateKey=" + Arrays.toString(this.intermediateKey) + ", intermediateKeyExpiration=" + Arrays.toString(this.intermediateKeyExpiration) + ", intermediateKeySignature=" + Arrays.toString(this.intermediateKeySignature) + ", salt=" + Arrays.toString(this.salt) + ", payload=" + Arrays.toString(this.payload) + ')';
    }
}
