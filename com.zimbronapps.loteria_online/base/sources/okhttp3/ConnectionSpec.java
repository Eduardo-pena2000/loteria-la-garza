package okhttp3;

import Da.D;
import Fa.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConnectionSpec {
    public static final Companion e = new Companion(null);
    public static final CipherSuite[] f;
    public static final CipherSuite[] g;
    public static final ConnectionSpec h;
    public static final ConnectionSpec i;
    public static final ConnectionSpec j;
    public static final ConnectionSpec k;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        CipherSuite cipherSuite = CipherSuite.o1;
        CipherSuite cipherSuite2 = CipherSuite.p1;
        CipherSuite cipherSuite3 = CipherSuite.q1;
        CipherSuite cipherSuite4 = CipherSuite.a1;
        CipherSuite cipherSuite5 = CipherSuite.e1;
        CipherSuite cipherSuite6 = CipherSuite.b1;
        CipherSuite cipherSuite7 = CipherSuite.f1;
        CipherSuite cipherSuite8 = CipherSuite.l1;
        CipherSuite cipherSuite9 = CipherSuite.k1;
        CipherSuite[] cipherSuiteArr = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9};
        f = cipherSuiteArr;
        CipherSuite[] cipherSuiteArr2 = {cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.L0, CipherSuite.M0, CipherSuite.j0, CipherSuite.k0, CipherSuite.H, CipherSuite.L, CipherSuite.l};
        g = cipherSuiteArr2;
        Builder c = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.c;
        TlsVersion tlsVersion2 = TlsVersion.d;
        h = c.j(tlsVersion, tlsVersion2).h(true).a();
        i = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).j(tlsVersion, tlsVersion2).h(true).a();
        j = new Builder(true).c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).j(tlsVersion, tlsVersion2, TlsVersion.e, TlsVersion.f).h(true).a();
        k = new Builder(false).a();
    }

    public ConnectionSpec(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public static final /* synthetic */ String[] a(ConnectionSpec connectionSpec) {
        return connectionSpec.c;
    }

    public static final /* synthetic */ String[] b(ConnectionSpec connectionSpec) {
        return connectionSpec.d;
    }

    public final void c(SSLSocket sslSocket, boolean z) {
        t.g(sslSocket, "sslSocket");
        ConnectionSpec g2 = g(sslSocket, z);
        if (g2.i() != null) {
            sslSocket.setEnabledProtocols(g2.d);
        }
        if (g2.d() != null) {
            sslSocket.setEnabledCipherSuites(g2.c);
        }
    }

    public final List d() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.b.b(str));
        }
        return D.L0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        t.g(socket, "socket");
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !Util.u(strArr, socket.getEnabledProtocols(), b.f())) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || Util.u(strArr2, socket.getEnabledCipherSuites(), CipherSuite.b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.a;
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        if (z != connectionSpec.a) {
            return false;
        }
        return !z || (Arrays.equals(this.c, connectionSpec.c) && Arrays.equals(this.d, connectionSpec.d) && this.b == connectionSpec.b);
    }

    public final boolean f() {
        return this.a;
    }

    public final ConnectionSpec g(SSLSocket sSLSocket, boolean z) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            t.f(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = Util.E(enabledCipherSuites, this.c, CipherSuite.b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            t.f(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = Util.E(enabledProtocols, this.d, b.f());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        t.f(supportedCipherSuites, "supportedCipherSuites");
        int x = Util.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", CipherSuite.b.c());
        if (z && x != -1) {
            t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[x];
            t.f(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = Util.o(cipherSuitesIntersection, str);
        }
        Builder builder = new Builder(this);
        t.f(cipherSuitesIntersection, "cipherSuitesIntersection");
        Builder b = builder.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        t.f(tlsVersionsIntersection, "tlsVersionsIntersection");
        return b.i((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final boolean h() {
        return this.b;
    }

    public int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int hashCode = (527 + (strArr == null ? 0 : Arrays.hashCode(strArr))) * 31;
        String[] strArr2 = this.d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(TlsVersion.b.a(str));
        }
        return D.L0(arrayList);
    }

    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }

    public static final class Builder {
        public boolean a;
        public String[] b;
        public String[] c;
        public boolean d;

        public Builder(boolean z) {
            this.a = z;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.a, this.d, this.b, this.c);
        }

        public final Builder b(String... cipherSuites) {
            t.g(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            e((String[]) cipherSuites.clone());
            return this;
        }

        public final Builder c(CipherSuite... cipherSuites) {
            t.g(cipherSuites, "cipherSuites");
            if (!d()) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.c());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final boolean d() {
            return this.a;
        }

        public final void e(String[] strArr) {
            this.b = strArr;
        }

        public final void f(boolean z) {
            this.d = z;
        }

        public final void g(String[] strArr) {
            this.c = strArr;
        }

        public final Builder h(boolean z) {
            if (!d()) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            f(z);
            return this;
        }

        public final Builder i(String... tlsVersions) {
            t.g(tlsVersions, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            g((String[]) tlsVersions.clone());
            return this;
        }

        public final Builder j(TlsVersion... tlsVersions) {
            t.g(tlsVersions, "tlsVersions");
            if (!d()) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (TlsVersion tlsVersion : tlsVersions) {
                arrayList.add(tlsVersion.b());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            String[] strArr = (String[]) array;
            return i((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public Builder(ConnectionSpec connectionSpec) {
            t.g(connectionSpec, "connectionSpec");
            this.a = connectionSpec.f();
            this.b = ConnectionSpec.a(connectionSpec);
            this.c = ConnectionSpec.b(connectionSpec);
            this.d = connectionSpec.h();
        }
    }
}
