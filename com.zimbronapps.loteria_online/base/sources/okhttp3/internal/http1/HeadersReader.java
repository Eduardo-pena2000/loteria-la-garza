package okhttp3.internal.http1;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.Headers;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HeadersReader {
    public static final Companion c = new Companion(null);
    public final g a;
    public long b;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(g source) {
        t.g(source, "source");
        this.a = source;
        this.b = 262144L;
    }

    public final Headers a() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String b = b();
            if (b.length() == 0) {
                return builder.e();
            }
            builder.b(b);
        }
    }

    public final String b() {
        String readUtf8LineStrict = this.a.readUtf8LineStrict(this.b);
        this.b -= readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }
}
