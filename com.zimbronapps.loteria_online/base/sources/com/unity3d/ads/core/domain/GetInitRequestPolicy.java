package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetInitRequestPolicy implements GetRequestPolicy {
    private final SessionRepository sessionRepository;

    public GetInitRequestPolicy(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public RequestPolicy invoke() {
        return new RequestPolicy(this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getMaxDuration(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryMaxInterval(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryWaitBase(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryJitterPct(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getRetryScalingFactor(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getConnectTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getReadTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getWriteTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getTimeoutPolicy().getOverallTimeoutMs(), this.sessionRepository.getNativeConfiguration().getInitPolicy().getRetryPolicy().getShouldStoreLocally());
    }
}
