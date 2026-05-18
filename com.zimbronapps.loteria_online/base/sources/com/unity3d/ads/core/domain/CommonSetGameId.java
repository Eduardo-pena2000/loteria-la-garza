package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonSetGameId implements SetGameId {
    private final SessionRepository sessionRepository;

    public CommonSetGameId(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public void invoke(String str) {
        this.sessionRepository.setGameId(str);
    }
}
