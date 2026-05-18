package com.applovin.impl;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.applovin.impl.d2;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class e2 {
    private static volatile ExecutorService g;
    protected final com.applovin.impl.sdk.k a;
    protected final com.applovin.impl.sdk.o b;
    private final d2.b c;
    private final Map d = Collections.synchronizedMap(new HashMap());
    private final Set e = Collections.synchronizedSet(new HashSet());
    private static final int f = (int) TimeUnit.SECONDS.toMillis(30);
    private static final Object h = new Object();

    public class a implements ThreadFactory {

        public class a implements Thread.UncaughtExceptionHandler {
            public a() {
            }

            public void uncaughtException(Thread thread, Throwable th) {
                e2.this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    e2.this.a.O().a("HealthEventsReporter", "Caught unhandled exception", th);
                }
            }
        }

        public a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:health_events_reporter");
            thread.setDaemon(true);
            thread.setPriority(((Integer) e2.this.a.a(x4.S)).intValue());
            thread.setUncaughtExceptionHandler(new a());
            return thread;
        }
    }

    public e2(com.applovin.impl.sdk.k kVar, d2.b bVar) {
        this.a = kVar;
        this.b = kVar.O();
        this.c = bVar;
        a();
    }

    public static /* synthetic */ void a(e2 e2Var, d2 d2Var, List list) {
        e2Var.b(d2Var, list);
    }

    public static /* synthetic */ void b(e2 e2Var, String str, d2 d2Var, JSONObject jSONObject) {
        e2Var.a(str, d2Var, jSONObject);
    }

    private void c(d2 d2Var, List list) {
        HttpURLConnection httpURLConnection;
        Throwable th;
        if (d2Var.a() == d2.b.AD || d2Var.a() == d2.b.MEDIATED_AD || d2Var.a() == d2.b.USER_SESSION || !n7.a(((Integer) this.a.a(x4.B)).intValue())) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            try {
                httpURLConnection = (HttpURLConnection) a(d2Var, map).openConnection();
                try {
                    int i = f;
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i);
                    httpURLConnection.setDefaultUseCaches(false);
                    httpURLConnection.setAllowUserInteraction(false);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
                    int responseCode = httpURLConnection.getResponseCode();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.b.a("HealthEventsReporter", d2Var.b() + " reported with code " + responseCode + " and extra parameters " + map);
                    }
                    this.d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters " + map, th);
                        }
                        n7.a(httpURLConnection, this.a);
                    } finally {
                        n7.a(httpURLConnection, this.a);
                    }
                }
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
    }

    public void d(d2 d2Var, Map map) {
        a(d2Var, map, 0L);
    }

    private void a() {
        if (g != null) {
            return;
        }
        synchronized (h) {
            try {
                if (g != null) {
                    return;
                }
                g = Executors.newFixedThreadPool(1, new a());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d(d2 d2Var, List list) {
        String str = (String) this.a.a(x4.C);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double a2 = d2Var.a(this.a);
        if (n7.a(a2)) {
            if (((Boolean) this.a.a(x4.I)).booleanValue()) {
                a(str, d2Var, a(d2Var, a2, list));
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g.execute(new L0(this, str, d2Var, a(d2Var, a2, Collections.singletonList((Map) it.next()))));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(String str, d2 d2Var, JSONObject jSONObject) {
        byte[] bytes;
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2 = null;
        try {
            URL url = new URL(str);
            bytes = jSONObject.toString().getBytes("UTF-8");
            httpURLConnection = (HttpURLConnection) url.openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            int i = f;
            httpURLConnection.setConnectTimeout(i);
            httpURLConnection.setReadTimeout(i);
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("AppLovin-Event-Type", d2Var.b());
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bytes);
            outputStream.close();
            int responseCode = httpURLConnection.getResponseCode();
            if (com.applovin.impl.sdk.o.a()) {
                this.b.a("HealthEventsReporter", d2Var.b() + " reported with code " + responseCode);
            }
            this.d.put(d2Var, Long.valueOf(System.currentTimeMillis()));
            n7.a(httpURLConnection, this.a);
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            try {
                if (com.applovin.impl.sdk.o.a()) {
                    this.b.d("HealthEventsReporter", "Failed to report " + d2Var.b(), th);
                }
            } finally {
                n7.a(httpURLConnection2, this.a);
            }
        }
    }

    public void a(d2 d2Var, String str) {
        a(d2Var, str, (Map) new HashMap());
    }

    public void a(d2 d2Var, String str, Map map) {
        map.put("source", str);
        d(d2Var, map);
    }

    public void a(d2 d2Var, String str, Map map, String str2) {
        if (!StringUtils.isValidString(str2) || this.e.add(str2)) {
            map.put("source", str);
            a(d2Var, str, map);
        }
    }

    public void a(d2 d2Var, Map map, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        a(d2Var, (List) arrayList, j);
    }

    public void a(d2 d2Var, List list, long j) {
        if (a(d2Var, j)) {
            return;
        }
        try {
            if (n7.i()) {
                g.execute(new K0(this, d2Var, list));
            } else {
                b(d2Var, list);
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.b.d("HealthEventsReporter", "Failed to report " + d2Var.b() + " with extra parameters collection " + list, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(d2 d2Var, List list) {
        if (AppLovinSdkUtils.isEmulator()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.b.a("HealthEventsReporter", "Reporting " + d2Var.b() + " with extra parameters collection " + list);
        }
        if (this.c != d2Var.a()) {
            l1.a("Health event " + d2Var.b() + " category: " + d2Var.a() + " does not match the reporter category: " + this.c, new Object[0]);
        }
        c(d2Var, list);
        d(d2Var, list);
    }

    private Map c(d2 d2Var, Map map) {
        HashMap hashMap = new HashMap(map);
        if (d2Var == d2.P0) {
            hashMap.remove("details");
        }
        return hashMap;
    }

    private Map b(d2 d2Var, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", d2Var.b());
        if (d2Var == d2.L0 || d2Var == d2.K0 || d2Var == d2.b1 || d2Var == d2.Z0) {
            if (((Boolean) this.a.a(x4.n4)).booleanValue()) {
                CollectionUtils.putStringIfValid("wvvc", String.valueOf(n8.d()), hashMap);
                CollectionUtils.putStringIfValid("wvv", n8.c(), hashMap);
                CollectionUtils.putStringIfValid("wvpn", n8.b(), hashMap);
            }
            CollectionUtils.putStringIfValid("oglv", this.a.A().K(), hashMap);
        }
        Map N = this.a.A().N();
        hashMap.put("platform", String.valueOf(N.get("platform")));
        hashMap.put("country_code", String.valueOf(N.get("country_code")));
        hashMap.put("cc", this.a.v().getCountryCode());
        hashMap.put("applovin_random_token", this.a.h0());
        hashMap.put("compass_random_token", this.a.u());
        hashMap.put("model", Build.MODEL);
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("api_level", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("sdk_version", String.valueOf(AppLovinSdk.VERSION));
        CollectionUtils.putStringIfValid("ad_review_sdk_version", j.b(), hashMap);
        hashMap.put("md", (String) this.a.a(x4.t));
        b(hashMap);
        a(hashMap);
        if (map != null) {
            hashMap.putAll(c(d2Var, map));
        }
        return hashMap;
    }

    private URL a(d2 d2Var, Map map) {
        StringBuilder sb = new StringBuilder("https://ms.applovin.com/1.0/sdk/error");
        sb.append("?");
        Iterator it = b(d2Var, map).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String encode = URLEncoder.encode((String) entry.getKey(), "UTF-8");
            String encode2 = URLEncoder.encode((String) entry.getValue(), "UTF-8");
            sb.append(encode);
            sb.append("=");
            sb.append(encode2);
            if (it.hasNext()) {
                sb.append("&");
            }
        }
        return new URL(sb.toString());
    }

    private JSONObject a(d2 d2Var, double d, List list) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putLong(jSONObject, "ts_ms", System.currentTimeMillis());
        if (d2Var == d2.L0 || d2Var == d2.K0 || d2Var == d2.b1 || d2Var == d2.Z0) {
            if (((Boolean) this.a.a(x4.n4)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "wvvc", String.valueOf(n8.d()));
                JsonUtils.putStringIfValid(jSONObject, "wvv", n8.c());
                JsonUtils.putStringIfValid(jSONObject, "wvpn", n8.b());
            }
            JsonUtils.putStringIfValid(jSONObject, "oglv", this.a.A().K());
        }
        JSONObject jSONObject2 = new JSONObject();
        Map N = this.a.A().N();
        JsonUtils.putObject(jSONObject2, "platform", N.get("platform"));
        JsonUtils.putObject(jSONObject2, "os", N.get("os"));
        JsonUtils.putObject(jSONObject2, "api_level", String.valueOf(N.get("api_level")));
        JsonUtils.putObject(jSONObject2, "brand", N.get("brand"));
        JsonUtils.putObject(jSONObject2, "model", N.get("model"));
        JsonUtils.putObject(jSONObject2, "brand_name", N.get("brand_name"));
        JsonUtils.putObject(jSONObject2, "hardware", N.get("hardware"));
        JsonUtils.putObject(jSONObject2, "revision", N.get("revision"));
        JsonUtils.putObject(jSONObject2, "country_code", N.get("country_code"));
        JsonUtils.putObject(jSONObject2, "cc", this.a.v().getCountryCode());
        JsonUtils.putObject(jSONObject2, "applovin_random_token", this.a.h0());
        JsonUtils.putObject(jSONObject2, "compass_random_token", this.a.u());
        JsonUtils.putObject(jSONObject2, "art", StringUtils.emptyIfNull(this.a.r()));
        JsonUtils.putObject(jSONObject2, "ad_review_sdk_version", StringUtils.emptyIfNull(j.b()));
        Map G = this.a.A().G();
        JsonUtils.putObject(jSONObject2, "sdk_version", G.get("sdk_version"));
        JsonUtils.putObject(jSONObject2, "plugin_version", this.a.a(x4.L3));
        JsonUtils.putObject(jSONObject2, "app_version", G.get("app_version"));
        JsonUtils.putObject(jSONObject2, "package_name", G.get("package_name"));
        JsonUtils.putObject(jSONObject2, "app_version_code", String.valueOf(G.get("app_version_code")));
        JsonUtils.putObject(jSONObject2, "first_install", Boolean.toString(Boolean.TRUE.equals((Boolean) G.get("first_install_v2"))));
        JsonUtils.putObject(jSONObject2, "md", this.a.a(x4.t));
        JsonUtils.putObject(jSONObject2, "mediation_provider", this.a.V());
        SessionTracker m0 = this.a.m0();
        JsonUtils.putObject(jSONObject2, "app_state", m0.getCurrentApplicationState().b());
        JsonUtils.putObject(jSONObject2, "app_state_duration_ms", Long.valueOf(m0.getCurrentApplicationStateDurationMillis()));
        JsonUtils.putObject(jSONObject2, "session_id", m0.getSessionId());
        JsonUtils.putObject(jSONObject2, "session_duration_ms", Long.valueOf(System.currentTimeMillis() - com.applovin.impl.sdk.k.n()));
        JsonUtils.putObject(jSONObject, "shared_fields", jSONObject2);
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            JSONObject jSONObject3 = new JSONObject();
            JsonUtils.putDouble(jSONObject3, "ts_ms", System.currentTimeMillis());
            JsonUtils.putString(jSONObject3, "type", d2Var.b());
            JsonUtils.putDouble(jSONObject3, "weight", d);
            JsonUtils.putString(jSONObject3, "level", "DEBUG");
            a(map);
            JsonUtils.putAll(jSONObject3, map);
            jSONArray.put(jSONObject3);
        }
        JsonUtils.putObject(jSONObject, "events", jSONArray);
        return jSONObject;
    }

    private void b(Map map) {
        PackageInfo a2 = n7.a(com.applovin.impl.sdk.k.o(), 0);
        map.put("package_name", com.applovin.impl.sdk.k.o().getPackageName());
        map.put("app_version", a2 != null ? a2.versionName : "");
        map.put("app_version_code", String.valueOf(a2 != null ? a2.versionCode : 0));
    }

    private void a(Map map) {
        if (map == null) {
            return;
        }
        Object a2 = this.a.H().a();
        Long c = this.a.H().c();
        if (a2 instanceof com.applovin.impl.sdk.ad.b) {
            map.put("fs_ad_network", "AppLovin");
            map.put("fs_ad_creative_id", Long.toString(((com.applovin.impl.sdk.ad.b) a2).getAdIdNumber()));
            map.put("fs_ad_memory_usage", c != null ? c.toString() : "Error");
        } else {
            if (a2 instanceof y2) {
                y2 y2Var = (y2) a2;
                map.put("fs_ad_network", y2Var.getNetworkName());
                map.put("fs_ad_creative_id", y2Var.getCreativeId());
                map.put("fs_ad_memory_usage", c != null ? c.toString() : "Error");
                return;
            }
            map.put("fs_ad_network", "None");
            map.put("fs_ad_creative_id", "None");
            map.put("fs_ad_memory_usage", "None");
        }
    }

    private boolean a(d2 d2Var, long j) {
        Long l = (Long) this.d.get(d2Var);
        return System.currentTimeMillis() - (l != null ? l.longValue() : -1L) < j;
    }
}
