package com.unity3d.ads.core.domain.om;

import Q8.f;
import Q8.h;
import Q8.j;
import android.webkit.WebView;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OmidOptions;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AndroidOmInteraction implements OmInteraction {
    private final f getCreativeType(JSONObject jSONObject) {
        int optInt = jSONObject.optInt("creativeType");
        if (optInt == 1) {
            return f.b;
        }
        if (optInt == 2) {
            return f.c;
        }
        if (optInt == 3) {
            return f.d;
        }
        if (optInt == 4) {
            return f.e;
        }
        if (optInt == 5) {
            return f.f;
        }
        throw new IllegalArgumentException("Invalid creativeType");
    }

    private final h getImpressionType(JSONObject jSONObject) {
        switch (jSONObject.optInt("impressionType")) {
            case 1:
                return h.b;
            case 2:
                return h.c;
            case 3:
                return h.d;
            case 4:
                return h.e;
            case 5:
                return h.f;
            case 6:
                return h.g;
            case 7:
                return h.h;
            case 8:
                return h.i;
            default:
                throw new IllegalArgumentException("Invalid impressionType");
        }
    }

    private final j getImpressionsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("impressionOwner");
            if (optInt == 1) {
                return j.c;
            }
            if (optInt == 2) {
                return j.b;
            }
            if (optInt == 3) {
                return j.d;
            }
            throw new IllegalArgumentException("Invalid impressionOwner");
        } catch (IllegalArgumentException unused) {
            return j.d;
        }
    }

    private final j getMediaEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("mediaEventsOwner");
            if (optInt == 1) {
                return j.c;
            }
            if (optInt == 2) {
                return j.b;
            }
            if (optInt == 3) {
                return j.d;
            }
            throw new IllegalArgumentException("Invalid mediaEventsOwner");
        } catch (IllegalArgumentException unused) {
            return j.d;
        }
    }

    private final j getVideoEventsOwner(JSONObject jSONObject) {
        try {
            int optInt = jSONObject.optInt("videoEventsOwner");
            if (optInt == 1) {
                return j.c;
            }
            if (optInt == 2) {
                return j.b;
            }
            if (optInt == 3) {
                return j.d;
            }
            throw new IllegalArgumentException("Invalid videoEventsOwner");
        } catch (IllegalArgumentException unused) {
            return j.d;
        }
    }

    public OmidOptions getOMidOptions(JSONObject options) {
        t.g(options, "options");
        return new OmidOptions(options.optBoolean("isolateVerificationScripts"), getImpressionsOwner(options), getVideoEventsOwner(options), options.optString("customReferenceData"), getImpressionType(options), getCreativeType(options), getMediaEventsOwner(options));
    }

    public WebView getWebview(AdObject adObject) {
        t.g(adObject, "adObject");
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer instanceof AndroidFullscreenWebViewAdPlayer) {
            return ((AndroidFullscreenWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        if (adPlayer instanceof AndroidEmbeddableWebViewAdPlayer) {
            return ((AndroidEmbeddableWebViewAdPlayer) adPlayer).getWebViewContainer().getWebView();
        }
        return null;
    }
}
