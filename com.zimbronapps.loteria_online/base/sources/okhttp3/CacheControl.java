package okhttp3;

import Za.E;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CacheControl {
    public static final Companion n = new Companion(null);
    public static final CacheControl o = new Builder().d().a();
    public static final CacheControl p = new Builder().f().c(Integer.MAX_VALUE, TimeUnit.SECONDS).a();
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    public static final class Builder {
        public boolean a;
        public boolean b;
        public int c = -1;
        public int d = -1;
        public int e = -1;
        public boolean f;
        public boolean g;
        public boolean h;

        public final CacheControl a() {
            return new CacheControl(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.g, this.h, null, null);
        }

        public final int b(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final Builder c(int i, TimeUnit timeUnit) {
            t.g(timeUnit, "timeUnit");
            if (i < 0) {
                throw new IllegalArgumentException(t.o("maxStale < 0: ", Integer.valueOf(i)).toString());
            }
            this.d = b(timeUnit.toSeconds(i));
            return this;
        }

        public final Builder d() {
            this.a = true;
            return this;
        }

        public final Builder e() {
            this.b = true;
            return this;
        }

        public final Builder f() {
            this.f = true;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (E.S(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl b(okhttp3.Headers r31) {
            /*
                Method dump skipped, instructions count: 409
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.b(okhttp3.Headers):okhttp3.CacheControl");
        }

        private Companion() {
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, k kVar) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public final boolean a() {
        return this.l;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean c() {
        return this.f;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.h;
    }

    public final int f() {
        return this.i;
    }

    public final boolean g() {
        return this.g;
    }

    public final boolean h() {
        return this.a;
    }

    public final boolean i() {
        return this.b;
    }

    public final boolean j() {
        return this.k;
    }

    public final boolean k() {
        return this.j;
    }

    public final int l() {
        return this.d;
    }

    public String toString() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (h()) {
            sb.append("no-cache, ");
        }
        if (i()) {
            sb.append("no-store, ");
        }
        if (d() != -1) {
            sb.append("max-age=");
            sb.append(d());
            sb.append(", ");
        }
        if (l() != -1) {
            sb.append("s-maxage=");
            sb.append(l());
            sb.append(", ");
        }
        if (b()) {
            sb.append("private, ");
        }
        if (c()) {
            sb.append("public, ");
        }
        if (g()) {
            sb.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb.append("max-stale=");
            sb.append(e());
            sb.append(", ");
        }
        if (f() != -1) {
            sb.append("min-fresh=");
            sb.append(f());
            sb.append(", ");
        }
        if (k()) {
            sb.append("only-if-cached, ");
        }
        if (j()) {
            sb.append("no-transform, ");
        }
        if (a()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        this.m = sb2;
        return sb2;
    }

    public CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }
}
