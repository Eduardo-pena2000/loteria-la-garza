package com.unity3d.ads.core.domain.offerwall;

import Ca.I;
import Ga.e;
import Ha.c;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LoadOfferwallAd {
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(OfferwallManager offerwallManager) {
        t.g(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, e eVar) {
        Object loadAd = this.offerwallManager.loadAd(str, eVar);
        return loadAd == c.f() ? loadAd : I.a;
    }
}
