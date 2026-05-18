package com.unity3d.ads;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TokenConfiguration {
    private final AdFormat adFormat;
    private final Map extras;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TokenConfiguration(AdFormat adFormat) {
        this(adFormat, null, 2, null);
        t.g(adFormat, "adFormat");
    }

    public final AdFormat getAdFormat() {
        return this.adFormat;
    }

    public final Map getExtras() {
        return this.extras;
    }

    public TokenConfiguration(AdFormat adFormat, Map extras) {
        t.g(adFormat, "adFormat");
        t.g(extras, "extras");
        this.adFormat = adFormat;
        this.extras = extras;
    }

    public /* synthetic */ TokenConfiguration(AdFormat adFormat, Map map, int i, k kVar) {
        this(adFormat, (i & 2) != 0 ? S.h() : map);
    }
}
