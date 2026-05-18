package com.amazon.device.simplesignin.a.d;

import com.amazon.device.simplesignin.model.Link;
import com.amazon.device.simplesignin.model.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b {
    private static final String a = "b";

    private b() {
    }

    public static List a(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str2);
            if (jSONArray.length() == 0) {
                a.a(a, "No links available, links object received is empty.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    Link link = new Link();
                    link.setAmazonUserId(str);
                    link.setIdentityProviderName(jSONObject.getString("identityProviderName"));
                    link.setLinkId(jSONObject.getString("linkId"));
                    link.setPartnerUserId(jSONObject.getString("partnerUserId"));
                    link.setLinkedTimestamp(jSONObject.getLong("linkedTimestamp"));
                    Token token = new Token();
                    JSONObject jSONObject2 = new JSONObject(jSONObject.getString("ssiToken"));
                    token.setToken(jSONObject2.getString("token"));
                    token.setSchema(jSONObject2.getString("schema"));
                    link.setSsiToken(token);
                    arrayList.add(link);
                } catch (JSONException e) {
                    a.b(a, "Failure generating Link object from response." + e);
                    return null;
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            a.b(a, "Failure generating Link object from Kiwi response." + e2);
            return null;
        }
    }

    public static String a(String str) {
        try {
            return new JSONObject(str).getString("linkId");
        } catch (JSONException e) {
            a.b(a, "Failure extracting Link ID object from response." + e);
            return null;
        }
    }
}
