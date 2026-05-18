package com.unity3d.services.store.gpbl.bridges.billingclient.v8;

import Ca.x;
import Da.S;
import com.unity3d.services.store.gpbl.bridges.billingclient.IBillingClientBuilderBridge;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBridgeCommon;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class BillingClientBuilderBridge extends BillingClientBuilderBridgeCommon {
    public static final Companion Companion = new Companion(null);
    public static final String ENABLE_PENDING_PURCHASES_METHOD = "enablePendingPurchases";

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public BillingClientBuilderBridge(Object obj) {
        super(obj, S.j(x.a("enablePendingPurchases", new Class[]{PendingPurchasesParamsBridge.Companion.getClassForParams()})));
    }

    public IBillingClientBuilderBridge enablePendingPurchases() {
        this._billingClientBuilderInternalInstance = callNonVoidMethod("enablePendingPurchases", this._billingClientBuilderInternalInstance, PendingPurchasesParamsBridge.Companion.newBuilder().enableOneTimeProducts().build().getInternalClass());
        return this;
    }

    public BillingClientBridgeCommon build() throws ClassNotFoundException {
        return new BillingClientBridge(callNonVoidMethod("build", this._billingClientBuilderInternalInstance, new Object[0]));
    }
}
