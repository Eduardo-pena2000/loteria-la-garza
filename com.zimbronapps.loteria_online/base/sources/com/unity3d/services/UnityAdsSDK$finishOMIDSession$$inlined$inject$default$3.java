package com.unity3d.services;

import Qa.a;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.services.core.di.IServiceComponent;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3 extends u implements a {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    public final Object invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, P.b(OmFinishSession.class));
    }
}
