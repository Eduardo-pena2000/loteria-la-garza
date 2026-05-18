package com.applovin.impl.sdk;

import android.graphics.Color;
import com.applovin.impl.e4;
import com.applovin.impl.f4;
import com.applovin.impl.h5;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class AppLovinAdBase implements e4 {
    protected final JSONObject adObject;
    private final long createdAtMillis;
    protected final JSONObject fullResponse;
    protected final k sdk;
    protected final h5 synchronizedAdObject;
    protected final h5 synchronizedFullResponse;
    protected final Object adObjectLock = new Object();
    protected final Object fullResponseLock = new Object();

    public AppLovinAdBase(JSONObject jSONObject, JSONObject jSONObject2, k kVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No ad object specified");
        }
        if (jSONObject2 == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.sdk = kVar;
        if (((Boolean) kVar.a(x4.C6)).booleanValue()) {
            this.synchronizedAdObject = new h5(jSONObject);
            this.synchronizedFullResponse = new h5(jSONObject2);
            this.adObject = null;
            this.fullResponse = null;
        } else {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.synchronizedAdObject = null;
            this.synchronizedFullResponse = null;
        }
        this.createdAtMillis = System.currentTimeMillis();
    }

    public boolean containsKeyForAdObject(String str) {
        boolean has;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str);
        }
        synchronized (this.adObjectLock) {
            has = this.adObject.has(str);
        }
        return has;
    }

    public String getAdDomain() {
        return getStringFromFullResponse("adomain", "");
    }

    public abstract /* synthetic */ f4 getAdEventTracker();

    public abstract long getAdIdNumber();

    public boolean getBooleanFromAdObject(String str, Boolean bool) {
        boolean booleanValue;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, bool).booleanValue();
        }
        synchronized (this.adObjectLock) {
            booleanValue = JsonUtils.getBoolean(this.adObject, str, bool).booleanValue();
        }
        return booleanValue;
    }

    public boolean getBooleanFromFullResponse(String str, boolean z) {
        boolean booleanValue;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, Boolean.valueOf(z)).booleanValue();
        }
        synchronized (this.fullResponseLock) {
            booleanValue = JsonUtils.getBoolean(this.fullResponse, str, Boolean.valueOf(z)).booleanValue();
        }
        return booleanValue;
    }

    public String getClCode() {
        String stringFromAdObject = getStringFromAdObject("clcode", "");
        return StringUtils.isValidString(stringFromAdObject) ? stringFromAdObject : getStringFromFullResponse("clcode", "");
    }

    public int getColorFromAdObject(String str, int i) {
        String stringFromAdObject = getStringFromAdObject(str, null);
        return StringUtils.isValidString(stringFromAdObject) ? Color.parseColor(stringFromAdObject) : i;
    }

    public long getCreatedAtMillis() {
        return this.createdAtMillis;
    }

    public String getDspId() {
        return getStringFromFullResponse("dsp_id", "");
    }

    public String getDspName() {
        return getStringFromFullResponse("dsp_name", "");
    }

    public long getFetchLatencyMillis() {
        return getLongFromFullResponse("ad_fetch_latency_millis", -1L);
    }

    public long getFetchResponseSize() {
        return getLongFromFullResponse("ad_fetch_response_size", -1L);
    }

    public float getFloatFromAdObject(String str, float f) {
        float f2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, f);
        }
        synchronized (this.adObjectLock) {
            f2 = JsonUtils.getFloat(this.adObject, str, f);
        }
        return f2;
    }

    public int getIntFromAdObject(String str, int i) {
        int i2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, i);
        }
        synchronized (this.adObjectLock) {
            i2 = JsonUtils.getInt(this.adObject, str, i);
        }
        return i2;
    }

    public List getIntegerListFromAdObject(String str, List list) {
        List integerList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, list);
        }
        synchronized (this.adObjectLock) {
            integerList = JsonUtils.getIntegerList(this.adObject, str, list);
        }
        return integerList;
    }

    public JSONArray getJsonArrayFromAdObject(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONArray);
        }
        synchronized (this.adObjectLock) {
            jSONArray2 = JsonUtils.getJSONArray(this.adObject, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject getJsonObjectFromAdObject(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, jSONObject);
        }
        synchronized (this.adObjectLock) {
            jSONObject2 = JsonUtils.getJSONObject(this.adObject, str, jSONObject);
        }
        return jSONObject2;
    }

    public long getLongFromAdObject(String str, long j) {
        long j2;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.adObjectLock) {
            j2 = JsonUtils.getLong(this.adObject, str, j);
        }
        return j2;
    }

    public long getLongFromFullResponse(String str, long j) {
        long j2;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, j);
        }
        synchronized (this.fullResponseLock) {
            j2 = JsonUtils.getLong(this.fullResponse, str, j);
        }
        return j2;
    }

    public abstract /* synthetic */ String getOpenMeasurementContentUrl();

    public abstract /* synthetic */ String getOpenMeasurementCustomReferenceData();

    public abstract /* synthetic */ List getOpenMeasurementVerificationScriptResources();

    public k getSdk() {
        return this.sdk;
    }

    public String getStringFromAdObject(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.adObjectLock) {
            string = JsonUtils.getString(this.adObject, str, str2);
        }
        return string;
    }

    public String getStringFromFullResponse(String str, String str2) {
        String string;
        h5 h5Var = this.synchronizedFullResponse;
        if (h5Var != null) {
            return h5Var.a(str, str2);
        }
        synchronized (this.fullResponseLock) {
            string = JsonUtils.getString(this.fullResponse, str, str2);
        }
        return string;
    }

    public List getStringListFromAdObject(String str, List list) {
        List stringList;
        h5 h5Var = this.synchronizedAdObject;
        if (h5Var != null) {
            return h5Var.b(str, list);
        }
        synchronized (this.adObjectLock) {
            stringList = JsonUtils.getStringList(this.adObject, str, list);
        }
        return stringList;
    }

    public abstract /* synthetic */ boolean isOpenMeasurementEnabled();
}
