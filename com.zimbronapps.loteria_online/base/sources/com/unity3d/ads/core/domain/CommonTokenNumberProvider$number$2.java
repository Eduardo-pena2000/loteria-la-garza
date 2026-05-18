package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonTokenNumberProvider$number$2 extends u implements Qa.a {
    final /* synthetic */ SessionRepository $sessionRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonTokenNumberProvider$number$2(SessionRepository sessionRepository) {
        super(0);
        this.$sessionRepository = sessionRepository;
    }

    public final Integer invoke() {
        return Integer.valueOf(this.$sessionRepository.getHeaderBiddingTokenCounter());
    }
}
