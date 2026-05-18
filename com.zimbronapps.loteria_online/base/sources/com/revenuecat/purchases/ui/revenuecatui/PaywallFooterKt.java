package com.revenuecat.purchases.ui.revenuecatui;

import Ca.I;
import Ca.e;
import Qa.p;
import Qa.q;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallFooterKt {

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $condensed;
        final /* synthetic */ q $mainContent;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PaywallOptions paywallOptions, boolean z, q qVar, int i, int i2) {
            super(2);
            this.$options = paywallOptions;
            this.$condensed = z;
            this.$mainContent = qVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallFooterKt.OriginalTemplatePaywallFooter(this.$options, this.$condensed, this.$mainContent, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $condensed;
        final /* synthetic */ q $mainContent;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallOptions paywallOptions, boolean z, q qVar, int i, int i2) {
            super(2);
            this.$options = paywallOptions;
            this.$condensed = z;
            this.$mainContent = qVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PaywallFooterKt.PaywallFooter(this.$options, this.$condensed, this.$mainContent, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void OriginalTemplatePaywallFooter(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions r26, boolean r27, Qa.q r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt.OriginalTemplatePaywallFooter(com.revenuecat.purchases.ui.revenuecatui.PaywallOptions, boolean, Qa.q, b0.m, int, int):void");
    }

    @e
    public static final void PaywallFooter(PaywallOptions options, boolean z, q qVar, m mVar, int i, int i2) {
        int i3;
        t.g(options, "options");
        m i4 = mVar.i(-1966106382);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (i4.U(options) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= i4.a(z) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= i4.E(qVar) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && i4.j()) {
            i4.M();
        } else {
            if (i5 != 0) {
                z = false;
            }
            if (i6 != 0) {
                qVar = null;
            }
            if (w.L()) {
                w.U(-1966106382, i3, -1, "com.revenuecat.purchases.ui.revenuecatui.PaywallFooter (PaywallFooter.kt:34)");
            }
            OriginalTemplatePaywallFooter(options, z, qVar, i4, i3 & 1022, 0);
            if (w.L()) {
                w.T();
            }
        }
        boolean z2 = z;
        q qVar2 = qVar;
        B1 l = i4.l();
        if (l != null) {
            l.a(new 1(options, z2, qVar2, i, i2));
        }
    }
}
