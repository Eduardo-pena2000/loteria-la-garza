package com.unity3d.services.core.request.metrics;

import Ga.a;
import Ga.i;
import cb.L;
import com.unity3d.services.core.log.DeviceLog;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1 extends a implements L {
    final /* synthetic */ List $metrics$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(L.b bVar, List list) {
        super(bVar);
        this.$metrics$inlined = list;
    }

    public void handleException(i iVar, Throwable th) {
        DeviceLog.debug("Metric " + this.$metrics$inlined + " failed to send with error: " + th);
    }
}
