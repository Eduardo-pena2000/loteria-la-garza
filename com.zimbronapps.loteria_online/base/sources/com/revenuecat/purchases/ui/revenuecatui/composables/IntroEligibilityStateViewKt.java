package com.revenuecat.purchases.ui.revenuecatui.composables;

import Ca.I;
import Ca.o;
import Qa.p;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IntroEligibilityStateViewKt {

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
            IntroEligibilityStateViewKt.access$IntroEligibilityPreviewBothTextsEligibleMultipleOffers(mVar, g1.a(this.$$changed | 1));
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
            IntroEligibilityStateViewKt.access$IntroEligibilityPreviewBothTextsEligibleSingleOffer(mVar, g1.a(this.$$changed | 1));
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
            IntroEligibilityStateViewKt.access$IntroEligibilityPreviewBothTextsIneligible(mVar, g1.a(this.$$changed | 1));
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
            IntroEligibilityStateViewKt.access$IntroEligibilityPreviewNoOffer(mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void IntroEligibilityPreviewBothTextsEligibleMultipleOffers(m mVar, int i) {
        m i2 = mVar.i(-420223294);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-420223294, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleMultipleOffers (IntroEligibilityStateView.kt:152)");
            }
            IntroEligibilityStateView-QETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", OfferEligibility.IntroOfferMultiple.INSTANCE, r0.b.a(), null, null, null, false, null, i2, 28086, 992);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void IntroEligibilityPreviewBothTextsEligibleSingleOffer(m mVar, int i) {
        m i2 = mVar.i(1448735195);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1448735195, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsEligibleSingleOffer (IntroEligibilityStateView.kt:140)");
            }
            IntroEligibilityStateView-QETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $3.99/mo thereafter.", OfferEligibility.IntroOfferSingle.INSTANCE, r0.b.a(), null, null, null, false, null, i2, 28086, 992);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void IntroEligibilityPreviewBothTextsIneligible(m mVar, int i) {
        m i2 = mVar.i(170689540);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(170689540, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewBothTextsIneligible (IntroEligibilityStateView.kt:128)");
            }
            IntroEligibilityStateView-QETHhvg("$3.99/mo", "7 day trial, then $3.99/mo", "7 days for free, then $1.99 for your first month, and just $4.99/mo thereafter.", OfferEligibility.Ineligible.INSTANCE, r0.b.a(), null, null, null, false, null, i2, 28086, 992);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    private static final void IntroEligibilityPreviewNoOffer(m mVar, int i) {
        m i2 = mVar.i(-255198870);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-255198870, i, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityPreviewNoOffer (IntroEligibilityStateView.kt:116)");
            }
            IntroEligibilityStateView-QETHhvg("$3.99/mo", null, null, OfferEligibility.IntroOfferSingle.INSTANCE, r0.b.a(), null, null, null, false, null, i2, 28086, 992);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 1(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IntroEligibilityStateView-QETHhvg(java.lang.String r19, java.lang.String r20, java.lang.String r21, com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility r22, long r23, Z0.Y0 r25, d1.L r26, l1.j r27, boolean r28, androidx.compose.ui.e r29, b0.m r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.composables.IntroEligibilityStateViewKt.IntroEligibilityStateView-QETHhvg(java.lang.String, java.lang.String, java.lang.String, com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility, long, Z0.Y0, d1.L, l1.j, boolean, androidx.compose.ui.e, b0.m, int, int):void");
    }

    public static final /* synthetic */ void access$IntroEligibilityPreviewBothTextsEligibleMultipleOffers(m mVar, int i) {
        IntroEligibilityPreviewBothTextsEligibleMultipleOffers(mVar, i);
    }

    public static final /* synthetic */ void access$IntroEligibilityPreviewBothTextsEligibleSingleOffer(m mVar, int i) {
        IntroEligibilityPreviewBothTextsEligibleSingleOffer(mVar, i);
    }

    public static final /* synthetic */ void access$IntroEligibilityPreviewBothTextsIneligible(m mVar, int i) {
        IntroEligibilityPreviewBothTextsIneligible(mVar, i);
    }

    public static final /* synthetic */ void access$IntroEligibilityPreviewNoOffer(m mVar, int i) {
        IntroEligibilityPreviewNoOffer(mVar, i);
    }

    public static final String introEligibilityText(OfferEligibility eligibility, String str, String str2, String str3) {
        t.g(eligibility, "eligibility");
        if (t.c(eligibility, OfferEligibility.IntroOfferSingle.INSTANCE) ? true : t.c(eligibility, OfferEligibility.PromoOfferSingle.INSTANCE)) {
            str2 = str;
        } else {
            if (!(t.c(eligibility, OfferEligibility.IntroOfferMultiple.INSTANCE) ? true : t.c(eligibility, OfferEligibility.PromoOfferMultiple.INSTANCE))) {
                if (!(t.c(eligibility, OfferEligibility.Ineligible.INSTANCE) ? true : t.c(eligibility, OfferEligibility.PromoOfferIneligible.INSTANCE))) {
                    throw new o();
                }
                str2 = str3;
            }
        }
        return str2 == null ? str3 == null ? str == null ? "" : str : str3 : str2;
    }
}
