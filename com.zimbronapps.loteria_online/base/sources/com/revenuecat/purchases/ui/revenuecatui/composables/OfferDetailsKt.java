package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import M0.B;
import O0.g;
import Qa.a;
import Qa.p;
import X.E;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.c;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.UIConstant;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferDetailsKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ TemplateConfiguration.Colors $colors;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallState.Loaded.Legacy legacy, TemplateConfiguration.Colors colors, int i, int i2) {
            super(2);
            this.$state = legacy;
            this.$colors = colors;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            OfferDetailsKt.OfferDetails(this.$state, this.$colors, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ long $color;
        final /* synthetic */ PaywallState.Loaded.Legacy $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallState.Loaded.Legacy legacy, long j, int i) {
            super(2);
            this.$state = legacy;
            this.$color = j;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            OfferDetailsKt.OfferDetails-RPmYEkk(this.$state, this.$color, mVar, g1.a(this.$$changed | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OfferDetails(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState.Loaded.Legacy r4, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration.Colors r5, b0.m r6, int r7, int r8) {
        /*
            java.lang.String r0 = "state"
            kotlin.jvm.internal.t.g(r4, r0)
            r0 = -2001121712(0xffffffff88b94e50, float:-1.1152694E-33)
            b0.m r6 = r6.i(r0)
            r1 = r8 & 1
            if (r1 == 0) goto L13
            r1 = r7 | 6
            goto L23
        L13:
            r1 = r7 & 6
            if (r1 != 0) goto L22
            boolean r1 = r6.U(r4)
            if (r1 == 0) goto L1f
            r1 = 4
            goto L20
        L1f:
            r1 = 2
        L20:
            r1 = r1 | r7
            goto L23
        L22:
            r1 = r7
        L23:
            r2 = r7 & 48
            if (r2 != 0) goto L37
            r2 = r8 & 2
            if (r2 != 0) goto L34
            boolean r2 = r6.U(r5)
            if (r2 == 0) goto L34
            r2 = 32
            goto L36
        L34:
            r2 = 16
        L36:
            r1 = r1 | r2
        L37:
            r2 = r1 & 19
            r3 = 18
            if (r2 != r3) goto L48
            boolean r2 = r6.j()
            if (r2 != 0) goto L44
            goto L48
        L44:
            r6.M()
            goto L8f
        L48:
            r6.G()
            r2 = r7 & 1
            if (r2 == 0) goto L60
            boolean r2 = r6.O()
            if (r2 == 0) goto L56
            goto L60
        L56:
            r6.M()
            r2 = r8 & 2
            if (r2 == 0) goto L6e
        L5d:
            r1 = r1 & (-113(0xffffffffffffff8f, float:NaN))
            goto L6e
        L60:
            r2 = r8 & 2
            if (r2 == 0) goto L6e
            com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration r5 = r4.getTemplateConfiguration()
            r2 = 0
            com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors r5 = r5.getCurrentColors(r6, r2)
            goto L5d
        L6e:
            r6.w()
            boolean r2 = b0.w.L()
            if (r2 == 0) goto L7d
            r2 = -1
            java.lang.String r3 = "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:25)"
            b0.w.U(r0, r1, r2, r3)
        L7d:
            long r2 = r5.getText1-0d7_KjU()
            r0 = r1 & 14
            OfferDetails-RPmYEkk(r4, r2, r6, r0)
            boolean r0 = b0.w.L()
            if (r0 == 0) goto L8f
            b0.w.T()
        L8f:
            b0.B1 r6 = r6.l()
            if (r6 == 0) goto L9d
            com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt$OfferDetails$1
            r0.<init>(r4, r5, r7, r8)
            r6.a(r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetailsKt.OfferDetails(com.revenuecat.purchases.ui.revenuecatui.data.PaywallState$Loaded$Legacy, com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration$Colors, b0.m, int, int):void");
    }

    public static final void OfferDetails-RPmYEkk(PaywallState.Loaded.Legacy state, long j, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(state, "state");
        m i3 = mVar.i(683762235);
        if ((i & 6) == 0) {
            i2 = (i3.U(state) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.e(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(683762235, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.OfferDetails (OfferDetails.kt:37)");
            }
            e.a aVar = e.a;
            e m = f.m(aVar, 0.0f, 0.0f, 0.0f, UIConstant.INSTANCE.getDefaultVerticalSpacing-D9Ej5fM(), 7, (Object) null);
            B h = F.f.h(o0.e.a.o(), false);
            int a = h.a(i3, 0);
            b0.I r = i3.r();
            e f = c.f(i3, m);
            g.a aVar2 = g.E8;
            a a2 = aVar2.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a2);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, h, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar2.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            mVar2 = i3;
            IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(PaywallStateKt.getSelectedLocalization(state).getOfferDetails(), PaywallStateKt.getSelectedLocalization(state).getOfferDetailsWithIntroOffer(), PaywallStateKt.getSelectedLocalization(state).getOfferDetailsWithMultipleIntroOffers(), PackageExtensionsKt.getOfferEligibility((TemplateConfiguration.PackageInfo) state.getSelectedPackage().getValue()), j, E.a.c(i3, E.b).c(), L.b.g(), j.h(j.b.a()), false, androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), mVar2, ((i2 << 9) & 57344) | 806879232, 256);
            mVar2.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 3(state, j, i));
        }
    }
}
