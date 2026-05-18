package com.revenuecat.purchases.simulatedstore;

import Da.D;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.common.networking.WebBillingPhase;
import com.revenuecat.purchases.common.networking.WebBillingPrice;
import com.revenuecat.purchases.common.networking.WebBillingProductResponse;
import com.revenuecat.purchases.common.networking.WebBillingPurchaseOption;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.utils.PriceFactory;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SimulatedStoreProductConverter {
    public static final SimulatedStoreProductConverter INSTANCE = new SimulatedStoreProductConverter();

    private SimulatedStoreProductConverter() {
    }

    public static /* synthetic */ TestStoreProduct convertToStoreProduct$default(SimulatedStoreProductConverter simulatedStoreProductConverter, WebBillingProductResponse webBillingProductResponse, Locale locale, int i, Object obj) throws PurchasesException {
        if ((i & 2) != 0) {
            locale = Locale.getDefault();
            t.f(locale, "getDefault()");
        }
        return simulatedStoreProductConverter.convertToStoreProduct(webBillingProductResponse, locale);
    }

    public final /* synthetic */ TestStoreProduct convertToStoreProduct(WebBillingProductResponse webBillingProductResponse, Locale locale) throws PurchasesException {
        PricingPhase pricingPhase;
        Price price;
        Period period;
        PricingPhase pricingPhase2;
        t.g(webBillingProductResponse, "productResponse");
        t.g(locale, "locale");
        String defaultPurchaseOptionId = webBillingProductResponse.getDefaultPurchaseOptionId();
        Map purchaseOptions = webBillingProductResponse.getPurchaseOptions();
        if (defaultPurchaseOptionId == null) {
            defaultPurchaseOptionId = (String) D.e0(purchaseOptions.keySet());
        }
        WebBillingPurchaseOption webBillingPurchaseOption = (WebBillingPurchaseOption) purchaseOptions.get(defaultPurchaseOptionId);
        if (webBillingPurchaseOption == null) {
            throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "No purchase option found for product " + webBillingProductResponse.getIdentifier()));
        }
        PricingPhase pricingPhase3 = null;
        if (webBillingPurchaseOption.getBasePrice() != null) {
            WebBillingPrice basePrice = webBillingPurchaseOption.getBasePrice();
            price = PriceFactory.INSTANCE.createPrice$purchases_defaultsBc8Release(basePrice.getAmountMicros(), basePrice.getCurrency(), locale);
            period = null;
            pricingPhase2 = null;
            pricingPhase = null;
        } else {
            WebBillingPhase base = webBillingPurchaseOption.getBase();
            if ((base != null ? base.getPrice() : null) == null) {
                throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Base price is required for test subscription products"));
            }
            WebBillingPrice price2 = base.getPrice();
            PriceFactory priceFactory = PriceFactory.INSTANCE;
            Price createPrice$purchases_defaultsBc8Release = priceFactory.createPrice$purchases_defaultsBc8Release(price2.getAmountMicros(), price2.getCurrency(), locale);
            Period create = base.getPeriodDuration() != null ? Period.Factory.create(base.getPeriodDuration()) : null;
            WebBillingPhase trial = webBillingPurchaseOption.getTrial();
            PricingPhase pricingPhase4 = (trial != null ? trial.getPeriodDuration() : null) != null ? new PricingPhase(Period.Factory.create(trial.getPeriodDuration()), RecurrenceMode.FINITE_RECURRING, Integer.valueOf(trial.getCycleCount()), priceFactory.createPrice$purchases_defaultsBc8Release(0L, base.getPrice().getCurrency(), locale)) : null;
            WebBillingPhase introPrice = webBillingPurchaseOption.getIntroPrice();
            if ((introPrice != null ? introPrice.getPrice() : null) != null && introPrice.getPeriodDuration() != null) {
                WebBillingPrice price3 = introPrice.getPrice();
                pricingPhase3 = new PricingPhase(Period.Factory.create(introPrice.getPeriodDuration()), RecurrenceMode.FINITE_RECURRING, Integer.valueOf(introPrice.getCycleCount()), priceFactory.createPrice$purchases_defaultsBc8Release(price3.getAmountMicros(), price3.getCurrency(), locale));
            }
            pricingPhase = pricingPhase3;
            price = createPrice$purchases_defaultsBc8Release;
            period = create;
            pricingPhase2 = pricingPhase4;
        }
        String identifier = webBillingProductResponse.getIdentifier();
        String title = webBillingProductResponse.getTitle();
        String title2 = webBillingProductResponse.getTitle();
        String description = webBillingProductResponse.getDescription();
        if (description == null) {
            description = "";
        }
        return new TestStoreProduct(identifier, title, title2, description, price, period, pricingPhase2, pricingPhase, null, 256, null);
    }
}
