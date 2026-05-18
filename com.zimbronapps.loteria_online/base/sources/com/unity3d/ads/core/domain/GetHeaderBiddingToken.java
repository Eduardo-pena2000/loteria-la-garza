package com.unity3d.ads.core.domain;

import Ga.e;
import com.unity3d.ads.TokenConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface GetHeaderBiddingToken {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetHeaderBiddingToken getHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            return getHeaderBiddingToken.invoke(i, tokenConfiguration, eVar);
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, e eVar);
}
