package com.revenuecat.purchases.ui.revenuecatui.components.style;

import Ca.I;
import Ca.o;
import Ca.q;
import Da.D;
import Da.S;
import Da.v;
import Da.w;
import F.L;
import Qa.l;
import Za.E;
import androidx.compose.foundation.layout.f;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialIconComponent;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.PartialTextComponent;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponent;
import com.revenuecat.purchases.paywalls.components.PartialTimelineComponentItem;
import com.revenuecat.purchases.paywalls.components.PartialVideoComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabControlComponent;
import com.revenuecat.purchases.paywalls.components.TabControlToggleComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TextComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedPartialKt;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.AlignmentKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.FitModeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.LocalizationKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.PaddingKt;
import com.revenuecat.purchases.ui.revenuecatui.components.ktx.ShapeKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyleKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabControlStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.extensions.OverflowExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PageControlExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyListKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PromoOfferResolver;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import n1.h;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StyleFactory {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final Shape.Rectangle DEFAULT_SHAPE = new Shape.Rectangle((CornerRadiuses) null, 1, (k) null);
    private static final float DEFAULT_SPACING = 0.0f;
    private static final boolean DEFAULT_VISIBILITY = true;
    private final Map colorAliases;
    private final Map fontAliases;
    private final NonEmptyMap localizations;
    private final Offering offering;
    private final boolean stripRules;
    private final NonEmptyMap variableLocalizations;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Shape.Rectangle getDEFAULT_SHAPE$revenuecatui_defaultsBc8Release() {
            return StyleFactory.access$getDEFAULT_SHAPE$cp();
        }

        private Companion() {
        }
    }

    public static final class StyleFactoryScope {
        private CountdownComponent.CountFrom countFrom;
        private final Map countPredicates;
        private final Map countValues;
        private Date countdownDate;
        private Integer defaultTabIndex;
        private PaywallState.Loaded.Components.AvailablePackages.Info packageInfo;
        private final Map packagesByTab;
        private final List packagesOutsideTabs;
        private TabControlStyle tabControl;
        private Integer tabControlIndex;
        private Integer tabIndex;
        private final WindowInsetsState windowInsetsState;

        public static final class WindowInsetsState {
            private boolean applyTopWindowInsets;
            private boolean ignoreTopWindowInsets;
            private boolean stillLookingForHeaderMedia = true;
            private boolean topWindowInsetsApplied;

            private final boolean isHeaderImage(PaywallComponent paywallComponent) {
                boolean z;
                if (!(paywallComponent instanceof ImageComponent)) {
                    return false;
                }
                SizeConstraint width = ((ImageComponent) paywallComponent).getSize().getWidth();
                if (width instanceof SizeConstraint.Fill) {
                    z = true;
                } else {
                    if (!(width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fixed)) {
                        throw new o();
                    }
                    z = false;
                }
                return z;
            }

            private final boolean isHeaderMedia(PaywallComponent paywallComponent) {
                return isHeaderImage(paywallComponent) || isHeaderVideo(paywallComponent);
            }

            private final boolean isHeaderVideo(PaywallComponent paywallComponent) {
                boolean z;
                if (!(paywallComponent instanceof VideoComponent)) {
                    return false;
                }
                SizeConstraint width = ((VideoComponent) paywallComponent).getSize().getWidth();
                if (width instanceof SizeConstraint.Fill) {
                    z = true;
                } else {
                    if (!(width instanceof SizeConstraint.Fit ? true : width instanceof SizeConstraint.Fixed)) {
                        throw new o();
                    }
                    z = false;
                }
                return z;
            }

            public final boolean getApplyTopWindowInsets() {
                boolean z = this.applyTopWindowInsets;
                this.applyTopWindowInsets = false;
                return z;
            }

            public final boolean getIgnoreTopWindowInsets() {
                boolean z = this.ignoreTopWindowInsets;
                this.ignoreTopWindowInsets = false;
                return z;
            }

            public final boolean getTopWindowInsetsApplied() {
                return this.topWindowInsetsApplied;
            }

            public final void handleHeaderMediaViewWindowInsets(PaywallComponent component) {
                t.g(component, "component");
                boolean z = false;
                if (!(component instanceof StackComponent)) {
                    if (component instanceof ImageComponent) {
                        if (this.stillLookingForHeaderMedia) {
                            this.ignoreTopWindowInsets = isHeaderImage(component);
                        }
                        this.stillLookingForHeaderMedia = false;
                        return;
                    } else {
                        if (!(component instanceof VideoComponent)) {
                            this.stillLookingForHeaderMedia = false;
                            return;
                        }
                        if (this.stillLookingForHeaderMedia) {
                            this.ignoreTopWindowInsets = isHeaderVideo(component);
                        }
                        this.stillLookingForHeaderMedia = false;
                        return;
                    }
                }
                if (this.stillLookingForHeaderMedia) {
                    StackComponent stackComponent = (StackComponent) component;
                    Dimension dimension = stackComponent.getDimension();
                    if (dimension instanceof Dimension.ZLayer) {
                        PaywallComponent paywallComponent = (PaywallComponent) D.h0(stackComponent.getComponents());
                        if (paywallComponent != null && isHeaderMedia(paywallComponent)) {
                            z = true;
                        }
                        this.topWindowInsetsApplied = z;
                    } else {
                        if (!(dimension instanceof Dimension.Horizontal ? true : dimension instanceof Dimension.Vertical)) {
                            throw new o();
                        }
                    }
                    this.applyTopWindowInsets = z;
                }
            }

            public final void setApplyTopWindowInsets(boolean z) {
                this.applyTopWindowInsets = z;
            }

            public final void setIgnoreTopWindowInsets(boolean z) {
                this.ignoreTopWindowInsets = z;
            }

            public final void setTopWindowInsetsApplied(boolean z) {
                this.topWindowInsetsApplied = z;
            }
        }

        public static final class WithCount {
            public static final int $stable = 0;
            private final int count;
            private final Object value;

            public WithCount(Object obj, int i) {
                this.value = obj;
                this.count = i;
            }

            public static /* synthetic */ WithCount copy$default(WithCount withCount, Object obj, int i, int i2, Object obj2) {
                if ((i2 & 1) != 0) {
                    obj = withCount.value;
                }
                if ((i2 & 2) != 0) {
                    i = withCount.count;
                }
                return withCount.copy(obj, i);
            }

            public final Object component1() {
                return this.value;
            }

            public final int component2() {
                return this.count;
            }

            public final WithCount copy(Object obj, int i) {
                return new WithCount(obj, i);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithCount)) {
                    return false;
                }
                WithCount withCount = (WithCount) obj;
                return t.c(this.value, withCount.value) && this.count == withCount.count;
            }

            public final int getCount() {
                return this.count;
            }

            public final Object getValue() {
                return this.value;
            }

            public int hashCode() {
                Object obj = this.value;
                return ((obj == null ? 0 : obj.hashCode()) * 31) + Integer.hashCode(this.count);
            }

            public String toString() {
                return "WithCount(value=" + this.value + ", count=" + this.count + ')';
            }
        }

        public StyleFactoryScope() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        public static final /* synthetic */ Map access$getCountPredicates$p(StyleFactoryScope styleFactoryScope) {
            return styleFactoryScope.countPredicates;
        }

        public static final /* synthetic */ Map access$getCountValues$p(StyleFactoryScope styleFactoryScope) {
            return styleFactoryScope.countValues;
        }

        private final Map component7() {
            return this.countPredicates;
        }

        private final Map component8() {
            return this.countValues;
        }

        public static /* synthetic */ StyleFactoryScope copy$default(StyleFactoryScope styleFactoryScope, PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map map, Map map2, int i, Object obj) {
            return styleFactoryScope.copy((i & 1) != 0 ? styleFactoryScope.packageInfo : info, (i & 2) != 0 ? styleFactoryScope.tabControl : tabControlStyle, (i & 4) != 0 ? styleFactoryScope.tabControlIndex : num, (i & 8) != 0 ? styleFactoryScope.tabIndex : num2, (i & 16) != 0 ? styleFactoryScope.countdownDate : date, (i & 32) != 0 ? styleFactoryScope.countFrom : countFrom, (i & 64) != 0 ? styleFactoryScope.countPredicates : map, (i & 128) != 0 ? styleFactoryScope.countValues : map2);
        }

        private static Object getApplyTopWindowInsets$delegate(StyleFactoryScope styleFactoryScope) {
            return P.d(new x(styleFactoryScope.windowInsetsState, WindowInsetsState.class, "applyTopWindowInsets", "getApplyTopWindowInsets()Z", 0));
        }

        private static Object getIgnoreTopWindowInsets$delegate(StyleFactoryScope styleFactoryScope) {
            return P.d(new x(styleFactoryScope.windowInsetsState, WindowInsetsState.class, "ignoreTopWindowInsets", "getIgnoreTopWindowInsets()Z", 0));
        }

        private final void recordPackage(PaywallState.Loaded.Components.AvailablePackages.Info info) {
            Integer num = this.tabIndex;
            if (num == null) {
                this.packagesOutsideTabs.add(info);
                return;
            }
            Map map = this.packagesByTab;
            Object obj = map.get(num);
            if (obj == null) {
                obj = new ArrayList();
                map.put(num, obj);
            }
            ((List) obj).add(info);
        }

        public final ComponentStyle applyBottomWindowInsetsIfNecessary(ComponentStyle componentStyle, boolean z) {
            ComponentStyle componentStyle2 = componentStyle;
            t.g(componentStyle2, "<this>");
            if (z) {
                if (componentStyle2 instanceof StackComponentStyle) {
                    componentStyle2 = StackComponentStyle.copy-KMZiVUk$default((StackComponentStyle) componentStyle2, null, null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, false, 6291455, null);
                } else if (componentStyle2 instanceof StickyFooterComponentStyle) {
                    StickyFooterComponentStyle stickyFooterComponentStyle = (StickyFooterComponentStyle) componentStyle2;
                    componentStyle2 = stickyFooterComponentStyle.copy(StackComponentStyle.copy-KMZiVUk$default(stickyFooterComponentStyle.getStackComponentStyle(), null, null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, false, 6291455, null));
                }
                t.e(componentStyle2, "null cannot be cast to non-null type T of com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope.applyBottomWindowInsetsIfNecessary");
            }
            return componentStyle2;
        }

        public final ComponentStyle applyHorizontalWindowInsetsIfNecessary(ComponentStyle componentStyle, boolean z) {
            ComponentStyle componentStyle2 = componentStyle;
            t.g(componentStyle2, "<this>");
            if (z) {
                if (componentStyle2 instanceof StackComponentStyle) {
                    componentStyle2 = StackComponentStyle.copy-KMZiVUk$default((StackComponentStyle) componentStyle2, null, null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, 4194303, null);
                } else if (componentStyle2 instanceof StickyFooterComponentStyle) {
                    StickyFooterComponentStyle stickyFooterComponentStyle = (StickyFooterComponentStyle) componentStyle2;
                    componentStyle2 = stickyFooterComponentStyle.copy(StackComponentStyle.copy-KMZiVUk$default(stickyFooterComponentStyle.getStackComponentStyle(), null, null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, true, 4194303, null));
                }
                t.e(componentStyle2, "null cannot be cast to non-null type T of com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope.applyHorizontalWindowInsetsIfNecessary");
            }
            return componentStyle2;
        }

        public final ComponentStyle applyTopWindowInsetsIfNotYetApplied(ComponentStyle to) {
            t.g(to, "to");
            return to instanceof StackComponentStyle ? StackComponentStyle.copy-KMZiVUk$default((StackComponentStyle) to, null, null, false, null, 0.0f, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, !this.windowInsetsState.getTopWindowInsetsApplied(), false, false, 7340031, null) : to;
        }

        public final PaywallState.Loaded.Components.AvailablePackages.Info component1() {
            return this.packageInfo;
        }

        public final TabControlStyle component2() {
            return this.tabControl;
        }

        public final Integer component3() {
            return this.tabControlIndex;
        }

        public final Integer component4() {
            return this.tabIndex;
        }

        public final Date component5() {
            return this.countdownDate;
        }

        public final CountdownComponent.CountFrom component6() {
            return this.countFrom;
        }

        public final StyleFactoryScope copy(PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map countPredicates, Map countValues) {
            t.g(countFrom, "countFrom");
            t.g(countPredicates, "countPredicates");
            t.g(countValues, "countValues");
            return new StyleFactoryScope(info, tabControlStyle, num, num2, date, countFrom, countPredicates, countValues);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StyleFactoryScope)) {
                return false;
            }
            StyleFactoryScope styleFactoryScope = (StyleFactoryScope) obj;
            return t.c(this.packageInfo, styleFactoryScope.packageInfo) && t.c(this.tabControl, styleFactoryScope.tabControl) && t.c(this.tabControlIndex, styleFactoryScope.tabControlIndex) && t.c(this.tabIndex, styleFactoryScope.tabIndex) && t.c(this.countdownDate, styleFactoryScope.countdownDate) && this.countFrom == styleFactoryScope.countFrom && t.c(this.countPredicates, styleFactoryScope.countPredicates) && t.c(this.countValues, styleFactoryScope.countValues);
        }

        public final boolean getApplyTopWindowInsets() {
            return this.windowInsetsState.getApplyTopWindowInsets();
        }

        public final CountdownComponent.CountFrom getCountFrom() {
            return this.countFrom;
        }

        public final Date getCountdownDate() {
            return this.countdownDate;
        }

        public final Integer getDefaultTabIndex() {
            return this.defaultTabIndex;
        }

        public final boolean getIgnoreTopWindowInsets() {
            return this.windowInsetsState.getIgnoreTopWindowInsets();
        }

        public final OfferEligibility getOfferEligibility() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return PackageExtensionsKt.calculateOfferEligibility(info.getResolvedOffer(), info.getPkg());
            }
            return null;
        }

        public final PaywallState.Loaded.Components.AvailablePackages.Info getPackageInfo() {
            return this.packageInfo;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getPackages() {
            return new PaywallState.Loaded.Components.AvailablePackages(this.packagesOutsideTabs, this.packagesByTab);
        }

        public final Package getRcPackage() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return info.getPkg();
            }
            return null;
        }

        public final ResolvedOffer getResolvedOffer() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            if (info != null) {
                return info.getResolvedOffer();
            }
            return null;
        }

        public final TabControlStyle getTabControl() {
            return this.tabControl;
        }

        public final Integer getTabControlIndex() {
            return this.tabControlIndex;
        }

        public final Integer getTabIndex() {
            return this.tabIndex;
        }

        public final WindowInsetsState getWindowInsetsState() {
            return this.windowInsetsState;
        }

        public int hashCode() {
            PaywallState.Loaded.Components.AvailablePackages.Info info = this.packageInfo;
            int hashCode = (info == null ? 0 : info.hashCode()) * 31;
            TabControlStyle tabControlStyle = this.tabControl;
            int hashCode2 = (hashCode + (tabControlStyle == null ? 0 : tabControlStyle.hashCode())) * 31;
            Integer num = this.tabControlIndex;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.tabIndex;
            int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Date date = this.countdownDate;
            return ((((((hashCode4 + (date != null ? date.hashCode() : 0)) * 31) + this.countFrom.hashCode()) * 31) + this.countPredicates.hashCode()) * 31) + this.countValues.hashCode();
        }

        public final void recordComponent(PaywallComponent component) {
            t.g(component, "component");
            for (Map.Entry entry : this.countPredicates.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                if (((Boolean) ((l) entry.getValue()).invoke(component)).booleanValue()) {
                    Integer num = (Integer) this.countValues.get(Integer.valueOf(intValue));
                    this.countValues.put(Integer.valueOf(intValue), Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                }
            }
            this.windowInsetsState.handleHeaderMediaViewWindowInsets(component);
        }

        public final void setCountFrom(CountdownComponent.CountFrom countFrom) {
            t.g(countFrom, "<set-?>");
            this.countFrom = countFrom;
        }

        public final void setCountdownDate(Date date) {
            this.countdownDate = date;
        }

        public final void setDefaultTabIndex(Integer num) {
            this.defaultTabIndex = num;
        }

        public final void setPackageInfo(PaywallState.Loaded.Components.AvailablePackages.Info info) {
            this.packageInfo = info;
        }

        public final void setTabControl(TabControlStyle tabControlStyle) {
            this.tabControl = tabControlStyle;
        }

        public final void setTabControlIndex(Integer num) {
            this.tabControlIndex = num;
        }

        public final void setTabIndex(Integer num) {
            this.tabIndex = num;
        }

        public String toString() {
            return "StyleFactoryScope(packageInfo=" + this.packageInfo + ", tabControl=" + this.tabControl + ", tabControlIndex=" + this.tabControlIndex + ", tabIndex=" + this.tabIndex + ", countdownDate=" + this.countdownDate + ", countFrom=" + this.countFrom + ", countPredicates=" + this.countPredicates + ", countValues=" + this.countValues + ')';
        }

        public final WithCount withCount(l predicate, l block) {
            t.g(predicate, "predicate");
            t.g(block, "block");
            Integer r0 = D.r0(access$getCountPredicates$p(this).keySet());
            int intValue = (r0 != null ? r0.intValue() : -1) + 1;
            access$getCountPredicates$p(this).put(Integer.valueOf(intValue), predicate);
            access$getCountValues$p(this).put(Integer.valueOf(intValue), 0);
            WithCount withCount = new WithCount(block.invoke(this), ((Number) S.i(access$getCountValues$p(this), Integer.valueOf(intValue))).intValue());
            access$getCountPredicates$p(this).remove(Integer.valueOf(intValue));
            access$getCountValues$p(this).remove(Integer.valueOf(intValue));
            return withCount;
        }

        public final Object withCountdown(Date countdownDate, CountdownComponent.CountFrom countFrom, l block) {
            t.g(countdownDate, "countdownDate");
            t.g(countFrom, "countFrom");
            t.g(block, "block");
            StyleFactoryScope copy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.countdownDate = countdownDate;
            this.countFrom = countFrom;
            Object invoke = block.invoke(this);
            this.countdownDate = copy$default.countdownDate;
            this.countFrom = copy$default.countFrom;
            return invoke;
        }

        public final Object withSelectedScope(PaywallState.Loaded.Components.AvailablePackages.Info info, Integer num, l block) {
            t.g(block, "block");
            if (info != null) {
                recordPackage(info);
            }
            StyleFactoryScope copy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.packageInfo = info;
            this.tabControlIndex = num;
            Object invoke = block.invoke(this);
            this.packageInfo = copy$default.packageInfo;
            this.tabControlIndex = copy$default.tabControlIndex;
            return invoke;
        }

        public final Object withTabControl(TabControlStyle tabControl, l block) {
            t.g(tabControl, "tabControl");
            t.g(block, "block");
            StyleFactoryScope copy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.tabControl = tabControl;
            Object invoke = block.invoke(this);
            this.tabControl = copy$default.tabControl;
            return invoke;
        }

        public final Object withTabIndex(int i, l block) {
            t.g(block, "block");
            StyleFactoryScope copy$default = copy$default(this, null, null, null, null, null, null, null, null, 255, null);
            this.tabIndex = Integer.valueOf(i);
            Object invoke = block.invoke(this);
            this.tabIndex = copy$default.tabIndex;
            return invoke;
        }

        public StyleFactoryScope(PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map countPredicates, Map countValues) {
            t.g(countFrom, "countFrom");
            t.g(countPredicates, "countPredicates");
            t.g(countValues, "countValues");
            this.packageInfo = info;
            this.tabControl = tabControlStyle;
            this.tabControlIndex = num;
            this.tabIndex = num2;
            this.countdownDate = date;
            this.countFrom = countFrom;
            this.countPredicates = countPredicates;
            this.countValues = countValues;
            this.windowInsetsState = new WindowInsetsState();
            this.packagesOutsideTabs = new ArrayList();
            this.packagesByTab = new LinkedHashMap();
        }

        public /* synthetic */ StyleFactoryScope(PaywallState.Loaded.Components.AvailablePackages.Info info, TabControlStyle tabControlStyle, Integer num, Integer num2, Date date, CountdownComponent.CountFrom countFrom, Map map, Map map2, int i, k kVar) {
            this((i & 1) != 0 ? null : info, (i & 2) != 0 ? null : tabControlStyle, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) == 0 ? date : null, (i & 32) != 0 ? CountdownComponent.CountFrom.DAYS : countFrom, (i & 64) != 0 ? new LinkedHashMap() : map, (i & 128) != 0 ? new LinkedHashMap() : map2);
        }
    }

    public static final class StyleResult {
        public static final int $stable = 0;
        private final PaywallState.Loaded.Components.AvailablePackages availablePackages;
        private final ComponentStyle componentStyle;
        private final Integer defaultTabIndex;

        public StyleResult(ComponentStyle componentStyle, PaywallState.Loaded.Components.AvailablePackages availablePackages, Integer num) {
            t.g(componentStyle, "componentStyle");
            t.g(availablePackages, "availablePackages");
            this.componentStyle = componentStyle;
            this.availablePackages = availablePackages;
            this.defaultTabIndex = num;
        }

        public final PaywallState.Loaded.Components.AvailablePackages getAvailablePackages() {
            return this.availablePackages;
        }

        public final ComponentStyle getComponentStyle() {
            return this.componentStyle;
        }

        public final Integer getDefaultTabIndex() {
            return this.defaultTabIndex;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ButtonComponent.UrlMethod.values().length];
            try {
                iArr[ButtonComponent.UrlMethod.IN_APP_BROWSER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.EXTERNAL_BROWSER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.DEEP_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonComponent.UrlMethod.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public final Result invoke(PartialCarouselComponent partial) {
            t.g(partial, "partial");
            return PresentedCarouselPartial.Companion.invoke(partial, StyleFactory.access$getColorAliases$p(StyleFactory.this));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ CountdownComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CountdownComponent countdownComponent) {
            super(1);
            this.$component = countdownComponent;
        }

        public final Result invoke(StyleFactoryScope withCountdown) {
            t.g(withCountdown, "$this$withCountdown");
            Result access$createStackComponentStyle = StyleFactory.access$createStackComponentStyle(StyleFactory.this, withCountdown, this.$component.getCountdownStack());
            StackComponent endStack = this.$component.getEndStack();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(endStack != null ? StyleFactory.access$createStackComponentStyle(StyleFactory.this, withCountdown, endStack) : null);
            StackComponent fallback = this.$component.getFallback();
            Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(fallback != null ? StyleFactory.access$createStackComponentStyle(StyleFactory.this, withCountdown, fallback) : null);
            CountdownComponent countdownComponent = this.$component;
            I i = I.a;
            Result.Success success = new Result.Success(i);
            Result.Success success2 = new Result.Success(i);
            Result.Success success3 = new Result.Success(i);
            NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(access$createStackComponentStyle, orSuccessfullyNull, orSuccessfullyNull2, success, success2, success3)));
            if (nonEmptyListOrNull != null) {
                return new Result.Error(nonEmptyListOrNull);
            }
            t.e(access$createStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value = ((Result.Success) access$createStackComponentStyle).getValue();
            t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value2 = ((Result.Success) orSuccessfullyNull).getValue();
            t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
            Object value3 = ((Result.Success) orSuccessfullyNull2).getValue();
            Object value4 = success.getValue();
            Object value5 = success2.getValue();
            return new Result.Success(new CountdownComponentStyle(countdownComponent.getStyle().getDate(), countdownComponent.getCountFrom(), (StackComponentStyle) value, (StackComponentStyle) value2, (StackComponentStyle) value3));
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public final Result invoke(PartialIconComponent partial) {
            t.g(partial, "partial");
            return PresentedIconPartial.Companion.invoke(partial, StyleFactory.access$getColorAliases$p(StyleFactory.this));
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public final Result invoke(PartialImageComponent it) {
            t.g(it, "it");
            ThemeImageUrls source = it.getSource();
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(source != null ? StyleFactory.access$withLocalizedOverrides-TDPsjl0(StyleFactory.this, source, it.getOverrideSourceLid-sa7TU9Q()) : null);
            StyleFactory styleFactory = StyleFactory.this;
            if (orSuccessfullyNull instanceof Result.Success) {
                return PresentedImagePartial.Companion.invoke(it, (NonEmptyMap) ((Result.Success) orSuccessfullyNull).getValue(), StyleFactory.access$getColorAliases$p(styleFactory));
            }
            if (orSuccessfullyNull instanceof Result.Error) {
                return orSuccessfullyNull;
            }
            throw new o();
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;

        public static final class 1 extends u implements l {
            final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;
            final /* synthetic */ StyleFactory this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(StyleFactory styleFactory, StyleFactoryScope styleFactoryScope) {
                super(1);
                this.this$0 = styleFactory;
                this.$this_createStackComponentStyle = styleFactoryScope;
            }

            public final Result invoke(StackComponent stackComponent) {
                t.g(stackComponent, "stackComponent");
                return StyleFactory.access$createStackComponentStyle(this.this$0, this.$this_createStackComponentStyle, stackComponent);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StyleFactoryScope styleFactoryScope) {
            super(1);
            this.$this_createStackComponentStyle = styleFactoryScope;
        }

        public final Result invoke(PartialStackComponent partial) {
            t.g(partial, "partial");
            return PresentedStackPartial.Companion.invoke(partial, StyleFactory.access$getColorAliases$p(StyleFactory.this), new 1(StyleFactory.this, this.$this_createStackComponentStyle));
        }
    }

    public static final class 6 extends u implements l {
        final /* synthetic */ StyleFactoryScope $this_createStackComponentStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 6(StyleFactoryScope styleFactoryScope) {
            super(1);
            this.$this_createStackComponentStyle = styleFactoryScope;
        }

        public final Result invoke(StackComponent stackComponent) {
            t.g(stackComponent, "stackComponent");
            return StyleFactory.access$createStackComponentStyle(StyleFactory.this, this.$this_createStackComponentStyle, stackComponent);
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ StickyFooterComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(StickyFooterComponent stickyFooterComponent) {
            super(1);
            this.$component = stickyFooterComponent;
        }

        public final Result invoke(StyleFactoryScope withSelectedScope) {
            t.g(withSelectedScope, "$this$withSelectedScope");
            Result access$createStackComponentStyle = StyleFactory.access$createStackComponentStyle(StyleFactory.this, withSelectedScope, this.$component.getStack());
            if (access$createStackComponentStyle instanceof Result.Success) {
                return new Result.Success(new StickyFooterComponentStyle((StackComponentStyle) ((Result.Success) access$createStackComponentStyle).getValue()));
            }
            if (access$createStackComponentStyle instanceof Result.Error) {
                return access$createStackComponentStyle;
            }
            throw new o();
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ TabControlButtonComponent $component;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TabControlButtonComponent tabControlButtonComponent) {
            super(1);
            this.$component = tabControlButtonComponent;
        }

        public final Result invoke(StyleFactoryScope withSelectedScope) {
            t.g(withSelectedScope, "$this$withSelectedScope");
            withSelectedScope.setDefaultTabIndex(0);
            Result access$createStackComponentStyle = StyleFactory.access$createStackComponentStyle(StyleFactory.this, withSelectedScope, this.$component.getStack());
            TabControlButtonComponent tabControlButtonComponent = this.$component;
            if (access$createStackComponentStyle instanceof Result.Success) {
                return new Result.Success(new TabControlButtonComponentStyle(tabControlButtonComponent.getTabIndex(), (StackComponentStyle) ((Result.Success) access$createStackComponentStyle).getValue()));
            }
            if (access$createStackComponentStyle instanceof Result.Error) {
                return access$createStackComponentStyle;
            }
            throw new o();
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ TabsComponent.Tab $componentTab;
        final /* synthetic */ TabControlStyle $control;
        final /* synthetic */ int $tabIndex;
        final /* synthetic */ StyleFactory this$0;

        public static final class 1 extends u implements l {
            final /* synthetic */ TabsComponent.Tab $componentTab;
            final /* synthetic */ TabControlStyle $control;
            final /* synthetic */ StyleFactory this$0;

            public static final class 1 extends u implements l {
                final /* synthetic */ TabsComponent.Tab $componentTab;
                final /* synthetic */ StyleFactory this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public 1(StyleFactory styleFactory, TabsComponent.Tab tab) {
                    super(1);
                    this.this$0 = styleFactory;
                    this.$componentTab = tab;
                }

                public final Result invoke(StyleFactoryScope withTabControl) {
                    t.g(withTabControl, "$this$withTabControl");
                    Result access$createStackComponentStyle = StyleFactory.access$createStackComponentStyle(this.this$0, withTabControl, this.$componentTab.getStack());
                    if (access$createStackComponentStyle instanceof Result.Success) {
                        return new Result.Success(new TabsComponentStyle.Tab((StackComponentStyle) ((Result.Success) access$createStackComponentStyle).getValue()));
                    }
                    if (access$createStackComponentStyle instanceof Result.Error) {
                        return access$createStackComponentStyle;
                    }
                    throw new o();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 1(TabControlStyle tabControlStyle, StyleFactory styleFactory, TabsComponent.Tab tab) {
                super(1);
                this.$control = tabControlStyle;
                this.this$0 = styleFactory;
                this.$componentTab = tab;
            }

            public final Result invoke(StyleFactoryScope withTabIndex) {
                t.g(withTabIndex, "$this$withTabIndex");
                return (Result) withTabIndex.withTabControl(this.$control, new 1(this.this$0, this.$componentTab));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(int i, TabControlStyle tabControlStyle, StyleFactory styleFactory, TabsComponent.Tab tab) {
            super(1);
            this.$tabIndex = i;
            this.$control = tabControlStyle;
            this.this$0 = styleFactory;
            this.$componentTab = tab;
        }

        public final Result invoke(StyleFactoryScope withSelectedScope) {
            t.g(withSelectedScope, "$this$withSelectedScope");
            return (Result) withSelectedScope.withTabIndex(this.$tabIndex, new 1(this.$control, this.this$0, this.$componentTab));
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ TabsComponent.TabControl $componentControl;
        final /* synthetic */ StyleFactory this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(TabsComponent.TabControl tabControl, StyleFactory styleFactory) {
            super(1);
            this.$componentControl = tabControl;
            this.this$0 = styleFactory;
        }

        public final Result invoke(StyleFactoryScope withSelectedScope) {
            t.g(withSelectedScope, "$this$withSelectedScope");
            TabsComponent.TabControl.Buttons buttons = this.$componentControl;
            if (buttons instanceof TabsComponent.TabControl.Buttons) {
                Result access$createStackComponentStyle = StyleFactory.access$createStackComponentStyle(this.this$0, withSelectedScope, buttons.getStack());
                if (access$createStackComponentStyle instanceof Result.Success) {
                    return new Result.Success(new TabControlStyle.Buttons((StackComponentStyle) ((Result.Success) access$createStackComponentStyle).getValue()));
                }
                if (access$createStackComponentStyle instanceof Result.Error) {
                    return access$createStackComponentStyle;
                }
                throw new o();
            }
            if (!(buttons instanceof TabsComponent.TabControl.Toggle)) {
                throw new o();
            }
            Result access$createStackComponentStyle2 = StyleFactory.access$createStackComponentStyle(this.this$0, withSelectedScope, ((TabsComponent.TabControl.Toggle) buttons).getStack());
            if (access$createStackComponentStyle2 instanceof Result.Success) {
                return new Result.Success(new TabControlStyle.Toggle((StackComponentStyle) ((Result.Success) access$createStackComponentStyle2).getValue()));
            }
            if (access$createStackComponentStyle2 instanceof Result.Error) {
                return access$createStackComponentStyle2;
            }
            throw new o();
        }
    }

    public static final class 2 extends u implements l {
        public 2() {
            super(1);
        }

        public final Result invoke(PartialTextComponent it) {
            t.g(it, "it");
            return LocalizedTextPartial.Companion.invoke(it, StyleFactory.access$getLocalizations$p(StyleFactory.this), StyleFactory.access$getColorAliases$p(StyleFactory.this), StyleFactory.access$getFontAliases$p(StyleFactory.this));
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public final Result invoke(PartialTimelineComponentItem partial) {
            t.g(partial, "partial");
            return PresentedTimelineItemPartial.Companion.invoke(partial, StyleFactory.access$getColorAliases$p(StyleFactory.this));
        }
    }

    public static final class 1 extends u implements l {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(1);
        }

        public final Result invoke(PartialTimelineComponent partial) {
            t.g(partial, "partial");
            return new Result.Success(new PresentedTimelinePartial(partial));
        }
    }

    public static final class 1 extends u implements l {
        public 1() {
            super(1);
        }

        public final Result invoke(PartialVideoComponent videoPartial) {
            Result result;
            t.g(videoPartial, "videoPartial");
            ThemeVideoUrls source = videoPartial.getSource();
            NonEmptyMap nonEmptyMap = null;
            Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(source != null ? StyleFactory.access$withLocalizedOverrides-TDPsjl0(StyleFactory.this, source, videoPartial.getOverrideSourceLid-sa7TU9Q()) : null);
            StyleFactory styleFactory = StyleFactory.this;
            if (!(orSuccessfullyNull instanceof Result.Success)) {
                if (orSuccessfullyNull instanceof Result.Error) {
                    return orSuccessfullyNull;
                }
                throw new o();
            }
            NonEmptyMap nonEmptyMap2 = (NonEmptyMap) ((Result.Success) orSuccessfullyNull).getValue();
            PresentedVideoPartial.Companion companion = PresentedVideoPartial.Companion;
            ThemeImageUrls fallbackSource = videoPartial.getFallbackSource();
            if (fallbackSource != null && (result = StyleFactory.access$withLocalizedOverrides-TDPsjl0(styleFactory, fallbackSource, videoPartial.getOverrideSourceLid-sa7TU9Q())) != null && (result instanceof Result.Success)) {
                nonEmptyMap = (NonEmptyMap) ((Result.Success) result).getValue();
            }
            return companion.invoke(videoPartial, nonEmptyMap2, nonEmptyMap, StyleFactory.access$getColorAliases$p(styleFactory));
        }
    }

    public StyleFactory(NonEmptyMap localizations, Map colorAliases, Map fontAliases, NonEmptyMap variableLocalizations, Offering offering, boolean z) {
        t.g(localizations, "localizations");
        t.g(colorAliases, "colorAliases");
        t.g(fontAliases, "fontAliases");
        t.g(variableLocalizations, "variableLocalizations");
        t.g(offering, "offering");
        this.localizations = localizations;
        this.colorAliases = colorAliases;
        this.fontAliases = fontAliases;
        this.variableLocalizations = variableLocalizations;
        this.offering = offering;
        this.stripRules = z;
    }

    public static final /* synthetic */ Result access$createStackComponentStyle(StyleFactory styleFactory, StyleFactoryScope styleFactoryScope, StackComponent stackComponent) {
        return styleFactory.createStackComponentStyle(styleFactoryScope, stackComponent);
    }

    public static final /* synthetic */ Result access$createTabsComponentStyleTab(StyleFactory styleFactory, StyleFactoryScope styleFactoryScope, TabsComponent.Tab tab, TabControlStyle tabControlStyle, int i) {
        return styleFactory.createTabsComponentStyleTab(styleFactoryScope, tab, tabControlStyle, i);
    }

    public static final /* synthetic */ Map access$getColorAliases$p(StyleFactory styleFactory) {
        return styleFactory.colorAliases;
    }

    public static final /* synthetic */ Shape.Rectangle access$getDEFAULT_SHAPE$cp() {
        return DEFAULT_SHAPE;
    }

    public static final /* synthetic */ Map access$getFontAliases$p(StyleFactory styleFactory) {
        return styleFactory.fontAliases;
    }

    public static final /* synthetic */ NonEmptyMap access$getLocalizations$p(StyleFactory styleFactory) {
        return styleFactory.localizations;
    }

    public static final /* synthetic */ Result access$withLocalizedOverrides-TDPsjl0(StyleFactory styleFactory, ThemeImageUrls themeImageUrls, String str) {
        return styleFactory.withLocalizedOverrides-TDPsjl0(themeImageUrls, str);
    }

    private final Result buttonComponentStyleUrlDestination-26kQY28(String str, ButtonComponent.UrlMethod urlMethod) {
        Result result = LocalizationKt.stringForAllLocales-7v81vok(this.localizations, str);
        if (result instanceof Result.Success) {
            result = new Result.Success(new ButtonComponentStyle.Action.NavigateTo.Destination.Url((NonEmptyMap) ((Result.Success) result).getValue(), urlMethod));
        } else if (!(result instanceof Result.Error)) {
            throw new o();
        }
        if (!(result instanceof Result.Success)) {
            if (result instanceof Result.Error) {
                return result;
            }
            throw new o();
        }
        ButtonComponentStyle.Action.NavigateTo.Destination.Url url = (ButtonComponentStyle.Action.NavigateTo.Destination.Url) ((Result.Success) result).getValue();
        int i = WhenMappings.$EnumSwitchMapping$0[url.getMethod().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i != 4) {
                throw new o();
            }
            url = null;
        }
        return new Result.Success(url);
    }

    private final Result convertAction(StyleFactoryScope styleFactoryScope, ButtonComponent.Action action) {
        if (action instanceof ButtonComponent.Action.NavigateBack) {
            return new Result.Success(ButtonComponentStyle.Action.NavigateBack.INSTANCE);
        }
        if (action instanceof ButtonComponent.Action.RestorePurchases) {
            return new Result.Success(ButtonComponentStyle.Action.RestorePurchases.INSTANCE);
        }
        if (!(action instanceof ButtonComponent.Action.NavigateTo)) {
            if (action instanceof ButtonComponent.Action.Unknown) {
                return new Result.Success(null);
            }
            throw new o();
        }
        Result convertDestination = convertDestination(styleFactoryScope, ((ButtonComponent.Action.NavigateTo) action).getDestination());
        if (convertDestination instanceof Result.Success) {
            ButtonComponentStyle.Action.NavigateTo.Destination destination = (ButtonComponentStyle.Action.NavigateTo.Destination) ((Result.Success) convertDestination).getValue();
            return new Result.Success(destination != null ? new ButtonComponentStyle.Action.NavigateTo(destination) : null);
        }
        if (convertDestination instanceof Result.Error) {
            return convertDestination;
        }
        throw new o();
    }

    private final Result convertDestination(StyleFactoryScope styleFactoryScope, ButtonComponent.Destination destination) {
        if (destination instanceof ButtonComponent.Destination.CustomerCenter) {
            return new Result.Success(ButtonComponentStyle.Action.NavigateTo.Destination.CustomerCenter.INSTANCE);
        }
        if (destination instanceof ButtonComponent.Destination.PrivacyPolicy) {
            ButtonComponent.Destination.PrivacyPolicy privacyPolicy = (ButtonComponent.Destination.PrivacyPolicy) destination;
            return buttonComponentStyleUrlDestination-26kQY28(privacyPolicy.getUrlLid-z7Tp-4o(), privacyPolicy.getMethod());
        }
        if (destination instanceof ButtonComponent.Destination.Terms) {
            ButtonComponent.Destination.Terms terms = (ButtonComponent.Destination.Terms) destination;
            return buttonComponentStyleUrlDestination-26kQY28(terms.getUrlLid-z7Tp-4o(), terms.getMethod());
        }
        if (destination instanceof ButtonComponent.Destination.Url) {
            ButtonComponent.Destination.Url url = (ButtonComponent.Destination.Url) destination;
            return buttonComponentStyleUrlDestination-26kQY28(url.getUrlLid-z7Tp-4o(), url.getMethod());
        }
        if (!(destination instanceof ButtonComponent.Destination.Sheet)) {
            if (destination instanceof ButtonComponent.Destination.Unknown) {
                return new Result.Success(null);
            }
            throw new o();
        }
        ButtonComponent.Destination.Sheet sheet = (ButtonComponent.Destination.Sheet) destination;
        Result createStackComponentStyle = createStackComponentStyle(styleFactoryScope, sheet.getStack());
        if (createStackComponentStyle instanceof Result.Success) {
            createStackComponentStyle = new Result.Success((StackComponentStyle) styleFactoryScope.applyBottomWindowInsetsIfNecessary((StackComponentStyle) ((Result.Success) createStackComponentStyle).getValue(), true));
        } else if (!(createStackComponentStyle instanceof Result.Error)) {
            throw new o();
        }
        if (createStackComponentStyle instanceof Result.Success) {
            createStackComponentStyle = new Result.Success((StackComponentStyle) styleFactoryScope.applyHorizontalWindowInsetsIfNecessary((StackComponentStyle) ((Result.Success) createStackComponentStyle).getValue(), true));
        } else if (!(createStackComponentStyle instanceof Result.Error)) {
            throw new o();
        }
        if (createStackComponentStyle instanceof Result.Success) {
            return new Result.Success(new ButtonComponentStyle.Action.NavigateTo.Destination.Sheet(sheet.getId(), sheet.getName(), (StackComponentStyle) ((Result.Success) createStackComponentStyle).getValue(), sheet.getBackgroundBlur(), sheet.getSize()));
        }
        if (createStackComponentStyle instanceof Result.Error) {
            return createStackComponentStyle;
        }
        throw new o();
    }

    private final Result convertPurchaseButtonMethod(StyleFactoryScope styleFactoryScope, PurchaseButtonComponent.Method method) {
        Result result;
        Result.Success success;
        boolean booleanValue;
        if (method == null) {
            return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
        }
        if (method instanceof PurchaseButtonComponent.Method.InAppCheckout) {
            return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
        }
        if (!(method instanceof PurchaseButtonComponent.Method.WebCheckout)) {
            if (method instanceof PurchaseButtonComponent.Method.WebProductSelection) {
                PurchaseButtonComponent.Method.WebProductSelection webProductSelection = (PurchaseButtonComponent.Method.WebProductSelection) method;
                Boolean autoDismiss = webProductSelection.getAutoDismiss();
                booleanValue = autoDismiss != null ? autoDismiss.booleanValue() : true;
                ButtonComponent.UrlMethod openMethod = webProductSelection.getOpenMethod();
                if (openMethod == null) {
                    openMethod = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
                }
                success = new Result.Success(new ButtonComponentStyle.Action.WebProductSelection(booleanValue, openMethod));
            } else {
                if (!(method instanceof PurchaseButtonComponent.Method.CustomWebCheckout)) {
                    if (!(method instanceof PurchaseButtonComponent.Method.Unknown)) {
                        throw new o();
                    }
                    Logger.INSTANCE.e("Unknown purchase button method. Defaulting to purchasing current/default package.");
                    return new Result.Success(new ButtonComponentStyle.Action.PurchasePackage(styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer()));
                }
                PurchaseButtonComponent.Method.CustomWebCheckout customWebCheckout = (PurchaseButtonComponent.Method.CustomWebCheckout) method;
                result = LocalizationKt.stringForAllLocales-7v81vok(this.localizations, customWebCheckout.getCustomUrl().getUrlLid-z7Tp-4o());
                if (result instanceof Result.Success) {
                    NonEmptyMap nonEmptyMap = (NonEmptyMap) ((Result.Success) result).getValue();
                    Boolean autoDismiss2 = customWebCheckout.getAutoDismiss();
                    boolean booleanValue2 = autoDismiss2 != null ? autoDismiss2.booleanValue() : true;
                    ButtonComponent.UrlMethod openMethod2 = customWebCheckout.getOpenMethod();
                    if (openMethod2 == null) {
                        openMethod2 = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
                    }
                    success = new Result.Success(new ButtonComponentStyle.Action.CustomWebCheckout(nonEmptyMap, booleanValue2, openMethod2, styleFactoryScope.getRcPackage(), customWebCheckout.getCustomUrl().getPackageParam()));
                } else if (!(result instanceof Result.Error)) {
                    throw new o();
                }
            }
            return success;
        }
        Package rcPackage = styleFactoryScope.getRcPackage();
        PurchaseButtonComponent.Method.WebCheckout webCheckout = (PurchaseButtonComponent.Method.WebCheckout) method;
        Boolean autoDismiss3 = webCheckout.getAutoDismiss();
        booleanValue = autoDismiss3 != null ? autoDismiss3.booleanValue() : true;
        ButtonComponent.UrlMethod openMethod3 = webCheckout.getOpenMethod();
        if (openMethod3 == null) {
            openMethod3 = ButtonComponent.UrlMethod.EXTERNAL_BROWSER;
        }
        result = new Result.Success(new ButtonComponentStyle.Action.WebCheckout(rcPackage, booleanValue, openMethod3));
        return result;
    }

    public static /* synthetic */ Result create$default(StyleFactory styleFactory, PaywallComponent paywallComponent, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return styleFactory.create(paywallComponent, z, z2);
    }

    private final Result createBackgroundStyles(Background background, ColorScheme colorScheme) {
        Result result;
        Result backgroundStyles;
        if (background != null && (backgroundStyles = BackgroundStyleKt.toBackgroundStyles(background, this.colorAliases)) != null) {
            return backgroundStyles;
        }
        if (colorScheme == null || (result = ColorStyleKt.toColorStyles(colorScheme, this.colorAliases)) == null) {
            result = null;
        } else if (result instanceof Result.Success) {
            result = new Result.Success(BackgroundStyles.Color.box-impl(BackgroundStyles.Color.constructor-impl((ColorStyles) ((Result.Success) result).getValue())));
        } else if (!(result instanceof Result.Error)) {
            throw new o();
        }
        return ResultKt.orSuccessfullyNull(result);
    }

    private final Result createButtonComponentStyleOrNull(StyleFactoryScope styleFactoryScope, ButtonComponent buttonComponent) {
        Result createStackComponentStyle = createStackComponentStyle(styleFactoryScope, buttonComponent.getStack());
        Result convertAction = convertAction(styleFactoryScope, buttonComponent.getAction());
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        Result.Success success4 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(createStackComponentStyle, convertAction, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(createStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) createStackComponentStyle).getValue();
        t.e(convertAction, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) convertAction).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        ButtonComponentStyle.Action action = (ButtonComponentStyle.Action) value2;
        return new Result.Success(action != null ? new ButtonComponentStyle((StackComponentStyle) value, action, buttonComponent.getTransition()) : null);
    }

    private final Result createCarouselComponentStyle(StyleFactoryScope styleFactoryScope, CarouselComponent carouselComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(carouselComponent.getOverrides(), this.stripRules, new 1());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List pages = carouselComponent.getPages();
        ArrayList<Result> arrayList = new ArrayList(w.y(pages, 10));
        Iterator it = pages.iterator();
        while (it.hasNext()) {
            arrayList.add(createStackComponentStyle(styleFactoryScope, (StackComponent) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((StackComponentStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        Border border = carouselComponent.getBorder();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = carouselComponent.getShadow();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result createBackgroundStyles = createBackgroundStyles(carouselComponent.getBackground(), carouselComponent.getBackgroundColor());
        CarouselComponent.PageControl pageControl = carouselComponent.getPageControl();
        Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(pageControl != null ? PageControlExtensionsKt.toPageControlStyles(pageControl, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, error, orSuccessfullyNull, orSuccessfullyNull2, createBackgroundStyles, orSuccessfullyNull3)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        Object value2 = ((Result.Success) error).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) orSuccessfullyNull2).getValue();
        t.e(createBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) createBackgroundStyles).getValue();
        t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        CarouselComponentStyle.PageControlStyles pageControlStyles = (CarouselComponentStyle.PageControlStyles) ((Result.Success) orSuccessfullyNull3).getValue();
        BackgroundStyles backgroundStyles = (BackgroundStyles) value5;
        ShadowStyles shadowStyles = (ShadowStyles) value4;
        BorderStyles borderStyles = (BorderStyles) value3;
        List list = (List) value2;
        List list2 = (List) value;
        Integer initialPageIndex = carouselComponent.getInitialPageIndex();
        int intValue = initialPageIndex != null ? initialPageIndex.intValue() : 0;
        e.c alignment = AlignmentKt.toAlignment(carouselComponent.getPageAlignment());
        Boolean visible = carouselComponent.getVisible();
        boolean booleanValue = visible != null ? visible.booleanValue() : true;
        Size size = carouselComponent.getSize();
        float g = h.g(carouselComponent.getPagePeek() != null ? r2.intValue() : 0);
        Float pageSpacing = carouselComponent.getPageSpacing();
        float g2 = h.g(pageSpacing != null ? pageSpacing.floatValue() : 0.0f);
        L paddingValues = PaddingKt.toPaddingValues(carouselComponent.getPadding());
        L paddingValues2 = PaddingKt.toPaddingValues(carouselComponent.getMargin());
        Shape.Rectangle shape = carouselComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        Shape.Rectangle rectangle = shape;
        Boolean loop = carouselComponent.getLoop();
        return new Result.Success(new CarouselComponentStyle(list, intValue, alignment, booleanValue, size, g, g2, backgroundStyles, paddingValues, paddingValues2, rectangle, borderStyles, shadowStyles, pageControlStyles, loop != null ? loop.booleanValue() : false, carouselComponent.getAutoAdvance(), styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list2, null));
    }

    private final Result createCountdownComponentStyle(StyleFactoryScope styleFactoryScope, CountdownComponent countdownComponent) {
        return (Result) styleFactoryScope.withCountdown(countdownComponent.getStyle().getDate(), countdownComponent.getCountFrom(), new 1(countdownComponent));
    }

    private final Result createIconComponentStyle(StyleFactoryScope styleFactoryScope, IconComponent iconComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(iconComponent.getOverrides(), this.stripRules, new 1());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        ColorScheme color = iconComponent.getColor();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(color != null ? ColorStyleKt.toColorStyles(color, this.colorAliases) : null);
        IconComponent.IconBackground iconBackground = iconComponent.getIconBackground();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(iconBackground != null ? IconComponentStyleKt.toBackground(iconBackground, this.colorAliases) : null);
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, orSuccessfullyNull, orSuccessfullyNull2, success, success2, success3)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull2).getValue();
        Object value4 = success.getValue();
        Object value5 = success2.getValue();
        IconComponentStyle.Background background = (IconComponentStyle.Background) value3;
        ColorStyles colorStyles = (ColorStyles) value2;
        List list = (List) value;
        String baseUrl = iconComponent.getBaseUrl();
        String iconName = iconComponent.getIconName();
        IconComponent.Formats formats = iconComponent.getFormats();
        Boolean visible = iconComponent.getVisible();
        return new Result.Success(new IconComponentStyle(baseUrl, iconName, formats, visible != null ? visible.booleanValue() : true, iconComponent.getSize(), colorStyles, PaddingKt.toPaddingValues(iconComponent.getPadding()), PaddingKt.toPaddingValues(iconComponent.getMargin()), background, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list));
    }

    private final Result createImageComponentStyle(StyleFactoryScope styleFactoryScope, ImageComponent imageComponent) {
        Result result = withLocalizedOverrides-TDPsjl0(imageComponent.getSource(), imageComponent.getOverrideSourceLid-sa7TU9Q());
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(imageComponent.getOverrides(), this.stripRules, new 1());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        ColorScheme colorOverlay = imageComponent.getColorOverlay();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, this.colorAliases) : null);
        Border border = imageComponent.getBorder();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = imageComponent.getShadow();
        Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result.Success success = new Result.Success(I.a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(result, presentedOverrides, orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(result, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) result).getValue();
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) presentedOverrides).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) orSuccessfullyNull2).getValue();
        t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull3).getValue();
        ShadowStyles shadowStyles = (ShadowStyles) value5;
        BorderStyles borderStyles = (BorderStyles) value4;
        ColorStyles colorStyles = (ColorStyles) value3;
        List list = (List) value2;
        NonEmptyMap nonEmptyMap = (NonEmptyMap) value;
        Boolean visible = imageComponent.getVisible();
        boolean booleanValue = visible != null ? visible.booleanValue() : true;
        Size size = imageComponent.getSize();
        L paddingValues = PaddingKt.toPaddingValues(imageComponent.getPadding());
        L paddingValues2 = PaddingKt.toPaddingValues(imageComponent.getMargin());
        MaskShape maskShape = imageComponent.getMaskShape();
        return new Result.Success(new ImageComponentStyle(nonEmptyMap, booleanValue, size, paddingValues, paddingValues2, maskShape != null ? ShapeKt.toShape(maskShape) : null, borderStyles, shadowStyles, colorStyles, FitModeKt.toContentScale(imageComponent.getFitMode()), styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list, styleFactoryScope.getIgnoreTopWindowInsets()));
    }

    private final Result createInternal(StyleFactoryScope styleFactoryScope, PaywallComponent paywallComponent) {
        styleFactoryScope.recordComponent(paywallComponent);
        if (paywallComponent instanceof ButtonComponent) {
            return createButtonComponentStyleOrNull(styleFactoryScope, (ButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof ImageComponent) {
            return createImageComponentStyle(styleFactoryScope, (ImageComponent) paywallComponent);
        }
        if (paywallComponent instanceof PackageComponent) {
            return createPackageComponentStyle(styleFactoryScope, (PackageComponent) paywallComponent);
        }
        if (paywallComponent instanceof PurchaseButtonComponent) {
            return createPurchaseButtonComponentStyle(styleFactoryScope, (PurchaseButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof StackComponent) {
            return createStackComponentStyle(styleFactoryScope, (StackComponent) paywallComponent);
        }
        if (paywallComponent instanceof StickyFooterComponent) {
            return createStickyFooterComponentStyle(styleFactoryScope, (StickyFooterComponent) paywallComponent);
        }
        if (paywallComponent instanceof TextComponent) {
            return createTextComponentStyle(styleFactoryScope, (TextComponent) paywallComponent);
        }
        if (paywallComponent instanceof IconComponent) {
            return createIconComponentStyle(styleFactoryScope, (IconComponent) paywallComponent);
        }
        if (paywallComponent instanceof TimelineComponent) {
            return createTimelineComponentStyle(styleFactoryScope, (TimelineComponent) paywallComponent);
        }
        if (paywallComponent instanceof CarouselComponent) {
            return createCarouselComponentStyle(styleFactoryScope, (CarouselComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlButtonComponent) {
            return createTabControlButtonComponentStyle(styleFactoryScope, (TabControlButtonComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlToggleComponent) {
            return createTabControlToggleComponentStyle(styleFactoryScope, (TabControlToggleComponent) paywallComponent);
        }
        if (paywallComponent instanceof TabControlComponent) {
            return ResultKt.errorIfNull(styleFactoryScope.getTabControl(), NonEmptyListKt.nonEmptyListOf(PaywallValidationError.TabControlNotInTab.INSTANCE, new PaywallValidationError.TabControlNotInTab[0]));
        }
        if (paywallComponent instanceof TabsComponent) {
            return createTabsComponentStyle(styleFactoryScope, (TabsComponent) paywallComponent);
        }
        if (paywallComponent instanceof VideoComponent) {
            return createVideoComponentStyle(styleFactoryScope, (VideoComponent) paywallComponent);
        }
        if (paywallComponent instanceof CountdownComponent) {
            return createCountdownComponentStyle(styleFactoryScope, (CountdownComponent) paywallComponent);
        }
        throw new o();
    }

    private final Result createPackageComponentStyle(StyleFactoryScope styleFactoryScope, PackageComponent packageComponent) {
        Package r0 = (Package) new Result.Success(getPackageOrNull(this.offering, packageComponent.getPackageId())).getValue();
        if (r0 != null) {
            ResolvedOffer resolve = PromoOfferResolver.INSTANCE.resolve(r0, packageComponent.getPlayStoreOffer());
            return (Result) styleFactoryScope.withSelectedScope(new PaywallState.Loaded.Components.AvailablePackages.Info(r0, packageComponent.isSelectedByDefault(), resolve), null, new StyleFactory$createPackageComponentStyle$1$1(this, packageComponent, r0, resolve));
        }
        String identifier = this.offering.getIdentifier();
        String packageId = packageComponent.getPackageId();
        List availablePackages = this.offering.getAvailablePackages();
        ArrayList arrayList = new ArrayList(w.y(availablePackages, 10));
        Iterator it = availablePackages.iterator();
        while (it.hasNext()) {
            arrayList.add(((Package) it.next()).getIdentifier());
        }
        Logger.INSTANCE.w(new PaywallValidationError.MissingPackage(identifier, packageId, arrayList).getMessage());
        return new Result.Success(null);
    }

    private final Result createPurchaseButtonComponentStyle(StyleFactoryScope styleFactoryScope, PurchaseButtonComponent purchaseButtonComponent) {
        Result createStackComponentStyle = createStackComponentStyle(styleFactoryScope, purchaseButtonComponent.getStack());
        PurchaseButtonComponent.Method method = purchaseButtonComponent.getMethod();
        if (method == null) {
            PurchaseButtonComponent.Action action = purchaseButtonComponent.getAction();
            method = action != null ? action.toMethod() : null;
        }
        Result convertPurchaseButtonMethod = convertPurchaseButtonMethod(styleFactoryScope, method);
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        Result.Success success4 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(createStackComponentStyle, convertPurchaseButtonMethod, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(createStackComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) createStackComponentStyle).getValue();
        t.e(convertPurchaseButtonMethod, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) convertPurchaseButtonMethod).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        return new Result.Success(new ButtonComponentStyle((StackComponentStyle) value, (ButtonComponentStyle.Action) value2, null, 4, null));
    }

    private final Result createStackComponentStyle(StyleFactoryScope styleFactoryScope, StackComponent stackComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(stackComponent.getOverrides(), this.stripRules, new 1(styleFactoryScope));
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List components = stackComponent.getComponents();
        ArrayList<Result> arrayList = new ArrayList(w.y(components, 10));
        Iterator it = components.iterator();
        while (it.hasNext()) {
            arrayList.add(createInternal(styleFactoryScope, (PaywallComponent) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((ComponentStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        if (error instanceof Result.Success) {
            error = new Result.Success(D.c0((List) ((Result.Success) error).getValue()));
        } else if (!(error instanceof Result.Error)) {
            throw new o();
        }
        Badge badge = stackComponent.getBadge();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(badge != null ? BadgeStyleKt.toBadgeStyle(badge, new 6(styleFactoryScope)) : null);
        Result createBackgroundStyles = createBackgroundStyles(stackComponent.getBackground(), stackComponent.getBackgroundColor());
        Border border = stackComponent.getBorder();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = stackComponent.getShadow();
        Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, error, orSuccessfullyNull, createBackgroundStyles, orSuccessfullyNull2, orSuccessfullyNull3)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        Object value2 = ((Result.Success) error).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(createBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) createBackgroundStyles).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull2).getValue();
        t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        ShadowStyles shadowStyles = (ShadowStyles) ((Result.Success) orSuccessfullyNull3).getValue();
        BorderStyles borderStyles = (BorderStyles) value5;
        BackgroundStyles backgroundStyles = (BackgroundStyles) value4;
        BadgeStyle badgeStyle = (BadgeStyle) value3;
        List list = (List) value2;
        List list2 = (List) value;
        Dimension dimension = stackComponent.getDimension();
        Boolean visible = stackComponent.getVisible();
        boolean booleanValue = visible != null ? visible.booleanValue() : true;
        Size size = stackComponent.getSize();
        Float spacing = stackComponent.getSpacing();
        float g = h.g(spacing != null ? spacing.floatValue() : 0.0f);
        L paddingValues = PaddingKt.toPaddingValues(stackComponent.getPadding());
        L paddingValues2 = PaddingKt.toPaddingValues(stackComponent.getMargin());
        Shape.Rectangle shape = stackComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        Shape.Rectangle rectangle = shape;
        StackComponent.Overflow overflow = stackComponent.getOverflow();
        return new Result.Success(new StackComponentStyle(list, dimension, booleanValue, size, g, backgroundStyles, paddingValues, paddingValues2, rectangle, borderStyles, shadowStyles, badgeStyle, overflow != null ? OverflowExtensionsKt.toOrientation(overflow, stackComponent.getDimension()) : null, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), styleFactoryScope.getCountdownDate(), styleFactoryScope.getCountFrom(), list2, styleFactoryScope.getApplyTopWindowInsets(), false, false, 6291456, null));
    }

    private final Result createStickyFooterComponentStyle(StyleFactoryScope styleFactoryScope, StickyFooterComponent stickyFooterComponent) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new 1(stickyFooterComponent));
    }

    private final Result createTabControlButtonComponentStyle(StyleFactoryScope styleFactoryScope, TabControlButtonComponent tabControlButtonComponent) {
        return (Result) styleFactoryScope.withSelectedScope(null, Integer.valueOf(tabControlButtonComponent.getTabIndex()), new 1(tabControlButtonComponent));
    }

    private final Result createTabControlToggleComponentStyle(StyleFactoryScope styleFactoryScope, TabControlToggleComponent tabControlToggleComponent) {
        Result colorStyles = ColorStyleKt.toColorStyles(tabControlToggleComponent.getThumbColorOn(), this.colorAliases);
        Result colorStyles2 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getThumbColorOff(), this.colorAliases);
        Result colorStyles3 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getTrackColorOn(), this.colorAliases);
        Result colorStyles4 = ColorStyleKt.toColorStyles(tabControlToggleComponent.getTrackColorOff(), this.colorAliases);
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(colorStyles, colorStyles2, colorStyles3, colorStyles4, success, success2)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(colorStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) colorStyles).getValue();
        t.e(colorStyles2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) colorStyles2).getValue();
        t.e(colorStyles3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) colorStyles3).getValue();
        t.e(colorStyles4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) colorStyles4).getValue();
        Object value5 = success.getValue();
        ColorStyles colorStyles5 = (ColorStyles) value4;
        ColorStyles colorStyles6 = (ColorStyles) value3;
        ColorStyles colorStyles7 = (ColorStyles) value2;
        ColorStyles colorStyles8 = (ColorStyles) value;
        styleFactoryScope.setDefaultTabIndex(tabControlToggleComponent.getDefaultValue() ? 1 : 0);
        return new Result.Success(new TabControlToggleComponentStyle(colorStyles8, colorStyles7, colorStyles6, colorStyles5));
    }

    private final Result createTabsComponentStyle(StyleFactoryScope styleFactoryScope, TabsComponent tabsComponent) {
        Result createTabsComponentStyleTabControl = createTabsComponentStyleTabControl(styleFactoryScope, tabsComponent.getControl());
        if (!(createTabsComponentStyleTabControl instanceof Result.Success)) {
            if (createTabsComponentStyleTabControl instanceof Result.Error) {
                return createTabsComponentStyleTabControl;
            }
            throw new o();
        }
        TabControlStyle tabControlStyle = (TabControlStyle) ((Result.Success) createTabsComponentStyleTabControl).getValue();
        String defaultTabId = tabsComponent.getDefaultTabId();
        if (defaultTabId != null) {
            if (E.h0(defaultTabId)) {
                defaultTabId = null;
            }
            if (defaultTabId != null) {
                Iterator it = tabsComponent.getTabs().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (t.c(((TabsComponent.Tab) it.next()).getId(), defaultTabId)) {
                        break;
                    }
                    i++;
                }
                Number valueOf = Integer.valueOf(i);
                if (valueOf.intValue() == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    styleFactoryScope.setDefaultTabIndex(Integer.valueOf(valueOf.intValue()));
                }
            }
        }
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(tabsComponent.getOverrides(), this.stripRules, new StyleFactory$createTabsComponentStyle$1$5(this));
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        Result createTabsComponentStyleTabs = createTabsComponentStyleTabs(styleFactoryScope, tabsComponent.getTabs(), tabControlStyle);
        Result createBackgroundStyles = createBackgroundStyles(tabsComponent.getBackground(), tabsComponent.getBackgroundColor());
        Border border = tabsComponent.getBorder();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = tabsComponent.getShadow();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        Result.Success success = new Result.Success(I.a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, createTabsComponentStyleTabs, createBackgroundStyles, orSuccessfullyNull, orSuccessfullyNull2, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        t.e(createTabsComponentStyleTabs, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) createTabsComponentStyleTabs).getValue();
        t.e(createBackgroundStyles, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) createBackgroundStyles).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull2).getValue();
        ShadowStyles shadowStyles = (ShadowStyles) value5;
        BorderStyles borderStyles = (BorderStyles) value4;
        BackgroundStyles backgroundStyles = (BackgroundStyles) value3;
        NonEmptyList nonEmptyList = (NonEmptyList) value2;
        List list = (List) value;
        Boolean visible = tabsComponent.getVisible();
        boolean booleanValue = visible != null ? visible.booleanValue() : true;
        Size size = tabsComponent.getSize();
        L paddingValues = PaddingKt.toPaddingValues(tabsComponent.getPadding());
        L paddingValues2 = PaddingKt.toPaddingValues(tabsComponent.getMargin());
        Shape.Rectangle shape = tabsComponent.getShape();
        if (shape == null) {
            shape = DEFAULT_SHAPE;
        }
        return new Result.Success(new TabsComponentStyle(booleanValue, size, paddingValues, paddingValues2, backgroundStyles, shape, borderStyles, shadowStyles, tabControlStyle, nonEmptyList, list));
    }

    private final Result createTabsComponentStyleTab(StyleFactoryScope styleFactoryScope, TabsComponent.Tab tab, TabControlStyle tabControlStyle, int i) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new 1(i, tabControlStyle, this, tab));
    }

    private final Result createTabsComponentStyleTabControl(StyleFactoryScope styleFactoryScope, TabsComponent.TabControl tabControl) {
        return (Result) styleFactoryScope.withSelectedScope(null, null, new 1(tabControl, this));
    }

    private final Result createTabsComponentStyleTabs(StyleFactoryScope styleFactoryScope, List list, TabControlStyle tabControlStyle) {
        Result errorIfNull = ResultKt.errorIfNull(NonEmptyListKt.toNonEmptyListOrNull(list), NonEmptyListKt.nonEmptyListOf(PaywallValidationError.TabsComponentWithoutTabs.INSTANCE, new PaywallValidationError.TabsComponentWithoutTabs[0]));
        if (errorIfNull instanceof Result.Success) {
            return NonEmptyListKt.flatten(((NonEmptyList) ((Result.Success) errorIfNull).getValue()).mapIndexed(new StyleFactory$createTabsComponentStyleTabs$1$1(this, styleFactoryScope, tabControlStyle)));
        }
        if (errorIfNull instanceof Result.Error) {
            return errorIfNull;
        }
        throw new o();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[LOOP:1: B:18:0x0094->B:20:0x009a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.revenuecat.purchases.ui.revenuecatui.helpers.Result createTextComponentStyle(com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.StyleFactoryScope r31, com.revenuecat.purchases.paywalls.components.TextComponent r32) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory.createTextComponentStyle(com.revenuecat.purchases.ui.revenuecatui.components.style.StyleFactory$StyleFactoryScope, com.revenuecat.purchases.paywalls.components.TextComponent):com.revenuecat.purchases.ui.revenuecatui.helpers.Result");
    }

    private final Result createTimelineComponentItemStyle(StyleFactoryScope styleFactoryScope, TimelineComponent.Item item) {
        ColorScheme color;
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(item.getOverrides(), this.stripRules, new 1());
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        Result createTextComponentStyle = createTextComponentStyle(styleFactoryScope, item.getTitle());
        TextComponent description = item.getDescription();
        TimelineComponentStyle.ConnectorStyle connectorStyle = null;
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(description != null ? createTextComponentStyle(styleFactoryScope, description) : null);
        Result createIconComponentStyle = createIconComponentStyle(styleFactoryScope, item.getIcon());
        TimelineComponent.Connector connector = item.getConnector();
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull((connector == null || (color = connector.getColor()) == null) ? null : ColorStyleKt.toColorStyles(color, this.colorAliases));
        Result.Success success = new Result.Success(I.a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, createTextComponentStyle, orSuccessfullyNull, createIconComponentStyle, orSuccessfullyNull2, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        t.e(createTextComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) createTextComponentStyle).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(createIconComponentStyle, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) createIconComponentStyle).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull2).getValue();
        ColorStyles colorStyles = (ColorStyles) value5;
        IconComponentStyle iconComponentStyle = (IconComponentStyle) value4;
        TextComponentStyle textComponentStyle = (TextComponentStyle) value3;
        TextComponentStyle textComponentStyle2 = (TextComponentStyle) value2;
        List list = (List) value;
        TimelineComponent.Connector connector2 = item.getConnector();
        if (connector2 != null && colorStyles != null) {
            connectorStyle = new TimelineComponentStyle.ConnectorStyle(connector2.getWidth(), PaddingKt.toPaddingValues(connector2.getMargin()), colorStyles);
        }
        TimelineComponentStyle.ConnectorStyle connectorStyle2 = connectorStyle;
        Boolean visible = item.getVisible();
        return new Result.Success(new TimelineComponentStyle.ItemStyle(textComponentStyle2, visible != null ? visible.booleanValue() : true, textComponentStyle, iconComponentStyle, connectorStyle2, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list));
    }

    private final Result createTimelineComponentStyle(StyleFactoryScope styleFactoryScope, TimelineComponent timelineComponent) {
        Result presentedOverrides = PresentedPartialKt.toPresentedOverrides(timelineComponent.getOverrides(), this.stripRules, 1.INSTANCE);
        if (!(presentedOverrides instanceof Result.Success)) {
            if (!(presentedOverrides instanceof Result.Error)) {
                throw new o();
            }
            presentedOverrides = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) presentedOverrides).getValue(), new PaywallValidationError[0]));
        }
        List items = timelineComponent.getItems();
        ArrayList<Result> arrayList = new ArrayList(w.y(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(createTimelineComponentItemStyle(styleFactoryScope, (TimelineComponent.Item) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Result result : arrayList) {
            if (result instanceof Result.Success) {
                if (arrayList3.isEmpty()) {
                    arrayList2.add((TimelineComponentStyle.ItemStyle) ((Result.Success) result).getValue());
                }
            } else if (result instanceof Result.Error) {
                arrayList3.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList3);
        Result error = nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList2);
        I i = I.a;
        Result.Success success = new Result.Success(i);
        Result.Success success2 = new Result.Success(i);
        Result.Success success3 = new Result.Success(i);
        Result.Success success4 = new Result.Success(i);
        NonEmptyList nonEmptyListOrNull2 = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(presentedOverrides, error, success, success2, success3, success4)));
        if (nonEmptyListOrNull2 != null) {
            return new Result.Error(nonEmptyListOrNull2);
        }
        t.e(presentedOverrides, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) presentedOverrides).getValue();
        Object value2 = ((Result.Success) error).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        List list = (List) value2;
        List list2 = (List) value;
        int itemSpacing = timelineComponent.getItemSpacing();
        int textSpacing = timelineComponent.getTextSpacing();
        int columnGutter = timelineComponent.getColumnGutter();
        TimelineComponent.IconAlignment iconAlignment = timelineComponent.getIconAlignment();
        Boolean visible = timelineComponent.getVisible();
        return new Result.Success(new TimelineComponentStyle(itemSpacing, textSpacing, columnGutter, iconAlignment, visible != null ? visible.booleanValue() : true, timelineComponent.getSize(), PaddingKt.toPaddingValues(timelineComponent.getPadding()), PaddingKt.toPaddingValues(timelineComponent.getMargin()), list, styleFactoryScope.getRcPackage(), styleFactoryScope.getResolvedOffer(), styleFactoryScope.getTabControlIndex(), styleFactoryScope.getOfferEligibility(), list2));
    }

    private final Result createVideoComponentStyle(StyleFactoryScope styleFactoryScope, VideoComponent videoComponent) {
        Result result;
        L c;
        L c2;
        Result result2 = withLocalizedOverrides-TDPsjl0(videoComponent.getSource(), videoComponent.getOverrideSourceLid-sa7TU9Q());
        ThemeImageUrls fallbackSource = videoComponent.getFallbackSource();
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(fallbackSource != null ? withLocalizedOverrides-TDPsjl0(fallbackSource, videoComponent.getOverrideSourceLid-sa7TU9Q()) : null);
        List overrides = videoComponent.getOverrides();
        if (overrides == null || (result = PresentedPartialKt.toPresentedOverrides(overrides, this.stripRules, new 1())) == null) {
            result = null;
        } else if (!(result instanceof Result.Success)) {
            if (!(result instanceof Result.Error)) {
                throw new o();
            }
            result = new Result.Error(NonEmptyListKt.nonEmptyListOf((PaywallValidationError) ((Result.Error) result).getValue(), new PaywallValidationError[0]));
        }
        Result orSuccessfullyNull2 = ResultKt.orSuccessfullyNull(result);
        ColorScheme colorOverlay = videoComponent.getColorOverlay();
        Result orSuccessfullyNull3 = ResultKt.orSuccessfullyNull(colorOverlay != null ? ColorStyleKt.toColorStyles(colorOverlay, this.colorAliases) : null);
        Border border = videoComponent.getBorder();
        Result orSuccessfullyNull4 = ResultKt.orSuccessfullyNull(border != null ? BorderStyleKt.toBorderStyles(border, this.colorAliases) : null);
        Shadow shadow = videoComponent.getShadow();
        Result orSuccessfullyNull5 = ResultKt.orSuccessfullyNull(shadow != null ? ShadowStyleKt.toShadowStyles(shadow, this.colorAliases) : null);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(ResultKt.access$collectErrors(v.q(result2, orSuccessfullyNull, orSuccessfullyNull2, orSuccessfullyNull3, orSuccessfullyNull4, orSuccessfullyNull5)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        t.e(result2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<A of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value = ((Result.Success) result2).getValue();
        t.e(orSuccessfullyNull, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<B of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value2 = ((Result.Success) orSuccessfullyNull).getValue();
        t.e(orSuccessfullyNull2, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<C of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value3 = ((Result.Success) orSuccessfullyNull2).getValue();
        t.e(orSuccessfullyNull3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<D of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value4 = ((Result.Success) orSuccessfullyNull3).getValue();
        t.e(orSuccessfullyNull4, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<E of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        Object value5 = ((Result.Success) orSuccessfullyNull4).getValue();
        t.e(orSuccessfullyNull5, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.helpers.Result.Success<F of com.revenuecat.purchases.ui.revenuecatui.helpers.ResultKt.zipOrAccumulate>");
        ShadowStyles shadowStyles = (ShadowStyles) ((Result.Success) orSuccessfullyNull5).getValue();
        BorderStyles borderStyles = (BorderStyles) value5;
        ColorStyles colorStyles = (ColorStyles) value4;
        List list = (List) value3;
        NonEmptyMap nonEmptyMap = (NonEmptyMap) value2;
        NonEmptyMap nonEmptyMap2 = (NonEmptyMap) value;
        Boolean visible = videoComponent.getVisible();
        boolean booleanValue = visible != null ? visible.booleanValue() : true;
        Size size = videoComponent.getSize();
        Padding padding = videoComponent.getPadding();
        if (padding == null || (c = PaddingKt.toPaddingValues(padding)) == null) {
            c = f.c(0.0f, 0.0f, 3, (Object) null);
        }
        L l = c;
        Padding margin = videoComponent.getMargin();
        if (margin == null || (c2 = PaddingKt.toPaddingValues(margin)) == null) {
            c2 = f.c(0.0f, 0.0f, 3, (Object) null);
        }
        L l2 = c2;
        Package rcPackage = styleFactoryScope.getRcPackage();
        ResolvedOffer resolvedOffer = styleFactoryScope.getResolvedOffer();
        Integer tabControlIndex = styleFactoryScope.getTabControlIndex();
        OfferEligibility offerEligibility = styleFactoryScope.getOfferEligibility();
        List n = list == null ? v.n() : list;
        boolean showControls = videoComponent.getShowControls();
        boolean autoplay = videoComponent.getAutoplay();
        boolean loop = videoComponent.getLoop();
        boolean muteAudio = videoComponent.getMuteAudio();
        MaskShape maskShape = videoComponent.getMaskShape();
        return new Result.Success(new VideoComponentStyle(nonEmptyMap2, nonEmptyMap, showControls, autoplay, loop, muteAudio, size, booleanValue, l, l2, maskShape != null ? ShapeKt.toShape(maskShape) : null, borderStyles, shadowStyles, colorStyles, FitModeKt.toContentScale(videoComponent.getFitMode()), rcPackage, resolvedOffer, tabControlIndex, offerEligibility, styleFactoryScope.getIgnoreTopWindowInsets(), n));
    }

    private final Package getPackageOrNull(Offering offering, String str) {
        try {
            return offering.getPackage(str);
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    private final Result withLocalizedOverrides-TDPsjl0(ThemeImageUrls themeImageUrls, String str) {
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(str != null ? LocalizationKt.imageForAllLocales-7v81vok(this.localizations, str) : null);
        if (!(orSuccessfullyNull instanceof Result.Success)) {
            if (orSuccessfullyNull instanceof Result.Error) {
                return orSuccessfullyNull;
            }
            throw new o();
        }
        Map map = (NonEmptyMap) ((Result.Success) orSuccessfullyNull).getValue();
        q a = Ca.x.a(this.localizations.getEntry().getKey(), themeImageUrls);
        if (map == null) {
            map = S.h();
        }
        return new Result.Success(NonEmptyMapKt.nonEmptyMapOf(a, map));
    }

    public final Result create(PaywallComponent component, boolean z, boolean z2) {
        t.g(component, "component");
        StyleFactoryScope styleFactoryScope = new StyleFactoryScope(null, null, null, null, null, null, null, null, 255, null);
        Result createInternal = createInternal(styleFactoryScope, component);
        if (createInternal instanceof Result.Success) {
            ComponentStyle componentStyle = (ComponentStyle) ((Result.Success) createInternal).getValue();
            createInternal = componentStyle != null ? new Result.Success(componentStyle) : new Result.Error(NonEmptyListKt.nonEmptyListOf(new PaywallValidationError.RootComponentUnsupportedProperties(component), new PaywallValidationError.RootComponentUnsupportedProperties[0]));
        } else if (!(createInternal instanceof Result.Error)) {
            throw new o();
        }
        if (createInternal instanceof Result.Success) {
            createInternal = new Result.Success(styleFactoryScope.applyTopWindowInsetsIfNotYetApplied((ComponentStyle) ((Result.Success) createInternal).getValue()));
        } else if (!(createInternal instanceof Result.Error)) {
            throw new o();
        }
        if (createInternal instanceof Result.Success) {
            createInternal = new Result.Success(styleFactoryScope.applyBottomWindowInsetsIfNecessary((ComponentStyle) ((Result.Success) createInternal).getValue(), z));
        } else if (!(createInternal instanceof Result.Error)) {
            throw new o();
        }
        if (createInternal instanceof Result.Success) {
            createInternal = new Result.Success(styleFactoryScope.applyHorizontalWindowInsetsIfNecessary((ComponentStyle) ((Result.Success) createInternal).getValue(), z2));
        } else if (!(createInternal instanceof Result.Error)) {
            throw new o();
        }
        if (createInternal instanceof Result.Success) {
            return new Result.Success(new StyleResult((ComponentStyle) ((Result.Success) createInternal).getValue(), styleFactoryScope.getPackages(), styleFactoryScope.getDefaultTabIndex()));
        }
        if (createInternal instanceof Result.Error) {
            return createInternal;
        }
        throw new o();
    }

    public static final /* synthetic */ Result access$withLocalizedOverrides-TDPsjl0(StyleFactory styleFactory, ThemeVideoUrls themeVideoUrls, String str) {
        return styleFactory.withLocalizedOverrides-TDPsjl0(themeVideoUrls, str);
    }

    private final Result withLocalizedOverrides-TDPsjl0(ThemeVideoUrls themeVideoUrls, String str) {
        Result orSuccessfullyNull = ResultKt.orSuccessfullyNull(str != null ? LocalizationKt.videoForAllLocales-7v81vok(this.localizations, str) : null);
        if (orSuccessfullyNull instanceof Result.Success) {
            Map map = (NonEmptyMap) ((Result.Success) orSuccessfullyNull).getValue();
            q a = Ca.x.a(this.localizations.getEntry().getKey(), themeVideoUrls);
            if (map == null) {
                map = S.h();
            }
            return new Result.Success(NonEmptyMapKt.nonEmptyMapOf(a, map));
        }
        if (orSuccessfullyNull instanceof Result.Error) {
            return orSuccessfullyNull;
        }
        throw new o();
    }

    public /* synthetic */ StyleFactory(NonEmptyMap nonEmptyMap, Map map, Map map2, NonEmptyMap nonEmptyMap2, Offering offering, boolean z, int i, k kVar) {
        this(nonEmptyMap, map, map2, nonEmptyMap2, offering, (i & 32) != 0 ? false : z);
    }
}
