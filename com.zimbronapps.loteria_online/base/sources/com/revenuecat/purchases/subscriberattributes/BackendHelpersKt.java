package com.revenuecat.purchases.subscriberattributes;

import Ca.x;
import Da.D;
import Da.M;
import Da.S;
import Da.v;
import Da.w;
import Wa.i;
import Wa.n;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BackendHelpersKt {
    public static final List getAttributeErrors(JSONObject jSONObject) {
        if (jSONObject == null) {
            return v.n();
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("attributes_error_response");
        if (optJSONObject != null) {
            jSONObject = optJSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("attribute_errors");
        if (optJSONArray != null) {
            i w = n.w(0, optJSONArray.length());
            ArrayList arrayList = new ArrayList(w.y(w, 10));
            M it = w.iterator();
            while (it.hasNext()) {
                arrayList.add(optJSONArray.getJSONObject(it.a()));
            }
            ArrayList<JSONObject> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(w.y(arrayList2, 10));
            for (JSONObject jSONObject3 : arrayList2) {
                String string = jSONObject3.getString("key_name");
                t.f(string, "it.getString(\"key_name\")");
                String string2 = jSONObject3.getString("message");
                t.f(string2, "it.getString(\"message\")");
                arrayList3.add(new SubscriberAttributeError(string, string2));
            }
            List L0 = D.L0(arrayList3);
            if (L0 != null) {
                return L0;
            }
        }
        return v.n();
    }

    public static final Map toBackendMap(Map map) {
        t.g(map, "<this>");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(x.a((String) entry.getKey(), ((SubscriberAttribute) entry.getValue()).toBackendMap()));
        }
        return S.x(arrayList);
    }
}
