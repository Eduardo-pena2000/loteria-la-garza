package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetInitializationState implements GetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonGetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sdkPropertiesManager) {
        t.g(sessionRepository, "sessionRepository");
        t.g(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    public InitializationState invoke(boolean z) {
        return z ? InitializationStateKt.toBold(this.sdkPropertiesManager.getCurrentInitializationState()) : this.sessionRepository.getInitializationState();
    }
}
