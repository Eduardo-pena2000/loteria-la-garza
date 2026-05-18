package com.revenuecat.purchases.ui.revenuecatui.components.style;

import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import d1.L;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l1.j;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final ColorStyles backgroundColor;
    private final ColorStyles color;
    private final CountdownComponent.CountFrom countFrom;
    private final Date countdownDate;
    private final int fontSize;
    private final FontSpec fontSpec;
    private final L fontWeight;
    private final e.b horizontalAlignment;
    private final F.L margin;
    private final OfferEligibility offerEligibility;
    private final List overrides;
    private final F.L padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final Size size;
    private final Integer tabIndex;
    private final j textAlign;
    private final NonEmptyMap texts;
    private final NonEmptyMap variableLocalizations;
    private final boolean visible;

    public /* synthetic */ TextComponentStyle(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, int i, L l, FontSpec fontSpec, j jVar, e.b bVar, ColorStyles colorStyles2, boolean z, Size size, F.L l2, F.L l3, Package r13, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap nonEmptyMap2, List list, k kVar) {
        this(nonEmptyMap, colorStyles, i, l, fontSpec, jVar, bVar, colorStyles2, z, size, l2, l3, r13, resolvedOffer, num, offerEligibility, date, countFrom, nonEmptyMap2, list);
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final /* synthetic */ ColorStyles getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ ColorStyles getColor() {
        return this.color;
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ Date getCountdownDate() {
        return this.countdownDate;
    }

    public final /* synthetic */ int getFontSize() {
        return this.fontSize;
    }

    public final /* synthetic */ FontSpec getFontSpec() {
        return this.fontSpec;
    }

    public final /* synthetic */ L getFontWeight() {
        return this.fontWeight;
    }

    public final /* synthetic */ e.b getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

    public final /* synthetic */ F.L getMargin() {
        return this.margin;
    }

    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ F.L getPadding() {
        return this.padding;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public final /* synthetic */ j getTextAlign-buA522U() {
        return this.textAlign;
    }

    public final /* synthetic */ NonEmptyMap getTexts() {
        return this.texts;
    }

    public final /* synthetic */ NonEmptyMap getVariableLocalizations() {
        return this.variableLocalizations;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    private TextComponentStyle(NonEmptyMap texts, ColorStyles color, int i, L l, FontSpec fontSpec, j jVar, e.b horizontalAlignment, ColorStyles colorStyles, boolean z, Size size, F.L padding, F.L margin, Package r24, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap variableLocalizations, List overrides) {
        t.g(texts, "texts");
        t.g(color, "color");
        t.g(horizontalAlignment, "horizontalAlignment");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(countFrom, "countFrom");
        t.g(variableLocalizations, "variableLocalizations");
        t.g(overrides, "overrides");
        this.texts = texts;
        this.color = color;
        this.fontSize = i;
        this.fontWeight = l;
        this.fontSpec = fontSpec;
        this.textAlign = jVar;
        this.horizontalAlignment = horizontalAlignment;
        this.backgroundColor = colorStyles;
        this.visible = z;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.rcPackage = r24;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.countdownDate = date;
        this.countFrom = countFrom;
        this.variableLocalizations = variableLocalizations;
        this.overrides = overrides;
    }

    public /* synthetic */ TextComponentStyle(NonEmptyMap nonEmptyMap, ColorStyles colorStyles, int i, L l, FontSpec fontSpec, j jVar, e.b bVar, ColorStyles colorStyles2, boolean z, Size size, F.L l2, F.L l3, Package r38, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, NonEmptyMap nonEmptyMap2, List list, int i2, k kVar) {
        this(nonEmptyMap, colorStyles, i, l, fontSpec, jVar, bVar, colorStyles2, z, size, l2, l3, r38, (i2 & 8192) != 0 ? null : resolvedOffer, num, (i2 & 32768) != 0 ? null : offerEligibility, date, countFrom, nonEmptyMap2, list, null);
    }
}
