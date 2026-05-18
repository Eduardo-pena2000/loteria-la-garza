package com.unity3d.ads.core.extensions;

import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TransactionStateExtensionsKt {
    public static final TransactionEventRequestOuterClass.TransactionState fromPurchaseState(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TransactionEventRequestOuterClass.TransactionState.UNRECOGNIZED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PENDING : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_UNSPECIFIED : TransactionEventRequestOuterClass.TransactionState.TRANSACTION_STATE_PURCHASED;
    }
}
