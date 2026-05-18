package okhttp3.internal.authenticator;

import Da.D;
import Za.B;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Address;
import okhttp3.Authenticator;
import okhttp3.Challenge;
import okhttp3.Credentials;
import okhttp3.Dns;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class JavaNetAuthenticator implements Authenticator {
    public final Dns d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            a = iArr;
        }
    }

    public JavaNetAuthenticator() {
        this(null, 1, null);
    }

    public Request a(Route route, Response response) {
        Address a;
        PasswordAuthentication requestPasswordAuthentication;
        t.g(response, "response");
        List<Challenge> d = response.d();
        Request A = response.A();
        HttpUrl j = A.j();
        boolean z = response.f() == 407;
        Proxy proxy = route == null ? null : route.b();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (Challenge challenge : d) {
            if (B.z("Basic", challenge.c(), true)) {
                Dns c = (route == null || (a = route.a()) == null) ? null : a.c();
                if (c == null) {
                    c = this.d;
                }
                if (z) {
                    InetSocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = address;
                    String hostName = inetSocketAddress.getHostName();
                    t.f(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(hostName, b(proxy, j, c), inetSocketAddress.getPort(), j.p(), challenge.b(), challenge.c(), j.r(), Authenticator.RequestorType.PROXY);
                } else {
                    String h = j.h();
                    t.f(proxy, "proxy");
                    requestPasswordAuthentication = java.net.Authenticator.requestPasswordAuthentication(h, b(proxy, j, c), j.l(), j.p(), challenge.b(), challenge.c(), j.r(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    t.f(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    t.f(password, "auth.password");
                    return A.i().f(str, Credentials.a(userName, new String(password), challenge.a())).b();
                }
            }
        }
        return null;
    }

    public final InetAddress b(Proxy proxy, HttpUrl httpUrl, Dns dns) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : WhenMappings.a[type.ordinal()]) == 1) {
            return (InetAddress) D.f0(dns.lookup(httpUrl.h()));
        }
        InetSocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address2 = address.getAddress();
        t.f(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    public JavaNetAuthenticator(Dns defaultDns) {
        t.g(defaultDns, "defaultDns");
        this.d = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(Dns dns, int i, k kVar) {
        this((i & 1) != 0 ? Dns.b : dns);
    }
}
