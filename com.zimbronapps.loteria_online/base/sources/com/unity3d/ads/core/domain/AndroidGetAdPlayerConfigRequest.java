package com.unity3d.ads.core.domain;

import Ga.e;
import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidGetAdPlayerConfigRequest implements GetAdPlayerConfigRequest {
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public AndroidGetAdPlayerConfigRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad) {
        t.g(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
    }

    public Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, e eVar) {
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setConfigurationToken(byteString2);
        _create.setPlacementId(str);
        _create.setImpressionOpportunityId(byteString);
        if (adFormat != null) {
            _create.setAdFormat(adFormat);
        }
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest _build = _create._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder newBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        t.f(newBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl _create2 = companion2._create(newBuilder2);
        _create2.setAdPlayerConfigRequest(_build);
        return this.getUniversalRequestForPayLoad.invoke(_create2._build(), eVar);
    }
}
