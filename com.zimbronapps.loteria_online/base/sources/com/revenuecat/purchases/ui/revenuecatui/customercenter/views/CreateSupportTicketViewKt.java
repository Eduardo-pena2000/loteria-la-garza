package com.revenuecat.purchases.ui.revenuecatui.customercenter.views;

import C.n;
import Ca.I;
import F.Y;
import F.f;
import F.o;
import M0.B;
import N.x;
import O0.g;
import P0.p0;
import Qa.l;
import Qa.p;
import X.E;
import X.i0;
import X.m0;
import Z0.Y0;
import android.util.Patterns;
import androidx.compose.foundation.layout.g;
import androidx.compose.ui.e;
import b0.B1;
import b0.C0;
import b0.U1;
import b0.g1;
import b0.h;
import b0.h2;
import b0.m;
import b0.m2;
import b0.w;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.CustomerCenterConstants;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonConfig;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.composables.SettingsButtonKt;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterConfigTestData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.theme.CustomerCenterPreviewThemeKt;
import d1.H;
import d1.L;
import f1.f0;
import f1.s;
import f1.z;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import l1.k;
import t0.i;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class CreateSupportTicketViewKt {
    private static final int MAX_DESCRIPTION_LENGTH = 250;

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ DescriptionInputState $descriptionState;
        final /* synthetic */ EmailInputState $emailState;
        final /* synthetic */ boolean $isSubmitting;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(EmailInputState emailInputState, DescriptionInputState descriptionInputState, boolean z, CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$emailState = emailInputState;
            this.$descriptionState = descriptionInputState;
            this.$isSubmitting = z;
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.access$CreateSupportTicketContent(this.$emailState, this.$descriptionState, this.$isSubmitting, this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ CreateSupportTicketData $data;
        final /* synthetic */ String $initialDescription;
        final /* synthetic */ String $initialEmail;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CreateSupportTicketData createSupportTicketData, CustomerCenterConfigData.Localization localization, e eVar, String str, String str2, int i, int i2) {
            super(2);
            this.$data = createSupportTicketData;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$initialEmail = str;
            this.$initialDescription = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.CreateSupportTicketView(this.$data, this.$localization, this.$modifier, this.$initialEmail, this.$initialDescription, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CreateSupportTicketData $mockData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CreateSupportTicketData createSupportTicketData) {
            super(2);
            this.$mockData = createSupportTicketData;
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
                w.U(-1460784282, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_Preview.<anonymous> (CreateSupportTicketView.kt:126)");
            }
            e d = androidx.compose.foundation.a.d(g.f(e.a, 0.0f, 1, (Object) null), E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null);
            CreateSupportTicketData createSupportTicketData = this.$mockData;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CreateSupportTicketViewKt.CreateSupportTicketView(createSupportTicketData, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), null, null, null, mVar, 0, 28);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            CreateSupportTicketViewKt.access$CreateSupportTicketView_Preview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CreateSupportTicketData $mockData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CreateSupportTicketData createSupportTicketData) {
            super(2);
            this.$mockData = createSupportTicketData;
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
                w.U(1169956790, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_WithDataPreview.<anonymous> (CreateSupportTicketView.kt:148)");
            }
            e d = androidx.compose.foundation.a.d(androidx.compose.foundation.layout.g.f(e.a, 0.0f, 1, (Object) null), E.a.a(mVar, E.b).c(), (E1) null, 2, (Object) null);
            CreateSupportTicketData createSupportTicketData = this.$mockData;
            B h = f.h(o0.e.a.o(), false);
            int a = h.a(mVar, 0);
            b0.I r = mVar.r();
            e f = androidx.compose.ui.c.f(mVar, d);
            g.a aVar = O0.g.E8;
            Qa.a a2 = aVar.a();
            if (mVar.k() == null) {
                h.d();
            }
            mVar.I();
            if (mVar.f()) {
                mVar.p(a2);
            } else {
                mVar.s();
            }
            m b = m2.b(mVar);
            m2.e(b, h, aVar.e());
            m2.e(b, r, aVar.g());
            p b2 = aVar.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a))) {
                b.t(Integer.valueOf(a));
                b.J(Integer.valueOf(a), b2);
            }
            m2.e(b, f, aVar.f());
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.a;
            CreateSupportTicketViewKt.CreateSupportTicketView(createSupportTicketData, CustomerCenterConfigTestData.customerCenterData$default(CustomerCenterConfigTestData.INSTANCE, false, false, 3, null).getLocalization(), null, "user@example.com", "I'm having an issue with my subscription.", mVar, 27648, 4);
            mVar.v();
            if (w.L()) {
                w.T();
            }
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
            CreateSupportTicketViewKt.access$CreateSupportTicketView_WithDataPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                w.U(870248988, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField.<anonymous> (CreateSupportTicketView.kt:291)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.DESCRIPTION), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ String $remainingCharsText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(String str) {
            super(2);
            this.$remainingCharsText = str;
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
                w.U(-1857613335, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField.<anonymous> (CreateSupportTicketView.kt:298)");
            }
            m0.b(this.$remainingCharsText, (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, E.a.c(mVar, E.b).d(), mVar, 0, 0, 65534);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ DescriptionInputState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(DescriptionInputState descriptionInputState, CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$state = descriptionInputState;
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.access$DescriptionInputField(this.$state, this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                w.U(-959949005, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:249)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.INVALID_EMAIL_ERROR), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                w.U(-664568609, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:233)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.EMAIL), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 5 extends u implements p {
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 5(CustomerCenterConfigData.Localization localization) {
            super(2);
            this.$localization = localization;
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
                w.U(1544555872, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField.<anonymous> (CreateSupportTicketView.kt:240)");
            }
            m0.b(this.$localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.ENTER_EMAIL), (e) null, 0L, 0L, (H) null, (L) null, (d1.u) null, 0L, (k) null, (j) null, 0L, 0, false, 0, 0, (l) null, (Y0) null, mVar, 0, 0, 131070);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class 6 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ i $focusManager;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ EmailInputState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(EmailInputState emailInputState, CustomerCenterConfigData.Localization localization, i iVar, int i) {
            super(2);
            this.$state = emailInputState;
            this.$localization = localization;
            this.$focusManager = iVar;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.access$EmailInputField(this.$state, this.$localization, this.$focusManager, mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 2 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$default;
        final /* synthetic */ boolean $hasError;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ e $modifier;
        final /* synthetic */ Qa.a $onErrorShow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(boolean z, Qa.a aVar, CustomerCenterConfigData.Localization localization, e eVar, int i, int i2) {
            super(2);
            this.$hasError = z;
            this.$onErrorShow = aVar;
            this.$localization = localization;
            this.$modifier = eVar;
            this.$$changed = i;
            this.$$default = i2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.access$ErrorSnackbar(this.$hasError, this.$onErrorShow, this.$localization, this.$modifier, mVar, g1.a(this.$$changed | 1), this.$$default);
        }
    }

    public static final class 1 extends u implements p {
        final /* synthetic */ int $$changed;
        final /* synthetic */ String $description;
        final /* synthetic */ String $email;
        final /* synthetic */ boolean $isSubmitting;
        final /* synthetic */ CustomerCenterConfigData.Localization $localization;
        final /* synthetic */ Qa.a $onSubmit;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, boolean z, Qa.a aVar, CustomerCenterConfigData.Localization localization, int i) {
            super(2);
            this.$email = str;
            this.$description = str2;
            this.$isSubmitting = z;
            this.$onSubmit = aVar;
            this.$localization = localization;
            this.$$changed = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(m mVar, int i) {
            CreateSupportTicketViewKt.access$SubmitTicketButton(this.$email, this.$description, this.$isSubmitting, this.$onSubmit, this.$localization, mVar, g1.a(this.$$changed | 1));
        }
    }

    private static final void CreateSupportTicketContent(EmailInputState emailInputState, DescriptionInputState descriptionInputState, boolean z, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        int i2;
        m i3 = mVar.i(1823655295);
        if ((i & 6) == 0) {
            i2 = (i3.U(emailInputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(descriptionInputState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.E(localization) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(1823655295, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketContent (CreateSupportTicketView.kt:191)");
            }
            e.a aVar = e.a;
            e f = androidx.compose.foundation.layout.g.f(aVar, 0.0f, 1, (Object) null);
            CustomerCenterConstants.Layout layout = CustomerCenterConstants.Layout.INSTANCE;
            e f2 = androidx.compose.foundation.e.f(androidx.compose.foundation.layout.f.i(f, layout.getSECTION_SPACING-D9Ej5fM()), androidx.compose.foundation.e.c(0, i3, 0, 1), false, (n) null, false, 14, (Object) null);
            B a = F.l.a(F.c.a.h(), o0.e.a.k(), i3, 0);
            int a2 = h.a(i3, 0);
            b0.I r = i3.r();
            e f3 = androidx.compose.ui.c.f(i3, f2);
            g.a aVar2 = O0.g.E8;
            Qa.a a3 = aVar2.a();
            if (i3.k() == null) {
                h.d();
            }
            i3.I();
            if (i3.f()) {
                i3.p(a3);
            } else {
                i3.s();
            }
            m b = m2.b(i3);
            m2.e(b, a, aVar2.e());
            m2.e(b, r, aVar2.g());
            p b2 = aVar2.b();
            if (b.f() || !t.c(b.C(), Integer.valueOf(a2))) {
                b.t(Integer.valueOf(a2));
                b.J(Integer.valueOf(a2), b2);
            }
            m2.e(b, f3, aVar2.f());
            o oVar = o.a;
            int i4 = (i2 >> 6) & 112;
            EmailInputField(emailInputState, localization, (i) i3.x(p0.f()), i3, (i2 & 14) | i4);
            Y.a(androidx.compose.foundation.layout.g.i(aVar, layout.getSECTION_TITLE_BOTTOM_PADDING-D9Ej5fM()), i3, 6);
            DescriptionInputField(descriptionInputState, localization, i3, ((i2 >> 3) & 14) | i4);
            Y.a(androidx.compose.foundation.layout.g.i(aVar, layout.getSECTION_SPACING-D9Ej5fM()), i3, 6);
            SubmitTicketButton(emailInputState.getEmail(), descriptionInputState.getDescription(), z, descriptionInputState.getOnSubmit(), localization, i3, (i2 & 896) | ((i2 << 3) & 57344));
            i3.v();
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 2(emailInputState, descriptionInputState, z, localization, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void CreateSupportTicketView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData r34, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r35, androidx.compose.ui.e r36, java.lang.String r37, java.lang.String r38, b0.m r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketViewKt.CreateSupportTicketView(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, androidx.compose.ui.e, java.lang.String, java.lang.String, b0.m, int, int):void");
    }

    private static final String CreateSupportTicketView$lambda$1(C0 c0) {
        return (String) c0.getValue();
    }

    private static final boolean CreateSupportTicketView$lambda$10(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void CreateSupportTicketView$lambda$11(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final boolean CreateSupportTicketView$lambda$12(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void CreateSupportTicketView$lambda$13(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final void CreateSupportTicketView$lambda$2(C0 c0, String str) {
        c0.setValue(str);
    }

    private static final boolean CreateSupportTicketView$lambda$3(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void CreateSupportTicketView$lambda$4(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final boolean CreateSupportTicketView$lambda$5(C0 c0) {
        return ((Boolean) c0.getValue()).booleanValue();
    }

    private static final void CreateSupportTicketView$lambda$6(C0 c0, boolean z) {
        c0.setValue(Boolean.valueOf(z));
    }

    private static final String CreateSupportTicketView$lambda$8(C0 c0) {
        return (String) c0.getValue();
    }

    private static final void CreateSupportTicketView$lambda$9(C0 c0, String str) {
        c0.setValue(str);
    }

    private static final void CreateSupportTicketView_Preview(m mVar, int i) {
        m i2 = mVar.i(1094842373);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1094842373, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_Preview (CreateSupportTicketView.kt:119)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(j0.i.d(-1460784282, true, new 1(new CreateSupportTicketData(CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$1.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$2.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_Preview$mockData$3.INSTANCE)), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void CreateSupportTicketView_WithDataPreview(m mVar, int i) {
        m i2 = mVar.i(1452070229);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1452070229, i, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.CreateSupportTicketView_WithDataPreview (CreateSupportTicketView.kt:141)");
            }
            CustomerCenterPreviewThemeKt.CustomerCenterPreviewTheme(j0.i.d(1169956790, true, new 1(new CreateSupportTicketData(CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$1.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$2.INSTANCE, CreateSupportTicketViewKt$CreateSupportTicketView_WithDataPreview$mockData$3.INSTANCE)), i2, 54), i2, 6);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final void DescriptionInputField(DescriptionInputState descriptionInputState, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(-202186622);
        if ((i & 6) == 0) {
            i2 = (i3.U(descriptionInputState) ? 4 : 2) | i;
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
                w.U(-202186622, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.DescriptionInputField (CreateSupportTicketView.kt:278)");
            }
            String H = Za.B.H(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.CHARACTERS_REMAINING), "{{ count }}", descriptionInputState.getDescription().length() + " / 250", false, 4, null);
            h2 o = U1.o(descriptionInputState.getOnSubmit(), i3, 0);
            String description = descriptionInputState.getDescription();
            l onDescriptionChange = descriptionInputState.getOnDescriptionChange();
            boolean enabled = descriptionInputState.getEnabled();
            e a = androidx.compose.ui.platform.i.a(androidx.compose.foundation.layout.g.i(androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null), n1.h.g(200)), "description_field");
            x xVar = new x(0, (Boolean) null, 0, s.b.b(), (f1.L) null, (Boolean) null, (h1.e) null, 119, (kotlin.jvm.internal.k) null);
            i3.V(248605445);
            boolean U = i3.U(o) | ((i2 & 14) == 4);
            Object C = i3.C();
            if (U || C == m.a.a()) {
                C = new CreateSupportTicketViewKt$DescriptionInputField$1$1(descriptionInputState, o);
                i3.t(C);
            }
            i3.P();
            N.w wVar = new N.w((l) C, (l) null, (l) null, (l) null, (l) null, (l) null, 62, (kotlin.jvm.internal.k) null);
            j0.b d = j0.i.d(870248988, true, new 2(localization), i3, 54);
            j0.b d2 = j0.i.d(-1857613335, true, new 3(H), i3, 54);
            mVar2 = i3;
            X.I.a(description, onDescriptionChange, a, enabled, false, (Y0) null, d, (p) null, (p) null, (p) null, (p) null, (p) null, d2, false, (f0) null, xVar, wVar, false, 10, 6, (E.m) null, (E1) null, (i0) null, mVar2, 1573248, 906166656, 0, 7499696);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 4(descriptionInputState, localization, i));
        }
    }

    private static final Qa.a DescriptionInputField$lambda$23(h2 h2Var) {
        return (Qa.a) h2Var.getValue();
    }

    private static final void EmailInputField(EmailInputState emailInputState, CustomerCenterConfigData.Localization localization, i iVar, m mVar, int i) {
        int i2;
        m mVar2;
        m i3 = mVar.i(449665849);
        if ((i & 6) == 0) {
            i2 = (i3.U(emailInputState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.E(localization) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.E(iVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && i3.j()) {
            i3.M();
            mVar2 = i3;
        } else {
            if (w.L()) {
                w.U(449665849, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.EmailInputField (CreateSupportTicketView.kt:228)");
            }
            String email = emailInputState.getEmail();
            l onEmailChange = emailInputState.getOnEmailChange();
            boolean showError = emailInputState.getShowError();
            i3.V(464966584);
            p d = emailInputState.getShowError() ? j0.i.d(-959949005, true, new 1(localization), i3, 54) : null;
            i3.P();
            boolean enabled = emailInputState.getEnabled();
            e h = androidx.compose.foundation.layout.g.h(e.a, 0.0f, 1, (Object) null);
            i3.V(464980338);
            boolean z = (i2 & 14) == 4;
            Object C = i3.C();
            if (z || C == m.a.a()) {
                C = new CreateSupportTicketViewKt$EmailInputField$2$1(emailInputState);
                i3.t(C);
            }
            i3.P();
            e a = androidx.compose.ui.platform.i.a(androidx.compose.ui.focus.b.a(h, (l) C), "email_field");
            x xVar = new x(0, (Boolean) null, z.b.c(), s.b.d(), (f1.L) null, (Boolean) null, (h1.e) null, 115, (kotlin.jvm.internal.k) null);
            i3.V(464991337);
            boolean E = i3.E(iVar);
            Object C2 = i3.C();
            if (E || C2 == m.a.a()) {
                C2 = new CreateSupportTicketViewKt$EmailInputField$3$1(iVar);
                i3.t(C2);
            }
            i3.P();
            mVar2 = i3;
            X.I.a(email, onEmailChange, a, enabled, false, (Y0) null, j0.i.d(-664568609, true, new 4(localization), i3, 54), j0.i.d(1544555872, true, new 5(localization), i3, 54), (p) null, (p) null, (p) null, (p) null, d, showError, (f0) null, xVar, new N.w((l) null, (l) null, (l) C2, (l) null, (l) null, (l) null, 59, (kotlin.jvm.internal.k) null), true, 0, 0, (E.m) null, (E1) null, (i0) null, mVar2, 14155776, 12779520, 0, 8146736);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = mVar2.l();
        if (l != null) {
            l.a(new 6(emailInputState, localization, iVar, i));
        }
    }

    /*  JADX ERROR: IIiLliI1l1li1 in pass: ConstructorVisitor
        LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r6v5 ??, still in use, count: 1, list:
          (r6v5 ?? I:java.lang.Object) from 0x00fa: INVOKE (r1v1 ?? I:b0.m), (r6v5 ?? I:java.lang.Object) INTERFACE call: b0.m.t(java.lang.Object):void (LINE:251)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:42)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:68)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:8)
        */
    private static final void ErrorSnackbar(
    /*  JADX ERROR: IIiLliI1l1li1 in pass: ConstructorVisitor
        LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r6v5 ??, still in use, count: 1, list:
          (r6v5 ?? I:java.lang.Object) from 0x00fa: INVOKE (r1v1 ?? I:b0.m), (r6v5 ?? I:java.lang.Object) INTERFACE call: b0.m.t(java.lang.Object):void (LINE:251)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:42)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:68)
        */
    /*  JADX ERROR: Method generation error
        LI11I1ll1Ii11.IIiLliI1l1li1: Code variable not set in r16v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:29)
        	at IIiLII1lL1llIlI.L111LiLLi1iiliL.lILLi11Li1lll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:45)
        	at IIiLII1lL1llIlI.L111LiLLi1iiliL.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:468)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iLIi1LlIlIil1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:62)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:23)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.LlIIlIliLlL1IiL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:16)
        	at IIiLII1lL1llIlI.IIiLliI1l1li1.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0.accept(D8$$SyntheticClass:0)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:263)
        	at java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:301)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:575)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:564)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:135)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:267)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:657)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iIiLL1lI11ii(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:62)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.IIiLliI1l1li1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:64)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:2)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:25)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iLlIlilL1lI1Il(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:26)
        	at IIiLII1lL1llIlI.ilI1I1iIilII.call(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:3)
        	at IIiLII1lL1llIlI.iiiIlilLli1.il11il1iIii1lIl(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at IIiLII1lL1llIlI.iiiIlilLli1.LlIIlIliLlL1IiL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:11)
        	at IIiLII1lL1llIlI.iiiIlilLli1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:51)
        	at L1LIIiIlIIL1i.il11il1iIii1lIl.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:152)
        	at L1LIIiIlIIL1i.il11il1iIii1lIl.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.nodes.ClassNode.decompile(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.nodes.ClassNode.getCode(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:2)
        */

    private static final Qa.a ErrorSnackbar$lambda$26(h2 h2Var) {
        return (Qa.a) h2Var.getValue();
    }

    private static final void SubmitTicketButton(String str, String str2, boolean z, Qa.a aVar, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        int i2;
        m i3 = mVar.i(-1201248039);
        if ((i & 6) == 0) {
            i2 = (i3.U(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= i3.U(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= i3.a(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= i3.E(aVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= i3.E(localization) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && i3.j()) {
            i3.M();
        } else {
            if (w.L()) {
                w.U(-1201248039, i2, -1, "com.revenuecat.purchases.ui.revenuecatui.customercenter.views.SubmitTicketButton (CreateSupportTicketView.kt:324)");
            }
            SettingsButtonKt.SettingsButton(localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SUBMIT_TICKET), aVar, new SettingsButtonConfig((z || !isValidEmail(str) || Za.E.h0(str2)) ? false : true, z), null, null, i3, (i2 >> 6) & 112, 24);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i3.l();
        if (l != null) {
            l.a(new 1(str, str2, z, aVar, localization, i));
        }
    }

    public static final /* synthetic */ void access$CreateSupportTicketContent(EmailInputState emailInputState, DescriptionInputState descriptionInputState, boolean z, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        CreateSupportTicketContent(emailInputState, descriptionInputState, z, localization, mVar, i);
    }

    public static final /* synthetic */ String access$CreateSupportTicketView$lambda$1(C0 c0) {
        return CreateSupportTicketView$lambda$1(c0);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$11(C0 c0, boolean z) {
        CreateSupportTicketView$lambda$11(c0, z);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$13(C0 c0, boolean z) {
        CreateSupportTicketView$lambda$13(c0, z);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$2(C0 c0, String str) {
        CreateSupportTicketView$lambda$2(c0, str);
    }

    public static final /* synthetic */ boolean access$CreateSupportTicketView$lambda$3(C0 c0) {
        return CreateSupportTicketView$lambda$3(c0);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$4(C0 c0, boolean z) {
        CreateSupportTicketView$lambda$4(c0, z);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$6(C0 c0, boolean z) {
        CreateSupportTicketView$lambda$6(c0, z);
    }

    public static final /* synthetic */ String access$CreateSupportTicketView$lambda$8(C0 c0) {
        return CreateSupportTicketView$lambda$8(c0);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView$lambda$9(C0 c0, String str) {
        CreateSupportTicketView$lambda$9(c0, str);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView_Preview(m mVar, int i) {
        CreateSupportTicketView_Preview(mVar, i);
    }

    public static final /* synthetic */ void access$CreateSupportTicketView_WithDataPreview(m mVar, int i) {
        CreateSupportTicketView_WithDataPreview(mVar, i);
    }

    public static final /* synthetic */ void access$DescriptionInputField(DescriptionInputState descriptionInputState, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        DescriptionInputField(descriptionInputState, localization, mVar, i);
    }

    public static final /* synthetic */ Qa.a access$DescriptionInputField$lambda$23(h2 h2Var) {
        return DescriptionInputField$lambda$23(h2Var);
    }

    public static final /* synthetic */ void access$EmailInputField(EmailInputState emailInputState, CustomerCenterConfigData.Localization localization, i iVar, m mVar, int i) {
        EmailInputField(emailInputState, localization, iVar, mVar, i);
    }

    public static final /* synthetic */ void access$ErrorSnackbar(boolean z, Qa.a aVar, CustomerCenterConfigData.Localization localization, e eVar, m mVar, int i, int i2) {
        ErrorSnackbar(z, aVar, localization, eVar, mVar, i, i2);
    }

    public static final /* synthetic */ Qa.a access$ErrorSnackbar$lambda$26(h2 h2Var) {
        return ErrorSnackbar$lambda$26(h2Var);
    }

    public static final /* synthetic */ void access$SubmitTicketButton(String str, String str2, boolean z, Qa.a aVar, CustomerCenterConfigData.Localization localization, m mVar, int i) {
        SubmitTicketButton(str, str2, z, aVar, localization, mVar, i);
    }

    private static final boolean isValidEmail(String str) {
        return !Za.E.h0(str) && Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }
}
