package com.unity3d.ads.core.domain.scar;

import Ca.I;
import Da.Y;
import Ga.e;
import Ia.f;
import Ia.l;
import Qa.p;
import cb.O;
import cb.i;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import fb.D;
import fb.F;
import fb.g;
import fb.y;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final y _gmaEventFlow;
    private final y _versionFlow;
    private final D gmaEventFlow;
    private final O scope;
    private final D versionFlow;

    @f(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
    public static final class 1 extends l implements p {
        final /* synthetic */ Enum $eventId;
        final /* synthetic */ Object[] $params;
        int label;
        final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Enum r1, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, e eVar) {
            super(2, eVar);
            this.$eventId = r1;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        public final e create(Object obj, e eVar) {
            return new 1(this.$eventId, this.$params, this.this$0, eVar);
        }

        public final Object invoke(O o, e eVar) {
            return ((1) create(o, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver.sendEvent.1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CommonScarEventReceiver(O scope) {
        t.g(scope, "scope");
        this.scope = scope;
        y b = F.b(0, 0, null, 7, null);
        this._versionFlow = b;
        this.versionFlow = g.a(b);
        y b2 = F.b(0, 0, null, 7, null);
        this._gmaEventFlow = b2;
        this.gmaEventFlow = g.a(b2);
    }

    public static final /* synthetic */ y access$get_gmaEventFlow$p(CommonScarEventReceiver commonScarEventReceiver) {
        return commonScarEventReceiver._gmaEventFlow;
    }

    public static final /* synthetic */ y access$get_versionFlow$p(CommonScarEventReceiver commonScarEventReceiver) {
        return commonScarEventReceiver._versionFlow;
    }

    public boolean canSend() {
        return true;
    }

    public final D getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final D getVersionFlow() {
        return this.versionFlow;
    }

    public boolean sendEvent(Enum eventCategory, Enum eventId, Object... params) {
        t.g(eventCategory, "eventCategory");
        t.g(eventId, "eventId");
        t.g(params, "params");
        if (!Da.D.Y(Y.e(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), eventCategory)) {
            return false;
        }
        i.d(this.scope, null, null, new 1(eventId, params, this, null), 3, null);
        return true;
    }
}
