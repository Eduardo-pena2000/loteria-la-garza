package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.domain.GetByteStringId;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.ads.core.extensions.TransactionStateExtensionsKt;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import gatewayprotocol.v1.TransactionDataKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetTransactionData implements GetTransactionData {
    private final GetByteStringId getByteStringId;

    public AndroidGetTransactionData(GetByteStringId getByteStringId) {
        t.g(getByteStringId, "getByteStringId");
        this.getByteStringId = getByteStringId;
    }

    public TransactionEventRequestOuterClass.TransactionData invoke(PurchaseBridge purchaseDetail, String productDetailJson) {
        t.g(purchaseDetail, "purchaseDetail");
        t.g(productDetailJson, "productDetailJson");
        TransactionDataKt.Dsl.Companion companion = TransactionDataKt.Dsl.Companion;
        TransactionEventRequestOuterClass.TransactionData.Builder newBuilder = TransactionEventRequestOuterClass.TransactionData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TransactionDataKt.Dsl _create = companion._create(newBuilder);
        _create.setProductId(purchaseDetail.getOriginalJson().get("productId").toString());
        _create.setEventId(this.getByteStringId.invoke());
        Object obj = purchaseDetail.getOriginalJson().get("purchaseTime");
        t.e(obj, "null cannot be cast to non-null type kotlin.Long");
        _create.setTimestamp(TimestampExtensionsKt.fromMillis(((Long) obj).longValue()));
        _create.setTransactionId(purchaseDetail.getOriginalJson().get("orderId").toString());
        _create.setProduct(productDetailJson);
        String jSONObject = purchaseDetail.getOriginalJson().toString();
        t.f(jSONObject, "purchaseDetail.originalJson.toString()");
        _create.setTransaction(jSONObject);
        String signature = purchaseDetail.getSignature();
        t.f(signature, "purchaseDetail.signature");
        _create.setSignature(signature);
        Object obj2 = purchaseDetail.getOriginalJson().get("purchaseState");
        t.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        _create.setTransactionState(TransactionStateExtensionsKt.fromPurchaseState(((Integer) obj2).intValue()));
        return _create._build();
    }
}
