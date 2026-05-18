package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.task.BaseTask;
import com.unity3d.services.core.request.metrics.Metric;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class MetricTask implements BaseTask {
    private long duration;
    private String taskStatus = "unknown";

    private final void captureMetric(Object obj) {
        this.taskStatus = s.h(obj) ? "success" : "failure";
        sendMetric();
    }

    private final Metric getMetric() {
        return new Metric(getMetricName(), Long.valueOf(this.duration), getMetricTagsForState());
    }

    private final Map getMetricTagsForState() {
        Map retryTags = InitializeEventsMetricSender.getInstance().getRetryTags();
        t.f(retryTags, "getInstance().retryTags");
        return retryTags;
    }

    private final SDKMetricsSender getSDKMetrics() {
        return (SDKMetricsSender) getServiceProvider().getRegistry().getService("", P.b(SDKMetricsSender.class));
    }

    private final int getStatePrefixLength() {
        return 15;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object invoke-gIAlu-s$suspendImpl(com.unity3d.services.core.domain.task.MetricTask r8, com.unity3d.services.core.domain.task.BaseParams r9, Ga.e r10) {
        /*
            boolean r0 = r10 instanceof com.unity3d.services.core.domain.task.MetricTask$invoke$1
            if (r0 == 0) goto L13
            r0 = r10
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = (com.unity3d.services.core.domain.task.MetricTask$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.services.core.domain.task.MetricTask$invoke$1 r0 = new com.unity3d.services.core.domain.task.MetricTask$invoke$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L51
            if (r2 != r3) goto L49
            long r8 = r0.J$0
            java.lang.Object r1 = r0.L$4
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            java.lang.Object r2 = r0.L$3
            com.unity3d.services.core.domain.task.MetricTask r2 = (com.unity3d.services.core.domain.task.MetricTask) r2
            java.lang.Object r3 = r0.L$2
            kotlin.jvm.internal.O r3 = (kotlin.jvm.internal.O) r3
            java.lang.Object r4 = r0.L$1
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            java.lang.Object r0 = r0.L$0
            com.unity3d.services.core.domain.task.MetricTask r0 = (com.unity3d.services.core.domain.task.MetricTask) r0
            Ca.t.b(r10)
            Ca.s r10 = (Ca.s) r10
            java.lang.Object r10 = r10.j()
            r6 = r8
            r8 = r2
            r9 = r4
            r4 = r6
            goto L79
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L51:
            Ca.t.b(r10)
            kotlin.jvm.internal.O r10 = new kotlin.jvm.internal.O
            r10.<init>()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r4 = java.lang.System.nanoTime()
            r0.L$0 = r8
            r0.L$1 = r10
            r0.L$2 = r10
            r0.L$3 = r8
            r0.L$4 = r2
            r0.J$0 = r4
            r0.label = r3
            java.lang.Object r9 = com.unity3d.services.core.domain.task.BaseTask.DefaultImpls.invoke-gIAlu-s(r8, r9, r0)
            if (r9 != r1) goto L74
            return r1
        L74:
            r0 = r8
            r3 = r10
            r1 = r2
            r10 = r9
            r9 = r3
        L79:
            r3.a = r10
            Ca.I r10 = Ca.I.a
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r4
            long r1 = r1.toMillis(r2)
            r8.duration = r1
            java.lang.Object r8 = r9.a
            r0.captureMetric(r8)
            java.lang.Object r8 = r9.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.MetricTask.invoke-gIAlu-s$suspendImpl(com.unity3d.services.core.domain.task.MetricTask, com.unity3d.services.core.domain.task.BaseParams, Ga.e):java.lang.Object");
    }

    private final void sendMetric() {
        String metricName = getMetricName();
        if (metricName == null || metricName.length() == 0) {
            return;
        }
        getSDKMetrics().sendMetric(getMetric());
    }

    public final long getDuration() {
        return this.duration;
    }

    public String getMetricName() {
        return null;
    }

    public final String getMetricNameForInitializeTask(String name) {
        t.g(name, "name");
        return "native_" + name + "_task_" + this.taskStatus + "_time";
    }

    public final String getMetricNameForTask(Object task) {
        t.g(task, "task");
        String className = task.getClass().getSimpleName();
        t.f(className, "className");
        if (className.length() == 0) {
            return null;
        }
        t.f(className, "className");
        String substring = className.substring(getStatePrefixLength());
        t.f(substring, "this as java.lang.String).substring(startIndex)");
        String lowerCase = substring.toLowerCase(Locale.ROOT);
        t.f(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        StringBuilder sb = new StringBuilder(lowerCase.length() + 13);
        sb.append("native_");
        sb.append(lowerCase);
        sb.append("_state");
        return sb.toString();
    }

    public IServiceProvider getServiceProvider() {
        return BaseTask.DefaultImpls.getServiceProvider(this);
    }

    public final String getTaskStatus() {
        return this.taskStatus;
    }

    public Object invoke-gIAlu-s(BaseParams baseParams, e eVar) {
        return invoke-gIAlu-s$suspendImpl(this, baseParams, eVar);
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setTaskStatus(String str) {
        t.g(str, "<set-?>");
        this.taskStatus = str;
    }
}
