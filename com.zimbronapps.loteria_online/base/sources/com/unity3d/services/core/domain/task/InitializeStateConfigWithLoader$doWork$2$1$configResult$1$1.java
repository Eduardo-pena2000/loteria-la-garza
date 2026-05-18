package com.unity3d.services.core.domain.task;

import Ca.I;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.K;
import cb.i;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.extensions.AbortRetryException;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1", f = "InitializeStateConfigWithLoader.kt", l = {69}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 extends l implements p {
    final /* synthetic */ O $config;
    final /* synthetic */ O $configurationLoader;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    @f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ O $config;
        final /* synthetic */ O $configurationLoader;
        int label;
        final /* synthetic */ InitializeStateConfigWithLoader this$0;

        public static final class 1 implements IConfigurationLoaderListener {
            final /* synthetic */ O $config;
            final /* synthetic */ InitializeStateConfigWithLoader this$0;

            public 1(O o, InitializeStateConfigWithLoader initializeStateConfigWithLoader) {
                this.$config = o;
                this.this$0 = initializeStateConfigWithLoader;
            }

            public void onError(String errorMsg) {
                t.g(errorMsg, "errorMsg");
                SDKMetricsSender access$getSdkMetricsSender$p = InitializeStateConfigWithLoader.access$getSdkMetricsSender$p(this.this$0);
                Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
                t.f(newEmergencySwitchOff, "newEmergencySwitchOff()");
                access$getSdkMetricsSender$p.sendMetric(newEmergencySwitchOff);
                throw new AbortRetryException(errorMsg);
            }

            public void onSuccess(Configuration configuration) {
                t.g(configuration, "configuration");
                this.$config.a = configuration;
                configuration.saveToDisk();
                InitializeStateConfigWithLoader.access$getTokenStorage$p(this.this$0).setInitToken(((Configuration) this.$config.a).getUnifiedAuctionToken());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(O o, O o2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, e eVar) {
            super(2, eVar);
            this.$configurationLoader = o;
            this.$config = o2;
            this.this$0 = initializeStateConfigWithLoader;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$configurationLoader, this.$config, this.this$0, eVar);
        }

        public final Object invoke(cb.O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            c.f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            ((IConfigurationLoader) this.$configurationLoader.a).loadConfiguration(new 1(this.$config, this.this$0));
            return I.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, O o, O o2, e eVar) {
        super(2, eVar);
        this.this$0 = initializeStateConfigWithLoader;
        this.$configurationLoader = o;
        this.$config = o2;
    }

    public final e create(Object obj, e eVar) {
        InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1 initializeStateConfigWithLoader$doWork$2$1$configResult$1$1 = new InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1(this.this$0, this.$configurationLoader, this.$config, eVar);
        initializeStateConfigWithLoader$doWork$2$1$configResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateConfigWithLoader$doWork$2$1$configResult$1$1;
    }

    public final Object invoke(int i, e eVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$configResult$1$1) create(Integer.valueOf(i), eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            Ca.t.b(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryConfig();
            }
            K io = InitializeStateConfigWithLoader.access$getDispatchers$p(this.this$0).getIo();
            1 r1 = new 1(this.$configurationLoader, this.$config, this.this$0, null);
            this.label = 1;
            if (i.g(io, r1, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
        }
        return I.a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (e) obj2);
    }
}
