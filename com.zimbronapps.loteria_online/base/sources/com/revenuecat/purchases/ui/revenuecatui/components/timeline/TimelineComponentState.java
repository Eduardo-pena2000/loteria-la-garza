package com.revenuecat.purchases.ui.revenuecatui.components.timeline;

import Da.S;
import F.L;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelineItemPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTimelinePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TimelineComponentStyle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TimelineComponentState {
    public static final int $stable = 0;
    private final h2 columnGutter$delegate;
    private final a customVariablesProvider;
    private final h2 iconAlignment$delegate;
    private final h2 itemSpacing$delegate;
    private final h2 items$delegate;
    private final h2 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final h2 size$delegate;
    private final TimelineComponentStyle style;
    private final h2 textSpacing$delegate;
    private final h2 visible$delegate;
    private final C0 windowSize$delegate;

    public static final class 1 extends u implements a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final Map invoke() {
            return S.h();
        }
    }

    public TimelineComponentState(c initialWindowSize, TimelineComponentStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
        t.g(initialWindowSize, "initialWindowSize");
        t.g(style, "style");
        t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
        t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        t.g(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial$delegate = U1.c(new TimelineComponentState$presentedPartial$2(this));
        this.visible$delegate = U1.c(new TimelineComponentState$visible$2(this));
        this.itemSpacing$delegate = U1.c(new TimelineComponentState$itemSpacing$2(this));
        this.textSpacing$delegate = U1.c(new TimelineComponentState$textSpacing$2(this));
        this.columnGutter$delegate = U1.c(new TimelineComponentState$columnGutter$2(this));
        this.iconAlignment$delegate = U1.c(new TimelineComponentState$iconAlignment$2(this));
        this.size$delegate = U1.c(new TimelineComponentState$size$2(this));
        this.padding$delegate = U1.c(new TimelineComponentState$padding$2(this));
        this.margin$delegate = U1.c(new TimelineComponentState$margin$2(this));
        this.items$delegate = U1.c(new TimelineComponentState$items$2(this));
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedTimelinePartial access$getPresentedPartial(TimelineComponentState timelineComponentState) {
        return timelineComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedOfferEligibilityProvider$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.selectedOfferEligibilityProvider;
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ a access$getSelectedTabIndexProvider$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.selectedTabIndexProvider;
    }

    public static final /* synthetic */ TimelineComponentStyle access$getStyle$p(TimelineComponentState timelineComponentState) {
        return timelineComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(TimelineComponentState timelineComponentState) {
        return timelineComponentState.getWindowSize();
    }

    private final PresentedTimelinePartial getPresentedPartial() {
        return (PresentedTimelinePartial) this.presentedPartial$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(TimelineComponentState timelineComponentState, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        timelineComponentState.update(cVar);
    }

    public final /* synthetic */ int getColumnGutter() {
        return ((Number) this.columnGutter$delegate.getValue()).intValue();
    }

    public final /* synthetic */ TimelineComponent.IconAlignment getIconAlignment() {
        return (TimelineComponent.IconAlignment) this.iconAlignment$delegate.getValue();
    }

    public final /* synthetic */ int getItemSpacing() {
        return ((Number) this.itemSpacing$delegate.getValue()).intValue();
    }

    public final /* synthetic */ List getItems() {
        return (List) this.items$delegate.getValue();
    }

    public final /* synthetic */ L getMargin() {
        return (L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ L getPadding() {
        return (L) this.padding$delegate.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size$delegate.getValue();
    }

    public final /* synthetic */ int getTextSpacing() {
        return ((Number) this.textSpacing$delegate.getValue()).intValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
    }

    public static final class ItemState {
        public static final int $stable = 0;
        private final h2 connector$delegate;
        private final a customVariablesProvider;
        private final h2 description$delegate;
        private final h2 icon$delegate;
        private final PackageAwareDelegate packageAwareDelegate;
        private final h2 presentedPartial$delegate;
        private final a selectedOfferEligibilityProvider;
        private final a selectedPackageInfoProvider;
        private final a selectedTabIndexProvider;
        private final TimelineComponentStyle.ItemStyle style;
        private final h2 title$delegate;
        private final h2 visible$delegate;
        private final C0 windowSize$delegate;

        public static final class 1 extends u implements a {
            public static final 1 INSTANCE = new 1();

            public 1() {
                super(0);
            }

            public final Map invoke() {
                return S.h();
            }
        }

        public ItemState(c initialWindowSize, TimelineComponentStyle.ItemStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
            t.g(initialWindowSize, "initialWindowSize");
            t.g(style, "style");
            t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
            t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
            t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
            t.g(customVariablesProvider, "customVariablesProvider");
            this.style = style;
            this.selectedPackageInfoProvider = selectedPackageInfoProvider;
            this.selectedTabIndexProvider = selectedTabIndexProvider;
            this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
            this.customVariablesProvider = customVariablesProvider;
            this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
            this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
            this.presentedPartial$delegate = U1.c(new TimelineComponentState$ItemState$presentedPartial$2(this));
            this.visible$delegate = U1.c(new TimelineComponentState$ItemState$visible$2(this));
            this.title$delegate = U1.c(new TimelineComponentState$ItemState$title$2(this));
            this.description$delegate = U1.c(new TimelineComponentState$ItemState$description$2(this));
            this.icon$delegate = U1.c(new TimelineComponentState$ItemState$icon$2(this));
            this.connector$delegate = U1.c(new TimelineComponentState$ItemState$connector$2(this));
        }

        public static final /* synthetic */ a access$getCustomVariablesProvider$p(ItemState itemState) {
            return itemState.customVariablesProvider;
        }

        public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(ItemState itemState) {
            return itemState.packageAwareDelegate;
        }

        public static final /* synthetic */ PresentedTimelineItemPartial access$getPresentedPartial(ItemState itemState) {
            return itemState.getPresentedPartial();
        }

        public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(ItemState itemState) {
            return itemState.selectedPackageInfoProvider;
        }

        public static final /* synthetic */ TimelineComponentStyle.ItemStyle access$getStyle$p(ItemState itemState) {
            return itemState.style;
        }

        public static final /* synthetic */ c access$getWindowSize(ItemState itemState) {
            return itemState.getWindowSize();
        }

        private final PresentedTimelineItemPartial getPresentedPartial() {
            return (PresentedTimelineItemPartial) this.presentedPartial$delegate.getValue();
        }

        private final c getWindowSize() {
            return (c) this.windowSize$delegate.getValue();
        }

        private final void setWindowSize(c cVar) {
            this.windowSize$delegate.setValue(cVar);
        }

        public static /* synthetic */ void update$default(ItemState itemState, c cVar, int i, Object obj) {
            if ((i & 1) != 0) {
                cVar = null;
            }
            itemState.update(cVar);
        }

        public final /* synthetic */ TimelineComponentStyle.ConnectorStyle getConnector() {
            return (TimelineComponentStyle.ConnectorStyle) this.connector$delegate.getValue();
        }

        public final /* synthetic */ TextComponentStyle getDescription() {
            return (TextComponentStyle) this.description$delegate.getValue();
        }

        public final /* synthetic */ IconComponentStyle getIcon() {
            return (IconComponentStyle) this.icon$delegate.getValue();
        }

        public final /* synthetic */ TextComponentStyle getTitle() {
            return (TextComponentStyle) this.title$delegate.getValue();
        }

        public final /* synthetic */ boolean getVisible() {
            return ((Boolean) this.visible$delegate.getValue()).booleanValue();
        }

        public final /* synthetic */ void update(c cVar) {
            if (cVar != null) {
                setWindowSize(cVar);
            }
        }

        public /* synthetic */ ItemState(c cVar, TimelineComponentStyle.ItemStyle itemStyle, a aVar, a aVar2, a aVar3, a aVar4, int i, k kVar) {
            this(cVar, itemStyle, aVar, aVar2, aVar3, (i & 32) != 0 ? 1.INSTANCE : aVar4);
        }
    }

    public /* synthetic */ TimelineComponentState(c cVar, TimelineComponentStyle timelineComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, int i, k kVar) {
        this(cVar, timelineComponentStyle, aVar, aVar2, aVar3, (i & 32) != 0 ? 1.INSTANCE : aVar4);
    }
}
