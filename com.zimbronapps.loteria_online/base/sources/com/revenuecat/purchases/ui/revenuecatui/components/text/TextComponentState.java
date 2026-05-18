package com.revenuecat.purchases.ui.revenuecatui.components.text;

import Da.S;
import Qa.a;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.common.LocaleId;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.ui.revenuecatui.components.LocalizedTextPartial;
import com.revenuecat.purchases.ui.revenuecatui.components.countdown.CountdownTime;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyles;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.FontSpec;
import com.revenuecat.purchases.ui.revenuecatui.components.state.PackageAwareDelegate;
import com.revenuecat.purchases.ui.revenuecatui.components.style.TextComponentStyle;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMap;
import d1.L;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import l1.j;
import o0.e;
import x4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TextComponentState {
    public static final int $stable = 0;
    private final h2 applicablePackage$delegate;
    private final h2 backgroundColor$delegate;
    private final h2 color$delegate;
    private final C0 countdownTime$delegate;
    private final a customVariablesProvider;
    private final h2 fontFamily$delegate;
    private final h2 fontSize$delegate;
    private final h2 fontSpec$delegate;
    private final h2 fontWeight$delegate;
    private final h2 horizontalAlignment$delegate;
    private final h2 localeId$delegate;
    private final a localeProvider;
    private final h2 localizedVariableKeys$delegate;
    private final h2 margin$delegate;
    private final PackageAwareDelegate packageAwareDelegate;
    private final h2 padding$delegate;
    private final h2 presentedPartial$delegate;
    private final a selectedOfferEligibilityProvider;
    private final a selectedPackageInfoProvider;
    private final a selectedTabIndexProvider;
    private final h2 size$delegate;
    private final TextComponentStyle style;
    private final h2 subscriptionOption$delegate;
    private final h2 text$delegate;
    private final h2 textAlign$delegate;
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

    public TextComponentState(c initialWindowSize, TextComponentStyle style, a localeProvider, a selectedPackageInfoProvider, a selectedTabIndexProvider, a selectedOfferEligibilityProvider, a customVariablesProvider) {
        t.g(initialWindowSize, "initialWindowSize");
        t.g(style, "style");
        t.g(localeProvider, "localeProvider");
        t.g(selectedPackageInfoProvider, "selectedPackageInfoProvider");
        t.g(selectedTabIndexProvider, "selectedTabIndexProvider");
        t.g(selectedOfferEligibilityProvider, "selectedOfferEligibilityProvider");
        t.g(customVariablesProvider, "customVariablesProvider");
        this.style = style;
        this.localeProvider = localeProvider;
        this.selectedPackageInfoProvider = selectedPackageInfoProvider;
        this.selectedTabIndexProvider = selectedTabIndexProvider;
        this.selectedOfferEligibilityProvider = selectedOfferEligibilityProvider;
        this.customVariablesProvider = customVariablesProvider;
        this.windowSize$delegate = U1.i(initialWindowSize, (T1) null, 2, (Object) null);
        this.packageAwareDelegate = new PackageAwareDelegate(style, selectedPackageInfoProvider, selectedTabIndexProvider, selectedOfferEligibilityProvider);
        this.countdownTime$delegate = U1.i((Object) null, (T1) null, 2, (Object) null);
        this.localeId$delegate = U1.c(new TextComponentState$localeId$2(this));
        this.applicablePackage$delegate = U1.c(new TextComponentState$applicablePackage$2(this));
        this.subscriptionOption$delegate = U1.c(new TextComponentState$subscriptionOption$2(this));
        this.presentedPartial$delegate = U1.c(new TextComponentState$presentedPartial$2(this));
        this.visible$delegate = U1.c(new TextComponentState$visible$2(this));
        this.text$delegate = U1.c(new TextComponentState$text$2(this));
        this.localizedVariableKeys$delegate = U1.c(new TextComponentState$localizedVariableKeys$2(this));
        this.color$delegate = U1.c(new TextComponentState$color$2(this));
        this.fontSize$delegate = U1.c(new TextComponentState$fontSize$2(this));
        this.fontWeight$delegate = U1.c(new TextComponentState$fontWeight$2(this));
        this.fontSpec$delegate = U1.c(new TextComponentState$fontSpec$2(this));
        this.fontFamily$delegate = U1.c(new TextComponentState$fontFamily$2(this));
        this.textAlign$delegate = U1.c(new TextComponentState$textAlign$2(this));
        this.horizontalAlignment$delegate = U1.c(new TextComponentState$horizontalAlignment$2(this));
        this.backgroundColor$delegate = U1.c(new TextComponentState$backgroundColor$2(this));
        this.size$delegate = U1.c(new TextComponentState$size$2(this));
        this.padding$delegate = U1.c(new TextComponentState$padding$2(this));
        this.margin$delegate = U1.c(new TextComponentState$margin$2(this));
    }

    public static final /* synthetic */ a access$getCustomVariablesProvider$p(TextComponentState textComponentState) {
        return textComponentState.customVariablesProvider;
    }

    public static final /* synthetic */ FontSpec access$getFontSpec(TextComponentState textComponentState) {
        return textComponentState.getFontSpec();
    }

    public static final /* synthetic */ String access$getLocaleId-uqtKvyA(TextComponentState textComponentState) {
        return textComponentState.getLocaleId-uqtKvyA();
    }

    public static final /* synthetic */ a access$getLocaleProvider$p(TextComponentState textComponentState) {
        return textComponentState.localeProvider;
    }

    public static final /* synthetic */ PackageAwareDelegate access$getPackageAwareDelegate$p(TextComponentState textComponentState) {
        return textComponentState.packageAwareDelegate;
    }

    public static final /* synthetic */ LocalizedTextPartial access$getPresentedPartial(TextComponentState textComponentState) {
        return textComponentState.getPresentedPartial();
    }

    public static final /* synthetic */ a access$getSelectedPackageInfoProvider$p(TextComponentState textComponentState) {
        return textComponentState.selectedPackageInfoProvider;
    }

    public static final /* synthetic */ TextComponentStyle access$getStyle$p(TextComponentState textComponentState) {
        return textComponentState.style;
    }

    public static final /* synthetic */ c access$getWindowSize(TextComponentState textComponentState) {
        return textComponentState.getWindowSize();
    }

    private final FontSpec getFontSpec() {
        return (FontSpec) this.fontSpec$delegate.getValue();
    }

    private final String getLocaleId-uqtKvyA() {
        return ((LocaleId) this.localeId$delegate.getValue()).unbox-impl();
    }

    private final LocalizedTextPartial getPresentedPartial() {
        return (LocalizedTextPartial) this.presentedPartial$delegate.getValue();
    }

    private final c getWindowSize() {
        return (c) this.windowSize$delegate.getValue();
    }

    private final void setCountdownTime(CountdownTime countdownTime) {
        this.countdownTime$delegate.setValue(countdownTime);
    }

    private final void setWindowSize(c cVar) {
        this.windowSize$delegate.setValue(cVar);
    }

    public static /* synthetic */ void update$default(TextComponentState textComponentState, c cVar, CountdownTime countdownTime, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        if ((i & 2) != 0) {
            countdownTime = textComponentState.getCountdownTime();
        }
        textComponentState.update(cVar, countdownTime);
    }

    public final Package getApplicablePackage() {
        return (Package) this.applicablePackage$delegate.getValue();
    }

    public final /* synthetic */ ColorStyles getBackgroundColor() {
        return (ColorStyles) this.backgroundColor$delegate.getValue();
    }

    public final /* synthetic */ ColorStyles getColor() {
        return (ColorStyles) this.color$delegate.getValue();
    }

    public final /* synthetic */ CountdownComponent.CountFrom getCountFrom() {
        return this.style.getCountFrom();
    }

    public final CountdownTime getCountdownTime() {
        return (CountdownTime) this.countdownTime$delegate.getValue();
    }

    public final /* synthetic */ d1.u getFontFamily() {
        return (d1.u) this.fontFamily$delegate.getValue();
    }

    public final /* synthetic */ int getFontSize() {
        return ((Number) this.fontSize$delegate.getValue()).intValue();
    }

    public final /* synthetic */ L getFontWeight() {
        return (L) this.fontWeight$delegate.getValue();
    }

    public final /* synthetic */ e.b getHorizontalAlignment() {
        return (e.b) this.horizontalAlignment$delegate.getValue();
    }

    public final /* synthetic */ NonEmptyMap getLocalizedVariableKeys() {
        return (NonEmptyMap) this.localizedVariableKeys$delegate.getValue();
    }

    public final /* synthetic */ F.L getMargin() {
        return (F.L) this.margin$delegate.getValue();
    }

    public final /* synthetic */ F.L getPadding() {
        return (F.L) this.padding$delegate.getValue();
    }

    public final /* synthetic */ Size getSize() {
        return (Size) this.size$delegate.getValue();
    }

    public final SubscriptionOption getSubscriptionOption() {
        return (SubscriptionOption) this.subscriptionOption$delegate.getValue();
    }

    public final /* synthetic */ String getText() {
        return (String) this.text$delegate.getValue();
    }

    public final /* synthetic */ j getTextAlign-buA522U() {
        return (j) this.textAlign$delegate.getValue();
    }

    public final /* synthetic */ boolean getVisible() {
        return ((Boolean) this.visible$delegate.getValue()).booleanValue();
    }

    public final /* synthetic */ void update(c cVar, CountdownTime countdownTime) {
        if (cVar != null) {
            setWindowSize(cVar);
        }
        setCountdownTime(countdownTime);
    }

    public /* synthetic */ TextComponentState(c cVar, TextComponentStyle textComponentStyle, a aVar, a aVar2, a aVar3, a aVar4, a aVar5, int i, k kVar) {
        this(cVar, textComponentStyle, aVar, aVar2, aVar3, aVar4, (i & 64) != 0 ? 1.INSTANCE : aVar5);
    }
}
