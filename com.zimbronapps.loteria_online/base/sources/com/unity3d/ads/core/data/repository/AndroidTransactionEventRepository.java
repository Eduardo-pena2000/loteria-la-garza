package com.unity3d.ads.core.data.repository;

import eb.a;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidTransactionEventRepository implements TransactionEventRepository {
    private final y _transactionEvents;
    private final D transactionEvents;

    public AndroidTransactionEventRepository() {
        y a = F.a(10, 10, a.b);
        this._transactionEvents = a;
        this.transactionEvents = g.a(a);
    }

    public void addTransactionEvent(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
        t.g(transactionEventRequest, "transactionEventRequest");
        this._transactionEvents.b(transactionEventRequest);
    }

    public D getTransactionEvents() {
        return this.transactionEvents;
    }
}
