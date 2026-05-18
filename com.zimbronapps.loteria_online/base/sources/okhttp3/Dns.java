package okhttp3;

import Da.r;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Dns {
    public static final Companion a = Companion.a;
    public static final Dns b = new Companion.DnsSystem();

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static final class DnsSystem implements Dns {
            public List lookup(String hostname) {
                t.g(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    t.f(allByName, "getAllByName(hostname)");
                    return r.S0(allByName);
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(t.o("Broken system behaviour for dns lookup of ", hostname));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List lookup(String str);
}
