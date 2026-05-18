package com.unity3d.ads.core.domain;

import Ga.e;
import com.unity3d.ads.TokenConfiguration;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface BuildHeaderBiddingToken {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, boolean z, e eVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i2 & 2) != 0) {
                tokenConfiguration = null;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            return buildHeaderBiddingToken.invoke(i, tokenConfiguration, z, eVar);
        }
    }

    Object invoke(int i, TokenConfiguration tokenConfiguration, boolean z, e eVar);
}
