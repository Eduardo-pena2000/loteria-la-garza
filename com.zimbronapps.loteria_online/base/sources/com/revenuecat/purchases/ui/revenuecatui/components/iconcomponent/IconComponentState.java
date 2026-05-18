package com.revenuecat.purchases.ui.revenuecatui.components.iconcomponent;

import Da.S;
import F.L;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedIconPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.IconComponentStyle;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.t;
import v0.E1;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class IconComponentState {
    public static final int $stable = 0;
    private final h2 backgroundColorStyles$delegate;
    private final h2 baseUrl$delegate;
    private final h2 border$delegate;
    private final a customVariablesProvider;
    private final h2 formats$delegate;
    private final h2 iconBackground$delegate;
    private final h2 iconName$delegate;
    private final C0 layoutDirection$delegate;
    private final h2 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final h2 shadow$delegate;
    private final h2 shape$delegate;
    private final h2 size$delegate;
    private final h2 sizePlusMargin$delegate;
    private final IconComponentStyle style;
    private final h2 tintColor$delegate;
    private final h2 url$delegate;
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

    public IconComponentState(c initialWindowSize, t initialLayoutDirection, IconComponentStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
        kotlin.jvm.internal.t.g(initialWindowSize, "initialWindowSize");
        kotlin.jvm.internal.t.g(initialLayoutDirection, "initialLayoutDirection");
        kotlin.jvm.internal.t.g(style, "style");
        kotlin.jvm.internal.t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        kotlin.jvm.internal.t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
        kotlin.jvm.internal.t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        kotlin.jvm.internal.t.g(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
        this.layoutDirection$delegate = U1.i(initialLayoutDirection, (T1) null, 2, (Object) null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial$delegate = U1.c(new IconComponentState$presentedPartial$2(this));
        this.baseUrl$delegate = U1.c(new IconComponentState$baseUrl$2(this));
        this.iconName$delegate = U1.c(new IconComponentState$iconName$2(this));
        this.formats$delegate = U1.c(new IconComponentState$formats$2(this));
        this.iconBackground$delegate = U1.c(new IconComponentState$iconBackground$2(this));
        this.visible$delegate = U1.c(new IconComponentState$visible$2(this));
        this.url$delegate = U1.c(new IconComponentState$url$2(this));
        this.size$delegate = U1.c(new IconComponentState$size$2(this));
        this.padding$delegate = U1.c(new IconComponentState$padding$2(this));
        this.margin$delegate = U1.c(new IconComponentState$margin$2(this));
        this.sizePlusMargin$delegate = U1.c(new IconComponentState$sizePlusMargin$2(this));
        this.shape$delegate = U1.c(new IconComponentState$shape$2(this));
        this.border$delegate = U1.c(new IconComponentState$border$2(this));
        this.shadow$delegate = U1.c(new IconComponentState$shadow$2(this));
        this.backgroundColorStyles$delegate = U1.c(new IconComponentState$backgroundColorStyles$2(this));
        this.tintColor$delegate = U1.c(new IconComponentState$tintColor$2(this));
    }

    public static final /* synthetic */ String access$getBaseUrl(IconComponentState iconComponentState) {
        return iconComponentState.getBaseUrl();
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(IconComponentState iconComponentState) {
        return iconComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ IconComponent.Formats access$getFormats(IconComponentState iconComponentState) {
        return iconComponentState.getFormats();
    }

    public static final /* synthetic */ IconComponentStyle.Background access$getIconBackground(IconComponentState iconComponentState) {
        return iconComponentState.getIconBackground();
    }

    public static final /* synthetic */ t access$getLayoutDirection(IconComponentState iconComponentState) {
        return iconComponentState.getLayoutDirection();
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(IconComponentState iconComponentState) {
        return iconComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedIconPartial access$getPresentedPartial(IconComponentState iconComponentState) {
        return iconComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(IconComponentState iconComponentState) {
        return iconComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ IconComponentStyle access$getStyle$p(IconComponentState iconComponentState) {
        return iconComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(IconComponentState iconComponentState) {
        return iconComponentState.getWindowSize();
    }

    private final String getBaseUrl() {
        return (String) this.baseUrl$delegate.getValue();
    }

    private final IconComponent.Formats getFormats() {
        return (IconComponent.Formats) this.formats$delegate.getValue();
    }

    private final IconComponentStyle.Background getIconBackground() {
        return (IconComponentStyle.Background) this.iconBackground$delegate.getValue();
    }

    private final String getIconName() {
        return (String) this.iconName$delegate.getValue();
    }

    private final t getLayoutDirection() {
        return (t) this.layoutDirection$delegate.getValue();
    }

    private final PresentedIconPartial getPresentedPartial() {
        return (PresentedIconPartial) this.presentedPartial$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setLayoutDirection(t tVar) {
        this.layoutDirection$delegate.setValue(tVar);
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(IconComponentState iconComponentState, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        iconComponentState.update(cVar);
    }

    public final /* synthetic */ ColorStyles getBackgroundColorStyles() {
        return (ColorStyles) this.backgroundColorStyles$delegate.getValue();
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

    public final /* synthetic */ Size getSizePlusMargin() {
        return (Size) this.sizePlusMargin$delegate.getValue();
    }

    public final ColorStyles getTintColor() {
        return (ColorStyles) this.tintColor$delegate.getValue();
    }

    public final /* synthetic */ String getUrl() {
        return (String) this.url$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
    }

    public /* synthetic */ IconComponentState(c cVar, t tVar, IconComponentStyle iconComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, int i, k kVar) {
        this(cVar, tVar, iconComponentStyle, aVar, aVar2, aVar3, (i & 64) != 0 ? 1.INSTANCE : aVar4);
    }
}
