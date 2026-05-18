package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.ads.core.domain.om.IsOMActivated;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HandleInvocationsFromAdViewer$invoke$definition$1 extends u implements Qa.a {
    final /* synthetic */ String $adDataObject;
    final /* synthetic */ String $adDataRefreshTokenObject;
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ String $impressionConfigObject;
    final /* synthetic */ HandleInvocationsFromAdViewer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleInvocationsFromAdViewer$invoke$definition$1(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, String str, String str2, String str3, AdObject adObject) {
        super(0);
        this.this$0 = handleInvocationsFromAdViewer;
        this.$adDataObject = str;
        this.$impressionConfigObject = str2;
        this.$adDataRefreshTokenObject = str3;
        this.$adObject = adObject;
    }

    public final ExposedFunction invoke() {
        return CommonAdViewerExposedFunctionsKt.getAdContext-yLuu4LI((AndroidGetAdPlayerContext) this.this$0.getServiceProvider().getRegistry().getService("", P.b(AndroidGetAdPlayerContext.class)), this.$adDataObject, this.$impressionConfigObject, this.$adDataRefreshTokenObject, (IsOMActivated) this.this$0.getServiceProvider().getRegistry().getService("", P.b(IsOMActivated.class)), this.$adObject);
    }
}
