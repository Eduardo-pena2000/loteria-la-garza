package com.unity3d.services.core.domain.task;

import Ga.e;
import Ia.d;
import Ia.f;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeSDK extends MetricTask {
    private final ConfigFileFromLocalStorage configFileFromLocalStorage;
    private final ISDKDispatchers dispatchers;
    private final InitializeStateComplete initializeStateComplete;
    private final InitializeStateConfig initializeStateConfig;
    private final InitializeStateCreate initializeStateCreate;
    private final InitializeStateError initializeStateError;
    private final InitializeStateLoadCache initializeStateLoadCache;
    private final InitializeStateLoadWeb initializeStateLoadWeb;
    private final InitializeStateReset initializeStateReset;

    @f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "handleInitializationException")
    public static final class 1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public 1(e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InitializeSDK.access$handleInitializationException(InitializeSDK.this, null, this);
        }
    }

    public InitializeSDK(ISDKDispatchers dispatchers, ConfigFileFromLocalStorage configFileFromLocalStorage, InitializeStateReset initializeStateReset, InitializeStateError initializeStateError, InitializeStateConfig initializeStateConfig, InitializeStateCreate initializeStateCreate, InitializeStateLoadCache initializeStateLoadCache, InitializeStateLoadWeb initializeStateLoadWeb, InitializeStateComplete initializeStateComplete) {
        t.g(dispatchers, "dispatchers");
        t.g(configFileFromLocalStorage, "configFileFromLocalStorage");
        t.g(initializeStateReset, "initializeStateReset");
        t.g(initializeStateError, "initializeStateError");
        t.g(initializeStateConfig, "initializeStateConfig");
        t.g(initializeStateCreate, "initializeStateCreate");
        t.g(initializeStateLoadCache, "initializeStateLoadCache");
        t.g(initializeStateLoadWeb, "initializeStateLoadWeb");
        t.g(initializeStateComplete, "initializeStateComplete");
        this.dispatchers = dispatchers;
        this.configFileFromLocalStorage = configFileFromLocalStorage;
        this.initializeStateReset = initializeStateReset;
        this.initializeStateError = initializeStateError;
        this.initializeStateConfig = initializeStateConfig;
        this.initializeStateCreate = initializeStateCreate;
        this.initializeStateLoadCache = initializeStateLoadCache;
        this.initializeStateLoadWeb = initializeStateLoadWeb;
        this.initializeStateComplete = initializeStateComplete;
    }

    public static final /* synthetic */ Object access$executeErrorState-BWLJW6A(InitializeSDK initializeSDK, ErrorState errorState, Throwable th, Configuration configuration, e eVar) {
        return initializeSDK.executeErrorState-BWLJW6A(errorState, th, configuration, eVar);
    }

    public static final /* synthetic */ ConfigFileFromLocalStorage access$getConfigFileFromLocalStorage$p(InitializeSDK initializeSDK) {
        return initializeSDK.configFileFromLocalStorage;
    }

    public static final /* synthetic */ InitializeStateComplete access$getInitializeStateComplete$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateComplete;
    }

    public static final /* synthetic */ InitializeStateConfig access$getInitializeStateConfig$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateConfig;
    }

    public static final /* synthetic */ InitializeStateCreate access$getInitializeStateCreate$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateCreate;
    }

    public static final /* synthetic */ InitializeStateLoadCache access$getInitializeStateLoadCache$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateLoadCache;
    }

    public static final /* synthetic */ InitializeStateLoadWeb access$getInitializeStateLoadWeb$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateLoadWeb;
    }

    public static final /* synthetic */ InitializeStateReset access$getInitializeStateReset$p(InitializeSDK initializeSDK) {
        return initializeSDK.initializeStateReset;
    }

    public static final /* synthetic */ Object access$handleInitializationException(InitializeSDK initializeSDK, InitializationException initializationException, e eVar) {
        return initializeSDK.handleInitializationException(initializationException, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object executeErrorState-BWLJW6A(com.unity3d.services.core.configuration.ErrorState r6, java.lang.Throwable r7, com.unity3d.services.core.configuration.Configuration r8, Ga.e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$executeErrorState$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Ca.t.b(r9)
            Ca.s r9 = (Ca.s) r9
            java.lang.Object r6 = r9.j()
            goto L57
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            Ca.t.b(r9)
            com.unity3d.services.core.domain.task.InitializeStateError r9 = r5.initializeStateError
            com.unity3d.services.core.domain.task.InitializeStateError$Params r2 = new com.unity3d.services.core.domain.task.InitializeStateError$Params
            java.lang.Exception r4 = new java.lang.Exception
            if (r7 == 0) goto L47
            java.lang.String r7 = r7.getMessage()
            goto L48
        L47:
            r7 = 0
        L48:
            r4.<init>(r7)
            r2.<init>(r6, r4, r8)
            r0.label = r3
            java.lang.Object r6 = r9.invoke-gIAlu-s(r2, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.executeErrorState-BWLJW6A(com.unity3d.services.core.configuration.ErrorState, java.lang.Throwable, com.unity3d.services.core.configuration.Configuration, Ga.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object handleInitializationException(com.unity3d.services.core.domain.task.InitializationException r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException.1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = (com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException.1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1 r0 = new com.unity3d.services.core.domain.task.InitializeSDK$handleInitializationException$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            java.lang.Object r6 = r0.L$0
            com.unity3d.services.core.domain.task.InitializationException r6 = (com.unity3d.services.core.domain.task.InitializationException) r6
            Ca.t.b(r7)
            Ca.s r7 = (Ca.s) r7
            r7.j()
            goto L54
        L3a:
            Ca.t.b(r7)
            com.unity3d.services.core.configuration.ErrorState r7 = r6.getErrorState()
            java.lang.Exception r2 = r6.getOriginalException()
            com.unity3d.services.core.configuration.Configuration r4 = r6.getConfig()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r5.executeErrorState-BWLJW6A(r7, r2, r4, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.handleInitializationException(com.unity3d.services.core.domain.task.InitializationException, Ga.e):java.lang.Object");
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("initialize");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork-gIAlu-s(com.unity3d.services.core.domain.task.EmptyParams r5, Ga.e r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            if (r5 == 0) goto L13
            r5 = r6
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = (com.unity3d.services.core.domain.task.InitializeSDK$doWork$1) r5
            int r0 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.label = r0
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$1 r5 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$1
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.result
            java.lang.Object r0 = Ha.c.f()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            Ca.t.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            Ca.t.b(r6)
            com.unity3d.services.core.domain.ISDKDispatchers r6 = r4.dispatchers
            cb.K r6 = r6.getDefault()
            com.unity3d.services.core.domain.task.InitializeSDK$doWork$2 r1 = new com.unity3d.services.core.domain.task.InitializeSDK$doWork$2
            r3 = 0
            r1.<init>(r4, r3)
            r5.label = r2
            java.lang.Object r6 = cb.i.g(r6, r1, r5)
            if (r6 != r0) goto L49
            return r0
        L49:
            Ca.s r6 = (Ca.s) r6
            java.lang.Object r5 = r6.j()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK.doWork-gIAlu-s(com.unity3d.services.core.domain.task.EmptyParams, Ga.e):java.lang.Object");
    }
}
