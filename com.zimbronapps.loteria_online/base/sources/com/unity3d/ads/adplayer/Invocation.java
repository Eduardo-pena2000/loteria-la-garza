package com.unity3d.ads.adplayer;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.P;
import cb.W;
import cb.i;
import cb.x;
import cb.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Invocation {
    private final x _isHandled;
    private final x completableDeferred;
    private final String location;
    private final Object[] parameters;

    @f(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
    public static final class 2 extends l implements Qa.l {
        int label;

        public 2(e eVar) {
            super(1, eVar);
        }

        public final e create(e eVar) {
            return new 2(eVar);
        }

        public final Object invoke(e eVar) {
            return ((2) create(eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return I.a;
        }
    }

    @f(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
    public static final class 3 extends l implements p {
        final /* synthetic */ Qa.l $handler;
        int label;
        final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(Qa.l lVar, Invocation invocation, e eVar) {
            super(2, eVar);
            this.$handler = lVar;
            this.this$0 = invocation;
        }

        public final e create(Object obj, e eVar) {
            return new 3(this.$handler, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((3) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    t.b(obj);
                    Qa.l lVar = this.$handler;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                }
                Invocation.access$getCompletableDeferred$p(this.this$0).o(obj);
            } catch (Throwable th) {
                Invocation.access$getCompletableDeferred$p(this.this$0).b(th);
            }
            return I.a;
        }
    }

    public Invocation(String location, Object[] parameters) {
        kotlin.jvm.internal.t.g(location, "location");
        kotlin.jvm.internal.t.g(parameters, "parameters");
        this.location = location;
        this.parameters = parameters;
        this._isHandled = z.b(null, 1, null);
        this.completableDeferred = z.b(null, 1, null);
    }

    public static final /* synthetic */ x access$getCompletableDeferred$p(Invocation invocation) {
        return invocation.completableDeferred;
    }

    public static /* synthetic */ Object handle$default(Invocation invocation, Qa.l lVar, e eVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = new 2(null);
        }
        return invocation.handle(lVar, eVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(e eVar) {
        return this.completableDeferred.await(eVar);
    }

    public final Object handle(Qa.l lVar, e eVar) {
        x xVar = this._isHandled;
        I i = I.a;
        xVar.o(i);
        i.d(P.a(eVar.getContext()), null, null, new 3(lVar, this, null), 3, null);
        return i;
    }

    public final W isHandled() {
        return this._isHandled;
    }
}
