package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements PurchasesResponseListener {
    public final /* synthetic */ TransactionEventManager a;

    public /* synthetic */ b(TransactionEventManager transactionEventManager) {
        this.a = transactionEventManager;
    }

    public final void onPurchaseResponse(BillingResultBridge billingResultBridge, List list) {
        TransactionEventManager.1.a(this.a, billingResultBridge, list);
    }
}
