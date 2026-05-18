package com.revenuecat.purchases.ui.revenuecatui.components.stickyfooter;

import Ca.I;
import Qa.p;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.components.stack.StackComponentViewKt;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StickyFooterComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class StickyFooterComponentViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ p $clickHandler;
        final /* synthetic */ e $modifier;
        final /* synthetic */ PaywallState.Loaded.Components $state;
        final /* synthetic */ StickyFooterComponentStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StickyFooterComponentStyle stickyFooterComponentStyle, PaywallState.Loaded.Components components, p pVar, e eVar, int i, int i2) {
            super(2);
            this.$style = stickyFooterComponentStyle;
            this.$state = components;
            this.$clickHandler = pVar;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            StickyFooterComponentViewKt.StickyFooterComponentView(this.$style, this.$state, this.$clickHandler, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final void StickyFooterComponentView(StickyFooterComponentStyle style, PaywallState.Loaded.Components state, p clickHandler, e eVar, m mVar, int i, int i2) {
        int i3;
        t.g(style, "style");
        t.g(state, "state");
        t.g(clickHandler, "clickHandler");
        m i4 = mVar.i(-127624067);
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
            i3 |= i4.E(clickHandler) ? 256 : 128;
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
                w.U(-127624067, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.components.stickyfooter.StickyFooterComponentView (StickyFooterComponentView.kt:17)");
            }
            StackComponentViewKt.StackComponentView(style.getStackComponentStyle(), state, clickHandler, eVar, 0.0f, i4, i3 & 8176, 16);
            if (w.L()) {
                w.T();
            }
        }
        e eVar2 = eVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new 1(style, state, clickHandler, eVar2, i, i2));
        }
    }
}
