package com.unity3d.ads.core.data.manager;

import Ca.I;
import Ca.s;
import Ca.t;
import cb.n;
import com.unity3d.ads.core.data.model.exception.TransactionException;
import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import fb.P;
import fb.z;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionEventManager$invoke$1$1$1 implements BillingInitializationListener {
    final /* synthetic */ n $it;
    private final z hasBeenResumed = P.a(Boolean.FALSE);
    final /* synthetic */ TransactionEventManager this$0;

    public TransactionEventManager$invoke$1$1$1(n nVar, TransactionEventManager transactionEventManager) {
        this.$it = nVar;
        this.this$0 = transactionEventManager;
    }

    private final void tryResume() {
        Object value;
        Boolean bool;
        if (this.$it.isActive()) {
            z zVar = this.hasBeenResumed;
            do {
                value = zVar.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!zVar.e(value, Boolean.TRUE));
            if (bool.booleanValue()) {
                return;
            }
            n nVar = this.$it;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(I.a));
        }
    }

    private final void tryResumeWithException(Exception exc) {
        Object value;
        Boolean bool;
        if (this.$it.isActive()) {
            z zVar = this.hasBeenResumed;
            do {
                value = zVar.getValue();
                bool = (Boolean) value;
                bool.booleanValue();
            } while (!zVar.e(value, Boolean.TRUE));
            if (bool.booleanValue()) {
                return;
            }
            n nVar = this.$it;
            s.a aVar = s.b;
            nVar.resumeWith(s.b(t.a(exc)));
        }
    }

    public final z getHasBeenResumed() {
        return this.hasBeenResumed;
    }

    public void onBillingServiceDisconnected() {
        tryResumeWithException(new TransactionException("Billing service disconnected"));
    }

    public void onBillingSetupFinished(BillingResultBridge billingResult) {
        kotlin.jvm.internal.t.g(billingResult, "billingResult");
        if (billingResult.getResponseCode() != BillingResultResponseCode.OK) {
            tryResumeWithException(new TransactionException("Billing setup failed"));
        } else {
            tryResume();
        }
    }

    public void onIsAlreadyInitialized() {
        tryResume();
    }

    public void onPurchaseUpdated(BillingResultBridge billingResult, List list) {
        kotlin.jvm.internal.t.g(billingResult, "billingResult");
        TransactionEventManager.access$onPurchasesReceived(this.this$0, billingResult, list, TransactionEventRequestOuterClass.TransactionOrigin.TRANSACTION_ORIGIN_LIVE_UPDATE);
    }
}
