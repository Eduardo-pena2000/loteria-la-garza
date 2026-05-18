package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.O;
import cb.P;
import cb.i;
import com.unity3d.services.core.misc.Utilities;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final K mainDispatcher;

    @f(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Qa.a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar, e eVar) {
            super(2, eVar);
            this.$block = aVar;
        }

        public static /* synthetic */ void a(Qa.a aVar) {
            invokeSuspend$lambda$0(aVar);
        }

        private static final void invokeSuspend$lambda$0(Qa.a aVar) {
            aVar.invoke();
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$block, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            Utilities.wrapCustomerListener(new a(this.$block));
            return I.a;
        }
    }

    public CommonSafeCallbackInvoke(K mainDispatcher) {
        kotlin.jvm.internal.t.g(mainDispatcher, "mainDispatcher");
        this.mainDispatcher = mainDispatcher;
    }

    public void invoke(Qa.a block) {
        kotlin.jvm.internal.t.g(block, "block");
        i.d(P.a(this.mainDispatcher), null, null, new 1(block, null), 3, null);
    }
}
