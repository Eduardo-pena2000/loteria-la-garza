package com.unity3d.services.core.di;

import Ca.I;
import Qa.l;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends u implements l {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.a;
    }

    public final void invoke(Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
