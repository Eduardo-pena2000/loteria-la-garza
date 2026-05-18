package l1;

import n1.w;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public static final a c = new a(null);
    public static final s d = new s(0, 0, 3, null);
    public final long a;
    public final long b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final s a() {
            return s.a();
        }

        public a() {
        }
    }

    public /* synthetic */ s(long j, long j2, kotlin.jvm.internal.k kVar) {
        this(j, j2);
    }

    public static final /* synthetic */ s a() {
        return d;
    }

    public final long b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return n1.v.e(this.a, sVar.a) && n1.v.e(this.b, sVar.b);
    }

    public int hashCode() {
        return (n1.v.i(this.a) * 31) + n1.v.i(this.b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + n1.v.j(this.a) + ", restLine=" + n1.v.j(this.b) + ')';
    }

    public s(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public /* synthetic */ s(long j, long j2, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? w.f(0) : j, (i & 2) != 0 ? w.f(0) : j2, null);
    }
}
