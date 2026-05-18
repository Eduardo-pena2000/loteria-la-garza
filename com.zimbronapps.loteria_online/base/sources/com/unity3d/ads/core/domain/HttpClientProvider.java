package com.unity3d.ads.core.domain;

import Ga.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface HttpClientProvider {

    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(HttpClientProvider httpClientProvider, boolean z, e eVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return httpClientProvider.invoke(z, eVar);
        }
    }

    Object invoke(boolean z, e eVar);
}
