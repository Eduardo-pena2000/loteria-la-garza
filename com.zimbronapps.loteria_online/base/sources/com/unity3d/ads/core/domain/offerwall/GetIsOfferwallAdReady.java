package com.unity3d.ads.core.domain.offerwall;

import Ga.e;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetIsOfferwallAdReady {
    private final OfferwallManager offerwallManager;

    public GetIsOfferwallAdReady(OfferwallManager offerwallManager) {
        t.g(offerwallManager, "offerwallManager");
        this.offerwallManager = offerwallManager;
    }

    public final Object invoke(String str, e eVar) {
        return this.offerwallManager.isAdReady(str, eVar);
    }
}
