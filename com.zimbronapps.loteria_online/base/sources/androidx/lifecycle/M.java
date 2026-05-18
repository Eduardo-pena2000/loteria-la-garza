package androidx.lifecycle;

import androidx.lifecycle.k;
import cb.E0;
import cb.e0;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends l implements o {
    public final k a;
    public final Ga.i b;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = m.this.new a(eVar);
            aVar.b = obj;
            return aVar;
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            cb.O o = (cb.O) this.b;
            if (m.this.b().getCurrentState().compareTo(k.b.b) >= 0) {
                m.this.b().addObserver(m.this);
            } else {
                E0.e(o.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            }
            return Ca.I.a;
        }
    }

    public m(k kVar, Ga.i iVar) {
        kotlin.jvm.internal.t.g(kVar, "lifecycle");
        kotlin.jvm.internal.t.g(iVar, "coroutineContext");
        this.a = kVar;
        this.b = iVar;
        if (b().getCurrentState() == k.b.a) {
            E0.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }

    public k b() {
        return this.a;
    }

    public final void c() {
        cb.i.d(this, e0.c().E(), (cb.Q) null, new a(null), 2, (Object) null);
    }

    public Ga.i getCoroutineContext() {
        return this.b;
    }

    public void onStateChanged(r rVar, k.a aVar) {
        kotlin.jvm.internal.t.g(rVar, "source");
        kotlin.jvm.internal.t.g(aVar, "event");
        if (b().getCurrentState().compareTo(k.b.a) <= 0) {
            b().removeObserver(this);
            E0.e(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
        }
    }
}
