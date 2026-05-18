package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.TestStoreProduct;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class PreviewOfferingParser extends OfferingParser {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageType.values().length];
            try {
                iArr[PackageType.LIFETIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageType.ANNUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageType.SIX_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PackageType.THREE_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PackageType.TWO_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PackageType.MONTHLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PackageType.WEEKLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StoreProduct findMatchingProduct(Map productsById, JSONObject packageJson) {
        TestStoreProduct testStoreProduct;
        TestStoreProduct testStoreProduct2;
        t.g(productsById, "productsById");
        t.g(packageJson, "packageJson");
        String string = packageJson.getString("identifier");
        for (PackageType packageType : PackageType.values()) {
            if (t.c(packageType.getIdentifier(), string)) {
                switch (WhenMappings.$EnumSwitchMapping$0[packageType.ordinal()]) {
                    case 1:
                        testStoreProduct = new TestStoreProduct("com.revenuecat.lifetime_product", "Lifetime", "Lifetime (App name)", "Lifetime", new Price("$ 1,000.00", 1000000000L, "USD"), (Period) null, (Period) null, (Price) null, 192, (k) null);
                        return testStoreProduct;
                    case 2:
                        testStoreProduct = new TestStoreProduct("com.revenuecat.annual_product", "Annual", "Annual (App name)", "Annual", new Price("$ 67.99", 67990000L, "USD"), new Period(1, Period.Unit.YEAR, "P1Y"), new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, "USD")), (PricingPhase) null, (PresentedOfferingContext) null, 384, (k) null);
                        return testStoreProduct;
                    case 3:
                        testStoreProduct2 = new TestStoreProduct("com.revenuecat.semester_product", "6 month", "6 month (App name)", "6 month", new Price("$ 39.99", 39990000L, "USD"), new Period(6, Period.Unit.MONTH, "P6M"), (Period) null, (Price) null, 192, (k) null);
                        return testStoreProduct2;
                    case 4:
                        Price price = new Price("$ 23.99", 23990000L, "USD");
                        Period.Unit unit = Period.Unit.MONTH;
                        Period period = new Period(3, unit, "P3M");
                        Period period2 = new Period(2, Period.Unit.WEEK, "P2W");
                        RecurrenceMode recurrenceMode = RecurrenceMode.FINITE_RECURRING;
                        testStoreProduct2 = new TestStoreProduct("com.revenuecat.quarterly_product", "3 month", "3 month (App name)", "3 month", price, period, new PricingPhase(period2, recurrenceMode, 1, new Price("Free", 0L, "USD")), new PricingPhase(new Period(1, unit, "P1M"), recurrenceMode, 1, new Price("$ 3.99", 3990000L, "USD")), (PresentedOfferingContext) null, 256, (k) null);
                        return testStoreProduct2;
                    case 5:
                        Price price2 = new Price("$ 15.99", 15990000L, "USD");
                        Period.Unit unit2 = Period.Unit.MONTH;
                        testStoreProduct2 = new TestStoreProduct("com.revenuecat.bimonthly_product", "2 month", "2 month (App name)", "2 month", price2, new Period(2, unit2, "P2M"), (PricingPhase) null, new PricingPhase(new Period(1, unit2, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, new Price("$ 3.99", 3990000L, "USD")), (PresentedOfferingContext) null, 320, (k) null);
                        return testStoreProduct2;
                    case 6:
                        testStoreProduct2 = new TestStoreProduct("com.revenuecat.monthly_product", "Monthly", "Monthly (App name)", "Monthly", new Price("$ 7.99", 7990000L, "USD"), new Period(1, Period.Unit.MONTH, "P1M"), (Period) null, (Price) null, 192, (k) null);
                        return testStoreProduct2;
                    case 7:
                        return new TestStoreProduct("com.revenuecat.weekly_product", "Weekly", "Weekly (App name)", "Weekly", new Price("$ 1.49", 1490000L, "USD"), new Period(1, Period.Unit.WEEK, "P1W"), (Period) null, (Price) null, 192, (k) null);
                    default:
                        return null;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
