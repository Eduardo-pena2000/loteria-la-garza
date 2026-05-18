package com.unity3d.ads.core.domain.om;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidOmStartSession extends AndroidOmInteraction {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @f(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
    public static final class 1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidOmStartSession.this.invoke(null, null, this);
        }
    }

    public AndroidOmStartSession(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(openMeasurementRepository, "openMeasurementRepository");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(com.unity3d.ads.core.data.model.AdObject r12, org.json.JSONObject r13, Ga.e r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.om.AndroidOmStartSession.invoke.1
            if (r0 == 0) goto L13
            r0 = r14
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1 r0 = new com.unity3d.ads.core.domain.om.AndroidOmStartSession$invoke$1
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r12 = r0.L$1
            com.unity3d.ads.core.data.model.AdObject r12 = (com.unity3d.ads.core.data.model.AdObject) r12
            java.lang.Object r13 = r0.L$0
            com.unity3d.ads.core.domain.om.AndroidOmStartSession r13 = (com.unity3d.ads.core.domain.om.AndroidOmStartSession) r13
            Ca.t.b(r14)
        L30:
            r7 = r12
            goto L5a
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            Ca.t.b(r14)
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r14 = r11.openMeasurementRepository
            com.google.protobuf.ByteString r2 = r12.getOpportunityId()
            android.webkit.WebView r4 = r11.getWebview(r12)
            com.unity3d.ads.core.data.model.OmidOptions r13 = r11.getOMidOptions(r13)
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r14 = r14.startSession(r2, r4, r13, r0)
            if (r14 != r1) goto L58
            return r1
        L58:
            r13 = r11
            goto L30
        L5a:
            com.unity3d.ads.core.data.model.OMResult r14 = (com.unity3d.ads.core.data.model.OMResult) r14
            boolean r12 = r14 instanceof com.unity3d.ads.core.data.model.OMResult.Success
            if (r12 == 0) goto L6f
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r13.sendDiagnosticEvent
            r9 = 46
            r10 = 0
            java.lang.String r3 = "om_session_start_success"
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto La4
        L6f:
            boolean r12 = r14 instanceof com.unity3d.ads.core.data.model.OMResult.Failure
            if (r12 == 0) goto La4
            com.unity3d.ads.core.domain.SendDiagnosticEvent r2 = r13.sendDiagnosticEvent
            java.util.Map r12 = Da.Q.c()
            com.unity3d.ads.core.data.model.OMResult$Failure r14 = (com.unity3d.ads.core.data.model.OMResult.Failure) r14
            java.lang.String r13 = r14.getReason()
            java.lang.String r0 = "reason"
            r12.put(r0, r13)
            java.lang.String r13 = r14.getReasonDebug()
            if (r13 == 0) goto L93
            java.lang.String r13 = "reason_debug"
            java.lang.String r14 = r14.getReasonDebug()
            r12.put(r13, r14)
        L93:
            Ca.I r13 = Ca.I.a
            java.util.Map r5 = Da.Q.b(r12)
            r9 = 42
            r10 = 0
            java.lang.String r3 = "om_session_start_failure"
            r4 = 0
            r6 = 0
            r8 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
        La4:
            Ca.I r12 = Ca.I.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.om.AndroidOmStartSession.invoke(com.unity3d.ads.core.data.model.AdObject, org.json.JSONObject, Ga.e):java.lang.Object");
    }
}
