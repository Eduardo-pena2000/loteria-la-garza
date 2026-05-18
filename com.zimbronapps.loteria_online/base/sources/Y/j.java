package y;

import v0.r0;
import v0.s0;
import z.u0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final Qa.l a = a.a;

    public static final class a extends kotlin.jvm.internal.u implements Qa.l {
        public static final a a = new a();

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public static final a a = new a();

            public a() {
                super(1);
            }

            public final z.p a(long j) {
                long o = r0.o(j, w0.k.a.D());
                return new z.p(r0.t(o), r0.x(o), r0.w(o), r0.u(o));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return a(((r0) obj).A());
            }
        }

        public static final class b extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ w0.c a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(w0.c cVar) {
                super(1);
                this.a = cVar;
            }

            public final long a(z.p pVar) {
                float g = pVar.g();
                if (g < 0.0f) {
                    g = 0.0f;
                }
                if (g > 1.0f) {
                    g = 1.0f;
                }
                float h = pVar.h();
                if (h < -0.5f) {
                    h = -0.5f;
                }
                if (h > 0.5f) {
                    h = 0.5f;
                }
                float i = pVar.i();
                float f = i >= -0.5f ? i : -0.5f;
                float f2 = f <= 0.5f ? f : 0.5f;
                float f3 = pVar.f();
                float f4 = f3 >= 0.0f ? f3 : 0.0f;
                return r0.o(s0.a(g, h, f2, f4 <= 1.0f ? f4 : 1.0f, w0.k.a.D()), this.a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r0.m(a((z.p) obj));
            }
        }

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z.s0 invoke(w0.c cVar) {
            return u0.a(a.a, new b(cVar));
        }
    }

    public static final Qa.l a(r0.a aVar) {
        return a;
    }
}
