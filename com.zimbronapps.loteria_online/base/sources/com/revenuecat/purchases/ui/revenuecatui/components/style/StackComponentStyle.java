package com.revenuecat.purchases.ui.revenuecatui.components.style;

import C.q;
import F.L;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageContext;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentStyle implements ComponentStyle, PackageContext {
    public static final int $stable = 0;
    private final boolean applyBottomWindowInsets;
    private final boolean applyHorizontalWindowInsets;
    private final boolean applyTopWindowInsets;
    private final BackgroundStyles background;
    private final BadgeStyle badge;
    private final BorderStyles border;
    private final List children;
    private final CountdownComponent.CountFrom countFrom;
    private final Date countdownDate;
    private final Dimension dimension;
    private final L margin;
    private final OfferEligibility offerEligibility;
    private final List overrides;
    private final L padding;
    private final Package rcPackage;
    private final ResolvedOffer resolvedOffer;
    private final q scrollOrientation;
    private final ShadowStyles shadow;
    private final Shape shape;
    private final Size size;
    private final float spacing;
    private final Integer tabIndex;
    private final boolean visible;

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r14, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z2, boolean z3, boolean z4, k kVar) {
        this(list, dimension, z, size, f, backgroundStyles, l, l2, shape, borderStyles, shadowStyles, badgeStyle, qVar, r14, resolvedOffer, num, offerEligibility, date, countFrom, list2, z2, z3, z4);
    }

    public static /* synthetic */ StackComponentStyle copy-KMZiVUk$default(StackComponentStyle stackComponentStyle, List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r31, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        return stackComponentStyle.copy-KMZiVUk((i & 1) != 0 ? stackComponentStyle.children : list, (i & 2) != 0 ? stackComponentStyle.dimension : dimension, (i & 4) != 0 ? stackComponentStyle.visible : z, (i & 8) != 0 ? stackComponentStyle.size : size, (i & 16) != 0 ? stackComponentStyle.spacing : f, (i & 32) != 0 ? stackComponentStyle.background : backgroundStyles, (i & 64) != 0 ? stackComponentStyle.padding : l, (i & 128) != 0 ? stackComponentStyle.margin : l2, (i & 256) != 0 ? stackComponentStyle.shape : shape, (i & 512) != 0 ? stackComponentStyle.border : borderStyles, (i & 1024) != 0 ? stackComponentStyle.shadow : shadowStyles, (i & 2048) != 0 ? stackComponentStyle.badge : badgeStyle, (i & 4096) != 0 ? stackComponentStyle.scrollOrientation : qVar, (i & 8192) != 0 ? stackComponentStyle.rcPackage : r31, (i & 16384) != 0 ? stackComponentStyle.resolvedOffer : resolvedOffer, (i & 32768) != 0 ? stackComponentStyle.tabIndex : num, (i & 65536) != 0 ? stackComponentStyle.offerEligibility : offerEligibility, (i & 131072) != 0 ? stackComponentStyle.countdownDate : date, (i & 262144) != 0 ? stackComponentStyle.countFrom : countFrom, (i & 524288) != 0 ? stackComponentStyle.overrides : list2, (i & 1048576) != 0 ? stackComponentStyle.applyTopWindowInsets : z2, (i & 2097152) != 0 ? stackComponentStyle.applyBottomWindowInsets : z3, (i & 4194304) != 0 ? stackComponentStyle.applyHorizontalWindowInsets : z4);
    }

    public final List component1() {
        return this.children;
    }

    public final BorderStyles component10() {
        return this.border;
    }

    public final ShadowStyles component11() {
        return this.shadow;
    }

    public final BadgeStyle component12() {
        return this.badge;
    }

    public final q component13() {
        return this.scrollOrientation;
    }

    public final Package component14() {
        return this.rcPackage;
    }

    public final ResolvedOffer component15() {
        return this.resolvedOffer;
    }

    public final Integer component16() {
        return this.tabIndex;
    }

    public final OfferEligibility component17() {
        return this.offerEligibility;
    }

    public final Date component18() {
        return this.countdownDate;
    }

    public final CountdownComponent.CountFrom component19() {
        return this.countFrom;
    }

    public final Dimension component2() {
        return this.dimension;
    }

    public final List component20() {
        return this.overrides;
    }

    public final boolean component21() {
        return this.applyTopWindowInsets;
    }

    public final boolean component22() {
        return this.applyBottomWindowInsets;
    }

    public final boolean component23() {
        return this.applyHorizontalWindowInsets;
    }

    public final boolean component3() {
        return this.visible;
    }

    public final Size component4() {
        return this.size;
    }

    public final float component5-D9Ej5fM() {
        return this.spacing;
    }

    public final BackgroundStyles component6() {
        return this.background;
    }

    public final L component7() {
        return this.padding;
    }

    public final L component8() {
        return this.margin;
    }

    public final Shape component9() {
        return this.shape;
    }

    public /* synthetic */ boolean computeIsSelected(PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, int i) {
        return PackageContext.DefaultImpls.computeIsSelected(this, selectedPackageInfo, i);
    }

    public final StackComponentStyle copy-KMZiVUk(List children, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L padding, L margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r41, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List overrides, boolean z2, boolean z3, boolean z4) {
        t.g(children, "children");
        t.g(dimension, "dimension");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(countFrom, "countFrom");
        t.g(overrides, "overrides");
        return new StackComponentStyle(children, dimension, z, size, f, backgroundStyles, padding, margin, shape, borderStyles, shadowStyles, badgeStyle, qVar, r41, resolvedOffer, num, offerEligibility, date, countFrom, overrides, z2, z3, z4, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StackComponentStyle)) {
            return false;
        }
        StackComponentStyle stackComponentStyle = (StackComponentStyle) obj;
        return t.c(this.children, stackComponentStyle.children) && t.c(this.dimension, stackComponentStyle.dimension) && this.visible == stackComponentStyle.visible && t.c(this.size, stackComponentStyle.size) && h.i(this.spacing, stackComponentStyle.spacing) && t.c(this.background, stackComponentStyle.background) && t.c(this.padding, stackComponentStyle.padding) && t.c(this.margin, stackComponentStyle.margin) && t.c(this.shape, stackComponentStyle.shape) && t.c(this.border, stackComponentStyle.border) && t.c(this.shadow, stackComponentStyle.shadow) && t.c(this.badge, stackComponentStyle.badge) && this.scrollOrientation == stackComponentStyle.scrollOrientation && t.c(this.rcPackage, stackComponentStyle.rcPackage) && t.c(this.resolvedOffer, stackComponentStyle.resolvedOffer) && t.c(this.tabIndex, stackComponentStyle.tabIndex) && t.c(this.offerEligibility, stackComponentStyle.offerEligibility) && t.c(this.countdownDate, stackComponentStyle.countdownDate) && this.countFrom == stackComponentStyle.countFrom && t.c(this.overrides, stackComponentStyle.overrides) && this.applyTopWindowInsets == stackComponentStyle.applyTopWindowInsets && this.applyBottomWindowInsets == stackComponentStyle.applyBottomWindowInsets && this.applyHorizontalWindowInsets == stackComponentStyle.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyBottomWindowInsets() {
        return this.applyBottomWindowInsets;
    }

    public final /* synthetic */ boolean getApplyHorizontalWindowInsets() {
        return this.applyHorizontalWindowInsets;
    }

    public final /* synthetic */ boolean getApplyTopWindowInsets() {
        return this.applyTopWindowInsets;
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return this.background;
    }

    public final /* synthetic */ BadgeStyle getBadge() {
        return this.badge;
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return this.border;
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.countFrom;
    }

    public final /* synthetic */ Date getCountdownDate() {
        return this.countdownDate;
    }

    public final /* synthetic */ Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ L getMargin() {
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

    public final /* synthetic */ L getPadding() {
        return this.padding;
    }

    public /* synthetic */ Package getRcPackage() {
        return this.rcPackage;
    }

    public /* synthetic */ ResolvedOffer getResolvedOffer() {
        return this.resolvedOffer;
    }

    public final /* synthetic */ q getScrollOrientation() {
        return this.scrollOrientation;
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ Shape getShape() {
        return this.shape;
    }

    public /* synthetic */ Size getSize() {
        return this.size;
    }

    public final /* synthetic */ float getSpacing-D9Ej5fM() {
        return this.spacing;
    }

    public /* synthetic */ Integer getTabIndex() {
        return this.tabIndex;
    }

    public /* synthetic */ boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int hashCode = ((((((((this.children.hashCode() * 31) + this.dimension.hashCode()) * 31) + Boolean.hashCode(this.visible)) * 31) + this.size.hashCode()) * 31) + h.k(this.spacing)) * 31;
        BackgroundStyles backgroundStyles = this.background;
        int hashCode2 = (((((((hashCode + (backgroundStyles == null ? 0 : backgroundStyles.hashCode())) * 31) + this.padding.hashCode()) * 31) + this.margin.hashCode()) * 31) + this.shape.hashCode()) * 31;
        BorderStyles borderStyles = this.border;
        int hashCode3 = (hashCode2 + (borderStyles == null ? 0 : borderStyles.hashCode())) * 31;
        ShadowStyles shadowStyles = this.shadow;
        int hashCode4 = (hashCode3 + (shadowStyles == null ? 0 : shadowStyles.hashCode())) * 31;
        BadgeStyle badgeStyle = this.badge;
        int hashCode5 = (hashCode4 + (badgeStyle == null ? 0 : badgeStyle.hashCode())) * 31;
        q qVar = this.scrollOrientation;
        int hashCode6 = (hashCode5 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Package r1 = this.rcPackage;
        int hashCode7 = (hashCode6 + (r1 == null ? 0 : r1.hashCode())) * 31;
        ResolvedOffer resolvedOffer = this.resolvedOffer;
        int hashCode8 = (hashCode7 + (resolvedOffer == null ? 0 : resolvedOffer.hashCode())) * 31;
        Integer num = this.tabIndex;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        OfferEligibility offerEligibility = this.offerEligibility;
        int hashCode10 = (hashCode9 + (offerEligibility == null ? 0 : offerEligibility.hashCode())) * 31;
        Date date = this.countdownDate;
        return ((((((((((hashCode10 + (date != null ? date.hashCode() : 0)) * 31) + this.countFrom.hashCode()) * 31) + this.overrides.hashCode()) * 31) + Boolean.hashCode(this.applyTopWindowInsets)) * 31) + Boolean.hashCode(this.applyBottomWindowInsets)) * 31) + Boolean.hashCode(this.applyHorizontalWindowInsets);
    }

    public /* synthetic */ OfferEligibility resolveOfferEligibility(OfferEligibility offerEligibility) {
        return PackageContext.DefaultImpls.resolveOfferEligibility(this, offerEligibility);
    }

    public String toString() {
        return "StackComponentStyle(children=" + this.children + ", dimension=" + this.dimension + ", visible=" + this.visible + ", size=" + this.size + ", spacing=" + h.l(this.spacing) + ", background=" + this.background + ", padding=" + this.padding + ", margin=" + this.margin + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ", badge=" + this.badge + ", scrollOrientation=" + this.scrollOrientation + ", rcPackage=" + this.rcPackage + ", resolvedOffer=" + this.resolvedOffer + ", tabIndex=" + this.tabIndex + ", offerEligibility=" + this.offerEligibility + ", countdownDate=" + this.countdownDate + ", countFrom=" + this.countFrom + ", overrides=" + this.overrides + ", applyTopWindowInsets=" + this.applyTopWindowInsets + ", applyBottomWindowInsets=" + this.applyBottomWindowInsets + ", applyHorizontalWindowInsets=" + this.applyHorizontalWindowInsets + ')';
    }

    private StackComponentStyle(List children, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L padding, L margin, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r24, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List overrides, boolean z2, boolean z3, boolean z4) {
        t.g(children, "children");
        t.g(dimension, "dimension");
        t.g(size, "size");
        t.g(padding, "padding");
        t.g(margin, "margin");
        t.g(shape, "shape");
        t.g(countFrom, "countFrom");
        t.g(overrides, "overrides");
        this.children = children;
        this.dimension = dimension;
        this.visible = z;
        this.size = size;
        this.spacing = f;
        this.background = backgroundStyles;
        this.padding = padding;
        this.margin = margin;
        this.shape = shape;
        this.border = borderStyles;
        this.shadow = shadowStyles;
        this.badge = badgeStyle;
        this.scrollOrientation = qVar;
        this.rcPackage = r24;
        this.resolvedOffer = resolvedOffer;
        this.tabIndex = num;
        this.offerEligibility = offerEligibility;
        this.countdownDate = date;
        this.countFrom = countFrom;
        this.overrides = overrides;
        this.applyTopWindowInsets = z2;
        this.applyBottomWindowInsets = z3;
        this.applyHorizontalWindowInsets = z4;
    }

    public /* synthetic */ StackComponentStyle(List list, Dimension dimension, boolean z, Size size, float f, BackgroundStyles backgroundStyles, L l, L l2, Shape shape, BorderStyles borderStyles, ShadowStyles shadowStyles, BadgeStyle badgeStyle, q qVar, Package r42, ResolvedOffer resolvedOffer, Integer num, OfferEligibility offerEligibility, Date date, CountdownComponent.CountFrom countFrom, List list2, boolean z2, boolean z3, boolean z4, int i, k kVar) {
        this(list, dimension, z, size, f, backgroundStyles, l, l2, shape, borderStyles, shadowStyles, badgeStyle, qVar, r42, (i & 16384) != 0 ? null : resolvedOffer, num, (65536 & i) != 0 ? null : offerEligibility, date, countFrom, list2, (1048576 & i) != 0 ? false : z2, (2097152 & i) != 0 ? false : z3, (i & 4194304) != 0 ? false : z4, null);
    }
}
