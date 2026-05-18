package com.revenuecat.purchases.hybridcommon.mappers;

import Qa.a;
import cb.K;
import cb.e0;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class MappersHelpersKt$mapperDispatcher$2 extends u implements a {
    public static final MappersHelpersKt$mapperDispatcher$2 INSTANCE = new MappersHelpersKt$mapperDispatcher$2();

    public MappersHelpersKt$mapperDispatcher$2() {
        super(0);
    }

    public final K invoke() {
        K overrideMapperDispatcher = MappersHelpersKt.getOverrideMapperDispatcher();
        return overrideMapperDispatcher == null ? e0.a() : overrideMapperDispatcher;
    }
}
