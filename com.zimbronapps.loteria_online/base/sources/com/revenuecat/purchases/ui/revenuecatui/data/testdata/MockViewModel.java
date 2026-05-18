package com.revenuecat.purchases.ui.revenuecatui.data.testdata;

import Ca.I;
import Ca.o;
import Ca.q;
import Ca.t;
import Ca.x;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import android.app.Activity;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import cb.O;
import cb.i;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.events.ExitOfferType;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallResult;
import com.revenuecat.purchases.ui.revenuecatui.components.PaywallAction;
import com.revenuecat.purchases.ui.revenuecatui.data.MockPurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallStateKt;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallViewModel;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import com.revenuecat.purchases.ui.revenuecatui.helpers.OfferingToStateMapperKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallValidationResult;
import com.revenuecat.purchases.ui.revenuecatui.helpers.PaywallWarning;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResolvedOffer;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MockViewModel extends V implements PaywallViewModel {
    public static final int $stable = 0;
    private static final Companion Companion = new Companion(null);
    private static final long MILLIS_2025_01_25 = 1737763200000L;

    @Deprecated
    public static final long fakePurchaseDelayMillis = 2000;
    private final C0 _actionError;
    private final C0 _actionInProgress;
    private final z _state;
    private final boolean allowsPurchases;
    private int clearActionErrorCallCount;
    private int closePaywallCallCount;
    private int getWebCheckoutUrlCallCount;
    private List getWebCheckoutUrlParams;
    private int handlePackagePurchaseCount;
    private List handlePackagePurchaseParams;
    private int handleRestorePurchasesCallCount;
    private int invalidateCustomerInfoCacheCallCount;
    private int preloadExitOfferingCallCount;
    private final h2 preloadedExitOffering;
    private final h2 purchaseCompleted;
    private int purchaseSelectedPackageCallCount;
    private List purchaseSelectedPackageIdentifiers;
    private List purchaseSelectedPackageParams;
    private int refreshStateIfColorsChangedCallCount;
    private int refreshStateIfLocaleChangedCallCount;
    private int restorePurchasesCallCount;
    private int selectPackageCallCount;
    private List selectPackageCallParams;
    private final boolean shouldErrorOnUnsupportedMethods;
    private int trackExitOfferCallCount;
    private List trackExitOfferParams;
    private int trackPaywallImpressionIfNeededCallCount;
    private int updateOptionsCallCount;
    private List updateOptionsParams;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel", f = "TestData.kt", l = {699}, m = "awaitSimulateActionInProgress")
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
            return MockViewModel.access$awaitSimulateActionInProgress(MockViewModel.this, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$simulateActionInProgress$1", f = "TestData.kt", l = {693}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return MockViewModel.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                MockViewModel mockViewModel = MockViewModel.this;
                this.label = 1;
                if (MockViewModel.access$awaitSimulateActionInProgress(mockViewModel, this) == f) {
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

    public /* synthetic */ MockViewModel(PaywallMode paywallMode, Offering offering, PaywallWarning paywallWarning, boolean z, boolean z2, int i, k kVar) {
        this((i & 1) != 0 ? PaywallMode.Companion.getDefault() : paywallMode, offering, (i & 4) != 0 ? null : paywallWarning, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2);
    }

    public static final /* synthetic */ Object access$awaitSimulateActionInProgress(MockViewModel mockViewModel, e eVar) {
        return mockViewModel.awaitSimulateActionInProgress(eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object awaitSimulateActionInProgress(Ga.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.awaitSimulateActionInProgress.1
            if (r0 == 0) goto L13
            r0 = r5
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.awaitSimulateActionInProgress.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel$awaitSimulateActionInProgress$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel r0 = (com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel) r0
            Ca.t.b(r5)
            goto L4f
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            Ca.t.b(r5)
            b0.C0 r5 = r4._actionInProgress
            java.lang.Boolean r2 = Ia.b.a(r3)
            r5.setValue(r2)
            r0.L$0 = r4
            r0.label = r3
            r2 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r5 = cb.Z.a(r2, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            r0 = r4
        L4f:
            b0.C0 r5 = r0._actionInProgress
            r0 = 0
            java.lang.Boolean r0 = Ia.b.a(r0)
            r5.setValue(r0)
            Ca.I r5 = Ca.I.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.testdata.MockViewModel.awaitSimulateActionInProgress(Ga.e):java.lang.Object");
    }

    private final void simulateActionInProgress() {
        i.d(W.a(this), null, null, new 1(null), 3, null);
    }

    private final void unsupportedMethod(String str) {
        if (this.shouldErrorOnUnsupportedMethods) {
            throw new IllegalStateException(str.toString());
        }
    }

    public static /* synthetic */ void unsupportedMethod$default(MockViewModel mockViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Not supported";
        }
        mockViewModel.unsupportedMethod(str);
    }

    public void clearActionError() {
        this.clearActionErrorCallCount++;
        this._actionError.setValue((Object) null);
    }

    public void closePaywall(PaywallResult paywallResult) {
        this.closePaywallCallCount++;
    }

    public h2 getActionError() {
        return this._actionError;
    }

    public h2 getActionInProgress() {
        return this._actionInProgress;
    }

    public final int getClearActionErrorCallCount() {
        return this.clearActionErrorCallCount;
    }

    public final int getClosePaywallCallCount() {
        return this.closePaywallCallCount;
    }

    public final int getGetWebCheckoutUrlCallCount() {
        return this.getWebCheckoutUrlCallCount;
    }

    public final List getGetWebCheckoutUrlParams() {
        return this.getWebCheckoutUrlParams;
    }

    public final int getHandlePackagePurchaseCount() {
        return this.handlePackagePurchaseCount;
    }

    public final List getHandlePackagePurchaseParams() {
        return this.handlePackagePurchaseParams;
    }

    public final int getHandleRestorePurchasesCallCount() {
        return this.handleRestorePurchasesCallCount;
    }

    public final int getInvalidateCustomerInfoCacheCallCount() {
        return this.invalidateCustomerInfoCacheCallCount;
    }

    public final int getPreloadExitOfferingCallCount() {
        return this.preloadExitOfferingCallCount;
    }

    public h2 getPreloadedExitOffering() {
        return this.preloadedExitOffering;
    }

    public h2 getPurchaseCompleted() {
        return this.purchaseCompleted;
    }

    public final int getPurchaseSelectedPackageCallCount() {
        return this.purchaseSelectedPackageCallCount;
    }

    public final List getPurchaseSelectedPackageIdentifiers() {
        return this.purchaseSelectedPackageIdentifiers;
    }

    public final List getPurchaseSelectedPackageParams() {
        return this.purchaseSelectedPackageParams;
    }

    public final int getRefreshStateIfColorsChangedCallCount() {
        return this.refreshStateIfColorsChangedCallCount;
    }

    public final int getRefreshStateIfLocaleChangedCallCount() {
        return this.refreshStateIfLocaleChangedCallCount;
    }

    public ResourceProvider getResourceProvider() {
        return new MockResourceProvider(null, null, null, null, null, 31, null);
    }

    public final int getRestorePurchasesCallCount() {
        return this.restorePurchasesCallCount;
    }

    public final int getSelectPackageCallCount() {
        return this.selectPackageCallCount;
    }

    public final List getSelectPackageCallParams() {
        return this.selectPackageCallParams;
    }

    public N getState() {
        return g.b(this._state);
    }

    public final int getTrackExitOfferCallCount() {
        return this.trackExitOfferCallCount;
    }

    public final List getTrackExitOfferParams() {
        return this.trackExitOfferParams;
    }

    public final int getTrackPaywallImpressionIfNeededCallCount() {
        return this.trackPaywallImpressionIfNeededCallCount;
    }

    public final int getUpdateOptionsCallCount() {
        return this.updateOptionsCallCount;
    }

    public final List getUpdateOptionsParams() {
        return this.updateOptionsParams;
    }

    public String getWebCheckoutUrl(PaywallAction.External.LaunchWebCheckout launchWebCheckout) {
        kotlin.jvm.internal.t.g(launchWebCheckout, "launchWebCheckout");
        this.getWebCheckoutUrlCallCount++;
        this.getWebCheckoutUrlParams.add(launchWebCheckout);
        return null;
    }

    public Object handlePackagePurchase(Activity activity, Package r2, ResolvedOffer resolvedOffer, e eVar) {
        this.handlePackagePurchaseCount++;
        this.handlePackagePurchaseParams.add(x.a(activity, r2));
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't purchase mock view model");
        }
        return I.a;
    }

    public Object handleRestorePurchases(e eVar) {
        this.handleRestorePurchasesCallCount++;
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't restore purchases");
        }
        return I.a;
    }

    public void invalidateCustomerInfoCache() {
        this.invalidateCustomerInfoCacheCallCount++;
    }

    public final PaywallState.Loaded.Legacy loadedLegacyState() {
        return PaywallStateKt.loadedLegacy((PaywallState) getState().getValue());
    }

    public void preloadExitOffering() {
        this.preloadExitOfferingCallCount++;
    }

    public void purchaseSelectedPackage(Activity activity) {
        C0 selectedPackage;
        TemplateConfiguration.PackageInfo packageInfo;
        Package rcPackage;
        this.purchaseSelectedPackageCallCount++;
        this.purchaseSelectedPackageParams.add(activity);
        List list = this.purchaseSelectedPackageIdentifiers;
        PaywallState.Loaded.Legacy loadedLegacyState = loadedLegacyState();
        list.add((loadedLegacyState == null || (selectedPackage = loadedLegacyState.getSelectedPackage()) == null || (packageInfo = (TemplateConfiguration.PackageInfo) selectedPackage.getValue()) == null || (rcPackage = packageInfo.getRcPackage()) == null) ? null : rcPackage.getIdentifier());
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't purchase mock view model");
        }
    }

    public void refreshStateIfColorsChanged(X.l colorScheme, boolean z) {
        kotlin.jvm.internal.t.g(colorScheme, "colorScheme");
        this.refreshStateIfColorsChangedCallCount++;
    }

    public void refreshStateIfLocaleChanged() {
        this.refreshStateIfLocaleChangedCallCount++;
    }

    public void restorePurchases() {
        this.restorePurchasesCallCount++;
        if (this.allowsPurchases) {
            simulateActionInProgress();
        } else {
            unsupportedMethod("Can't restore purchases");
        }
    }

    public void selectPackage(TemplateConfiguration.PackageInfo packageToSelect) {
        I i;
        kotlin.jvm.internal.t.g(packageToSelect, "packageToSelect");
        this.selectPackageCallCount++;
        this.selectPackageCallParams.add(packageToSelect);
        PaywallState.Loaded.Legacy loadedLegacyState = loadedLegacyState();
        if (loadedLegacyState != null) {
            loadedLegacyState.selectPackage(packageToSelect);
            i = I.a;
        } else {
            i = null;
        }
        if (i == null) {
            unsupportedMethod$default(this, null, 1, null);
        }
    }

    public void trackExitOffer(ExitOfferType exitOfferType, String exitOfferingIdentifier) {
        kotlin.jvm.internal.t.g(exitOfferType, "exitOfferType");
        kotlin.jvm.internal.t.g(exitOfferingIdentifier, "exitOfferingIdentifier");
        this.trackExitOfferCallCount++;
        this.trackExitOfferParams.add(new q(exitOfferType, exitOfferingIdentifier));
    }

    public void trackPaywallImpressionIfNeeded() {
        this.trackPaywallImpressionIfNeededCallCount++;
    }

    public final void updateOptions(PaywallOptions options) {
        kotlin.jvm.internal.t.g(options, "options");
        this.updateOptionsCallCount++;
        this.updateOptionsParams.add(options);
    }

    public MockViewModel(PaywallMode mode, Offering offering, PaywallWarning paywallWarning, boolean z, boolean z2) {
        Object componentsPaywallState$default;
        kotlin.jvm.internal.t.g(mode, "mode");
        kotlin.jvm.internal.t.g(offering, "offering");
        this.allowsPurchases = z;
        this.shouldErrorOnUnsupportedMethods = z2;
        Boolean bool = Boolean.FALSE;
        this.purchaseCompleted = U1.i(bool, (T1) null, 2, (Object) null);
        this.preloadedExitOffering = U1.i((Object) null, (T1) null, 2, (Object) null);
        PaywallValidationResult validatedPaywall = OfferingToStateMapperKt.validatedPaywall(offering, TestData.Constants.INSTANCE.getCurrentColorScheme(), getResourceProvider());
        if (validatedPaywall instanceof PaywallValidationResult.Legacy) {
            PaywallValidationResult.Legacy legacy = (PaywallValidationResult.Legacy) validatedPaywall;
            componentsPaywallState$default = OfferingToStateMapperKt.toLegacyPaywallState(offering, new VariableDataProvider(getResourceProvider(), false, 2, null), mode, legacy.getDisplayablePaywall(), legacy.getTemplate(), false, "US", paywallWarning);
        } else if (validatedPaywall instanceof PaywallValidationResult.Components) {
            componentsPaywallState$default = OfferingToStateMapperKt.toComponentsPaywallState$default(offering, (PaywallValidationResult.Components) validatedPaywall, null, MockViewModel$_state$1.INSTANCE, new MockPurchasesType(null, null, null, null, 15, null), null, null, 48, null);
        } else {
            throw new o();
        }
        this._state = P.a(componentsPaywallState$default);
        this._actionInProgress = U1.i(bool, (T1) null, 2, (Object) null);
        this._actionError = U1.i((Object) null, (T1) null, 2, (Object) null);
        this.trackExitOfferParams = new ArrayList();
        this.selectPackageCallParams = new ArrayList();
        this.getWebCheckoutUrlParams = new ArrayList();
        this.purchaseSelectedPackageParams = new ArrayList();
        this.purchaseSelectedPackageIdentifiers = new ArrayList();
        this.handlePackagePurchaseParams = new ArrayList();
        this.updateOptionsParams = new ArrayList();
    }
}
