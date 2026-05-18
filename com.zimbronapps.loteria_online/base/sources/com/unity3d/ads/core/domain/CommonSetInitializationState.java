package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.InitializationStateKt;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonSetInitializationState implements SetInitializationState {
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SessionRepository sessionRepository;

    public CommonSetInitializationState(SessionRepository sessionRepository, SDKPropertiesManager sdkPropertiesManager) {
        t.g(sessionRepository, "sessionRepository");
        t.g(sdkPropertiesManager, "sdkPropertiesManager");
        this.sessionRepository = sessionRepository;
        this.sdkPropertiesManager = sdkPropertiesManager;
    }

    public void invoke(InitializationState state, boolean z) {
        t.g(state, "state");
        if (z) {
            this.sdkPropertiesManager.setInitializeState(InitializationStateKt.toLegacy(state));
        } else {
            this.sessionRepository.setInitializationState(state);
        }
    }
}
