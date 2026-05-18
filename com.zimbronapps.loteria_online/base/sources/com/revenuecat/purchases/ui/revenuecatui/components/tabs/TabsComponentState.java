package com.revenuecat.purchases.ui.revenuecatui.components.tabs;

import Da.S;
import F.L;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedTabsPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TabsComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.composables.OfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.E1;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TabsComponentState {
    public static final int $stable = 0;
    private final h2 background$delegate;
    private final h2 border$delegate;
    private final a customVariablesProvider;
    private final h2 margin$delegate;
    private final h2 offerEligibility$delegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final a selectedPackageInfoProvider;
    private final h2 shadow$delegate;
    private final h2 shape$delegate;
    private final h2 size$delegate;
    private final TabsComponentStyle style;
    private final NonEmptyList tabs;
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

    public TabsComponentState(c initialWindowSize, TabsComponentStyle style, a selectedPackageInfoProvider, a customVariablesProvider) {
        t.g(initialWindowSize, "initialWindowSize");
        t.g(style, "style");
        t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        t.g(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
        this.offerEligibility$delegate = U1.c(new TabsComponentState$offerEligibility$2(this));
        this.presentedPartial$delegate = U1.c(new TabsComponentState$presentedPartial$2(this));
        this.visible$delegate = U1.c(new TabsComponentState$visible$2(this));
        this.tabs = style.getTabs();
        this.size$delegate = U1.c(new TabsComponentState$size$2(this));
        this.background$delegate = U1.c(new TabsComponentState$background$2(this));
        this.padding$delegate = U1.c(new TabsComponentState$padding$2(this));
        this.margin$delegate = U1.c(new TabsComponentState$margin$2(this));
        this.shape$delegate = U1.c(new TabsComponentState$shape$2(this));
        this.border$delegate = U1.c(new TabsComponentState$border$2(this));
        this.shadow$delegate = U1.c(new TabsComponentState$shadow$2(this));
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(TabsComponentState tabsComponentState) {
        return tabsComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ OfferEligibility access$getOfferEligibility(TabsComponentState tabsComponentState) {
        return tabsComponentState.getOfferEligibility();
    }

    public static final /* synthetic */ PresentedTabsPartial access$getPresentedPartial(TabsComponentState tabsComponentState) {
        return tabsComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(TabsComponentState tabsComponentState) {
        return tabsComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ TabsComponentStyle access$getStyle$p(TabsComponentState tabsComponentState) {
        return tabsComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(TabsComponentState tabsComponentState) {
        return tabsComponentState.getWindowSize();
    }

    private final OfferEligibility getOfferEligibility() {
        return (OfferEligibility) this.offerEligibility$delegate.getValue();
    }

    private final PresentedTabsPartial getPresentedPartial() {
        return (PresentedTabsPartial) this.presentedPartial$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(TabsComponentState tabsComponentState, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        tabsComponentState.update(cVar);
    }

    public final /* synthetic */ BackgroundStyles getBackground() {
        return (BackgroundStyles) this.background$delegate.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border$delegate.getValue();
    }

    public final /* synthetic */ L getMargin() {
        return (L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ L getPadding() {
        return (L) this.padding$delegate.getValue();
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

    public final /* synthetic */ NonEmptyList getTabs() {
        return this.tabs;
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
    }

    public /* synthetic */ TabsComponentState(c cVar, TabsComponentStyle tabsComponentStyle, a aVar, a aVar2, int i, k kVar) {
        this(cVar, tabsComponentStyle, aVar, (i & 8) != 0 ? 1.INSTANCE : aVar2);
    }
}
