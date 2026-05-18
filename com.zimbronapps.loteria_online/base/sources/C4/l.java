package c4;

import Ca.I;
import Ca.t;
import Qa.p;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import cb.O;
import cb.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l extends b {
    public final MeasurementManager b;

    public static final class a extends Ia.l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, l lVar, Ga.e eVar) {
            super(2, eVar);
            this.c = lVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = new a(null, this.c, eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            throw null;
        }
    }

    public l(MeasurementManager measurementManager) {
        kotlin.jvm.internal.t.g(measurementManager, "mMeasurementManager");
        this.b = measurementManager;
    }

    public static /* synthetic */ Object h(l lVar, c4.a aVar, Ga.e eVar) {
        new cb.p(Ha.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    public static /* synthetic */ Object j(l lVar, Ga.e eVar) {
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        i.a(lVar.i(), new k(), P1.n.a(pVar));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w;
    }

    public static /* synthetic */ Object k(l lVar, Uri uri, InputEvent inputEvent, Ga.e eVar) {
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        j.a(lVar.i(), uri, inputEvent, new k(), P1.n.a(pVar));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : I.a;
    }

    public static /* synthetic */ Object l(l lVar, m mVar, Ga.e eVar) {
        Object e = P.e(new a(mVar, lVar, null), eVar);
        return e == Ha.c.f() ? e : I.a;
    }

    public static /* synthetic */ Object m(l lVar, Uri uri, Ga.e eVar) {
        cb.p pVar = new cb.p(Ha.b.c(eVar), 1);
        pVar.E();
        h.a(lVar.i(), uri, new k(), P1.n.a(pVar));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w == Ha.c.f() ? w : I.a;
    }

    public static /* synthetic */ Object n(l lVar, n nVar, Ga.e eVar) {
        new cb.p(Ha.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    public static /* synthetic */ Object o(l lVar, o oVar, Ga.e eVar) {
        new cb.p(Ha.b.c(eVar), 1).E();
        lVar.i();
        throw null;
    }

    public Object a(c4.a aVar, Ga.e eVar) {
        return h(this, aVar, eVar);
    }

    public Object b(Ga.e eVar) {
        return j(this, eVar);
    }

    public Object c(Uri uri, InputEvent inputEvent, Ga.e eVar) {
        return k(this, uri, inputEvent, eVar);
    }

    public Object d(m mVar, Ga.e eVar) {
        return l(this, mVar, eVar);
    }

    public Object e(Uri uri, Ga.e eVar) {
        return m(this, uri, eVar);
    }

    public Object f(n nVar, Ga.e eVar) {
        return n(this, nVar, eVar);
    }

    public Object g(o oVar, Ga.e eVar) {
        return o(this, oVar, eVar);
    }

    public final MeasurementManager i() {
        return this.b;
    }
}
