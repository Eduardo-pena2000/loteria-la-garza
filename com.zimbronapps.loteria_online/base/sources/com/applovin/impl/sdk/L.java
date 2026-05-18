package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.app.ApplicationStartInfo;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import com.applovin.impl.c4;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.i5;
import com.applovin.impl.k7;
import com.applovin.impl.m7;
import com.applovin.impl.n7;
import com.applovin.impl.n8;
import com.applovin.impl.o0;
import com.applovin.impl.o5;
import com.applovin.impl.q0;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.u4;
import com.applovin.impl.v;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class l {
    private static String j;
    private static String k;
    private static final AtomicReference l = new AtomicReference();
    private static final AtomicReference m = new AtomicReference();
    private final k a;
    private final o b;
    private final Context c;
    private final Map d;
    private final Map f;
    private boolean h;
    private final Object e = new Object();
    private final Object g = new Object();
    private final AtomicReference i = new AtomicReference();

    public class a implements o5.a {
        public a() {
        }

        public void a(v.a aVar) {
            l.a().set(aVar);
        }
    }

    public static class b {
        public final String a;
        public final int b;

        public b(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public static class c {
        public int a = -1;
        public int b = -1;
        public Boolean c = null;
    }

    public interface d {
        String a(ContentResolver contentResolver, String str);
    }

    public l(k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.a = kVar;
        this.b = kVar.O();
        this.c = k.o();
        this.d = D();
        this.f = C();
    }

    private String B() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (com.applovin.impl.o0.e()) {
            for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
                sb.append(audioDeviceInfo.getType());
                sb.append(",");
            }
        } else {
            if (audioManager.isWiredHeadsetOn()) {
                sb.append(3);
                sb.append(",");
            }
            if (audioManager.isBluetoothScoOn()) {
                sb.append(7);
                sb.append(",");
            }
            if (audioManager.isBluetoothA2dpOn()) {
                sb.append(8);
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) && o.a()) {
            this.b.a("DataCollector", "No sound outputs detected");
        }
        return sb2;
    }

    private Map C() {
        HashMap hashMap = new HashMap();
        PackageManager packageManager = this.c.getPackageManager();
        ApplicationInfo applicationInfo = this.c.getApplicationInfo();
        long lastModified = new File(applicationInfo.sourceDir).lastModified();
        int i = com.applovin.impl.o0.h() ? 134238224 : 20560;
        PackageInfo a2 = n7.a(this.c, 0);
        PackageInfo a3 = n7.a(this.c, i);
        String a4 = a(applicationInfo.packageName, packageManager, this.a);
        String a5 = a(applicationInfo.packageName, packageManager);
        hashMap.put("app_name", packageManager.getApplicationLabel(applicationInfo));
        hashMap.put("app_version", a2 != null ? a2.versionName : "");
        hashMap.put("app_version_code", Integer.valueOf(a2 != null ? a2.versionCode : -1));
        hashMap.put("installer_name", StringUtils.emptyIfNull(a4));
        hashMap.put("originating_name", StringUtils.emptyIfNull(a5));
        hashMap.put("tg", m7.a(this.a));
        hashMap.put("debug", Boolean.valueOf(n7.c(this.a)));
        hashMap.put("ia", Long.valueOf(lastModified));
        hashMap.put("alts_ms", Long.valueOf(k.n()));
        hashMap.put("session_id", this.a.m0().getSessionId());
        hashMap.put("j8", Boolean.valueOf(k.F0()));
        hashMap.put("app_info_flags", Integer.valueOf(applicationInfo.flags));
        hashMap.put("last_update_ms", Long.valueOf(a2 != null ? a2.lastUpdateTime : 0L));
        List d2 = d(a3);
        if (!CollectionUtils.isEmpty((Collection) d2)) {
            hashMap.put("signing_info", d2);
        }
        List a6 = a(a3);
        if (!CollectionUtils.isEmpty((Collection) a6)) {
            hashMap.put("instrumentation", a6);
        }
        if (com.applovin.impl.o0.d()) {
            hashMap.put("install_location", Integer.valueOf(a2 != null ? a2.installLocation : 0));
            hashMap.put("split_names", a2 != null ? a2.splitNames : Collections.emptyList());
        }
        if (((Boolean) this.a.a(x4.L4)).booleanValue()) {
            Map c2 = c(a3);
            if (CollectionUtils.isEmpty(c2)) {
                hashMap.put("req_p", c2);
            }
            List b2 = b(a3);
            if (CollectionUtils.isEmpty((Collection) b2)) {
                hashMap.put("req_f", b2);
            }
        }
        k kVar = this.a;
        z4 z4Var = z4.h;
        Long l2 = (Long) kVar.a(z4Var);
        if (l2 != null) {
            hashMap.put("ia_v2", l2);
        } else {
            this.a.b(z4Var, Long.valueOf(lastModified));
        }
        hashMap.put("sdk_version", AppLovinSdk.VERSION);
        hashMap.put("omid_sdk_version", this.a.e0().c());
        CollectionUtils.putStringIfValid("ad_review_sdk_version", com.applovin.impl.j.b(), hashMap);
        hashMap.put("api_did", this.a.a(x4.f));
        hashMap.put("first_install_v3_ms", a2 != null ? Long.valueOf(a2.firstInstallTime) : "");
        CollectionUtils.putLongIfValid("last_launch_ms", this.a.L(), hashMap);
        CollectionUtils.putLongIfValid("app_launch_count", Long.valueOf(this.a.M()), hashMap);
        hashMap.put("target_sdk", Integer.valueOf(applicationInfo.targetSdkVersion));
        if (com.applovin.impl.o0.f()) {
            hashMap.put("min_sdk", Integer.valueOf(applicationInfo.minSdkVersion));
        }
        if (this.a.H0()) {
            hashMap.put("unity_version", n7.a(this.a.n0()));
        }
        List i2 = i();
        if (!CollectionUtils.isEmpty((Collection) i2)) {
            hashMap.put("application_start_info", i2);
        }
        List g = g();
        if (!CollectionUtils.isEmpty((Collection) g)) {
            hashMap.put("application_exit_info", g);
        }
        if (com.applovin.impl.o0.g()) {
            hashMap.put("instant_app", Boolean.valueOf(a0.a(packageManager)));
        }
        return hashMap;
    }

    private Map D() {
        HashMap hashMap = new HashMap(35);
        hashMap.put("api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("brand", Build.MANUFACTURER);
        hashMap.put("brand_name", Build.BRAND);
        hashMap.put("hardware", Build.HARDWARE);
        hashMap.put("sim", Boolean.valueOf(AppLovinSdkUtils.isEmulator()));
        hashMap.put("aida", Boolean.valueOf(com.applovin.impl.v.a()));
        hashMap.put("locale", Locale.getDefault().toString());
        hashMap.put("model", Build.MODEL);
        hashMap.put("os", Build.VERSION.RELEASE);
        hashMap.put("platform", A());
        hashMap.put("revision", Build.DEVICE);
        hashMap.put("tz_offset", Double.valueOf(E()));
        hashMap.put("gy", Boolean.valueOf(u()));
        hashMap.put("country_code", n());
        hashMap.put("mcc", y());
        hashMap.put("mnc", z());
        hashMap.put("carrier", l());
        hashMap.put("tv", Boolean.valueOf(AppLovinSdkUtils.isTv(this.c)));
        hashMap.put("pc", Integer.valueOf(Runtime.getRuntime().availableProcessors()));
        hashMap.put("hdr", T());
        hashMap.put("supported_abis", O());
        hashMap.put("type", Build.TYPE);
        hashMap.put("product", Build.PRODUCT);
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            hashMap.put("adns", Float.valueOf(displayMetrics.density));
            hashMap.put("adnsd", Integer.valueOf(displayMetrics.densityDpi));
            hashMap.put("xdpi", Float.valueOf(displayMetrics.xdpi));
            hashMap.put("ydpi", Float.valueOf(displayMetrics.ydpi));
            o0.b a2 = com.applovin.impl.o0.a(this.c, this.a);
            if (a2 != null) {
                hashMap.put("tl_cr", Integer.valueOf(a2.c()));
                hashMap.put("tr_cr", Integer.valueOf(a2.d()));
                hashMap.put("bl_cr", Integer.valueOf(a2.a()));
                hashMap.put("br_cr", Integer.valueOf(a2.b()));
            }
        }
        hashMap.put("bt_ms", Long.valueOf(k()));
        hashMap.put("tbalsi_ms", Long.valueOf(this.a.K() - k.n()));
        CollectionUtils.putStringIfValid("process_name", n7.c(this.c), hashMap);
        CollectionUtils.putBooleanIfValid("is_main_process", n7.i(this.c), hashMap);
        try {
            PackageInfo packageInfo = this.c.getPackageManager().getPackageInfo("com.android.vending", 0);
            hashMap.put("ps_version", packageInfo.versionName);
            hashMap.put("ps_version_code", Integer.valueOf(packageInfo.versionCode));
        } catch (Throwable unused) {
            hashMap.put("ps_version", "");
            hashMap.put("ps_version_code", -1);
        }
        CollectionUtils.putBooleanIfValid("play_store_disabled", k7.a(this.c), hashMap);
        a((Map) hashMap);
        return hashMap;
    }

    private double E() {
        return Math.round((TimeZone.getDefault().getOffset(new Date().getTime()) * 10.0d) / 3600000.0d) / 10.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONArray F() {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.F():org.json.JSONArray");
    }

    public static String J() {
        return k;
    }

    private Map L() {
        return n7.a(a((Map) null, true, false));
    }

    private JSONArray O() {
        if (com.applovin.impl.o0.d()) {
            return CollectionUtils.toJSONArray(Build.SUPPORTED_ABIS);
        }
        JSONArray jSONArray = new JSONArray();
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI);
        JsonUtils.putStringIfValid(jSONArray, Build.CPU_ABI2);
        return jSONArray;
    }

    private boolean P() {
        try {
            if (!b()) {
                if (!c()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private Boolean Q() {
        if (com.applovin.impl.o0.i()) {
            return null;
        }
        return Boolean.valueOf(!CollectionUtils.isEmpty((Collection) n7.a("/proc/net/tcp", Collections.singletonList(":69A2"), this.a)));
    }

    private boolean R() {
        ConnectivityManager connectivityManager;
        if (com.applovin.impl.o0.f() && (connectivityManager = (ConnectivityManager) this.c.getSystemService("connectivity")) != null) {
            try {
                return connectivityManager.getRestrictBackgroundStatus() == 3;
            } catch (Throwable th) {
                this.a.O();
                if (o.a()) {
                    this.a.O().a("DataCollector", "Unable to collect constrained network info.", th);
                }
            }
        }
        return false;
    }

    private boolean S() {
        boolean z = this.c.getResources().getConfiguration().keyboard == 2;
        PackageManager packageManager = this.c.getPackageManager();
        boolean hasSystemFeature = packageManager.hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE");
        boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.type.pc");
        if (z) {
            return hasSystemFeature || hasSystemFeature2;
        }
        return false;
    }

    private Boolean T() {
        if (com.applovin.impl.o0.g()) {
            return Boolean.valueOf(S.a(this.c.getResources().getConfiguration()));
        }
        return null;
    }

    private /* synthetic */ void V() {
        this.i.set(s());
    }

    private /* synthetic */ void W() {
        Map Y = Y();
        List X = X();
        synchronized (this.g) {
            if (Y != null) {
                try {
                    this.f.putAll(Y);
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (X != null) {
                this.f.put("dl", X);
            }
        }
    }

    private List X() {
        List c2 = this.a.c(x4.H4);
        if (CollectionUtils.isEmpty((Collection) c2)) {
            return null;
        }
        return n7.a("/proc/self/maps", c2, this.a);
    }

    private Map Y() {
        boolean z;
        int i;
        Throwable th;
        if (!((Boolean) this.a.a(x4.G4)).booleanValue()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator it = Thread.getAllStackTraces().entrySet().iterator();
            z = false;
            i = 0;
            while (it.hasNext()) {
                try {
                    for (StackTraceElement stackTraceElement : (StackTraceElement[]) ((Map.Entry) it.next()).getValue()) {
                        String stackTraceElement2 = stackTraceElement.toString();
                        if (!z && stackTraceElement2.contains("de.robv.android.xposed")) {
                            z = true;
                        }
                        if (stackTraceElement.getClassName().equals("com.android.internal.os.ZygoteInit")) {
                            i++;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.a.D().b("DataCollector", "collectHookingSignals", th);
                    hashMap.put("xpd", Boolean.valueOf(z));
                    hashMap.put("zi_count", Integer.valueOf(i));
                    CollectionUtils.putBooleanIfValid("fpd", Q(), hashMap);
                    return hashMap;
                }
            }
        } catch (Throwable th3) {
            z = false;
            i = 0;
            th = th3;
        }
        hashMap.put("xpd", Boolean.valueOf(z));
        hashMap.put("zi_count", Integer.valueOf(i));
        CollectionUtils.putBooleanIfValid("fpd", Q(), hashMap);
        return hashMap;
    }

    public static /* synthetic */ void a(l lVar, String str, int i, String str2) {
        lVar.a(str, i, str2);
    }

    private void a0() {
        this.a.q0().a((i5) new r6(this.a, "collectPostInitAppInfo", new I0(this)), d6.b.OTHER);
    }

    public static /* synthetic */ void b(l lVar) {
        lVar.W();
    }

    public static /* synthetic */ void c(l lVar, AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        lVar.b(appLovinBidTokenCollectionListener);
    }

    public static /* synthetic */ void d(l lVar) {
        lVar.V();
    }

    private List g() {
        ActivityManager activityManager;
        if (!com.applovin.impl.o0.b()) {
            return null;
        }
        Integer num = (Integer) this.a.a(x4.A4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.c.getSystemService("activity")) == null) {
            return null;
        }
        List a2 = Q4.c.a(activityManager, ((Boolean) this.a.a(x4.B4)).booleanValue() ? this.c.getPackageName() : null, 0, num.intValue());
        if (CollectionUtils.isEmpty((Collection) a2)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo a3 = Q4.d.a(it.next());
            HashMap hashMap = new HashMap(13);
            int a4 = Q4.e.a(a3);
            hashMap.put("reason", Integer.valueOf(a4));
            String a5 = A0.a(a3);
            CollectionUtils.putStringIfValid("description", a5, hashMap);
            hashMap.put("timestamp", Long.valueOf(B0.a(a3)));
            hashMap.put("status", Integer.valueOf(T.a(a3)));
            hashMap.put("importance", Integer.valueOf(U.a(a3)));
            hashMap.put("pss", Long.valueOf(V.a(a3)));
            hashMap.put("rss", Long.valueOf(W.a(a3)));
            CollectionUtils.putStringIfValid("process_name", X.a(a3), hashMap);
            hashMap.put("pid", Integer.valueOf(w0.a(a3)));
            hashMap.put("ruid", Integer.valueOf(x0.a(a3)));
            hashMap.put("puid", Integer.valueOf(y0.a(a3)));
            hashMap.put("duid", Integer.valueOf(z0.a(a3)));
            String a6 = a(a3, a4);
            if (StringUtils.isValidString(a6)) {
                hashMap.put("stack_trace", a6);
                b(a6, a4, a5);
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private String h() {
        int orientation = AppLovinSdkUtils.getOrientation(this.c);
        return orientation == 1 ? "portrait" : orientation == 2 ? "landscape" : "none";
    }

    private List i() {
        ActivityManager activityManager;
        if (!com.applovin.impl.o0.c()) {
            return null;
        }
        Integer num = (Integer) this.a.a(x4.z4);
        if (num.intValue() < 0 || (activityManager = (ActivityManager) this.c.getSystemService("activity")) == null) {
            return null;
        }
        List a2 = g0.a(activityManager, num.intValue());
        if (CollectionUtils.isEmpty((Collection) a2)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(a2.size());
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            ApplicationStartInfo a3 = l0.a(it.next());
            HashMap hashMap = new HashMap(11);
            hashMap.put("reason", Integer.valueOf(m0.a(a3)));
            hashMap.put("startup_state", Integer.valueOf(n0.a(a3)));
            hashMap.put("start_type", Integer.valueOf(p0.a(a3)));
            hashMap.put("was_force_stopped", Boolean.valueOf(q0.a(a3)));
            hashMap.put("startup_timestamps", r0.a(a3));
            CollectionUtils.putStringIfValid("process_name", s0.a(a3), hashMap);
            hashMap.put("pid", Integer.valueOf(t0.a(a3)));
            hashMap.put("ruid", Integer.valueOf(u0.a(a3)));
            hashMap.put("puid", Integer.valueOf(h0.a(a3)));
            hashMap.put("duid", Integer.valueOf(i0.a(a3)));
            hashMap.put("launch_mode", Integer.valueOf(j0.a(a3)));
            hashMap.put("intent", a(k0.a(a3)));
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private c j() {
        c cVar = new c();
        Intent registerReceiver = this.c.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = registerReceiver != null ? registerReceiver.getIntExtra("level", -1) : -1;
        int intExtra2 = registerReceiver != null ? registerReceiver.getIntExtra("scale", -1) : -1;
        if (intExtra <= 0 || intExtra2 <= 0) {
            cVar.b = -1;
        } else {
            cVar.b = (int) ((intExtra / intExtra2) * 100.0f);
        }
        cVar.a = registerReceiver != null ? registerReceiver.getIntExtra("status", -1) : -1;
        cVar.c = Boolean.valueOf(Settings.Global.getInt(this.c.getContentResolver(), "stay_on_while_plugged_in", -1) > 0);
        return cVar;
    }

    private long k() {
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Long l2 = (Long) this.a.a(x4.F4);
        return (currentTimeMillis / l2.longValue()) * l2.longValue();
    }

    private String l() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            return telephonyManager.getNetworkOperatorName();
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect carrier", th);
            return "";
        }
    }

    private String n() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        return telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase(Locale.ENGLISH) : "";
    }

    private String o() {
        ActivityInfo activityInfo;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://"));
        ResolveInfo resolveActivity = this.c.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity != null && (activityInfo = resolveActivity.activityInfo) != null) {
            k = activityInfo.packageName;
        }
        return k;
    }

    private String q() {
        if (!com.applovin.impl.o0.f()) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            LocaleList locales = this.c.getResources().getConfiguration().getLocales();
            for (int i = 0; i < locales.size(); i++) {
                sb.append(locales.get(i));
                sb.append(",");
            }
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
                sb.deleteCharAt(sb.length() - 1);
            }
            return sb.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private Map r() {
        HashMap hashMap = new HashMap();
        JSONObject deserialize = JsonUtils.deserialize((String) this.a.a(x4.I4));
        if (JsonUtils.isValid(deserialize)) {
            hashMap.putAll(a(deserialize, new C0()));
        }
        JSONObject deserialize2 = JsonUtils.deserialize((String) this.a.a(x4.J4));
        if (JsonUtils.isValid(deserialize2)) {
            hashMap.putAll(a(deserialize2, new D0()));
        }
        JSONObject deserialize3 = JsonUtils.deserialize((String) this.a.a(x4.K4));
        if (JsonUtils.isValid(deserialize3)) {
            hashMap.putAll(a(deserialize3, new E0()));
        }
        return hashMap;
    }

    private Float s() {
        Float f = (Float) this.a.a(x4.a4);
        Float b2 = this.a.p().b();
        if (b2 != null) {
            return Float.valueOf(b2.floatValue() * f.floatValue());
        }
        return null;
    }

    private float t() {
        try {
            return Settings.System.getFloat(this.c.getContentResolver(), "font_scale");
        } catch (Settings.SettingNotFoundException e) {
            if (!o.a()) {
                return -1.0f;
            }
            this.b.a("DataCollector", "Error collecting font scale", e);
            return -1.0f;
        }
    }

    private boolean u() {
        SensorManager sensorManager = (SensorManager) this.c.getSystemService("sensor");
        return (sensorManager == null || sensorManager.getDefaultSensor(4) == null) ? false : true;
    }

    private Map v() {
        HashMap hashMap = new HashMap();
        CollectionUtils.putIntegerIfValid("IABTCF_gdprApplies", this.a.r0().g(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_TCString", this.a.r0().j(), hashMap);
        CollectionUtils.putStringIfValid("IABTCF_AddtlConsent", this.a.r0().c(), hashMap);
        return hashMap;
    }

    private Boolean w() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isMusicActive());
    }

    private Boolean x() {
        AudioManager audioManager = (AudioManager) this.c.getSystemService("audio");
        if (audioManager == null) {
            return null;
        }
        return Boolean.valueOf(audioManager.isSpeakerphoneOn());
    }

    private String y() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(0, Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile country code", th);
            return "";
        }
    }

    private String z() {
        TelephonyManager telephonyManager = (TelephonyManager) this.c.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        try {
            String networkOperator = telephonyManager.getNetworkOperator();
            return networkOperator.substring(Math.min(3, networkOperator.length()));
        } catch (Throwable th) {
            if (!o.a()) {
                return "";
            }
            this.b.a("DataCollector", "Unable to collect mobile network code", th);
            return "";
        }
    }

    public String A() {
        return AppLovinSdkUtils.isFireOS(this.c) ? "fireos" : "android";
    }

    public Map G() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        String str = StringUtils.isValidString(j) ? j : this.c.getApplicationInfo().packageName;
        map.put("package_name", str);
        map.put("vz", StringUtils.toShortSHA1Hash(str));
        map.put("first_install", Boolean.valueOf(this.a.C0()));
        map.put("first_install_v2", Boolean.valueOf(!this.a.z0()));
        map.put("test_ads", Boolean.valueOf(this.h));
        map.put("test_mode", Integer.valueOf(this.a.s0().c() ? 1 : 0));
        map.put("muted", Boolean.valueOf(this.a.n0().isMuted()));
        if (((Boolean) this.a.a(x4.A3)).booleanValue()) {
            CollectionUtils.putStringIfValid("cuid", this.a.w0().e(), map);
        }
        if (((Boolean) this.a.a(x4.D3)).booleanValue()) {
            map.put("compass_random_token", this.a.u());
        }
        if (((Boolean) this.a.a(x4.F3)).booleanValue()) {
            map.put("applovin_random_token", this.a.h0());
        }
        if (((Boolean) this.a.a(x4.J3)).booleanValue()) {
            map.put("art", this.a.r());
        }
        map.putAll(v());
        CollectionUtils.putStringIfValid("template_browser_package_name", (String) this.a.p0().a(z4.T, null), map);
        return map;
    }

    public b H() {
        return (b) m.get();
    }

    public String I() {
        String encodeToString = Base64.encodeToString(new JSONObject(L()).toString().getBytes(Charset.defaultCharset()), 2);
        return ((Boolean) this.a.a(x4.m5)).booleanValue() ? u4.b(encodeToString, n7.a(this.a), u4.a.a(((Integer) this.a.a(x4.n5)).intValue()), this.a.i0(), this.a) : encodeToString;
    }

    public String K() {
        ActivityManager activityManager = (ActivityManager) this.c.getSystemService("activity");
        if (activityManager == null) {
            return null;
        }
        return activityManager.getDeviceConfigurationInfo().getGlEsVersion();
    }

    public Map M() {
        Map map;
        synchronized (this.g) {
            map = CollectionUtils.map(this.f);
        }
        return map;
    }

    public Map N() {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return map;
    }

    public boolean U() {
        return this.h;
    }

    public void Z() {
        d6 q0 = this.a.q0();
        o5 o5Var = new o5(this.a, new a());
        d6.b bVar = d6.b.OTHER;
        q0.a((i5) o5Var, bVar);
        this.a.q0().a((i5) new r6(this.a, true, "setDeviceVolume", new G0(this)), bVar);
    }

    public void b0() {
        synchronized (this.e) {
            a(this.d);
        }
        a0();
    }

    public Map e() {
        HashMap hashMap = new HashMap();
        hashMap.put("sc", this.a.a(x4.l));
        hashMap.put("sc2", this.a.a(x4.m));
        hashMap.put("sc3", this.a.a(x4.n));
        hashMap.put("server_installed_at", this.a.a(x4.o));
        CollectionUtils.putStringIfValid("persisted_data", (String) this.a.a(z4.H), hashMap);
        return hashMap;
    }

    public v.a f() {
        v.a b2 = com.applovin.impl.v.b(this.c);
        if (b2 == null) {
            return new v.a();
        }
        if (((Boolean) this.a.a(x4.y3)).booleanValue()) {
            if (b2.c() && !((Boolean) this.a.a(x4.x3)).booleanValue()) {
                b2.a("");
            }
            l.set(b2);
        } else {
            b2 = new v.a();
        }
        List testDeviceAdvertisingIds = this.a.J() != null ? this.a.J().getTestDeviceAdvertisingIds() : null;
        if (testDeviceAdvertisingIds != null) {
            String a2 = b2.a();
            if (StringUtils.isValidString(a2)) {
                this.h = testDeviceAdvertisingIds.contains(a2);
            }
            b H = H();
            String str = H != null ? H.a : null;
            if (StringUtils.isValidString(str)) {
                this.h = testDeviceAdvertisingIds.contains(str) | this.h;
            }
        } else {
            this.h = false;
        }
        return b2;
    }

    public Map m() {
        HashMap hashMap = new HashMap();
        c4 d0 = this.a.d0();
        Deque b2 = d0.b();
        if (!CollectionUtils.isEmpty((Collection) b2)) {
            hashMap.put("network_throughput_info", b2);
        }
        CollectionUtils.putLongIfValid("network_throughput_kbps", d0.a(), hashMap);
        q0.d a2 = this.a.w().a();
        if (a2 != null) {
            hashMap.put("lrm_ts_ms", String.valueOf(a2.c()));
            hashMap.put("lrm_url", a2.d());
            hashMap.put("lrm_ct_ms", String.valueOf(a2.a()));
            hashMap.put("lrm_rs", String.valueOf(a2.b()));
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public Map p() {
        return a(false);
    }

    public static /* synthetic */ AtomicReference a() {
        return l;
    }

    private /* synthetic */ void b(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        try {
            String I = I();
            if (StringUtils.isValidString(I)) {
                this.a.O();
                if (o.a()) {
                    this.a.O().a("DataCollector", "Successfully retrieved bid token");
                }
                t2.a(appLovinBidTokenCollectionListener, I);
                return;
            }
            this.a.O();
            if (o.a()) {
                this.a.O().b("DataCollector", "Empty bid token");
            }
            t2.b(appLovinBidTokenCollectionListener, "Empty bid token");
        } catch (Throwable th) {
            if (o.a()) {
                this.b.a("DataCollector", "Failed to collect bid token", th);
            }
            this.a.D().a("DataCollector", "collectBidToken", th);
            t2.b(appLovinBidTokenCollectionListener, "Failed to collect bid token");
        }
    }

    private Map c(PackageInfo packageInfo) {
        HashMap hashMap = null;
        if (packageInfo == null) {
            return null;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && iArr != null && strArr.length != 0 && strArr.length == iArr.length) {
            hashMap = new HashMap();
            for (int i = 0; i < strArr.length; i++) {
                CollectionUtils.putIntegerIfValid(strArr[i], Integer.valueOf(iArr[i]), hashMap);
            }
        }
        return hashMap;
    }

    private List d(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        if (com.applovin.impl.o0.h()) {
            SigningInfo a2 = b0.a(packageInfo);
            if (a2 != null) {
                return a(c0.a(a2) ? e0.a(a2) : f0.a(a2));
            }
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr != null) {
                return a(signatureArr);
            }
        }
        return null;
    }

    public void a(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        this.a.q0().a((i5) new r6(this.a, ((Boolean) this.a.a(x4.N3)).booleanValue(), "DataCollector", new H0(this, appLovinBidTokenCollectionListener)), d6.b.CORE);
    }

    public Map a(Map map, boolean z, boolean z2) {
        HashMap hashMap = new HashMap(64);
        Map a2 = a(z);
        Map G = G();
        Map m2 = m();
        Map k0 = this.a.k0();
        if (z2) {
            hashMap.put("device_info", a2);
            hashMap.put("app_info", G);
            if (m2 != null) {
                hashMap.put("connection_info", m2);
            }
            if (map != null) {
                hashMap.put("ad_info", map);
            }
            if (!CollectionUtils.isEmpty(k0)) {
                hashMap.put("segments", k0);
            }
        } else {
            hashMap.putAll(a2);
            hashMap.putAll(G);
            if (m2 != null) {
                hashMap.putAll(m2);
            }
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!CollectionUtils.isEmpty(k0)) {
                hashMap.putAll(k0);
            }
        }
        hashMap.put("accept", "custom_size,launch_app,video");
        hashMap.put("format", "json");
        CollectionUtils.putStringIfValid("mediation_provider", this.a.V(), hashMap);
        CollectionUtils.putStringIfValid("mediation_provider_v2", this.a.C(), hashMap);
        CollectionUtils.putStringIfValid("plugin_version", (String) this.a.a(x4.L3), hashMap);
        CollectionUtils.putLongIfValid("tssf_ms", Long.valueOf(this.a.t0()), hashMap);
        if (!((Boolean) this.a.a(x4.k5)).booleanValue()) {
            hashMap.put("sdk_key", this.a.i0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.a.q(), hashMap);
        hashMap.putAll(e());
        hashMap.put("rid", UUID.randomUUID().toString());
        return hashMap;
    }

    private boolean c() {
        String[] strArr = {"&zpz}ld&hyy&Z|yl{|zl{'hyb", "&zk`g&z|", "&zpz}ld&k`g&z|", "&zpz}ld&qk`g&z|", "&mh}h&efjhe&qk`g&z|", "&mh}h&efjhe&k`g&z|", "&zpz}ld&zm&qk`g&z|", "&zpz}ld&k`g&oh`ezhol&z|", "&mh}h&efjhe&z|"};
        for (int i = 0; i < 9; i++) {
            if (new File(c(strArr[i])).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long d() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.l.d():long");
    }

    private List b(PackageInfo packageInfo) {
        FeatureInfo[] featureInfoArr;
        if (packageInfo == null || (featureInfoArr = packageInfo.reqFeatures) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (FeatureInfo featureInfo : featureInfoArr) {
            arrayList.add(featureInfo.name);
        }
        return arrayList;
    }

    private String c(String str) {
        int length = str.length();
        int[] iArr = {11, 12, 10, 3, 2, 1, 15, 10, 15, 14};
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = str.charAt(i);
            for (int i2 = 9; i2 >= 0; i2--) {
                cArr[i] = (char) (cArr[i] ^ iArr[i2]);
            }
        }
        return new String(cArr);
    }

    private void b(String str, int i, String str2) {
        this.a.q0().a((i5) new r6(this.a, "reportAppExitInfoStackTrace", new F0(this, str, i, str2)), d6.b.OTHER);
    }

    private int b(String str) {
        try {
            return Settings.Secure.getInt(this.c.getContentResolver(), str);
        } catch (Throwable unused) {
            return -1;
        }
    }

    private boolean b() {
        String str = Build.TAGS;
        return str != null && str.contains(c("lz}$blpz"));
    }

    private Map a(boolean z) {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.d);
        }
        return a(map, z);
    }

    private void a(Map map) {
        JSONArray F;
        if (((Boolean) this.a.a(x4.U3)).booleanValue() && !map.containsKey("af")) {
            map.put("af", Long.valueOf(d()));
        }
        if (((Boolean) this.a.a(x4.V3)).booleanValue() && !map.containsKey("font")) {
            map.put("font", Float.valueOf(t()));
        }
        if (((Boolean) this.a.a(x4.c4)).booleanValue() && n7.d(this.a)) {
            n8.a(this.a);
        }
        if (((Boolean) this.a.a(x4.n4)).booleanValue()) {
            n8.b(this.a);
        }
        if (((Boolean) this.a.a(x4.b4)).booleanValue() && !map.containsKey("sua")) {
            map.put("sua", System.getProperty("http.agent"));
        }
        if (((Boolean) this.a.a(x4.X3)).booleanValue() && !map.containsKey("network_restricted")) {
            map.put("network_restricted", Boolean.valueOf(R()));
        }
        map.put("is_pc", Boolean.valueOf(S()));
        if (((Boolean) this.a.a(x4.p4)).booleanValue()) {
            CollectionUtils.putStringIfValid("oglv", K(), map);
        }
        if (((Boolean) this.a.a(x4.K6)).booleanValue()) {
            CollectionUtils.putStringIfValid("dbpn", o(), map);
        }
        if (!((Boolean) this.a.a(x4.L6)).booleanValue() || map.containsKey("video_decoders") || (F = F()) == null || F.length() <= 0) {
            return;
        }
        map.put("video_decoders", F);
    }

    private Map a(Map map, boolean z) {
        v.a f;
        PowerManager powerManager;
        Map map2 = CollectionUtils.map(map);
        Point b2 = com.applovin.impl.o0.b(this.c);
        map2.put("dx", Integer.valueOf(b2.x));
        map2.put("dy", Integer.valueOf(b2.y));
        if (this.c.getResources().getDisplayMetrics() != null) {
            map2.put("screen_size_in", Double.valueOf(Math.sqrt(Math.pow(b2.x, 2.0d) + Math.pow(b2.y, 2.0d)) / r4.xdpi));
        }
        map2.put("is_tablet", Boolean.valueOf(AppLovinSdkUtils.isTablet(this.c)));
        if (((Boolean) this.a.a(x4.E4)).booleanValue()) {
            String b3 = n7.b(this.c);
            Map a2 = com.applovin.impl.o0.a(b3);
            if (a2 != null) {
                map2.put("display_cutout_insets", a2);
            }
            Map c2 = com.applovin.impl.o0.c(b3);
            if (c2 != null) {
                map2.put("status_bar_insets", c2);
            }
            Map b4 = com.applovin.impl.o0.b(b3);
            if (b4 != null) {
                map2.put("nav_bar_insets", b4);
            }
        }
        if (z) {
            f = (v.a) l.get();
            if (f != null) {
                Z();
            } else if (n7.i()) {
                f = new v.a();
                map2.put("inc", Boolean.TRUE);
            } else {
                f = f();
            }
        } else {
            f = f();
        }
        String a3 = f.a();
        if (StringUtils.isValidString(a3)) {
            map2.put("idfa", a3);
        }
        map2.put("dnt", Boolean.valueOf(f.c()));
        map2.put("dnt_code", f.b().b());
        b bVar = (b) m.get();
        if (((Boolean) this.a.a(x4.z3)).booleanValue() && bVar != null) {
            map2.put("idfv", bVar.a);
            map2.put("idfv_scope", Integer.valueOf(bVar.b));
        }
        Boolean b5 = com.applovin.impl.p0.b().b(this.c);
        if (b5 != null) {
            map2.put("huc", b5);
        }
        Boolean b6 = com.applovin.impl.p0.c().b(this.c);
        if (b6 != null) {
            map2.put("aru", b6);
        }
        Boolean b7 = com.applovin.impl.p0.a().b(this.c);
        if (b7 != null) {
            map2.put("dns", b7);
        }
        if (((Boolean) this.a.a(x4.O3)).booleanValue()) {
            c j2 = j();
            CollectionUtils.putIntegerIfValid("act", Integer.valueOf(j2.a), map2);
            CollectionUtils.putIntegerIfValid("acm", Integer.valueOf(j2.b), map2);
            CollectionUtils.putBooleanIfValid("sowpie", j2.c, map2);
        }
        if (((Boolean) this.a.a(x4.W3)).booleanValue()) {
            map2.put("mtl", Integer.valueOf(this.a.m0().getLastTrimMemoryLevel()));
        }
        if (((Boolean) this.a.a(x4.Z3)).booleanValue()) {
            map2.put("adr", Boolean.valueOf(P()));
        }
        Float s = z ? (Float) this.i.get() : s();
        if (s != null) {
            map2.put("volume", s);
        }
        CollectionUtils.putBooleanIfValid("ma", w(), map2);
        CollectionUtils.putBooleanIfValid("spo", x(), map2);
        CollectionUtils.putBooleanIfValid("aif", Boolean.valueOf(!this.a.m0().isApplicationPaused()), map2);
        CollectionUtils.putLongIfValid("af_ts_ms", Long.valueOf(this.a.m0().getAppEnteredForegroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("ab_ts_ms", Long.valueOf(this.a.m0().getAppEnteredBackgroundTimeMillis()), map2);
        CollectionUtils.putLongIfValid("abd_ms", Long.valueOf(this.a.m0().getTotalBackgroundDurationMillis()), map2);
        try {
            map2.put("sb", Integer.valueOf((int) ((Settings.System.getInt(this.c.getContentResolver(), "screen_brightness") / 255.0f) * 100.0f)));
        } catch (Settings.SettingNotFoundException e) {
            if (o.a()) {
                this.b.a("DataCollector", "Unable to collect screen brightness", e);
            }
        }
        if (((Boolean) this.a.a(x4.c4)).booleanValue() && n7.d(this.a)) {
            n8.a(this.a);
            String a4 = n8.a();
            if (StringUtils.isValidString(a4)) {
                map2.put("ua", a4);
            }
        }
        if (((Boolean) this.a.a(x4.n4)).booleanValue()) {
            n8.b(this.a);
            CollectionUtils.putIntegerIfValid("wvvc", Integer.valueOf(n8.d()), map2);
            CollectionUtils.putStringIfValid("wvv", n8.c(), map2);
            CollectionUtils.putStringIfValid("wvpn", n8.b(), map2);
        }
        if (((Boolean) this.a.a(x4.Q3)).booleanValue()) {
            try {
                map2.put("fs", Long.valueOf(Environment.getDataDirectory().getFreeSpace()));
                map2.put("tds", Long.valueOf(Environment.getDataDirectory().getTotalSpace()));
            } catch (Throwable th) {
                map2.put("fs", -1);
                map2.put("tds", -1);
                if (o.a()) {
                    this.b.a("DataCollector", "Unable to collect total & free space.", th);
                }
            }
        }
        if (((Boolean) this.a.a(x4.R3)).booleanValue()) {
            ActivityManager.MemoryInfo a5 = n7.a((ActivityManager) this.c.getSystemService("activity"));
            if (a5 != null) {
                map2.put("fm", Long.valueOf(a5.availMem));
                map2.put("tm", Long.valueOf(a5.totalMem));
                map2.put("lmt", Long.valueOf(a5.threshold));
                map2.put("lm", Boolean.valueOf(a5.lowMemory));
            } else {
                map2.put("fm", -1);
                map2.put("tm", -1);
                map2.put("lmt", -1);
            }
        }
        if (((Boolean) this.a.a(x4.S3)).booleanValue() && com.applovin.impl.o0.a("android.permission.READ_PHONE_STATE", this.c) && com.applovin.impl.o0.f()) {
            map2.put("rat", Integer.valueOf(((TelephonyManager) this.c.getSystemService("phone")).getDataNetworkType()));
        }
        if (((Boolean) this.a.a(x4.P3)).booleanValue()) {
            String B = B();
            if (!TextUtils.isEmpty(B)) {
                map2.put("so", B);
            }
        }
        map2.put("device_orientation", n7.b(this.c));
        map2.put("orientation_lock", h());
        if (((Boolean) this.a.a(x4.T3)).booleanValue()) {
            map2.put("vs", Boolean.valueOf(n7.k()));
        }
        if (com.applovin.impl.o0.d() && (powerManager = (PowerManager) this.c.getSystemService("power")) != null) {
            map2.put("lpm", Integer.valueOf(powerManager.isPowerSaveMode() ? 1 : 0));
        }
        if (((Boolean) this.a.a(x4.e4)).booleanValue() && this.a.l0() != null) {
            map2.put("da", Float.valueOf(this.a.l0().a()));
        }
        if (((Boolean) this.a.a(x4.f4)).booleanValue() && this.a.l0() != null) {
            map2.put("dm", Float.valueOf(this.a.l0().b()));
        }
        map2.put("mute_switch", Integer.valueOf(this.a.p().c()));
        map2.put("network", com.applovin.impl.r0.g(this.a));
        String q = q();
        if (StringUtils.isValidString(q)) {
            map2.put("kb", q);
        }
        Map r = r();
        if (!CollectionUtils.isEmpty(r)) {
            map2.put("ds", r);
        }
        return map2;
    }

    private List a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            for (Signature signature : signatureArr) {
                messageDigest.update(signature.toByteArray());
                arrayList.add(StringUtils.toHexString(messageDigest.digest()));
            }
        } catch (Throwable th) {
            this.a.D().b("DataCollector", "parseSignatures", th);
        }
        return arrayList;
    }

    private List a(PackageInfo packageInfo) {
        InstrumentationInfo[] instrumentationInfoArr;
        if (packageInfo == null || (instrumentationInfoArr = packageInfo.instrumentation) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InstrumentationInfo instrumentationInfo : instrumentationInfoArr) {
            HashMap hashMap = new HashMap();
            hashMap.put("name", instrumentationInfo.name);
            hashMap.put("hp", Boolean.valueOf(instrumentationInfo.handleProfiling));
            hashMap.put("ft", Boolean.valueOf(instrumentationInfo.functionalTest));
            hashMap.put("t_pa", instrumentationInfo.targetPackage);
            if (com.applovin.impl.o0.g()) {
                hashMap.put("t_pr", Z.a(instrumentationInfo));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    private Map a(Intent intent) {
        if (intent == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(5);
        hashMap.put("action", StringUtils.emptyIfNull(intent.getAction()));
        hashMap.put("data", StringUtils.emptyIfNull(intent.getDataString()));
        hashMap.put("flags", Integer.valueOf(intent.getFlags()));
        ComponentName component = intent.getComponent();
        hashMap.put("component", component != null ? component.flattenToString() : "");
        Set categories = intent.getCategories();
        hashMap.put("categories", categories != null ? new ArrayList(categories) : Collections.emptyList());
        return hashMap;
    }

    private String a(ApplicationExitInfo applicationExitInfo, int i) {
        InputStream inputStream;
        String readLine;
        if (this.a.c(x4.D4).contains(Integer.toString(i))) {
            return null;
        }
        Integer num = (Integer) this.a.a(x4.C4);
        if (num.intValue() <= 0) {
            return null;
        }
        try {
            inputStream = v0.a(applicationExitInfo);
        } catch (Throwable th) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("DataCollector", "Failed to obtain trace input stream from application exit info", th);
            }
            this.a.D().b("DataCollector", "getTraceInputStream", th);
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            for (int i2 = 0; i2 < num.intValue() && (readLine = bufferedReader.readLine()) != null; i2++) {
                try {
                    sb.append(readLine);
                    sb.append('\n');
                } finally {
                }
            }
            bufferedReader.close();
        } catch (Throwable th2) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("DataCollector", "Failed to read stack trace from input stream", th2);
            }
            this.a.D().b("DataCollector", "readStackTraceFromInputStream", th2);
        }
        return sb.toString();
    }

    private /* synthetic */ void a(String str, int i, String str2) {
        Map hashMap = CollectionUtils.hashMap("details", str);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(i), hashMap);
        CollectionUtils.putStringIfValid("error_message", str2, hashMap);
        this.a.D().d(d2.G0, hashMap);
    }

    public static void a(v.a aVar) {
        l.set(aVar);
    }

    public static void a(b bVar) {
        m.set(bVar);
    }

    public static void a(String str, k kVar) {
        String a2 = a(k.o().getApplicationInfo().packageName, k.o().getPackageManager(), kVar);
        List c2 = kVar.c(x4.X6);
        if (!StringUtils.isValidString(a2) || c2.contains(a2)) {
            j = str;
        }
    }

    private boolean a(String str) {
        return b(str) == 1;
    }

    private Map a(JSONObject jSONObject, d dVar) {
        ContentResolver contentResolver = this.c.getContentResolver();
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String string = JsonUtils.getString(jSONObject, str, null);
            if (StringUtils.isValidString(string)) {
                hashMap.put(str, StringUtils.emptyIfNull(a(dVar, contentResolver, string)));
            }
        }
        return hashMap;
    }

    private String a(d dVar, ContentResolver contentResolver, String str) {
        try {
            return dVar.a(contentResolver, str);
        } catch (Throwable th) {
            this.a.D().a("DataCollector", "retrieveSystemSettingValue", th, CollectionUtils.hashMap("details", str));
            return null;
        }
    }

    private String a(String str, PackageManager packageManager) {
        if (!com.applovin.impl.o0.b()) {
            return null;
        }
        try {
            return Y.a(d0.a(packageManager, str));
        } catch (Throwable th) {
            this.a.D().b("DataCollector", "getOriginatingName", th);
            return null;
        }
    }

    private static String a(String str, PackageManager packageManager, k kVar) {
        try {
            if (((Boolean) kVar.a(x4.x4)).booleanValue() && com.applovin.impl.o0.b()) {
                return o0.a(d0.a(packageManager, str));
            }
            return packageManager.getInstallerPackageName(str);
        } catch (Throwable th) {
            kVar.D().b("DataCollector", "getInstallerName", th);
            return null;
        }
    }
}
