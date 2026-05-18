package com.unity3d.ads.core.data.repository;

import Qa.l;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidDiagnosticEventRepository$flush$events$2 extends u implements l {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$flush$events$2(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(1);
        this.this$0 = androidDiagnosticEventRepository;
    }

    public final DiagnosticEventRequestOuterClass.DiagnosticEvent invoke(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent) {
        return diagnosticEvent == null ? AndroidDiagnosticEventRepository.access$getGetDiagnosticEventRequest$p(this.this$0).invoke("null_diagnostic_event", null, null, null, null, null, null, null, null) : diagnosticEvent;
    }
}
