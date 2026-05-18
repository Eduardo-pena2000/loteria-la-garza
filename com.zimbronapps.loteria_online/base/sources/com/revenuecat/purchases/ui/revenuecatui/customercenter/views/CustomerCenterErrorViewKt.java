package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Qa.l;
import Qa.p;
import X.m0;
import Z0.Y0;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterErrorViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterState.Error $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterState.Error error, int i) {
            super(2);
            this.$state = error;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CustomerCenterErrorViewKt.CustomerCenterErrorView(this.$state, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i) {
            super(2);
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CustomerCenterErrorViewKt.CustomerCenterErrorViewPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void CustomerCenterErrorView(CustomerCenterState.Error state, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(state, "state");
        m i3 = mVar.i(2025779500);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(2025779500, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterErrorView (CustomerCenterErrorView.kt:11)");
            }
            mVar2 = i3;
            m0.b("Error: " + state.getError(), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar2, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 1(state, i));
        }
    }

    public static final void CustomerCenterErrorViewPreview(m mVar, int i) {
        m i2 = mVar.i(-1988428436);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1988428436, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CustomerCenterErrorViewPreview (CustomerCenterErrorView.kt:21)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(ComposableSingletons$CustomerCenterErrorViewKt.INSTANCE.getLambda-1$revenuecatui_defaultsBc8Release(), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }
}
