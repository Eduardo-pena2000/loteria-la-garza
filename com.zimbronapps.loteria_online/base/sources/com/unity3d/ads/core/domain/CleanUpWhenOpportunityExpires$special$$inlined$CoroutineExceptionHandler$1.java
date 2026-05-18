package com.unity3d.ads.core.domain;

import Ga.i;
import cb.L;
import com.unity3d.services.core.log.DeviceLog;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends Ga.a implements L {
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(L.b bVar) {
        super(bVar);
    }

    public void handleException(i iVar, Throwable th) {
        DeviceLog.debug("CleanUpExpiredOpportunity: " + th.getMessage());
    }
}
