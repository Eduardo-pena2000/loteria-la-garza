package com.unity3d.ads.core.domain;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion(null);
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @f(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {14, 17}, m = "invoke")
    public static final class 1 extends d {
        int I$0;
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
            return CommonGetHeaderBiddingToken.this.invoke(0, null, this);
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, SessionRepository sessionRepository) {
        t.g(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        t.g(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        t.g(sessionRepository, "sessionRepository");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r9, com.unity3d.ads.TokenConfiguration r10, Ga.e r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke.1
            if (r0 == 0) goto L13
            r0 = r11
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r9 = r0.L$0
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r9 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r9
            Ca.t.b(r11)
            goto L8e
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.TokenConfiguration r10 = (com.unity3d.ads.TokenConfiguration) r10
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken r2 = (com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken) r2
            Ca.t.b(r11)
            goto L67
        L47:
            Ca.t.b(r11)
            com.unity3d.ads.core.domain.BuildHeaderBiddingToken r11 = r8.buildHeaderBiddingToken
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r8.sessionRepository
            java.util.List r2 = r2.getScarEligibleFormats()
            boolean r2 = r2.isEmpty()
            r2 = r2 ^ r5
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r5
            java.lang.Object r11 = r11.invoke(r9, r10, r2, r0)
            if (r11 != r1) goto L66
            return r1
        L66:
            r2 = r8
        L67:
            gatewayprotocol.v1.HeaderBiddingTokenOuterClass$HeaderBiddingToken r11 = (gatewayprotocol.v1.HeaderBiddingTokenOuterClass.HeaderBiddingToken) r11
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r2.sessionRepository
            java.util.List r6 = r6.getScarEligibleFormats()
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L8f
            com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase r2 = r2.fetchSignalsAndSendUseCase
            com.google.protobuf.ByteString r6 = r11.getTokenId()
            java.lang.String r7 = "rawToken.tokenId"
            kotlin.jvm.internal.t.f(r6, r7)
            r0.L$0 = r11
            r0.L$1 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r6, r10, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            r9 = r11
        L8e:
            r11 = r9
        L8f:
            com.google.protobuf.ByteString r9 = r11.toByteString()
            java.lang.String r10 = "rawToken.toByteString()"
            kotlin.jvm.internal.t.f(r9, r10)
            r10 = 0
            java.lang.String r9 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64$default(r9, r10, r5, r3)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "2:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, Ga.e):java.lang.Object");
    }
}
