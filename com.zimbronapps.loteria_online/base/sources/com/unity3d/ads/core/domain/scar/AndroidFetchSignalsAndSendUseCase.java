package com.unity3d.ads.core.domain.scar;

import Ca.I;
import Da.u;
import Da.v;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.google.protobuf.ByteString;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.AdFormatOuterClass;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFetchSignalsAndSendUseCase implements FetchSignalsAndSendUseCase {
    private final HandleGetTokenRequest handleGetTokenRequest;
    private final ScarManager scarManager;
    private final O scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    @f(c = "com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase$invoke$2", f = "AndroidFetchSignalsAndSendUseCase.kt", l = {36, 56}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        final /* synthetic */ TokenConfiguration $tokenConfiguration;
        final /* synthetic */ ByteString $tokenId;
        final /* synthetic */ int $tokenNumber;
        long J$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(TokenConfiguration tokenConfiguration, int i, ByteString byteString, e eVar) {
            super(2, eVar);
            this.$tokenConfiguration = tokenConfiguration;
            this.$tokenNumber = i;
            this.$tokenId = byteString;
        }

        public final e create(Object obj, e eVar) {
            2 r6 = AndroidFetchSignalsAndSendUseCase.this.new 2(this.$tokenConfiguration, this.$tokenNumber, this.$tokenId, eVar);
            r6.L$0 = obj;
            return r6;
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 304
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.AndroidFetchSignalsAndSendUseCase.invoke.2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public AndroidFetchSignalsAndSendUseCase(O scope, SessionRepository sessionRepository, ScarManager scarManager, HandleGetTokenRequest handleGetTokenRequest, SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(scope, "scope");
        t.g(sessionRepository, "sessionRepository");
        t.g(scarManager, "scarManager");
        t.g(handleGetTokenRequest, "handleGetTokenRequest");
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.sessionRepository = sessionRepository;
        this.scarManager = scarManager;
        this.handleGetTokenRequest = handleGetTokenRequest;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public static final /* synthetic */ HandleGetTokenRequest access$getHandleGetTokenRequest$p(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase) {
        return androidFetchSignalsAndSendUseCase.handleGetTokenRequest;
    }

    public static final /* synthetic */ List access$getRequestedSignalFormats(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase, TokenConfiguration tokenConfiguration) {
        return androidFetchSignalsAndSendUseCase.getRequestedSignalFormats(tokenConfiguration);
    }

    public static final /* synthetic */ ScarManager access$getScarManager$p(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase) {
        return androidFetchSignalsAndSendUseCase.scarManager;
    }

    public static final /* synthetic */ SendDiagnosticEvent access$getSendDiagnosticEvent$p(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase) {
        return androidFetchSignalsAndSendUseCase.sendDiagnosticEvent;
    }

    public static final /* synthetic */ Map access$getTags(AndroidFetchSignalsAndSendUseCase androidFetchSignalsAndSendUseCase) {
        return androidFetchSignalsAndSendUseCase.getTags();
    }

    private final List getRequestedSignalFormats(TokenConfiguration tokenConfiguration) {
        List e;
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        AdFormatOuterClass.AdFormat protoAdFormat = AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return (protoAdFormat == null || (e = u.e(protoAdFormat)) == null) ? v.n() : e;
    }

    private final Map getTags() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER)) {
            linkedHashMap.put("banner", "true");
        }
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_REWARDED)) {
            linkedHashMap.put("rewarded", "true");
        }
        if (scarEligibleFormats.contains(AdFormatOuterClass.AdFormat.AD_FORMAT_INTERSTITIAL)) {
            linkedHashMap.put("interstitial", "true");
        }
        return linkedHashMap;
    }

    public Object invoke(int i, ByteString byteString, TokenConfiguration tokenConfiguration, e eVar) {
        i.d(this.scope, null, null, new 2(tokenConfiguration, i, byteString, null), 3, null);
        return I.a;
    }
}
