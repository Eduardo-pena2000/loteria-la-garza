package com.unity3d.ads.core.data.repository;

import Qa.l;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDiagnosticEventRepository$flush$events$4 extends u implements l {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$4(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    public final Boolean invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent it) {
        t.g(it, "it");
        return Boolean.valueOf(!AndroidDiagnosticEventRepository.access$getBlockedEvents$p(this.this$0).contains(it.getEventType()));
    }
}
