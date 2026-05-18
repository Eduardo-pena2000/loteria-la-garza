package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import android.content.Context;
import cb.O;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;

@f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1", f = "CustomerCenterViewModel.kt", l = {246}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1 extends l implements p {
    final /* synthetic */ Context $context;
    final /* synthetic */ CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option $it;
    final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
    final /* synthetic */ PurchaseInformation $purchaseInformation;
    int label;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, PurchaseInformation purchaseInformation, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option, CustomerCenterConfigData.HelpPath helpPath, e eVar) {
        super(2, eVar);
        this.this$0 = customerCenterViewModelImpl;
        this.$context = context;
        this.$purchaseInformation = purchaseInformation;
        this.$it = option;
        this.$path = helpPath;
    }

    public final e create(Object obj, e eVar) {
        return new CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(this.this$0, this.$context, this.$purchaseInformation, this.$it, this.$path, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
            Context context = this.$context;
            PurchaseInformation purchaseInformation = this.$purchaseInformation;
            StoreProduct product = purchaseInformation != null ? purchaseInformation.getProduct() : null;
            CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = this.$it.getPromotionalOffer();
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
            CustomerCenterViewModelImpl.access$goBackToMain(this.this$0);
            CustomerCenterViewModelImpl.access$mainPathAction(this.this$0, this.$path, this.$context, this.$purchaseInformation);
        }
        return I.a;
    }
}
