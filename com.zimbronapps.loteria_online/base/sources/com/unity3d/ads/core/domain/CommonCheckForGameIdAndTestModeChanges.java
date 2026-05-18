package com.unity3d.ads.core.domain;

import Ca.x;
import Da.S;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonCheckForGameIdAndTestModeChanges implements CheckForGameIdAndTestModeChanges {
    private final GetGameId getGameId;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public CommonCheckForGameIdAndTestModeChanges(GetGameId getGameId, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(getGameId, "getGameId");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getGameId = getGameId;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    private final void sendDiagnostic(String str, Map map, boolean z) {
        if (z) {
            InitializeEventsMetricSender.getInstance().sendMetric(new Metric(str, map, null, 4, null));
        } else {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, str, null, map, null, null, null, 58, null);
        }
    }

    public void invoke(boolean z) {
        String invoke = this.getGameId.invoke();
        if (invoke == null) {
            invoke = "null";
        }
        String previousGameId = ClientProperties.getPreviousGameId();
        if (previousGameId == null) {
            previousGameId = "null";
        }
        Map l = S.l(x.a("previous_game_id", previousGameId), x.a("game_id", invoke));
        if (t.c(previousGameId, "null")) {
            return;
        }
        if (t.c(invoke, previousGameId)) {
            sendDiagnostic("native_initialize_game_id_same", l, z);
        } else {
            sendDiagnostic("native_initialize_game_id_changed", l, z);
        }
        boolean isTestMode = SdkProperties.isTestMode();
        boolean previousTestMode = SdkProperties.getPreviousTestMode();
        Map l2 = S.l(x.a("previous_test_mode", String.valueOf(previousTestMode)), x.a("test_mode", String.valueOf(isTestMode)));
        if (isTestMode != previousTestMode) {
            sendDiagnostic("native_initialize_test_mode_changed", l2, z);
        } else {
            sendDiagnostic("native_initialize_test_mode_same", l2, z);
        }
    }
}
