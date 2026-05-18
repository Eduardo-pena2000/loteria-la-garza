package okhttp3.internal.ws;

import Za.A;
import Za.B;
import Za.E;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebSocketExtensions {
    public static final Companion g = new Companion(null);
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final WebSocketExtensions a(Headers responseHeaders) {
            t.g(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            int i = 0;
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            while (i < size) {
                int i2 = i + 1;
                if (B.z(responseHeaders.e(i), "Sec-WebSocket-Extensions", true)) {
                    String h = responseHeaders.h(i);
                    int i3 = 0;
                    while (i3 < h.length()) {
                        int r = Util.r(h, ',', i3, 0, 4, null);
                        int p = Util.p(h, ';', i3, r);
                        String Z = Util.Z(h, i3, p);
                        int i4 = p + 1;
                        if (B.z(Z, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            i3 = i4;
                            while (i3 < r) {
                                int p2 = Util.p(h, ';', i3, r);
                                int p3 = Util.p(h, '=', i3, p2);
                                String Z2 = Util.Z(h, i3, p3);
                                String D0 = p3 < p2 ? E.D0(Util.Z(h, p3 + 1, p2), "\"") : null;
                                i3 = p2 + 1;
                                if (B.z(Z2, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = D0 == null ? null : A.p(D0);
                                    if (num == null) {
                                        z4 = true;
                                    }
                                } else if (B.z(Z2, "client_no_context_takeover", true)) {
                                    if (z2) {
                                        z4 = true;
                                    }
                                    if (D0 != null) {
                                        z4 = true;
                                    }
                                    z2 = true;
                                } else if (B.z(Z2, "server_max_window_bits", true)) {
                                    if (num2 != null) {
                                        z4 = true;
                                    }
                                    num2 = D0 == null ? null : A.p(D0);
                                    if (num2 == null) {
                                        z4 = true;
                                    }
                                } else if (B.z(Z2, "server_no_context_takeover", true)) {
                                    if (z3) {
                                        z4 = true;
                                    }
                                    if (D0 != null) {
                                        z4 = true;
                                    }
                                    z3 = true;
                                } else {
                                    z4 = true;
                                }
                            }
                            z = true;
                        } else {
                            i3 = i4;
                            z4 = true;
                        }
                    }
                }
                i = i2;
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public final boolean a(boolean z) {
        return z ? this.c : this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.a == webSocketExtensions.a && t.c(this.b, webSocketExtensions.b) && this.c == webSocketExtensions.c && t.c(this.d, webSocketExtensions.d) && this.e == webSocketExtensions.e && this.f == webSocketExtensions.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.b;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        ?? r2 = this.c;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.d;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.e;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.f;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.a + ", clientMaxWindowBits=" + this.b + ", clientNoContextTakeover=" + this.c + ", serverMaxWindowBits=" + this.d + ", serverNoContextTakeover=" + this.e + ", unknownValues=" + this.f + ')';
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, k kVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
