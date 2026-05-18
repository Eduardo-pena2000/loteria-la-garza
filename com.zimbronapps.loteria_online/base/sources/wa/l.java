package Wa;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class l extends j implements f {
    public static final a e = new a(null);
    public static final l f = new l(1, 0);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public l(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof l) {
            if (!isEmpty() || !((l) obj).isEmpty()) {
                l lVar = (l) obj;
                if (f() != lVar.f() || g() != lVar.g()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (f() ^ (f() >>> 32))) + (g() ^ (g() >>> 32)));
    }

    public boolean isEmpty() {
        return f() > g();
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Long e() {
        return Long.valueOf(g());
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Long b() {
        return Long.valueOf(f());
    }

    public String toString() {
        return f() + ".." + g();
    }
}
