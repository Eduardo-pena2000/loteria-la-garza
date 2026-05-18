package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class a1 {
    public static List a(com.applovin.impl.sdk.k kVar) {
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("ConsentFlowStateProvider", "Generating consent flow states...");
        }
        String a = n7.a(R.raw.applovin_consent_flow_unified_cmp, com.applovin.impl.sdk.k.o(), kVar);
        if (TextUtils.isEmpty(a)) {
            throw new IllegalStateException("Unable to retrieve consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(a, null);
        if (jsonObjectFromJsonString == null) {
            throw new IllegalStateException("Unable to parse consent flow data! Please ensure that the AppLovin SDK resources are bundled correctly!");
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jsonObjectFromJsonString, "states", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(v0.a(JsonUtils.getJSONObject(jSONArray, i, new JSONObject()), kVar));
        }
        return arrayList;
    }
}
