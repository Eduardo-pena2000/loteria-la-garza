package com.revenuecat.purchases.ui.revenuecatui.components.countdown;

import Ca.I;
import Ca.t;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.components.PreviewHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CountdownComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import java.util.Date;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class CountdownComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ e $modifier;
        final /* synthetic */ p $onClick;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ CountdownComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CountdownComponentStyle countdownComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = countdownComponentStyle;
            this.$state = components;
            this.$onClick = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CountdownComponentViewKt.CountdownComponentView(this.$style, this.$state, this.$onClick, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_Running$1", f = "CountdownComponentView.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction paywallAction, Ga.e eVar) {
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

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CountdownComponentViewKt.access$CountdownComponentView_Preview_Running(mVar, g1.a(this.$$changed | 1));
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentViewKt$CountdownComponentView_Preview_TimesUp$1", f = "CountdownComponentView.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new 1(eVar);
        }

        public final Object invoke(PaywallAction paywallAction, Ga.e eVar) {
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

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CountdownComponentViewKt.access$CountdownComponentView_Preview_TimesUp(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void CountdownComponentView(CountdownComponentStyle style, PaywallState.Loaded.Components state, p onClick, e eVar, m mVar, int i, int i2) {
        int i3;
        kotlin.jvm.internal.t.g(style, "style");
        kotlin.jvm.internal.t.g(state, "state");
        kotlin.jvm.internal.t.g(onClick, "onClick");
        m i4 = mVar.i(-1827191195);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(style) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.U(state) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.E(onClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= i4.U(eVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                eVar = e.a;
            }
            if (w.L()) {
                w.U(-1827191195, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView (CountdownComponentView.kt:26)");
            }
            StackComponentViewKt.StackComponentView((!CountdownComponentStateKt.rememberCountdownState(style.getDate(), i4, 0).getHasEnded() || style.getEndStackComponentStyle() == null) ? style.getCountdownStackComponentStyle() : style.getEndStackComponentStyle(), state, onClick, eVar, 0.0f, i4, i3 & 8176, 16);
            if (w.L()) {
                w.T();
            }
        }
        e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new 1(style, state, onClick, eVar2, i, i2));
        }
    }

    private static final void CountdownComponentView_Preview_Running(m mVar, int i) {
        m i2 = mVar.i(964712165);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(964712165, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_Running (CountdownComponentView.kt:45)");
            }
            Date date = new Date(System.currentTimeMillis() + 172800000);
            CountdownComponentView(new CountdownComponentStyle(date, CountdownComponent.CountFrom.DAYS, PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(r0.b.a())), null, 2, null), 24, null, null, null, null, null, false, null, null, null, null, date, null, null, 57336, null)), null, false, null, 0.0f, null, null, null, null, null, null, null, null, date, null, 24574, null), null, null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, i2, 384, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void CountdownComponentView_Preview_TimesUp(m mVar, int i) {
        m i2 = mVar.i(-1982632477);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1982632477, i, -1, "com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownComponentView_Preview_TimesUp (CountdownComponentView.kt:73)");
            }
            Date date = new Date(System.currentTimeMillis() - 172800000);
            r0.a aVar = r0.b;
            CountdownComponentView(new CountdownComponentStyle(date, CountdownComponent.CountFrom.DAYS, PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("{{ count_days_without_zero }}d {{ count_hours_without_zero }}h {{ count_minutes_without_zero }}m {{ count_seconds_without_zero }}s", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), 24, null, null, null, null, null, false, null, null, null, null, date, null, null, 57336, null)), null, false, null, 0.0f, null, null, null, null, null, null, null, null, date, null, 24574, null), PreviewHelpersKt.previewStackComponentStyle-7SJ-wSw$default(Da.u.e(PreviewHelpersKt.previewTextComponentStyle$default("Offer expired!", new ColorStyles(ColorStyle.Solid.box-impl(ColorStyle.Solid.constructor-impl(aVar.a())), null, 2, null), 24, null, null, null, null, null, false, null, null, null, null, null, null, null, 65528, null)), null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, 32766, null), null), PreviewHelpersKt.previewEmptyState(null, i2, 0, 1), new 1(null), null, i2, 384, 8);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final /* synthetic */ void access$CountdownComponentView_Preview_Running(m mVar, int i) {
        CountdownComponentView_Preview_Running(mVar, i);
    }

    public static final /* synthetic */ void access$CountdownComponentView_Preview_TimesUp(m mVar, int i) {
        CountdownComponentView_Preview_TimesUp(mVar, i);
    }
}
