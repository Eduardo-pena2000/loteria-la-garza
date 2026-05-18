package com.revenuecat.purchases.ui.revenuecatui.data;

import Ca.I;
import Ca.o;
import Ca.q;
import Ca.t;
import Ca.x;
import Da.D;
import Da.Q;
import Da.S;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import P1.j;
import Qa.a;
import Qa.l;
import Qa.p;
import android.app.Activity;
import android.os.LocaleList;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import cb.O;
import cb.i;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.common.ExitOffer;
import com.revenuecat.purchases.paywalls.components.common.ExitOffers;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.paywalls.events.PaywallEventType;
import com.revenuecat.purchases.ui.revenuecatui.CustomVariableValue;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallModeKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyList;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import com.revenuecat.purchases.ui.revenuecatui.utils.URIExtensionsKt;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallViewModelImpl extends V implements PaywallViewModel {
    public static final int $stable = 0;
    private final C0 _actionError;
    private final C0 _actionInProgress;
    private final z _colorScheme;
    private final z _lastLocaleList;
    private final C0 _preloadedExitOffering;
    private final C0 _purchaseCompleted;
    private final z _state;
    private boolean isDarkMode;
    private PaywallOptions options;
    private PaywallEvent.Data paywallPresentationData;
    private final ProductChangeCalculator productChangeCalculator;
    private final PurchasesType purchases;
    private final ResourceProvider resourceProvider;
    private final l shouldDisplayBlock;
    private final VariableDataProvider variableDataProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PurchasesAreCompletedBy.values().length];
            try {
                iArr[PurchasesAreCompletedBy.MY_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PurchasesAreCompletedBy.REVENUECAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 2 extends u implements a {
        public static final 2 INSTANCE = new 2();

        public 2() {
            super(0);
        }

        public final Date invoke() {
            return new Date();
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {410, 426}, m = "handlePackagePurchase")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.this.handlePackagePurchase(null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {343, 344, 346, 377}, m = "handleRestorePurchases")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.this.handleRestorePurchases(this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl", f = "PaywallViewModel.kt", l = {461, 476, 495, 498, 542}, m = "performPurchase")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PaywallViewModelImpl.access$performPurchase(PaywallViewModelImpl.this, null, null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$preloadExitOffering$1", f = "PaywallViewModel.kt", l = {229}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        Object L$0;
        Object L$1;
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Offering offering;
            String offeringId;
            C0 access$get_preloadedExitOffering$p;
            C0 c0;
            Offering.PaywallComponents paywallComponents;
            PaywallComponentsData data;
            ExitOffers exitOffers;
            ExitOffer dismiss;
            Object f = c.f();
            int i = this.label;
            try {
            } catch (PurchasesException e) {
                Logger.INSTANCE.e("Failed to preload exit offering", e);
            }
            if (i == 0) {
                t.b(obj);
                PaywallState paywallState = (PaywallState) PaywallViewModelImpl.access$get_state$p(PaywallViewModelImpl.this).getValue();
                offering = null;
                Offering offering2 = paywallState instanceof PaywallState.Loaded.Legacy ? ((PaywallState.Loaded.Legacy) paywallState).getOffering() : paywallState instanceof PaywallState.Loaded.Components ? ((PaywallState.Loaded.Components) paywallState).getOffering() : null;
                offeringId = (offering2 == null || (paywallComponents = offering2.getPaywallComponents()) == null || (data = paywallComponents.getData()) == null || (exitOffers = data.getExitOffers()) == null || (dismiss = exitOffers.getDismiss()) == null) ? null : dismiss.getOfferingId();
                access$get_preloadedExitOffering$p = PaywallViewModelImpl.access$get_preloadedExitOffering$p(PaywallViewModelImpl.this);
                if (offeringId != null) {
                    PurchasesType access$getPurchases$p = PaywallViewModelImpl.access$getPurchases$p(PaywallViewModelImpl.this);
                    this.L$0 = offeringId;
                    this.L$1 = access$get_preloadedExitOffering$p;
                    this.label = 1;
                    Object awaitOfferings = access$getPurchases$p.awaitOfferings(this);
                    if (awaitOfferings == f) {
                        return f;
                    }
                    c0 = access$get_preloadedExitOffering$p;
                    obj = awaitOfferings;
                }
                access$get_preloadedExitOffering$p.setValue(offering);
                return I.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0 = (C0) this.L$1;
            offeringId = (String) this.L$0;
            t.b(obj);
            offering = ((Offerings) obj).get(offeringId);
            if (offering == null) {
                Logger.INSTANCE.e("Exit offering with ID '" + offeringId + "' not found in available offerings. Exit offer will not be displayed.");
            }
            access$get_preloadedExitOffering$p = c0;
            access$get_preloadedExitOffering$p.setValue(offering);
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$purchaseSelectedPackage$1", f = "PaywallViewModel.kt", l = {289}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Activity activity, e eVar) {
            super(2, eVar);
            this.$activity = activity;
        }

        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new 1(this.$activity, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                PaywallViewModelImpl paywallViewModelImpl = PaywallViewModelImpl.this;
                Activity activity = this.$activity;
                this.label = 1;
                if (PaywallViewModel.DefaultImpls.handlePackagePurchase$default(paywallViewModelImpl, activity, null, null, this, 4, null) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$restorePurchases$1", f = "PaywallViewModel.kt", l = {295}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                PaywallViewModelImpl paywallViewModelImpl = PaywallViewModelImpl.this;
                this.label = 1;
                if (paywallViewModelImpl.handleRestorePurchases(this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$updateState$1", f = "PaywallViewModel.kt", l = {580, 588}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        Object L$0;
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return PaywallViewModelImpl.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[Catch: PurchasesException -> 0x0013, TryCatch #0 {PurchasesException -> 0x0013, blocks: (B:6:0x000e, B:7:0x0092, B:9:0x009a, B:13:0x00ab, B:17:0x0022, B:18:0x0055, B:20:0x006a, B:23:0x0074, B:30:0x0029, B:32:0x0037, B:33:0x003e, B:35:0x0042, B:39:0x007f, B:41:0x0083, B:44:0x00d9, B:45:0x00de), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                Method dump skipped, instructions count: 281
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.updateState.1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchasesType, PaywallOptions paywallOptions, X.l lVar, boolean z, l lVar2, boolean z2, ProductChangeCalculator productChangeCalculator, int i, k kVar) {
        PurchasesType purchasesImpl = (i & 2) != 0 ? new PurchasesImpl(null, 1, null) : purchasesType;
        this(resourceProvider, purchasesImpl, paywallOptions, lVar, z, lVar2, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? new ProductChangeCalculator(purchasesImpl) : productChangeCalculator);
    }

    public static final /* synthetic */ PaywallState access$calculateState(PaywallViewModelImpl paywallViewModelImpl, Offering offering, X.l lVar, String str, PaywallMode paywallMode) {
        return paywallViewModelImpl.calculateState(offering, lVar, str, paywallMode);
    }

    public static final /* synthetic */ PaywallOptions access$getOptions$p(PaywallViewModelImpl paywallViewModelImpl) {
        return paywallViewModelImpl.options;
    }

    public static final /* synthetic */ PurchasesType access$getPurchases$p(PaywallViewModelImpl paywallViewModelImpl) {
        return paywallViewModelImpl.purchases;
    }

    public static final /* synthetic */ z access$get_colorScheme$p(PaywallViewModelImpl paywallViewModelImpl) {
        return paywallViewModelImpl._colorScheme;
    }

    public static final /* synthetic */ C0 access$get_preloadedExitOffering$p(PaywallViewModelImpl paywallViewModelImpl) {
        return paywallViewModelImpl._preloadedExitOffering;
    }

    public static final /* synthetic */ z access$get_state$p(PaywallViewModelImpl paywallViewModelImpl) {
        return paywallViewModelImpl._state;
    }

    public static final /* synthetic */ Object access$performPurchase(PaywallViewModelImpl paywallViewModelImpl, Activity activity, Package r2, ProductChangeConfig productChangeConfig, SubscriptionOption subscriptionOption, e eVar) {
        return paywallViewModelImpl.performPurchase(activity, r2, productChangeConfig, subscriptionOption, eVar);
    }

    public static final /* synthetic */ Object access$performPurchaseIfNecessary(PaywallViewModelImpl paywallViewModelImpl, Activity activity, PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, ProductChangeConfig productChangeConfig, e eVar) {
        return paywallViewModelImpl.performPurchaseIfNecessary(activity, selectedPackageInfo, productChangeConfig, eVar);
    }

    private final PaywallState calculateState(Offering offering, X.l lVar, String str, PaywallMode paywallMode) {
        if (offering.getAvailablePackages().isEmpty()) {
            return new PaywallState.Error("No packages available");
        }
        PaywallValidationResult validatedPaywall = OfferingToStateMapperKt.validatedPaywall(offering, lVar, getResourceProvider());
        if ((validatedPaywall instanceof PaywallValidationResult.Components) && !PaywallModeKt.isFullScreen(paywallMode)) {
            validatedPaywall = OfferingToStateMapperKt.fallbackPaywall(offering, lVar, getResourceProvider(), PaywallValidationError.InvalidModeForComponentsPaywall.INSTANCE);
        }
        NonEmptyList errors = validatedPaywall.getErrors();
        if (errors != null) {
            Iterator it = errors.iterator();
            while (it.hasNext()) {
                Logger.INSTANCE.e(((PaywallValidationError) it.next()).associatedErrorString(offering));
            }
            Logger.INSTANCE.e("Displaying default template due to validation errors.");
        }
        if (validatedPaywall instanceof PaywallValidationResult.Legacy) {
            PaywallValidationResult.Legacy legacy = (PaywallValidationResult.Legacy) validatedPaywall;
            return OfferingToStateMapperKt.toLegacyPaywallState(offering, this.variableDataProvider, paywallMode, legacy.getDisplayablePaywall(), legacy.getTemplate(), this.options.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(), str, legacy.getWarning());
        }
        if (validatedPaywall instanceof PaywallValidationResult.Components) {
            return OfferingToStateMapperKt.toComponentsPaywallState(offering, (PaywallValidationResult.Components) validatedPaywall, str, 2.INSTANCE, this.purchases, this.options.getCustomVariables(), extractDefaultCustomVariables(offering));
        }
        throw new o();
    }

    private final PaywallEvent.Data createEventData() {
        PaywallState paywallState = (PaywallState) getState().getValue();
        if (paywallState instanceof PaywallState.Loaded.Legacy) {
            return createEventData((PaywallState.Loaded.Legacy) paywallState);
        }
        if (paywallState instanceof PaywallState.Loaded.Components) {
            return createEventData((PaywallState.Loaded.Components) paywallState);
        }
        if (!(paywallState instanceof PaywallState.Error ? true : paywallState instanceof PaywallState.Loading)) {
            throw new o();
        }
        Logger.INSTANCE.e("Unexpected state trying to create event data: " + paywallState);
        return null;
    }

    private final Map extractDefaultCustomVariables(Offering offering) {
        UiConfig uiConfig;
        Map customVariables;
        Offering.PaywallComponents paywallComponents = offering.getPaywallComponents();
        if (paywallComponents == null || (uiConfig = paywallComponents.getUiConfig()) == null || (customVariables = uiConfig.getCustomVariables()) == null) {
            return S.h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Q.e(customVariables.size()));
        for (Map.Entry entry : customVariables.entrySet()) {
            linkedHashMap.put(entry.getKey(), CustomVariableValue.Companion.from(((UiConfig.CustomVariableDefinition) entry.getValue()).getDefaultValue()));
        }
        return linkedHashMap;
    }

    private final void finishAction() {
        this._actionInProgress.setValue(Boolean.FALSE);
    }

    private final j getCurrentLocaleList() {
        String preferredUILocaleOverride = this.purchases.getPreferredUILocaleOverride();
        if (preferredUILocaleOverride == null) {
            j d = j.d();
            kotlin.jvm.internal.t.f(d, "getDefault()");
            return d;
        }
        try {
            j a = j.a(new Locale[]{LocaleHelpersKt.createLocaleFromString(preferredUILocaleOverride)});
            kotlin.jvm.internal.t.f(a, "create(locale)");
            return a;
        } catch (IllegalArgumentException e) {
            Logger.INSTANCE.e("Invalid preferred locale format: " + preferredUILocaleOverride + ". Using system default.", e);
            j d2 = j.d();
            kotlin.jvm.internal.t.f(d2, "{\n            Logger.e(\"…at.getDefault()\n        }");
            return d2;
        }
    }

    private final PaywallListener getListener() {
        return this.options.getListener();
    }

    private final PaywallMode getMode() {
        return this.options.getMode$revenuecatui_defaultsBc8Release();
    }

    private final PresentedOfferingContext getPresentedOfferingContext(Offering offering) {
        PresentedOfferingContext presentedOfferingContext;
        Package r0 = (Package) D.h0(offering.getAvailablePackages());
        return (r0 == null || (presentedOfferingContext = r0.getPresentedOfferingContext()) == null) ? new PresentedOfferingContext(offering.getIdentifier()) : presentedOfferingContext;
    }

    private final PaywallPurchaseLogic getPurchaseLogic() {
        return this.options.getPurchaseLogic();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01fe A[Catch: PurchasesException -> 0x0049, TryCatch #3 {PurchasesException -> 0x0049, blocks: (B:15:0x0044, B:16:0x01ed, B:18:0x01fe, B:19:0x0209, B:27:0x005e, B:28:0x0261), top: B:7:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x024f A[Catch: PurchasesException -> 0x0138, TRY_LEAVE, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:33:0x0249, B:35:0x024f, B:39:0x027a, B:41:0x027e, B:42:0x0282, B:44:0x0286, B:46:0x028e, B:64:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:78:0x01a1, B:79:0x01d6, B:83:0x019a, B:84:0x021a, B:87:0x0222, B:88:0x0231, B:92:0x0297, B:93:0x029e), top: B:63:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027a A[Catch: PurchasesException -> 0x0138, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:33:0x0249, B:35:0x024f, B:39:0x027a, B:41:0x027e, B:42:0x0282, B:44:0x0286, B:46:0x028e, B:64:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:78:0x01a1, B:79:0x01d6, B:83:0x019a, B:84:0x021a, B:87:0x0222, B:88:0x0231, B:92:0x0297, B:93:0x029e), top: B:63:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021a A[Catch: PurchasesException -> 0x0138, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x0138, blocks: (B:33:0x0249, B:35:0x024f, B:39:0x027a, B:41:0x027e, B:42:0x0282, B:44:0x0286, B:46:0x028e, B:64:0x0135, B:65:0x0144, B:68:0x0156, B:69:0x0174, B:71:0x017a, B:72:0x017d, B:74:0x0183, B:76:0x018c, B:78:0x01a1, B:79:0x01d6, B:83:0x019a, B:84:0x021a, B:87:0x0222, B:88:0x0231, B:92:0x0297, B:93:0x029e), top: B:63:0x0135 }] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [Ga.e, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$performPurchase$1] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object performPurchase(android.app.Activity r18, com.revenuecat.purchases.Package r19, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig r20, com.revenuecat.purchases.models.SubscriptionOption r21, Ga.e r22) {
        /*
            Method dump skipped, instructions count: 730
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.performPurchase(android.app.Activity, com.revenuecat.purchases.Package, com.revenuecat.purchases.paywalls.components.common.ProductChangeConfig, com.revenuecat.purchases.models.SubscriptionOption, Ga.e):java.lang.Object");
    }

    public static /* synthetic */ Object performPurchase$default(PaywallViewModelImpl paywallViewModelImpl, Activity activity, Package r8, ProductChangeConfig productChangeConfig, SubscriptionOption subscriptionOption, e eVar, int i, Object obj) {
        if ((i & 4) != 0) {
            productChangeConfig = null;
        }
        return paywallViewModelImpl.performPurchase(activity, r8, productChangeConfig, subscriptionOption, eVar);
    }

    private final Object performPurchaseIfNecessary(Activity activity, PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo, ProductChangeConfig productChangeConfig, e eVar) {
        if (selectedPackageInfo == null) {
            Logger.INSTANCE.w("Ignoring purchase request as no package is selected");
            return I.a;
        }
        Package rcPackage = selectedPackageInfo.getRcPackage();
        ResolvedOffer resolvedOffer = selectedPackageInfo.getResolvedOffer();
        Object performPurchase = performPurchase(activity, rcPackage, productChangeConfig, resolvedOffer != null ? resolvedOffer.getSubscriptionOption() : null, eVar);
        return performPurchase == c.f() ? performPurchase : I.a;
    }

    private final LocaleList toFrameworkLocaleList(j jVar) {
        int g = jVar.g();
        Locale[] localeArr = new Locale[g];
        for (int i = 0; i < g; i++) {
            Locale c = jVar.c(i);
            kotlin.jvm.internal.t.d(c);
            localeArr[i] = c;
        }
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, g));
    }

    private final void track(PaywallEventType paywallEventType) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data != null) {
            UUID randomUUID = UUID.randomUUID();
            kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
            this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(randomUUID, new Date()), data, paywallEventType));
            return;
        }
        Logger.INSTANCE.e("Paywall event data is null, not tracking event " + paywallEventType);
    }

    private final void trackPaywallCancel() {
        track(PaywallEventType.CANCEL);
    }

    private final void trackPaywallClose() {
        if (this.paywallPresentationData != null) {
            track(PaywallEventType.CLOSE);
        }
    }

    private final void trackPaywallPurchaseError(Package r18, PurchasesError purchasesError) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking purchase error event");
            return;
        }
        GoogleStoreProduct product = r18.getProduct();
        PaywallEvent.Data copy$default = PaywallEvent.Data.copy$default(data, (String) null, (PresentedOfferingContext) null, 0, (UUID) null, (String) null, (String) null, false, (ExitOfferType) null, (String) null, r18.getIdentifier(), product instanceof GoogleStoreProduct ? product.getProductId() : product.getId(), Integer.valueOf(purchasesError.getCode().getCode()), purchasesError.getMessage(), 511, (Object) null);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(randomUUID, new Date()), copy$default, PaywallEventType.PURCHASE_ERROR));
    }

    private final void trackPaywallPurchaseInitiated(Package r18) {
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking purchase initiated event");
            return;
        }
        GoogleStoreProduct product = r18.getProduct();
        PaywallEvent.Data copy$default = PaywallEvent.Data.copy$default(data, (String) null, (PresentedOfferingContext) null, 0, (UUID) null, (String) null, (String) null, false, (ExitOfferType) null, (String) null, r18.getIdentifier(), product instanceof GoogleStoreProduct ? product.getProductId() : product.getId(), (Integer) null, (String) null, 6655, (Object) null);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(randomUUID, new Date()), copy$default, PaywallEventType.PURCHASE_INITIATED));
    }

    private final void updateState() {
        i.d(W.a(this), null, null, new 1(null), 3, null);
    }

    private final void validateState() {
        if (this.purchases.getPurchasesAreCompletedBy() == PurchasesAreCompletedBy.MY_APP && this.options.getPurchaseLogic() == null) {
            this._state.setValue(new PaywallState.Error("myAppPurchaseLogic is null, but is required when purchases.purchasesAreCompletedBy is .MY_APP. App purchases will not be successful."));
        }
    }

    private final boolean verifyNoActionInProgressOrStartAction() {
        if (((Boolean) this._actionInProgress.getValue()).booleanValue()) {
            Logger.INSTANCE.d("Ignoring purchase or restore because there already is an action in progress");
            return true;
        }
        this._actionInProgress.setValue(Boolean.TRUE);
        return false;
    }

    public void clearActionError() {
        this._actionError.setValue((Object) null);
    }

    public void closePaywall(PaywallResult paywallResult) {
        Logger.INSTANCE.d("Paywalls: Close paywall initiated");
        trackPaywallClose();
        Offering offering = !((Boolean) this._purchaseCompleted.getValue()).booleanValue() ? (Offering) this._preloadedExitOffering.getValue() : null;
        if (offering != null) {
            trackExitOffer(ExitOfferType.DISMISS, offering.getIdentifier());
        }
        this.paywallPresentationData = null;
        p dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release = this.options.getDismissRequestWithExitOffering$revenuecatui_defaultsBc8Release();
        if (dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release != null) {
            dismissRequestWithExitOffering$revenuecatui_defaultsBc8Release.invoke(offering, paywallResult);
        } else {
            this.options.getDismissRequest().invoke();
        }
    }

    public h2 getActionError() {
        return this._actionError;
    }

    public h2 getActionInProgress() {
        return this._actionInProgress;
    }

    public h2 getPreloadedExitOffering() {
        return this._preloadedExitOffering;
    }

    public h2 getPurchaseCompleted() {
        return this._purchaseCompleted;
    }

    public ResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public N getState() {
        return g.b(this._state);
    }

    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        q a;
        URL webCheckoutURL;
        String url;
        kotlin.jvm.internal.t.g(launchWebCheckout, "launchWebCheckout");
        String customUrl = launchWebCheckout.getCustomUrl();
        Object value = getState().getValue();
        PaywallState.Loaded.Components components = value instanceof PaywallState.Loaded.Components ? (PaywallState.Loaded.Components) value : null;
        if (components == null) {
            Logger.INSTANCE.e("Web checkout URL can only be constructed for loaded Components paywalls");
            return null;
        }
        PaywallAction.External.LaunchWebCheckout.PackageParamBehavior packageParamBehavior = launchWebCheckout.getPackageParamBehavior();
        if (packageParamBehavior instanceof PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append) {
            PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append append = (PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.Append) packageParamBehavior;
            Package rcPackage = append.getRcPackage();
            if (rcPackage == null) {
                PaywallState.Loaded.Components.SelectedPackageInfo selectedPackageInfo = components.getSelectedPackageInfo();
                rcPackage = selectedPackageInfo != null ? selectedPackageInfo.getRcPackage() : null;
            }
            a = x.a(rcPackage, append.getPackageParam());
        } else {
            if (!(packageParamBehavior instanceof PaywallAction.External.LaunchWebCheckout.PackageParamBehavior.DoNotAppend)) {
                throw new o();
            }
            a = x.a(null, null);
        }
        Package r2 = (Package) a.a();
        String str = (String) a.b();
        if (customUrl == null) {
            return (r2 == null || (webCheckoutURL = r2.getWebCheckoutURL()) == null || (url = webCheckoutURL.toString()) == null) ? String.valueOf(components.getOffering().getWebCheckoutURL()) : url;
        }
        try {
            URI uri = new URI(customUrl);
            if (str != null && r2 != null) {
                uri = URIExtensionsKt.appendQueryParameter(uri, str, r2.getIdentifier());
            }
            return uri.toString();
        } catch (URISyntaxException e) {
            Logger.INSTANCE.e("Invalid custom URI: " + customUrl, e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object handlePackagePurchase(android.app.Activity r10, com.revenuecat.purchases.Package r11, com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer r12, Ga.e r13) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.handlePackagePurchase(android.app.Activity, com.revenuecat.purchases.Package, com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8 A[Catch: PurchasesException -> 0x003a, TryCatch #3 {PurchasesException -> 0x003a, blocks: (B:14:0x0035, B:15:0x00da, B:17:0x00f8, B:18:0x00fb, B:20:0x00ff, B:22:0x010b, B:29:0x0049, B:30:0x0158, B:32:0x015e, B:34:0x016a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ff A[Catch: PurchasesException -> 0x003a, TryCatch #3 {PurchasesException -> 0x003a, blocks: (B:14:0x0035, B:15:0x00da, B:17:0x00f8, B:18:0x00fb, B:20:0x00ff, B:22:0x010b, B:29:0x0049, B:30:0x0158, B:32:0x015e, B:34:0x016a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015e A[Catch: PurchasesException -> 0x003a, TryCatch #3 {PurchasesException -> 0x003a, blocks: (B:14:0x0035, B:15:0x00da, B:17:0x00f8, B:18:0x00fb, B:20:0x00ff, B:22:0x010b, B:29:0x0049, B:30:0x0158, B:32:0x015e, B:34:0x016a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014a A[Catch: PurchasesException -> 0x0057, TRY_LEAVE, TryCatch #2 {PurchasesException -> 0x0057, blocks: (B:37:0x0052, B:38:0x0144, B:40:0x014a, B:44:0x0181, B:46:0x0185, B:48:0x0189, B:50:0x0191), top: B:36:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0181 A[Catch: PurchasesException -> 0x0057, TRY_ENTER, TryCatch #2 {PurchasesException -> 0x0057, blocks: (B:37:0x0052, B:38:0x0144, B:40:0x014a, B:44:0x0181, B:46:0x0185, B:48:0x0189, B:50:0x0191), top: B:36:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [Ga.e, com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl$handleRestorePurchases$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object handleRestorePurchases(Ga.e r11) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModelImpl.handleRestorePurchases(Ga.e):java.lang.Object");
    }

    public void invalidateCustomerInfoCache() {
        this.purchases.invalidateVirtualCurrenciesCache();
    }

    public void preloadExitOffering() {
        i.d(W.a(this), null, null, new 1(null), 3, null);
    }

    public void purchaseSelectedPackage(Activity activity) {
        if (activity == null) {
            Logger.INSTANCE.e("Activity is null, not initiating package purchase");
        } else {
            i.d(W.a(this), null, null, new 1(activity, null), 3, null);
        }
    }

    public void refreshStateIfColorsChanged(X.l colorScheme, boolean z) {
        kotlin.jvm.internal.t.g(colorScheme, "colorScheme");
        if (this.isDarkMode != z) {
            this.isDarkMode = z;
        }
        if (kotlin.jvm.internal.t.c(this._colorScheme.getValue(), colorScheme)) {
            return;
        }
        this._colorScheme.setValue(colorScheme);
        updateState();
    }

    public void refreshStateIfLocaleChanged() {
        j currentLocaleList = getCurrentLocaleList();
        if (kotlin.jvm.internal.t.c(this._lastLocaleList.getValue(), currentLocaleList)) {
            return;
        }
        this._lastLocaleList.setValue(currentLocaleList);
        PaywallState paywallState = (PaywallState) this._state.getValue();
        if (paywallState instanceof PaywallState.Loaded.Components) {
            PaywallState.Loaded.Components.update$default((PaywallState.Loaded.Components) paywallState, toFrameworkLocaleList(currentLocaleList), null, null, 6, null);
        } else {
            updateState();
        }
    }

    public void restorePurchases() {
        i.d(W.a(this), null, null, new 1(null), 3, null);
    }

    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        kotlin.jvm.internal.t.g(packageToSelect, "packageToSelect");
        PaywallState paywallState = (PaywallState) this._state.getValue();
        if (paywallState instanceof PaywallState.Loaded.Legacy) {
            ((PaywallState.Loaded.Legacy) paywallState).selectPackage(packageToSelect);
            return;
        }
        Logger.INSTANCE.e("Unexpected state trying to select package: " + paywallState);
    }

    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        kotlin.jvm.internal.t.g(exitOfferType, "exitOfferType");
        kotlin.jvm.internal.t.g(exitOfferingIdentifier, "exitOfferingIdentifier");
        PaywallEvent.Data data = this.paywallPresentationData;
        if (data == null) {
            Logger.INSTANCE.e("Paywall event data is null, not tracking exit offer event");
            return;
        }
        PaywallEvent.Data copy$default = PaywallEvent.Data.copy$default(data, (String) null, (PresentedOfferingContext) null, 0, (UUID) null, (String) null, (String) null, false, exitOfferType, exitOfferingIdentifier, (String) null, (String) null, (Integer) null, (String) null, 7807, (Object) null);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        this.purchases.track(new PaywallEvent(new PaywallEvent.CreationData(randomUUID, new Date()), copy$default, PaywallEventType.EXIT_OFFER));
    }

    public void trackPaywallImpressionIfNeeded() {
        if (this.paywallPresentationData == null) {
            this.paywallPresentationData = createEventData();
            track(PaywallEventType.IMPRESSION);
        }
    }

    public final void updateOptions(PaywallOptions options) {
        kotlin.jvm.internal.t.g(options, "options");
        boolean z = this.options.hashCode() != options.hashCode();
        this.options = options;
        if (z) {
            updateState();
        }
    }

    public PaywallViewModelImpl(ResourceProvider resourceProvider, PurchasesType purchases, PaywallOptions options, X.l colorScheme, boolean z, l lVar, boolean z2, ProductChangeCalculator productChangeCalculator) {
        kotlin.jvm.internal.t.g(resourceProvider, "resourceProvider");
        kotlin.jvm.internal.t.g(purchases, "purchases");
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(colorScheme, "colorScheme");
        kotlin.jvm.internal.t.g(productChangeCalculator, "productChangeCalculator");
        this.resourceProvider = resourceProvider;
        this.purchases = purchases;
        this.options = options;
        this.isDarkMode = z;
        this.shouldDisplayBlock = lVar;
        this.productChangeCalculator = productChangeCalculator;
        this.variableDataProvider = new VariableDataProvider(getResourceProvider(), z2);
        this._state = P.a(PaywallState.Loading.INSTANCE);
        Boolean bool = Boolean.FALSE;
        this._actionInProgress = U1.i(bool, (T1) null, 2, (Object) null);
        this._actionError = U1.i((Object) null, (T1) null, 2, (Object) null);
        this._purchaseCompleted = U1.i(bool, (T1) null, 2, (Object) null);
        this._preloadedExitOffering = U1.i((Object) null, (T1) null, 2, (Object) null);
        this._lastLocaleList = P.a(getCurrentLocaleList());
        this._colorScheme = P.a(colorScheme);
        updateState();
        validateState();
    }

    private final PaywallEvent.Data createEventData(PaywallState.Loaded.Legacy legacy) {
        PaywallComponentsData data;
        int revision;
        String str;
        PaywallComponentsData data2;
        String id;
        Offering offering = legacy.getOffering();
        PaywallData paywall = legacy.getOffering().getPaywall();
        String str2 = null;
        if (paywall != null) {
            revision = paywall.getRevision();
        } else {
            Offering.PaywallComponents paywallComponents = legacy.getOffering().getPaywallComponents();
            if (paywallComponents == null || (data = paywallComponents.getData()) == null) {
                Logger.INSTANCE.e("Null paywall revision trying to create event data");
                return null;
            }
            revision = data.getRevision();
        }
        int i = revision;
        PaywallData paywall2 = legacy.getOffering().getPaywall();
        if (paywall2 == null || (id = paywall2.getId()) == null) {
            Offering.PaywallComponents paywallComponents2 = legacy.getOffering().getPaywallComponents();
            if (paywallComponents2 != null && (data2 = paywallComponents2.getData()) != null) {
                str2 = data2.getId();
            }
            str = str2;
        } else {
            str = id;
        }
        Locale c = ((j) this._lastLocaleList.getValue()).c(0);
        if (c == null) {
            c = Locale.getDefault();
        }
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext(offering);
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        String lowerCase = getMode().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.t.f(lowerCase, "toLowerCase(...)");
        String locale = c.toString();
        kotlin.jvm.internal.t.f(locale, "locale.toString()");
        return new PaywallEvent.Data(str, presentedOfferingContext, i, randomUUID, lowerCase, locale, this.isDarkMode, (ExitOfferType) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 8064, (k) null);
    }

    private final PaywallEvent.Data createEventData(PaywallState.Loaded.Components components) {
        Offering offering = components.getOffering();
        Offering.PaywallComponents paywallComponents = components.getOffering().getPaywallComponents();
        if (paywallComponents == null) {
            Logger.INSTANCE.e("Null paywall revision trying to create event data");
            return null;
        }
        String id = paywallComponents.getData().getId();
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext(offering);
        int revision = paywallComponents.getData().getRevision();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.t.f(randomUUID, "randomUUID()");
        String lowerCase = getMode().name().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.t.f(lowerCase, "toLowerCase(...)");
        return new PaywallEvent.Data(id, presentedOfferingContext, revision, randomUUID, lowerCase, components.getLocale().toString(), this.isDarkMode, (ExitOfferType) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, 8064, (k) null);
    }
}
