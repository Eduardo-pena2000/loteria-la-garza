package com.unity3d.ads.adplayer;

import Ca.l;
import Ca.m;
import Ca.n;
import Ca.s;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import java.util.UUID;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FullScreenWebViewDisplay$adObject$2 extends u implements Qa.a {
    final /* synthetic */ FullScreenWebViewDisplay this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenWebViewDisplay$adObject$2(FullScreenWebViewDisplay fullScreenWebViewDisplay) {
        super(0);
        this.this$0 = fullScreenWebViewDisplay;
    }

    private static final AdRepository invoke$lambda$0(l lVar) {
        return (AdRepository) lVar.getValue();
    }

    public final AdObject invoke() {
        Object b;
        l a = m.a(n.c, new FullScreenWebViewDisplay$adObject$2$invoke$$inlined$inject$default$1(this.this$0, ""));
        FullScreenWebViewDisplay fullScreenWebViewDisplay = this.this$0;
        try {
            s.a aVar = s.b;
            AdRepository invoke$lambda$0 = invoke$lambda$0(a);
            UUID fromString = UUID.fromString(FullScreenWebViewDisplay.access$getOpportunityId$p(fullScreenWebViewDisplay));
            t.f(fromString, "fromString(opportunityId)");
            b = s.b(invoke$lambda$0.getAd(ProtobufExtensionsKt.toByteString(fromString)));
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
