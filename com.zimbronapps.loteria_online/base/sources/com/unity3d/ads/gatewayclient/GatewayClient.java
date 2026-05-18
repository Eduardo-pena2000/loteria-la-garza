package com.unity3d.ads.gatewayclient;

import Ga.e;
import com.unity3d.ads.core.data.model.OperationType;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface GatewayClient {

    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 1) != 0) {
                str = "https://gateway.unityads.unity3d.com/v1";
            }
            String str2 = str;
            if ((i & 8) != 0) {
                operationType = OperationType.UNKNOWN;
            }
            return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, eVar);
        }
    }

    Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, e eVar);
}
