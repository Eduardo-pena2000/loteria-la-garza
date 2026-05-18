package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import C.q;
import Ca.A;
import Ca.K;
import Ca.o;
import Da.S;
import F.L;
import Qa.a;
import androidx.compose.foundation.layout.f;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import com.revenuecat.purchases.ui.revenuecatui.components.PresentedStackPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.BadgeStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import n1.h;
import n1.t;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StackComponentState {
    public static final int $stable = 0;
    private final boolean applyBottomWindowInsets;
    private final boolean applyHorizontalWindowInsets;
    private final boolean applyTopWindowInsets;
    private final h2 background$delegate;
    private final h2 badge$delegate;
    private final h2 border$delegate;
    private final List children;
    private final a customVariablesProvider;
    private final h2 dimension$delegate;
    private final C0 layoutDirection$delegate;
    private final h2 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final h2 scrollOrientation$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final h2 shadow$delegate;
    private final h2 shape$delegate;
    private final h2 size$delegate;
    private final h2 spacing$delegate;
    private final StackComponentStyle style;
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

    public StackComponentState(c initialWindowSize, t initialLayoutDirection, StackComponentStyle style, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
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
        this.presentedPartial$delegate = U1.c(new StackComponentState$presentedPartial$2(this));
        this.visible$delegate = U1.c(new StackComponentState$visible$2(this));
        this.children = style.getChildren();
        this.applyTopWindowInsets = style.getApplyTopWindowInsets();
        this.applyBottomWindowInsets = style.getApplyBottomWindowInsets();
        this.applyHorizontalWindowInsets = style.getApplyHorizontalWindowInsets();
        this.dimension$delegate = U1.c(new StackComponentState$dimension$2(this));
        this.spacing$delegate = U1.c(new StackComponentState$spacing$2(this));
        this.background$delegate = U1.c(new StackComponentState$background$2(this));
        this.padding$delegate = U1.c(new StackComponentState$padding$2(this));
        this.margin$delegate = U1.c(new StackComponentState$margin$2(this));
        this.size$delegate = U1.c(new StackComponentState$size$2(this));
        this.shape$delegate = U1.c(new StackComponentState$shape$2(this));
        this.border$delegate = U1.c(new StackComponentState$border$2(this));
        this.shadow$delegate = U1.c(new StackComponentState$shadow$2(this));
        this.badge$delegate = U1.c(new StackComponentState$badge$2(this));
        this.scrollOrientation$delegate = U1.c(new StackComponentState$scrollOrientation$2(this));
    }

    public static final /* synthetic */ Size access$adjustForMargin(StackComponentState stackComponentState, Size size, L l, t tVar) {
        return stackComponentState.adjustForMargin(size, l, tVar);
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(StackComponentState stackComponentState) {
        return stackComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ t access$getLayoutDirection(StackComponentState stackComponentState) {
        return stackComponentState.getLayoutDirection();
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(StackComponentState stackComponentState) {
        return stackComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ PresentedStackPartial access$getPresentedPartial(StackComponentState stackComponentState) {
        return stackComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(StackComponentState stackComponentState) {
        return stackComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ StackComponentStyle access$getStyle$p(StackComponentState stackComponentState) {
        return stackComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(StackComponentState stackComponentState) {
        return stackComponentState.getWindowSize();
    }

    private final Size adjustForMargin(Size size, L l, t tVar) {
        SizeConstraint width = size.getWidth();
        if (width instanceof SizeConstraint.Fixed) {
            width = new SizeConstraint.Fixed(A.b(A.b(((SizeConstraint.Fixed) width).getValue-pVg5ArA() + K.a(f.g(l, tVar))) + K.a(f.f(l, tVar))), (k) null);
        } else {
            if (!(width instanceof SizeConstraint.Fill ? true : width instanceof SizeConstraint.Fit)) {
                throw new o();
            }
        }
        SizeConstraint height = size.getHeight();
        if (height instanceof SizeConstraint.Fixed) {
            height = new SizeConstraint.Fixed(A.b(A.b(((SizeConstraint.Fixed) height).getValue-pVg5ArA() + K.a(l.d())) + K.a(l.a())), (k) null);
        } else {
            if (!(height instanceof SizeConstraint.Fill ? true : height instanceof SizeConstraint.Fit)) {
                throw new o();
            }
        }
        return new Size(width, height);
    }

    private final t getLayoutDirection() {
        return (t) this.layoutDirection$delegate.getValue();
    }

    private final PresentedStackPartial getPresentedPartial() {
        return (PresentedStackPartial) this.presentedPartial$delegate.getValue();
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

    public static /* synthetic */ void update$default(StackComponentState stackComponentState, c cVar, t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            tVar = null;
        }
        stackComponentState.update(cVar, tVar);
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
        return (BackgroundStyles) this.background$delegate.getValue();
    }

    public final /* synthetic */ BadgeStyle getBadge() {
        return (BadgeStyle) this.badge$delegate.getValue();
    }

    public final /* synthetic */ BorderStyles getBorder() {
        return (BorderStyles) this.border$delegate.getValue();
    }

    public final /* synthetic */ List getChildren() {
        return this.children;
    }

    public final /* synthetic */ Dimension getDimension() {
        return (Dimension) this.dimension$delegate.getValue();
    }

    public final /* synthetic */ L getMargin() {
        return (L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ L getPadding() {
        return (L) this.padding$delegate.getValue();
    }

    public final /* synthetic */ q getScrollOrientation() {
        return (q) this.scrollOrientation$delegate.getValue();
    }

    public final /* synthetic */ ShadowStyles getShadow() {
        return (ShadowStyles) this.shadow$delegate.getValue();
    }

    public final /* synthetic */ Shape getShape() {
        return (Shape) this.shape$delegate.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size$delegate.getValue();
    }

    public final /* synthetic */ float getSpacing-D9Ej5fM() {
        return ((h) this.spacing$delegate.getValue()).m();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar, t tVar) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
        if (tVar != null) {
            setLayoutDirection(tVar);
        }
    }

    public /* synthetic */ StackComponentState(c cVar, t tVar, StackComponentStyle stackComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, int i, k kVar) {
        this(cVar, tVar, stackComponentStyle, aVar, aVar2, aVar3, (i & 64) != 0 ? 1.INSTANCE : aVar4);
    }
}
