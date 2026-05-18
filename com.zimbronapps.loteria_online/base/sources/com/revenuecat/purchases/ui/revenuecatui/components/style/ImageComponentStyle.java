package com.revenuecat.purchases.ui.revenuecatui.components.style;

import F.L;
import M0.f;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final BorderStyles border;
    private final f contentScale;
    private final boolean ignoreTopWindowInsets;
    private final L margin;
    private final OfferEligibility offerEligibility;
    private final ColorStyles overlay;
    private final List overrides;
    private final L padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final ShadowStyles shadow;
    private final E1 shape;
    private final Size size;
    private final NonEmptyMap sources;
    private final Integer tabIndex;
    private final boolean visible;

    public ImageComponentStyle(NonEmptyMap sources, boolean z, Size size, L padding, L margin, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f contentScale, Package r19, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides, boolean z2) {
        t.g(sources, "sources");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(contentScale, "contentScale");
        t.g(overrides, "overrides");
        this.sources = sources;
        this.visible = z;
        this.size = size;
        this.padding = padding;
        this.margin = margin;
        this.shape = e1;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.overlay = colorStyles;
        this.contentScale = contentScale;
        this.rcPackage = r19;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.overrides = overrides;
        this.ignoreTopWindowInsets = z2;
    }

    public static /* synthetic */ ImageComponentStyle copy$default(ImageComponentStyle imageComponentStyle, NonEmptyMap nonEmptyMap, boolean z, Size size, L l, L l2, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f fVar, Package r28, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, boolean z2, int i, Object obj) {
        return imageComponentStyle.copy((i & 1) != 0 ? imageComponentStyle.sources : nonEmptyMap, (i & 2) != 0 ? imageComponentStyle.visible : z, (i & 4) != 0 ? imageComponentStyle.size : size, (i & 8) != 0 ? imageComponentStyle.padding : l, (i & 16) != 0 ? imageComponentStyle.margin : l2, (i & 32) != 0 ? imageComponentStyle.shape : e1, (i & 64) != 0 ? imageComponentStyle.border : borderStyles, (i & 128) != 0 ? imageComponentStyle.shadow : shadowStyles, (i & 256) != 0 ? imageComponentStyle.overlay : colorStyles, (i & 512) != 0 ? imageComponentStyle.contentScale : fVar, (i & 1024) != 0 ? imageComponentStyle.rcPackage : r28, (i & 2048) != 0 ? imageComponentStyle.resolvedOffer : resolvedOffer, (i & 4096) != 0 ? imageComponentStyle.tabIndex : num, (i & 8192) != 0 ? imageComponentStyle.offerEligibility : offerEligibility, (i & 16384) != 0 ? imageComponentStyle.overrides : list, (i & 32768) != 0 ? imageComponentStyle.ignoreTopWindowInsets : z2);
    }

    public final NonEmptyMap component1() {
        return this.sources;
    }

    public final f component10() {
        return this.contentScale;
    }

    public final Package component11() {
        return this.rcPackage;
    }

    public final ResolvedOffer component12() {
        return this.resolvedOffer;
    }

    public final Integer component13() {
        return this.tabIndex;
    }

    public final OfferEligibility component14() {
        return this.offerEligibility;
    }

    public final List component15() {
        return this.overrides;
    }

    public final boolean component16() {
        return this.ignoreTopWindowInsets;
    }

    public final boolean component2() {
        return this.visible;
    }

    public final Size component3() {
        return this.size;
    }

    public final L component4() {
        return this.padding;
    }

    public final L component5() {
        return this.margin;
    }

    public final E1 component6() {
        return this.shape;
    }

    public final BorderStyles component7() {
        return this.border;
    }

    public final ShadowStyles component8() {
        return this.shadow;
    }

    public final ColorStyles component9() {
        return this.overlay;
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final ImageComponentStyle copy(NonEmptyMap sources, boolean z, Size size, L padding, L margin, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f contentScale, Package r30, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List overrides, boolean z2) {
        t.g(sources, "sources");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(contentScale, "contentScale");
        t.g(overrides, "overrides");
        return new ImageComponentStyle(sources, z, size, padding, margin, e1, borderStyles, shadowStyles, colorStyles, contentScale, r30, resolvedOffer, num, offerEligibility, overrides, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageComponentStyle)) {
            return false;
        }
        ImageComponentStyle imageComponentStyle = (ImageComponentStyle) obj;
        return t.c(this.sources, imageComponentStyle.sources) && this.visible == imageComponentStyle.visible && t.c(this.size, imageComponentStyle.size) && t.c(this.padding, imageComponentStyle.padding) && t.c(this.margin, imageComponentStyle.margin) && t.c(this.shape, imageComponentStyle.shape) && t.c(this.border, imageComponentStyle.border) && t.c(this.shadow, imageComponentStyle.shadow) && t.c(this.overlay, imageComponentStyle.overlay) && t.c(this.contentScale, imageComponentStyle.contentScale) && t.c(this.rcPackage, imageComponentStyle.rcPackage) && t.c(this.resolvedOffer, imageComponentStyle.resolvedOffer) && t.c(this.tabIndex, imageComponentStyle.tabIndex) && t.c(this.offerEligibility, imageComponentStyle.offerEligibility) && t.c(this.overrides, imageComponentStyle.overrides) && this.ignoreTopWindowInsets == imageComponentStyle.ignoreTopWindowInsets;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ f getContentScale() {
        return this.contentScale;
    }

    public final /* synthetic */ boolean getIgnoreTopWindowInsets() {
        return this.ignoreTopWindowInsets;
    }

    public final /* synthetic */ L getMargin() {
        return this.margin;
    }

    public /* synthetic */ OfferEligibility getOfferEligibility() {
        return this.offerEligibility;
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return this.overlay;
    }

    public final /* synthetic */ List getOverrides() {
        return this.overrides;
    }

    public String getPackageUniqueId() {
        return PackageContext.DefaultImpls.getPackageUniqueId(this);
    }

    public final /* synthetic */ L getPadding() {
        return this.padding;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ E1 getShape() {
        return this.shape;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ NonEmptyMap getSources() {
        return this.sources;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((((this.sources.hashCode() * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31;
        E1 e1 = this.shape;
        int hashCode2 = (hashCode + (e1 == null ? 0 : e1.hashCode())) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode3 = (hashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int hashCode4 = (hashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        ColorStyles colorStyles = this.overlay;
        int hashCode5 = (((hashCode4 + (colorStyles == null ? 0 : colorStyles.hashCode())) * 31) + this.contentScale.hashCode()) * 31;
        Package r1 = this.rcPackage;
        int hashCode6 = (hashCode5 + (r1 == null ? 0 : r1.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int hashCode7 = (hashCode6 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        return ((((hashCode8 + (offerEligibility != null ? offerEligibility.hashCode() : 0)) * 31) + this.overrides.hashCode()) * 31) + Boolean.hashCode(this.ignoreTopWindowInsets);
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "ImageComponentStyle(sources=" + this.sources + ", visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", overlay=" + this.overlay + ", contentScale=" + this.contentScale + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", overrides=" + this.overrides + ", ignoreTopWindowInsets=" + this.ignoreTopWindowInsets + ')';
    }

    public /* synthetic */ ImageComponentStyle(NonEmptyMap nonEmptyMap, boolean z, Size size, L l, L l2, E1 e1, BorderStyles borderStyles, ShadowStyles shadowStyles, ColorStyles colorStyles, f fVar, Package r31, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, List list, boolean z2, int i, k kVar) {
        this(nonEmptyMap, z, size, l, l2, e1, borderStyles, shadowStyles, colorStyles, fVar, r31, (i & 2048) != 0 ? null : resolvedOffer, num, (i & 8192) != 0 ? null : offerEligibility, list, (i & 32768) != 0 ? false : z2);
    }
}
