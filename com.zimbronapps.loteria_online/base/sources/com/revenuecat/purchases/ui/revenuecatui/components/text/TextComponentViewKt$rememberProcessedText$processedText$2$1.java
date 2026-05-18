package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Qa.a;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2;
import java.util.Locale;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentViewKt$rememberProcessedText$processedText$2$1 extends u implements a {
    final /* synthetic */ PaywallState.Loaded.Components $state;
    final /* synthetic */ TextComponentState $textState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextComponentViewKt$rememberProcessedText$processedText$2$1(PaywallState.Loaded.Components components, TextComponentState textComponentState) {
        super(0);
        this.$state = components;
        this.$textState = textComponentState;
    }

    public final String invoke() {
        VariableProcessor.PackageContext packageContext;
        Locale javaLocale = LocalizationKt.toJavaLocale(this.$state.getLocale());
        Locale javaLocale2 = LocalizationKt.toJavaLocale(this.$state.getCurrencyLocale());
        Package applicablePackage = this.$textState.getApplicablePackage();
        if (applicablePackage != null) {
            PaywallState.Loaded.Components components = this.$state;
            Price pricePerMonth$default = StoreProduct.pricePerMonth$default(applicablePackage.getProduct(), (Locale) null, 1, (Object) null);
            packageContext = new VariableProcessor.PackageContext(TextComponentViewKt.access$discountPercentage(pricePerMonth$default != null ? Long.valueOf(pricePerMonth$default.getAmountMicros()) : null, components.getMostExpensivePricePerMonthMicros()), !components.getShowPricesWithDecimals());
        } else {
            packageContext = null;
        }
        return VariableProcessorV2.INSTANCE.processVariables(this.$textState.getText(), this.$textState.getLocalizedVariableKeys(), this.$state.getVariableConfig(), this.$state.getVariableDataProvider(), packageContext, applicablePackage, this.$textState.getSubscriptionOption(), javaLocale2, javaLocale, this.$state.getCurrentDate(), this.$textState.getCountdownTime(), this.$textState.getCountFrom(), this.$state.getCustomVariables(), this.$state.getDefaultCustomVariables());
    }
}
