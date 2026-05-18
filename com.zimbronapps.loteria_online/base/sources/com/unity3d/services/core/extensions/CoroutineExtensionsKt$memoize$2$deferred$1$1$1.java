package com.unity3d.services.core.extensions;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;

@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1 extends l implements p {
    final /* synthetic */ Qa.l $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(Qa.l lVar, e eVar) {
        super(2, eVar);
        this.$action = lVar;
    }

    public final e create(Object obj, e eVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            Qa.l lVar = this.$action;
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
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }
}
