package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.HttpClient;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateLoadWeb extends MetricTask {
    private final ISDKDispatchers dispatchers;
    private final HttpClient httpClient;
    private final InitializeStateNetworkError initializeStateNetworkError;

    public static final class LoadWebResult {
        private final Configuration config;
        private final String webViewDataString;

        public LoadWebResult(Configuration config, String webViewDataString) {
            t.g(config, "config");
            t.g(webViewDataString, "webViewDataString");
            this.config = config;
            this.webViewDataString = webViewDataString;
        }

        public static /* synthetic */ LoadWebResult copy$default(LoadWebResult loadWebResult, Configuration configuration, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                configuration = loadWebResult.config;
            }
            if ((i & 2) != 0) {
                str = loadWebResult.webViewDataString;
            }
            return loadWebResult.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewDataString;
        }

        public final LoadWebResult copy(Configuration config, String webViewDataString) {
            t.g(config, "config");
            t.g(webViewDataString, "webViewDataString");
            return new LoadWebResult(config, webViewDataString);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadWebResult)) {
                return false;
            }
            LoadWebResult loadWebResult = (LoadWebResult) obj;
            return t.c(this.config, loadWebResult.config) && t.c(this.webViewDataString, loadWebResult.webViewDataString);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewDataString() {
            return this.webViewDataString;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewDataString.hashCode();
        }

        public String toString() {
            return "LoadWebResult(config=" + this.config + ", webViewDataString=" + this.webViewDataString + ')';
        }
    }

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

    public InitializeStateLoadWeb(ISDKDispatchers dispatchers, InitializeStateNetworkError initializeStateNetworkError, HttpClient httpClient) {
        t.g(dispatchers, "dispatchers");
        t.g(initializeStateNetworkError, "initializeStateNetworkError");
        t.g(httpClient, "httpClient");
        this.dispatchers = dispatchers;
        this.initializeStateNetworkError = initializeStateNetworkError;
        this.httpClient = httpClient;
    }

    public static final /* synthetic */ ISDKDispatchers access$getDispatchers$p(InitializeStateLoadWeb initializeStateLoadWeb) {
        return initializeStateLoadWeb.dispatchers;
    }

    public static final /* synthetic */ HttpClient access$getHttpClient$p(InitializeStateLoadWeb initializeStateLoadWeb) {
        return initializeStateLoadWeb.httpClient;
    }

    public static final /* synthetic */ InitializeStateNetworkError access$getInitializeStateNetworkError$p(InitializeStateLoadWeb initializeStateLoadWeb) {
        return initializeStateLoadWeb.initializeStateNetworkError;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("download_web_view");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateLoadWeb.Params r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$1
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
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2
            r4 = 0
            r2.<init>(r6, r5, r4)
            r0.label = r3
            java.lang.Object r7 = cb.i.g(r7, r2, r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            Ca.s r7 = (Ca.s) r7
            java.lang.Object r6 = r7.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb.doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateLoadWeb$Params, Ga.e):java.lang.Object");
    }
}
