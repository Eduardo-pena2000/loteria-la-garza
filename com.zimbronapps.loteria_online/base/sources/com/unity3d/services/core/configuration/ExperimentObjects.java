package com.unity3d.services.core.configuration;

import com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class ExperimentObjects extends ExperimentsBase {
    private final Map _experimentObjects = new HashMap();
    private final JSONObject _experimentObjetsData;

    public ExperimentObjects(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentObjetsData = new JSONObject();
            return;
        }
        this._experimentObjetsData = jSONObject;
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            this._experimentObjects.put(str, new ExperimentObject(jSONObject.optJSONObject(str)));
        }
    }

    private String getExperimentValue(String str, String str2) {
        ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getStringValue() : str2;
    }

    private boolean getExperimentValueOrDefault(String str) {
        return getExperimentValue(str, false);
    }

    private JSONObject getExperimentWithAppliedRule(ExperimentAppliedRule experimentAppliedRule) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this._experimentObjects.entrySet()) {
            if (((ExperimentObject) entry.getValue()).getAppliedRule() == experimentAppliedRule) {
                hashMap.put((String) entry.getKey(), ((ExperimentObject) entry.getValue()).getStringValue());
            }
        }
        return new JSONObject(hashMap);
    }

    public JSONObject getCurrentSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.IMMEDIATE);
    }

    public ExperimentObject getExperimentObject(String str) {
        return (ExperimentObject) this._experimentObjects.get(str);
    }

    public Map getExperimentTags() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this._experimentObjects.entrySet()) {
            hashMap.put((String) entry.getKey(), ((ExperimentObject) entry.getValue()).getStringValue());
        }
        return hashMap;
    }

    public JSONObject getExperimentsAsJson() {
        return this._experimentObjetsData;
    }

    public JSONObject getNextSessionExperiments() {
        return getExperimentWithAppliedRule(ExperimentAppliedRule.NEXT);
    }

    public String getScarBiddingManager() {
        return getExperimentValue("scar_bm", ScarBiddingManagerType.DISABLED.getName());
    }

    public boolean isBoldSdkNextSessionEnabled() {
        return getExperimentValue("boldSdkNextSessionEnabled", true);
    }

    public boolean isCaptureHDRCapabilitiesEnabled() {
        return getExperimentValueOrDefault("hdrc");
    }

    public boolean isJetpackLifecycle() {
        return getExperimentValueOrDefault("gjl");
    }

    public boolean isNativeLoadTimeoutDisabled() {
        return getExperimentValueOrDefault("nltd");
    }

    public boolean isNativeShowTimeoutDisabled() {
        return getExperimentValueOrDefault("nstd");
    }

    public boolean isOkHttpEnabled() {
        return getExperimentValueOrDefault("okhttp");
    }

    public boolean isPCCheckEnabled() {
        return getExperimentValueOrDefault("pc_check");
    }

    public boolean isScarBannerHbEnabled() {
        return getExperimentValueOrDefault("scar_bn");
    }

    public boolean isScarInitEnabled() {
        return getExperimentValueOrDefault("scar_init");
    }

    public boolean isWebAssetAdCaching() {
        return getExperimentValueOrDefault("wac");
    }

    public boolean isWebGestureNotRequired() {
        return getExperimentValueOrDefault("wgr");
    }

    public boolean isWebMessageEnabled() {
        return getExperimentValueOrDefault("jwm");
    }

    public boolean isWebViewAsyncDownloadEnabled() {
        return getExperimentValueOrDefault("wad");
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return getExperimentValueOrDefault("tsi_prw");
    }

    private boolean getExperimentValue(String str, boolean z) {
        ExperimentObject experimentObject = getExperimentObject(str);
        return experimentObject != null ? experimentObject.getBooleanValue() : z;
    }
}
