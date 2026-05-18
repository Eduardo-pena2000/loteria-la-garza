package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.domain.LegacyShowUseCase;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {206, 211}, m = "emit")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyShowUseCase$invoke$4$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase.4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase.4 r1, e eVar) {
        super(eVar);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (e) this);
    }
}
