package com.unity3d.ads.core.data.repository;

import fb.D;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface DiagnosticEventRepository {
    void addDiagnosticEvent(DiagnosticEventRequestOuterClass.DiagnosticEvent diagnosticEvent);

    void clear();

    void configure(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration);

    void flush();

    D getDiagnosticEvents();
}
