package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoUpdateHandler$notifyListeners$2$4 extends u implements Qa.a {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoUpdateHandler$notifyListeners$2$4(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
