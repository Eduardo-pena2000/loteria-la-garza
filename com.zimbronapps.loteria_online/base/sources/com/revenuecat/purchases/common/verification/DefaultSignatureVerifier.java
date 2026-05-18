package com.revenuecat.purchases.common.verification;

import android.util.Base64;
import java.security.GeneralSecurityException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import z7.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final c verifier;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public DefaultSignatureVerifier(byte[] bArr) {
        t.g(bArr, "publicKeyBytes");
        this.verifier = new c(bArr);
    }

    public boolean verify(byte[] bArr, byte[] bArr2) {
        t.g(bArr, "signatureToVerify");
        t.g(bArr2, "messageToVerify");
        try {
            this.verifier.a(bArr, bArr2);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DefaultSignatureVerifier(String str) {
        t.g(str, "publicKey");
        byte[] decode = Base64.decode(str, 0);
        t.f(decode, "decode(publicKey, Base64.DEFAULT)");
        this(decode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i, k kVar) {
        this((i & 1) != 0 ? "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=" : str);
    }
}
