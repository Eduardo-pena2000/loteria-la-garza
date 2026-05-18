package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import Ca.x;
import Da.S;
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
public final class Template2TestDataKt {
    public static final PaywallData getTemplate2(TestData testData) {
        t.g(testData, "<this>");
        String id = PaywallTemplate.TEMPLATE_2.getId();
        String identifier = PackageType.ANNUAL.getIdentifier();
        t.d(identifier);
        PackageType packageType = PackageType.MONTHLY;
        String identifier2 = packageType.getIdentifier();
        t.d(identifier2);
        String identifier3 = PackageType.LIFETIME.getIdentifier();
        t.d(identifier3);
        List q = v.q(identifier, identifier2, identifier3);
        String identifier4 = packageType.getIdentifier();
        t.d(identifier4);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData((String) null, id, new PaywallData.Configuration(q, identifier4, constants.getImages(), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#EC807C"), new PaywallColor("#FFFFFF"), new PaywallColor("#FC609C"), new PaywallColor("#BC66FF"), new PaywallColor("#222222"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32268, (k) null), (PaywallData.Configuration.Colors) null, 2, (k) null), (Map) null, (List) null, true, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), 104, (k) null), constants.getAssetBaseURL(), 0, S.l(x.a("en_US", new PaywallData.LocalizedConfiguration("Call to **action** for _better_ conversion.", "**Lorem ipsum** is simply ~dummy~ text of the _printing_ and *typesetting* industry.", "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3728, (k) null)), x.a("es_ES", new PaywallData.LocalizedConfiguration("Título en español", "Un lorem ipsum en español que es más largo para mostrar un subtítulo multilinea.", "Suscribete for {{ price_per_period }}", "Empieza tu prueba gratuita de {{ sub_offer_duration }}", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} con {{ sub_offer_duration }} de prueba", (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3728, (k) null))), (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 337, (k) null);
    }
}
