package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import xb.e;
import xb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FormBody extends RequestBody {
    public static final Companion d = new Companion(null);
    public static final MediaType e = MediaType.e.a("application/x-www-form-urlencoded");
    public final List b;
    public final List c;

    public static final class Builder {
        public final Charset a;
        public final List b;
        public final List c;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(Charset charset) {
            this.a = charset;
            this.b = new ArrayList();
            this.c = new ArrayList();
        }

        public /* synthetic */ Builder(Charset charset, int i, k kVar) {
            this((i & 1) != 0 ? null : charset);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public long a() {
        return h(null, true);
    }

    public MediaType b() {
        return e;
    }

    public void g(f sink) {
        t.g(sink, "sink");
        h(sink, false);
    }

    public final long h(f fVar, boolean z) {
        e buffer;
        if (z) {
            buffer = new e();
        } else {
            t.d(fVar);
            buffer = fVar.getBuffer();
        }
        int size = this.b.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i > 0) {
                buffer.writeByte(38);
            }
            buffer.writeUtf8((String) this.b.get(i));
            buffer.writeByte(61);
            buffer.writeUtf8((String) this.c.get(i));
            i = i2;
        }
        if (!z) {
            return 0L;
        }
        long A = buffer.A();
        buffer.a();
        return A;
    }
}
