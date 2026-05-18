package com.unity3d.ads.core.domain;

import Ga.e;
import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdRequestOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface GetAdRequest {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 4) != 0) {
                bannerSize = null;
            }
            return getAdRequest.invoke(str, byteString, bannerSize, eVar);
        }
    }

    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, e eVar);
}
