package com.applovin.shadow.okhttp3.internal.http;

import Za.B;
import com.applovin.shadow.okhttp3.Protocol;
import com.applovin.shadow.okhttp3.Response;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final StatusLine get(Response response) {
            t.g(response, "response");
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws IOException {
            Protocol protocol;
            int i;
            String str2;
            t.g(str, "statusLine");
            if (B.N(str, "HTTP/1.", false, 2, (Object) null)) {
                i = 9;
                if (str.length() < 9 || str.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!B.N(str, "ICY ", false, 2, (Object) null)) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (str.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            try {
                String substring = str.substring(i, i2);
                t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i2) {
                    str2 = "";
                } else {
                    if (str.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                    str2 = str.substring(i + 4);
                    t.f(str2, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        t.g(protocol, "protocol");
        t.g(str, "message");
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
