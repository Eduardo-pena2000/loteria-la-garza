package okhttp3;

import Za.B;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CipherSuite {
    public static final CipherSuite A;
    public static final CipherSuite A0;
    public static final CipherSuite B;
    public static final CipherSuite B0;
    public static final CipherSuite C;
    public static final CipherSuite C0;
    public static final CipherSuite D;
    public static final CipherSuite D0;
    public static final CipherSuite E;
    public static final CipherSuite E0;
    public static final CipherSuite F;
    public static final CipherSuite F0;
    public static final CipherSuite G;
    public static final CipherSuite G0;
    public static final CipherSuite H;
    public static final CipherSuite H0;
    public static final CipherSuite I;
    public static final CipherSuite I0;
    public static final CipherSuite J;
    public static final CipherSuite J0;
    public static final CipherSuite K;
    public static final CipherSuite K0;
    public static final CipherSuite L;
    public static final CipherSuite L0;
    public static final CipherSuite M;
    public static final CipherSuite M0;
    public static final CipherSuite N;
    public static final CipherSuite N0;
    public static final CipherSuite O;
    public static final CipherSuite O0;
    public static final CipherSuite P;
    public static final CipherSuite P0;
    public static final CipherSuite Q;
    public static final CipherSuite Q0;
    public static final CipherSuite R;
    public static final CipherSuite R0;
    public static final CipherSuite S;
    public static final CipherSuite S0;
    public static final CipherSuite T;
    public static final CipherSuite T0;
    public static final CipherSuite U;
    public static final CipherSuite U0;
    public static final CipherSuite V;
    public static final CipherSuite V0;
    public static final CipherSuite W;
    public static final CipherSuite W0;
    public static final CipherSuite X;
    public static final CipherSuite X0;
    public static final CipherSuite Y;
    public static final CipherSuite Y0;
    public static final CipherSuite Z;
    public static final CipherSuite Z0;
    public static final CipherSuite a0;
    public static final CipherSuite a1;
    public static final Companion b;
    public static final CipherSuite b0;
    public static final CipherSuite b1;
    public static final Comparator c;
    public static final CipherSuite c0;
    public static final CipherSuite c1;
    public static final Map d;
    public static final CipherSuite d0;
    public static final CipherSuite d1;
    public static final CipherSuite e;
    public static final CipherSuite e0;
    public static final CipherSuite e1;
    public static final CipherSuite f;
    public static final CipherSuite f0;
    public static final CipherSuite f1;
    public static final CipherSuite g;
    public static final CipherSuite g0;
    public static final CipherSuite g1;
    public static final CipherSuite h;
    public static final CipherSuite h0;
    public static final CipherSuite h1;
    public static final CipherSuite i;
    public static final CipherSuite i0;
    public static final CipherSuite i1;
    public static final CipherSuite j;
    public static final CipherSuite j0;
    public static final CipherSuite j1;
    public static final CipherSuite k;
    public static final CipherSuite k0;
    public static final CipherSuite k1;
    public static final CipherSuite l;
    public static final CipherSuite l0;
    public static final CipherSuite l1;
    public static final CipherSuite m;
    public static final CipherSuite m0;
    public static final CipherSuite m1;
    public static final CipherSuite n;
    public static final CipherSuite n0;
    public static final CipherSuite n1;
    public static final CipherSuite o;
    public static final CipherSuite o0;
    public static final CipherSuite o1;
    public static final CipherSuite p;
    public static final CipherSuite p0;
    public static final CipherSuite p1;
    public static final CipherSuite q;
    public static final CipherSuite q0;
    public static final CipherSuite q1;
    public static final CipherSuite r;
    public static final CipherSuite r0;
    public static final CipherSuite r1;
    public static final CipherSuite s;
    public static final CipherSuite s0;
    public static final CipherSuite s1;
    public static final CipherSuite t;
    public static final CipherSuite t0;
    public static final CipherSuite u;
    public static final CipherSuite u0;
    public static final CipherSuite v;
    public static final CipherSuite v0;
    public static final CipherSuite w;
    public static final CipherSuite w0;
    public static final CipherSuite x;
    public static final CipherSuite x0;
    public static final CipherSuite y;
    public static final CipherSuite y0;
    public static final CipherSuite z;
    public static final CipherSuite z0;
    public final String a;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ CipherSuite a(Companion companion, String str, int i) {
            return companion.d(str, i);
        }

        public final synchronized CipherSuite b(String javaName) {
            CipherSuite cipherSuite;
            try {
                t.g(javaName, "javaName");
                cipherSuite = (CipherSuite) CipherSuite.a().get(javaName);
                if (cipherSuite == null) {
                    cipherSuite = (CipherSuite) CipherSuite.a().get(e(javaName));
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(javaName, null);
                    }
                    CipherSuite.a().put(javaName, cipherSuite);
                }
            } catch (Throwable th) {
                throw th;
            }
            return cipherSuite;
        }

        public final Comparator c() {
            return CipherSuite.b();
        }

        public final CipherSuite d(String str, int i) {
            CipherSuite cipherSuite = new CipherSuite(str, null);
            CipherSuite.a().put(str, cipherSuite);
            return cipherSuite;
        }

        public final String e(String str) {
            if (B.N(str, "TLS_", false, 2, null)) {
                String substring = str.substring(4);
                t.f(substring, "this as java.lang.String).substring(startIndex)");
                return t.o("SSL_", substring);
            }
            if (!B.N(str, "SSL_", false, 2, null)) {
                return str;
            }
            String substring2 = str.substring(4);
            t.f(substring2, "this as java.lang.String).substring(startIndex)");
            return t.o("TLS_", substring2);
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        b = companion;
        c = new CipherSuite$Companion$ORDER_BY_NAME$1();
        d = new LinkedHashMap();
        e = Companion.a(companion, "SSL_RSA_WITH_NULL_MD5", 1);
        f = Companion.a(companion, "SSL_RSA_WITH_NULL_SHA", 2);
        g = Companion.a(companion, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        h = Companion.a(companion, "SSL_RSA_WITH_RC4_128_MD5", 4);
        i = Companion.a(companion, "SSL_RSA_WITH_RC4_128_SHA", 5);
        j = Companion.a(companion, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        k = Companion.a(companion, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        l = Companion.a(companion, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        m = Companion.a(companion, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        n = Companion.a(companion, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        o = Companion.a(companion, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        p = Companion.a(companion, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        q = Companion.a(companion, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        r = Companion.a(companion, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        s = Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        t = Companion.a(companion, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        u = Companion.a(companion, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        v = Companion.a(companion, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        w = Companion.a(companion, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        x = Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        y = Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        z = Companion.a(companion, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        A = Companion.a(companion, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        B = Companion.a(companion, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        C = Companion.a(companion, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        D = Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        E = Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        F = Companion.a(companion, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        G = Companion.a(companion, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        H = Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        I = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        J = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        K = Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        L = Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        M = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        N = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        O = Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        P = Companion.a(companion, "TLS_RSA_WITH_NULL_SHA256", 59);
        Q = Companion.a(companion, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        R = Companion.a(companion, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        S = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        T = Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        U = Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        V = Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        W = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        X = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        Y = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        Z = Companion.a(companion, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        a0 = Companion.a(companion, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b0 = Companion.a(companion, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c0 = Companion.a(companion, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        d0 = Companion.a(companion, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        e0 = Companion.a(companion, "TLS_PSK_WITH_RC4_128_SHA", 138);
        f0 = Companion.a(companion, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        g0 = Companion.a(companion, "TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        h0 = Companion.a(companion, "TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        i0 = Companion.a(companion, "TLS_RSA_WITH_SEED_CBC_SHA", 150);
        j0 = Companion.a(companion, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        k0 = Companion.a(companion, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        l0 = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m0 = Companion.a(companion, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        n0 = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        o0 = Companion.a(companion, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        p0 = Companion.a(companion, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        q0 = Companion.a(companion, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        r0 = Companion.a(companion, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        s0 = Companion.a(companion, "TLS_FALLBACK_SCSV", 22016);
        t0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        u0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        v0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        w0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        x0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        y0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        z0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        A0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        B0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        C0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        D0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        E0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        F0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        G0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        H0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        I0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        J0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        K0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        L0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        M0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        N0 = Companion.a(companion, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        O0 = Companion.a(companion, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        P0 = Companion.a(companion, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        Q0 = Companion.a(companion, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        R0 = Companion.a(companion, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        S0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        T0 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        U0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        V0 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        W0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        X0 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        Y0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        Z0 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        a1 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        b1 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        c1 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        d1 = Companion.a(companion, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        e1 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f1 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        g1 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        h1 = Companion.a(companion, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        i1 = Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        j1 = Companion.a(companion, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        k1 = Companion.a(companion, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        l1 = Companion.a(companion, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        m1 = Companion.a(companion, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        n1 = Companion.a(companion, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        o1 = Companion.a(companion, "TLS_AES_128_GCM_SHA256", 4865);
        p1 = Companion.a(companion, "TLS_AES_256_GCM_SHA384", 4866);
        q1 = Companion.a(companion, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        r1 = Companion.a(companion, "TLS_AES_128_CCM_SHA256", 4868);
        s1 = Companion.a(companion, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ CipherSuite(String str, k kVar) {
        this(str);
    }

    public static final /* synthetic */ Map a() {
        return d;
    }

    public static final /* synthetic */ Comparator b() {
        return c;
    }

    public final String c() {
        return this.a;
    }

    public String toString() {
        return this.a;
    }

    public CipherSuite(String str) {
        this.a = str;
    }
}
