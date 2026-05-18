package com.revenuecat.purchases.virtualcurrencies;

import com.revenuecat.purchases.common.JsonProvider;
import com.revenuecat.purchases.common.networking.HTTPResult;
import kotlin.jvm.internal.t;
import ob.j;
import org.json.JSONException;
import org.json.JSONObject;
import tb.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VirtualCurrenciesFactory {
    public static final VirtualCurrenciesFactory INSTANCE = new VirtualCurrenciesFactory();

    private VirtualCurrenciesFactory() {
    }

    public final VirtualCurrencies buildVirtualCurrencies(HTTPResult httpResult) throws JSONException, j, IllegalArgumentException {
        t.g(httpResult, "httpResult");
        return buildVirtualCurrencies(httpResult.getBody());
    }

    public final VirtualCurrencies buildVirtualCurrencies(JSONObject body) throws JSONException, j, IllegalArgumentException {
        t.g(body, "body");
        b defaultJson = JsonProvider.Companion.getDefaultJson();
        String jSONObject = body.toString();
        t.f(jSONObject, "body.toString()");
        defaultJson.a();
        return (VirtualCurrencies) defaultJson.d(VirtualCurrencies.Companion.serializer(), jSONObject);
    }

    public final VirtualCurrencies buildVirtualCurrencies(String jsonString) throws JSONException, j, IllegalArgumentException {
        t.g(jsonString, "jsonString");
        b defaultJson = JsonProvider.Companion.getDefaultJson();
        defaultJson.a();
        return (VirtualCurrencies) defaultJson.d(VirtualCurrencies.Companion.serializer(), jsonString);
    }
}
