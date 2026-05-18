package com.revenuecat.purchases.ui.revenuecatui.activity;

import Ca.I;
import Ca.e;
import Da.D;
import Da.S;
import Qa.l;
import android.app.Activity;
import androidx.fragment.app.p;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.PaywallListener;
import com.revenuecat.purchases.ui.revenuecatui.PaywallPurchaseLogic;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchIfNeededOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityLaunchOptions;
import com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import g.c;
import g.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallActivityLauncher {
    public static final int $stable = 8;
    private final d activityResultLauncher;
    private Integer currentNonSerializableArgsKey;
    private final WeakReference weakActivity;
    private final WeakReference weakFragment;

    public static final class 1 extends u implements l {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z;
            this.$edgeToEdge = z2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z);
            }
            if (z) {
                PaywallActivityLauncher paywallActivityLauncher = this.this$0;
                String str = this.$requiredEntitlementIdentifier;
                Offering offering = this.$offering;
                if (offering != null) {
                    String identifier = offering.getIdentifier();
                    Package r0 = (Package) D.h0(offering.getAvailablePackages());
                    r2 = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r0 != null ? r0.getPresentedOfferingContext() : null);
                }
                PaywallActivityLauncher.access$launchPaywallWithArgs(paywallActivityLauncher, new PaywallActivityArgs(str, (OfferingSelection.IdAndPresentedOfferingContext) r2, this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, 224, (k) null));
            }
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ String $offeringIdentifier;
        final /* synthetic */ PaywallDisplayCallback $paywallDisplayCallback;
        final /* synthetic */ String $requiredEntitlementIdentifier;
        final /* synthetic */ boolean $shouldDisplayDismissButton;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(PaywallDisplayCallback paywallDisplayCallback, PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
            super(1);
            this.$paywallDisplayCallback = paywallDisplayCallback;
            this.this$0 = paywallActivityLauncher;
            this.$requiredEntitlementIdentifier = str;
            this.$offeringIdentifier = str2;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z;
            this.$edgeToEdge = z2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            PaywallDisplayCallback paywallDisplayCallback = this.$paywallDisplayCallback;
            if (paywallDisplayCallback != null) {
                paywallDisplayCallback.onPaywallDisplayResult(z);
            }
            if (z) {
                PaywallActivityLauncher.access$launchPaywallWithArgs(this.this$0, new PaywallActivityArgs(this.$requiredEntitlementIdentifier, new OfferingSelection.IdAndPresentedOfferingContext(this.$offeringIdentifier, null), this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, 224, (k) null));
            }
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ boolean $edgeToEdge;
        final /* synthetic */ ParcelizableFontProvider $fontProvider;
        final /* synthetic */ Offering $offering;
        final /* synthetic */ boolean $shouldDisplayDismissButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
            super(1);
            this.$offering = offering;
            this.$fontProvider = parcelizableFontProvider;
            this.$shouldDisplayDismissButton = z;
            this.$edgeToEdge = z2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext;
            if (z) {
                PaywallActivityLauncher paywallActivityLauncher = PaywallActivityLauncher.this;
                Offering offering = this.$offering;
                if (offering != null) {
                    String identifier = offering.getIdentifier();
                    Package r2 = (Package) D.h0(offering.getAvailablePackages());
                    idAndPresentedOfferingContext = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r2 != null ? r2.getPresentedOfferingContext() : null);
                } else {
                    idAndPresentedOfferingContext = null;
                }
                PaywallActivityLauncher.access$launchPaywallWithArgs(paywallActivityLauncher, new PaywallActivityArgs((String) null, idAndPresentedOfferingContext, this.$fontProvider, this.$shouldDisplayDismissButton, this.$edgeToEdge, false, (Map) null, (Integer) null, 225, (k) null));
            }
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ PaywallActivityLaunchIfNeededOptions $options;
        final /* synthetic */ PaywallActivityLauncher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(PaywallActivityLaunchIfNeededOptions paywallActivityLaunchIfNeededOptions, PaywallActivityLauncher paywallActivityLauncher) {
            super(1);
            this.$options = paywallActivityLaunchIfNeededOptions;
            this.this$0 = paywallActivityLauncher;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return I.a;
        }

        public final void invoke(boolean z) {
            PaywallDisplayCallback paywallDisplayCallback$revenuecatui_defaultsBc8Release = this.$options.getPaywallDisplayCallback$revenuecatui_defaultsBc8Release();
            if (paywallDisplayCallback$revenuecatui_defaultsBc8Release != null) {
                paywallDisplayCallback$revenuecatui_defaultsBc8Release.onPaywallDisplayResult(z);
            }
            if (z) {
                PaywallActivityLauncher.access$launchPaywallWithArgs(this.this$0, new PaywallActivityArgs(this.$options.getRequiredEntitlementIdentifier$revenuecatui_defaultsBc8Release(), this.$options.toOfferingSelection$revenuecatui_defaultsBc8Release(), this.$options.getFontProvider$revenuecatui_defaultsBc8Release(), this.$options.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(), this.$options.getEdgeToEdge$revenuecatui_defaultsBc8Release(), false, this.$options.getCustomVariables$revenuecatui_defaultsBc8Release(), PaywallActivityLauncher.access$storeNonSerializableArgsIfNeeded(this.this$0, this.$options.getPurchaseLogic$revenuecatui_defaultsBc8Release(), this.$options.getListener$revenuecatui_defaultsBc8Release()), 32, (k) null));
            }
        }
    }

    public PaywallActivityLauncher(c resultCaller, PaywallResultHandler resultHandler) {
        t.g(resultCaller, "resultCaller");
        t.g(resultHandler, "resultHandler");
        this.weakActivity = new WeakReference(resultCaller instanceof Activity ? (Activity) resultCaller : null);
        this.weakFragment = new WeakReference(resultCaller instanceof p ? (p) resultCaller : null);
        this.activityResultLauncher = resultCaller.registerForActivityResult(new PaywallContract(), new PaywallActivityLauncher$wrappedHandler$1(this, resultHandler));
    }

    public static final /* synthetic */ Integer access$getCurrentNonSerializableArgsKey$p(PaywallActivityLauncher paywallActivityLauncher) {
        return paywallActivityLauncher.currentNonSerializableArgsKey;
    }

    public static final /* synthetic */ void access$launchPaywallWithArgs(PaywallActivityLauncher paywallActivityLauncher, PaywallActivityArgs paywallActivityArgs) {
        paywallActivityLauncher.launchPaywallWithArgs(paywallActivityArgs);
    }

    public static final /* synthetic */ void access$setCurrentNonSerializableArgsKey$p(PaywallActivityLauncher paywallActivityLauncher, Integer num) {
        paywallActivityLauncher.currentNonSerializableArgsKey = num;
    }

    public static final /* synthetic */ Integer access$storeNonSerializableArgsIfNeeded(PaywallActivityLauncher paywallActivityLauncher, PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener) {
        return paywallActivityLauncher.storeNonSerializableArgsIfNeeded(paywallPurchaseLogic, paywallListener);
    }

    private final boolean isActivityFinishing() {
        androidx.fragment.app.u activity;
        Activity activity2 = (Activity) this.weakActivity.get();
        p pVar = (p) this.weakFragment.get();
        if (activity2 == null) {
            if ((pVar != null ? pVar.getActivity() : null) == null) {
                return true;
            }
        }
        if (activity2 == null || !activity2.isFinishing()) {
            return (pVar == null || (activity = pVar.getActivity()) == null || !activity.isFinishing()) ? false : true;
        }
        return true;
    }

    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            offering = null;
        }
        if ((i & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        if ((i & 16) != 0) {
            map = S.h();
        }
        paywallActivityLauncher.launch(offering, parcelizableFontProvider, z, z2, map);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback, int i, Object obj) {
        paywallActivityLauncher.launchIfNeeded(str, (i & 2) != 0 ? null : offering, (i & 4) != 0 ? null : parcelizableFontProvider, (i & 8) != 0 ? true : z, (i & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z2, (i & 32) == 0 ? paywallDisplayCallback : null);
    }

    public static /* synthetic */ void launchIfNeededWithOfferingId$default(PaywallActivityLauncher paywallActivityLauncher, String str, String str2, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback, int i, Object obj) {
        paywallActivityLauncher.launchIfNeededWithOfferingId(str, str2, presentedOfferingContext, (i & 8) != 0 ? null : parcelizableFontProvider, (i & 16) != 0 ? true : z, (i & 32) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z2, (i & 64) != 0 ? null : paywallDisplayCallback);
    }

    private final void launchPaywallWithArgs(PaywallActivityArgs paywallActivityArgs) {
        if (isActivityFinishing()) {
            Logger.INSTANCE.e("Not displaying paywall because activity/fragment is finishing or has finished.");
        } else {
            this.activityResultLauncher.a(paywallActivityArgs);
        }
    }

    public static /* synthetic */ void launchWithOfferingId$default(PaywallActivityLauncher paywallActivityLauncher, String str, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            parcelizableFontProvider = null;
        }
        ParcelizableFontProvider parcelizableFontProvider2 = parcelizableFontProvider;
        if ((i & 8) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        boolean z4 = z2;
        if ((i & 32) != 0) {
            map = S.h();
        }
        paywallActivityLauncher.launchWithOfferingId(str, presentedOfferingContext, parcelizableFontProvider2, z3, z4, map);
    }

    private final Integer storeNonSerializableArgsIfNeeded(PaywallPurchaseLogic paywallPurchaseLogic, PaywallListener paywallListener) {
        if (paywallPurchaseLogic == null && paywallListener == null) {
            return null;
        }
        int store = PaywallActivityNonSerializableArgsStore.INSTANCE.store(new PaywallActivityNonSerializableArgs(paywallPurchaseLogic, paywallListener));
        this.currentNonSerializableArgsKey = Integer.valueOf(store);
        return Integer.valueOf(store);
    }

    public final void launch() {
        launch$default(this, null, null, false, false, null, 31, null);
    }

    public final void launchIfNeeded(l shouldDisplayBlock) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, null, null, false, false, shouldDisplayBlock, 15, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, null, false, false, null, 120, null);
    }

    public final void launchIfNeededWithOptions(PaywallActivityLaunchIfNeededOptions options) {
        l shouldDisplayBlock$revenuecatui_defaultsBc8Release;
        t.g(options, "options");
        if (options.getRequiredEntitlementIdentifier$revenuecatui_defaultsBc8Release() != null) {
            shouldDisplayBlock$revenuecatui_defaultsBc8Release = HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(options.getRequiredEntitlementIdentifier$revenuecatui_defaultsBc8Release());
        } else {
            shouldDisplayBlock$revenuecatui_defaultsBc8Release = options.getShouldDisplayBlock$revenuecatui_defaultsBc8Release();
            t.d(shouldDisplayBlock$revenuecatui_defaultsBc8Release);
        }
        HelperFunctionsKt.shouldDisplayPaywall(shouldDisplayBlock$revenuecatui_defaultsBc8Release, new 1(options, this));
    }

    @e
    @InternalRevenueCatAPI
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext) {
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, null, false, false, null, 60, null);
    }

    public final void launchWithOptions(PaywallActivityLaunchOptions options) {
        t.g(options, "options");
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, options.toOfferingSelection$revenuecatui_defaultsBc8Release(), options.getFontProvider$revenuecatui_defaultsBc8Release(), options.getShouldDisplayDismissButton$revenuecatui_defaultsBc8Release(), options.getEdgeToEdge$revenuecatui_defaultsBc8Release(), false, options.getCustomVariables$revenuecatui_defaultsBc8Release(), storeNonSerializableArgsIfNeeded(options.getPurchaseLogic$revenuecatui_defaultsBc8Release(), options.getListener$revenuecatui_defaultsBc8Release()), 33, (k) null));
    }

    public final void launch(Offering offering) {
        launch$default(this, offering, null, false, false, null, 30, null);
    }

    public final void launchIfNeeded(Offering offering, l shouldDisplayBlock) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, null, false, false, shouldDisplayBlock, 14, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, false, false, null, 112, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider) {
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, false, false, null, 56, null);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, String str, String str2, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback, int i, Object obj) {
        paywallActivityLauncher.launchIfNeeded(str, str2, (i & 4) != 0 ? null : parcelizableFontProvider, (i & 8) != 0 ? true : z, (i & 16) != 0 ? PaywallActivityArgsKt.getDefaultEdgeToEdge() : z2, (i & 32) != 0 ? null : paywallDisplayCallback);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        launch$default(this, offering, parcelizableFontProvider, false, false, null, 28, null);
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, l shouldDisplayBlock) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, parcelizableFontProvider, false, false, shouldDisplayBlock, 12, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z, false, null, 96, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z) {
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z, false, null, 48, null);
    }

    public static /* synthetic */ void launch$default(PaywallActivityLauncher paywallActivityLauncher, String str, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            parcelizableFontProvider = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        paywallActivityLauncher.launch(str, parcelizableFontProvider, z, z2);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z) {
        launch$default(this, offering, parcelizableFontProvider, z, false, null, 24, null);
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, l shouldDisplayBlock) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        launchIfNeeded$default(this, offering, parcelizableFontProvider, z, false, shouldDisplayBlock, 8, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOfferingId$default(this, requiredEntitlementIdentifier, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z, z2, null, 64, null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchWithOfferingId$default(this, offeringIdentifier, presentedOfferingContext, parcelizableFontProvider, z, z2, null, 32, null);
    }

    public static /* synthetic */ void launchIfNeeded$default(PaywallActivityLauncher paywallActivityLauncher, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, l lVar, int i, Object obj) {
        Offering offering2 = (i & 1) != 0 ? null : offering;
        ParcelizableFontProvider parcelizableFontProvider2 = (i & 2) != 0 ? null : parcelizableFontProvider;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = PaywallActivityArgsKt.getDefaultEdgeToEdge();
        }
        paywallActivityLauncher.launchIfNeeded(offering2, parcelizableFontProvider2, z3, z2, lVar);
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
        launch$default(this, offering, parcelizableFontProvider, z, z2, null, 16, null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, (Offering) null, (ParcelizableFontProvider) null, false, false, (PaywallDisplayCallback) null, 62, (Object) null);
    }

    @e
    @InternalRevenueCatAPI
    public final void launchIfNeededWithOfferingId(String requiredEntitlementIdentifier, String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        launchIfNeededWithOptions(new PaywallActivityLaunchIfNeededOptions.Builder().setRequiredEntitlementIdentifier(requiredEntitlementIdentifier).setOfferingIdentifier(offeringIdentifier, presentedOfferingContext).setFontProvider(parcelizableFontProvider).setShouldDisplayDismissButton(z).setEdgeToEdge(z2).setPaywallDisplayCallback(paywallDisplayCallback).build());
    }

    @e
    @InternalRevenueCatAPI
    public final void launchWithOfferingId(String offeringIdentifier, PresentedOfferingContext presentedOfferingContext, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map customVariables) {
        t.g(offeringIdentifier, "offeringIdentifier");
        t.g(presentedOfferingContext, "presentedOfferingContext");
        t.g(customVariables, "customVariables");
        launchWithOptions(new PaywallActivityLaunchOptions.Builder().setOfferingIdentifier(offeringIdentifier, presentedOfferingContext).setFontProvider(parcelizableFontProvider).setShouldDisplayDismissButton(z).setEdgeToEdge(z2).setCustomVariables(customVariables).build());
    }

    public final void launch(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, Map customVariables) {
        OfferingSelection.IdAndPresentedOfferingContext idAndPresentedOfferingContext;
        t.g(customVariables, "customVariables");
        d dVar = this.activityResultLauncher;
        if (offering != null) {
            String identifier = offering.getIdentifier();
            Package r4 = (Package) D.h0(offering.getAvailablePackages());
            idAndPresentedOfferingContext = new OfferingSelection.IdAndPresentedOfferingContext(identifier, r4 != null ? r4.getPresentedOfferingContext() : null);
        } else {
            idAndPresentedOfferingContext = null;
        }
        dVar.a(new PaywallActivityArgs((String) null, idAndPresentedOfferingContext, parcelizableFontProvider, z, z2, false, customVariables, (Integer) null, 161, (k) null));
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, (ParcelizableFontProvider) null, false, false, (PaywallDisplayCallback) null, 60, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, false, false, (PaywallDisplayCallback) null, 56, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, z, false, (PaywallDisplayCallback) null, 48, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        launchIfNeeded$default(this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, z, z2, (PaywallDisplayCallback) null, 32, (Object) null);
    }

    public final void launchIfNeeded(String requiredEntitlementIdentifier, Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(requiredEntitlementIdentifier), new 1(paywallDisplayCallback, this, requiredEntitlementIdentifier, offering, parcelizableFontProvider, z, z2));
    }

    @e
    public final /* synthetic */ void launchIfNeeded(String requiredEntitlementIdentifier, String offeringIdentifier, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, PaywallDisplayCallback paywallDisplayCallback) {
        t.g(requiredEntitlementIdentifier, "requiredEntitlementIdentifier");
        t.g(offeringIdentifier, "offeringIdentifier");
        HelperFunctionsKt.shouldDisplayPaywall(HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(requiredEntitlementIdentifier), new 2(paywallDisplayCallback, this, requiredEntitlementIdentifier, offeringIdentifier, parcelizableFontProvider, z, z2));
    }

    @e
    public final /* synthetic */ void launch(String offeringIdentifier, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2) {
        t.g(offeringIdentifier, "offeringIdentifier");
        this.activityResultLauncher.a(new PaywallActivityArgs((String) null, new OfferingSelection.IdAndPresentedOfferingContext(offeringIdentifier, null), parcelizableFontProvider, z, z2, false, (Map) null, (Integer) null, 225, (k) null));
    }

    public final void launchIfNeeded(Offering offering, ParcelizableFontProvider parcelizableFontProvider, boolean z, boolean z2, l shouldDisplayBlock) {
        t.g(shouldDisplayBlock, "shouldDisplayBlock");
        HelperFunctionsKt.shouldDisplayPaywall(shouldDisplayBlock, new 3(offering, parcelizableFontProvider, z, z2));
    }
}
