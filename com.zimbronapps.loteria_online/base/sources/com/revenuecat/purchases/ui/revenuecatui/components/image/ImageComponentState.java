package com.revenuecat.purchases.ui.revenuecatui.components.image;

import Ca.K;
import Ca.o;
import Da.S;
import F.L;
import M0.f;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedImagePartial;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.d;
import n1.t;
import v0.E1;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ImageComponentState {
    public static final int $stable = 0;
    private final h2 aspectRatio$delegate;
    private final h2 border$delegate;
    private final h2 contentScale$delegate;
    private final a customVariablesProvider;
    private final C0 darkMode$delegate;
    private final C0 density$delegate;
    private final h2 imageAspectRatio$delegate;
    private final h2 imageUrls$delegate;
    private final C0 layoutDirection$delegate;
    private final a localeProvider;
    private final h2 margin$delegate;
    private final h2 marginAdjustedAspectRatio$delegate;
    private final h2 overlay$delegate;
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
    private final ImageComponentStyle style;
    private final h2 themeImageUrls$delegate;
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

    public ImageComponentState(c initialWindowSize, d initialDensity, boolean z, t initialLayoutDirection, ImageComponentStyle style, a localeProvider, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
        kotlin.jvm.internal.t.g(initialWindowSize, "initialWindowSize");
        kotlin.jvm.internal.t.g(initialDensity, "initialDensity");
        kotlin.jvm.internal.t.g(initialLayoutDirection, "initialLayoutDirection");
        kotlin.jvm.internal.t.g(style, "style");
        kotlin.jvm.internal.t.g(localeProvider, "localeProvider");
        kotlin.jvm.internal.t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        kotlin.jvm.internal.t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
        kotlin.jvm.internal.t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        kotlin.jvm.internal.t.g(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
        this.density$delegate = U1.i(initialDensity, (T1) null, 2, (Object) null);
        this.darkMode$delegate = U1.i(Boolean.valueOf(z), (T1) null, 2, (Object) null);
        this.layoutDirection$delegate = U1.i(initialLayoutDirection, (T1) null, 2, (Object) null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.presentedPartial$delegate = U1.c(new ImageComponentState$presentedPartial$2(this));
        this.themeImageUrls$delegate = U1.c(new ImageComponentState$themeImageUrls$2(this));
        this.visible$delegate = U1.c(new ImageComponentState$visible$2(this));
        this.imageUrls$delegate = U1.c(new ImageComponentState$imageUrls$2(this));
        this.imageAspectRatio$delegate = U1.c(new ImageComponentState$imageAspectRatio$2(this));
        this.size$delegate = U1.c(new ImageComponentState$size$2(this));
        this.aspectRatio$delegate = U1.c(new ImageComponentState$aspectRatio$2(this));
        this.padding$delegate = U1.c(new ImageComponentState$padding$2(this));
        this.margin$delegate = U1.c(new ImageComponentState$margin$2(this));
        this.sizePlusMargin$delegate = U1.c(new ImageComponentState$sizePlusMargin$2(this));
        this.marginAdjustedAspectRatio$delegate = U1.c(new ImageComponentState$marginAdjustedAspectRatio$2(this));
        this.shape$delegate = U1.c(new ImageComponentState$shape$2(this));
        this.border$delegate = U1.c(new ImageComponentState$border$2(this));
        this.shadow$delegate = U1.c(new ImageComponentState$shadow$2(this));
        this.overlay$delegate = U1.c(new ImageComponentState$overlay$2(this));
        this.contentScale$delegate = U1.c(new ImageComponentState$contentScale$2(this));
    }

    public static final /* synthetic */ Size access$adjustForImage(ImageComponentState imageComponentState, Size size, ImageUrls imageUrls, d dVar) {
        return imageComponentState.adjustForImage(size, imageUrls, dVar);
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(ImageComponentState imageComponentState) {
        return imageComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ boolean access$getDarkMode(ImageComponentState imageComponentState) {
        return imageComponentState.getDarkMode();
    }

    public static final /* synthetic */ d access$getDensity(ImageComponentState imageComponentState) {
        return imageComponentState.getDensity();
    }

    public static final /* synthetic */ float access$getImageAspectRatio(ImageComponentState imageComponentState) {
        return imageComponentState.getImageAspectRatio();
    }

    public static final /* synthetic */ t access$getLayoutDirection(ImageComponentState imageComponentState) {
        return imageComponentState.getLayoutDirection();
    }

    public static final /* synthetic */ a access$getLocaleProvider$p(ImageComponentState imageComponentState) {
        return imageComponentState.localeProvider;
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(ImageComponentState imageComponentState) {
        return imageComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedImagePartial access$getPresentedPartial(ImageComponentState imageComponentState) {
        return imageComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(ImageComponentState imageComponentState) {
        return imageComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ ImageComponentStyle access$getStyle$p(ImageComponentState imageComponentState) {
        return imageComponentState.style;
    }

    public static final /* synthetic */ ThemeImageUrls access$getThemeImageUrls(ImageComponentState imageComponentState) {
        return imageComponentState.getThemeImageUrls();
    }

    public static final /* synthetic */ c access$getWindowSize(ImageComponentState imageComponentState) {
        return imageComponentState.getWindowSize();
    }

    private final SizeConstraint adjustDimension-yOCu0fQ(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, int i, int i2, d dVar) {
        SizeConstraint.Fixed fixed;
        if (!(sizeConstraint instanceof SizeConstraint.Fit)) {
            if (sizeConstraint instanceof SizeConstraint.Fill ? true : sizeConstraint instanceof SizeConstraint.Fixed) {
                return sizeConstraint;
            }
            throw new o();
        }
        if (sizeConstraint2 instanceof SizeConstraint.Fit) {
            fixed = new SizeConstraint.Fixed(K.a(dVar.A(i)), (k) null);
        } else {
            if (sizeConstraint2 instanceof SizeConstraint.Fill) {
                return sizeConstraint;
            }
            if (!(sizeConstraint2 instanceof SizeConstraint.Fixed)) {
                throw new o();
            }
            fixed = new SizeConstraint.Fixed(K.a(dVar.a1((((float) K.c(((SizeConstraint.Fixed) sizeConstraint2).getValue-pVg5ArA())) / dVar.A(i2)) * i)), (k) null);
        }
        return fixed;
    }

    private final Size adjustForImage(Size size, ImageUrls imageUrls, d dVar) {
        return new Size(adjustDimension-yOCu0fQ(size.getWidth(), size.getHeight(), imageUrls.getWidth-pVg5ArA(), imageUrls.getHeight-pVg5ArA(), dVar), adjustDimension-yOCu0fQ(size.getHeight(), size.getWidth(), imageUrls.getHeight-pVg5ArA(), imageUrls.getWidth-pVg5ArA(), dVar));
    }

    private final boolean getDarkMode() {
        return ((Boolean) this.darkMode$delegate.getValue()).booleanValue();
    }

    private final d getDensity() {
        return (d) this.density$delegate.getValue();
    }

    private final float getImageAspectRatio() {
        return ((Number) this.imageAspectRatio$delegate.getValue()).floatValue();
    }

    private final t getLayoutDirection() {
        return (t) this.layoutDirection$delegate.getValue();
    }

    private final PresentedImagePartial getPresentedPartial() {
        return (PresentedImagePartial) this.presentedPartial$delegate.getValue();
    }

    private final ThemeImageUrls getThemeImageUrls() {
        return (ThemeImageUrls) this.themeImageUrls$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setDarkMode(boolean z) {
        this.darkMode$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setDensity(d dVar) {
        this.density$delegate.setValue(dVar);
    }

    private final void setLayoutDirection(t tVar) {
        this.layoutDirection$delegate.setValue(tVar);
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(ImageComponentState imageComponentState, c cVar, d dVar, Boolean bool, t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            dVar = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            tVar = null;
        }
        imageComponentState.update(cVar, dVar, bool, tVar);
    }

    public final /* synthetic */ AspectRatio getAspectRatio() {
        return (AspectRatio) this.aspectRatio$delegate.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border$delegate.getValue();
    }

    public final /* synthetic */ f getContentScale() {
        return (f) this.contentScale$delegate.getValue();
    }

    public final /* synthetic */ ImageUrls getImageUrls() {
        return (ImageUrls) this.imageUrls$delegate.getValue();
    }

    public final /* synthetic */ L getMargin() {
        return (L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ AspectRatio getMarginAdjustedAspectRatio() {
        return (AspectRatio) this.marginAdjustedAspectRatio$delegate.getValue();
    }

    public final /* synthetic */ ColorStyles getOverlay() {
        return (ColorStyles) this.overlay$delegate.getValue();
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

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar, d dVar, Boolean bool, t tVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
        if (dVar != null) {
            setDensity(dVar);
        }
        if (bool != null) {
            setDarkMode(bool.booleanValue());
        }
        if (tVar != null) {
            setLayoutDirection(tVar);
        }
    }

    public /* synthetic */ ImageComponentState(c cVar, d dVar, boolean z, t tVar, ImageComponentStyle imageComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i, k kVar) {
        this(cVar, dVar, z, tVar, imageComponentStyle, aVar, aVar2, aVar3, aVar4, (i & 512) != 0 ? 1.INSTANCE : aVar5);
    }
}
