package com.unity3d.ads.core.domain.scar;

import Ga.e;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, e eVar) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        _create.setTokenId(byteString);
        String it = biddingSignals.getRvSignal();
        if (it != null) {
            t.f(it, "it");
            _create.setRewarded(ByteStringsKt.toByteStringUtf8(it));
        }
        String it2 = biddingSignals.getInterstitialSignal();
        if (it2 != null) {
            t.f(it2, "it");
            _create.setInterstitial(ByteStringsKt.toByteStringUtf8(it2));
        }
        String it3 = biddingSignals.getBannerSignal();
        if (it3 != null) {
            t.f(it3, "it");
            _create.setBanner(ByteStringsKt.toByteStringUtf8(it3));
        }
        return _create._build();
    }
}
