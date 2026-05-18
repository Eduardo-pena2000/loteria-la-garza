package okhttp3;

import Ca.I;
import Za.c;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.e;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion a = new Companion(null);

    public static final class BomAwareReader extends Reader {
        public final g a;
        public final Charset b;
        public boolean c;
        public Reader d;

        public void close() {
            I i;
            this.c = true;
            Reader reader = this.d;
            if (reader == null) {
                i = null;
            } else {
                reader.close();
                i = I.a;
            }
            if (i == null) {
                this.a.close();
            }
        }

        public int read(char[] cbuf, int i, int i2) {
            t.g(cbuf, "cbuf");
            if (this.c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.d;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.a.inputStream(), Util.J(this.a, this.b));
                this.d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i, i2);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ ResponseBody c(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.b(bArr, mediaType);
        }

        public final ResponseBody a(g gVar, MediaType mediaType, long j) {
            t.g(gVar, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(mediaType, j, gVar);
        }

        public final ResponseBody b(byte[] bArr, MediaType mediaType) {
            t.g(bArr, "<this>");
            return a(new e().write(bArr), mediaType, bArr.length);
        }

        private Companion() {
        }
    }

    public final Charset a() {
        MediaType c = c();
        Charset c2 = c == null ? null : c.c(c.b);
        return c2 == null ? c.b : c2;
    }

    public abstract long b();

    public abstract MediaType c();

    public void close() {
        Util.m(d());
    }

    public abstract g d();

    public final String f() {
        g d = d();
        try {
            String readString = d.readString(Util.J(d, a()));
            Na.c.a(d, null);
            return readString;
        } finally {
        }
    }
}
