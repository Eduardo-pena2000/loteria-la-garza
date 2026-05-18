package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    public boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy) {
        t.g(universalRequest, "universalRequest");
        t.g(requestPolicy, "requestPolicy");
        return System.currentTimeMillis() - (universalRequest.getSharedData().getTimestamps().getTimestamp().getSeconds() * ((long) 1000)) < ((long) requestPolicy.getMaxDuration());
    }
}
