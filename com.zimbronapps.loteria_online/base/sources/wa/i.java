package Wa;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i extends g implements f {
    public static final a e = new a(null);
    public static final i f = new i(1, 0);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final i a() {
            return i.k();
        }

        public a() {
        }
    }

    public i(int i, int i2) {
        super(i, i2, 1);
    }

    public static final /* synthetic */ i k() {
        return f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (f() != iVar.f() || g() != iVar.g()) {
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
        return (f() * 31) + g();
    }

    public boolean isEmpty() {
        return f() > g();
    }

    public boolean m(int i) {
        return f() <= i && i <= g();
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        return Integer.valueOf(g());
    }

    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer b() {
        return Integer.valueOf(f());
    }

    public String toString() {
        return f() + ".." + g();
    }
}
