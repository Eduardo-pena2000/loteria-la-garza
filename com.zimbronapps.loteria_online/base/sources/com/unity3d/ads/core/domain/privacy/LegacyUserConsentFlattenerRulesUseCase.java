package com.unity3d.ads.core.domain.privacy;

import Da.u;
import Da.v;
import com.unity3d.services.core.misc.JsonFlattenerRules;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LegacyUserConsentFlattenerRulesUseCase implements FlattenerRulesUseCase {
    public JsonFlattenerRules invoke() {
        return new JsonFlattenerRules(v.t("privacy", "unity", "pipl"), u.e("value"), v.t("ts", "exclude", "pii", "nonBehavioral", "nonbehavioral"));
    }
}
