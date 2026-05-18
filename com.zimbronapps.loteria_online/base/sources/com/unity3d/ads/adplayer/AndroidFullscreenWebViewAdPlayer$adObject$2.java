package com.unity3d.ads.adplayer;

import Ca.s;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidFullscreenWebViewAdPlayer$adObject$2 extends u implements Qa.a {
    final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFullscreenWebViewAdPlayer$adObject$2(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
        super(0);
        this.this$0 = androidFullscreenWebViewAdPlayer;
    }

    public final AdObject invoke() {
        Object b;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
        try {
            s.a aVar = s.b;
            AdRepository access$getAdRepository$p = AndroidFullscreenWebViewAdPlayer.access$getAdRepository$p(androidFullscreenWebViewAdPlayer);
            UUID fromString = UUID.fromString(AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(androidFullscreenWebViewAdPlayer));
            t.f(fromString, "fromString(opportunityId)");
            b = s.b(access$getAdRepository$p.getAd(ProtobufExtensionsKt.toByteString(fromString)));
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        if (s.g(b)) {
            b = null;
        }
        return (AdObject) b;
    }
}
