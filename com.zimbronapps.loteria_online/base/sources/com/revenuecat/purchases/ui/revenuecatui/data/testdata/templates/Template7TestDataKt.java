package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import Ca.x;
import Da.Q;
import Da.S;
import Da.v;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template7TestDataKt {
    public static final PaywallData getTemplate7(TestData testData) {
        t.g(testData, "<this>");
        List n = v.n();
        Map l = S.l(x.a("basic", new PaywallData.Configuration.Images("954459_1703109702.png", (String) null, (String) null, 6, (k) null)), x.a("standard", new PaywallData.Configuration.Images("954459_1692992845.png", (String) null, (String) null, 6, (k) null)), x.a("premium", new PaywallData.Configuration.Images("954459_1701267532.jpeg", (String) null, (String) null, 6, (k) null)));
        PackageType packageType = PackageType.ANNUAL;
        String identifier = packageType.getIdentifier();
        t.d(identifier);
        String identifier2 = PackageType.MONTHLY.getIdentifier();
        t.d(identifier2);
        List q = v.q(identifier, identifier2);
        String identifier3 = packageType.getIdentifier();
        t.d(identifier3);
        PaywallData.Configuration.Tier tier = new PaywallData.Configuration.Tier("basic", q, identifier3);
        String identifier4 = PackageType.TWO_MONTH.getIdentifier();
        t.d(identifier4);
        PackageType packageType2 = PackageType.SIX_MONTH;
        String identifier5 = packageType2.getIdentifier();
        t.d(identifier5);
        List q2 = v.q(identifier4, identifier5);
        String identifier6 = packageType2.getIdentifier();
        t.d(identifier6);
        PaywallData.Configuration.Tier tier2 = new PaywallData.Configuration.Tier("standard", q2, identifier6);
        PackageType packageType3 = PackageType.THREE_MONTH;
        String identifier7 = packageType3.getIdentifier();
        t.d(identifier7);
        String identifier8 = PackageType.LIFETIME.getIdentifier();
        t.d(identifier8);
        List q3 = v.q(identifier7, identifier8);
        String identifier9 = packageType3.getIdentifier();
        t.d(identifier9);
        PaywallData.Configuration configuration = new PaywallData.Configuration(n, (String) null, (PaywallData.Configuration.Images) null, (PaywallData.Configuration.Images) null, l, false, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#45c186"), new PaywallColor("#ffffff"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32716, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null), S.l(x.a("basic", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#3fc1f7"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#2d7fc1"), new PaywallColor("#7676801F"), new PaywallColor("#100031"), (PaywallColor) null, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#2d7fc1"), new PaywallColor("#000000"), 1088, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null)), x.a("standard", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#da4079"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#cd0654"), new PaywallColor("#7676801F"), new PaywallColor("#310217"), (PaywallColor) null, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#cd0654"), new PaywallColor("#000000"), 1088, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null)), x.a("premium", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#94d269"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#76c343"), new PaywallColor("#7676801F"), new PaywallColor("#213711"), (PaywallColor) null, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#76c343"), new PaywallColor("#000000"), 1088, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null))), v.q(tier, tier2, new PaywallData.Configuration.Tier("premium", q3, identifier9)), (String) null, 4142, (k) null);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData((String) null, "7", configuration, constants.getAssetBaseURL(), 0, Q.f(x.a("en_US", new PaywallData.LocalizedConfiguration("Get started with our Basic plan", (String) null, "{{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}", (String) null, "{{ sub_period }}", v.q(new PaywallData.LocalizedConfiguration.Feature("Access to 10 cinematic LUTs", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("Standard fonts", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("2 templates", (String) null, "tick", 2, (k) null)), "Basic", (Map) null, 2194, (k) null))), Q.f(x.a("en_US", S.l(x.a("basic", new PaywallData.LocalizedConfiguration("Get started with our Basic plan", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", v.q(new PaywallData.LocalizedConfiguration.Feature("Access to 10 cinematic LUTs", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("Standard fonts", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("2 templates", (String) null, "tick", 2, (k) null)), "Basic", (Map) null, 2194, (k) null)), x.a("standard", new PaywallData.LocalizedConfiguration("Get started with our Standard plan", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", v.q(new PaywallData.LocalizedConfiguration.Feature("Access to 30 cinematic LUTs", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("Pro fonts and transition effects", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("10+ templates", (String) null, "tick", 2, (k) null)), "Standard", (Map) null, 2194, (k) null)), x.a("premium", new PaywallData.LocalizedConfiguration("Master the art of video editing", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", v.q(new PaywallData.LocalizedConfiguration.Feature("Access to all 150 of our cinematic LUTs", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("Custom design tools and transition effects", (String) null, "tick", 2, (k) null), new PaywallData.LocalizedConfiguration.Feature("100+ exclusive templates", (String) null, "tick", 2, (k) null)), "Premium", (Map) null, 2194, (k) null))))), constants.getZeroDecimalPlaceCountries(), (String) null, 273, (k) null);
    }
}
