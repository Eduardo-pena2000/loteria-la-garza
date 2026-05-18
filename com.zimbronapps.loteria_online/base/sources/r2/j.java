package R2;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final long h;
    public final String i;
    public final int j;
    public final Object k;

    public static final class b {
        public Uri a;
        public long b;
        public int c;
        public byte[] d;
        public Map e;
        public long f;
        public long g;
        public String h;
        public int i;
        public Object j;

        public /* synthetic */ b(j jVar, a aVar) {
            this(jVar);
        }

        public j a() {
            P2.a.i(this.a, "The uri must be set.");
            return new j(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public b b(int i) {
            this.i = i;
            return this;
        }

        public b c(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        public b d(int i) {
            this.c = i;
            return this;
        }

        public b e(Map map) {
            this.e = map;
            return this;
        }

        public b f(String str) {
            this.h = str;
            return this;
        }

        public b g(long j) {
            this.g = j;
            return this;
        }

        public b h(long j) {
            this.f = j;
            return this;
        }

        public b i(Uri uri) {
            this.a = uri;
            return this;
        }

        public b j(String str) {
            this.a = Uri.parse(str);
            return this;
        }

        public b() {
            this.c = 1;
            this.e = Collections.emptyMap();
            this.g = -1L;
        }

        public b(j jVar) {
            this.a = jVar.a;
            this.b = jVar.b;
            this.c = jVar.c;
            this.d = jVar.d;
            this.e = jVar.e;
            this.f = jVar.g;
            this.g = jVar.h;
            this.h = jVar.i;
            this.i = jVar.j;
            this.j = jVar.k;
        }
    }

    static {
        M2.v.a("media3.datasource");
    }

    public /* synthetic */ j(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj, a aVar) {
        this(uri, j, i, bArr, map, j2, j3, str, i2, obj);
    }

    public static String c(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b(this, null);
    }

    public final String b() {
        return c(this.c);
    }

    public boolean d(int i) {
        return (this.j & i) == i;
    }

    public j e(long j) {
        long j2 = this.h;
        return f(j, j2 != -1 ? j2 - j : -1L);
    }

    public j f(long j, long j2) {
        return (j == 0 && this.h == j2) ? this : new j(this.a, this.b, this.c, this.d, this.e, this.g + j, j2, this.i, this.j, this.k);
    }

    public String toString() {
        return "DataSpec[" + b() + " " + this.a + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + "]";
    }

    public j(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2, Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        P2.a.a(j4 >= 0);
        P2.a.a(j2 >= 0);
        P2.a.a(j3 > 0 || j3 == -1);
        this.a = (Uri) P2.a.e(uri);
        this.b = j;
        this.c = i;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.g = j2;
        this.f = j4;
        this.h = j3;
        this.i = str;
        this.j = i2;
        this.k = obj;
    }
}
