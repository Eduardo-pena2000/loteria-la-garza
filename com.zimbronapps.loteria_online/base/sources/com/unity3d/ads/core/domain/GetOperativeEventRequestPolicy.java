package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetOperativeEventRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequestPolicy(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getOperativeEventPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
