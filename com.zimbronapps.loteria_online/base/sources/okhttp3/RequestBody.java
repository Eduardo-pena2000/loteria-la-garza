package okhttp3;

import Za.c;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class RequestBody {
    public static final Companion a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ RequestBody f(Companion companion, MediaType mediaType, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return companion.d(mediaType, bArr, i, i2);
        }

        public static /* synthetic */ RequestBody g(Companion companion, byte[] bArr, MediaType mediaType, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                mediaType = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return companion.e(bArr, mediaType, i, i2);
        }

        public final RequestBody a(String str, MediaType mediaType) {
            t.g(str, "<this>");
            Charset charset = c.b;
            if (mediaType != null) {
                Charset d = MediaType.d(mediaType, null, 1, null);
                if (d == null) {
                    mediaType = MediaType.e.b(mediaType + "; charset=utf-8");
                } else {
                    charset = d;
                }
            }
            byte[] bytes = str.getBytes(charset);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            return e(bytes, mediaType, 0, bytes.length);
        }

        public final RequestBody b(MediaType mediaType, String content) {
            t.g(content, "content");
            return a(content, mediaType);
        }

        public final RequestBody c(MediaType mediaType, byte[] content) {
            t.g(content, "content");
            return f(this, mediaType, content, 0, 0, 12, null);
        }

        public final RequestBody d(MediaType mediaType, byte[] content, int i, int i2) {
            t.g(content, "content");
            return e(content, mediaType, i, i2);
        }

        public final RequestBody e(byte[] bArr, MediaType mediaType, int i, int i2) {
            t.g(bArr, "<this>");
            Util.l(bArr.length, i, i2);
            return new RequestBody$Companion$toRequestBody$2(mediaType, i2, bArr, i);
        }

        private Companion() {
        }
    }

    public static final RequestBody c(MediaType mediaType, String str) {
        return a.b(mediaType, str);
    }

    public static final RequestBody d(MediaType mediaType, byte[] bArr) {
        return a.c(mediaType, bArr);
    }

    public long a() {
        return -1L;
    }

    public abstract MediaType b();

    public boolean e() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public abstract void g(f fVar);
}
