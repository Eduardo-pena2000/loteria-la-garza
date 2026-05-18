package com.unity3d.ads.beta;

import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ShowOptions {
    private final Map extras;

    public ShowOptions() {
        this(null, 1, null);
    }

    public final Map getExtras() {
        return this.extras;
    }

    public ShowOptions(Map extras) {
        t.g(extras, "extras");
        this.extras = extras;
    }

    public /* synthetic */ ShowOptions(Map map, int i, k kVar) {
        this((i & 1) != 0 ? S.h() : map);
    }
}
