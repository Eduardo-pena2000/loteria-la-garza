package com.revenuecat.purchases;

import Da.w;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Offering {
    private final Ca.l annual$delegate;
    private final List availablePackages;
    private final String identifier;
    private final Ca.l lifetime$delegate;
    private final Map metadata;
    private final Ca.l monthly$delegate;
    private final PaywallData paywall;
    private final PaywallComponents paywallComponents;
    private final String serverDescription;
    private final Ca.l sixMonth$delegate;
    private final Ca.l threeMonth$delegate;
    private final Ca.l twoMonth$delegate;
    private final URL webCheckoutURL;
    private final Ca.l weekly$delegate;

    @InternalRevenueCatAPI
    public static final class PaywallComponents {
        private final PaywallComponentsData data;
        private final UiConfig uiConfig;

        public PaywallComponents(UiConfig uiConfig, PaywallComponentsData paywallComponentsData) {
            t.g(uiConfig, "uiConfig");
            t.g(paywallComponentsData, "data");
            this.uiConfig = uiConfig;
            this.data = paywallComponentsData;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallComponents)) {
                return false;
            }
            PaywallComponents paywallComponents = (PaywallComponents) obj;
            return t.c(this.uiConfig, paywallComponents.uiConfig) && t.c(this.data, paywallComponents.data);
        }

        public final PaywallComponentsData getData() {
            return this.data;
        }

        public final UiConfig getUiConfig() {
            return this.uiConfig;
        }

        public int hashCode() {
            return (this.uiConfig.hashCode() * 31) + this.data.hashCode();
        }

        public String toString() {
            return "PaywallComponents(uiConfig=" + this.uiConfig + ", data=" + this.data + ')';
        }
    }

    public Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url) {
        t.g(str, "identifier");
        t.g(str2, "serverDescription");
        t.g(map, "metadata");
        t.g(list, "availablePackages");
        this.identifier = str;
        this.serverDescription = str2;
        this.metadata = map;
        this.availablePackages = list;
        this.paywall = paywallData;
        this.paywallComponents = paywallComponents;
        this.webCheckoutURL = url;
        this.lifetime$delegate = Ca.m.b(new Offering$lifetime$2(this));
        this.annual$delegate = Ca.m.b(new Offering$annual$2(this));
        this.sixMonth$delegate = Ca.m.b(new Offering$sixMonth$2(this));
        this.threeMonth$delegate = Ca.m.b(new Offering$threeMonth$2(this));
        this.twoMonth$delegate = Ca.m.b(new Offering$twoMonth$2(this));
        this.monthly$delegate = Ca.m.b(new Offering$monthly$2(this));
        this.weekly$delegate = Ca.m.b(new Offering$weekly$2(this));
    }

    public static final /* synthetic */ Package access$findPackage(Offering offering, PackageType packageType) {
        return offering.findPackage(packageType);
    }

    private final Package findPackage(PackageType packageType) {
        Object obj;
        Iterator it = this.availablePackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (t.c(((Package) obj).getIdentifier(), packageType.getIdentifier())) {
                break;
            }
        }
        return (Package) obj;
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getPaywall$annotations() {
    }

    @InternalRevenueCatAPI
    public static /* synthetic */ void getPaywallComponents$annotations() {
    }

    public static /* synthetic */ void hasPaywall$annotations() {
    }

    @InternalRevenueCatAPI
    public final Offering copy(PresentedOfferingContext presentedOfferingContext) {
        t.g(presentedOfferingContext, "presentedOfferingContext");
        String str = this.identifier;
        String str2 = this.serverDescription;
        Map map = this.metadata;
        List list = this.availablePackages;
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).copy$purchases_defaultsBc8Release(presentedOfferingContext));
        }
        return new Offering(str, str2, map, arrayList, this.paywall, this.paywallComponents, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Offering)) {
            return false;
        }
        Offering offering = (Offering) obj;
        return t.c(this.identifier, offering.identifier) && t.c(this.serverDescription, offering.serverDescription) && t.c(this.metadata, offering.metadata) && t.c(this.availablePackages, offering.availablePackages) && t.c(this.paywall, offering.paywall) && t.c(this.paywallComponents, offering.paywallComponents) && t.c(this.webCheckoutURL, offering.webCheckoutURL);
    }

    public final Package get(String str) {
        t.g(str, "s");
        return getPackage(str);
    }

    public final Package getAnnual() {
        return (Package) this.annual$delegate.getValue();
    }

    public final List getAvailablePackages() {
        return this.availablePackages;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final Package getLifetime() {
        return (Package) this.lifetime$delegate.getValue();
    }

    public final Map getMetadata() {
        return this.metadata;
    }

    public final String getMetadataString(String str, String str2) {
        t.g(str, "key");
        t.g(str2, "default");
        Object obj = this.metadata.get(str);
        String str3 = obj instanceof String ? (String) obj : null;
        return str3 == null ? str2 : str3;
    }

    public final Package getMonthly() {
        return (Package) this.monthly$delegate.getValue();
    }

    public final Package getPackage(String str) throws NoSuchElementException {
        t.g(str, "identifier");
        for (Package r1 : this.availablePackages) {
            if (t.c(r1.getIdentifier(), str)) {
                return r1;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final PaywallData getPaywall() {
        return this.paywall;
    }

    public final PaywallComponents getPaywallComponents() {
        return this.paywallComponents;
    }

    public final String getServerDescription() {
        return this.serverDescription;
    }

    public final Package getSixMonth() {
        return (Package) this.sixMonth$delegate.getValue();
    }

    public final Package getThreeMonth() {
        return (Package) this.threeMonth$delegate.getValue();
    }

    public final Package getTwoMonth() {
        return (Package) this.twoMonth$delegate.getValue();
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public final Package getWeekly() {
        return (Package) this.weekly$delegate.getValue();
    }

    public final boolean hasPaywall() {
        return (this.paywall == null && this.paywallComponents == null) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((((((this.identifier.hashCode() * 31) + this.serverDescription.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.availablePackages.hashCode()) * 31;
        PaywallData paywallData = this.paywall;
        int hashCode2 = (hashCode + (paywallData == null ? 0 : paywallData.hashCode())) * 31;
        PaywallComponents paywallComponents = this.paywallComponents;
        int hashCode3 = (hashCode2 + (paywallComponents == null ? 0 : paywallComponents.hashCode())) * 31;
        URL url = this.webCheckoutURL;
        return hashCode3 + (url != null ? url.hashCode() : 0);
    }

    public String toString() {
        return "Offering(identifier=" + this.identifier + ", serverDescription=" + this.serverDescription + ", metadata=" + this.metadata + ", availablePackages=" + this.availablePackages + ", paywall=" + this.paywall + ", paywallComponents=" + this.paywallComponents + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public /* synthetic */ Offering(String str, String str2, Map map, List list, PaywallData paywallData, PaywallComponents paywallComponents, URL url, int i, kotlin.jvm.internal.k kVar) {
        this(str, str2, map, list, (i & 16) != 0 ? null : paywallData, (i & 32) != 0 ? null : paywallComponents, (i & 64) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Offering(String str, String str2, Map map, List list) {
        this(str, str2, map, list, null, null, null);
        t.g(str, "identifier");
        t.g(str2, "serverDescription");
        t.g(map, "metadata");
        t.g(list, "availablePackages");
    }
}
