package com.unity3d.services.core.domain.task;

import Ga.e;
import com.unity3d.services.ads.token.TokenStorage;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateConfigWithLoader implements BaseTask {
    private final ISDKDispatchers dispatchers;
    private final InitializeStateNetworkError initializeStateNetworkError;
    private final SDKMetricsSender sdkMetricsSender;
    private final TokenStorage tokenStorage;

    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration config) {
            t.g(config, "config");
            this.config = config;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration config) {
            t.g(config, "config");
            return new Params(config);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && t.c(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateConfigWithLoader(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, TokenStorage tokenStorage, SDKMetricsSender sdkMetricsSender) {
        t.g(dispatchers, "dispatchers");
        t.g(initializeStateNetworkError, "initializeStateNetworkError");
        t.g(tokenStorage, "tokenStorage");
        t.g(sdkMetricsSender, "sdkMetricsSender");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.tokenStorage = tokenStorage;
        this.sdkMetricsSender = sdkMetricsSender;
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers$p(InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        return initializeStateConfigWithLoader.dispatchers;
    }

    public static final /* synthetic */ InitializeStateNetworkError access$getInitializeStateNetworkError$p(InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        return initializeStateConfigWithLoader.initializeStateNetworkError;
    }

    public static final /* synthetic */ SDKMetricsSender access$getSdkMetricsSender$p(InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        return initializeStateConfigWithLoader.sdkMetricsSender;
    }

    public static final /* synthetic */ TokenStorage access$getTokenStorage$p(InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
        return initializeStateConfigWithLoader.tokenStorage;
    }

    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.Params r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Ca.t.b(r7)
            goto L49
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Ca.t.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            cb.K r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = cb.i.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            Ca.s r7 = (Ca.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader.doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$Params, Ga.e):java.lang.Object");
    }

    public Object invoke-gIAlu-s(Params params, e eVar) {
        return BaseTask.DefaultImpls.invoke-gIAlu-s(this, params, eVar);
    }
}
