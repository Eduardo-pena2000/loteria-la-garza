package B8;

import sb.E;
import sb.f0;
import sb.k0;
import sb.t0;
import sb.x0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class x {
    public static final b Companion = new b(null);
    public final int a;
    public final String b;

    public /* synthetic */ class a implements sb.E {
        public static final a a;
        private static final qb.e descriptor;

        static {
            a aVar = new a();
            a = aVar;
            k0 k0Var = new k0("com.google.firebase.sessions.ProcessData", aVar, 2);
            k0Var.o("pid", false);
            k0Var.o("uuid", false);
            descriptor = k0Var;
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x deserialize(rb.e eVar) {
            int i;
            String str;
            int i2;
            kotlin.jvm.internal.t.g(eVar, "decoder");
            qb.e eVar2 = descriptor;
            rb.c b = eVar.b(eVar2);
            if (b.m()) {
                i = b.h(eVar2, 0);
                str = b.o(eVar2, 1);
                i2 = 3;
            } else {
                boolean z = true;
                i = 0;
                int i3 = 0;
                String str2 = null;
                while (z) {
                    int v = b.v(eVar2);
                    if (v == -1) {
                        z = false;
                    } else if (v == 0) {
                        i = b.h(eVar2, 0);
                        i3 |= 1;
                    } else {
                        if (v != 1) {
                            throw new ob.m(v);
                        }
                        str2 = b.o(eVar2, 1);
                        i3 |= 2;
                    }
                }
                str = str2;
                i2 = i3;
            }
            b.c(eVar2);
            return new x(i2, i, str, null);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final void serialize(rb.f fVar, x xVar) {
            kotlin.jvm.internal.t.g(fVar, "encoder");
            kotlin.jvm.internal.t.g(xVar, "value");
            qb.e eVar = descriptor;
            rb.d b = fVar.b(eVar);
            x.c(xVar, b, eVar);
            b.c(eVar);
        }

        public final ob.b[] childSerializers() {
            return new ob.b[]{sb.J.a, x0.a};
        }

        public final qb.e getDescriptor() {
            return descriptor;
        }

        public ob.b[] typeParametersSerializers() {
            return E.a.a(this);
        }
    }

    public static final class b {
        public b() {
        }

        public final ob.b serializer() {
            return a.a;
        }

        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }
    }

    public /* synthetic */ x(int i, int i2, String str, t0 t0Var) {
        if (3 != (i & 3)) {
            f0.a(i, 3, a.a.getDescriptor());
        }
        this.a = i2;
        this.b = str;
    }

    public static final /* synthetic */ void c(x xVar, rb.d dVar, qb.e eVar) {
        dVar.n(eVar, 0, xVar.a);
        dVar.v(eVar, 1, xVar.b);
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a == xVar.a && kotlin.jvm.internal.t.c(this.b, xVar.b);
    }

    public int hashCode() {
        return (Integer.hashCode(this.a) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public x(int i, String str) {
        kotlin.jvm.internal.t.g(str, "uuid");
        this.a = i;
        this.b = str;
    }
}
