package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$16 extends u implements Qa.a {
    public static final HandleInvocationsFromAdViewer$invoke$definition$16 INSTANCE = new HandleInvocationsFromAdViewer$invoke$definition$16();

    public HandleInvocationsFromAdViewer$invoke$definition$16() {
        super(0);
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.setStorage();
    }
}
