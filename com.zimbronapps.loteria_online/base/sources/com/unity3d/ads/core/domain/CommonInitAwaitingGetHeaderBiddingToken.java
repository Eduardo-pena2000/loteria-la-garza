package com.unity3d.ads.core.domain;

import Ca.I;
import Ca.t;
import Ca.x;
import Da.Q;
import Da.S;
import Da.r;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;
import Ia.l;
import Qa.p;
import ab.k;
import cb.O;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.AwaitInitialization;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.Map;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {73}, m = "fetchToken")
    public static final class 1 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.access$fetchToken(CommonInitAwaitingGetHeaderBiddingToken.this, 0, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {54, 66}, m = "invoke")
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
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    @f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {57}, m = "invokeSuspend")
    public static final class 2 extends l implements p {
        int label;

        public 2(e eVar) {
            super(2, eVar);
        }

        public final e create(Object obj, e eVar) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new 2(eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((2) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = c.f();
            int i = this.label;
            if (i == 0) {
                t.b(obj);
                if (r.O(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.access$setDidAwaitInit$p(CommonInitAwaitingGetHeaderBiddingToken.this, true);
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == f) {
                        return f;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class 2 extends u implements Qa.a {
        public 2() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(null);
            }
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(String str) {
            super(0);
            this.$token = str;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
            if (listener != null) {
                listener.onUnityAdsTokenReady(this.$token);
            }
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke) {
        kotlin.jvm.internal.t.g(getHeaderBiddingToken, "getHeaderBiddingToken");
        kotlin.jvm.internal.t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        kotlin.jvm.internal.t.g(getInitializationState, "getInitializationState");
        kotlin.jvm.internal.t.g(awaitInitialization, "awaitInitialization");
        kotlin.jvm.internal.t.g(sessionRepository, "sessionRepository");
        kotlin.jvm.internal.t.g(safeCallbackInvoke, "safeCallbackInvoke");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.startTime = k.a.b();
    }

    public static final /* synthetic */ Object access$fetchToken(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, TokenConfiguration tokenConfiguration, e eVar) {
        return commonInitAwaitingGetHeaderBiddingToken.fetchToken(i, tokenConfiguration, eVar);
    }

    public static final /* synthetic */ void access$setDidAwaitInit$p(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, boolean z) {
        commonInitAwaitingGetHeaderBiddingToken.didAwaitInit = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object fetchToken(int r6, com.unity3d.ads.TokenConfiguration r7, Ga.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken.1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r7 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r7
            Ca.t.b(r8)     // Catch: java.lang.Exception -> L30
            goto L4d
        L30:
            r8 = move-exception
            goto L55
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            Ca.t.b(r8)
            com.unity3d.ads.core.domain.GetHeaderBiddingToken r8 = r5.getHeaderBiddingToken     // Catch: java.lang.Exception -> L53
            r0.L$0 = r5     // Catch: java.lang.Exception -> L53
            r0.I$0 = r6     // Catch: java.lang.Exception -> L53
            r0.label = r3     // Catch: java.lang.Exception -> L53
            java.lang.Object r8 = r8.invoke(r6, r7, r0)     // Catch: java.lang.Exception -> L53
            if (r8 != r1) goto L4c
            return r1
        L4c:
            r7 = r5
        L4d:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L30
            r0 = r4
            r4 = r8
            r8 = r0
            goto L5c
        L53:
            r8 = move-exception
            r7 = r5
        L55:
            r0 = 0
            java.lang.String r8 = com.unity3d.ads.core.extensions.ExceptionExtensionsKt.getShortenedStackTrace$default(r8, r0, r3, r4)
            java.lang.String r0 = "uncaught_exception"
        L5c:
            if (r4 != 0) goto L62
            r7.tokenFailure(r6, r0, r8)
            goto L65
        L62:
            r7.tokenSuccess(r6, r4)
        L65:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.fetchToken(int, com.unity3d.ads.TokenConfiguration, Ga.e):java.lang.Object");
    }

    private final void tokenFailure(int i, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double valueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(k.a.b(this.startTime)));
        Map c = Q.c();
        c.put("sync", "false");
        c.put("state", String.valueOf(this.startState));
        c.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        c.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            c.put("reason_debug", str2);
        }
        I i2 = I.a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", valueOf, Q.b(c), null, null, Integer.valueOf(i), 24, null);
        this.safeCallbackInvoke.invoke(new 2());
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i, str, str2);
    }

    private final void tokenStart(int i) {
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, S.l(x.a("sync", "false"), x.a("state", String.valueOf(this.startState))), null, null, Integer.valueOf(i), 26, null);
    }

    private final void tokenSuccess(int i, String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(k.a.b(this.startTime))), S.l(x.a("sync", "false"), x.a("state", String.valueOf(this.startState)), x.a("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), x.a("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(i), 24, null);
        this.safeCallbackInvoke.invoke(new 1(str));
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    public final long getStartTime-z9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object invoke(int r9, com.unity3d.ads.TokenConfiguration r10, com.unity3d.ads.IUnityAdsTokenListener r11, Ga.e r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.1
            if (r0 == 0) goto L13
            r0 = r12
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1 r0 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            java.lang.String r3 = "!sessionRepository.shouldInitialize"
            java.lang.String r4 = "gateway"
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3a
            if (r2 != r5) goto L32
            Ca.t.b(r12)
            goto La9
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$1
            com.unity3d.ads.TokenConfiguration r10 = (com.unity3d.ads.TokenConfiguration) r10
            java.lang.Object r11 = r0.L$0
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken r11 = (com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken) r11
            Ca.t.b(r12)
            goto L8e
        L48:
            Ca.t.b(r12)
            r8.listener = r11
            r8.tokenStart(r9)
            if (r11 != 0) goto L5c
            java.lang.String r10 = "listener_null"
            java.lang.String r11 = "IUnityAdsTokenListener is null"
            r8.tokenFailure(r9, r10, r11)
            Ca.I r9 = Ca.I.a
            return r9
        L5c:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r8.sessionRepository
            boolean r11 = r11.getShouldInitialize()
            if (r11 != 0) goto L6a
            r8.tokenFailure(r9, r4, r3)
            Ca.I r9 = Ca.I.a
            return r9
        L6a:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r8.sessionRepository
            gatewayprotocol.v1.NativeConfigurationOuterClass$NativeConfiguration r11 = r11.getNativeConfiguration()
            gatewayprotocol.v1.NativeConfigurationOuterClass$AdOperationsConfiguration r11 = r11.getAdOperations()
            int r11 = r11.getGetTokenTimeoutMs()
            long r11 = (long) r11
            com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2 r2 = new com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2
            r2.<init>(r7)
            r0.L$0 = r8
            r0.L$1 = r10
            r0.I$0 = r9
            r0.label = r6
            java.lang.Object r11 = cb.c1.d(r11, r2, r0)
            if (r11 != r1) goto L8d
            return r1
        L8d:
            r11 = r8
        L8e:
            com.unity3d.ads.core.data.repository.SessionRepository r12 = r11.sessionRepository
            boolean r12 = r12.getShouldInitialize()
            if (r12 != 0) goto L9c
            r11.tokenFailure(r9, r4, r3)
            Ca.I r9 = Ca.I.a
            return r9
        L9c:
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r5
            java.lang.Object r9 = r11.fetchToken(r9, r10, r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            Ca.I r9 = Ca.I.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.invoke(int, com.unity3d.ads.TokenConfiguration, com.unity3d.ads.IUnityAdsTokenListener, Ga.e):java.lang.Object");
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
