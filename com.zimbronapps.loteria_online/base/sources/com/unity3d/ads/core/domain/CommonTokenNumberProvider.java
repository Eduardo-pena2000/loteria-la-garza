package com.unity3d.ads.core.domain;

import Ca.l;
import Ca.m;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonTokenNumberProvider implements TokenNumberProvider {
    private final l number$delegate;

    public CommonTokenNumberProvider(SessionRepository sessionRepository) {
        t.g(sessionRepository, "sessionRepository");
        this.number$delegate = m.b(new CommonTokenNumberProvider$number$2(sessionRepository));
    }

    private final int getNumber() {
        return ((Number) this.number$delegate.getValue()).intValue();
    }

    public int invoke() {
        return getNumber();
    }
}
