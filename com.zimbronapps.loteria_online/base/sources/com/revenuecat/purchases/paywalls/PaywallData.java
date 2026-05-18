package com.revenuecat.purchases.paywalls;

import Ca.e;
import Ca.q;
import Ca.x;
import Da.D;
import Da.S;
import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.utils.LocaleExtensionsKt;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import ob.b;
import rb.d;
import sb.M;
import sb.f0;
import sb.t0;
import sb.x0;

@InternalRevenueCatAPI
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class PaywallData {
    private static final b[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    private final URL assetBaseURL;
    private final Configuration config;
    private final String defaultLocale;
    private final String id;
    private final Map localization;
    private final Map localizationByTier;
    private final int revision;
    private final String templateName;
    private final List zeroDecimalPlaceCountries;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        x0 x0Var = x0.a;
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
        $childSerializers = new b[]{null, null, null, null, null, new M(x0Var, paywallData$LocalizedConfiguration$$serializer), new M(x0Var, new M(x0Var, paywallData$LocalizedConfiguration$$serializer)), null, null};
    }

    @e
    public /* synthetic */ PaywallData(int i, String str, String str2, Configuration configuration, URL url, int i2, Map map, Map map2, List list, String str3, t0 t0Var) {
        if (46 != (i & 46)) {
            f0.a(i, 46, PaywallData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.config = configuration;
        this.assetBaseURL = url;
        if ((i & 16) == 0) {
            this.revision = 0;
        } else {
            this.revision = i2;
        }
        this.localization = map;
        if ((i & 64) == 0) {
            this.localizationByTier = S.h();
        } else {
            this.localizationByTier = map2;
        }
        if ((i & 128) == 0) {
            this.zeroDecimalPlaceCountries = v.n();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i & 256) == 0) {
            this.defaultLocale = null;
        } else {
            this.defaultLocale = str3;
        }
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ PaywallData copy$default(PaywallData paywallData, String str, Configuration configuration, URL url, int i, Map map, Map map2, List list, String str2, int i2, Object obj) {
        return paywallData.copy((i2 & 1) != 0 ? paywallData.templateName : str, (i2 & 2) != 0 ? paywallData.config : configuration, (i2 & 4) != 0 ? paywallData.assetBaseURL : url, (i2 & 8) != 0 ? paywallData.revision : i, (i2 & 16) != 0 ? paywallData.localization : map, (i2 & 32) != 0 ? paywallData.localizationByTier : map2, (i2 & 64) != 0 ? paywallData.zeroDecimalPlaceCountries : list, (i2 & 128) != 0 ? paywallData.defaultLocale : str2);
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getDefaultLocale$annotations() {
    }

    public static /* synthetic */ void getLocalization$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getLocalizationByTier$purchases_defaultsBc8Release$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    private final q tieredConfigForLocales(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale convertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale((Locale) it.next());
            Map tieredConfigForLocale = tieredConfigForLocale(convertToCorrectlyFormattedLocale);
            if (tieredConfigForLocale != null) {
                return x.a(convertToCorrectlyFormattedLocale, tieredConfigForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator it2 = this.localizationByTier.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (t.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                return x.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) D.e0(this.localizationByTier.entrySet());
        return x.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallData paywallData, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        if (dVar.e(eVar, 0) || paywallData.id != null) {
            dVar.j(eVar, 0, x0.a, paywallData.id);
        }
        dVar.v(eVar, 1, paywallData.templateName);
        dVar.k(eVar, 2, PaywallData$Configuration$$serializer.INSTANCE, paywallData.config);
        dVar.k(eVar, 3, URLSerializer.INSTANCE, paywallData.assetBaseURL);
        if (dVar.e(eVar, 4) || paywallData.revision != 0) {
            dVar.n(eVar, 4, paywallData.revision);
        }
        dVar.k(eVar, 5, kVarArr[5], paywallData.localization);
        if (dVar.e(eVar, 6) || !t.c(paywallData.localizationByTier, S.h())) {
            dVar.k(eVar, 6, kVarArr[6], paywallData.localizationByTier);
        }
        if (dVar.e(eVar, 7) || !t.c(paywallData.zeroDecimalPlaceCountries, v.n())) {
            dVar.k(eVar, 7, GoogleListSerializer.INSTANCE, paywallData.zeroDecimalPlaceCountries);
        }
        if (!dVar.e(eVar, 8) && paywallData.defaultLocale == null) {
            return;
        }
        dVar.j(eVar, 8, x0.a, paywallData.defaultLocale);
    }

    public final LocalizedConfiguration configForLocale(Locale locale) {
        Object obj;
        t.g(locale, "requiredLocale");
        LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) this.localization.get(locale.toString());
        if (localizedConfiguration != null) {
            return localizedConfiguration;
        }
        Iterator it = this.localization.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (LocalizedConfiguration) entry.getValue();
        }
        return null;
    }

    @InternalRevenueCatAPI
    public final PaywallData copy(String str, Configuration configuration, URL url, int i, Map map, Map map2, List list, String str2) {
        t.g(str, "templateName");
        t.g(configuration, "config");
        t.g(url, "assetBaseURL");
        t.g(map, "localization");
        t.g(map2, "localizationByTier");
        t.g(list, "zeroDecimalPlaceCountries");
        return new PaywallData((String) null, str, configuration, url, i, map, map2, list, str2, 1, (k) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallData)) {
            return false;
        }
        PaywallData paywallData = (PaywallData) obj;
        return t.c(this.id, paywallData.id) && t.c(this.templateName, paywallData.templateName) && t.c(this.config, paywallData.config) && t.c(this.assetBaseURL, paywallData.assetBaseURL) && this.revision == paywallData.revision && t.c(this.localization, paywallData.localization) && t.c(this.localizationByTier, paywallData.localizationByTier) && t.c(this.zeroDecimalPlaceCountries, paywallData.zeroDecimalPlaceCountries) && t.c(this.defaultLocale, paywallData.defaultLocale);
    }

    public final URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final Configuration getConfig() {
        return this.config;
    }

    public final String getDefaultLocale() {
        return this.defaultLocale;
    }

    public final String getId() {
        return this.id;
    }

    public final Map getLocalization$purchases_defaultsBc8Release() {
        return this.localization;
    }

    public final Map getLocalizationByTier$purchases_defaultsBc8Release() {
        return this.localizationByTier;
    }

    public final q getLocalizedConfiguration() {
        return localizedConfiguration(LocaleExtensionsKt.getDefaultLocales());
    }

    public final int getRevision() {
        return this.revision;
    }

    public final String getTemplateName() {
        return this.templateName;
    }

    public final q getTieredLocalizedConfiguration() {
        return tieredConfigForLocales(LocaleExtensionsKt.getDefaultLocales());
    }

    public final List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.templateName.hashCode()) * 31) + this.config.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + this.revision) * 31) + this.localization.hashCode()) * 31) + this.localizationByTier.hashCode()) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        String str2 = this.defaultLocale;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final q localizedConfiguration(List list) {
        Object obj;
        t.g(list, "locales");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale convertToCorrectlyFormattedLocale = LocaleExtensionsKt.convertToCorrectlyFormattedLocale((Locale) it.next());
            LocalizedConfiguration configForLocale = configForLocale(convertToCorrectlyFormattedLocale);
            if (configForLocale != null) {
                return x.a(convertToCorrectlyFormattedLocale, configForLocale);
            }
        }
        String str = this.defaultLocale;
        if (str != null) {
            Iterator it2 = this.localization.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (t.c(LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()), LocaleExtensionsKt.toLocale(str))) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null) {
                return x.a(LocaleExtensionsKt.toLocale((String) entry.getKey()), entry.getValue());
            }
        }
        Map.Entry entry2 = (Map.Entry) D.e0(this.localization.entrySet());
        return x.a(LocaleExtensionsKt.toLocale((String) entry2.getKey()), entry2.getValue());
    }

    public final Map tieredConfigForLocale(Locale locale) {
        Object obj;
        t.g(locale, "requiredLocale");
        Map map = (Map) this.localizationByTier.get(locale.toString());
        if (map != null) {
            return map;
        }
        Iterator it = this.localizationByTier.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (LocaleExtensionsKt.sharedLanguageCodeWith(locale, LocaleExtensionsKt.toLocale((String) ((Map.Entry) obj).getKey()))) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (Map) entry.getValue();
        }
        return null;
    }

    public String toString() {
        return "PaywallData(id=" + this.id + ", templateName=" + this.templateName + ", config=" + this.config + ", assetBaseURL=" + this.assetBaseURL + ", revision=" + this.revision + ", localization=" + this.localization + ", localizationByTier=" + this.localizationByTier + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", defaultLocale=" + this.defaultLocale + ')';
    }

    public static final class Configuration {
        private static final b[] $childSerializers;
        public static final Companion Companion = new Companion(null);
        private final boolean blurredBackgroundImage;
        private final ColorInformation colors;
        private final Map colorsByTier;
        private final String defaultPackage;
        private final String defaultTier;
        private final boolean displayRestorePurchases;
        private final Map imagesByTier;
        private final Images imagesWebp;
        private final Images legacyImages;
        private final List packageIds;
        private final URL privacyURL;
        private final URL termsOfServiceURL;
        private final List tiers;

        public static final class ColorInformation {
            public static final Companion Companion = new Companion(null);
            private final Colors dark;
            private final Colors light;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$ColorInformation$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ ColorInformation(int i, Colors colors, Colors colors2, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE.getDescriptor());
                }
                this.light = colors;
                if ((i & 2) == 0) {
                    this.dark = null;
                } else {
                    this.dark = colors2;
                }
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(ColorInformation colorInformation, d dVar, qb.e eVar) {
                PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
                dVar.k(eVar, 0, paywallData$Configuration$Colors$$serializer, colorInformation.light);
                if (!dVar.e(eVar, 1) && colorInformation.dark == null) {
                    return;
                }
                dVar.j(eVar, 1, paywallData$Configuration$Colors$$serializer, colorInformation.dark);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ColorInformation)) {
                    return false;
                }
                ColorInformation colorInformation = (ColorInformation) obj;
                return t.c(this.light, colorInformation.light) && t.c(this.dark, colorInformation.dark);
            }

            public final Colors getDark() {
                return this.dark;
            }

            public final Colors getLight() {
                return this.light;
            }

            public int hashCode() {
                int hashCode = this.light.hashCode() * 31;
                Colors colors = this.dark;
                return hashCode + (colors == null ? 0 : colors.hashCode());
            }

            public String toString() {
                return "ColorInformation(light=" + this.light + ", dark=" + this.dark + ')';
            }

            public ColorInformation(Colors colors, Colors colors2) {
                t.g(colors, "light");
                this.light = colors;
                this.dark = colors2;
            }

            public /* synthetic */ ColorInformation(Colors colors, Colors colors2, int i, k kVar) {
                this(colors, (i & 2) != 0 ? null : colors2);
            }
        }

        public static final class Colors {
            public static final Companion Companion = new Companion(null);
            private final PaywallColor accent1;
            private final PaywallColor accent2;
            private final PaywallColor accent3;
            private final PaywallColor background;
            private final PaywallColor callToActionBackground;
            private final PaywallColor callToActionForeground;
            private final PaywallColor callToActionSecondaryBackground;
            private final PaywallColor closeButton;
            private final PaywallColor text1;
            private final PaywallColor text2;
            private final PaywallColor text3;
            private final PaywallColor tierControlBackground;
            private final PaywallColor tierControlForeground;
            private final PaywallColor tierControlSelectedBackground;
            private final PaywallColor tierControlSelectedForeground;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Colors$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Colors(int i, PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, t0 t0Var) {
                if (51 != (i & 51)) {
                    f0.a(i, 51, PaywallData$Configuration$Colors$$serializer.INSTANCE.getDescriptor());
                }
                this.background = paywallColor;
                this.text1 = paywallColor2;
                if ((i & 4) == 0) {
                    this.text2 = null;
                } else {
                    this.text2 = paywallColor3;
                }
                if ((i & 8) == 0) {
                    this.text3 = null;
                } else {
                    this.text3 = paywallColor4;
                }
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                if ((i & 64) == 0) {
                    this.callToActionSecondaryBackground = null;
                } else {
                    this.callToActionSecondaryBackground = paywallColor7;
                }
                if ((i & 128) == 0) {
                    this.accent1 = null;
                } else {
                    this.accent1 = paywallColor8;
                }
                if ((i & 256) == 0) {
                    this.accent2 = null;
                } else {
                    this.accent2 = paywallColor9;
                }
                if ((i & 512) == 0) {
                    this.accent3 = null;
                } else {
                    this.accent3 = paywallColor10;
                }
                if ((i & 1024) == 0) {
                    this.closeButton = null;
                } else {
                    this.closeButton = paywallColor11;
                }
                if ((i & 2048) == 0) {
                    this.tierControlBackground = null;
                } else {
                    this.tierControlBackground = paywallColor12;
                }
                if ((i & 4096) == 0) {
                    this.tierControlForeground = null;
                } else {
                    this.tierControlForeground = paywallColor13;
                }
                if ((i & 8192) == 0) {
                    this.tierControlSelectedBackground = null;
                } else {
                    this.tierControlSelectedBackground = paywallColor14;
                }
                if ((i & 16384) == 0) {
                    this.tierControlSelectedForeground = null;
                } else {
                    this.tierControlSelectedForeground = paywallColor15;
                }
            }

            public static /* synthetic */ void getAccent1$annotations() {
            }

            public static /* synthetic */ void getAccent2$annotations() {
            }

            public static /* synthetic */ void getAccent3$annotations() {
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionBackground$annotations() {
            }

            public static /* synthetic */ void getCallToActionForeground$annotations() {
            }

            public static /* synthetic */ void getCallToActionSecondaryBackground$annotations() {
            }

            public static /* synthetic */ void getCloseButton$annotations() {
            }

            public static /* synthetic */ void getText1$annotations() {
            }

            public static /* synthetic */ void getText2$annotations() {
            }

            public static /* synthetic */ void getText3$annotations() {
            }

            public static /* synthetic */ void getTierControlBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlForeground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedBackground$annotations() {
            }

            public static /* synthetic */ void getTierControlSelectedForeground$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Colors colors, d dVar, qb.e eVar) {
                PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
                dVar.k(eVar, 0, serializer, colors.background);
                dVar.k(eVar, 1, serializer, colors.text1);
                if (dVar.e(eVar, 2) || colors.text2 != null) {
                    dVar.j(eVar, 2, serializer, colors.text2);
                }
                if (dVar.e(eVar, 3) || colors.text3 != null) {
                    dVar.j(eVar, 3, serializer, colors.text3);
                }
                dVar.k(eVar, 4, serializer, colors.callToActionBackground);
                dVar.k(eVar, 5, serializer, colors.callToActionForeground);
                if (dVar.e(eVar, 6) || colors.callToActionSecondaryBackground != null) {
                    dVar.j(eVar, 6, serializer, colors.callToActionSecondaryBackground);
                }
                if (dVar.e(eVar, 7) || colors.accent1 != null) {
                    dVar.j(eVar, 7, serializer, colors.accent1);
                }
                if (dVar.e(eVar, 8) || colors.accent2 != null) {
                    dVar.j(eVar, 8, serializer, colors.accent2);
                }
                if (dVar.e(eVar, 9) || colors.accent3 != null) {
                    dVar.j(eVar, 9, serializer, colors.accent3);
                }
                if (dVar.e(eVar, 10) || colors.closeButton != null) {
                    dVar.j(eVar, 10, serializer, colors.closeButton);
                }
                if (dVar.e(eVar, 11) || colors.tierControlBackground != null) {
                    dVar.j(eVar, 11, serializer, colors.tierControlBackground);
                }
                if (dVar.e(eVar, 12) || colors.tierControlForeground != null) {
                    dVar.j(eVar, 12, serializer, colors.tierControlForeground);
                }
                if (dVar.e(eVar, 13) || colors.tierControlSelectedBackground != null) {
                    dVar.j(eVar, 13, serializer, colors.tierControlSelectedBackground);
                }
                if (!dVar.e(eVar, 14) && colors.tierControlSelectedForeground == null) {
                    return;
                }
                dVar.j(eVar, 14, serializer, colors.tierControlSelectedForeground);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Colors)) {
                    return false;
                }
                Colors colors = (Colors) obj;
                return t.c(this.background, colors.background) && t.c(this.text1, colors.text1) && t.c(this.text2, colors.text2) && t.c(this.text3, colors.text3) && t.c(this.callToActionBackground, colors.callToActionBackground) && t.c(this.callToActionForeground, colors.callToActionForeground) && t.c(this.callToActionSecondaryBackground, colors.callToActionSecondaryBackground) && t.c(this.accent1, colors.accent1) && t.c(this.accent2, colors.accent2) && t.c(this.accent3, colors.accent3) && t.c(this.closeButton, colors.closeButton) && t.c(this.tierControlBackground, colors.tierControlBackground) && t.c(this.tierControlForeground, colors.tierControlForeground) && t.c(this.tierControlSelectedBackground, colors.tierControlSelectedBackground) && t.c(this.tierControlSelectedForeground, colors.tierControlSelectedForeground);
            }

            public final PaywallColor getAccent1() {
                return this.accent1;
            }

            public final PaywallColor getAccent2() {
                return this.accent2;
            }

            public final PaywallColor getAccent3() {
                return this.accent3;
            }

            public final PaywallColor getBackground() {
                return this.background;
            }

            public final PaywallColor getCallToActionBackground() {
                return this.callToActionBackground;
            }

            public final PaywallColor getCallToActionForeground() {
                return this.callToActionForeground;
            }

            public final PaywallColor getCallToActionSecondaryBackground() {
                return this.callToActionSecondaryBackground;
            }

            public final PaywallColor getCloseButton() {
                return this.closeButton;
            }

            public final PaywallColor getText1() {
                return this.text1;
            }

            public final PaywallColor getText2() {
                return this.text2;
            }

            public final PaywallColor getText3() {
                return this.text3;
            }

            public final PaywallColor getTierControlBackground() {
                return this.tierControlBackground;
            }

            public final PaywallColor getTierControlForeground() {
                return this.tierControlForeground;
            }

            public final PaywallColor getTierControlSelectedBackground() {
                return this.tierControlSelectedBackground;
            }

            public final PaywallColor getTierControlSelectedForeground() {
                return this.tierControlSelectedForeground;
            }

            public int hashCode() {
                int hashCode = ((this.background.hashCode() * 31) + this.text1.hashCode()) * 31;
                PaywallColor paywallColor = this.text2;
                int hashCode2 = (hashCode + (paywallColor == null ? 0 : paywallColor.hashCode())) * 31;
                PaywallColor paywallColor2 = this.text3;
                int hashCode3 = (((((hashCode2 + (paywallColor2 == null ? 0 : paywallColor2.hashCode())) * 31) + this.callToActionBackground.hashCode()) * 31) + this.callToActionForeground.hashCode()) * 31;
                PaywallColor paywallColor3 = this.callToActionSecondaryBackground;
                int hashCode4 = (hashCode3 + (paywallColor3 == null ? 0 : paywallColor3.hashCode())) * 31;
                PaywallColor paywallColor4 = this.accent1;
                int hashCode5 = (hashCode4 + (paywallColor4 == null ? 0 : paywallColor4.hashCode())) * 31;
                PaywallColor paywallColor5 = this.accent2;
                int hashCode6 = (hashCode5 + (paywallColor5 == null ? 0 : paywallColor5.hashCode())) * 31;
                PaywallColor paywallColor6 = this.accent3;
                int hashCode7 = (hashCode6 + (paywallColor6 == null ? 0 : paywallColor6.hashCode())) * 31;
                PaywallColor paywallColor7 = this.closeButton;
                int hashCode8 = (hashCode7 + (paywallColor7 == null ? 0 : paywallColor7.hashCode())) * 31;
                PaywallColor paywallColor8 = this.tierControlBackground;
                int hashCode9 = (hashCode8 + (paywallColor8 == null ? 0 : paywallColor8.hashCode())) * 31;
                PaywallColor paywallColor9 = this.tierControlForeground;
                int hashCode10 = (hashCode9 + (paywallColor9 == null ? 0 : paywallColor9.hashCode())) * 31;
                PaywallColor paywallColor10 = this.tierControlSelectedBackground;
                int hashCode11 = (hashCode10 + (paywallColor10 == null ? 0 : paywallColor10.hashCode())) * 31;
                PaywallColor paywallColor11 = this.tierControlSelectedForeground;
                return hashCode11 + (paywallColor11 != null ? paywallColor11.hashCode() : 0);
            }

            public String toString() {
                return "Colors(background=" + this.background + ", text1=" + this.text1 + ", text2=" + this.text2 + ", text3=" + this.text3 + ", callToActionBackground=" + this.callToActionBackground + ", callToActionForeground=" + this.callToActionForeground + ", callToActionSecondaryBackground=" + this.callToActionSecondaryBackground + ", accent1=" + this.accent1 + ", accent2=" + this.accent2 + ", accent3=" + this.accent3 + ", closeButton=" + this.closeButton + ", tierControlBackground=" + this.tierControlBackground + ", tierControlForeground=" + this.tierControlForeground + ", tierControlSelectedBackground=" + this.tierControlSelectedBackground + ", tierControlSelectedForeground=" + this.tierControlSelectedForeground + ')';
            }

            public Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15) {
                t.g(paywallColor, "background");
                t.g(paywallColor2, "text1");
                t.g(paywallColor5, "callToActionBackground");
                t.g(paywallColor6, "callToActionForeground");
                this.background = paywallColor;
                this.text1 = paywallColor2;
                this.text2 = paywallColor3;
                this.text3 = paywallColor4;
                this.callToActionBackground = paywallColor5;
                this.callToActionForeground = paywallColor6;
                this.callToActionSecondaryBackground = paywallColor7;
                this.accent1 = paywallColor8;
                this.accent2 = paywallColor9;
                this.accent3 = paywallColor10;
                this.closeButton = paywallColor11;
                this.tierControlBackground = paywallColor12;
                this.tierControlForeground = paywallColor13;
                this.tierControlSelectedBackground = paywallColor14;
                this.tierControlSelectedForeground = paywallColor15;
            }

            public /* synthetic */ Colors(PaywallColor paywallColor, PaywallColor paywallColor2, PaywallColor paywallColor3, PaywallColor paywallColor4, PaywallColor paywallColor5, PaywallColor paywallColor6, PaywallColor paywallColor7, PaywallColor paywallColor8, PaywallColor paywallColor9, PaywallColor paywallColor10, PaywallColor paywallColor11, PaywallColor paywallColor12, PaywallColor paywallColor13, PaywallColor paywallColor14, PaywallColor paywallColor15, int i, k kVar) {
                this(paywallColor, paywallColor2, (i & 4) != 0 ? null : paywallColor3, (i & 8) != 0 ? null : paywallColor4, paywallColor5, paywallColor6, (i & 64) != 0 ? null : paywallColor7, (i & 128) != 0 ? null : paywallColor8, (i & 256) != 0 ? null : paywallColor9, (i & 512) != 0 ? null : paywallColor10, (i & 1024) != 0 ? null : paywallColor11, (i & 2048) != 0 ? null : paywallColor12, (i & 4096) != 0 ? null : paywallColor13, (i & 8192) != 0 ? null : paywallColor14, (i & 16384) != 0 ? null : paywallColor15);
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return PaywallData$Configuration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class Images {
            public static final Companion Companion = new Companion(null);
            private final String background;
            private final String header;
            private final String icon;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Images$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public Images() {
                this((String) null, (String) null, (String) null, 7, (k) null);
            }

            public static /* synthetic */ void getBackground$annotations() {
            }

            public static /* synthetic */ void getHeader$annotations() {
            }

            public static /* synthetic */ void getIcon$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Images images, d dVar, qb.e eVar) {
                if (dVar.e(eVar, 0) || images.header != null) {
                    dVar.j(eVar, 0, EmptyStringToNullSerializer.INSTANCE, images.header);
                }
                if (dVar.e(eVar, 1) || images.background != null) {
                    dVar.j(eVar, 1, EmptyStringToNullSerializer.INSTANCE, images.background);
                }
                if (!dVar.e(eVar, 2) && images.icon == null) {
                    return;
                }
                dVar.j(eVar, 2, EmptyStringToNullSerializer.INSTANCE, images.icon);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Images)) {
                    return false;
                }
                Images images = (Images) obj;
                return t.c(this.header, images.header) && t.c(this.background, images.background) && t.c(this.icon, images.icon);
            }

            public final List getAll$purchases_defaultsBc8Release() {
                return v.s(new String[]{this.header, this.background, this.icon});
            }

            public final String getBackground() {
                return this.background;
            }

            public final String getHeader() {
                return this.header;
            }

            public final String getIcon() {
                return this.icon;
            }

            public int hashCode() {
                String str = this.header;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.background;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.icon;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Images(header=" + this.header + ", background=" + this.background + ", icon=" + this.icon + ')';
            }

            @e
            public /* synthetic */ Images(int i, String str, String str2, String str3, t0 t0Var) {
                if ((i & 1) == 0) {
                    this.header = null;
                } else {
                    this.header = str;
                }
                if ((i & 2) == 0) {
                    this.background = null;
                } else {
                    this.background = str2;
                }
                if ((i & 4) == 0) {
                    this.icon = null;
                } else {
                    this.icon = str3;
                }
            }

            public Images(String str, String str2, String str3) {
                this.header = str;
                this.background = str2;
                this.icon = str3;
            }

            public /* synthetic */ Images(String str, String str2, String str3, int i, k kVar) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        public static final class Tier {
            private final String defaultPackageId;
            private final String id;
            private final List packageIds;
            public static final Companion Companion = new Companion(null);
            private static final b[] $childSerializers = {null, new sb.e(x0.a), null};

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$Configuration$Tier$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Tier(int i, String str, List list, String str2, t0 t0Var) {
                if (7 != (i & 7)) {
                    f0.a(i, 7, PaywallData$Configuration$Tier$$serializer.INSTANCE.getDescriptor());
                }
                this.id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }

            public static final /* synthetic */ b[] access$get$childSerializers$cp() {
                return $childSerializers;
            }

            public static /* synthetic */ void getDefaultPackageId$annotations() {
            }

            public static /* synthetic */ void getPackageIds$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Tier tier, d dVar, qb.e eVar) {
                ob.k[] kVarArr = $childSerializers;
                dVar.v(eVar, 0, tier.id);
                dVar.k(eVar, 1, kVarArr[1], tier.packageIds);
                dVar.v(eVar, 2, tier.defaultPackageId);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Tier)) {
                    return false;
                }
                Tier tier = (Tier) obj;
                return t.c(this.id, tier.id) && t.c(this.packageIds, tier.packageIds) && t.c(this.defaultPackageId, tier.defaultPackageId);
            }

            public final String getDefaultPackageId() {
                return this.defaultPackageId;
            }

            public final String getId() {
                return this.id;
            }

            public final List getPackageIds() {
                return this.packageIds;
            }

            public int hashCode() {
                return (((this.id.hashCode() * 31) + this.packageIds.hashCode()) * 31) + this.defaultPackageId.hashCode();
            }

            public String toString() {
                return "Tier(id=" + this.id + ", packageIds=" + this.packageIds + ", defaultPackageId=" + this.defaultPackageId + ')';
            }

            public Tier(String str, List list, String str2) {
                t.g(str, "id");
                t.g(list, "packageIds");
                t.g(str2, "defaultPackageId");
                this.id = str;
                this.packageIds = list;
                this.defaultPackageId = str2;
            }
        }

        static {
            x0 x0Var = x0.a;
            $childSerializers = new b[]{new sb.e(x0Var), null, null, null, new M(x0Var, PaywallData$Configuration$Images$$serializer.INSTANCE), null, null, null, null, null, new M(x0Var, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE), new sb.e(PaywallData$Configuration$Tier$$serializer.INSTANCE), null};
        }

        @e
        public /* synthetic */ Configuration(int i, List list, String str, Images images, Images images2, Map map, boolean z, boolean z2, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, t0 t0Var) {
            if (512 != (i & 512)) {
                f0.a(i, 512, PaywallData$Configuration$$serializer.INSTANCE.getDescriptor());
            }
            this.packageIds = (i & 1) == 0 ? v.n() : list;
            if ((i & 2) == 0) {
                this.defaultPackage = null;
            } else {
                this.defaultPackage = str;
            }
            if ((i & 4) == 0) {
                this.imagesWebp = null;
            } else {
                this.imagesWebp = images;
            }
            if ((i & 8) == 0) {
                this.legacyImages = null;
            } else {
                this.legacyImages = images2;
            }
            if ((i & 16) == 0) {
                this.imagesByTier = null;
            } else {
                this.imagesByTier = map;
            }
            this.blurredBackgroundImage = (i & 32) == 0 ? false : z;
            this.displayRestorePurchases = (i & 64) == 0 ? true : z2;
            if ((i & 128) == 0) {
                this.termsOfServiceURL = null;
            } else {
                this.termsOfServiceURL = url;
            }
            if ((i & 256) == 0) {
                this.privacyURL = null;
            } else {
                this.privacyURL = url2;
            }
            this.colors = colorInformation;
            if ((i & 1024) == 0) {
                this.colorsByTier = null;
            } else {
                this.colorsByTier = map2;
            }
            if ((i & 2048) == 0) {
                this.tiers = null;
            } else {
                this.tiers = list2;
            }
            if ((i & 4096) == 0) {
                this.defaultTier = null;
            } else {
                this.defaultTier = str2;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, List list, String str, Images images, Images images2, Map map, boolean z, boolean z2, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i, Object obj) {
            return configuration.copy((i & 1) != 0 ? configuration.packageIds : list, (i & 2) != 0 ? configuration.defaultPackage : str, (i & 4) != 0 ? configuration.imagesWebp : images, (i & 8) != 0 ? configuration.legacyImages : images2, (i & 16) != 0 ? configuration.imagesByTier : map, (i & 32) != 0 ? configuration.blurredBackgroundImage : z, (i & 64) != 0 ? configuration.displayRestorePurchases : z2, (i & 128) != 0 ? configuration.termsOfServiceURL : url, (i & 256) != 0 ? configuration.privacyURL : url2, (i & 512) != 0 ? configuration.colors : colorInformation, (i & 1024) != 0 ? configuration.colorsByTier : map2, (i & 2048) != 0 ? configuration.tiers : list2, (i & 4096) != 0 ? configuration.defaultTier : str2);
        }

        public static /* synthetic */ void getBlurredBackgroundImage$annotations() {
        }

        public static /* synthetic */ void getColorsByTier$annotations() {
        }

        public static /* synthetic */ void getDefaultPackage$annotations() {
        }

        public static /* synthetic */ void getDefaultTier$annotations() {
        }

        public static /* synthetic */ void getDisplayRestorePurchases$annotations() {
        }

        public static /* synthetic */ void getImagesByTier$annotations() {
        }

        public static /* synthetic */ void getImagesWebp$purchases_defaultsBc8Release$annotations() {
        }

        public static /* synthetic */ void getLegacyImages$purchases_defaultsBc8Release$annotations() {
        }

        public static /* synthetic */ void getPackageIds$annotations() {
        }

        public static /* synthetic */ void getPrivacyURL$annotations() {
        }

        public static /* synthetic */ void getTermsOfServiceURL$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Configuration configuration, d dVar, qb.e eVar) {
            ob.k[] kVarArr = $childSerializers;
            if (dVar.e(eVar, 0) || !t.c(configuration.packageIds, v.n())) {
                dVar.k(eVar, 0, kVarArr[0], configuration.packageIds);
            }
            if (dVar.e(eVar, 1) || configuration.defaultPackage != null) {
                dVar.j(eVar, 1, x0.a, configuration.defaultPackage);
            }
            if (dVar.e(eVar, 2) || configuration.imagesWebp != null) {
                dVar.j(eVar, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.imagesWebp);
            }
            if (dVar.e(eVar, 3) || configuration.legacyImages != null) {
                dVar.j(eVar, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, configuration.legacyImages);
            }
            if (dVar.e(eVar, 4) || configuration.imagesByTier != null) {
                dVar.j(eVar, 4, kVarArr[4], configuration.imagesByTier);
            }
            if (dVar.e(eVar, 5) || configuration.blurredBackgroundImage) {
                dVar.B(eVar, 5, configuration.blurredBackgroundImage);
            }
            if (dVar.e(eVar, 6) || !configuration.displayRestorePurchases) {
                dVar.B(eVar, 6, configuration.displayRestorePurchases);
            }
            if (dVar.e(eVar, 7) || configuration.termsOfServiceURL != null) {
                dVar.j(eVar, 7, OptionalURLSerializer.INSTANCE, configuration.termsOfServiceURL);
            }
            if (dVar.e(eVar, 8) || configuration.privacyURL != null) {
                dVar.j(eVar, 8, OptionalURLSerializer.INSTANCE, configuration.privacyURL);
            }
            dVar.k(eVar, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, configuration.colors);
            if (dVar.e(eVar, 10) || configuration.colorsByTier != null) {
                dVar.j(eVar, 10, kVarArr[10], configuration.colorsByTier);
            }
            if (dVar.e(eVar, 11) || configuration.tiers != null) {
                dVar.j(eVar, 11, kVarArr[11], configuration.tiers);
            }
            if (!dVar.e(eVar, 12) && configuration.defaultTier == null) {
                return;
            }
            dVar.j(eVar, 12, x0.a, configuration.defaultTier);
        }

        @InternalRevenueCatAPI
        public final Configuration copy(List list, String str, Images images, Images images2, Map map, boolean z, boolean z2, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2) {
            t.g(list, "packageIds");
            t.g(colorInformation, "colors");
            return new Configuration(list, str, images, images2, map, z, z2, url, url2, colorInformation, map2, list2, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return t.c(this.packageIds, configuration.packageIds) && t.c(this.defaultPackage, configuration.defaultPackage) && t.c(this.imagesWebp, configuration.imagesWebp) && t.c(this.legacyImages, configuration.legacyImages) && t.c(this.imagesByTier, configuration.imagesByTier) && this.blurredBackgroundImage == configuration.blurredBackgroundImage && this.displayRestorePurchases == configuration.displayRestorePurchases && t.c(this.termsOfServiceURL, configuration.termsOfServiceURL) && t.c(this.privacyURL, configuration.privacyURL) && t.c(this.colors, configuration.colors) && t.c(this.colorsByTier, configuration.colorsByTier) && t.c(this.tiers, configuration.tiers) && t.c(this.defaultTier, configuration.defaultTier);
        }

        public final boolean getBlurredBackgroundImage() {
            return this.blurredBackgroundImage;
        }

        public final ColorInformation getColors() {
            return this.colors;
        }

        public final Map getColorsByTier() {
            return this.colorsByTier;
        }

        public final String getDefaultPackage() {
            return this.defaultPackage;
        }

        public final String getDefaultTier() {
            return this.defaultTier;
        }

        public final boolean getDisplayRestorePurchases() {
            return this.displayRestorePurchases;
        }

        public final Images getImages() {
            String header;
            String background;
            String icon;
            Images images = this.imagesWebp;
            String str = null;
            if (images == null || (header = images.getHeader()) == null) {
                Images images2 = this.legacyImages;
                header = images2 != null ? images2.getHeader() : null;
            }
            Images images3 = this.imagesWebp;
            if (images3 == null || (background = images3.getBackground()) == null) {
                Images images4 = this.legacyImages;
                background = images4 != null ? images4.getBackground() : null;
            }
            Images images5 = this.imagesWebp;
            if (images5 == null || (icon = images5.getIcon()) == null) {
                Images images6 = this.legacyImages;
                if (images6 != null) {
                    str = images6.getIcon();
                }
            } else {
                str = icon;
            }
            return new Images(header, background, str);
        }

        public final Map getImagesByTier() {
            return this.imagesByTier;
        }

        public final Images getImagesWebp$purchases_defaultsBc8Release() {
            return this.imagesWebp;
        }

        public final Images getLegacyImages$purchases_defaultsBc8Release() {
            return this.legacyImages;
        }

        public final List getPackageIds() {
            return this.packageIds;
        }

        public final URL getPrivacyURL() {
            return this.privacyURL;
        }

        public final URL getTermsOfServiceURL() {
            return this.termsOfServiceURL;
        }

        public final List getTiers() {
            return this.tiers;
        }

        public int hashCode() {
            int hashCode = this.packageIds.hashCode() * 31;
            String str = this.defaultPackage;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Images images = this.imagesWebp;
            int hashCode3 = (hashCode2 + (images == null ? 0 : images.hashCode())) * 31;
            Images images2 = this.legacyImages;
            int hashCode4 = (hashCode3 + (images2 == null ? 0 : images2.hashCode())) * 31;
            Map map = this.imagesByTier;
            int hashCode5 = (((((hashCode4 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.blurredBackgroundImage)) * 31) + Boolean.hashCode(this.displayRestorePurchases)) * 31;
            URL url = this.termsOfServiceURL;
            int hashCode6 = (hashCode5 + (url == null ? 0 : url.hashCode())) * 31;
            URL url2 = this.privacyURL;
            int hashCode7 = (((hashCode6 + (url2 == null ? 0 : url2.hashCode())) * 31) + this.colors.hashCode()) * 31;
            Map map2 = this.colorsByTier;
            int hashCode8 = (hashCode7 + (map2 == null ? 0 : map2.hashCode())) * 31;
            List list = this.tiers;
            int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
            String str2 = this.defaultTier;
            return hashCode9 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Configuration(packageIds=" + this.packageIds + ", defaultPackage=" + this.defaultPackage + ", imagesWebp=" + this.imagesWebp + ", legacyImages=" + this.legacyImages + ", imagesByTier=" + this.imagesByTier + ", blurredBackgroundImage=" + this.blurredBackgroundImage + ", displayRestorePurchases=" + this.displayRestorePurchases + ", termsOfServiceURL=" + this.termsOfServiceURL + ", privacyURL=" + this.privacyURL + ", colors=" + this.colors + ", colorsByTier=" + this.colorsByTier + ", tiers=" + this.tiers + ", defaultTier=" + this.defaultTier + ')';
        }

        public Configuration(List list, String str, Images images, Images images2, Map map, boolean z, boolean z2, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2) {
            t.g(list, "packageIds");
            t.g(colorInformation, "colors");
            this.packageIds = list;
            this.defaultPackage = str;
            this.imagesWebp = images;
            this.legacyImages = images2;
            this.imagesByTier = map;
            this.blurredBackgroundImage = z;
            this.displayRestorePurchases = z2;
            this.termsOfServiceURL = url;
            this.privacyURL = url2;
            this.colors = colorInformation;
            this.colorsByTier = map2;
            this.tiers = list2;
            this.defaultTier = str2;
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Images images2, Map map, boolean z, boolean z2, URL url, URL url2, ColorInformation colorInformation, Map map2, List list2, String str2, int i, k kVar) {
            this((i & 1) != 0 ? v.n() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : images, (i & 8) != 0 ? null : images2, (i & 16) != 0 ? null : map, (i & 32) != 0 ? false : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : url, (i & 256) != 0 ? null : url2, colorInformation, (i & 1024) != 0 ? null : map2, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? null : str2);
        }

        public /* synthetic */ Configuration(List list, String str, Images images, Map map, ColorInformation colorInformation, Map map2, List list2, boolean z, boolean z2, URL url, URL url2, int i, k kVar) {
            this(list, (i & 2) != 0 ? null : str, images, (i & 8) != 0 ? null : map, colorInformation, (i & 32) != 0 ? null : map2, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? false : z, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? null : url, (i & 1024) != 0 ? null : url2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(List list, String str, Images images, Map map, ColorInformation colorInformation, Map map2, List list2, boolean z, boolean z2, URL url, URL url2) {
            this(list, str, images, (Images) null, map, z, z2, url, url2, colorInformation, map2, list2, (String) null, 4104, (k) null);
            t.g(list, "packageIds");
            t.g(images, "images");
            t.g(colorInformation, "colors");
        }
    }

    public static final class LocalizedConfiguration {
        private final String callToAction;
        private final String callToActionWithIntroOffer;
        private final String callToActionWithMultipleIntroOffers;
        private final List features;
        private final String offerDetails;
        private final String offerDetailsWithIntroOffer;
        private final String offerDetailsWithMultipleIntroOffers;
        private final String offerName;
        private final Map offerOverrides;
        private final String subtitle;
        private final String tierName;
        private final String title;
        public static final Companion Companion = new Companion(null);
        private static final b[] $childSerializers = {null, null, null, null, null, null, null, null, null, new sb.e(PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE), null, new M(x0.a, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE)};

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b serializer() {
                return PaywallData$LocalizedConfiguration$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public static final class Feature {
            public static final Companion Companion = new Companion(null);
            private final String content;
            private final String iconID;
            private final String title;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ Feature(int i, String str, String str2, String str3, t0 t0Var) {
                if (1 != (i & 1)) {
                    f0.a(i, 1, PaywallData$LocalizedConfiguration$Feature$$serializer.INSTANCE.getDescriptor());
                }
                this.title = str;
                if ((i & 2) == 0) {
                    this.content = null;
                } else {
                    this.content = str2;
                }
                if ((i & 4) == 0) {
                    this.iconID = null;
                } else {
                    this.iconID = str3;
                }
            }

            public static /* synthetic */ Feature copy$default(Feature feature, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = feature.title;
                }
                if ((i & 2) != 0) {
                    str2 = feature.content;
                }
                if ((i & 4) != 0) {
                    str3 = feature.iconID;
                }
                return feature.copy(str, str2, str3);
            }

            public static /* synthetic */ void getIconID$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(Feature feature, d dVar, qb.e eVar) {
                dVar.v(eVar, 0, feature.title);
                if (dVar.e(eVar, 1) || feature.content != null) {
                    dVar.j(eVar, 1, x0.a, feature.content);
                }
                if (!dVar.e(eVar, 2) && feature.iconID == null) {
                    return;
                }
                dVar.j(eVar, 2, x0.a, feature.iconID);
            }

            @InternalRevenueCatAPI
            public final /* synthetic */ Feature copy(String str, String str2, String str3) {
                t.g(str, "title");
                return new Feature(str, str2, str3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Feature)) {
                    return false;
                }
                Feature feature = (Feature) obj;
                return t.c(this.title, feature.title) && t.c(this.content, feature.content) && t.c(this.iconID, feature.iconID);
            }

            public final String getContent() {
                return this.content;
            }

            public final String getIconID() {
                return this.iconID;
            }

            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                String str = this.content;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.iconID;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "Feature(title=" + this.title + ", content=" + this.content + ", iconID=" + this.iconID + ')';
            }

            public Feature(String str, String str2, String str3) {
                t.g(str, "title");
                this.title = str;
                this.content = str2;
                this.iconID = str3;
            }

            public /* synthetic */ Feature(String str, String str2, String str3, int i, k kVar) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
            }
        }

        public static final class OfferOverride {
            public static final Companion Companion = new Companion(null);
            private final String offerBadge;
            private final String offerDetails;
            private final String offerDetailsWithIntroOffer;
            private final String offerDetailsWithMultipleIntroOffers;
            private final String offerName;

            public static final class Companion {
                public /* synthetic */ Companion(k kVar) {
                    this();
                }

                public final b serializer() {
                    return PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            @e
            public /* synthetic */ OfferOverride(int i, String str, String str2, String str3, String str4, String str5, t0 t0Var) {
                if (3 != (i & 3)) {
                    f0.a(i, 3, PaywallData$LocalizedConfiguration$OfferOverride$$serializer.INSTANCE.getDescriptor());
                }
                this.offerName = str;
                this.offerDetails = str2;
                if ((i & 4) == 0) {
                    this.offerDetailsWithIntroOffer = null;
                } else {
                    this.offerDetailsWithIntroOffer = str3;
                }
                if ((i & 8) == 0) {
                    this.offerDetailsWithMultipleIntroOffers = null;
                } else {
                    this.offerDetailsWithMultipleIntroOffers = str4;
                }
                if ((i & 16) == 0) {
                    this.offerBadge = null;
                } else {
                    this.offerBadge = str5;
                }
            }

            public static /* synthetic */ void getOfferBadge$annotations() {
            }

            public static /* synthetic */ void getOfferDetails$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
            }

            public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
            }

            public static /* synthetic */ void getOfferName$annotations() {
            }

            public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(OfferOverride offerOverride, d dVar, qb.e eVar) {
                dVar.v(eVar, 0, offerOverride.offerName);
                dVar.v(eVar, 1, offerOverride.offerDetails);
                if (dVar.e(eVar, 2) || offerOverride.offerDetailsWithIntroOffer != null) {
                    dVar.j(eVar, 2, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithIntroOffer);
                }
                if (dVar.e(eVar, 3) || offerOverride.offerDetailsWithMultipleIntroOffers != null) {
                    dVar.j(eVar, 3, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerDetailsWithMultipleIntroOffers);
                }
                if (!dVar.e(eVar, 4) && offerOverride.offerBadge == null) {
                    return;
                }
                dVar.j(eVar, 4, EmptyStringToNullSerializer.INSTANCE, offerOverride.offerBadge);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OfferOverride)) {
                    return false;
                }
                OfferOverride offerOverride = (OfferOverride) obj;
                return t.c(this.offerName, offerOverride.offerName) && t.c(this.offerDetails, offerOverride.offerDetails) && t.c(this.offerDetailsWithIntroOffer, offerOverride.offerDetailsWithIntroOffer) && t.c(this.offerDetailsWithMultipleIntroOffers, offerOverride.offerDetailsWithMultipleIntroOffers) && t.c(this.offerBadge, offerOverride.offerBadge);
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

            public int hashCode() {
                int hashCode = ((this.offerName.hashCode() * 31) + this.offerDetails.hashCode()) * 31;
                String str = this.offerDetailsWithIntroOffer;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.offerDetailsWithMultipleIntroOffers;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.offerBadge;
                return hashCode3 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "OfferOverride(offerName=" + this.offerName + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerBadge=" + this.offerBadge + ')';
            }

            public OfferOverride(String str, String str2, String str3, String str4, String str5) {
                t.g(str, "offerName");
                t.g(str2, "offerDetails");
                this.offerName = str;
                this.offerDetails = str2;
                this.offerDetailsWithIntroOffer = str3;
                this.offerDetailsWithMultipleIntroOffers = str4;
                this.offerBadge = str5;
            }

            public /* synthetic */ OfferOverride(String str, String str2, String str3, String str4, String str5, int i, k kVar) {
                this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
            }
        }

        @e
        public /* synthetic */ LocalizedConfiguration(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, t0 t0Var) {
            if (5 != (i & 5)) {
                f0.a(i, 5, PaywallData$LocalizedConfiguration$$serializer.INSTANCE.getDescriptor());
            }
            this.title = str;
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            this.callToAction = str3;
            if ((i & 8) == 0) {
                this.callToActionWithIntroOffer = null;
            } else {
                this.callToActionWithIntroOffer = str4;
            }
            if ((i & 16) == 0) {
                this.callToActionWithMultipleIntroOffers = null;
            } else {
                this.callToActionWithMultipleIntroOffers = str5;
            }
            if ((i & 32) == 0) {
                this.offerDetails = null;
            } else {
                this.offerDetails = str6;
            }
            if ((i & 64) == 0) {
                this.offerDetailsWithIntroOffer = null;
            } else {
                this.offerDetailsWithIntroOffer = str7;
            }
            if ((i & 128) == 0) {
                this.offerDetailsWithMultipleIntroOffers = null;
            } else {
                this.offerDetailsWithMultipleIntroOffers = str8;
            }
            if ((i & 256) == 0) {
                this.offerName = null;
            } else {
                this.offerName = str9;
            }
            if ((i & 512) == 0) {
                this.features = v.n();
            } else {
                this.features = list;
            }
            if ((i & 1024) == 0) {
                this.tierName = null;
            } else {
                this.tierName = str10;
            }
            if ((i & 2048) == 0) {
                this.offerOverrides = S.h();
            } else {
                this.offerOverrides = map;
            }
        }

        public static final /* synthetic */ b[] access$get$childSerializers$cp() {
            return $childSerializers;
        }

        public static /* synthetic */ void getCallToAction$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getCallToActionWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferDetails$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithIntroOffer$annotations() {
        }

        public static /* synthetic */ void getOfferDetailsWithMultipleIntroOffers$annotations() {
        }

        public static /* synthetic */ void getOfferName$annotations() {
        }

        public static /* synthetic */ void getOfferOverrides$annotations() {
        }

        public static /* synthetic */ void getSubtitle$annotations() {
        }

        public static /* synthetic */ void getTierName$annotations() {
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(LocalizedConfiguration localizedConfiguration, d dVar, qb.e eVar) {
            ob.k[] kVarArr = $childSerializers;
            dVar.v(eVar, 0, localizedConfiguration.title);
            if (dVar.e(eVar, 1) || localizedConfiguration.subtitle != null) {
                dVar.j(eVar, 1, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.subtitle);
            }
            dVar.v(eVar, 2, localizedConfiguration.callToAction);
            if (dVar.e(eVar, 3) || localizedConfiguration.callToActionWithIntroOffer != null) {
                dVar.j(eVar, 3, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithIntroOffer);
            }
            if (dVar.e(eVar, 4) || localizedConfiguration.callToActionWithMultipleIntroOffers != null) {
                dVar.j(eVar, 4, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.callToActionWithMultipleIntroOffers);
            }
            if (dVar.e(eVar, 5) || localizedConfiguration.offerDetails != null) {
                dVar.j(eVar, 5, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetails);
            }
            if (dVar.e(eVar, 6) || localizedConfiguration.offerDetailsWithIntroOffer != null) {
                dVar.j(eVar, 6, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithIntroOffer);
            }
            if (dVar.e(eVar, 7) || localizedConfiguration.offerDetailsWithMultipleIntroOffers != null) {
                dVar.j(eVar, 7, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerDetailsWithMultipleIntroOffers);
            }
            if (dVar.e(eVar, 8) || localizedConfiguration.offerName != null) {
                dVar.j(eVar, 8, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.offerName);
            }
            if (dVar.e(eVar, 9) || !t.c(localizedConfiguration.features, v.n())) {
                dVar.k(eVar, 9, kVarArr[9], localizedConfiguration.features);
            }
            if (dVar.e(eVar, 10) || localizedConfiguration.tierName != null) {
                dVar.j(eVar, 10, EmptyStringToNullSerializer.INSTANCE, localizedConfiguration.tierName);
            }
            if (!dVar.e(eVar, 11) && t.c(localizedConfiguration.offerOverrides, S.h())) {
                return;
            }
            dVar.k(eVar, 11, kVarArr[11], localizedConfiguration.offerOverrides);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedConfiguration)) {
                return false;
            }
            LocalizedConfiguration localizedConfiguration = (LocalizedConfiguration) obj;
            return t.c(this.title, localizedConfiguration.title) && t.c(this.subtitle, localizedConfiguration.subtitle) && t.c(this.callToAction, localizedConfiguration.callToAction) && t.c(this.callToActionWithIntroOffer, localizedConfiguration.callToActionWithIntroOffer) && t.c(this.callToActionWithMultipleIntroOffers, localizedConfiguration.callToActionWithMultipleIntroOffers) && t.c(this.offerDetails, localizedConfiguration.offerDetails) && t.c(this.offerDetailsWithIntroOffer, localizedConfiguration.offerDetailsWithIntroOffer) && t.c(this.offerDetailsWithMultipleIntroOffers, localizedConfiguration.offerDetailsWithMultipleIntroOffers) && t.c(this.offerName, localizedConfiguration.offerName) && t.c(this.features, localizedConfiguration.features) && t.c(this.tierName, localizedConfiguration.tierName) && t.c(this.offerOverrides, localizedConfiguration.offerOverrides);
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

        public final Map getOfferOverrides() {
            return this.offerOverrides;
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
            int hashCode8 = (((hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.features.hashCode()) * 31;
            String str8 = this.tierName;
            return ((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.offerOverrides.hashCode();
        }

        public String toString() {
            return "LocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", features=" + this.features + ", tierName=" + this.tierName + ", offerOverrides=" + this.offerOverrides + ')';
        }

        public LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map) {
            t.g(str, "title");
            t.g(str3, "callToAction");
            t.g(list, "features");
            t.g(map, "offerOverrides");
            this.title = str;
            this.subtitle = str2;
            this.callToAction = str3;
            this.callToActionWithIntroOffer = str4;
            this.callToActionWithMultipleIntroOffers = str5;
            this.offerDetails = str6;
            this.offerDetailsWithIntroOffer = str7;
            this.offerDetailsWithMultipleIntroOffers = str8;
            this.offerName = str9;
            this.features = list;
            this.tierName = str10;
            this.offerOverrides = map;
        }

        public /* synthetic */ LocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, String str10, Map map, int i, k kVar) {
            this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? v.n() : list, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? S.h() : map);
        }
    }

    public PaywallData(String str, String str2, Configuration configuration, URL url, int i, Map map, Map map2, List list, String str3) {
        t.g(str2, "templateName");
        t.g(configuration, "config");
        t.g(url, "assetBaseURL");
        t.g(map, "localization");
        t.g(map2, "localizationByTier");
        t.g(list, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = str2;
        this.config = configuration;
        this.assetBaseURL = url;
        this.revision = i;
        this.localization = map;
        this.localizationByTier = map2;
        this.zeroDecimalPlaceCountries = list;
        this.defaultLocale = str3;
    }

    public /* synthetic */ PaywallData(String str, String str2, Configuration configuration, URL url, int i, Map map, Map map2, List list, String str3, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : str, str2, configuration, url, (i2 & 16) != 0 ? 0 : i, map, (i2 & 64) != 0 ? S.h() : map2, (i2 & 128) != 0 ? v.n() : list, (i2 & 256) != 0 ? null : str3);
    }
}
