package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.t;
import o2.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateComplete extends MetricTask {
    private final i dataStore;
    private final ISDKDispatchers dispatchers;

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

    public InitializeStateComplete(i dataStore, ISDKDispatchers dispatchers) {
        t.g(dataStore, "dataStore");
        t.g(dispatchers, "dispatchers");
        this.dataStore = dataStore;
        this.dispatchers = dispatchers;
    }

    public static final /* synthetic */ i access$getDataStore$p(InitializeStateComplete initializeStateComplete) {
        return initializeStateComplete.dataStore;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("completion");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateComplete.Params r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$1
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
            com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateComplete$doWork$2
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
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateComplete.doWork-gIAlu-s(com.unity3d.services.core.domain.task.InitializeStateComplete$Params, Ga.e):java.lang.Object");
    }
}
