package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ca.I;
import Qa.l;
import android.content.Context;
import androidx.lifecycle.W;
import cb.i;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl$pathButtonPressed$1$1 extends u implements l {
    final /* synthetic */ Context $context;
    final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
    final /* synthetic */ PurchaseInformation $purchaseInformation;
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterViewModelImpl$pathButtonPressed$1$1(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation) {
        super(1);
        this.this$0 = customerCenterViewModelImpl;
        this.$path = helpPath;
        this.$context = context;
        this.$purchaseInformation = purchaseInformation;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option) obj);
        return I.a;
    }

    public final void invoke(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        if (option != null) {
            CustomerCenterViewModelImpl customerCenterViewModelImpl = this.this$0;
            CustomerCenterConfigData.HelpPath helpPath = this.$path;
            Context context = this.$context;
            PurchaseInformation purchaseInformation = this.$purchaseInformation;
            CustomerCenterViewModelImpl.access$trackCustomerCenterEventOptionChosen(customerCenterViewModelImpl, helpPath.getType(), helpPath.getUrl(), option.getId());
            CustomerCenterViewModelImpl.access$notifyListenersForFeedbackSurveyCompleted(customerCenterViewModelImpl, option.getId());
            if (i.d(W.a(customerCenterViewModelImpl), null, null, new CustomerCenterViewModelImpl$pathButtonPressed$1$1$1$1(customerCenterViewModelImpl, context, purchaseInformation, option, helpPath, null), 3, null) != null) {
                return;
            }
        }
        CustomerCenterViewModelImpl.access$goBackToMain(this.this$0);
        I i = I.a;
    }
}
