package com.revenuecat.purchases;

import Ca.I;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class CustomerInfoHelper$retrieveCustomerInfo$1$1 extends u implements Qa.a {
    final /* synthetic */ ReceiveCustomerInfoCallback $cb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoHelper$retrieveCustomerInfo$1$1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(0);
        this.$cb = receiveCustomerInfoCallback;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return I.a;
    }

    public final void invoke() {
        this.$cb.onReceived(CustomerInfoHelper.Companion.createPreviewCustomerInfo$purchases_defaultsBc8Release());
    }
}
