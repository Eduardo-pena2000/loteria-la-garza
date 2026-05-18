package com.unity3d.services.core.domain.task;

import Ca.I;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IConfigurationLoader;
import com.unity3d.services.core.configuration.IConfigurationLoaderListener;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.TSIMetric;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader$doWork$2$1$1", f = "InitializeStateConfigWithLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class InitializeStateConfigWithLoader$doWork$2$1$1 extends l implements p {
    final /* synthetic */ O $config;
    final /* synthetic */ O $configurationLoader;
    final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
    int label;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    public static final class 1 implements IConfigurationLoaderListener {
        final /* synthetic */ O $config;
        final /* synthetic */ InitializeStateConfigWithLoader.Params $params;
        final /* synthetic */ InitializeStateConfigWithLoader this$0;

        public 1(O o, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params) {
            this.$config = o;
            this.this$0 = initializeStateConfigWithLoader;
            this.$params = params;
        }

        public void onError(String errorMsg) {
            t.g(errorMsg, "errorMsg");
            SDKMetricsSender access$getSdkMetricsSender$p = InitializeStateConfigWithLoader.access$getSdkMetricsSender$p(this.this$0);
            Metric newEmergencySwitchOff = TSIMetric.newEmergencySwitchOff();
            t.f(newEmergencySwitchOff, "newEmergencySwitchOff()");
            access$getSdkMetricsSender$p.sendMetric(newEmergencySwitchOff);
            throw new InitializationException(ErrorState.NetworkConfigRequest, new Exception(errorMsg), this.$params.getConfig());
        }

        public void onSuccess(Configuration configuration) {
            t.g(configuration, "configuration");
            this.$config.a = configuration;
            configuration.saveToDisk();
            InitializeStateConfigWithLoader.access$getTokenStorage$p(this.this$0).setInitToken(((Configuration) this.$config.a).getUnifiedAuctionToken());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfigWithLoader$doWork$2$1$1(O o, O o2, InitializeStateConfigWithLoader initializeStateConfigWithLoader, InitializeStateConfigWithLoader.Params params, e eVar) {
        super(2, eVar);
        this.$configurationLoader = o;
        this.$config = o2;
        this.this$0 = initializeStateConfigWithLoader;
        this.$params = params;
    }

    public final e create(Object obj, e eVar) {
        return new InitializeStateConfigWithLoader$doWork$2$1$1(this.$configurationLoader, this.$config, this.this$0, this.$params, eVar);
    }

    public final Object invoke(cb.O o, e eVar) {
        return ((InitializeStateConfigWithLoader$doWork$2$1$1) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ca.t.b(obj);
        ((IConfigurationLoader) this.$configurationLoader.a).loadConfiguration(new 1(this.$config, this.this$0, this.$params));
        return I.a;
    }
}
