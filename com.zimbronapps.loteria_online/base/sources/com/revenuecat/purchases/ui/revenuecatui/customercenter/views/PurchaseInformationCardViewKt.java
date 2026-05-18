package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import Ca.I;
import F.T;
import F.V;
import F.W;
import F.c;
import F.l;
import F.o;
import M0.B;
import O0.g;
import Qa.p;
import X.C;
import X.E;
import X.m0;
import androidx.compose.foundation.layout.f;
import androidx.compose.ui.e;
import b0.B1;
import b0.g1;
import b0.h;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.ExpirationOrRenewal;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.ModifierExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.icons.KeyboardArrowRightKt;
import d1.H;
import d1.L;
import j0.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import o0.e;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PurchaseInformationCardViewKt {

    public static final class 1 extends u implements p {
        final /* synthetic */ boolean $isDetailedView;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Qa.a $onCardClick;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Qa.a aVar, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, boolean z) {
            super(2);
            this.$onCardClick = aVar;
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$isDetailedView = z;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            String str;
            m mVar2;
            PurchaseInformation purchaseInformation;
            int i2;
            E e;
            CustomerCenterConfigData.Localization localization;
            int i3;
            E e2;
            CustomerCenterConfigData.Localization localization2;
            PurchaseInformation purchaseInformation2;
            if ((i & 3) == 2 && mVar.j()) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(-63636015, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView.<anonymous> (PurchaseInformationCardView.kt:67)");
            }
            e.a aVar = e.a;
            Qa.a aVar2 = this.$onCardClick;
            mVar.V(672812244);
            boolean U = mVar.U(this.$onCardClick);
            Qa.a aVar3 = this.$onCardClick;
            Object C = mVar.C();
            if (U || C == m.a.a()) {
                C = new PurchaseInformationCardViewKt$PurchaseInformationCardView$1$1$1(aVar3);
                mVar.t(C);
            }
            mVar.P();
            e applyIfNotNull = ModifierExtensionsKt.applyIfNotNull(aVar, aVar2, (p) C);
            CustomerCenterConstants.Card card = CustomerCenterConstants.Card.INSTANCE;
            e i4 = f.i(applyIfNotNull, card.getCARD_PADDING-D9Ej5fM());
            PurchaseInformation purchaseInformation3 = this.$purchaseInformation;
            CustomerCenterConfigData.Localization localization3 = this.$localization;
            boolean z = this.$isDetailedView;
            F.c cVar = F.c.a;
            c.m h = cVar.h();
            e.a aVar4 = o0.e.a;
            B a = l.a(h, aVar4.k(), mVar, 0);
            int a2 = h.a(mVar, 0);
            b0.I r = mVar.r();
            androidx.compose.ui.e f = androidx.compose.ui.c.f(mVar, i4);
            g.a aVar5 = g.E8;
            Qa.a a3 = aVar5.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a3);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, a, aVar5.e());
            m2.e(b, r, aVar5.g());
            p b2 = aVar5.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f, aVar5.f());
            o oVar = o.a;
            c.f e3 = cVar.e();
            e.c l = aVar4.l();
            androidx.compose.ui.e m = f.m(androidx.compose.foundation.layout.g.h(aVar, 0.0f, 1, (Object) null), 0.0f, 0.0f, 0.0f, card.getTITLE_ROW_BOTTOM_PADDING-D9Ej5fM(), 7, (Object) null);
            B b3 = T.b(e3, l, mVar, 54);
            int a4 = h.a(mVar, 0);
            b0.I r2 = mVar.r();
            androidx.compose.ui.e f2 = androidx.compose.ui.c.f(mVar, m);
            Qa.a a5 = aVar5.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a5);
            } else {
                mVar.s();
            }
            m b4 = m2.b(mVar);
            m2.e(b4, b3, aVar5.e());
            m2.e(b4, r2, aVar5.g());
            p b5 = aVar5.b();
            if (b4.f() || !t.c(b4.C(), Integer.valueOf(a4))) {
                b4.t(Integer.valueOf(a4));
                b4.J(Integer.valueOf(a4), b5);
            }
            m2.e(b4, f2, aVar5.f());
            W w = W.a;
            String title = purchaseInformation3.getTitle();
            if (title != null) {
                str = title;
            } else {
                StoreProduct product = purchaseInformation3.getProduct();
                String title2 = product != null ? product.getTitle() : null;
                if (title2 == null) {
                    title = "";
                    str = title;
                } else {
                    str = title2;
                }
            }
            E e4 = E.a;
            int i5 = E.b;
            String str2 = str;
            m0.b(str2, V.c(w, aVar, 1.0f, false, 2, (Object) null), e4.a(mVar, i5).w(), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, e4.c(mVar, i5).o(), mVar, 0, 0, 65528);
            if (purchaseInformation3.isSubscription() || z) {
                mVar2 = mVar;
                purchaseInformation = purchaseInformation3;
                i2 = i5;
                e = e4;
                localization = localization3;
                mVar2.V(-1127028447);
                PurchaseStatusBadgeKt.PurchaseStatusBadge(purchaseInformation, localization, mVar2, 0);
                mVar.P();
            } else {
                mVar2 = mVar;
                mVar2.V(-578963871);
                B b6 = T.b(cVar.o(card.getBADGE_HORIZONTAL_PADDING-D9Ej5fM()), aVar4.i(), mVar2, 54);
                int a6 = h.a(mVar2, 0);
                b0.I r3 = mVar.r();
                androidx.compose.ui.e f3 = androidx.compose.ui.c.f(mVar2, aVar);
                Qa.a a7 = aVar5.a();
                if (mVar.k() == null) {
                    h.d();
                }
                mVar.I();
                if (mVar.f()) {
                    mVar2.p(a7);
                } else {
                    mVar.s();
                }
                m b7 = m2.b(mVar);
                m2.e(b7, b6, aVar5.e());
                m2.e(b7, r3, aVar5.g());
                p b8 = aVar5.b();
                if (b7.f() || !t.c(b7.C(), Integer.valueOf(a6))) {
                    b7.t(Integer.valueOf(a6));
                    b7.J(Integer.valueOf(a6), b8);
                }
                m2.e(b7, f3, aVar5.f());
                mVar2.V(-1362156284);
                boolean isLifetime = purchaseInformation3.isLifetime();
                purchaseInformation = purchaseInformation3;
                localization = localization3;
                if (isLifetime) {
                    PurchaseStatusBadgeKt.PurchaseStatusBadge(purchaseInformation, localization, mVar2, 0);
                }
                mVar.P();
                i2 = i5;
                e = e4;
                C.b(KeyboardArrowRightKt.getKeyboardArrowRight(), (String) null, (androidx.compose.ui.e) null, e.a(mVar2, i2).w(), mVar, 48, 4);
                mVar.v();
                mVar.P();
            }
            mVar.v();
            String access$getSubtitle = PurchaseInformationCardViewKt.access$getSubtitle(purchaseInformation, localization);
            mVar2.V(-1189903813);
            if (access$getSubtitle == null) {
                i3 = i2;
                e2 = e;
                localization2 = localization;
                purchaseInformation2 = purchaseInformation;
            } else {
                i3 = i2;
                e2 = e;
                localization2 = localization;
                purchaseInformation2 = purchaseInformation;
                m0.b(access$getSubtitle, (androidx.compose.ui.e) null, r0.q(e.a(mVar2, i2).w(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, e.c(mVar2, i2).c(), mVar, 0, 0, 65530);
                I i6 = I.a;
            }
            mVar.P();
            int i7 = i3;
            E e5 = e2;
            m0.b(PurchaseInformationCardViewKt.access$getStoreText(purchaseInformation2.getStore(), localization2), (androidx.compose.ui.e) null, r0.q(e5.a(mVar, i7).w(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (Qa.l) null, e5.c(mVar, i7).c(), mVar, 0, 0, 65530);
            mVar.v();
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $isDetailedView;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ androidx.compose.ui.e $modifier;
        final /* synthetic */ Qa.a $onCardClick;
        final /* synthetic */ ButtonPosition $position;
        final /* synthetic */ PurchaseInformation $purchaseInformation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization, androidx.compose.ui.e eVar, ButtonPosition buttonPosition, boolean z, Qa.a aVar, int i, int i2) {
            super(2);
            this.$purchaseInformation = purchaseInformation;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$position = buttonPosition;
            this.$isDetailedView = z;
            this.$onCardClick = aVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$purchaseInformation, this.$localization, this.$modifier, this.$position, this.$isDetailedView, this.$onCardClick, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ PurchaseInformation $details;

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchaseInformation purchaseInformation) {
            super(2);
            this.$details = purchaseInformation;
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
                w.U(832472595, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview.<anonymous> (PurchaseInformationCardView.kt:203)");
            }
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$details, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 2, null).getLocalization(), null, null, false, 1.INSTANCE, mVar, 196608, 28);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PurchaseInformation $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchaseInformation purchaseInformation, int i) {
            super(2);
            this.$details = purchaseInformation;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseInformationCardViewKt.access$PurchaseInformationCardView_Preview(this.$details, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ PurchaseInformation $details;

        public static final class 1 extends u implements Qa.a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final void invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PurchaseInformation purchaseInformation) {
            super(2);
            this.$details = purchaseInformation;
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
                w.U(184551620, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview_Scale2.<anonymous> (PurchaseInformationCardView.kt:220)");
            }
            PurchaseInformationCardViewKt.PurchaseInformationCardView(this.$details, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 2, null).getLocalization(), null, null, false, 1.INSTANCE, mVar, 196608, 28);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PurchaseInformation $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PurchaseInformation purchaseInformation, int i) {
            super(2);
            this.$details = purchaseInformation;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            PurchaseInformationCardViewKt.access$PurchaseInformationCardView_Preview_Scale2(this.$details, mVar, g1.a(this.$$changed | 1));
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonPosition.values().length];
            try {
                iArr[ButtonPosition.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonPosition.FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonPosition.LAST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonPosition.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Store.values().length];
            try {
                iArr2[Store.APP_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Store.MAC_APP_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Store.PLAY_STORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Store.AMAZON.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Store.GALAXY.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Store.PROMOTIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Store.STRIPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[Store.EXTERNAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[Store.PADDLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[Store.RC_BILLING.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[Store.UNKNOWN_STORE.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[Store.TEST_STORE.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void PurchaseInformationCardView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r23, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r24, androidx.compose.ui.e r25, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition r26, boolean r27, Qa.a r28, b0.m r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardViewKt.PurchaseInformationCardView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, com.revenuecat.purchases.ui.revenuecatui.customercenter.views.ButtonPosition, boolean, Qa.a, b0.m, int, int):void");
    }

    private static final void PurchaseInformationCardView_Preview(PurchaseInformation purchaseInformation, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1729898988);
        if ((i & 6) == 0) {
            i2 = (i3.E(purchaseInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1729898988, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview (PurchaseInformationCardView.kt:201)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(832472595, true, new 1(purchaseInformation), i3, 54), i3, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(purchaseInformation, i));
        }
    }

    private static final void PurchaseInformationCardView_Preview_Scale2(PurchaseInformation purchaseInformation, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1576933981);
        if ((i & 6) == 0) {
            i2 = (i3.E(purchaseInformation) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1576933981, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.PurchaseInformationCardView_Preview_Scale2 (PurchaseInformationCardView.kt:218)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(i.d(184551620, true, new 1(purchaseInformation), i3, 54), i3, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(purchaseInformation, i));
        }
    }

    public static final /* synthetic */ void access$PurchaseInformationCardView_Preview(PurchaseInformation purchaseInformation, m mVar, int i) {
        PurchaseInformationCardView_Preview(purchaseInformation, mVar, i);
    }

    public static final /* synthetic */ void access$PurchaseInformationCardView_Preview_Scale2(PurchaseInformation purchaseInformation, m mVar, int i) {
        PurchaseInformationCardView_Preview_Scale2(purchaseInformation, mVar, i);
    }

    public static final /* synthetic */ String access$getStoreText(Store store, CustomerCenterConfigData.Localization localization) {
        return getStoreText(store, localization);
    }

    public static final /* synthetic */ String access$getSubtitle(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        return getSubtitle(purchaseInformation, localization);
    }

    private static final String getPrice(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        PriceDetails pricePaid = purchaseInformation.getPricePaid();
        if (pricePaid instanceof PriceDetails.Paid) {
            return ((PriceDetails.Paid) purchaseInformation.getPricePaid()).getPrice();
        }
        if (t.c(pricePaid, PriceDetails.Free.INSTANCE)) {
            return localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.FREE);
        }
        if (t.c(pricePaid, PriceDetails.Unknown.INSTANCE)) {
            return null;
        }
        throw new Ca.o();
    }

    private static final String getStoreText(Store store, CustomerCenterConfigData.Localization localization) {
        CustomerCenterConfigData.Localization.CommonLocalizedString commonLocalizedString;
        switch (WhenMappings.$EnumSwitchMapping$1[store.ordinal()]) {
            case 1:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.APP_STORE;
                break;
            case 2:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.MAC_APP_STORE;
                break;
            case 3:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.GOOGLE_PLAY_STORE;
                break;
            case 4:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.AMAZON_STORE;
                break;
            case 5:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.GALAXY_STORE;
                break;
            case 6:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.CARD_STORE_PROMOTIONAL;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.WEB_STORE;
                break;
            case 11:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.UNKNOWN_STORE;
                break;
            case 12:
                commonLocalizedString = CustomerCenterConfigData.Localization.CommonLocalizedString.TEST_STORE;
                break;
            default:
                throw new Ca.o();
        }
        return localization.commonLocalizedString(commonLocalizedString);
    }

    private static final String getSubtitle(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        ExpirationOrRenewal expirationOrRenewal = purchaseInformation.getExpirationOrRenewal();
        if (expirationOrRenewal instanceof ExpirationOrRenewal.Expiration) {
            return purchaseInformation.expirationString(((ExpirationOrRenewal.Expiration) purchaseInformation.getExpirationOrRenewal()).getDate(), localization);
        }
        if (expirationOrRenewal instanceof ExpirationOrRenewal.Renewal) {
            return purchaseInformation.renewalString(((ExpirationOrRenewal.Renewal) purchaseInformation.getExpirationOrRenewal()).getDate(), localization);
        }
        if (expirationOrRenewal == null) {
            return getPrice(purchaseInformation, localization);
        }
        throw new Ca.o();
    }
}
