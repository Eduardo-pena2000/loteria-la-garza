package com.applovin.shadow.okhttp3;

import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            t.g(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                protocol = Protocol.HTTP_1_1;
                if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                        protocol = Protocol.HTTP_2;
                        if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                            protocol = Protocol.SPDY_3;
                            if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                                protocol = Protocol.QUIC;
                                if (!t.c(str, Protocol.access$getProtocol$p(protocol))) {
                                    throw new IOException("Unexpected protocol: " + str);
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final /* synthetic */ String access$getProtocol$p(Protocol protocol) {
        return protocol.protocol;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    public String toString() {
        return this.protocol;
    }
}
