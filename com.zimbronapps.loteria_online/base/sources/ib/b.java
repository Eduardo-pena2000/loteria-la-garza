package ib;

import Ca.s;
import Ca.t;
import Ga.e;
import Ga.i;
import Ha.c;
import Ia.h;
import Qa.p;
import cb.C;
import cb.I0;
import cb.a1;
import hb.K;
import hb.z;
import kotlin.jvm.internal.V;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        e a = h.a(eVar);
        try {
            i context = a.getContext();
            Object i = K.i(context, null);
            try {
                h.b(a);
                Object d = !(pVar instanceof Ia.a) ? Ha.b.d(pVar, obj, a) : ((p) V.e(pVar, 2)).invoke(obj, a);
                K.f(context, i);
                if (d != c.f()) {
                    a.resumeWith(s.b(d));
                }
            } catch (Throwable th) {
                K.f(context, i);
                throw th;
            }
        } catch (Throwable th2) {
            s.a aVar = s.b;
            a.resumeWith(s.b(t.a(th2)));
        }
    }

    public static final Object b(z zVar, Object obj, p pVar) {
        Object c;
        try {
            c = !(pVar instanceof Ia.a) ? Ha.b.d(pVar, obj, zVar) : ((p) V.e(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c = new C(th, false, 2, null);
        }
        if (c == c.f()) {
            return c.f();
        }
        Object o0 = zVar.o0(c);
        if (o0 == I0.b) {
            return c.f();
        }
        if (o0 instanceof C) {
            throw ((C) o0).a;
        }
        return I0.h(o0);
    }

    public static final Object c(z zVar, Object obj, p pVar) {
        Object c;
        try {
            c = !(pVar instanceof Ia.a) ? Ha.b.d(pVar, obj, zVar) : ((p) V.e(pVar, 2)).invoke(obj, zVar);
        } catch (Throwable th) {
            c = new C(th, false, 2, null);
        }
        if (c == c.f()) {
            return c.f();
        }
        Object o0 = zVar.o0(c);
        if (o0 == I0.b) {
            return c.f();
        }
        if (o0 instanceof C) {
            a1 a1Var = ((C) o0).a;
            if (!(a1Var instanceof a1)) {
                throw a1Var;
            }
            if (a1Var.a != zVar) {
                throw a1Var;
            }
            if (c instanceof C) {
                throw ((C) c).a;
            }
        } else {
            c = I0.h(o0);
        }
        return c;
    }
}
