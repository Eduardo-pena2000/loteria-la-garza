package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import Ca.o;
import M.i;
import Qa.l;
import Qa.p;
import X.E;
import X.h0;
import X.m0;
import Z0.Y0;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import d1.H;
import d1.L;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import n1.h;
import v0.r0;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseStatusBadgeKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseStatusBadgeKt.PurchaseStatusBadge(this.$purchaseInformation, this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ BadgeInfo $badgeInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(BadgeInfo badgeInfo) {
            super(2);
            this.$badgeInfo = badgeInfo;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1077364541, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge.<anonymous> (PurchaseStatusBadge.kt:34)");
            }
            String text = this.$badgeInfo.getText();
            E e = E.a;
            int i2 = E.b;
            Y0 k = e.c(mVar, i2).k();
            r0 r0Var = this.$badgeInfo.getTextColor-QN2ZGVo();
            mVar.V(2012735351);
            long w = r0Var == null ? e.a(mVar, i2).w() : r0Var.A();
            mVar.P();
            e.a aVar = e.a;
            CustomerCenterConstants.Card card = CustomerCenterConstants.Card.INSTANCE;
            m0.b(text, f.j(aVar, card.getBADGE_HORIZONTAL_PADDING-D9Ej5fM(), card.getBADGE_VERTICAL_PADDING-D9Ej5fM()), w, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, k, mVar, 48, 0, 65528);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseStatusBadgeKt.PurchaseStatusBadge(this.$purchaseInformation, this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void PurchaseStatusBadge(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        int i2;
        m mVar2;
        t.g(purchaseInformation, "purchaseInformation");
        t.g(localization, "localization");
        m i3 = mVar.i(256749794);
        if ((i & 6) == 0) {
            i2 = (i3.E(purchaseInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(localization) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(256749794, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseStatusBadge (PurchaseStatusBadge.kt:21)");
            }
            BadgeInfo badgeInfo = getBadgeInfo(determinePurchaseStatus(purchaseInformation), localization, i3, i2 & 112);
            if (badgeInfo.getText() == null || badgeInfo.getColor-QN2ZGVo() == null) {
                if (w.L()) {
                    w.T();
                }
                B1 l = i3.l();
                if (l != null) {
                    l.a(new 1(purchaseInformation, localization, i));
                    return;
                }
                return;
            }
            mVar2 = i3;
            h0.a((e) null, i.d(CustomerCenterConstants.Card.INSTANCE.getBADGE_CORNER_SIZE-D9Ej5fM()), badgeInfo.getColor-QN2ZGVo().A(), 0L, 0.0f, 0.0f, badgeInfo.getBorder(), j0.i.d(1077364541, true, new 2(badgeInfo), i3, 54), i3, 12582912, 57);
            if (w.L()) {
                w.T();
            }
        }
        B1 l2 = mVar2.l();
        if (l2 != null) {
            l2.a(new 3(purchaseInformation, localization, i));
        }
    }

    private static final PurchaseStatus determinePurchaseStatus(PurchaseInformation purchaseInformation) {
        return purchaseInformation.isExpired() ? PurchaseStatus.EXPIRED : (purchaseInformation.isCancelled() && purchaseInformation.isTrial()) ? PurchaseStatus.FREE_TRIAL_CANCELLED : (!purchaseInformation.isCancelled() || purchaseInformation.getStore() == Store.PROMOTIONAL) ? purchaseInformation.isTrial() ? PurchaseStatus.FREE_TRIAL : purchaseInformation.isLifetime() ? PurchaseStatus.LIFETIME : purchaseInformation.getExpirationOrRenewal() != null ? PurchaseStatus.ACTIVE : PurchaseStatus.NONE : PurchaseStatus.CANCELLED;
    }

    private static final BadgeInfo getBadgeInfo(PurchaseStatus purchaseStatus, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        BadgeInfo badgeInfo;
        mVar.V(806722768);
        if (w.L()) {
            w.U(806722768, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.getBadgeInfo (PurchaseStatusBadge.kt:57)");
        }
        if (purchaseStatus == PurchaseStatus.EXPIRED) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.EXPIRED), r0.m(s0.b(438115104)), null, null, 12, null);
        } else if (purchaseStatus == PurchaseStatus.FREE_TRIAL_CANCELLED) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_FREE_TRIAL_CANCELLED), r0.m(s0.b(871519323)), null, null, 12, null);
        } else if (purchaseStatus == PurchaseStatus.CANCELLED) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_CANCELLED), r0.m(s0.b(871519323)), null, null, 12, null);
        } else if (purchaseStatus == PurchaseStatus.FREE_TRIAL) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_FREE_TRIAL), r0.m(s0.b(1542834780)), null, null, 12, null);
        } else if (purchaseStatus == PurchaseStatus.LIFETIME) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.BADGE_LIFETIME), r0.m(r0.b.i()), A.j.a(h.g(1), r0.q(E.a.a(mVar, E.b).w(), 0.29f, 0.0f, 0.0f, 0.0f, 14, (Object) null)), null, 8, null);
        } else if (purchaseStatus == PurchaseStatus.ACTIVE) {
            badgeInfo = new BadgeInfo(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.ACTIVE), r0.m(s0.d(2568082563L)), null, null, 12, null);
        } else {
            if (purchaseStatus != PurchaseStatus.NONE) {
                throw new o();
            }
            badgeInfo = new BadgeInfo(null, null, null, null, 12, null);
        }
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return badgeInfo;
    }
}
