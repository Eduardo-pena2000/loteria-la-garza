package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v0 {
    protected final com.applovin.impl.sdk.k a;
    protected final JSONObject b;

    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);

        private final int a;

        a(int i) {
            this.a = i;
        }

        public int b() {
            return this.a;
        }
    }

    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public v0(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = jSONObject;
    }

    public static v0 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        b c = c(JsonUtils.getString(jSONObject, "type", null));
        return c == b.ALERT ? new w0(jSONObject, kVar) : c == b.EVENT ? new y0(jSONObject, kVar) : new v0(jSONObject, kVar);
    }

    public String b() {
        return JsonUtils.getString(this.b, "decision_type", null);
    }

    public int c() {
        return JsonUtils.getInt(this.b, "id", -1);
    }

    public b d() {
        return c(e());
    }

    public String e() {
        return JsonUtils.getString(this.b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + c() + ", type=" + d() + "}";
    }

    private static b c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if ("event".equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    public String b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String obj = JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(obj)) {
                String str2 = (String) this.a.A().M().get("app_name");
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(com.applovin.impl.sdk.k.a("THIS_APP"));
                }
            } else {
                arrayList.add(obj);
            }
        }
        return com.applovin.impl.sdk.k.a(JsonUtils.getString(jSONObject, "key", null), (List) arrayList);
    }

    public a a() {
        return a(b());
    }

    public int a(Boolean bool) {
        int i = JsonUtils.getInt(this.b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.b, "destination_state_id_true", -1) : JsonUtils.getInt(this.b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i);
    }

    private static a a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        if ("has_terms_of_service_uri".equalsIgnoreCase(str)) {
            return a.HAS_TERMS_OF_SERVICE_URI;
        }
        return a.NONE;
    }
}
