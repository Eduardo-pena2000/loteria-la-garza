package com.revenuecat.purchases.ui.revenuecatui.components.carousel;

import Da.S;
import F.L;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedCarouselPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.CarouselComponentStyle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import n1.h;
import o0.e;
import v0.E1;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CarouselComponentState {
    public static final int $stable = 0;
    private final h2 autoAdvance$delegate;
    private final h2 background$delegate;
    private final h2 border$delegate;
    private final a customVariablesProvider;
    private final h2 initialPageIndex$delegate;
    private final h2 loop$delegate;
    private final h2 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 pageAlignment$delegate;
    private final h2 pageControl$delegate;
    private final h2 pagePeek$delegate;
    private final h2 pageSpacing$delegate;
    private final h2 pages$delegate;
    private final h2 presentedPartial$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final h2 shadow$delegate;
    private final h2 shape$delegate;
    private final h2 size$delegate;
    private final CarouselComponentStyle style;
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

    public CarouselComponentState(c initialWindowSize, CarouselComponentStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
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
        this.presentedPartial$delegate = U1.c(new CarouselComponentState$presentedPartial$2(this));
        this.visible$delegate = U1.c(new CarouselComponentState$visible$2(this));
        this.initialPageIndex$delegate = U1.c(new CarouselComponentState$initialPageIndex$2(this));
        this.pages$delegate = U1.c(new CarouselComponentState$pages$2(this));
        this.pageAlignment$delegate = U1.c(new CarouselComponentState$pageAlignment$2(this));
        this.size$delegate = U1.c(new CarouselComponentState$size$2(this));
        this.pagePeek$delegate = U1.c(new CarouselComponentState$pagePeek$2(this));
        this.background$delegate = U1.c(new CarouselComponentState$background$2(this));
        this.pageSpacing$delegate = U1.c(new CarouselComponentState$pageSpacing$2(this));
        this.padding$delegate = U1.c(new CarouselComponentState$padding$2(this));
        this.margin$delegate = U1.c(new CarouselComponentState$margin$2(this));
        this.shape$delegate = U1.c(new CarouselComponentState$shape$2(this));
        this.border$delegate = U1.c(new CarouselComponentState$border$2(this));
        this.shadow$delegate = U1.c(new CarouselComponentState$shadow$2(this));
        this.pageControl$delegate = U1.c(new CarouselComponentState$pageControl$2(this));
        this.loop$delegate = U1.c(new CarouselComponentState$loop$2(this));
        this.autoAdvance$delegate = U1.c(new CarouselComponentState$autoAdvance$2(this));
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(CarouselComponentState carouselComponentState) {
        return carouselComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(CarouselComponentState carouselComponentState) {
        return carouselComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedCarouselPartial access$getPresentedPartial(CarouselComponentState carouselComponentState) {
        return carouselComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(CarouselComponentState carouselComponentState) {
        return carouselComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ CarouselComponentStyle access$getStyle$p(CarouselComponentState carouselComponentState) {
        return carouselComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(CarouselComponentState carouselComponentState) {
        return carouselComponentState.getWindowSize();
    }

    private final PresentedCarouselPartial getPresentedPartial() {
        return (PresentedCarouselPartial) this.presentedPartial$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(CarouselComponentState carouselComponentState, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        carouselComponentState.update(cVar);
    }

    public final /* synthetic */ CarouselComponent.AutoAdvancePages getAutoAdvance() {
        return (CarouselComponent.AutoAdvancePages) this.autoAdvance$delegate.getValue();
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background$delegate.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border$delegate.getValue();
    }

    public final /* synthetic */ int getInitialPageIndex() {
        return ((Number) this.initialPageIndex$delegate.getValue()).intValue();
    }

    public final /* synthetic */ boolean getLoop() {
        return ((Boolean) this.loop$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ L getMargin() {
        return (L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ L getPadding() {
        return (L) this.padding$delegate.getValue();
    }

    public final /* synthetic */ e.c getPageAlignment() {
        return (e.c) this.pageAlignment$delegate.getValue();
    }

    public final /* synthetic */ CarouselComponentStyle.PageControlStyles getPageControl() {
        return (CarouselComponentStyle.PageControlStyles) this.pageControl$delegate.getValue();
    }

    public final /* synthetic */ float getPagePeek-D9Ej5fM() {
        return ((h) this.pagePeek$delegate.getValue()).m();
    }

    public final /* synthetic */ float getPageSpacing-D9Ej5fM() {
        return ((h) this.pageSpacing$delegate.getValue()).m();
    }

    public final /* synthetic */ List getPages() {
        return (List) this.pages$delegate.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow$delegate.getValue();
    }

    public final /* synthetic */ E1 getShape() {
        return (E1) this.shape$delegate.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
    }

    public /* synthetic */ CarouselComponentState(c cVar, CarouselComponentStyle carouselComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, int i, k kVar) {
        this(cVar, carouselComponentStyle, aVar, aVar2, aVar3, (i & 32) != 0 ? 1.INSTANCE : aVar4);
    }
}
