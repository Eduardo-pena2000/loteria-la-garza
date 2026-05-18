package com.revenuecat.purchases.ui.revenuecatui.components.video;

import Ca.K;
import Ca.o;
import Da.S;
import F.L;
import M0.f;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.VideoUrls;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedVideoPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.AspectRatio;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.VideoComponentStyle;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.t;
import v0.E1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VideoComponentState {
    public static final int $stable = 8;
    private final h2 aspectRatio$delegate;
    private final h2 border$delegate;
    private final h2 contentScale$delegate;
    private final Qa.a customVariablesProvider;
    private final C0 darkMode$delegate;
    private final C0 density$delegate;
    private final h2 fallbackAspectRatio$delegate;
    private final h2 fallbackImageUrls$delegate;
    private final h2 fallbackUrls$delegate;
    private final h2 imageAspectRatio$delegate;
    private final C0 layoutDirection$delegate;
    private final Qa.a localeProvider;
    private final h2 margin$delegate;
    private final h2 marginAdjustedAspectRatio$delegate;
    private final h2 overlay$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final Qa.a selectedOfferEligibilityProvider;
    private final Qa.a selectedPackageInfoProvider;
    private final Qa.a selectedTabIndexProvider;
    private final h2 shadow$delegate;
    private final h2 shape$delegate;
    private final h2 size$delegate;
    private final h2 sizePlusMargin$delegate;
    private final VideoComponentStyle style;
    private final h2 themeVideoUrls$delegate;
    private final h2 videoAspectRatio$delegate;
    private final h2 videoUrls$delegate;
    private final h2 visible$delegate;
    private final C0 windowSize$delegate;

    public static final class 1 extends u implements Qa.a {
        public static final 1 INSTANCE = new 1();

        public 1() {
            super(0);
        }

        public final Map invoke() {
            return S.h();
        }
    }

    public VideoComponentState(x4.c initialWindowSize, n1.d initialDensity, boolean z, t initialLayoutDirection, VideoComponentStyle style, Qa.a localeProvider, Qa.a selectedPackageInfoProvider, Qa.a selectedTabIndexProvider, Qa.a selectedOfferEligibilityProvider, Qa.a customVariablesProvider) {
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
        this.presentedPartial$delegate = U1.c(new VideoComponentState$presentedPartial$2(this));
        this.themeVideoUrls$delegate = U1.c(new VideoComponentState$themeVideoUrls$2(this));
        this.fallbackImageUrls$delegate = U1.c(new VideoComponentState$fallbackImageUrls$2(this));
        this.visible$delegate = U1.c(new VideoComponentState$visible$2(this));
        this.videoUrls$delegate = U1.c(new VideoComponentState$videoUrls$2(this));
        this.fallbackUrls$delegate = U1.c(new VideoComponentState$fallbackUrls$2(this));
        this.imageAspectRatio$delegate = U1.c(new VideoComponentState$imageAspectRatio$2(this));
        this.videoAspectRatio$delegate = U1.c(new VideoComponentState$videoAspectRatio$2(this));
        this.size$delegate = U1.c(new VideoComponentState$size$2(this));
        this.aspectRatio$delegate = U1.c(new VideoComponentState$aspectRatio$2(this));
        this.fallbackAspectRatio$delegate = U1.c(new VideoComponentState$fallbackAspectRatio$2(this));
        this.padding$delegate = U1.c(new VideoComponentState$padding$2(this));
        this.margin$delegate = U1.c(new VideoComponentState$margin$2(this));
        this.sizePlusMargin$delegate = U1.c(new VideoComponentState$sizePlusMargin$2(this));
        this.marginAdjustedAspectRatio$delegate = U1.c(new VideoComponentState$marginAdjustedAspectRatio$2(this));
        this.shape$delegate = U1.c(new VideoComponentState$shape$2(this));
        this.border$delegate = U1.c(new VideoComponentState$border$2(this));
        this.shadow$delegate = U1.c(new VideoComponentState$shadow$2(this));
        this.overlay$delegate = U1.c(new VideoComponentState$overlay$2(this));
        this.contentScale$delegate = U1.c(new VideoComponentState$contentScale$2(this));
    }

    public static final /* synthetic */ Size access$adjustForVideo(VideoComponentState videoComponentState, Size size, VideoUrls videoUrls, n1.d dVar) {
        return videoComponentState.adjustForVideo(size, videoUrls, dVar);
    }

    public static final /* synthetic */ Qa.a access$getCustomVariablesProvider$p(VideoComponentState videoComponentState) {
        return videoComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ boolean access$getDarkMode(VideoComponentState videoComponentState) {
        return videoComponentState.getDarkMode();
    }

    public static final /* synthetic */ n1.d access$getDensity(VideoComponentState videoComponentState) {
        return videoComponentState.getDensity();
    }

    public static final /* synthetic */ ThemeImageUrls access$getFallbackImageUrls(VideoComponentState videoComponentState) {
        return videoComponentState.getFallbackImageUrls();
    }

    public static final /* synthetic */ Float access$getImageAspectRatio(VideoComponentState videoComponentState) {
        return videoComponentState.getImageAspectRatio();
    }

    public static final /* synthetic */ t access$getLayoutDirection(VideoComponentState videoComponentState) {
        return videoComponentState.getLayoutDirection();
    }

    public static final /* synthetic */ Qa.a access$getLocaleProvider$p(VideoComponentState videoComponentState) {
        return videoComponentState.localeProvider;
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(VideoComponentState videoComponentState) {
        return videoComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedVideoPartial access$getPresentedPartial(VideoComponentState videoComponentState) {
        return videoComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ Qa.a access$getSelectedPackageInfoProvider$p(VideoComponentState videoComponentState) {
        return videoComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ VideoComponentStyle access$getStyle$p(VideoComponentState videoComponentState) {
        return videoComponentState.style;
    }

    public static final /* synthetic */ ThemeVideoUrls access$getThemeVideoUrls(VideoComponentState videoComponentState) {
        return videoComponentState.getThemeVideoUrls();
    }

    public static final /* synthetic */ float access$getVideoAspectRatio(VideoComponentState videoComponentState) {
        return videoComponentState.getVideoAspectRatio();
    }

    public static final /* synthetic */ x4.c access$getWindowSize(VideoComponentState videoComponentState) {
        return videoComponentState.getWindowSize();
    }

    private final SizeConstraint adjustDimension-yOCu0fQ(SizeConstraint sizeConstraint, SizeConstraint sizeConstraint2, int i, int i2, n1.d dVar) {
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

    private final Size adjustForVideo(Size size, VideoUrls videoUrls, n1.d dVar) {
        return new Size(adjustDimension-yOCu0fQ(size.getWidth(), size.getHeight(), videoUrls.getWidth-pVg5ArA(), videoUrls.getHeight-pVg5ArA(), dVar), adjustDimension-yOCu0fQ(size.getHeight(), size.getWidth(), videoUrls.getHeight-pVg5ArA(), videoUrls.getWidth-pVg5ArA(), dVar));
    }

    private final boolean getDarkMode() {
        return ((Boolean) this.darkMode$delegate.getValue()).booleanValue();
    }

    private final n1.d getDensity() {
        return (n1.d) this.density$delegate.getValue();
    }

    private final ThemeImageUrls getFallbackImageUrls() {
        return (ThemeImageUrls) this.fallbackImageUrls$delegate.getValue();
    }

    private final Float getImageAspectRatio() {
        return (Float) this.imageAspectRatio$delegate.getValue();
    }

    private final t getLayoutDirection() {
        return (t) this.layoutDirection$delegate.getValue();
    }

    private final PresentedVideoPartial getPresentedPartial() {
        return (PresentedVideoPartial) this.presentedPartial$delegate.getValue();
    }

    private final ThemeVideoUrls getThemeVideoUrls() {
        return (ThemeVideoUrls) this.themeVideoUrls$delegate.getValue();
    }

    private final float getVideoAspectRatio() {
        return ((Number) this.videoAspectRatio$delegate.getValue()).floatValue();
    }

    private final x4.c getWindowSize() {
        return (x4.c) this.windowSize$delegate.getValue();
    }

    private final void setDarkMode(boolean z) {
        this.darkMode$delegate.setValue(Boolean.valueOf(z));
    }

    private final void setDensity(n1.d dVar) {
        this.density$delegate.setValue(dVar);
    }

    private final void setLayoutDirection(t tVar) {
        this.layoutDirection$delegate.setValue(tVar);
    }

    private final void setWindowSize(x4.c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(VideoComponentState videoComponentState, x4.c cVar, n1.d dVar, Boolean bool, t tVar, int i, Object obj) {
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
        videoComponentState.update(cVar, dVar, bool, tVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoComponentState)) {
            return false;
        }
        VideoComponentState videoComponentState = (VideoComponentState) obj;
        return kotlin.jvm.internal.t.c(this.style, videoComponentState.style) && kotlin.jvm.internal.t.c(this.localeProvider, videoComponentState.localeProvider) && kotlin.jvm.internal.t.c(this.selectedPackageInfoProvider, videoComponentState.selectedPackageInfoProvider) && kotlin.jvm.internal.t.c(this.selectedTabIndexProvider, videoComponentState.selectedTabIndexProvider) && kotlin.jvm.internal.t.c(this.selectedOfferEligibilityProvider, videoComponentState.selectedOfferEligibilityProvider) && kotlin.jvm.internal.t.c(this.customVariablesProvider, videoComponentState.customVariablesProvider);
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

    public final /* synthetic */ AspectRatio getFallbackAspectRatio() {
        return (AspectRatio) this.fallbackAspectRatio$delegate.getValue();
    }

    public final /* synthetic */ ImageUrls getFallbackUrls() {
        return (ImageUrls) this.fallbackUrls$delegate.getValue();
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

    public final /* synthetic */ VideoUrls getVideoUrls() {
        return (VideoUrls) this.videoUrls$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public int hashCode() {
        return (((((((((this.style.hashCode() * 31) + this.localeProvider.hashCode()) * 31) + this.selectedPackageInfoProvider.hashCode()) * 31) + this.selectedTabIndexProvider.hashCode()) * 31) + this.selectedOfferEligibilityProvider.hashCode()) * 31) + this.customVariablesProvider.hashCode();
    }

    public String toString() {
        return "VideoComponentState(style=" + this.style + ", localeProvider=" + this.localeProvider + ", selectedPackageInfoProvider=" + this.selectedPackageInfoProvider + ", selectedTabIndexProvider=" + this.selectedTabIndexProvider + ", selectedOfferEligibilityProvider=" + this.selectedOfferEligibilityProvider + ", customVariablesProvider=" + this.customVariablesProvider + ')';
    }

    public final /* synthetic */ void update(x4.c cVar, n1.d dVar, Boolean bool, t tVar) {
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

    public /* synthetic */ VideoComponentState(x4.c cVar, n1.d dVar, boolean z, t tVar, VideoComponentStyle videoComponentStyle, Qa.a aVar, Qa.a aVar2, Qa.a aVar3, Qa.a aVar4, Qa.a aVar5, int i, k kVar) {
        this(cVar, dVar, z, tVar, videoComponentStyle, aVar, aVar2, aVar3, aVar4, (i & 512) != 0 ? 1.INSTANCE : aVar5);
    }
}
