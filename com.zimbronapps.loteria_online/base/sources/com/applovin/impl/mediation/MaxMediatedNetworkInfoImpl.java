package com.applovin.impl.mediation;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class MaxMediatedNetworkInfoImpl implements MaxMediatedNetworkInfo {
    private final JSONObject a;

    public MaxMediatedNetworkInfoImpl(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public String getAdapterClassName() {
        return JsonUtils.getString(this.a, "class", "");
    }

    public String getAdapterVersion() {
        return JsonUtils.getString(this.a, "version", "");
    }

    public MaxMediatedNetworkInfo.InitializationStatus getInitializationStatus() {
        return MaxMediatedNetworkInfo.InitializationStatus.fromCode(JsonUtils.getInt(this.a, "initialization_status", MaxMediatedNetworkInfo.InitializationStatus.NOT_INITIALIZED.getCode()));
    }

    public String getName() {
        return JsonUtils.getString(this.a, "name", "");
    }

    public String getSdkVersion() {
        return JsonUtils.getString(this.a, "sdk_version", "");
    }

    public String toString() {
        return "MaxMediatedNetworkInfo{name=" + getName() + ", adapterClassName=" + getAdapterClassName() + ", adapterVersion=" + getAdapterVersion() + ", sdkVersion=" + getSdkVersion() + ", initializationStatus=" + getInitializationStatus() + '}';
    }
}
