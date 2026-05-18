package com.revenuecat.purchases.ui.revenuecatui.extensions;

import Ca.I;
import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import Qa.a;
import Qa.p;
import X.E;
import X.l;
import b0.B1;
import b0.g1;
import b0.m;
import b0.w;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.InternalPaywallKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.s0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallDataExtensionsKt {

    public static final class 1 extends u implements a {
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
            PaywallDataExtensionsKt.DefaultPaywallFooterCondensedPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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
            PaywallDataExtensionsKt.DefaultPaywallFooterPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final class 1 extends u implements a {
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
            PaywallDataExtensionsKt.DefaultPaywallPreview(mVar, g1.a(this.$$changed | 1));
        }
    }

    public static final void DefaultPaywallFooterCondensedPreview(m mVar, int i) {
        m i2 = mVar.i(-1110154474);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(-1110154474, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterCondensedPreview (PaywallDataExtensions.kt:168)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER_CONDENSED, getDefaultPreviewOffering(i2, 0), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final void DefaultPaywallFooterPreview(m mVar, int i) {
        m i2 = mVar.i(1073266441);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1073266441, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallFooterPreview (PaywallDataExtensions.kt:159)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(PaywallMode.FOOTER, getDefaultPreviewOffering(i2, 0), null, false, false, 28, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    public static final void DefaultPaywallPreview(m mVar, int i) {
        m i2 = mVar.i(1231396708);
        if (i == 0 && i2.j()) {
            i2.M();
        } else {
            if (w.L()) {
                w.U(1231396708, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.DefaultPaywallPreview (PaywallDataExtensions.kt:150)");
            }
            InternalPaywallKt.InternalPaywall(new PaywallOptions.Builder(1.INSTANCE).build(), new MockViewModel(null, getDefaultPreviewOffering(i2, 0), null, false, false, 29, null), i2, 0, 0);
            if (w.L()) {
                w.T();
            }
        }
        B1 l = i2.l();
        if (l != null) {
            l.a(new 2(i));
        }
    }

    private static final PaywallColor asPaywallColor-8_81llA(long j) {
        return new PaywallColor(s0.k(j));
    }

    public static final PaywallData createDefault(PaywallData.Companion companion, List packages, l currentColorScheme, ResourceProvider resourceProvider) {
        t.g(companion, "<this>");
        t.g(packages, "packages");
        t.g(currentColorScheme, "currentColorScheme");
        t.g(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.Companion;
        ArrayList arrayList = new ArrayList(Da.w.y(packages, 10));
        Iterator it = packages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).getIdentifier());
        }
        return createDefaultForIdentifiers(companion2, arrayList, currentColorScheme, resourceProvider);
    }

    public static final PaywallData createDefaultForIdentifiers(PaywallData.Companion companion, List packageIdentifiers, l currentColors, ResourceProvider resourceProvider) {
        t.g(companion, "<this>");
        t.g(packageIdentifiers, "packageIdentifiers");
        t.g(currentColors, "currentColors");
        t.g(resourceProvider, "resourceProvider");
        PaywallData.Companion companion2 = PaywallData.Companion;
        return new PaywallData((String) null, getDefaultTemplate(companion2).getId(), new PaywallData.Configuration(packageIdentifiers, (String) null, new PaywallData.Configuration.Images((String) null, getDefaultBackgroundPlaceholder(companion2), getDefaultAppIconPlaceholder(companion2), 1, (k) null), (Map) null, defaultColors(companion2, currentColors), (Map) null, (List) null, true, true, (URL) null, (URL) null, 1642, (k) null), getDefaultTemplateBaseURL(companion2), getRevisionID(companion2), Q.f(x.a(resourceProvider.getLocale().toString(), defaultLocalization(companion2, resourceProvider))), (Map) null, getZeroDecimalPlaceCountries(companion2), (String) null, 321, (k) null);
    }

    private static final PaywallData.Configuration.ColorInformation defaultColors(PaywallData.Companion companion, l lVar) {
        PaywallData.Configuration.Colors themeColors = getThemeColors(lVar);
        return new PaywallData.Configuration.ColorInformation(themeColors, themeColors);
    }

    private static final PaywallData.LocalizedConfiguration defaultLocalization(PaywallData.Companion companion, ResourceProvider resourceProvider) {
        return new PaywallData.LocalizedConfiguration("{{ app_name }}", (String) null, resourceProvider.getString(R.string.continue_cta, new Object[0]), (String) null, (String) null, "{{ total_price_and_per_month }}", resourceProvider.getString(R.string.default_offer_details_with_intro_offer, new Object[0]), (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3738, (k) null);
    }

    public static final String getDefaultAppIconPlaceholder(PaywallData.Companion companion) {
        t.g(companion, "<this>");
        return "revenuecatui_default_paywall_app_icon";
    }

    public static final String getDefaultBackgroundPlaceholder(PaywallData.Companion companion) {
        t.g(companion, "<this>");
        return "revenuecatui_default_paywall_background";
    }

    private static final Offering getDefaultPreviewOffering(m mVar, int i) {
        mVar.V(-363130030);
        if (w.L()) {
            w.U(-363130030, i, -1, "com.revenuecat.purchases.ui.revenuecatui.extensions.getDefaultPreviewOffering (PaywallDataExtensions.kt:127)");
        }
        TestData.Packages packages = TestData.Packages.INSTANCE;
        List q = v.q(packages.getWeekly(), packages.getMonthly(), packages.getAnnual());
        Offering offering = new Offering("Template2", "", S.h(), q, createDefault(PaywallData.Companion, q, E.a.a(mVar, E.b), new MockResourceProvider(null, null, null, null, null, 31, null)), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        if (w.L()) {
            w.T();
        }
        mVar.P();
        return offering;
    }

    public static final PaywallTemplate getDefaultTemplate(PaywallData.Companion companion) {
        t.g(companion, "<this>");
        return PaywallTemplate.TEMPLATE_2;
    }

    private static final URL getDefaultTemplateBaseURL(PaywallData.Companion companion) {
        return new URL("https://");
    }

    private static final int getRevisionID(PaywallData.Companion companion) {
        return -1;
    }

    private static final PaywallData.Configuration.Colors getThemeColors(l lVar) {
        return new PaywallData.Configuration.Colors(asPaywallColor-8_81llA(lVar.c()), asPaywallColor-8_81llA(lVar.o()), (PaywallColor) null, (PaywallColor) null, asPaywallColor-8_81llA(lVar.F()), asPaywallColor-8_81llA(lVar.c()), (PaywallColor) null, asPaywallColor-8_81llA(lVar.C()), asPaywallColor-8_81llA(lVar.n()), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32332, (k) null);
    }

    private static final List getZeroDecimalPlaceCountries(PaywallData.Companion companion) {
        return v.n();
    }
}
