package gb;

import Ca.I;
import Ga.i;
import cb.E0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class u extends Ia.d implements fb.f, Ia.e {
    public final fb.f a;
    public final Ga.i b;
    public final int c;
    public Ga.i d;
    public Ga.e e;

    public u(fb.f fVar, Ga.i iVar) {
        super(q.a, Ga.j.a);
        this.a = fVar;
        this.b = iVar;
        this.c = ((Number) iVar.fold(0, new t())).intValue();
    }

    public static /* synthetic */ int a(int i, i.b bVar) {
        return k(i, bVar);
    }

    public static final int k(int i, i.b bVar) {
        return i + 1;
    }

    public Object emit(Object obj, Ga.e eVar) {
        try {
            Object l = l(eVar, obj);
            if (l == Ha.c.f()) {
                Ia.h.c(eVar);
            }
            return l == Ha.c.f() ? l : I.a;
        } catch (Throwable th) {
            this.d = new l(th, eVar.getContext());
            throw th;
        }
    }

    public Ia.e getCallerFrame() {
        Ga.e eVar = this.e;
        if (eVar instanceof Ia.e) {
            return (Ia.e) eVar;
        }
        return null;
    }

    public Ga.i getContext() {
        Ga.i iVar = this.d;
        return iVar == null ? Ga.j.a : iVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void i(Ga.i iVar, Ga.i iVar2, Object obj) {
        if (iVar2 instanceof l) {
            n((l) iVar2, obj);
        }
        x.b(this, iVar);
    }

    public Object invokeSuspend(Object obj) {
        Throwable e = Ca.s.e(obj);
        if (e != null) {
            this.d = new l(e, getContext());
        }
        Ga.e eVar = this.e;
        if (eVar != null) {
            eVar.resumeWith(obj);
        }
        return Ha.c.f();
    }

    public final Object l(Ga.e eVar, Object obj) {
        Ga.i context = eVar.getContext();
        E0.k(context);
        Ga.i iVar = this.d;
        if (iVar != context) {
            i(context, iVar, obj);
            this.d = context;
        }
        this.e = eVar;
        Qa.q a = v.a();
        fb.f fVar = this.a;
        kotlin.jvm.internal.t.e(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a.invoke(fVar, obj, this);
        if (!kotlin.jvm.internal.t.c(invoke, Ha.c.f())) {
            this.e = null;
        }
        return invoke;
    }

    public final void n(l lVar, Object obj) {
        throw new IllegalStateException(Za.u.j("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + lVar.b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
