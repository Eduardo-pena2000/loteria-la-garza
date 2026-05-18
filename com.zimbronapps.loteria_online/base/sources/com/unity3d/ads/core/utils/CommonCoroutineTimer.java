package com.unity3d.ads.core.utils;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.a;
import Qa.p;
import cb.A;
import cb.B0;
import cb.K;
import cb.O;
import cb.P;
import cb.W0;
import cb.Z;
import cb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final K dispatcher;
    private final A job;
    private final O scope;

    @f(c = "com.unity3d.ads.core.utils.CommonCoroutineTimer$start$1", f = "CommonCoroutineTimer.kt", l = {21, 24}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ a $action;
        final /* synthetic */ long $delayStartMillis;
        final /* synthetic */ long $repeatMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(long j, a aVar, long j2, e eVar) {
            super(2, eVar);
            this.$delayStartMillis = j;
            this.$action = aVar;
            this.$repeatMillis = j2;
        }

        public final e create(Object obj, e eVar) {
            1 r7 = new 1(this.$delayStartMillis, this.$action, this.$repeatMillis, eVar);
            r7.L$0 = obj;
            return r7;
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            O o;
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                o = (O) this.L$0;
                long j = this.$delayStartMillis;
                this.L$0 = o;
                this.label = 1;
                if (Z.a(j, this) == f) {
                    return f;
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o = (O) this.L$0;
                t.b(obj);
            }
            while (P.g(o)) {
                this.$action.invoke();
                long j2 = this.$repeatMillis;
                this.L$0 = o;
                this.label = 2;
                if (Z.a(j2, this) == f) {
                    return f;
                }
            }
            return I.a;
        }
    }

    public CommonCoroutineTimer(K dispatcher) {
        kotlin.jvm.internal.t.g(dispatcher, "dispatcher");
        this.dispatcher = dispatcher;
        A b = W0.b(null, 1, null);
        this.job = b;
        this.scope = P.a(dispatcher.plus(b));
    }

    public B0 start(long j, long j2, a action) {
        kotlin.jvm.internal.t.g(action, "action");
        return i.d(this.scope, this.dispatcher, null, new 1(j, action, j2, null), 2, null);
    }
}
