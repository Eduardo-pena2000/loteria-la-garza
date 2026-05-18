package com.unity3d.ads.core.domain.work;

import Ca.l;
import Ca.m;
import Ca.n;
import Ga.e;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OperativeEventJob extends UniversalRequestJob implements IServiceComponent {
    private final l getOperativeRequestPolicy$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        t.g(context, "context");
        t.g(workerParams, "workerParams");
        this.getOperativeRequestPolicy$delegate = m.a(n.c, new OperativeEventJob$special$$inlined$inject$default$1(this, "op_event_req"));
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    public Object doWork(e eVar) {
        setRequestPolicy(getGetOperativeRequestPolicy().invoke());
        return super.doWork(eVar);
    }
}
