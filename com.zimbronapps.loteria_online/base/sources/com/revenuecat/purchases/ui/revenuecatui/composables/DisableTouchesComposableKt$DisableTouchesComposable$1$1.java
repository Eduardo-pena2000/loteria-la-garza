package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import I0.L;
import I0.b;
import I0.s;
import Ia.f;
import Ia.k;
import Ia.l;
import Qa.p;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1", f = "DisableTouchesComposable.kt", l = {22}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DisableTouchesComposableKt$DisableTouchesComposable$1$1 extends l implements p {
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.composables.DisableTouchesComposableKt$DisableTouchesComposable$1$1$1", f = "DisableTouchesComposable.kt", l = {24}, m = "invokeSuspend")
    public static final class 1 extends k implements p {
        private /* synthetic */ Object L$0;
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            1 r0 = new 1(eVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(b bVar, e eVar) {
            return ((1) create(bVar, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            b bVar;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                bVar = (b) this.L$0;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (b) this.L$0;
                t.b(obj);
            }
            do {
                this.L$0 = bVar;
                this.label = 1;
            } while (b.m0(bVar, (s) null, this, 1, (Object) null) != f);
            return f;
        }
    }

    public DisableTouchesComposableKt$DisableTouchesComposable$1$1(e eVar) {
        super(2, eVar);
    }

    public final e create(Object obj, e eVar) {
        DisableTouchesComposableKt$DisableTouchesComposable$1$1 disableTouchesComposableKt$DisableTouchesComposable$1$1 = new DisableTouchesComposableKt$DisableTouchesComposable$1$1(eVar);
        disableTouchesComposableKt$DisableTouchesComposable$1$1.L$0 = obj;
        return disableTouchesComposableKt$DisableTouchesComposable$1$1;
    }

    public final Object invoke(L l, e eVar) {
        return ((DisableTouchesComposableKt$DisableTouchesComposable$1$1) create(l, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            L l = (L) this.L$0;
            1 r1 = new 1(null);
            this.label = 1;
            if (l.S0(r1, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
