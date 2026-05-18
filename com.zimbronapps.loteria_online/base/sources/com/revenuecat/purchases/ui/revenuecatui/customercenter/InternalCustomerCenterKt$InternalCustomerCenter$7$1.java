package com.revenuecat.purchases.ui.revenuecatui.customercenter;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Qa.l;
import Qa.p;
import android.app.Activity;
import android.content.Context;
import cb.O;
import cb.i;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.actions.CustomerCenterAction;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InternalCustomerCenterKt$InternalCustomerCenter$7$1 extends u implements l {
    final /* synthetic */ Context $context;
    final /* synthetic */ O $coroutineScope;
    final /* synthetic */ Qa.a $onDismiss;
    final /* synthetic */ CustomerCenterViewModel $viewModel;

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$1", f = "InternalCustomerCenter.kt", l = {167}, m = "invokeSuspend")
    public static final class 1 extends Ia.l implements p {
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(CustomerCenterViewModel customerCenterViewModel, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$viewModel, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                this.label = 1;
                if (customerCenterViewModel.restorePurchases(this) == f) {
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

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$2", f = "InternalCustomerCenter.kt", l = {173}, m = "invokeSuspend")
    public static final class 2 extends Ia.l implements p {
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(CustomerCenterViewModel customerCenterViewModel, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
        }

        public final e create(Object obj, e eVar) {
            return new 2(this.$viewModel, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                this.label = 1;
                if (customerCenterViewModel.dismissRestoreDialog(this) == f) {
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

    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.InternalCustomerCenterKt$InternalCustomerCenter$7$1$3", f = "InternalCustomerCenter.kt", l = {188}, m = "invokeSuspend")
    public static final class 3 extends Ia.l implements p {
        final /* synthetic */ CustomerCenterAction $action;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ CustomerCenterViewModel $viewModel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(CustomerCenterViewModel customerCenterViewModel, CustomerCenterAction customerCenterAction, Activity activity, e eVar) {
            super(2, eVar);
            this.$viewModel = customerCenterViewModel;
            this.$action = customerCenterAction;
            this.$activity = activity;
        }

        public final e create(Object obj, e eVar) {
            return new 3(this.$viewModel, this.$action, this.$activity, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((3) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                CustomerCenterViewModel customerCenterViewModel = this.$viewModel;
                SubscriptionOption subscriptionOption = ((CustomerCenterAction.PurchasePromotionalOffer) this.$action).getSubscriptionOption();
                Activity activity = this.$activity;
                this.label = 1;
                if (customerCenterViewModel.onAcceptedPromotionalOffer(subscriptionOption, activity, this) == f) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalCustomerCenterKt$InternalCustomerCenter$7$1(CustomerCenterViewModel customerCenterViewModel, Context context, O o, Qa.a aVar) {
        super(1);
        this.$viewModel = customerCenterViewModel;
        this.$context = context;
        this.$coroutineScope = o;
        this.$onDismiss = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterAction) obj);
        return I.a;
    }

    public final void invoke(CustomerCenterAction action) {
        kotlin.jvm.internal.t.g(action, "action");
        if (action instanceof CustomerCenterAction.PathButtonPressed) {
            CustomerCenterAction.PathButtonPressed pathButtonPressed = (CustomerCenterAction.PathButtonPressed) action;
            this.$viewModel.pathButtonPressed(this.$context, pathButtonPressed.getPath(), pathButtonPressed.getPurchaseInformation());
            return;
        }
        if (action instanceof CustomerCenterAction.PerformRestore) {
            i.d(this.$coroutineScope, null, null, new 1(this.$viewModel, null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.DismissRestoreDialog) {
            i.d(this.$coroutineScope, null, null, new 2(this.$viewModel, null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.ContactSupport) {
            this.$viewModel.contactSupport(this.$context, ((CustomerCenterAction.ContactSupport) action).getEmail());
            return;
        }
        if (action instanceof CustomerCenterAction.OpenURL) {
            CustomerCenterViewModel.DefaultImpls.openURL$default(this.$viewModel, this.$context, ((CustomerCenterAction.OpenURL) action).getUrl(), null, 4, null);
            return;
        }
        if (action instanceof CustomerCenterAction.NavigationButtonPressed) {
            this.$viewModel.onNavigationButtonPressed(this.$context, this.$onDismiss);
            return;
        }
        if (action instanceof CustomerCenterAction.DismissPromotionalOffer) {
            this.$viewModel.dismissPromotionalOffer(this.$context, ((CustomerCenterAction.DismissPromotionalOffer) action).getOriginalPath());
            return;
        }
        if (action instanceof CustomerCenterAction.PurchasePromotionalOffer) {
            i.d(this.$coroutineScope, null, null, new 3(this.$viewModel, action, ContextExtensionsKt.getActivity(this.$context), null), 3, null);
            return;
        }
        if (action instanceof CustomerCenterAction.CustomActionSelected) {
            this.$viewModel.onCustomActionSelected(((CustomerCenterAction.CustomActionSelected) action).getCustomActionData());
            return;
        }
        if (action instanceof CustomerCenterAction.SelectPurchase) {
            this.$viewModel.selectPurchase(((CustomerCenterAction.SelectPurchase) action).getPurchase());
            return;
        }
        if (action instanceof CustomerCenterAction.ShowPaywall) {
            this.$viewModel.showPaywall(this.$context);
            return;
        }
        if (action instanceof CustomerCenterAction.ShowVirtualCurrencyBalances) {
            this.$viewModel.showVirtualCurrencyBalances();
        } else if (action instanceof CustomerCenterAction.ShowSupportTicketCreation) {
            this.$viewModel.showCreateSupportTicket();
        } else if (action instanceof CustomerCenterAction.DismissSupportTicketSuccessSnackbar) {
            this.$viewModel.dismissSupportTicketSuccessSnackbar();
        }
    }
}
