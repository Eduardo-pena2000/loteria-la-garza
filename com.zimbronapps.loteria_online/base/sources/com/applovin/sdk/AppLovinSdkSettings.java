package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinSdkSettings {
    private boolean a;
    private boolean b;
    private String e;
    private String f;
    private String g;
    private final AppLovinTermsAndPrivacyPolicyFlowSettings j;
    private k k;
    private String l;
    private boolean d = true;
    private final Map h = Collections.synchronizedMap(new HashMap());
    private final Map i = Collections.synchronizedMap(new HashMap());
    private boolean c = true;

    public AppLovinSdkSettings(Context context) {
        this.l = "";
        if (context == null) {
            o.h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context e = n7.e(context);
        this.a = n7.m(e);
        this.j = u0.a(e);
        this.l = e.getPackageName();
        a(e);
    }

    private void a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String a = n7.a(identifier, context, (k) null);
        this.h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(a) ? JsonUtils.jsonObjectFromJsonString(a, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(k kVar) {
        this.k = kVar;
        if (StringUtils.isValidString(this.e)) {
            kVar.s0().a(Arrays.asList(this.e.split(",")));
            this.e = null;
        }
        if (this.f != null) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinSdkSettings", "Setting user id: " + this.f);
            }
            kVar.w0().a(this.f);
            this.f = null;
        }
        if (StringUtils.isValidString(this.g)) {
            l.a(this.g, kVar);
            this.g = null;
        }
        for (Map.Entry entry : this.i.entrySet()) {
            kVar.v0().a(d2.k, "preInitExtraParameter", (Map) CollectionUtils.hashMap("details", ((String) entry.getKey()) + ":" + ((String) entry.getValue())));
        }
        this.i.clear();
    }

    public Map getExtraParameters() {
        Map map;
        synchronized (this.h) {
            map = CollectionUtils.map(this.h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.j;
    }

    public String getUserIdentifier() {
        k kVar = this.k;
        return kVar == null ? this.f : kVar.w0().e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.c;
    }

    public boolean isMuted() {
        return this.b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        o.e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.c == z) {
            return;
        }
        this.c = z;
        k kVar = this.k;
        if (kVar == null) {
            return;
        }
        if (z) {
            kVar.y().l();
        } else {
            kVar.y().k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        o.e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            o.h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.k == null) {
                this.e = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.k.s0().a(Arrays.asList(trim.split(",")));
            } else {
                this.k.s0().a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            o.a(Boolean.parseBoolean(trim));
        } else if ("package_name_override".equals(str)) {
            k kVar = this.k;
            if (kVar != null) {
                l.a(trim, kVar);
            } else {
                this.g = trim;
            }
        }
        if (this.k != null) {
            this.k.v0().a(d2.k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + ":" + str2));
        } else {
            this.i.put(str, trim);
        }
        this.h.put(str, trim);
    }

    public void setMuted(boolean z) {
        o.e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        o.e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.d = z;
    }

    public void setUserIdentifier(String str) {
        o.e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > n7.d(8)) {
            o.h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + n7.d(8) + " maximum)");
        }
        k kVar = this.k;
        if (kVar == null) {
            this.f = str;
            return;
        }
        kVar.O();
        if (o.a()) {
            this.k.O().a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.k.w0().a(str);
    }

    public void setVerboseLogging(boolean z) {
        o.e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!n7.l()) {
            this.a = z;
            return;
        }
        o.h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (n7.m(null) != z) {
            o.h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.d;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.a + ", muted=" + this.b + ", creativeDebuggerEnabled=" + this.c + '}';
    }
}
