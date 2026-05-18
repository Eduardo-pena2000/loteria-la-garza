package com.revenuecat.purchases.ui.revenuecatui.components.button;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.f;
import Ia.l;
import Qa.a;
import Qa.p;
import b0.C0;
import cb.O;
import cb.i;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ButtonComponentViewKt$ButtonComponentView$2$2$1 extends u implements a {
    final /* synthetic */ ButtonComponentState $buttonState;
    final /* synthetic */ O $coroutineScope;
    final /* synthetic */ C0 $myActionInProgress$delegate;
    final /* synthetic */ p $onClick;
    final /* synthetic */ PaywallState.Loaded.Components $state;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.button.ButtonComponentViewKt$ButtonComponentView$2$2$1$1", f = "ButtonComponentView.kt", l = {139}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ ButtonComponentState $buttonState;
        final /* synthetic */ C0 $myActionInProgress$delegate;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(p pVar, ButtonComponentState buttonComponentState, PaywallState.Loaded.Components components, C0 c0, e eVar) {
            super(2, eVar);
            this.$onClick = pVar;
            this.$buttonState = buttonComponentState;
            this.$state = components;
            this.$myActionInProgress$delegate = c0;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$onClick, this.$buttonState, this.$state, this.$myActionInProgress$delegate, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                p pVar = this.$onClick;
                PaywallAction action = this.$buttonState.getAction();
                this.label = 1;
                if (pVar.invoke(action, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            ButtonComponentViewKt.2.access$invoke$lambda$3(this.$myActionInProgress$delegate, false);
            PaywallState.Loaded.Components.update$default(this.$state, null, null, b.a(false), 3, null);
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonComponentViewKt$ButtonComponentView$2$2$1(PaywallState.Loaded.Components components, O o, C0 c0, p pVar, ButtonComponentState buttonComponentState) {
        super(0);
        this.$state = components;
        this.$coroutineScope = o;
        this.$myActionInProgress$delegate = c0;
        this.$onClick = pVar;
        this.$buttonState = buttonComponentState;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        ButtonComponentViewKt.2.access$invoke$lambda$3(this.$myActionInProgress$delegate, true);
        PaywallState.Loaded.Components.update$default(this.$state, null, null, Boolean.TRUE, 3, null);
        i.d(this.$coroutineScope, null, null, new 1(this.$onClick, this.$buttonState, this.$state, this.$myActionInProgress$delegate, null), 3, null);
    }
}
