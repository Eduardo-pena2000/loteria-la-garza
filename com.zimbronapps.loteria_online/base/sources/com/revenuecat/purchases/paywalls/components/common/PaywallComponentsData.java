package com.revenuecat.purchases.paywalls.components.common;

import Ca.e;
import Da.v;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.List;
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
public final class PaywallComponentsData {
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final ExitOffers exitOffers;
    private final String id;
    private final ProductChangeConfig productChangeConfig;
    private final int revision;
    private final String templateName;
    private final List zeroDecimalPlaceCountries;
    public static final Companion Companion = new Companion(null);
    private static final b[] $childSerializers = {null, null, null, null, new M(LocaleId$$serializer.INSTANCE, new M(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null, null, null, null};

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @e
    public /* synthetic */ PaywallComponentsData(int i, String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i2, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, t0 t0Var, k kVar) {
        this(i, str, str2, url, componentsConfig, map, str3, i2, list, exitOffers, productChangeConfig, t0Var);
    }

    public static final /* synthetic */ b[] access$get$childSerializers$cp() {
        return $childSerializers;
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getComponentsConfig$annotations() {
    }

    public static /* synthetic */ void getComponentsLocalizations$annotations() {
    }

    public static /* synthetic */ void getDefaultLocaleIdentifier-uqtKvyA$annotations() {
    }

    public static /* synthetic */ void getExitOffers$annotations() {
    }

    public static /* synthetic */ void getProductChangeConfig$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static /* synthetic */ void getZeroDecimalPlaceCountries$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsBc8Release(PaywallComponentsData paywallComponentsData, d dVar, qb.e eVar) {
        ob.k[] kVarArr = $childSerializers;
        if (dVar.e(eVar, 0) || paywallComponentsData.id != null) {
            dVar.j(eVar, 0, x0.a, paywallComponentsData.id);
        }
        dVar.v(eVar, 1, paywallComponentsData.templateName);
        dVar.k(eVar, 2, URLSerializer.INSTANCE, paywallComponentsData.assetBaseURL);
        dVar.k(eVar, 3, ComponentsConfig$$serializer.INSTANCE, paywallComponentsData.componentsConfig);
        dVar.k(eVar, 4, kVarArr[4], paywallComponentsData.componentsLocalizations);
        dVar.k(eVar, 5, LocaleId$$serializer.INSTANCE, LocaleId.box-impl(paywallComponentsData.defaultLocaleIdentifier));
        if (dVar.e(eVar, 6) || paywallComponentsData.revision != 0) {
            dVar.n(eVar, 6, paywallComponentsData.revision);
        }
        if (dVar.e(eVar, 7) || !t.c(paywallComponentsData.zeroDecimalPlaceCountries, v.n())) {
            dVar.k(eVar, 7, GoogleListSerializer.INSTANCE, paywallComponentsData.zeroDecimalPlaceCountries);
        }
        if (dVar.e(eVar, 8) || paywallComponentsData.exitOffers != null) {
            dVar.j(eVar, 8, ExitOffers$$serializer.INSTANCE, paywallComponentsData.exitOffers);
        }
        if (!dVar.e(eVar, 9) && paywallComponentsData.productChangeConfig == null) {
            return;
        }
        dVar.j(eVar, 9, ProductChangeConfigSerializer.INSTANCE, paywallComponentsData.productChangeConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return t.c(this.id, paywallComponentsData.id) && t.c(this.templateName, paywallComponentsData.templateName) && t.c(this.assetBaseURL, paywallComponentsData.assetBaseURL) && t.c(this.componentsConfig, paywallComponentsData.componentsConfig) && t.c(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.equals-impl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision && t.c(this.zeroDecimalPlaceCountries, paywallComponentsData.zeroDecimalPlaceCountries) && t.c(this.exitOffers, paywallComponentsData.exitOffers) && t.c(this.productChangeConfig, paywallComponentsData.productChangeConfig);
    }

    public final /* synthetic */ URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final /* synthetic */ ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final /* synthetic */ Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    public final /* synthetic */ String getDefaultLocaleIdentifier-uqtKvyA() {
        return this.defaultLocaleIdentifier;
    }

    public final /* synthetic */ ExitOffers getExitOffers() {
        return this.exitOffers;
    }

    public final /* synthetic */ String getId() {
        return this.id;
    }

    public final /* synthetic */ ProductChangeConfig getProductChangeConfig() {
        return this.productChangeConfig;
    }

    public final /* synthetic */ int getRevision() {
        return this.revision;
    }

    public final /* synthetic */ String getTemplateName() {
        return this.templateName;
    }

    public final /* synthetic */ List getZeroDecimalPlaceCountries() {
        return this.zeroDecimalPlaceCountries;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.templateName.hashCode()) * 31) + this.assetBaseURL.hashCode()) * 31) + this.componentsConfig.hashCode()) * 31) + this.componentsLocalizations.hashCode()) * 31) + LocaleId.hashCode-impl(this.defaultLocaleIdentifier)) * 31) + this.revision) * 31) + this.zeroDecimalPlaceCountries.hashCode()) * 31;
        ExitOffers exitOffers = this.exitOffers;
        int hashCode2 = (hashCode + (exitOffers == null ? 0 : exitOffers.hashCode())) * 31;
        ProductChangeConfig productChangeConfig = this.productChangeConfig;
        return hashCode2 + (productChangeConfig != null ? productChangeConfig.hashCode() : 0);
    }

    public String toString() {
        return "PaywallComponentsData(id=" + this.id + ", templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + LocaleId.toString-impl(this.defaultLocaleIdentifier) + ", revision=" + this.revision + ", zeroDecimalPlaceCountries=" + this.zeroDecimalPlaceCountries + ", exitOffers=" + this.exitOffers + ", productChangeConfig=" + this.productChangeConfig + ')';
    }

    public /* synthetic */ PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, k kVar) {
        this(str, str2, url, componentsConfig, map, str3, i, list, exitOffers, productChangeConfig);
    }

    private PaywallComponentsData(int i, String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i2, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, t0 t0Var) {
        if (62 != (i & 62)) {
            f0.a(i, 62, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.templateName = str2;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str3;
        if ((i & 64) == 0) {
            this.revision = 0;
        } else {
            this.revision = i2;
        }
        if ((i & 128) == 0) {
            this.zeroDecimalPlaceCountries = v.n();
        } else {
            this.zeroDecimalPlaceCountries = list;
        }
        if ((i & 256) == 0) {
            this.exitOffers = null;
        } else {
            this.exitOffers = exitOffers;
        }
        if ((i & 512) == 0) {
            this.productChangeConfig = null;
        } else {
            this.productChangeConfig = productChangeConfig;
        }
    }

    private PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig) {
        t.g(str2, "templateName");
        t.g(url, "assetBaseURL");
        t.g(componentsConfig, "componentsConfig");
        t.g(map, "componentsLocalizations");
        t.g(str3, "defaultLocaleIdentifier");
        t.g(list, "zeroDecimalPlaceCountries");
        this.id = str;
        this.templateName = str2;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str3;
        this.revision = i;
        this.zeroDecimalPlaceCountries = list;
        this.exitOffers = exitOffers;
        this.productChangeConfig = productChangeConfig;
    }

    public /* synthetic */ PaywallComponentsData(String str, String str2, URL url, ComponentsConfig componentsConfig, Map map, String str3, int i, List list, ExitOffers exitOffers, ProductChangeConfig productChangeConfig, int i2, k kVar) {
        this((i2 & 1) != 0 ? null : str, str2, url, componentsConfig, map, str3, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? v.n() : list, (i2 & 256) != 0 ? null : exitOffers, (i2 & 512) != 0 ? null : productChangeConfig, null);
    }
}
