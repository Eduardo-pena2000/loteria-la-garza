package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import Ca.x;
import Da.Q;
import Da.v;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Template4TestDataKt {
    public static final PaywallData getTemplate4(TestData testData) {
        t.g(testData, "<this>");
        String id = PaywallTemplate.TEMPLATE_4.getId();
        String identifier = PackageType.MONTHLY.getIdentifier();
        t.d(identifier);
        PackageType packageType = PackageType.SIX_MONTH;
        String identifier2 = packageType.getIdentifier();
        t.d(identifier2);
        String identifier3 = PackageType.ANNUAL.getIdentifier();
        t.d(identifier3);
        String identifier4 = PackageType.WEEKLY.getIdentifier();
        t.d(identifier4);
        List q = v.q(identifier, identifier2, identifier3, identifier4);
        String identifier5 = packageType.getIdentifier();
        t.d(identifier5);
        PaywallData.Configuration configuration = new PaywallData.Configuration(q, identifier5, new PaywallData.Configuration.Images((String) null, "300883_1690710097.jpg", (String) null, 5, (k) null), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#111111"), new PaywallColor("#333333"), new PaywallColor("#999999"), new PaywallColor("#06357D"), new PaywallColor("#FFFFFF"), (PaywallColor) null, new PaywallColor("#D4B5FC"), new PaywallColor("#DFDFDF"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32320, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null), (Map) null, (List) null, false, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), 232, (k) null);
        Map f = Q.f(x.a("en_US", new PaywallData.LocalizedConfiguration("Get _unlimited_ access", (String) null, "Continue", (String) null, (String) null, "Cancel anytime", "Includes {{ sub_offer_duration }} **free** trial", (String) null, "{{ sub_duration_in_months }}", (List) null, (String) null, (Map) null, 3738, (k) null)));
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData((String) null, id, configuration, constants.getAssetBaseURL(), 0, f, (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 337, (k) null);
    }
}
