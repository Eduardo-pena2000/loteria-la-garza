package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.d6;
import com.applovin.impl.h6;
import com.applovin.impl.i5;
import com.applovin.impl.n7;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.a;
import com.applovin.impl.sdk.network.e;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b extends i5 implements a.a, AppLovinAdLoadListener {
    private final List A;
    private final List B;
    private final JSONObject g;
    private final JSONObject h;
    private final AppLovinNativeAdLoadListener i;
    private String j;
    private String k;
    private String l;
    private Double m;
    private String n;
    private Uri o;
    private Uri p;
    private o7 q;
    private Uri r;
    private Uri s;
    private Uri t;
    private Uri u;
    private final List v;
    private final List w;
    private final List x;
    private final List y;
    private final List z;

    public b(JSONObject jSONObject, JSONObject jSONObject2, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderNativeAd", kVar);
        this.j = "";
        this.k = "";
        this.l = "";
        this.m = null;
        this.n = "";
        this.o = null;
        this.p = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.g = jSONObject;
        this.h = jSONObject2;
        this.i = appLovinNativeAdLoadListener;
    }

    private void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String string = JsonUtils.getString(jSONObject, "url", null);
        if (StringUtils.isValidString(string)) {
            this.t = Uri.parse(string);
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processed click destination URL: " + this.t);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "fallback", null);
        if (StringUtils.isValidString(string2)) {
            this.u = Uri.parse(string2);
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processed click destination backup URL: " + this.u);
            }
        }
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "clicktrackers", null);
        if (jSONArray != null) {
            if (!JsonUtils.getBoolean(this.g, "use_requests_for_native_ad_click_postbacks", (Boolean) this.a.a(x4.O2)).booleanValue()) {
                try {
                    this.v.addAll(JsonUtils.toList(jSONArray));
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed click tracking URLs: " + this.v);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Failed to render click tracking URLs", th);
                        return;
                    }
                    return;
                }
            }
            for (int i = 0; i < jSONArray.length(); i++) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray, i, null);
                if (objectAtIndex instanceof String) {
                    String str = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str)) {
                        this.x.add(new e.a(this.a).f(str).i(false).g(false).h(f()).b());
                    }
                }
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processed click tracking requests: " + this.x);
            }
        }
    }

    private /* synthetic */ void b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Preparing native ad view components...");
        }
        try {
            appLovinNativeAdImpl.setUpNativeAdViewComponents();
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Successfully prepared native ad view components");
            }
            appLovinNativeAdImpl.getAdEventTracker().h();
            this.i.onNativeAdLoaded(appLovinNativeAdImpl);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Failed to prepare native ad view components", th);
            }
            b(th.getMessage());
            this.a.D().a(this.b, "prepareNativeComponents", th);
        }
    }

    private void c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        AppLovinSdkUtils.runOnUiThread(new q(this, appLovinNativeAdImpl));
    }

    public static /* synthetic */ void e(b bVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        bVar.b(appLovinNativeAdImpl);
    }

    private boolean f() {
        return JsonUtils.getBoolean(this.g, "fire_native_ad_postbacks_from_webview", (Boolean) this.a.a(x4.N2)).booleanValue();
    }

    public void adReceived(AppLovinAd appLovinAd) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "VAST ad rendered successfully");
        }
        this.q = (o7) appLovinAd;
        e();
    }

    public void failedToReceiveAd(int i) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.b(this.b, "VAST ad failed to render");
        }
        e();
    }

    public void run() {
        JSONObject jSONObject = null;
        String string = JsonUtils.getString(this.g, "privacy_icon_url", null);
        if (URLUtil.isValidUrl(string)) {
            this.r = Uri.parse(string);
        }
        String string2 = JsonUtils.getString(this.g, "privacy_url", null);
        if (URLUtil.isValidUrl(string2)) {
            this.s = Uri.parse(string2);
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(this.g, "ortb_response", (JSONObject) null);
        if (jSONObject2 == null || jSONObject2.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "No oRtb response provided: " + this.g);
            }
            b("No oRtb response provided");
            return;
        }
        String string3 = JsonUtils.getString(jSONObject2, "version", null);
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject2, "value", (JSONObject) null);
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Rendering native ad for oRTB version: " + string3);
        }
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "native", jSONObject3);
        a(JsonUtils.getJSONObject(jSONObject4, "link", (JSONObject) null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject4, "assets", null);
        if (jSONArray == null || jSONArray.length() == 0) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unable to retrieve assets - failing ad load: " + this.g);
            }
            b("Unable to retrieve assets");
            return;
        }
        String str = "";
        int i = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONArray, i, jSONObject);
            if (jSONObject5.has("title")) {
                this.j = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject5, "title", jSONObject), "text", jSONObject);
                if (com.applovin.impl.sdk.o.a()) {
                    this.c.a(this.b, "Processed title: " + this.j);
                }
            } else if (jSONObject5.has("link")) {
                a(JsonUtils.getJSONObject(jSONObject5, "link", jSONObject));
            } else if (jSONObject5.has("img")) {
                int i2 = JsonUtils.getInt(jSONObject5, "id", -1);
                JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject5, "img", jSONObject);
                int i3 = JsonUtils.getInt(jSONObject6, "type", -1);
                String string4 = JsonUtils.getString(jSONObject6, "url", jSONObject);
                if (i3 == 1 || 3 == i2) {
                    this.o = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed icon URL: " + this.o);
                    }
                } else if (i3 == 3 || 2 == i2) {
                    this.p = Uri.parse(string4);
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed main image URL: " + this.p);
                    }
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.k(this.b, "Unrecognized image: " + jSONObject5);
                    }
                    int i4 = JsonUtils.getInt(jSONObject6, "w", -1);
                    int i5 = JsonUtils.getInt(jSONObject6, "h", -1);
                    if (i4 <= 0 || i5 <= 0) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.k(this.b, "Skipping...");
                        }
                    } else if (i4 / i5 > 1.0d) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.a(this.b, "Inferring main image from " + i4 + "x" + i5 + "...");
                        }
                        this.p = Uri.parse(string4);
                    } else {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.a(this.b, "Inferring icon image from " + i4 + "x" + i5 + "...");
                        }
                        this.o = Uri.parse(string4);
                    }
                }
            } else if (jSONObject5.has("video")) {
                String string5 = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject5, "video", (JSONObject) null), "vasttag", null);
                if (StringUtils.isValidString(string5)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed VAST video");
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.c.k(this.b, "Ignoring invalid \"vasttag\" for video: " + jSONObject5);
                }
                str = string5;
            } else if (jSONObject5.has("data")) {
                int i6 = JsonUtils.getInt(jSONObject5, "id", -1);
                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject5, "data", (JSONObject) null);
                int i7 = JsonUtils.getInt(jSONObject7, "type", -1);
                String string6 = JsonUtils.getString(jSONObject7, "value", null);
                if (i7 == 1 || i6 == 8) {
                    this.k = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed advertiser: " + this.k);
                    }
                } else if (i7 == 2 || i6 == 4) {
                    this.l = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed body: " + this.l);
                    }
                } else if (i7 == 12 || i6 == 5) {
                    this.n = string6;
                    if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Processed cta: " + this.n);
                    }
                } else if (i7 == 3 || i6 == 6) {
                    double a = n7.a(string6, -1.0d);
                    if (a != -1.0d) {
                        this.m = Double.valueOf(a);
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.a(this.b, "Processed star rating: " + this.m);
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.c.a(this.b, "Received invalid star rating: " + string6);
                    }
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.c.k(this.b, "Skipping unsupported data: " + jSONObject5);
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.c.b(this.b, "Unsupported asset object: " + jSONObject5);
            }
            i++;
            jSONObject = null;
        }
        String string7 = JsonUtils.getString(jSONObject4, "jstracker", null);
        if (StringUtils.isValidString(string7)) {
            this.w.add(string7);
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a(this.b, "Processed jstracker: " + string7);
            }
        }
        Object obj = null;
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject4, "imptrackers", null);
        if (jSONArray2 != null) {
            int i8 = 0;
            while (i8 < jSONArray2.length()) {
                Object objectAtIndex = JsonUtils.getObjectAtIndex(jSONArray2, i8, obj);
                if (objectAtIndex instanceof String) {
                    String str2 = (String) objectAtIndex;
                    if (!TextUtils.isEmpty(str2)) {
                        this.y.add(new e.a(this.a).f(str2).i(false).g(false).h(f()).b());
                        if (com.applovin.impl.sdk.o.a()) {
                            this.c.a(this.b, "Processed imptracker URL: " + str2);
                        }
                    }
                }
                i8++;
                obj = null;
            }
        }
        JSONObject jSONObject8 = null;
        JSONArray jSONArray3 = JsonUtils.getJSONArray(jSONObject4, "eventtrackers", null);
        if (jSONArray3 != null) {
            int i9 = 0;
            while (i9 < jSONArray3.length()) {
                JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONArray3, i9, jSONObject8);
                int i10 = JsonUtils.getInt(jSONObject9, "event", -1);
                int i11 = JsonUtils.getInt(jSONObject9, "method", -1);
                String string8 = JsonUtils.getString(jSONObject9, "url", jSONObject8);
                if (!TextUtils.isEmpty(string8)) {
                    if (i11 == 1 || i11 == 2) {
                        if (i11 == 2 && string8.startsWith("<script")) {
                            this.w.add(string8);
                        } else {
                            com.applovin.impl.sdk.network.e b = new e.a(this.a).f(string8).i(false).g(false).h(f() || i11 == 2).b();
                            if (i10 == 1) {
                                this.y.add(b);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a(this.b, "Processed impression URL: " + string8);
                                }
                            } else if (i10 == 2) {
                                this.z.add(b);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a(this.b, "Processed viewable MRC50 URL: " + string8);
                                }
                            } else if (i10 == 3) {
                                this.A.add(b);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a(this.b, "Processed viewable MRC100 URL: " + string8);
                                }
                            } else if (i10 == 4) {
                                this.B.add(b);
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a(this.b, "Processed viewable video 50 URL: " + string8);
                                }
                            } else if (i10 == 555) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.c.a(this.b, "Ignoring processing of OMID URL: " + string8);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.c.b(this.b, "Unsupported event tracker: " + jSONObject9);
                            }
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.c.b(this.b, "Unsupported method for event tracker: " + jSONObject9);
                    }
                }
                i9++;
                jSONObject8 = null;
            }
        }
        if (!StringUtils.isValidString(str)) {
            e();
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Processing VAST video...");
        }
        this.a.q0().a(h6.a(str, JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.h), this, this.a));
    }

    private void e() {
        AppLovinNativeAdImpl build = new AppLovinNativeAdImpl.Builder(JsonUtils.shallowCopy(this.g), JsonUtils.shallowCopy(this.h), this.a).setTitle(this.j).setAdvertiser(this.k).setBody(this.l).setCallToAction(this.n).setStarRating(this.m).setIconUri(this.o).setMainImageUri(this.p).setPrivacyIconUri(this.r).setVastAd(this.q).setPrivacyDestinationUri(this.s).setClickDestinationUri(this.t).setClickDestinationBackupUri(this.u).setClickTrackingUrls(this.v).setJsTrackers(this.w).setClickTrackingRequests(this.x).setImpressionRequests(this.y).setViewableMRC50Requests(this.z).setViewableMRC100Requests(this.A).setViewableVideo50Requests(this.B).build();
        build.getAdEventTracker().e();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Starting cache task for type: " + build.getType() + "...");
        }
        this.a.q0().a((i5) new a(build, this.a, this), d6.b.CORE);
    }

    private void b(String str) {
        this.i.onNativeAdLoadFailed(new AppLovinError(-6, str));
    }

    public void a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Successfully cached and loaded ad");
        }
        c(appLovinNativeAdImpl);
    }
}
