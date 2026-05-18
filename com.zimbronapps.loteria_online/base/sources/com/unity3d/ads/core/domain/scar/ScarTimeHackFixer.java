package com.unity3d.ads.core.domain.scar;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ScarTimeHackFixer {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public ScarTimeHackFixer(SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final int invoke(int i) {
        if (i >= 1000) {
            return i;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_scar_video_length_in_sec", null, null, null, null, null, 62, null);
        return i * 1000;
    }
}
