package B;

import b0.C0;
import b0.U1;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i {
    public final C0 a;

    public static abstract class a {

        public static final class a extends a {
            public static final a a = new a();

            public a() {
                super(null);
            }

            public String toString() {
                return "Closed";
            }
        }

        public static final class b extends a {
            public final long a;

            public /* synthetic */ b(long j, kotlin.jvm.internal.k kVar) {
                this(j);
            }

            public final long a() {
                return this.a;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj instanceof b) {
                    return u0.f.j(this.a, ((b) obj).a);
                }
                return false;
            }

            public int hashCode() {
                return u0.f.o(this.a);
            }

            public String toString() {
                return "Open(offset=" + u0.f.s(this.a) + ')';
            }

            public b(long j) {
                super(null);
                this.a = j;
                if (!u0.g.b(j)) {
                    throw new IllegalStateException("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
                }
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public i(a aVar) {
        this.a = U1.i(aVar, null, 2, null);
    }

    public final a a() {
        return (a) this.a.getValue();
    }

    public final void b(a aVar) {
        this.a.setValue(aVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return t.c(((i) obj).a(), a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ i(a aVar, int i, kotlin.jvm.internal.k kVar) {
        this((i & 1) != 0 ? a.a.a : aVar);
    }
}
