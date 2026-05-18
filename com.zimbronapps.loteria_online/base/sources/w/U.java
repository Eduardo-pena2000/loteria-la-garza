package W;

import Ca.I;
import Da.D;
import cb.O;
import cb.Q;
import java.util.ArrayList;
import java.util.List;
import v0.q0;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class u {
    public final boolean a;
    public final Qa.a b;
    public final z.a c = z.b.b(0.0f, 0.0f, 2, null);
    public final List d = new ArrayList();
    public E.j e;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ float c;
        public final /* synthetic */ z.i d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, z.i iVar, Ga.e eVar) {
            super(2, eVar);
            this.c = f;
            this.d = iVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return u.this.new a(this.c, this.d, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                z.a a = u.a(u.this);
                Float c = Ia.b.c(this.c);
                z.i iVar = this.d;
                this.a = 1;
                if (z.a.f(a, c, iVar, null, null, this, 12, null) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ z.i c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(z.i iVar, Ga.e eVar) {
            super(2, eVar);
            this.c = iVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return u.this.new b(this.c, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                Ca.t.b(obj);
                z.a a = u.a(u.this);
                Float c = Ia.b.c(0.0f);
                z.i iVar = this.c;
                this.a = 1;
                if (z.a.f(a, c, iVar, null, null, this, 12, null) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Ca.t.b(obj);
            }
            return I.a;
        }
    }

    public u(boolean z, Qa.a aVar) {
        this.a = z;
        this.b = aVar;
    }

    public static final /* synthetic */ z.a a(u uVar) {
        return uVar.c;
    }

    public final void b(x0.f fVar, float f, long j) {
        float floatValue = ((Number) this.c.m()).floatValue();
        if (floatValue > 0.0f) {
            long q = r0.q(j, floatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.a) {
                x0.f.I(fVar, q, f, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float i = u0.l.i(fVar.e());
            float g = u0.l.g(fVar.e());
            int b2 = q0.a.b();
            x0.d m1 = fVar.m1();
            long e = m1.e();
            m1.f().s();
            m1.d().c(0.0f, 0.0f, i, g, b2);
            x0.f.I(fVar, q, f, 0L, 0.0f, null, null, 0, 124, null);
            m1.f().k();
            m1.g(e);
        }
    }

    public final void c(E.j jVar, O o) {
        boolean z = jVar instanceof E.g;
        if (z) {
            this.d.add(jVar);
        } else if (jVar instanceof E.h) {
            this.d.remove(((E.h) jVar).a());
        } else if (jVar instanceof E.d) {
            this.d.add(jVar);
        } else if (jVar instanceof E.e) {
            this.d.remove(((E.e) jVar).a());
        } else if (jVar instanceof E.b) {
            this.d.add(jVar);
        } else if (jVar instanceof E.c) {
            this.d.remove(((E.c) jVar).a());
        } else if (!(jVar instanceof E.a)) {
            return;
        } else {
            this.d.remove(((E.a) jVar).a());
        }
        E.j jVar2 = (E.j) D.q0(this.d);
        if (kotlin.jvm.internal.t.c(this.e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            g gVar = (g) this.b.invoke();
            cb.i.d(o, (Ga.i) null, (Q) null, new a(z ? gVar.c() : jVar instanceof E.d ? gVar.b() : jVar instanceof E.b ? gVar.a() : 0.0f, p.a(jVar2), null), 3, (Object) null);
        } else {
            cb.i.d(o, (Ga.i) null, (Q) null, new b(p.b(this.e), null), 3, (Object) null);
        }
        this.e = jVar2;
    }
}
