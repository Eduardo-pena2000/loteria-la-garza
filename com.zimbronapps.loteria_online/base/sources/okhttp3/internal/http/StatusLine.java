package okhttp3.internal.http;

import Za.B;
import java.net.ProtocolException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Protocol;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StatusLine {
    public static final Companion d = new Companion(null);
    public final Protocol a;
    public final int b;
    public final String c;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final StatusLine a(String statusLine) {
            Protocol protocol;
            int i;
            String str;
            t.g(statusLine, "statusLine");
            if (B.N(statusLine, "HTTP/1.", false, 2, null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.HTTP_1_0;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
                    }
                    protocol = Protocol.HTTP_1_1;
                }
            } else {
                if (!B.N(statusLine, "ICY ", false, 2, null)) {
                    throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
                }
                protocol = Protocol.HTTP_1_0;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
            }
            try {
                String substring = statusLine.substring(i, i2);
                t.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i2) {
                    str = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
                    }
                    str = statusLine.substring(i + 4);
                    t.f(str, "this as java.lang.String).substring(startIndex)");
                }
                return new StatusLine(protocol, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(t.o("Unexpected status line: ", statusLine));
            }
        }

        private Companion() {
        }
    }

    public StatusLine(Protocol protocol, int i, String message) {
        t.g(protocol, "protocol");
        t.g(message, "message");
        this.a = protocol;
        this.b = i;
        this.c = message;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
