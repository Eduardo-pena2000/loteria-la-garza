package com.unity3d.ads.core.data.repository;

import eb.a;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OperativeEventRepository {
    private final y _operativeEvents;
    private final D operativeEvents;

    public OperativeEventRepository() {
        y a = F.a(10, 10, a.b);
        this._operativeEvents = a;
        this.operativeEvents = g.a(a);
    }

    public final void addOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
        t.g(operativeEventRequest, "operativeEventRequest");
        this._operativeEvents.b(operativeEventRequest);
    }

    public final D getOperativeEvents() {
        return this.operativeEvents;
    }
}
