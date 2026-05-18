package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import Ca.q;
import Ca.x;
import Da.Q;
import Da.S;
import Da.u;
import Da.v;
import android.net.Uri;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.ExpirationOrRenewal;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PriceDetails;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrencies;
import com.revenuecat.purchases.virtualcurrencies.VirtualCurrency;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterConfigTestData {
    public static final int $stable;
    private static final VirtualCurrencies fiveVirtualCurrencies;
    private static final VirtualCurrencies fourVirtualCurrencies;
    private static final PurchaseInformation purchaseInformationFreeTrial;
    private static final PurchaseInformation purchaseInformationLifetime;
    private static final PurchaseInformation purchaseInformationMonthlyRenewing;
    private static final PurchaseInformation purchaseInformationPromotional;
    private static final PurchaseInformation purchaseInformationYearlyExpired;
    private static final PurchaseInformation purchaseInformationYearlyExpiring;
    public static final CustomerCenterConfigTestData INSTANCE = new CustomerCenterConfigTestData();
    private static final CustomerCenterConfigData.Appearance standardAppearance = new CustomerCenterConfigData.Appearance(new CustomerCenterConfigData.Appearance.ColorInformation(new PaywallColor("#007AFF"), new PaywallColor("#000000"), new PaywallColor("#f5f5f7"), new PaywallColor("#7A0000"), new PaywallColor("#287aff")), new CustomerCenterConfigData.Appearance.ColorInformation(new PaywallColor("#FFFFFF"), new PaywallColor("#FFFFFF"), new PaywallColor("#A96800"), new PaywallColor("#FF2600"), new PaywallColor("#000000")));

    static {
        PriceDetails.Paid paid = new PriceDetails.Paid("$4.99");
        ExpirationOrRenewal.Renewal renewal = new ExpirationOrRenewal.Renewal("June 1st, 2024");
        Store store = Store.PLAY_STORE;
        purchaseInformationMonthlyRenewing = new PurchaseInformation("Basic", paid, renewal, new TestStoreProduct("monthly_product_id", "Basic", "title", "description", new Price("$4.99", 4990000L, "US"), new Period(1, Period.Unit.MONTH, "P1M"), (Period) null, (Price) null, 192, (k) null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), false, false, false, false);
        PriceDetails.Paid paid2 = new PriceDetails.Paid("$40.99");
        ExpirationOrRenewal.Expiration expiration = new ExpirationOrRenewal.Expiration("June 1st, 2024");
        Uri parse = Uri.parse("https://play.google.com/store/account/subscriptions");
        Price price = new Price("$40.99", 40990000L, "US");
        Period.Unit unit = Period.Unit.YEAR;
        purchaseInformationYearlyExpiring = new PurchaseInformation("Basic", paid2, expiration, new TestStoreProduct("yearly_product_id", "Basic", "title", "description", price, new Period(1, unit, "P1Y"), (Period) null, (Price) null, 192, (k) null), store, true, parse, false, false, true, false);
        purchaseInformationYearlyExpired = new PurchaseInformation("Basic", new PriceDetails.Paid("$40.99"), new ExpirationOrRenewal.Expiration("June 1st, 2024"), new TestStoreProduct("yearly_product_id", "Basic", "title", "description", new Price("$40.99", 40990000L, "US"), new Period(1, unit, "P1Y"), (Period) null, (Price) null, 192, (k) null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), true, false, true, false);
        purchaseInformationLifetime = new PurchaseInformation("Lifetime", new PriceDetails.Paid("$100.99"), null, null, Store.APP_STORE, false, Uri.parse("https://play.google.com/store/account/subscriptions"), false, false, false, true);
        PriceDetails.Free free = PriceDetails.Free.INSTANCE;
        purchaseInformationFreeTrial = new PurchaseInformation("Premium", free, new ExpirationOrRenewal.Expiration("June 15th, 2024"), new TestStoreProduct("premium_yearly_product_id", "Premium", "title", "description", new Price("$59.99", 59990000L, "US"), new Period(1, unit, "P1Y"), (Period) null, (Price) null, 192, (k) null), store, true, Uri.parse("https://play.google.com/store/account/subscriptions"), false, true, false, false);
        purchaseInformationPromotional = new PurchaseInformation("rc_promo_Test1_lifetime", free, new ExpirationOrRenewal.Expiration("April 24th, 2225"), null, Store.PROMOTIONAL, false, null, false, false, true, false);
        fourVirtualCurrencies = new VirtualCurrencies(S.l(x.a("GLD", new VirtualCurrency(100, "Gold", "GLD", "It's gold")), x.a("SLV", new VirtualCurrency(200, "Silver", "SLV", "It's silver")), x.a("BRNZ", new VirtualCurrency(300, "Bronze", "BRNZ", "It's bronze")), x.a("PLTNM", new VirtualCurrency(400, "Platinum", "PLTNM", "It's platinum"))));
        fiveVirtualCurrencies = new VirtualCurrencies(S.l(x.a("GLD", new VirtualCurrency(100, "Gold", "GLD", "It's gold")), x.a("SLV", new VirtualCurrency(200, "Silver", "SLV", "It's silver")), x.a("BRNZ", new VirtualCurrency(300, "Bronze", "BRNZ", "It's bronze")), x.a("PLTNM", new VirtualCurrency(400, "Platinum", "PLTNM", "It's platinum")), x.a("RC_COIN", new VirtualCurrency(1, "RC Coin", "RC_COIN", "RevenueCat Coin"))));
        $stable = 8;
    }

    private CustomerCenterConfigTestData() {
    }

    public static /* synthetic */ CustomerCenterConfigData customerCenterData$default(CustomerCenterConfigTestData customerCenterConfigTestData, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return customerCenterConfigTestData.customerCenterData(z, z2);
    }

    public final CustomerCenterConfigData customerCenterData(boolean z, boolean z2) {
        CustomerCenterConfigData.Screen.ScreenType screenType = CustomerCenterConfigData.Screen.ScreenType.MANAGEMENT;
        CustomerCenterConfigData.HelpPath.PathType pathType = CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE;
        q a = x.a(screenType, new CustomerCenterConfigData.Screen(screenType, "Manage Subscription", (String) null, v.q(new CustomerCenterConfigData.HelpPath("1", "Check for previous purchases", pathType, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (k) null), new CustomerCenterConfigData.HelpPath("2", "Request a refund", CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST, new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer("offer_id", true, "Wait a minute...", "Before you cancel, please consider accepting this one time offer", Q.f(x.a("monthly", "offer_id"))), (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 240, (k) null), new CustomerCenterConfigData.HelpPath("3", "Change plans", CustomerCenterConfigData.HelpPath.PathType.CHANGE_PLANS, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (k) null), new CustomerCenterConfigData.HelpPath("4", "Cancel subscription", CustomerCenterConfigData.HelpPath.PathType.CANCEL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey("Why are you cancelling?", v.q(new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("1", "Too expensive", new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer("offer_id", true, "Wait a minute...", "Before you cancel, please consider accepting this offer", Q.f(x.a("monthly", "offer_id")))), new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("2", "Don't use the app", (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, 4, (k) null), new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option("3", "Bought by mistake", (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, 4, (k) null))), (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 232, (k) null), new CustomerCenterConfigData.HelpPath("5", "FAQ", CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, "https://www.revenuecat.com/docs/customer-center-faq", (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 216, (k) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (k) null));
        CustomerCenterConfigData.Screen.ScreenType screenType2 = CustomerCenterConfigData.Screen.ScreenType.NO_ACTIVE;
        return new CustomerCenterConfigData(S.l(a, x.a(screenType2, new CustomerCenterConfigData.Screen(screenType2, "No subscriptions found", "We can try checking your account for any previous purchases", u.e(new CustomerCenterConfigData.HelpPath("9q9719171o", "Check for previous purchases", pathType, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 248, (k) null)), (CustomerCenterConfigData.ScreenOffering) null, 16, (k) null))), standardAppearance, new CustomerCenterConfigData.Localization("en_US", S.l(x.a("cancel", "Cancel"), x.a("back", "Back"))), new CustomerCenterConfigData.Support("test-support@revenuecat.com", Boolean.valueOf(z), (Boolean) null, new CustomerCenterConfigData.Support.SupportTickets(z2, new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(false, false, false, false, false, false, false, false, false, false, false, false, false, false), CustomerCenterConfigData.Support.SupportTickets.CustomerType.NOT_ACTIVE), 4, (k) null), (String) null, 16, (k) null);
    }

    public final VirtualCurrencies getFiveVirtualCurrencies() {
        return fiveVirtualCurrencies;
    }

    public final VirtualCurrencies getFourVirtualCurrencies() {
        return fourVirtualCurrencies;
    }

    public final PurchaseInformation getPurchaseInformationFreeTrial() {
        return purchaseInformationFreeTrial;
    }

    public final PurchaseInformation getPurchaseInformationLifetime() {
        return purchaseInformationLifetime;
    }

    public final PurchaseInformation getPurchaseInformationMonthlyRenewing() {
        return purchaseInformationMonthlyRenewing;
    }

    public final PurchaseInformation getPurchaseInformationPromotional() {
        return purchaseInformationPromotional;
    }

    public final PurchaseInformation getPurchaseInformationYearlyExpired() {
        return purchaseInformationYearlyExpired;
    }

    public final PurchaseInformation getPurchaseInformationYearlyExpiring() {
        return purchaseInformationYearlyExpiring;
    }

    public final CustomerCenterConfigData.Appearance getStandardAppearance() {
        return standardAppearance;
    }
}
