package com.unity3d.services.core.configuration;

import com.unity3d.services.ads.gmascar.managers.ScarBiddingManagerType;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class Experiments extends ExperimentsBase {
    private static final Set NEXT_SESSION_FLAGS = new HashSet(Collections.singletonList("tsi_prw"));
    private final JSONObject _experimentData;

    public Experiments() {
        this(null);
    }

    public JSONObject getCurrentSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator keys = this._experimentData.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!NEXT_SESSION_FLAGS.contains(str)) {
                hashMap.put(str, String.valueOf(this._experimentData.optBoolean(str)));
            }
        }
        return new JSONObject(hashMap);
    }

    public Map getExperimentTags() {
        HashMap hashMap = new HashMap();
        Iterator keys = this._experimentData.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, String.valueOf(this._experimentData.opt(str)));
        }
        return hashMap;
    }

    public JSONObject getExperimentsAsJson() {
        return this._experimentData;
    }

    public JSONObject getNextSessionExperiments() {
        if (this._experimentData == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator keys = this._experimentData.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (NEXT_SESSION_FLAGS.contains(str)) {
                hashMap.put(str, String.valueOf(this._experimentData.optBoolean(str)));
            }
        }
        return new JSONObject(hashMap);
    }

    public String getScarBiddingManager() {
        return this._experimentData.optString("scar_bm", ScarBiddingManagerType.DISABLED.getName());
    }

    public boolean isBoldSdkNextSessionEnabled() {
        return this._experimentData.optBoolean("boldSdkNextSessionEnabled", true);
    }

    public boolean isCaptureHDRCapabilitiesEnabled() {
        return this._experimentData.optBoolean("hdrc", false);
    }

    public boolean isJetpackLifecycle() {
        return this._experimentData.optBoolean("gjl", false);
    }

    public boolean isNativeLoadTimeoutDisabled() {
        return this._experimentData.optBoolean("nltd", false);
    }

    public boolean isNativeShowTimeoutDisabled() {
        return this._experimentData.optBoolean("nstd", false);
    }

    public boolean isOkHttpEnabled() {
        return this._experimentData.optBoolean("okhttp", false);
    }

    public boolean isPCCheckEnabled() {
        return this._experimentData.optBoolean("pc_check", false);
    }

    public boolean isScarBannerHbEnabled() {
        return this._experimentData.optBoolean("scar_bn", false);
    }

    public boolean isScarInitEnabled() {
        return this._experimentData.optBoolean("scar_init", false);
    }

    public boolean isWebAssetAdCaching() {
        return this._experimentData.optBoolean("wac", false);
    }

    public boolean isWebGestureNotRequired() {
        return this._experimentData.optBoolean("wgr", false);
    }

    public boolean isWebMessageEnabled() {
        return this._experimentData.optBoolean("jwm", false);
    }

    public boolean isWebViewAsyncDownloadEnabled() {
        return this._experimentData.optBoolean("wad", false);
    }

    public boolean shouldNativeTokenAwaitPrivacy() {
        return this._experimentData.optBoolean("tsi_prw", false);
    }

    public Experiments(JSONObject jSONObject) {
        if (jSONObject == null) {
            this._experimentData = new JSONObject();
        } else {
            this._experimentData = jSONObject;
        }
    }
}
