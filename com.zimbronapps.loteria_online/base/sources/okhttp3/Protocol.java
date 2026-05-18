package okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion b = new Companion(null);
    public final String a;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Protocol a(String protocol) {
            t.g(protocol, "protocol");
            Protocol protocol2 = Protocol.HTTP_1_0;
            if (!t.c(protocol, Protocol.b(protocol2))) {
                protocol2 = Protocol.HTTP_1_1;
                if (!t.c(protocol, Protocol.b(protocol2))) {
                    protocol2 = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!t.c(protocol, Protocol.b(protocol2))) {
                        protocol2 = Protocol.HTTP_2;
                        if (!t.c(protocol, Protocol.b(protocol2))) {
                            protocol2 = Protocol.SPDY_3;
                            if (!t.c(protocol, Protocol.b(protocol2))) {
                                protocol2 = Protocol.QUIC;
                                if (!t.c(protocol, Protocol.b(protocol2))) {
                                    throw new IOException(t.o("Unexpected protocol: ", protocol));
                                }
                            }
                        }
                    }
                }
            }
            return protocol2;
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.a = str;
    }

    public static final /* synthetic */ String b(Protocol protocol) {
        return protocol.a;
    }

    public String toString() {
        return this.a;
    }
}
