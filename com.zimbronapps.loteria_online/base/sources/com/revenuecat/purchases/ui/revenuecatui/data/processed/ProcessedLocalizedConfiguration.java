package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Da.v;
import Da.w;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ProcessedLocalizedConfiguration {
    private final String callToAction;
    private final String callToActionWithIntroOffer;
    private final String callToActionWithMultipleIntroOffers;
    private final List features;
    private final String offerBadge;
    private final String offerDetails;
    private final String offerDetailsWithIntroOffer;
    private final String offerDetailsWithMultipleIntroOffers;
    private final String offerName;
    private final String subtitle;
    private final String tierName;
    private final String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private static final String create$processVariables(String str, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r9, Locale locale) {
            return VariableProcessor.INSTANCE.processVariables(variableDataProvider, packageContext, str, r9, locale);
        }

        public final ProcessedLocalizedConfiguration create(VariableDataProvider variableDataProvider, VariableProcessor.PackageContext context, PaywallData.LocalizedConfiguration localizedConfiguration, Package rcPackage, Locale locale) {
            String localizedRelativeDiscount;
            String str;
            String offerDetails;
            String offerDetailsWithIntroOffer;
            String offerDetailsWithMultipleIntroOffers;
            String offerName;
            t.g(variableDataProvider, "variableDataProvider");
            t.g(context, "context");
            t.g(localizedConfiguration, "localizedConfiguration");
            t.g(rcPackage, "rcPackage");
            t.g(locale, "locale");
            PaywallData.LocalizedConfiguration.OfferOverride offerOverride = (PaywallData.LocalizedConfiguration.OfferOverride) localizedConfiguration.getOfferOverrides().get(rcPackage.getIdentifier());
            if (offerOverride != null) {
                String offerBadge = offerOverride.getOfferBadge();
                if (offerBadge != null) {
                    localizedRelativeDiscount = create$processVariables(offerBadge, variableDataProvider, context, rcPackage, locale);
                    str = localizedRelativeDiscount;
                }
                str = null;
            } else {
                Double discountRelativeToMostExpensivePerMonth = context.getDiscountRelativeToMostExpensivePerMonth();
                if (discountRelativeToMostExpensivePerMonth != null) {
                    localizedRelativeDiscount = variableDataProvider.localizedRelativeDiscount(Double.valueOf(discountRelativeToMostExpensivePerMonth.doubleValue()));
                    str = localizedRelativeDiscount;
                }
                str = null;
            }
            String create$processVariables = create$processVariables(localizedConfiguration.getTitle(), variableDataProvider, context, rcPackage, locale);
            String subtitle = localizedConfiguration.getSubtitle();
            String create$processVariables2 = subtitle != null ? create$processVariables(subtitle, variableDataProvider, context, rcPackage, locale) : null;
            String create$processVariables3 = create$processVariables(localizedConfiguration.getCallToAction(), variableDataProvider, context, rcPackage, locale);
            String callToActionWithIntroOffer = localizedConfiguration.getCallToActionWithIntroOffer();
            String create$processVariables4 = callToActionWithIntroOffer != null ? create$processVariables(callToActionWithIntroOffer, variableDataProvider, context, rcPackage, locale) : null;
            String callToActionWithMultipleIntroOffers = localizedConfiguration.getCallToActionWithMultipleIntroOffers();
            String create$processVariables5 = callToActionWithMultipleIntroOffers != null ? create$processVariables(callToActionWithMultipleIntroOffers, variableDataProvider, context, rcPackage, locale) : null;
            if (offerOverride == null || (offerDetails = offerOverride.getOfferDetails()) == null) {
                offerDetails = localizedConfiguration.getOfferDetails();
            }
            String create$processVariables6 = offerDetails != null ? create$processVariables(offerDetails, variableDataProvider, context, rcPackage, locale) : null;
            if (offerOverride == null || (offerDetailsWithIntroOffer = offerOverride.getOfferDetailsWithIntroOffer()) == null) {
                offerDetailsWithIntroOffer = localizedConfiguration.getOfferDetailsWithIntroOffer();
            }
            String create$processVariables7 = offerDetailsWithIntroOffer != null ? create$processVariables(offerDetailsWithIntroOffer, variableDataProvider, context, rcPackage, locale) : null;
            if (offerOverride == null || (offerDetailsWithMultipleIntroOffers = offerOverride.getOfferDetailsWithMultipleIntroOffers()) == null) {
                offerDetailsWithMultipleIntroOffers = localizedConfiguration.getOfferDetailsWithMultipleIntroOffers();
            }
            String create$processVariables8 = offerDetailsWithMultipleIntroOffers != null ? create$processVariables(offerDetailsWithMultipleIntroOffers, variableDataProvider, context, rcPackage, locale) : null;
            if (offerOverride == null || (offerName = offerOverride.getOfferName()) == null) {
                offerName = localizedConfiguration.getOfferName();
            }
            String create$processVariables9 = offerName != null ? create$processVariables(offerName, variableDataProvider, context, rcPackage, locale) : null;
            List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
            ArrayList arrayList = new ArrayList(w.y(features, 10));
            for (PaywallData.LocalizedConfiguration.Feature feature : features) {
                String create$processVariables10 = create$processVariables(feature.getTitle(), variableDataProvider, context, rcPackage, locale);
                String content = feature.getContent();
                arrayList.add(PaywallData.LocalizedConfiguration.Feature.copy$default(feature, create$processVariables10, content != null ? create$processVariables(content, variableDataProvider, context, rcPackage, locale) : null, (String) null, 4, (Object) null));
            }
            return new ProcessedLocalizedConfiguration(create$processVariables, create$processVariables2, create$processVariables3, create$processVariables4, create$processVariables5, create$processVariables6, create$processVariables7, create$processVariables8, create$processVariables9, str, arrayList, localizedConfiguration.getTierName());
        }

        private Companion() {
        }
    }

    public ProcessedLocalizedConfiguration(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List features, String str9) {
        t.g(title, "title");
        t.g(callToAction, "callToAction");
        t.g(features, "features");
        this.title = title;
        this.subtitle = str;
        this.callToAction = callToAction;
        this.callToActionWithIntroOffer = str2;
        this.callToActionWithMultipleIntroOffers = str3;
        this.offerDetails = str4;
        this.offerDetailsWithIntroOffer = str5;
        this.offerDetailsWithMultipleIntroOffers = str6;
        this.offerName = str7;
        this.offerBadge = str8;
        this.features = features;
        this.tierName = str9;
    }

    public static /* synthetic */ ProcessedLocalizedConfiguration copy$default(ProcessedLocalizedConfiguration processedLocalizedConfiguration, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, int i, Object obj) {
        return processedLocalizedConfiguration.copy((i & 1) != 0 ? processedLocalizedConfiguration.title : str, (i & 2) != 0 ? processedLocalizedConfiguration.subtitle : str2, (i & 4) != 0 ? processedLocalizedConfiguration.callToAction : str3, (i & 8) != 0 ? processedLocalizedConfiguration.callToActionWithIntroOffer : str4, (i & 16) != 0 ? processedLocalizedConfiguration.callToActionWithMultipleIntroOffers : str5, (i & 32) != 0 ? processedLocalizedConfiguration.offerDetails : str6, (i & 64) != 0 ? processedLocalizedConfiguration.offerDetailsWithIntroOffer : str7, (i & 128) != 0 ? processedLocalizedConfiguration.offerDetailsWithMultipleIntroOffers : str8, (i & 256) != 0 ? processedLocalizedConfiguration.offerName : str9, (i & 512) != 0 ? processedLocalizedConfiguration.offerBadge : str10, (i & 1024) != 0 ? processedLocalizedConfiguration.features : list, (i & 2048) != 0 ? processedLocalizedConfiguration.tierName : str11);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.offerBadge;
    }

    public final List component11() {
        return this.features;
    }

    public final String component12() {
        return this.tierName;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.callToAction;
    }

    public final String component4() {
        return this.callToActionWithIntroOffer;
    }

    public final String component5() {
        return this.callToActionWithMultipleIntroOffers;
    }

    public final String component6() {
        return this.offerDetails;
    }

    public final String component7() {
        return this.offerDetailsWithIntroOffer;
    }

    public final String component8() {
        return this.offerDetailsWithMultipleIntroOffers;
    }

    public final String component9() {
        return this.offerName;
    }

    public final ProcessedLocalizedConfiguration copy(String title, String str, String callToAction, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List features, String str9) {
        t.g(title, "title");
        t.g(callToAction, "callToAction");
        t.g(features, "features");
        return new ProcessedLocalizedConfiguration(title, str, callToAction, str2, str3, str4, str5, str6, str7, str8, features, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessedLocalizedConfiguration)) {
            return false;
        }
        ProcessedLocalizedConfiguration processedLocalizedConfiguration = (ProcessedLocalizedConfiguration) obj;
        return t.c(this.title, processedLocalizedConfiguration.title) && t.c(this.subtitle, processedLocalizedConfiguration.subtitle) && t.c(this.callToAction, processedLocalizedConfiguration.callToAction) && t.c(this.callToActionWithIntroOffer, processedLocalizedConfiguration.callToActionWithIntroOffer) && t.c(this.callToActionWithMultipleIntroOffers, processedLocalizedConfiguration.callToActionWithMultipleIntroOffers) && t.c(this.offerDetails, processedLocalizedConfiguration.offerDetails) && t.c(this.offerDetailsWithIntroOffer, processedLocalizedConfiguration.offerDetailsWithIntroOffer) && t.c(this.offerDetailsWithMultipleIntroOffers, processedLocalizedConfiguration.offerDetailsWithMultipleIntroOffers) && t.c(this.offerName, processedLocalizedConfiguration.offerName) && t.c(this.offerBadge, processedLocalizedConfiguration.offerBadge) && t.c(this.features, processedLocalizedConfiguration.features) && t.c(this.tierName, processedLocalizedConfiguration.tierName);
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final String getCallToActionWithIntroOffer() {
        return this.callToActionWithIntroOffer;
    }

    public final String getCallToActionWithMultipleIntroOffers() {
        return this.callToActionWithMultipleIntroOffers;
    }

    public final List getFeatures() {
        return this.features;
    }

    public final String getOfferBadge() {
        return this.offerBadge;
    }

    public final String getOfferDetails() {
        return this.offerDetails;
    }

    public final String getOfferDetailsWithIntroOffer() {
        return this.offerDetailsWithIntroOffer;
    }

    public final String getOfferDetailsWithMultipleIntroOffers() {
        return this.offerDetailsWithMultipleIntroOffers;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTierName() {
        return this.tierName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
        String str2 = this.callToActionWithIntroOffer;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.callToActionWithMultipleIntroOffers;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerDetails;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerDetailsWithIntroOffer;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerDetailsWithMultipleIntroOffers;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerName;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerBadge;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.features.hashCode()) * 31;
        String str9 = this.tierName;
        return hashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "ProcessedLocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", offerBadge=" + this.offerBadge + ", features=" + this.features + ", tierName=" + this.tierName + ')';
    }

    public /* synthetic */ ProcessedLocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, int i, k kVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i & 1024) != 0 ? v.n() : list, str11);
    }
}
