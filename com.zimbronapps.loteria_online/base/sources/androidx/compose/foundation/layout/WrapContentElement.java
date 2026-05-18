package androidx.compose.foundation.layout;

import F.m0;
import F.s;
import O0.Y;
import P0.N0;
import Qa.p;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.n;
import n1.o;
import n1.r;
import n1.t;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class WrapContentElement extends Y {
    public static final a g = new a(null);
    public final s b;
    public final boolean c;
    public final p d;
    public final Object e;
    public final String f;

    public static final class a {

        public static final class a extends u implements p {
            public final /* synthetic */ e.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e.c cVar) {
                super(2);
                this.a = cVar;
            }

            public final long a(long j, t tVar) {
                return o.a(0, this.a.a(0, r.f(j)));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.c(a(((r) obj).j(), (t) obj2));
            }
        }

        public static final class b extends u implements p {
            public final /* synthetic */ o0.e a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(o0.e eVar) {
                super(2);
                this.a = eVar;
            }

            public final long a(long j, t tVar) {
                return this.a.a(r.b.a(), j, tVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.c(a(((r) obj).j(), (t) obj2));
            }
        }

        public static final class c extends u implements p {
            public final /* synthetic */ e.b a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(e.b bVar) {
                super(2);
                this.a = bVar;
            }

            public final long a(long j, t tVar) {
                return o.a(this.a.a(0, r.g(j), tVar), 0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return n.c(a(((r) obj).j(), (t) obj2));
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final WrapContentElement a(e.c cVar, boolean z) {
            return new WrapContentElement(s.Vertical, z, new a(cVar), cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(o0.e eVar, boolean z) {
            return new WrapContentElement(s.Both, z, new b(eVar), eVar, "wrapContentSize");
        }

        public final WrapContentElement c(e.b bVar, boolean z) {
            return new WrapContentElement(s.Horizontal, z, new c(bVar), bVar, "wrapContentWidth");
        }

        public a() {
        }
    }

    public WrapContentElement(s sVar, boolean z, p pVar, Object obj, String str) {
        this.b = sVar;
        this.c = z;
        this.d = pVar;
        this.e = obj;
        this.f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.b == wrapContentElement.b && this.c == wrapContentElement.c && kotlin.jvm.internal.t.c(this.e, wrapContentElement.e);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public m0 create() {
        return new m0(this.b, this.c, this.d);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(m0 m0Var) {
        m0Var.G1(this.b);
        m0Var.H1(this.c);
        m0Var.F1(this.d);
    }

    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + this.e.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d(this.f);
        n0.b().c("align", this.e);
        n0.b().c("unbounded", Boolean.valueOf(this.c));
    }
}
