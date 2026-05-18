package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import Ca.I;
import Qa.a;
import Qa.r;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1 extends u implements r {
    final /* synthetic */ CustomerCenterViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1(CustomerCenterViewModelImpl customerCenterViewModelImpl) {
        super(4);
        this.this$0 = customerCenterViewModelImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((String) obj, (String) obj2, (a) obj3, (a) obj4);
        return I.a;
    }

    public final void invoke(String email, String description, a onSuccess, a onError) {
        t.g(email, "email");
        t.g(description, "description");
        t.g(onSuccess, "onSuccess");
        t.g(onError, "onError");
        CustomerCenterViewModelImpl.access$handleSupportTicketSubmit(this.this$0, email, description, onSuccess, onError);
    }
}
