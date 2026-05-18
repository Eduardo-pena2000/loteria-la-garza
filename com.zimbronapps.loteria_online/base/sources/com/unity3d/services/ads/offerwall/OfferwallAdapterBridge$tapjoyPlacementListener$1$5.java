package com.unity3d.services.ads.offerwall;

import Ca.I;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import fb.y;

@f(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$5", f = "OfferwallAdapterBridge.kt", l = {140}, m = "invokeSuspend")
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$5 extends l implements p {
    final /* synthetic */ String $placementName;
    int label;
    final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$5(OfferwallAdapterBridge offerwallAdapterBridge, String str, e eVar) {
        super(2, eVar);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    public final e create(Object obj, e eVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this.this$0, this.$placementName, eVar);
    }

    public final Object invoke(O o, e eVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$5) create(o, eVar)).invokeSuspend(I.a);
    }

    public final Object invokeSuspend(Object obj) {
        Object f = c.f();
        int i = this.label;
        if (i == 0) {
            t.b(obj);
            y access$get_offerwallEventFlow$p = OfferwallAdapterBridge.access$get_offerwallEventFlow$p(this.this$0);
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_DISMISS;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            if (access$get_offerwallEventFlow$p.emit(offerwallEventData, this) == f) {
                return f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        }
        return I.a;
    }
}
