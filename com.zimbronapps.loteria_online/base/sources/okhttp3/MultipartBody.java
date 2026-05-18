package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.MediaType;
import xb.e;
import xb.f;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MultipartBody extends RequestBody {
    public static final Companion f = new Companion(null);
    public static final MediaType g;
    public static final MediaType h;
    public static final MediaType i;
    public static final MediaType j;
    public static final MediaType k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public final h b;
    public final List c;
    public final MediaType d;
    public long e;

    public static final class Builder {
        public final h a;
        public MediaType b;
        public final List c;

        public Builder() {
            this(null, 1, null);
        }

        public Builder(String boundary) {
            t.g(boundary, "boundary");
            this.a = h.d.d(boundary);
            this.b = MultipartBody.g;
            this.c = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Builder(String str, int i, k kVar) {
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                t.f(str, "randomUUID().toString()");
            }
            this(str);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Part {
        public static final Companion c = new Companion(null);
        public final Headers a;
        public final RequestBody b;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            private Companion() {
            }
        }

        public final RequestBody a() {
            return this.b;
        }

        public final Headers b() {
            return this.a;
        }
    }

    static {
        MediaType.Companion companion = MediaType.e;
        g = companion.a("multipart/mixed");
        h = companion.a("multipart/alternative");
        i = companion.a("multipart/digest");
        j = companion.a("multipart/parallel");
        k = companion.a("multipart/form-data");
        l = new byte[]{58, 32};
        m = new byte[]{13, 10};
        n = new byte[]{45, 45};
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long h(f fVar, boolean z) {
        e eVar;
        if (z) {
            fVar = new e();
            eVar = fVar;
        } else {
            eVar = 0;
        }
        int size = this.c.size();
        long j2 = 0;
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Part part = (Part) this.c.get(i2);
            Headers b = part.b();
            RequestBody a = part.a();
            t.d(fVar);
            fVar.write(n);
            fVar.m0(this.b);
            fVar.write(m);
            if (b != null) {
                int size2 = b.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    fVar.writeUtf8(b.e(i4)).write(l).writeUtf8(b.h(i4)).write(m);
                }
            }
            MediaType b2 = a.b();
            if (b2 != null) {
                fVar.writeUtf8("Content-Type: ").writeUtf8(b2.toString()).write(m);
            }
            long a2 = a.a();
            if (a2 != -1) {
                fVar.writeUtf8("Content-Length: ").writeDecimalLong(a2).write(m);
            } else if (z) {
                t.d(eVar);
                eVar.a();
                return -1L;
            }
            byte[] bArr = m;
            fVar.write(bArr);
            if (z) {
                j2 += a2;
            } else {
                a.g(fVar);
            }
            fVar.write(bArr);
            i2 = i3;
        }
        t.d(fVar);
        byte[] bArr2 = n;
        fVar.write(bArr2);
        fVar.m0(this.b);
        fVar.write(bArr2);
        fVar.write(m);
        if (!z) {
            return j2;
        }
        t.d(eVar);
        long A = j2 + eVar.A();
        eVar.a();
        return A;
    }

    public long a() {
        long j2 = this.e;
        if (j2 != -1) {
            return j2;
        }
        long h2 = h(null, true);
        this.e = h2;
        return h2;
    }

    public MediaType b() {
        return this.d;
    }

    public void g(f sink) {
        t.g(sink, "sink");
        h(sink, false);
    }
}
