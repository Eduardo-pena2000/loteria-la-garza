package com.applovin.impl.sdk.network;

import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.q5;
import com.applovin.impl.sdk.EventServiceImpl;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {
    private final k a;

    public PostbackServiceImpl(k kVar) {
        this.a = kVar;
    }

    private boolean a(e eVar) {
        Map i = eVar.i();
        if (i == null) {
            return false;
        }
        Object obj = i.get("event");
        if ("postinstall".equals(obj)) {
            obj = i.get("sub_event");
        }
        return EventServiceImpl.ALLOW_PRE_INIT_EVENT_TYPES.contains(obj);
    }

    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(e.b(this.a).f(str).g(false).b(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(e eVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(eVar, d6.b.OTHER, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }

    public void dispatchPostbackRequest(e eVar, d6.b bVar, AppLovinPostbackListener appLovinPostbackListener) {
        q5 q5Var = new q5(eVar, bVar, this.a, appLovinPostbackListener);
        q5Var.a(a(eVar));
        this.a.q0().a((i5) q5Var, bVar);
    }
}
