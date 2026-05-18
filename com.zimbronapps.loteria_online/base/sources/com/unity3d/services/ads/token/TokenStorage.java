package com.unity3d.services.ads.token;

import Ca.I;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface TokenStorage {
    void appendTokens(JSONArray jSONArray) throws JSONException;

    void createTokens(JSONArray jSONArray) throws JSONException;

    void deleteTokens();

    I getNativeGeneratedToken();

    String getToken();

    void setInitToken(String str);
}
