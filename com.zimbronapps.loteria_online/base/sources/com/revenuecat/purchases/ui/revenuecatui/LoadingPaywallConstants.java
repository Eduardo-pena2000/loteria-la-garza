package com.revenuecat.purchases.ui.revenuecatui;

import Da.v;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.TestStoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import java.util.List;
import kotlin.jvm.internal.k;
import v0.r0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
final class LoadingPaywallConstants {
    public static final String offeringIdentifier = "loading_offering";
    public static final float placeholderAlpha = 0.5f;
    public static final LoadingPaywallConstants INSTANCE = new LoadingPaywallConstants();
    private static final long placeholderColor = r0.q(r0.b.e(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    private static final PaywallTemplate template = PaywallTemplate.TEMPLATE_2;
    private static final List packages = v.q(new Package("weekly", PackageType.WEEKLY, new TestStoreProduct("com.revenuecat.weekly", "Weekly", "Weekly (App name)", "Weekly", new Price("$1.99", 1990000, "USD"), new Period(1, Period.Unit.WEEK, "P1W"), (Period) null, (Price) null, 192, (k) null), "loading_offering"), new Package("monthly", PackageType.MONTHLY, new TestStoreProduct("com.revenuecat.monthly", "Monthly", "Monthly (App name)", "Monthly", new Price("$5.99", 5990000, "USD"), new Period(1, Period.Unit.MONTH, "P1M"), (Period) null, (Price) null, 192, (k) null), "loading_offering"), new Package("annual", PackageType.ANNUAL, new TestStoreProduct("com.revenuecat.annual", "Annual", "Annual (App name)", "Annual", new Price("$15.99", 5990000, "USD"), new Period(1, Period.Unit.YEAR, "P1Y"), (Period) null, (Price) null, 192, (k) null), "loading_offering"));

    private LoadingPaywallConstants() {
    }

    public final List getPackages() {
        return packages;
    }

    public final long getPlaceholderColor-0d7_KjU() {
        return placeholderColor;
    }

    public final PaywallTemplate getTemplate() {
        return template;
    }
}
