package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import b0.g1;
import b0.m;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class TabControlButtonViewKt {

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlButtonViewKt$TabControlButtonView$1", f = "TabControlButtonView.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction paywallAction, e eVar) {
            return ((1) create(paywallAction, eVar)).invokeSuspend(I.a);
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

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ TabControlButtonComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(TabControlButtonComponentStyle tabControlButtonComponentStyle, PaywallState.Loaded.Components components, androidx.compose.ui.e eVar, int i, int i2) {
            super(2);
            this.$style = tabControlButtonComponentStyle;
            this.$state = components;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            TabControlButtonViewKt.TabControlButtonView(this.$style, this.$state, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TabControlButtonView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle r21, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Components r22, androidx.compose.ui.e r23, b0.m r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.tabs.TabControlButtonViewKt.TabControlButtonView(com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlButtonComponentStyle, com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Components, androidx.compose.ui.e, b0.m, int, int):void");
    }
}
