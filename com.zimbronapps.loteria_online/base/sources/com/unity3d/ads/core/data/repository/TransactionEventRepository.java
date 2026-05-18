package com.unity3d.ads.core.data.repository;

import fb.D;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface TransactionEventRepository {
    void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest);

    D getTransactionEvents();
}
