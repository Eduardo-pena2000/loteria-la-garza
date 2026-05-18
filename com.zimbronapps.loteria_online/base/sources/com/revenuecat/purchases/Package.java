package com.revenuecat.purchases;

import com.revenuecat.purchases.models.StoreProduct;
import java.net.URL;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class Package {
    private final String identifier;
    private final PackageType packageType;
    private final PresentedOfferingContext presentedOfferingContext;
    private final StoreProduct product;
    private final URL webCheckoutURL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext) {
        this(str, packageType, storeProduct, presentedOfferingContext, null, 16, null);
        t.g(str, "identifier");
        t.g(packageType, "packageType");
        t.g(storeProduct, "product");
        t.g(presentedOfferingContext, "presentedOfferingContext");
    }

    @Ca.e
    public static /* synthetic */ void getOffering$annotations() {
    }

    public final Package copy$purchases_defaultsBc8Release(PresentedOfferingContext presentedOfferingContext) {
        t.g(presentedOfferingContext, "presentedOfferingContext");
        return new Package(this.identifier, this.packageType, this.product.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, this.webCheckoutURL);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Package)) {
            return false;
        }
        Package r5 = (Package) obj;
        return t.c(this.identifier, r5.identifier) && this.packageType == r5.packageType && t.c(this.product, r5.product) && t.c(this.presentedOfferingContext, r5.presentedOfferingContext) && t.c(this.webCheckoutURL, r5.webCheckoutURL);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getOffering() {
        String offeringIdentifier = this.presentedOfferingContext.getOfferingIdentifier();
        return offeringIdentifier == null ? "" : offeringIdentifier;
    }

    public final PackageType getPackageType() {
        return this.packageType;
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final StoreProduct getProduct() {
        return this.product;
    }

    public final URL getWebCheckoutURL() {
        return this.webCheckoutURL;
    }

    public int hashCode() {
        int hashCode = ((((((this.identifier.hashCode() * 31) + this.packageType.hashCode()) * 31) + this.product.hashCode()) * 31) + this.presentedOfferingContext.hashCode()) * 31;
        URL url = this.webCheckoutURL;
        return hashCode + (url == null ? 0 : url.hashCode());
    }

    public String toString() {
        return "Package(identifier=" + this.identifier + ", packageType=" + this.packageType + ", product=" + this.product + ", presentedOfferingContext=" + this.presentedOfferingContext + ", webCheckoutURL=" + this.webCheckoutURL + ')';
    }

    public Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, URL url) {
        t.g(str, "identifier");
        t.g(packageType, "packageType");
        t.g(storeProduct, "product");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        this.identifier = str;
        this.packageType = packageType;
        this.product = storeProduct;
        this.presentedOfferingContext = presentedOfferingContext;
        this.webCheckoutURL = url;
    }

    public /* synthetic */ Package(String str, PackageType packageType, StoreProduct storeProduct, PresentedOfferingContext presentedOfferingContext, URL url, int i, kotlin.jvm.internal.k kVar) {
        this(str, packageType, storeProduct, presentedOfferingContext, (i & 16) != 0 ? null : url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Ca.e
    public Package(String str, PackageType packageType, StoreProduct storeProduct, String str2) {
        this(str, packageType, storeProduct, new PresentedOfferingContext(str2), null);
        t.g(str, "identifier");
        t.g(packageType, "packageType");
        t.g(storeProduct, "product");
        t.g(str2, "offering");
    }
}
