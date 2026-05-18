package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import ab.b;
import ab.d;
import androidx.lifecycle.r;
import b0.C0;
import cb.E0;
import cb.O;
import cb.Z;
import cb.i;
import fb.g;
import java.util.Date;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1", f = "CountdownComponentState.kt", l = {92}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CountdownComponentStateKt$rememberCountdownState$1$1 extends l implements p {
    final /* synthetic */ C0 $countdownTime$delegate;
    final /* synthetic */ C0 $isCountingEnabled$delegate;
    final /* synthetic */ r $lifecycleOwner;
    final /* synthetic */ Date $targetDate;
    private /* synthetic */ Object L$0;
    int label;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentStateKt$rememberCountdownState$1$1$1", f = "CountdownComponentState.kt", l = {74}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ C0 $isCountingEnabled$delegate;
        final /* synthetic */ r $lifecycleOwner;
        int label;

        public static final class 2 implements fb.f {
            final /* synthetic */ C0 $isCountingEnabled$delegate;

            public 2(C0 c0) {
                this.$isCountingEnabled$delegate = c0;
            }

            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar) {
                return emit(((Boolean) obj).booleanValue(), eVar);
            }

            public final Object emit(boolean z, e eVar) {
                CountdownComponentStateKt.access$rememberCountdownState$lambda$6(this.$isCountingEnabled$delegate, z);
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(r rVar, C0 c0, e eVar) {
            super(2, eVar);
            this.$lifecycleOwner = rVar;
            this.$isCountingEnabled$delegate = c0;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$lifecycleOwner, this.$isCountingEnabled$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                fb.e m = g.m(new CountdownComponentStateKt$rememberCountdownState$1$1$1$invokeSuspend$$inlined$map$1(this.$lifecycleOwner.getLifecycle().getCurrentStateFlow()));
                2 r1 = new 2(this.$isCountingEnabled$delegate);
                this.label = 1;
                if (m.collect(r1, this) == f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountdownComponentStateKt$rememberCountdownState$1$1(Date date, r rVar, C0 c0, C0 c02, e eVar) {
        super(2, eVar);
        this.$targetDate = date;
        this.$lifecycleOwner = rVar;
        this.$isCountingEnabled$delegate = c0;
        this.$countdownTime$delegate = c02;
    }

    public final e create(Object obj, e eVar) {
        CountdownComponentStateKt$rememberCountdownState$1$1 countdownComponentStateKt$rememberCountdownState$1$1 = new CountdownComponentStateKt$rememberCountdownState$1$1(this.$targetDate, this.$lifecycleOwner, this.$isCountingEnabled$delegate, this.$countdownTime$delegate, eVar);
        countdownComponentStateKt$rememberCountdownState$1$1.L$0 = obj;
        return countdownComponentStateKt$rememberCountdownState$1$1;
    }

    public final Object invoke(O o, e eVar) {
        return ((CountdownComponentStateKt$rememberCountdownState$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        O o;
        long s;
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            O o2 = (O) this.L$0;
            i.d(o2, null, null, new 1(this.$lifecycleOwner, this.$isCountingEnabled$delegate, null), 3, null);
            o = o2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = (O) this.L$0;
            t.b(obj);
        }
        do {
            if (E0.p(o.getCoroutineContext())) {
                if (CountdownComponentStateKt.access$rememberCountdownState$lambda$5(this.$isCountingEnabled$delegate)) {
                    long time = this.$targetDate.getTime() - new Date().getTime();
                    if (time <= 0) {
                        CountdownComponentStateKt.access$rememberCountdownState$lambda$3(this.$countdownTime$delegate, CountdownTime.Companion.getZERO());
                    } else {
                        CountdownComponentStateKt.access$rememberCountdownState$lambda$3(this.$countdownTime$delegate, CountdownTime.Companion.fromInterval(time));
                    }
                }
                b.a aVar = b.b;
                s = d.s(1, ab.e.e);
                this.L$0 = o;
                this.label = 1;
            }
            return I.a;
        } while (Z.b(s, this) != f);
        return f;
    }
}
