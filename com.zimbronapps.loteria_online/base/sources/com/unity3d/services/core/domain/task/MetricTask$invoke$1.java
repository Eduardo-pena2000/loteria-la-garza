package com.unity3d.services.core.domain.task;

import Ca.s;
import Ga.e;
import Ha.c;
import Ia.d;
import Ia.f;

@f(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MetricTask$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricTask$invoke$1(MetricTask metricTask, e eVar) {
        super(eVar);
        this.this$0 = metricTask;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object obj2 = MetricTask.invoke-gIAlu-s$suspendImpl(this.this$0, null, this);
        return obj2 == c.f() ? obj2 : s.a(obj2);
    }
}
