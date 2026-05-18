package Wa;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c extends Wa.a implements f {
    public static final a e = new a(null);
    public static final c f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public c(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (f() != cVar.f() || g() != cVar.g()) {
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
        return t.h(f(), g()) > 0;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Character e() {
        return Character.valueOf(g());
    }

    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Character b() {
        return Character.valueOf(f());
    }

    public String toString() {
        return f() + ".." + g();
    }
}
