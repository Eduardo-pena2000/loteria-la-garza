package bb;

import Za.B;
import Za.e;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import w.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b implements Serializable {
    public static final a c = new a(null);
    public static final b d = new b(0, 0);
    public static final Comparator e = new bb.a();
    public final long a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final b a(long j, long j2) {
            return (j == 0 && j2 == 0) ? b() : new b(j, j2);
        }

        public final b b() {
            return b.c();
        }

        public final b c(String uuidString) {
            t.g(uuidString, "uuidString");
            if (uuidString.length() != 36) {
                throw new IllegalArgumentException("Expected a 36-char string in the standard uuid format.");
            }
            long f = e.f(uuidString, 0, 8, null, 4, null);
            d.a(uuidString, 8);
            long f2 = e.f(uuidString, 9, 13, null, 4, null);
            d.a(uuidString, 13);
            long f3 = e.f(uuidString, 14, 18, null, 4, null);
            d.a(uuidString, 18);
            long f4 = e.f(uuidString, 19, 23, null, 4, null);
            d.a(uuidString, 23);
            return a((f << 32) | (f2 << 16) | f3, e.f(uuidString, 24, 36, null, 4, null) | (f4 << 48));
        }

        public a() {
        }
    }

    public b(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static /* synthetic */ int a(b bVar, b bVar2) {
        return b(bVar, bVar2);
    }

    public static final int b(b a2, b b) {
        t.g(a2, "a");
        t.g(b, "b");
        long j = a2.a;
        return j != b.a ? C.a(Ca.C.b(j), Ca.C.b(b.a)) : C.a(Ca.C.b(a2.b), Ca.C.b(b.b));
    }

    public static final /* synthetic */ b c() {
        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public int hashCode() {
        long j = this.a ^ this.b;
        return ((int) j) ^ ((int) (j >> 32));
    }

    public String toString() {
        byte[] bArr = new byte[36];
        d.b(this.b, bArr, 24, 6);
        bArr[23] = 45;
        d.b(this.b >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        d.b(this.a, bArr, 14, 2);
        bArr[13] = 45;
        d.b(this.a >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        d.b(this.a >>> 32, bArr, 0, 4);
        return B.v(bArr);
    }
}
