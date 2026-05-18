package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ca.I;
import Ca.o;
import Ca.t;
import Da.D;
import Da.w;
import Ga.e;
import Ha.c;
import Ia.b;
import Ia.d;
import Ia.f;
import P1.j;
import Qa.a;
import Qa.p;
import X.l;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import b0.C0;
import b0.T1;
import b0.U1;
import b0.h2;
import cb.O;
import cb.i;
import com.revenuecat.purchases.CreateSupportTicketResult;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.customercenter.events.CustomerCenterDisplayMode;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityArgs;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.FeedbackSurveyData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterNavigationState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.DefaultDateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpener;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpeningMethod;
import fb.J;
import fb.N;
import fb.P;
import fb.g;
import fb.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl extends V implements CustomerCenterViewModel {
    private static final long STOP_FLOW_TIMEOUT = 5000;
    private final C0 _actionError;
    private final z _colorScheme;
    private final z _lastLocaleList;
    private final z _state;
    private final l colorScheme;
    private final DateFormatter dateFormatter;
    private CustomerCenterImpressionEvent.CreationData impressionCreationData;
    private boolean isDarkMode;
    private final CustomerCenterListener listener;
    private final Locale locale;
    private final PurchasesType purchases;
    private boolean shouldRefreshOnResume;
    private final N state;
    private boolean wasBackgrounded;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomerCenterConfigData.HelpPath.PathType.values().length];
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CHANGE_PLANS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CustomerCenterConfigData.HelpPath.OpenMethod.values().length];
            try {
                iArr2[CustomerCenterConfigData.HelpPath.OpenMethod.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {751}, m = "createPurchaseInformation")
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
            return CustomerCenterViewModelImpl.access$createPurchaseInformation(CustomerCenterViewModelImpl.this, null, null, null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1206}, m = "findTargetProduct")
    public static final class 1 extends d {
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.access$findTargetProduct(CustomerCenterViewModelImpl.this, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1181}, m = "getPromotionalSubscriptionOption")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.access$getPromotionalSubscriptionOption(CustomerCenterViewModelImpl.this, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$handleSupportTicketSubmit$1", f = "CustomerCenterViewModel.kt", l = {397}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ String $description;
        final /* synthetic */ String $email;
        final /* synthetic */ a $onError;
        final /* synthetic */ a $onSuccess;
        int label;
        final /* synthetic */ CustomerCenterViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str, String str2, CustomerCenterViewModelImpl customerCenterViewModelImpl, a aVar, a aVar2, e eVar) {
            super(2, eVar);
            this.$email = str;
            this.$description = str2;
            this.this$0 = customerCenterViewModelImpl;
            this.$onSuccess = aVar;
            this.$onError = aVar2;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$email, this.$description, this.this$0, this.$onSuccess, this.$onError, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object awaitCreateSupportTicket;
            Object value;
            Object obj2;
            Object f = c.f();
            int i = this.label;
            try {
                if (i == 0) {
                    t.b(obj);
                    Logger.INSTANCE.d("Creating support ticket - email: " + this.$email + ", Description: " + this.$description);
                    PurchasesType access$getPurchases$p = CustomerCenterViewModelImpl.access$getPurchases$p(this.this$0);
                    String str = this.$email;
                    String str2 = this.$description;
                    this.label = 1;
                    awaitCreateSupportTicket = access$getPurchases$p.awaitCreateSupportTicket(str, str2, this);
                    if (awaitCreateSupportTicket == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                    awaitCreateSupportTicket = obj;
                }
                if (((CreateSupportTicketResult) awaitCreateSupportTicket).getSuccess()) {
                    Logger.INSTANCE.d("Support ticket created successfully");
                    z access$get_state$p = CustomerCenterViewModelImpl.access$get_state$p(this.this$0);
                    do {
                        value = access$get_state$p.getValue();
                        obj2 = (CustomerCenterState) value;
                        if (obj2 instanceof CustomerCenterState.Success) {
                            obj2 = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) obj2, null, null, null, null, null, null, ((CustomerCenterState.Success) obj2).getNavigationState().pop(), ((CustomerCenterState.Success) obj2).getNavigationState().pop().getCanNavigateBack() ? CustomerCenterState.NavigationButtonType.BACK : CustomerCenterState.NavigationButtonType.CLOSE, null, true, false, 1343, null);
                        }
                    } while (!access$get_state$p.e(value, obj2));
                    this.$onSuccess.invoke();
                } else {
                    Logger.INSTANCE.e("Support ticket creation returned false");
                    this.$onError.invoke();
                }
            } catch (PurchasesException e) {
                Logger.INSTANCE.e("Error creating support ticket", e);
                this.$onError.invoke();
            }
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$launchRefreshIfPossible$1", f = "CustomerCenterViewModel.kt", l = {1058}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        int label;

        public 1(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return CustomerCenterViewModelImpl.this.new 1(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CustomerCenterViewModelImpl customerCenterViewModelImpl = CustomerCenterViewModelImpl.this;
                this.label = 1;
                if (customerCenterViewModelImpl.refreshCustomerCenter(this) == f) {
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

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {816}, m = "loadAndDisplayPromotionalOffer")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.loadAndDisplayPromotionalOffer(null, null, null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {967, 968, 975, 983}, m = "loadCustomerCenter")
    public static final class 2 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public 2(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.access$loadCustomerCenter(CustomerCenterViewModelImpl.this, false, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {662, 675, 695}, m = "loadPurchases")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.access$loadPurchases(CustomerCenterViewModelImpl.this, null, null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {860, 864}, m = "onAcceptedPromotionalOffer")
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
            return CustomerCenterViewModelImpl.this.onAcceptedPromotionalOffer(null, null, this);
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$pathButtonPressed$2", f = "CustomerCenterViewModel.kt", l = {267}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        final /* synthetic */ Context $context;
        final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
        final /* synthetic */ PurchaseInformation $purchaseInformation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Context context, PurchaseInformation purchaseInformation, CustomerCenterConfigData.HelpPath helpPath, e eVar) {
            super(2, eVar);
            this.$context = context;
            this.$purchaseInformation = purchaseInformation;
            this.$path = helpPath;
        }

        public final e create(Object obj, e eVar) {
            return CustomerCenterViewModelImpl.this.new 2(this.$context, this.$purchaseInformation, this.$path, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CustomerCenterViewModelImpl customerCenterViewModelImpl = CustomerCenterViewModelImpl.this;
                Context context = this.$context;
                PurchaseInformation purchaseInformation = this.$purchaseInformation;
                StoreProduct product = purchaseInformation != null ? purchaseInformation.getProduct() : null;
                CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = this.$path.getPromotionalOffer();
                CustomerCenterConfigData.HelpPath helpPath = this.$path;
                PurchaseInformation purchaseInformation2 = this.$purchaseInformation;
                this.label = 1;
                obj = CustomerCenterViewModelImpl.access$handlePromotionalOffer(customerCenterViewModelImpl, context, product, promotionalOffer, helpPath, purchaseInformation2, this);
                if (obj == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                CustomerCenterViewModelImpl.access$mainPathAction(CustomerCenterViewModelImpl.this, this.$path, this.$context, this.$purchaseInformation);
            }
            return I.a;
        }
    }

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {534}, m = "restorePurchases")
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
            return CustomerCenterViewModelImpl.this.restorePurchases(this);
        }
    }

    public static final class 1 extends u implements Qa.l {
        public 1() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError error) {
            kotlin.jvm.internal.t.g(error, "error");
            CustomerCenterViewModelImpl.access$handlePaywallError(CustomerCenterViewModelImpl.this, "Failed to get current offering: " + error.getMessage(), error.getCode());
        }
    }

    public static final class 2 extends u implements Qa.l {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(Context context) {
            super(1);
            this.$context = context;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return I.a;
        }

        public final void invoke(Offerings offerings) {
            kotlin.jvm.internal.t.g(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current == null) {
                CustomerCenterViewModelImpl.access$handlePaywallError(CustomerCenterViewModelImpl.this, "No offering available for paywall presentation", PurchasesErrorCode.ConfigurationError);
                return;
            }
            Logger.INSTANCE.d("Falling back to current offering: " + current.getIdentifier());
            CustomerCenterViewModelImpl.access$launchPaywallActivity(CustomerCenterViewModelImpl.this, this.$context, current);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomerCenterViewModelImpl(PurchasesType purchasesType, DateFormatter dateFormatter, Locale locale, l lVar, boolean z, CustomerCenterListener customerCenterListener, int i, k kVar) {
        DateFormatter defaultDateFormatter = (i & 2) != 0 ? new DefaultDateFormatter() : dateFormatter;
        if ((i & 4) != 0) {
            locale = Locale.getDefault();
            kotlin.jvm.internal.t.f(locale, "getDefault()");
        }
        this(purchasesType, defaultDateFormatter, locale, lVar, z, (i & 32) != 0 ? null : customerCenterListener);
    }

    public static final /* synthetic */ Object access$createPurchaseInformation(CustomerCenterViewModelImpl customerCenterViewModelImpl, TransactionDetails transactionDetails, EntitlementInfo entitlementInfo, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization, e eVar) {
        return customerCenterViewModelImpl.createPurchaseInformation(transactionDetails, entitlementInfo, dateFormatter, locale, localization, eVar);
    }

    public static final /* synthetic */ Object access$findTargetProduct(CustomerCenterViewModelImpl customerCenterViewModelImpl, String str, String str2, e eVar) {
        return customerCenterViewModelImpl.findTargetProduct(str, str2, eVar);
    }

    public static final /* synthetic */ Object access$getPromotionalSubscriptionOption(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, StoreProduct storeProduct, e eVar) {
        return customerCenterViewModelImpl.getPromotionalSubscriptionOption(promotionalOffer, storeProduct, eVar);
    }

    public static final /* synthetic */ PurchasesType access$getPurchases$p(CustomerCenterViewModelImpl customerCenterViewModelImpl) {
        return customerCenterViewModelImpl.purchases;
    }

    public static final /* synthetic */ z access$get_state$p(CustomerCenterViewModelImpl customerCenterViewModelImpl) {
        return customerCenterViewModelImpl._state;
    }

    public static final /* synthetic */ void access$goBackToMain(CustomerCenterViewModelImpl customerCenterViewModelImpl) {
        customerCenterViewModelImpl.goBackToMain();
    }

    public static final /* synthetic */ void access$handlePaywallError(CustomerCenterViewModelImpl customerCenterViewModelImpl, String str, PurchasesErrorCode purchasesErrorCode) {
        customerCenterViewModelImpl.handlePaywallError(str, purchasesErrorCode);
    }

    public static final /* synthetic */ Object access$handlePromotionalOffer(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar) {
        return customerCenterViewModelImpl.handlePromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, eVar);
    }

    public static final /* synthetic */ void access$handleSupportTicketSubmit(CustomerCenterViewModelImpl customerCenterViewModelImpl, String str, String str2, a aVar, a aVar2) {
        customerCenterViewModelImpl.handleSupportTicketSubmit(str, str2, aVar, aVar2);
    }

    public static final /* synthetic */ void access$launchPaywallActivity(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, Offering offering) {
        customerCenterViewModelImpl.launchPaywallActivity(context, offering);
    }

    public static final /* synthetic */ Object access$loadCustomerCenter(CustomerCenterViewModelImpl customerCenterViewModelImpl, boolean z, e eVar) {
        return customerCenterViewModelImpl.loadCustomerCenter(z, eVar);
    }

    public static final /* synthetic */ Object access$loadPurchases(CustomerCenterViewModelImpl customerCenterViewModelImpl, DateFormatter dateFormatter, Locale locale, CustomerCenterConfigData.Localization localization, e eVar) {
        return customerCenterViewModelImpl.loadPurchases(dateFormatter, locale, localization, eVar);
    }

    public static final /* synthetic */ void access$mainPathAction(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation) {
        customerCenterViewModelImpl.mainPathAction(helpPath, context, purchaseInformation);
    }

    public static final /* synthetic */ void access$notifyListenersForFeedbackSurveyCompleted(CustomerCenterViewModelImpl customerCenterViewModelImpl, String str) {
        customerCenterViewModelImpl.notifyListenersForFeedbackSurveyCompleted(str);
    }

    public static final /* synthetic */ void access$trackCustomerCenterEventOptionChosen(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath.PathType pathType, String str, String str2) {
        customerCenterViewModelImpl.trackCustomerCenterEventOptionChosen(pathType, str, str2);
    }

    private final TransactionDetails.Subscription asTransactionDetails(SubscriptionInfo subscriptionInfo) {
        return new TransactionDetails.Subscription(subscriptionInfo.getProductIdentifier(), subscriptionInfo.getProductPlanIdentifier(), subscriptionInfo.getStore(), subscriptionInfo.isActive(), subscriptionInfo.getWillRenew(), subscriptionInfo.getExpiresDate(), subscriptionInfo.getPeriodType() == PeriodType.TRIAL, subscriptionInfo.getManagementURL(), subscriptionInfo.getPrice(), subscriptionInfo.isSandbox());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List computeMainScreenPaths(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success r5) {
        /*
            r4 = this;
            java.util.List r0 = r5.getPurchases()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.List r0 = r5.getPurchases()
            if (r0 == 0) goto L17
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L17
            goto L36
        L17:
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r1 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation) r1
            boolean r1 = r1.isExpired()
            if (r1 != 0) goto L1b
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r0 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen r0 = r0.getManagementScreen()
            goto L3e
        L36:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r0 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen r0 = r0.getNoActiveScreen()
        L3e:
            r1 = 1
            if (r0 == 0) goto L65
            java.util.List r2 = r5.getPurchases()
            int r2 = r2.size()
            if (r2 != r1) goto L56
            java.util.List r2 = r5.getPurchases()
            java.lang.Object r2 = Da.D.f0(r2)
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r2 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation) r2
            goto L57
        L56:
            r2 = 0
        L57:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r3 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization r3 = r3.getLocalization()
            java.util.List r0 = r4.supportedPaths(r2, r0, r3)
            if (r0 != 0) goto L69
        L65:
            java.util.List r0 = Da.v.n()
        L69:
            java.util.List r5 = r5.getPurchases()
            int r5 = r5.size()
            if (r5 <= r1) goto L79
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils r5 = com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils.INSTANCE
            java.util.List r0 = r5.filterGeneralPaths(r0)
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.computeMainScreenPaths(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState$Success):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object createPurchaseInformation(com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails r16, com.revenuecat.purchases.EntitlementInfo r17, com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter r18, java.util.Locale r19, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r20, Ga.e r21) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.createPurchaseInformation(com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails, com.revenuecat.purchases.EntitlementInfo, com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter, java.util.Locale, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Ga.e):java.lang.Object");
    }

    private final void displayFeedbackSurvey(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, Qa.l lVar) {
        Object value;
        Object obj;
        z zVar = this._state;
        do {
            value = zVar.getValue();
            obj = (CustomerCenterState) value;
            if (obj instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) obj;
                obj = CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().push(new CustomerCenterDestination.FeedbackSurvey(new FeedbackSurveyData(feedbackSurvey, lVar), feedbackSurvey.getTitle())), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
            }
        } while (!zVar.e(value, obj));
    }

    private final List findActiveTransactions(CustomerInfo customerInfo) {
        Object obj;
        Iterable values = customerInfo.getSubscriptionsByProductIdentifier().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : values) {
            if (((SubscriptionInfo) obj2).isActive()) {
                arrayList.add(obj2);
            }
        }
        List C0 = D.C0(arrayList, new CustomerCenterViewModelImpl$findActiveTransactions$$inlined$sortedBy$1());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : C0) {
            if (((SubscriptionInfo) obj3).getStore() == Store.PLAY_STORE) {
                arrayList2.add(obj3);
            }
        }
        List nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : nonSubscriptionTransactions) {
            if (((Transaction) obj4).getStore() == Store.PLAY_STORE) {
                arrayList3.add(obj4);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj5 : C0) {
            if (((SubscriptionInfo) obj5).getStore() != Store.PLAY_STORE) {
                arrayList4.add(obj5);
            }
        }
        List nonSubscriptionTransactions2 = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj6 : nonSubscriptionTransactions2) {
            if (((Transaction) obj6).getStore() != Store.PLAY_STORE) {
                arrayList5.add(obj6);
            }
        }
        List v0 = D.v0(D.v0(D.v0(arrayList2, arrayList3), arrayList4), arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj7 : v0) {
            if (obj7 instanceof SubscriptionInfo) {
                obj = asTransactionDetails((SubscriptionInfo) obj7);
            } else if (obj7 instanceof Transaction) {
                Transaction transaction = (Transaction) obj7;
                obj = new TransactionDetails.NonSubscription(transaction.getProductIdentifier(), transaction.getStore(), transaction.getPrice(), transaction.isSandbox());
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList6.add(obj);
            }
        }
        return arrayList6;
    }

    private final TransactionDetails.Subscription findLatestExpiredSubscription(CustomerInfo customerInfo) {
        Object next;
        Iterable values = customerInfo.getSubscriptionsByProductIdentifier().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
            if (!subscriptionInfo.isActive() && subscriptionInfo.getExpiresDate() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Comparable expiresDate = ((SubscriptionInfo) next).getExpiresDate();
                kotlin.jvm.internal.t.d(expiresDate);
                do {
                    Object next2 = it.next();
                    Comparable expiresDate2 = ((SubscriptionInfo) next2).getExpiresDate();
                    kotlin.jvm.internal.t.d(expiresDate2);
                    if (expiresDate.compareTo(expiresDate2) < 0) {
                        next = next2;
                        expiresDate = expiresDate2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SubscriptionInfo subscriptionInfo2 = (SubscriptionInfo) next;
        if (subscriptionInfo2 != null) {
            return asTransactionDetails(subscriptionInfo2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object findTargetProduct(java.lang.String r11, java.lang.String r12, Ga.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.findTargetProduct.1
            if (r0 == 0) goto L13
            r0 = r13
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.findTargetProduct.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r13)
            goto L5e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Ca.t.b(r13)
            java.lang.String r13 = ":"
            java.lang.String[] r5 = new java.lang.String[]{r13}
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            java.util.List r11 = Za.E.M0(r4, r5, r6, r7, r8, r9)
            java.lang.Object r13 = Da.D.f0(r11)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = Da.D.i0(r11, r3)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L52
            goto L53
        L52:
            r12 = r11
        L53:
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r11 = r10.purchases
            r0.label = r3
            java.lang.Object r13 = r11.awaitGetProduct(r13, r12, r0)
            if (r13 != r1) goto L5e
            return r1
        L5e:
            com.revenuecat.purchases.models.StoreProduct r13 = (com.revenuecat.purchases.models.StoreProduct) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.findTargetProduct(java.lang.String, java.lang.String, Ga.e):java.lang.Object");
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
            kotlin.jvm.internal.t.f(a, "{\n            val locale….create(locale)\n        }");
            return a;
        } catch (IllegalArgumentException unused) {
            Logger.INSTANCE.w("Invalid preferred locale format: " + preferredUILocaleOverride + ". Using system default.");
            j d2 = j.d();
            kotlin.jvm.internal.t.f(d2, "{\n            Logger.w(\"…at.getDefault()\n        }");
            return d2;
        }
    }

    private final SubscriptionOption getCustomerCenterSubscriptionOption(String str, StoreProduct storeProduct) {
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        Object obj = null;
        if (subscriptionOptions == null) {
            return null;
        }
        Iterator it = subscriptionOptions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            GoogleSubscriptionOption googleSubscriptionOption = (SubscriptionOption) next;
            if ((googleSubscriptionOption instanceof GoogleSubscriptionOption) && googleSubscriptionOption.getTags().contains("rc-customer-center") && kotlin.jvm.internal.t.c(googleSubscriptionOption.getOfferId(), str)) {
                obj = next;
                break;
            }
        }
        return (SubscriptionOption) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083 A[PHI: r2
      0x0083: PHI (r2v4 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion) = 
      (r2v3 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
      (r2v12 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
      (r2v14 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
     binds: [B:20:0x0054, B:23:0x0068, B:26:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object getPromotionalSubscriptionOption(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer r8, com.revenuecat.purchases.models.StoreProduct r9, Ga.e r10) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.getPromotionalSubscriptionOption(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer, com.revenuecat.purchases.models.StoreProduct, Ga.e):java.lang.Object");
    }

    private final void goBackToMain() {
        Object value;
        Object obj;
        z zVar = this._state;
        do {
            value = zVar.getValue();
            obj = (CustomerCenterState) value;
            if (obj instanceof CustomerCenterState.Success) {
                obj = resetToMainScreen((CustomerCenterState.Success) obj);
            }
        } while (!zVar.e(value, obj));
    }

    private final void handleCancelPath(Context context, PurchaseInformation purchaseInformation) {
        Object value = this._state.getValue();
        CustomerCenterState.Success success = value instanceof CustomerCenterState.Success ? (CustomerCenterState.Success) value : null;
        if (success == null) {
            return;
        }
        if (purchaseInformation == null) {
            CustomerCenterDestination currentDestination = success.getCurrentDestination();
            purchaseInformation = currentDestination instanceof CustomerCenterDestination.SelectedPurchaseDetail ? ((CustomerCenterDestination.SelectedPurchaseDetail) currentDestination).getPurchaseInformation() : success.getPurchases().size() == 1 ? (PurchaseInformation) D.f0(success.getPurchases()) : null;
        }
        if ((purchaseInformation != null ? purchaseInformation.getStore() : null) == Store.PLAY_STORE && purchaseInformation.getProduct() != null) {
            startGoogleProductCancellation(context, purchaseInformation.getProduct());
            return;
        }
        if ((purchaseInformation != null ? purchaseInformation.getManagementURL() : null) != null) {
            startManagementUrlCancellation(context, purchaseInformation.getManagementURL());
        } else {
            Logger.INSTANCE.e("No product or management URL available for cancel path");
        }
    }

    public static /* synthetic */ void handleCancelPath$default(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, PurchaseInformation purchaseInformation, int i, Object obj) {
        if ((i & 2) != 0) {
            purchaseInformation = null;
        }
        customerCenterViewModelImpl.handleCancelPath(context, purchaseInformation);
    }

    private final void handlePaywallError(String str, PurchasesErrorCode purchasesErrorCode) {
        Logger.INSTANCE.e(str);
        this._actionError.setValue(new PurchasesError(purchasesErrorCode, str));
    }

    private final Object handlePromotionalOffer(Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar) {
        return (storeProduct == null || promotionalOffer == null) ? b.a(false) : loadAndDisplayPromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, eVar);
    }

    private final void handleSupportTicketSubmit(String str, String str2, a aVar, a aVar2) {
        if (((CustomerCenterState) this._state.getValue()) instanceof CustomerCenterState.Success) {
            i.d(W.a(this), null, null, new 1(str, str2, this, aVar, aVar2, null), 3, null);
        }
    }

    private final boolean isPathAllowedForStore(CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation) {
        switch (WhenMappings.$EnumSwitchMapping$0[helpPath.getType().ordinal()]) {
            case 1:
            case 3:
            case 4:
                return true;
            case 2:
                if ((purchaseInformation != null ? purchaseInformation.getStore() : null) == Store.PLAY_STORE) {
                    return true;
                }
                if ((purchaseInformation != null ? purchaseInformation.getManagementURL() : null) != null) {
                    return true;
                }
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                throw new o();
        }
        return false;
    }

    private final boolean isPathAllowedForSubscriptionState(CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation) {
        if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
            return (purchaseInformation == null || !purchaseInformation.isSubscription() || purchaseInformation.isExpired()) ? false : true;
        }
        return true;
    }

    private final void launchPaywallActivity(Context context, Offering offering) {
        try {
            Logger logger = Logger.INSTANCE;
            logger.d("Showing paywall for offering: " + offering.getIdentifier());
            String identifier = offering.getIdentifier();
            Package r3 = (Package) D.h0(offering.getAvailablePackages());
            PaywallActivityArgs paywallActivityArgs = new PaywallActivityArgs((String) null, new OfferingSelection.IdAndPresentedOfferingContext(identifier, r3 != null ? r3.getPresentedOfferingContext() : null), (Map) null, true, false, false, (Map) null, (Integer) null, 245, (k) null);
            Intent intent = new Intent(context, PaywallActivity.class);
            intent.putExtra("paywall_args", paywallActivityArgs);
            intent.addFlags(268435456);
            context.startActivity(intent);
            logger.d("Successfully launched paywall for offering: " + offering.getIdentifier());
        } catch (ActivityNotFoundException e) {
            handlePaywallError("PaywallActivity not found: " + e.getMessage(), PurchasesErrorCode.ConfigurationError);
        } catch (IllegalArgumentException e2) {
            handlePaywallError("Invalid argument for paywall: " + e2.getMessage(), PurchasesErrorCode.UnknownError);
        } catch (SecurityException e3) {
            handlePaywallError("Security error launching paywall: " + e3.getMessage(), PurchasesErrorCode.UnknownError);
        }
    }

    private final void launchRefreshIfPossible() {
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (!(customerCenterState instanceof CustomerCenterState.Success) || ((CustomerCenterState.Success) customerCenterState).isRefreshing()) {
            return;
        }
        i.d(W.a(this), null, null, new 1(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0018  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x013b -> B:19:0x0147). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object loadPurchases(com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter r20, java.util.Locale r21, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r22, Ga.e r23) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.loadPurchases(com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter, java.util.Locale, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Ga.e):java.lang.Object");
    }

    private final void mainPathAction(CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation) {
        Object value;
        Object obj;
        String actionIdentifier;
        StoreProduct product;
        int i = WhenMappings.$EnumSwitchMapping$0[helpPath.getType().ordinal()];
        if (i == 1) {
            z zVar = this._state;
            do {
                value = zVar.getValue();
                obj = (CustomerCenterState) value;
                if (obj instanceof CustomerCenterState.Success) {
                    obj = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) obj, null, null, null, null, RestorePurchasesState.RESTORING, null, null, null, null, false, false, 2031, null);
                }
            } while (!zVar.e(value, obj));
            return;
        }
        if (i == 2) {
            handleCancelPath(context, purchaseInformation);
            return;
        }
        if (i != 3) {
            if (i == 4 && (actionIdentifier = helpPath.getActionIdentifier()) != null) {
                onCustomActionSelected(new CustomActionData(actionIdentifier, (purchaseInformation == null || (product = purchaseInformation.getProduct()) == null) ? null : product.getId()));
                return;
            }
            return;
        }
        String url = helpPath.getUrl();
        if (url != null) {
            CustomerCenterConfigData.HelpPath.OpenMethod openMethod = helpPath.getOpenMethod();
            if (openMethod == null) {
                openMethod = CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL;
            }
            openURL(context, url, openMethod);
        }
    }

    public static /* synthetic */ void mainPathAction$default(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation, int i, Object obj) {
        if ((i & 4) != 0) {
            purchaseInformation = null;
        }
        customerCenterViewModelImpl.mainPathAction(helpPath, context, purchaseInformation);
    }

    private final void notifyListenersForCustomActionSelected(CustomActionData customActionData) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onCustomActionSelected(customActionData.getActionIdentifier(), customActionData.getPurchaseIdentifier());
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onCustomActionSelected(customActionData.getActionIdentifier(), customActionData.getPurchaseIdentifier());
        }
    }

    private final void notifyListenersForFeedbackSurveyCompleted(String str) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onFeedbackSurveyCompleted(str);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onFeedbackSurveyCompleted(str);
        }
    }

    private final void notifyListenersForManageSubscription() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onShowingManageSubscriptions();
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onShowingManageSubscriptions();
        }
    }

    private final void notifyListenersForManagementOptionSelected(CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation) {
        String str;
        String actionIdentifier;
        StoreProduct product;
        int i = WhenMappings.$EnumSwitchMapping$0[helpPath.getType().ordinal()];
        if (i == 1) {
            str = CustomerCenterManagementOption.MissingPurchase.INSTANCE;
        } else if (i != 2) {
            str = null;
            if (i == 3) {
                String url = helpPath.getUrl();
                if (url != null) {
                    str = new CustomerCenterManagementOption.CustomUrl(Uri.parse(url));
                }
            } else if (i == 4 && (actionIdentifier = helpPath.getActionIdentifier()) != null) {
                if (purchaseInformation != null && (product = purchaseInformation.getProduct()) != null) {
                    str = product.getId();
                }
                str = new CustomerCenterManagementOption.CustomAction(actionIdentifier, str);
            }
        } else {
            str = CustomerCenterManagementOption.Cancel.INSTANCE;
        }
        if (str != null) {
            CustomerCenterListener customerCenterListener = this.listener;
            if (customerCenterListener != null) {
                customerCenterListener.onManagementOptionSelected(str);
            }
            CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
            if (customerCenterListener2 != null) {
                customerCenterListener2.onManagementOptionSelected(str);
            }
        }
    }

    private final void notifyListenersForRestoreCompleted(CustomerInfo customerInfo) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreCompleted(customerInfo);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreCompleted(customerInfo);
        }
    }

    private final void notifyListenersForRestoreFailed(PurchasesError purchasesError) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreFailed(purchasesError);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreFailed(purchasesError);
        }
    }

    private final void notifyListenersForRestoreStarted() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreStarted();
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreStarted();
        }
    }

    private final CustomerCenterState.Success preservingUIStateIfRefresh(CustomerCenterState.Success success, boolean z, CustomerCenterState customerCenterState) {
        if (!z || !(customerCenterState instanceof CustomerCenterState.Success)) {
            return success;
        }
        CustomerCenterState.Success success2 = (CustomerCenterState.Success) customerCenterState;
        CustomerCenterNavigationState navigationState = success2.getNavigationState();
        CustomerCenterState.NavigationButtonType navigationButtonType = customerCenterState.getNavigationButtonType();
        return CustomerCenterState.Success.copy$default(success, null, null, null, success2.getDetailScreenPaths(), success2.getRestorePurchasesState(), null, navigationState, navigationButtonType, null, success2.getShowSupportTicketSuccessSnackbar(), false, 1319, null);
    }

    private final CustomerCenterState.Success resetToMainScreen(CustomerCenterState.Success success) {
        return CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().popToMain(), CustomerCenterState.NavigationButtonType.CLOSE, null, false, false, 1839, null);
    }

    private final void showManageSubscriptions(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + str + "&package=" + context.getPackageName())));
        } catch (ActivityNotFoundException e) {
            Logger.INSTANCE.e("Error opening manage subscriptions", e);
        }
    }

    private final void startGoogleProductCancellation(Context context, StoreProduct storeProduct) {
        GoogleStoreProduct googleStoreProduct = storeProduct instanceof GoogleStoreProduct ? (GoogleStoreProduct) storeProduct : null;
        if (googleStoreProduct == null) {
            Logger.INSTANCE.e("Expected GoogleStoreProduct for Play Store cancellation");
            return;
        }
        this.shouldRefreshOnResume = true;
        notifyListenersForManageSubscription();
        showManageSubscriptions(context, googleStoreProduct.getProductId());
    }

    private final void startManagementUrlCancellation(Context context, Uri uri) {
        this.shouldRefreshOnResume = true;
        notifyListenersForManageSubscription();
        String uri2 = uri.toString();
        kotlin.jvm.internal.t.f(uri2, "managementURL.toString()");
        openURL(context, uri2, CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL);
    }

    private final List supportedPaths(PurchaseInformation purchaseInformation, CustomerCenterConfigData.Screen screen, CustomerCenterConfigData.Localization localization) {
        List paths = screen.getPaths();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paths) {
            if (isPathAllowedForStore((CustomerCenterConfigData.HelpPath) obj, purchaseInformation)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (isPathAllowedForSubscriptionState((CustomerCenterConfigData.HelpPath) obj2, purchaseInformation)) {
                arrayList2.add(obj2);
            }
        }
        return transformPathsOnSubscriptionState(arrayList2, purchaseInformation, localization);
    }

    private final void trackCustomerCenterEventOptionChosen(CustomerCenterConfigData.HelpPath.PathType pathType, String str, String str2) {
        Locale c = ((j) this._lastLocaleList.getValue()).c(0);
        if (c == null) {
            c = Locale.getDefault();
        }
        Date date = new Date();
        boolean z = this.isDarkMode;
        String locale = c.toString();
        kotlin.jvm.internal.t.f(locale, "locale.toString()");
        this.purchases.track(new CustomerCenterSurveyOptionChosenEvent((CustomerCenterSurveyOptionChosenEvent.CreationData) null, new CustomerCenterSurveyOptionChosenEvent.Data(date, z, locale, 0, 0, (CustomerCenterDisplayMode) null, pathType, str, str2, (String) null, 568, (k) null), 1, (k) null));
    }

    private final List transformPathsOnSubscriptionState(List list, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CustomerCenterConfigData.HelpPath helpPath = (CustomerCenterConfigData.HelpPath) it.next();
            if (helpPath.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL && purchaseInformation != null && purchaseInformation.isCancelled()) {
                helpPath = CustomerCenterConfigData.HelpPath.copy$default(helpPath, (String) null, localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.RESUBSCRIBE), (CustomerCenterConfigData.HelpPath.PathType) null, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) null, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) null, (String) null, (CustomerCenterConfigData.HelpPath.OpenMethod) null, (String) null, 229, (Object) null);
            }
            arrayList.add(helpPath);
        }
        return arrayList;
    }

    private final void tryFallbackToCurrentOffering(Context context) {
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.Companion.getSharedInstance(), new 1(), new 2(context));
    }

    public void clearActionError() {
        this._actionError.setValue((Object) null);
    }

    public void contactSupport(Context context, String supportEmail) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(supportEmail, "supportEmail");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + supportEmail));
        intent.putExtra("android.intent.extra.SUBJECT", "Support Request");
        intent.putExtra("android.intent.extra.TEXT", "Support request details...");
        context.startActivity(Intent.createChooser(intent, "Contact Support"));
    }

    public void dismissPromotionalOffer(Context context, CustomerCenterConfigData.HelpPath originalPath) {
        Object value;
        Object obj;
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(originalPath, "originalPath");
        Object value2 = this._state.getValue();
        CustomerCenterState.Success success = value2 instanceof CustomerCenterState.Success ? (CustomerCenterState.Success) value2 : null;
        CustomerCenterDestination currentDestination = success != null ? success.getCurrentDestination() : null;
        mainPathAction(originalPath, context, currentDestination instanceof CustomerCenterDestination.PromotionalOffer ? ((CustomerCenterDestination.PromotionalOffer) currentDestination).getPurchaseInformation() : null);
        z zVar = this._state;
        do {
            value = zVar.getValue();
            obj = (CustomerCenterState) value;
            if (obj instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success2 = (CustomerCenterState.Success) obj;
                obj = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, success2.getNavigationState().popToMain(), CustomerCenterState.NavigationButtonType.CLOSE, null, false, false, 1855, null);
            }
        } while (!zVar.e(value, obj));
    }

    public Object dismissRestoreDialog(e eVar) {
        Object loadCustomerCenter = loadCustomerCenter(eVar);
        return loadCustomerCenter == c.f() ? loadCustomerCenter : I.a;
    }

    public void dismissSupportTicketSuccessSnackbar() {
        Object value;
        Object obj;
        z zVar = this._state;
        do {
            value = zVar.getValue();
            obj = (CustomerCenterState) value;
            if (obj instanceof CustomerCenterState.Success) {
                obj = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) obj, null, null, null, null, null, null, null, null, null, false, false, 1535, null);
            }
        } while (!zVar.e(value, obj));
    }

    public h2 getActionError() {
        return this._actionError;
    }

    public N getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAndDisplayPromotionalOffer(android.content.Context r29, com.revenuecat.purchases.models.StoreProduct r30, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer r31, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath r32, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r33, Ga.e r34) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.loadAndDisplayPromotionalOffer(android.content.Context, com.revenuecat.purchases.models.StoreProduct, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, Ga.e):java.lang.Object");
    }

    @InternalRevenueCatAPI
    public Object loadCustomerCenter(e eVar) {
        Object loadCustomerCenter = loadCustomerCenter(false, eVar);
        return loadCustomerCenter == c.f() ? loadCustomerCenter : I.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0013  */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.revenuecat.purchases.models.SubscriptionOption] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onAcceptedPromotionalOffer(com.revenuecat.purchases.models.SubscriptionOption r6, android.app.Activity r7, Ga.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.onAcceptedPromotionalOffer.1
            if (r0 == 0) goto L13
            r0 = r8
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.onAcceptedPromotionalOffer.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl r6 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl) r6
            Ca.t.b(r8)     // Catch: com.revenuecat.purchases.PurchasesException -> L30
            goto L93
        L30:
            r7 = move-exception
            goto L7f
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl r6 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl) r6
            Ca.t.b(r8)     // Catch: com.revenuecat.purchases.PurchasesException -> L30
            goto L72
        L42:
            Ca.t.b(r8)
            if (r7 != 0) goto L5f
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r7 = "Activity is null when accepting promotional offer"
            r6.e(r7)
            b0.C0 r6 = r5._actionError
            com.revenuecat.purchases.PurchasesError r7 = new com.revenuecat.purchases.PurchasesError
            com.revenuecat.purchases.PurchasesErrorCode r8 = com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError
            java.lang.String r0 = "Couldn't perform purchase"
            r7.<init>(r8, r0)
            r6.setValue(r7)
            Ca.I r6 = Ca.I.a
            return r6
        L5f:
            com.revenuecat.purchases.PurchaseParams$Builder r8 = new com.revenuecat.purchases.PurchaseParams$Builder
            r8.<init>(r7, r6)
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r6 = r5.purchases     // Catch: com.revenuecat.purchases.PurchasesException -> L7d
            r0.L$0 = r5     // Catch: com.revenuecat.purchases.PurchasesException -> L7d
            r0.label = r4     // Catch: com.revenuecat.purchases.PurchasesException -> L7d
            java.lang.Object r6 = r6.awaitPurchase(r8, r0)     // Catch: com.revenuecat.purchases.PurchasesException -> L7d
            if (r6 != r1) goto L71
            return r1
        L71:
            r6 = r5
        L72:
            r0.L$0 = r6     // Catch: com.revenuecat.purchases.PurchasesException -> L30
            r0.label = r3     // Catch: com.revenuecat.purchases.PurchasesException -> L30
            java.lang.Object r6 = r6.loadCustomerCenter(r0)     // Catch: com.revenuecat.purchases.PurchasesException -> L30
            if (r6 != r1) goto L93
            return r1
        L7d:
            r7 = move-exception
            r6 = r5
        L7f:
            com.revenuecat.purchases.PurchasesErrorCode r8 = r7.getCode()
            com.revenuecat.purchases.PurchasesErrorCode r0 = com.revenuecat.purchases.PurchasesErrorCode.PurchaseCancelledError
            if (r8 == r0) goto L93
            b0.C0 r8 = r6._actionError
            com.revenuecat.purchases.PurchasesError r7 = r7.getError()
            r8.setValue(r7)
            r6.goBackToMain()
        L93:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.onAcceptedPromotionalOffer(com.revenuecat.purchases.models.SubscriptionOption, android.app.Activity, Ga.e):java.lang.Object");
    }

    public void onActivityResumed() {
        if (this.shouldRefreshOnResume) {
            this.shouldRefreshOnResume = false;
            Logger.INSTANCE.d("Refreshing Customer Center after returning from manage subscriptions");
            launchRefreshIfPossible();
        }
    }

    public void onActivityStarted() {
        if (this.wasBackgrounded) {
            this.wasBackgrounded = false;
            if (this.shouldRefreshOnResume) {
                return;
            }
            launchRefreshIfPossible();
        }
    }

    public void onActivityStopped(boolean z) {
        if (z) {
            return;
        }
        this.wasBackgrounded = true;
    }

    public void onCustomActionSelected(CustomActionData customActionData) {
        kotlin.jvm.internal.t.g(customActionData, "customActionData");
        notifyListenersForCustomActionSelected(customActionData);
    }

    public void onNavigationButtonPressed(Context context, a onDismiss) {
        Object value;
        Object obj;
        CustomerCenterState.NavigationButtonType navigationButtonType;
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(onDismiss, "onDismiss");
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
            if (success.getCurrentDestination() instanceof CustomerCenterDestination.PromotionalOffer) {
                CustomerCenterDestination currentDestination = success.getCurrentDestination();
                kotlin.jvm.internal.t.e(currentDestination, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination.PromotionalOffer");
                dismissPromotionalOffer(context, ((CustomerCenterDestination.PromotionalOffer) currentDestination).getData().getOriginalPath());
                return;
            }
        }
        CustomerCenterState.NavigationButtonType navigationButtonType2 = ((CustomerCenterState) getState().getValue()).getNavigationButtonType();
        z zVar = this._state;
        do {
            value = zVar.getValue();
            CustomerCenterState customerCenterState2 = (CustomerCenterState) value;
            if ((customerCenterState2 instanceof CustomerCenterState.Success) && navigationButtonType2 == (navigationButtonType = CustomerCenterState.NavigationButtonType.BACK)) {
                CustomerCenterState.Success success2 = (CustomerCenterState.Success) customerCenterState2;
                if (success2.getNavigationState().getCanNavigateBack()) {
                    CustomerCenterNavigationState pop = success2.getNavigationState().pop();
                    if (!pop.getCanNavigateBack()) {
                        navigationButtonType = CustomerCenterState.NavigationButtonType.CLOSE;
                    }
                    obj = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, pop, navigationButtonType, null, false, false, 1855, null);
                } else {
                    obj = CustomerCenterState.NotLoaded.INSTANCE;
                }
            } else {
                obj = CustomerCenterState.NotLoaded.INSTANCE;
            }
        } while (!zVar.e(value, obj));
        if (navigationButtonType2 == CustomerCenterState.NavigationButtonType.CLOSE) {
            onDismiss.invoke();
        }
    }

    public void openURL(Context context, String url, CustomerCenterConfigData.HelpPath.OpenMethod method) {
        URLOpeningMethod uRLOpeningMethod;
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(url, "url");
        kotlin.jvm.internal.t.g(method, "method");
        int i = WhenMappings.$EnumSwitchMapping$1[method.ordinal()];
        if (i == 1) {
            uRLOpeningMethod = URLOpeningMethod.IN_APP_BROWSER;
        } else {
            if (i != 2) {
                throw new o();
            }
            uRLOpeningMethod = URLOpeningMethod.EXTERNAL_BROWSER;
        }
        URLOpener.INSTANCE.openURL$revenuecatui_defaultsBc8Release(context, url, uRLOpeningMethod);
    }

    public void pathButtonPressed(Context context, CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(path, "path");
        notifyListenersForManagementOptionSelected(path, purchaseInformation);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = path.getFeedbackSurvey();
        if (feedbackSurvey != null) {
            displayFeedbackSurvey(feedbackSurvey, new CustomerCenterViewModelImpl$pathButtonPressed$1$1(this, path, context, purchaseInformation));
        } else {
            i.d(W.a(this), null, null, new 2(context, purchaseInformation, path, null), 3, null);
        }
    }

    public void refreshColors(l currentColorScheme, boolean z) {
        kotlin.jvm.internal.t.g(currentColorScheme, "currentColorScheme");
        this.isDarkMode = z;
        this._colorScheme.setValue(currentColorScheme);
    }

    public Object refreshCustomerCenter(e eVar) {
        Object loadCustomerCenter = loadCustomerCenter(true, eVar);
        return loadCustomerCenter == c.f() ? loadCustomerCenter : I.a;
    }

    public void refreshStateIfLocaleChanged() {
        j currentLocaleList = getCurrentLocaleList();
        if (kotlin.jvm.internal.t.c(this._lastLocaleList.getValue(), currentLocaleList)) {
            return;
        }
        this._lastLocaleList.setValue(currentLocaleList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        r2 = com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success.copy$default((com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success) r2, null, null, null, null, com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesState.PURCHASES_NOT_FOUND, null, null, null, null, false, false, 2031, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object restorePurchases(Ga.e r23) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.restorePurchases(Ga.e):java.lang.Object");
    }

    public void selectPurchase(PurchaseInformation purchase) {
        Object value;
        Object obj;
        kotlin.jvm.internal.t.g(purchase, "purchase");
        z zVar = this._state;
        do {
            value = zVar.getValue();
            obj = (CustomerCenterState) value;
            if (obj instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) obj;
                CustomerCenterConfigData.Screen managementScreen = success.getCustomerCenterConfigData().getManagementScreen();
                if (managementScreen != null) {
                    obj = CustomerCenterState.Success.copy$default(success, null, null, null, PathUtils.INSTANCE.filterSubscriptionSpecificPaths(supportedPaths(purchase, managementScreen, success.getCustomerCenterConfigData().getLocalization())), null, null, success.getNavigationState().push(new CustomerCenterDestination.SelectedPurchaseDetail(purchase, managementScreen.getTitle())), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1847, null);
                } else {
                    Logger.INSTANCE.e("No management screen available in the customer center config data");
                    obj = new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No management screen available in the customer center config data"));
                }
            }
        } while (!zVar.e(value, obj));
    }

    public void showCreateSupportTicket() {
        Object value;
        Object obj;
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            z zVar = this._state;
            do {
                value = zVar.getValue();
                obj = (CustomerCenterState) value;
                if (obj instanceof CustomerCenterState.Success) {
                    CustomerCenterState.Success success = (CustomerCenterState.Success) obj;
                    obj = CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().push(new CustomerCenterDestination.CreateSupportTicket(new CreateSupportTicketData(new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1(this), new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$2(this), new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$3(this)), ((CustomerCenterState.Success) customerCenterState).getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SUPPORT_TICKET_CREATE))), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
                }
            } while (!zVar.e(value, obj));
        }
    }

    public void showPaywall(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            Offering noActiveScreenOffering = ((CustomerCenterState.Success) customerCenterState).getNoActiveScreenOffering();
            if (noActiveScreenOffering != null) {
                launchPaywallActivity(context, noActiveScreenOffering);
            } else {
                tryFallbackToCurrentOffering(context);
            }
        }
    }

    public void showVirtualCurrencyBalances() {
        Object value;
        Object obj;
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
            if (kotlin.jvm.internal.t.c(success.getCustomerCenterConfigData().getSupport().getDisplayVirtualCurrencies(), Boolean.TRUE)) {
                z zVar = this._state;
                do {
                    value = zVar.getValue();
                    obj = (CustomerCenterState) value;
                    if (obj instanceof CustomerCenterState.Success) {
                        CustomerCenterState.Success success2 = (CustomerCenterState.Success) obj;
                        obj = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, success2.getNavigationState().push(new CustomerCenterDestination.VirtualCurrencyBalances(success.getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER))), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
                    }
                } while (!zVar.e(value, obj));
            }
        }
    }

    public void trackImpressionIfNeeded() {
        if (this.impressionCreationData == null) {
            this.impressionCreationData = new CustomerCenterImpressionEvent.CreationData((UUID) null, (Date) null, 3, (k) null);
            Locale c = ((j) this._lastLocaleList.getValue()).c(0);
            if (c == null) {
                c = Locale.getDefault();
            }
            Date date = new Date();
            boolean z = this.isDarkMode;
            String locale = c.toString();
            kotlin.jvm.internal.t.f(locale, "locale.toString()");
            this.purchases.track(new CustomerCenterImpressionEvent((CustomerCenterImpressionEvent.CreationData) null, new CustomerCenterImpressionEvent.Data(date, z, locale, 0, 0, (CustomerCenterDisplayMode) null, 56, (k) null), 1, (k) null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:13|(4:14|15|16|17)|18|19|20|21|22|23|24|25|26|27|(1:28)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01e4, code lost:
    
        r11 = r0;
        r8 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01f7, code lost:
    
        com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE.e("Error refreshing Customer Center data, keeping existing state", r11);
        r2 = com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success.copy$default((com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success) r2, null, null, null, null, null, null, null, null, null, false, false, 1023, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01dc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01dd, code lost:
    
        r3 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e0, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e1, code lost:
    
        r3 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d A[Catch: PurchasesException -> 0x006a, TryCatch #6 {PurchasesException -> 0x006a, blocks: (B:62:0x0065, B:63:0x012b, B:64:0x0134, B:77:0x0079, B:78:0x00f9, B:80:0x010d), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0131  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object loadCustomerCenter(boolean r33, Ga.e r34) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.loadCustomerCenter(boolean, Ga.e):java.lang.Object");
    }

    public CustomerCenterViewModelImpl(PurchasesType purchases, DateFormatter dateFormatter, Locale locale, l colorScheme, boolean z, CustomerCenterListener customerCenterListener) {
        kotlin.jvm.internal.t.g(purchases, "purchases");
        kotlin.jvm.internal.t.g(dateFormatter, "dateFormatter");
        kotlin.jvm.internal.t.g(locale, "locale");
        kotlin.jvm.internal.t.g(colorScheme, "colorScheme");
        this.purchases = purchases;
        this.dateFormatter = dateFormatter;
        this.locale = locale;
        this.colorScheme = colorScheme;
        this.isDarkMode = z;
        this.listener = customerCenterListener;
        this._lastLocaleList = P.a(getCurrentLocaleList());
        this._colorScheme = P.a(colorScheme);
        z a = P.a(CustomerCenterState.NotLoaded.INSTANCE);
        this._state = a;
        this.state = g.H(g.D(a, new CustomerCenterViewModelImpl$state$1(this, null)), W.a(this), J.a.b(J.a, 5000L, 0L, 2, null), CustomerCenterState.Loading.INSTANCE);
        this._actionError = U1.i((Object) null, (T1) null, 2, (Object) null);
    }
}
