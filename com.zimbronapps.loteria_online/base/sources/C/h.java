package C;

import Ca.I;
import cb.O;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.L;
import z.m0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h implements n {
    public z.z a;
    public final o0.k b;
    public int c;

    public static final class a extends Ia.l implements Qa.p {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ float d;
        public final /* synthetic */ h e;
        public final /* synthetic */ u f;

        public static final class a extends kotlin.jvm.internal.u implements Qa.l {
            public final /* synthetic */ L a;
            public final /* synthetic */ u b;
            public final /* synthetic */ L c;
            public final /* synthetic */ h d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(L l, u uVar, L l2, h hVar) {
                super(1);
                this.a = l;
                this.b = uVar;
                this.c = l2;
                this.d = hVar;
            }

            public final void a(z.h hVar) {
                float floatValue = ((Number) hVar.e()).floatValue() - this.a.a;
                float a = this.b.a(floatValue);
                this.a.a = ((Number) hVar.e()).floatValue();
                this.c.a = ((Number) hVar.f()).floatValue();
                if (Math.abs(floatValue - a) > 0.5f) {
                    hVar.a();
                }
                h hVar2 = this.d;
                hVar2.g(hVar2.e() + 1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((z.h) obj);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, h hVar, u uVar, Ga.e eVar) {
            super(2, eVar);
            this.d = f;
            this.e = hVar;
            this.f = uVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.d, this.e, this.f, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            float f;
            L l;
            z.k kVar;
            z.z d;
            a aVar;
            Object f2 = Ha.c.f();
            int i = this.c;
            if (i == 0) {
                Ca.t.b(obj);
                if (Math.abs(this.d) > 1.0f) {
                    L l2 = new L();
                    l2.a = this.d;
                    L l3 = new L();
                    z.k c = z.l.c(0.0f, this.d, 0L, 0L, false, 28, null);
                    try {
                        d = this.e.d();
                        aVar = new a(l3, this.f, l2, this.e);
                        this.a = l2;
                        this.b = c;
                        this.c = 1;
                    } catch (CancellationException unused) {
                        l = l2;
                        kVar = c;
                        l.a = ((Number) kVar.g()).floatValue();
                        f = l.a;
                        return Ia.b.c(f);
                    }
                    if (m0.h(c, d, false, aVar, this, 2, null) == f2) {
                        return f2;
                    }
                    l = l2;
                    f = l.a;
                } else {
                    f = this.d;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (z.k) this.b;
                l = (L) this.a;
                try {
                    Ca.t.b(obj);
                } catch (CancellationException unused2) {
                    l.a = ((Number) kVar.g()).floatValue();
                    f = l.a;
                    return Ia.b.c(f);
                }
                f = l.a;
            }
            return Ia.b.c(f);
        }
    }

    public h(z.z zVar, o0.k kVar) {
        this.a = zVar;
        this.b = kVar;
    }

    public Object a(u uVar, float f, Ga.e eVar) {
        this.c = 0;
        return cb.i.g(this.b, new a(f, this, uVar, null), eVar);
    }

    public final z.z d() {
        return this.a;
    }

    public final int e() {
        return this.c;
    }

    public final void f(z.z zVar) {
        this.a = zVar;
    }

    public final void g(int i) {
        this.c = i;
    }

    public /* synthetic */ h(z.z zVar, o0.k kVar, int i, kotlin.jvm.internal.k kVar2) {
        this(zVar, (i & 2) != 0 ? androidx.compose.foundation.gestures.d.e() : kVar);
    }
}
