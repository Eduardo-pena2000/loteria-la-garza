package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import Da.S;
import Da.u;
import Da.v;
import X.l;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template1TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template2TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template3TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template4TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template5TestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template7CustomPackagesTestDataKt;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates.Template7TestDataKt;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TestData {
    public static final int $stable;
    public static final TestData INSTANCE;
    private static final String TEMPLATE_1_ID = "Template1";
    private static final String TEMPLATE_2_ID = "Template2";
    private static final String TEMPLATE_3_ID = "Template3";
    private static final String TEMPLATE_4_ID = "Template4";
    private static final String TEMPLATE_5_ID = "Template5";
    private static final String TEMPLATE_7_CUSTOM_PACKAGE_ID = "Template7CustomPackage";
    private static final String TEMPLATE_7_ID = "Template7";
    private static final Offering offeringWithNoPaywall;
    private static final Offering template1Offering;
    private static final Offering template1OfferingNoFooter;
    private static final Offering template2Offering;
    private static final Offering template3Offering;
    private static final Offering template4Offering;
    private static final Offering template5Offering;
    private static final Offering template7CustomPackageOffering;
    private static final Offering template7Offering;

    public static final class Components {
        public static final int $stable = 0;
        public static final Components INSTANCE = new Components();
        private static final PackageComponent monthlyPackageComponent;

        static {
            String identifier = PackageType.MONTHLY.getIdentifier();
            t.d(identifier);
            monthlyPackageComponent = new PackageComponent(identifier, false, new StackComponent(v.n(), (Boolean) null, (Dimension) null, (Size) null, (Float) null, (ColorScheme) null, (Background) null, (Padding) null, (Padding) null, (Shape) null, (Border) null, (Shadow) null, (Badge) null, (StackComponent.Overflow) null, (List) null, 32766, (k) null), (PromoOfferConfig) null, 8, (k) null);
        }

        private Components() {
        }

        public final PackageComponent getMonthlyPackageComponent() {
            return monthlyPackageComponent;
        }
    }

    public static final class Constants {
        public static final int $stable;
        private static final l currentColorScheme;
        public static final Constants INSTANCE = new Constants();
        private static final PaywallData.Configuration.Images images = new PaywallData.Configuration.Images("9a17e0a7_1689854430..jpeg", "9a17e0a7_1689854342..jpg", "9a17e0a7_1689854430..jpeg");
        private static final URL assetBaseURL = new URL("https://assets.pawwalls.com");
        private static final List zeroDecimalPlaceCountries = v.q("PH", "KZ", "TW", "MX", "TH");
        private static final PaywallData.LocalizedConfiguration localization = new PaywallData.LocalizedConfiguration("Call to action for _better_ conversion.", "Lorem ipsum is simply dummy text of the ~printing and~ typesetting industry.", "Subscribe for {{ sub_price_per_month }}/mo", (String) null, (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", v.n(), (String) null, (Map) null, 3224, (k) null);

        static {
            r0.a aVar = r0.b;
            currentColorScheme = new l(aVar.k(), aVar.k(), aVar.k(), aVar.k(), aVar.f(), aVar.a(), aVar.a(), aVar.a(), aVar.a(), aVar.c(), aVar.a(), aVar.e(), aVar.k(), aVar.k(), aVar.a(), aVar.e(), aVar.a(), aVar.d(), aVar.k(), aVar.g(), aVar.a(), aVar.k(), aVar.h(), aVar.k(), aVar.h(), aVar.k(), aVar.i(), aVar.g(), aVar.e(), (k) null);
            $stable = 8;
        }

        private Constants() {
        }

        public final URL getAssetBaseURL() {
            return assetBaseURL;
        }

        public final l getCurrentColorScheme() {
            return currentColorScheme;
        }

        public final PaywallData.Configuration.Images getImages() {
            return images;
        }

        public final PaywallData.LocalizedConfiguration getLocalization() {
            return localization;
        }

        public final List getZeroDecimalPlaceCountries() {
            return zeroDecimalPlaceCountries;
        }
    }

    public static final class Packages {
        public static final int $stable;
        public static final Packages INSTANCE = new Packages();
        private static final Package annual;
        private static final Package annualEuros;
        private static final Package annualTaiwan;
        private static final Package bimonthly;
        private static final Package custom;
        private static final Package lifetime;
        private static final Package monthly;
        private static final Package monthlyMexico;
        private static final Package quarterly;
        private static final Package quarterlyThailand;
        private static final Package semester;
        private static final Package unknown;
        private static final Package weekly;

        static {
            PackageType packageType = PackageType.WEEKLY;
            String identifier = packageType.getIdentifier();
            t.d(identifier);
            Price price = new Price("$1.49", 1490000L, "USD");
            Period.Unit unit = Period.Unit.WEEK;
            weekly = new Package(identifier, packageType, new TestStoreProduct("com.revenuecat.weekly_product", "Weekly", "Weekly (App name)", "Weekly", price, new Period(1, unit, "P1W"), (Period) null, (Price) null, 192, (k) null), "offering");
            PackageType packageType2 = PackageType.MONTHLY;
            String identifier2 = packageType2.getIdentifier();
            t.d(identifier2);
            Price price2 = new Price("$7.99", 7990000L, "USD");
            Period.Unit unit2 = Period.Unit.MONTH;
            monthly = new Package(identifier2, packageType2, new TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", price2, new Period(1, unit2, "P1M"), (Period) null, (Price) null, 192, (k) null), new PresentedOfferingContext("offering"), new URL("https://test-web-billing.revenuecat.com?rc_package=" + packageType2.getIdentifier()));
            PackageType packageType3 = PackageType.ANNUAL;
            String identifier3 = packageType3.getIdentifier();
            t.d(identifier3);
            Price price3 = new Price("$67.99", 67990000L, "USD");
            Period.Unit unit3 = Period.Unit.YEAR;
            annual = new Package(identifier3, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", price3, new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), (Price) null, 128, (k) null), new PresentedOfferingContext("offering"), new URL("https://test-web-billing.revenuecat.com?rc_package=" + packageType3.getIdentifier()));
            String identifier4 = packageType3.getIdentifier();
            t.d(identifier4);
            annualEuros = new Package(identifier4, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new Price("67,99 €", 67990000L, "EUR"), new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), (Price) null, 128, (k) null), "offering");
            PackageType packageType4 = PackageType.LIFETIME;
            String identifier5 = packageType4.getIdentifier();
            t.d(identifier5);
            lifetime = new Package(identifier5, packageType4, new TestStoreProduct("com.revenuecat.lifetime_product", "Lifetime", "Lifetime (App name)", "Lifetime", new Price("$1,000", 1000000000L, "USD"), (Period) null, (Period) null, (Price) null, 192, (k) null), "offering");
            PackageType packageType5 = PackageType.TWO_MONTH;
            String identifier6 = packageType5.getIdentifier();
            t.d(identifier6);
            bimonthly = new Package(identifier6, packageType5, new TestStoreProduct("com.revenuecat.bimonthly_product", "2 month", "2 month (App name)", "2 month", new Price("$15.99", 15990000L, "USD"), new Period(2, unit2, "P2M"), (Period) null, new Price("$3.99", 3990000L, "USD"), 64, (k) null), "offering");
            PackageType packageType6 = PackageType.THREE_MONTH;
            String identifier7 = packageType6.getIdentifier();
            t.d(identifier7);
            quarterly = new Package(identifier7, packageType6, new TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", new Price("$23.99", 23990000L, "USD"), new Period(3, unit2, "P3M"), new Period(2, unit, "P2W"), new Price("$3.99", 3990000L, "USD")), "offering");
            PackageType packageType7 = PackageType.SIX_MONTH;
            String identifier8 = packageType7.getIdentifier();
            t.d(identifier8);
            semester = new Package(identifier8, packageType7, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), (Period) null, (Price) null, 192, (k) null), "offering");
            custom = new Package("Custom", PackageType.CUSTOM, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), (Period) null, (Price) null, 192, (k) null), "offering");
            unknown = new Package("Unknown", PackageType.UNKNOWN, new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$39.99", 39990000L, "USD"), new Period(6, unit2, "P6M"), (Period) null, (Price) null, 192, (k) null), "offering");
            String identifier9 = packageType3.getIdentifier();
            t.d(identifier9);
            annualTaiwan = new Package(identifier9, packageType3, new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new Price("NT$67.00", 67000000L, "TWD"), new Period(1, unit3, "P1Y"), new Period(1, unit2, "P1M"), (Price) null, 128, (k) null), "offering");
            String identifier10 = packageType2.getIdentifier();
            t.d(identifier10);
            monthlyMexico = new Package(identifier10, packageType2, new TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", new Price("$8.00", 8000000L, "MXN"), new Period(1, unit2, "P1M"), (Period) null, (Price) null, 192, (k) null), "offering");
            String identifier11 = packageType6.getIdentifier();
            t.d(identifier11);
            quarterlyThailand = new Package(identifier11, packageType6, new TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", new Price("THB24.00", 24000000L, "THB"), new Period(3, unit2, "P3M"), (Period) null, new Price("THB4.00", 4000000L, "THB"), 64, (k) null), "offering");
            $stable = 8;
        }

        private Packages() {
        }

        public final Package getAnnual() {
            return annual;
        }

        public final Package getAnnualEuros() {
            return annualEuros;
        }

        public final Package getAnnualTaiwan() {
            return annualTaiwan;
        }

        public final Package getBimonthly() {
            return bimonthly;
        }

        public final Package getCustom() {
            return custom;
        }

        public final Package getLifetime() {
            return lifetime;
        }

        public final Package getMonthly() {
            return monthly;
        }

        public final Package getMonthlyMexico() {
            return monthlyMexico;
        }

        public final Package getQuarterly() {
            return quarterly;
        }

        public final Package getQuarterlyThailand() {
            return quarterlyThailand;
        }

        public final Package getSemester() {
            return semester;
        }

        public final Package getUnknown() {
            return unknown;
        }

        public final Package getWeekly() {
            return weekly;
        }
    }

    static {
        TestData testData = new TestData();
        INSTANCE = testData;
        Packages packages = Packages.INSTANCE;
        offeringWithNoPaywall = new Offering("Template1", "", S.h(), u.e(testData.copy(packages.getMonthly(), "Template1")), (PaywallData) null, (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template1Offering = new Offering("Template1", "", S.h(), u.e(testData.copy(packages.getMonthly(), "Template1")), Template1TestDataKt.getTemplate1(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template1OfferingNoFooter = new Offering("Template1", "", S.h(), u.e(testData.copy(packages.getMonthly(), "Template1")), PaywallData.copy$default(Template1TestDataKt.getTemplate1(testData), (String) null, PaywallData.Configuration.copy$default(Template1TestDataKt.getTemplate1(testData).getConfig(), (List) null, (String) null, (PaywallData.Configuration.Images) null, (PaywallData.Configuration.Images) null, (Map) null, false, false, (URL) null, (URL) null, (PaywallData.Configuration.ColorInformation) null, (Map) null, (List) null, (String) null, 7743, (Object) null), (URL) null, 0, (Map) null, (Map) null, (List) null, (String) null, 253, (Object) null), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template2Offering = new Offering("Template2", "", S.h(), v.q(testData.copy(packages.getWeekly(), "Template2"), testData.copy(packages.getMonthly(), "Template2"), testData.copy(packages.getAnnual(), "Template2"), testData.copy(packages.getLifetime(), "Template2")), Template2TestDataKt.getTemplate2(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template3Offering = new Offering("Template3", "", S.h(), u.e(testData.copy(packages.getMonthly(), "Template3")), Template3TestDataKt.getTemplate3(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template4Offering = new Offering("Template4", "", S.h(), v.q(testData.copy(packages.getMonthly(), "Template4"), testData.copy(packages.getSemester(), "Template4"), testData.copy(packages.getAnnual(), "Template4"), testData.copy(packages.getWeekly(), "Template4")), Template4TestDataKt.getTemplate4(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template5Offering = new Offering("Template5", "", S.h(), v.q(testData.copy(packages.getMonthly(), "Template5"), testData.copy(packages.getAnnual(), "Template5")), Template5TestDataKt.getTemplate5(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template7Offering = new Offering("Template7", "", S.h(), v.q(testData.copy(packages.getMonthly(), "Template7"), testData.copy(packages.getAnnual(), "Template7"), testData.copy(packages.getBimonthly(), "Template7"), testData.copy(packages.getQuarterly(), "Template7"), testData.copy(packages.getSemester(), "Template7"), testData.copy(packages.getLifetime(), "Template7")), Template7TestDataKt.getTemplate7(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        template7CustomPackageOffering = new Offering("Template7CustomPackage", "", S.h(), v.q(testData.copy(packages.getMonthly(), "Template7CustomPackage"), testData.copy(packages.getAnnual(), "Template7CustomPackage"), testData.copy(packages.getBimonthly(), "Template7CustomPackage"), testData.copy(packages.getQuarterly(), "Template7CustomPackage"), testData.copy(packages.getSemester(), "Template7CustomPackage"), testData.copy(packages.getLifetime(), "Template7CustomPackage")), Template7CustomPackagesTestDataKt.getTemplate7CustomPackages(testData), (Offering.PaywallComponents) null, (URL) null, 96, (k) null);
        $stable = 8;
    }

    private TestData() {
    }

    public final Package copy(Package r8, String offeringId) {
        t.g(r8, "<this>");
        t.g(offeringId, "offeringId");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(offeringId);
        return new Package(r8.getIdentifier(), r8.getPackageType(), r8.getProduct().copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext, r8.getWebCheckoutURL());
    }

    public final Offering getOfferingWithNoPaywall() {
        return offeringWithNoPaywall;
    }

    public final Offering getTemplate1Offering() {
        return template1Offering;
    }

    public final Offering getTemplate1OfferingNoFooter() {
        return template1OfferingNoFooter;
    }

    public final Offering getTemplate2Offering() {
        return template2Offering;
    }

    public final Offering getTemplate3Offering() {
        return template3Offering;
    }

    public final Offering getTemplate4Offering() {
        return template4Offering;
    }

    public final Offering getTemplate5Offering() {
        return template5Offering;
    }

    public final Offering getTemplate7CustomPackageOffering() {
        return template7CustomPackageOffering;
    }

    public final Offering getTemplate7Offering() {
        return template7Offering;
    }
}
