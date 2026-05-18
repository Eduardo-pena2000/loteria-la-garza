package com.revenuecat.purchases.models;

import Ca.e;
import Ca.l;
import Ca.m;
import Ca.n;
import Qa.a;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.lang.annotation.Annotation;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import ob.b;
import rb.d;
import sb.A;
import sb.f0;
import sb.t0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Checksum {
    private final Algorithm algorithm;
    private final String value;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {Algorithm.Companion.serializer(), null};

    public enum Algorithm {
        SHA256("SHA-256"),
        SHA384("SHA-384"),
        SHA512("SHA-512"),
        MD5("MD5");

        private final String algorithmName;
        public static final Companion Companion = new Companion(null);
        private static final l $cachedSerializer$delegate = m.a(n.b, Companion.1.INSTANCE);

        public static final class Companion {

            public static final class 1 extends u implements a {
                public static final 1 INSTANCE = new 1();

                public 1() {
                    super(0);
                }

                public final b invoke() {
                    return A.a("com.revenuecat.purchases.models.Checksum.Algorithm", Algorithm.values(), new String[]{"sha256", "sha384", "sha512", "md5"}, new Annotation[][]{null, null, null, null}, (Annotation[]) null);
                }
            }

            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private final /* synthetic */ b get$cachedSerializer() {
                return (b) Algorithm.access$get$cachedSerializer$delegate$cp().getValue();
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            public final Algorithm fromString(String str) {
                t.g(str, "value");
                String lowerCase = str.toLowerCase(Locale.ROOT);
                t.f(lowerCase, "toLowerCase(...)");
                switch (lowerCase.hashCode()) {
                    case -903629273:
                        if (lowerCase.equals("sha256")) {
                            return Algorithm.SHA256;
                        }
                        return null;
                    case -903628221:
                        if (lowerCase.equals("sha384")) {
                            return Algorithm.SHA384;
                        }
                        return null;
                    case -903626518:
                        if (lowerCase.equals("sha512")) {
                            return Algorithm.SHA512;
                        }
                        return null;
                    case 107902:
                        if (lowerCase.equals("md5")) {
                            return Algorithm.MD5;
                        }
                        return null;
                    default:
                        return null;
                }
            }

            public final b serializer() {
                return get$cachedSerializer();
            }

            private Companion() {
            }
        }

        Algorithm(String str) {
            this.algorithmName = str;
        }

        public static final /* synthetic */ l access$get$cachedSerializer$delegate$cp() {
            return $cachedSerializer$delegate;
        }

        public final String getAlgorithmName() {
            return this.algorithmName;
        }
    }

    public static final class ChecksumValidationException extends Exception {
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Checksum generate(byte[] bArr, Algorithm algorithm) {
            t.g(bArr, "data");
            t.g(algorithm, "algorithm");
            byte[] digest = MessageDigest.getInstance(algorithm.getAlgorithmName()).digest(bArr);
            t.f(digest, "hash");
            return new Checksum(algorithm, ChecksumKt.toHexString(digest));
        }

        public final b serializer() {
            return Checksum$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ Checksum(int i, Algorithm algorithm, String str, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, Checksum$$serializer.INSTANCE.getDescriptor());
        }
        this.algorithm = algorithm;
        this.value = str;
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ Checksum copy$default(Checksum checksum, Algorithm algorithm, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            algorithm = checksum.algorithm;
        }
        if ((i & 2) != 0) {
            str = checksum.value;
        }
        return checksum.copy(algorithm, str);
    }

    public static /* synthetic */ void getAlgorithm$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Checksum checksum, d dVar, qb.e eVar) {
        dVar.k(eVar, 0, $childSerializers[0], checksum.algorithm);
        dVar.v(eVar, 1, checksum.value);
    }

    public final Algorithm component1() {
        return this.algorithm;
    }

    public final String component2() {
        return this.value;
    }

    public final Checksum copy(Algorithm algorithm, String str) {
        t.g(algorithm, "algorithm");
        t.g(str, "value");
        return new Checksum(algorithm, str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Checksum)) {
            return false;
        }
        String str = this.value;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        t.f(lowerCase, "toLowerCase(...)");
        Checksum checksum = (Checksum) obj;
        String lowerCase2 = checksum.value.toLowerCase(locale);
        t.f(lowerCase2, "toLowerCase(...)");
        return t.c(lowerCase, lowerCase2) && this.algorithm == checksum.algorithm;
    }

    public final Algorithm getAlgorithm() {
        return this.algorithm;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return (this.algorithm.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Checksum(algorithm=" + this.algorithm + ", value=" + this.value + ')';
    }

    public Checksum(Algorithm algorithm, String str) {
        t.g(algorithm, "algorithm");
        t.g(str, "value");
        this.algorithm = algorithm;
        this.value = str;
    }
}
