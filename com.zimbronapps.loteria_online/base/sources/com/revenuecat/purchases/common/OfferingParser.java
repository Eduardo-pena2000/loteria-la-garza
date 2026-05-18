package com.revenuecat.purchases.common;

import Da.S;
import com.revenuecat.purchases.JsonTools;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.OfferingsKt;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class OfferingParser {
    public static /* synthetic */ Offerings createOfferings$default(OfferingParser offeringParser, JSONObject jSONObject, Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOfferings");
        }
        if ((i & 4) != 0) {
            hTTPResponseOriginalSource = HTTPResponseOriginalSource.MAIN;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        return offeringParser.createOfferings(jSONObject, map, hTTPResponseOriginalSource, z);
    }

    public final Offering createOffering(JSONObject jSONObject, Map map, UiConfig uiConfig) {
        Map h;
        PaywallData paywallData;
        PaywallData paywallData2;
        PaywallComponentsData paywallComponentsData;
        t.g(jSONObject, "offeringJson");
        t.g(map, "productsById");
        String string = jSONObject.getString("identifier");
        JSONObject optJSONObject = jSONObject.optJSONObject("metadata");
        if (optJSONObject == null || (h = JSONObjectExtensionsKt.toMap(optJSONObject, true)) == null) {
            h = S.h();
        }
        Map map2 = h;
        JSONArray jSONArray = jSONObject.getJSONArray("packages");
        t.f(string, "offeringIdentifier");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(string);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            t.f(jSONObject2, "packageJson");
            Package createPackage = createPackage(jSONObject2, map, presentedOfferingContext);
            if (createPackage != null) {
                arrayList.add(createPackage);
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("paywall");
        if (optJSONObject2 != null) {
            try {
                tb.b json = JsonTools.INSTANCE.getJson();
                String jSONObject3 = optJSONObject2.toString();
                t.f(jSONObject3, "it.toString()");
                json.a();
                paywallData = (PaywallData) json.d(PaywallData.Companion.serializer(), jSONObject3);
            } catch (Exception e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing paywall data", e);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("paywall_components");
        if (optJSONObject3 != null) {
            try {
                tb.b json2 = JsonTools.INSTANCE.getJson();
                String jSONObject4 = optJSONObject3.toString();
                t.f(jSONObject4, "it.toString()");
                json2.a();
                paywallComponentsData = (PaywallComponentsData) json2.d(PaywallComponentsData.Companion.serializer(), jSONObject4);
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing paywall components data", th);
            }
        } else {
            paywallComponentsData = null;
        }
        Offering.PaywallComponents paywallComponents = (paywallComponentsData == null || uiConfig == null) ? null : new Offering.PaywallComponents(uiConfig, paywallComponentsData);
        URL access$getWebCheckoutURL = OfferingParserKt.access$getWebCheckoutURL(jSONObject);
        if (arrayList.isEmpty()) {
            return null;
        }
        String string2 = jSONObject.getString("description");
        t.f(string2, "offeringJson.getString(\"description\")");
        return new Offering(string, string2, map2, arrayList, paywallData2, paywallComponents, access$getWebCheckoutURL);
    }

    public final Offerings createOfferings(JSONObject jSONObject, Map map) {
        t.g(jSONObject, "offeringsJson");
        t.g(map, "productsById");
        return createOfferings$default(this, jSONObject, map, null, false, 12, null);
    }

    public final Package createPackage(JSONObject jSONObject, Map map, PresentedOfferingContext presentedOfferingContext) {
        t.g(jSONObject, "packageJson");
        t.g(map, "productsById");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        String string = jSONObject.getString("identifier");
        StoreProduct findMatchingProduct = findMatchingProduct(map, jSONObject);
        t.f(string, "packageIdentifier");
        PackageType access$toPackageType = OfferingParserKt.access$toPackageType(string);
        URL access$getWebCheckoutURL = OfferingParserKt.access$getWebCheckoutURL(jSONObject);
        if (findMatchingProduct != null) {
            return new Package(string, access$toPackageType, findMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, access$getWebCheckoutURL);
        }
        return null;
    }

    public abstract StoreProduct findMatchingProduct(Map map, JSONObject jSONObject);

    public final Offerings createOfferings(JSONObject jSONObject, Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource) {
        t.g(jSONObject, "offeringsJson");
        t.g(map, "productsById");
        t.g(hTTPResponseOriginalSource, "originalSource");
        return createOfferings$default(this, jSONObject, map, hTTPResponseOriginalSource, false, 8, null);
    }

    public final Offerings createOfferings(JSONObject jSONObject, Map map, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z) {
        UiConfig uiConfig;
        Offerings.Targeting targeting;
        Offerings.Placements placements;
        Map map$default;
        Offerings.Targeting targeting2;
        LogHandler currentLogHandler;
        String str;
        String str2;
        t.g(jSONObject, "offeringsJson");
        t.g(map, "productsById");
        t.g(hTTPResponseOriginalSource, "originalSource");
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingParser$createOfferings$$inlined$log$1 offeringParser$createOfferings$$inlined$log$1 = new OfferingParser$createOfferings$$inlined$log$1(logIntent, map);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringParser$createOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringParser$createOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringParser$createOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        String string = jSONObject.getString("current_offering_id");
        JSONObject optJSONObject = jSONObject.optJSONObject("ui_config");
        if (optJSONObject != null) {
            try {
                tb.b json = JsonTools.INSTANCE.getJson();
                String jSONObject2 = optJSONObject.toString();
                t.f(jSONObject2, "it.toString()");
                json.a();
                uiConfig = (UiConfig) json.d(UiConfig.Companion.serializer(), jSONObject2);
            } catch (Throwable th) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Error deserializing ui_config", th);
            }
        } else {
            uiConfig = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            t.f(jSONObject3, "offeringJson");
            Offering createOffering = createOffering(jSONObject3, map, uiConfig);
            if (createOffering != null) {
                linkedHashMap.put(createOffering.getIdentifier(), createOffering);
                if (createOffering.getAvailablePackages().isEmpty()) {
                    LogLevel logLevel11 = LogLevel.WARN;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        String str3 = "[Purchases] - " + logLevel11.name();
                        String format = String.format("There's a problem with your configuration. No packages could be found for offering with identifier %s. This could be due to Products not being configured correctly in the RevenueCat dashboard or Play Store.\nTo configure products, follow the instructions in https://rev.cat/how-to-configure-offerings.\nMore information: https://rev.cat/why-are-offerings-empty", Arrays.copyOf(new Object[]{createOffering.getIdentifier()}, 1));
                        t.f(format, "format(...)");
                        currentLogHandler8.w(str3, format);
                    }
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("targeting");
        if (optJSONObject2 != null) {
            Integer optNullableInt = JSONObjectExtensionsKt.optNullableInt(optJSONObject2, "revision");
            String optNullableString = JSONObjectExtensionsKt.optNullableString(optJSONObject2, "rule_id");
            if (optNullableInt != null && optNullableString != null) {
                targeting2 = new Offerings.Targeting(optNullableInt.intValue(), optNullableString);
            } else {
                LogLevel logLevel12 = LogLevel.WARN;
                LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                    currentLogHandler9.w("[Purchases] - " + logLevel12.name(), "Error while parsing targeting - skipping");
                }
                targeting2 = null;
            }
            targeting = targeting2;
        } else {
            targeting = null;
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("placements");
        if (optJSONObject3 != null) {
            String nullableString = JSONObjectExtensionsKt.getNullableString(optJSONObject3, "fallback_offering_id");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("offering_ids_by_placement");
            Map replaceJsonNullWithKotlinNull = (optJSONObject4 == null || (map$default = JSONObjectExtensionsKt.toMap$default(optJSONObject4, false, 1, (Object) null)) == null) ? null : JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull(map$default);
            placements = replaceJsonNullWithKotlinNull != null ? new Offerings.Placements(nullableString, replaceJsonNullWithKotlinNull) : null;
        } else {
            placements = null;
        }
        Offering offering = (Offering) linkedHashMap.get(string);
        return new Offerings(offering != null ? OfferingsKt.withPresentedContext(offering, null, targeting) : null, linkedHashMap, placements, targeting, hTTPResponseOriginalSource, z);
    }
}
