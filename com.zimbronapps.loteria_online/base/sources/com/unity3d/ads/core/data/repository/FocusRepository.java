package com.unity3d.ads.core.data.repository;

import cb.K;
import cb.P;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.services.core.log.DeviceLog;
import fb.D;
import fb.F;
import fb.J;
import fb.g;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FocusRepository {
    private final D focusState;

    public FocusRepository(AndroidGetLifecycleFlow getLifecycleFlow, K defaultDispatcher) {
        D b;
        t.g(getLifecycleFlow, "getLifecycleFlow");
        t.g(defaultDispatcher, "defaultDispatcher");
        try {
            b = g.F(new FocusRepository$special$$inlined$map$1(new FocusRepository$special$$inlined$filter$1(getLifecycleFlow.invoke())), P.a(defaultDispatcher), J.a.c(), 1);
        } catch (Exception e) {
            DeviceLog.error("Could not subscribe to lifecycle flow", e);
            b = F.b(0, 0, null, 7, null);
        }
        this.focusState = b;
    }

    public final D getFocusState() {
        return this.focusState;
    }
}
