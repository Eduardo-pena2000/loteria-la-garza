package com.google.firebase.remoteconfig.internal;

import E6.l;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.p;
import w8.q;
import w8.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = f(str);
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static b e(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        JSONObject jSONObject3;
        try {
            b.b e = b.l().e(date);
            JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e = e.c(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                e = e.d(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject("personalizationMetadata");
            } catch (JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                e = e.f(jSONObject3);
            }
            String string = jSONObject.has("templateVersion") ? jSONObject.getString("templateVersion") : null;
            if (string != null) {
                e.h(Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray("rolloutMetadata");
            } catch (JSONException unused4) {
            }
            if (jSONArray2 != null) {
                e = e.g(jSONArray2);
            }
            return e.a();
        } catch (JSONException e2) {
            throw new p("Fetch failed: fetch response could not be parsed.", (Throwable) e2);
        }
    }

    public static String f(String str) {
        Matcher matcher = h.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    public final boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    public final String b(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    public final JSONObject c(String str, String str2, Map map, Long l, Map map2) {
        HashMap hashMap = new HashMap();
        if (str == null) {
            throw new p("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put("appInstanceId", str);
        hashMap.put("appInstanceIdToken", str2);
        hashMap.put("appId", this.b);
        Locale locale = this.a.getResources().getConfiguration().locale;
        hashMap.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        hashMap.put("languageCode", locale.toLanguageTag());
        hashMap.put("platformVersion", Integer.toString(i));
        hashMap.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put("appBuild", Long.toString(I1.a.a(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", this.a.getPackageName());
        hashMap.put("sdkVersion", "23.0.1");
        hashMap.put("analyticsUserProperties", new JSONObject(map));
        if (!map2.isEmpty()) {
            hashMap.put("customSignals", new JSONObject(map2));
            Log.d("FirebaseRemoteConfig", "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            hashMap.put("firstOpenTime", b(l.longValue()));
        }
        return new JSONObject(hashMap);
    }

    public HttpURLConnection d() {
        try {
            return new URL(h(this.d, this.e)).openConnection();
        } catch (IOException e) {
            throw new q(e.getMessage());
        }
    }

    @Keep
    public c.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map map, String str3, Map map2, Long l, Date date, Map map3) throws q {
        m(httpURLConnection, str3, str2, map2);
        try {
            try {
                l(httpURLConnection, c(str, str2, map, l, map3).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new t(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject g = g(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                b e = e(g, date);
                return !a(g) ? c.a.a(date, e) : c.a.b(e, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
            }
        } catch (IOException | JSONException e2) {
            throw new p("The client had an error while calling the backend!", (Throwable) e2);
        }
    }

    public final JSONObject g(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    public final String h(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{str, str2});
    }

    public final String i() {
        try {
            Context context = this.a;
            byte[] a = E6.a.a(context, context.getPackageName());
            if (a != null) {
                return l.c(a, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.a.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.a.getPackageName(), e);
            return null;
        }
    }

    public final void j(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        httpURLConnection.setRequestProperty("X-Android-Package", this.a.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", i());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    public final void k(HttpURLConnection httpURLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void l(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final void m(HttpURLConnection httpURLConnection, String str, String str2, Map map) {
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        j(httpURLConnection, str2);
        k(httpURLConnection, map);
    }
}
