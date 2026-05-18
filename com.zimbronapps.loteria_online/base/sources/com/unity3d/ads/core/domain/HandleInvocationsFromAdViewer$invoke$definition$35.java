package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.OmImpressionOccurred;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$35 extends u implements Qa.a {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$35(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adObject = adObject;
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.omImpression((OmImpressionOccurred) this.this$0.getServiceProvider().getRegistry().getService("", P.b(OmImpressionOccurred.class)), this.$adObject);
    }
}
