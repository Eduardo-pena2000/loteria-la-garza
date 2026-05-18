package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class k7 {

    public class a extends b {
        final /* synthetic */ String a;
        final /* synthetic */ com.applovin.impl.adview.a b;
        final /* synthetic */ com.applovin.impl.sdk.k c;

        public a(String str, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
            this.a = str;
            this.b = aVar;
            this.c = kVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.a, null);
                t2.c(this.b.e(), this.b.g(), this.b.i());
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                t2.a(this.b.e(), this.b.g(), this.b.i());
                this.c.e().b(this);
            }
        }
    }

    public static boolean a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        return b(uri, null, context, kVar);
    }

    public static /* synthetic */ void b(com.applovin.impl.sdk.k kVar, String str, com.applovin.impl.sdk.ad.b bVar) {
        a(kVar, str, bVar);
    }

    public static void c(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String emptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String emptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String emptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap hashMap = CollectionUtils.hashMap("source", emptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", emptyIfNull2, hashMap);
        CollectionUtils.putStringIfValid("details", emptyIfNull3, hashMap);
        if (bVar != null) {
            hashMap.putAll(f2.a((AppLovinAdImpl) bVar));
            hashMap.putAll(f2.a(bVar));
        }
        kVar.D().d(d2.Z0, (Map) hashMap);
    }

    public static boolean a(Uri uri, String str, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        boolean z = false;
        String str2 = null;
        if (uri == null) {
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return false;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            str2 = StringUtils.defaultIfEmpty(str, a(intent, uri, bVar, context));
            intent.setPackage(str2);
            kVar.m0().pauseForClick();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            HashMap hashMap = CollectionUtils.hashMap("url", uri.toString());
            hashMap.put("name", str2);
            if (bVar != null) {
                hashMap.putAll(f2.a((AppLovinAdImpl) bVar));
                hashMap.putAll(f2.a(bVar));
            }
            if ("play.google.com".equals(uri.getHost())) {
                CollectionUtils.putStringIfValid("details", (String) kVar.A().N().get("ps_version"), hashMap);
            }
            kVar.D().a("UriUtils", "openUri", th, (Map) hashMap);
        }
        if (!z) {
            kVar.m0().resumeForClick();
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent(z ? "com.applovin.external_redirect_success" : "com.applovin.external_redirect_failure"), CollectionUtils.map("url", uri));
        return z;
    }

    public static boolean b(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        return a(uri, null, bVar, context, kVar);
    }

    public static void b(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("url");
        if (!StringUtils.isValidString(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find resource URL to preload from query parameters");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), CollectionUtils.map("error", "Invalid URL"));
            return;
        }
        if (bVar == null) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Cannot preload resource: ad is null");
            }
            Map map = CollectionUtils.map("error", "Invalid ad reference");
            map.put("resource_url", queryParameter);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("UriUtils", "Attempting to preload resource: " + queryParameter);
        }
        kVar.q0().a((i5) new r6(kVar, false, "preloadResource", new Y1(kVar, queryParameter, bVar)), d6.b.CACHING);
    }

    private static String a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context) {
        if (!"market".equals(intent.getScheme()) && !"play.google.com".equals(uri.getHost())) {
            if ("https".equals(intent.getScheme()) && bVar != null) {
                if (bVar.c1()) {
                    String J = com.applovin.impl.sdk.l.J();
                    if (a(J, context)) {
                        return J;
                    }
                }
                for (String str : bVar.N()) {
                    if (a(str, context)) {
                        return str;
                    }
                }
            }
            return null;
        }
        if (Boolean.FALSE.equals(a(context))) {
            return "com.android.vending";
        }
        return null;
    }

    private static boolean a(String str, Context context) {
        return (TextUtils.isEmpty(str) || context.getPackageManager().getLaunchIntentForPackage(str) == null) ? false : true;
    }

    public static boolean a(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        com.applovin.impl.adview.b f = aVar.f();
        String queryParameter = uri.getQueryParameter("n");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find url to load from query in original uri");
            }
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.external_redirect_failure"), null);
            return;
        }
        a5 p0 = kVar.p0();
        z4 z4Var = z4.T;
        String str = (String) p0.a(z4Var, null);
        if (uri.getQueryParameterNames().contains("browser")) {
            str = uri.getQueryParameter("browser");
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (Boolean.parseBoolean(uri.getQueryParameter("retain_browser"))) {
                kVar.p0().b(z4Var, str);
            }
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if ("external".equalsIgnoreCase(queryParameter2)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, str, aVar, kVar);
            return;
        }
        if ("internal".equalsIgnoreCase(queryParameter2)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            f.loadUrl(queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                f.setBackgroundColor(Color.parseColor(queryParameter3));
                return;
            }
            return;
        }
        if ("in_app".equalsIgnoreCase(queryParameter2)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            kVar.e().a(new a(queryParameter, aVar, kVar));
            Intent intent = new Intent(com.applovin.impl.sdk.k.o(), AppLovinWebViewActivity.class);
            intent.putExtra("sdk_key", kVar.i0());
            intent.setFlags(268435456);
            com.applovin.impl.sdk.k.o().startActivity(intent);
            return;
        }
        if ("in_app_v2".equalsIgnoreCase(queryParameter2)) {
            aVar.a(aVar.g(), aVar.i(), null, f.getAndClearLastClickEvent());
            if (aVar.h() != null) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
                }
                kVar.z().a(Uri.parse(queryParameter), aVar, kVar.u0());
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, str, aVar, kVar);
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find load type in original uri");
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            kVar.f0().e(com.applovin.impl.sdk.network.d.b().d(StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode())).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    private static /* synthetic */ void a(com.applovin.impl.sdk.k kVar, String str, com.applovin.impl.sdk.ad.b bVar) {
        try {
            com.applovin.impl.sdk.m G = kVar.G();
            Context o = com.applovin.impl.sdk.k.o();
            String a2 = G.a(com.applovin.impl.sdk.k.o(), str, bVar.getCachePrefix(), bVar.S(), true, G.a(str, bVar), null, f2.a((AppLovinAdImpl) bVar));
            if (a2 != null) {
                String uri = Uri.fromFile(G.a(a2, o)).toString();
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Successfully cached resource at: " + uri);
                }
                Map map = CollectionUtils.map("resource_url", str);
                map.put("cached_url", uri);
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_success"), map);
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().k("UriUtils", "Failed to cache resource: " + str);
            }
            Map map2 = CollectionUtils.map("error", "Failed to cache resource");
            map2.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map2);
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Exception while caching resource", th);
            }
            Map map3 = CollectionUtils.map("url", str);
            map3.putAll(f2.a((AppLovinAdImpl) bVar));
            map3.putAll(f2.a(bVar));
            kVar.D().a("UriUtils", "handlePreload", th, map3);
            Map map4 = CollectionUtils.map("error", "Internal error while caching");
            map4.put("resource_url", str);
            AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.preload_failure"), map4);
        }
    }

    public static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        Throwable th;
        Intent c;
        j7 j7Var = new j7();
        Context a2 = a(uri.getQueryParameter("context_source"), appLovinAdView, kVar);
        Intent intent = null;
        try {
            j7Var.f(uri.getQueryParameter("identifier")).d(uri.getQueryParameter("action")).a(uri.getQueryParameter("data"), uri.getQueryParameter("type")).b(uri.getQueryParameter("flags")).e(uri.getQueryParameter("extras")).a(uri.getQueryParameter("categories")).a(uri.getQueryParameter("clip_data_uri"), uri.getQueryParameter("clip_data_mime_type"), uri.getQueryParameter("clip_data_label")).h(uri.getQueryParameter("source_bounds")).b(uri.getQueryParameter("component"), uri.getQueryParameter("class_name"), uri.getQueryParameter("package")).g(uri.getQueryParameter("selector_action"));
            if (!(a2 instanceof Activity)) {
                j7Var.b(String.valueOf(268435456));
            }
            c = Boolean.parseBoolean(uri.getQueryParameter("use_chooser")) ? j7Var.c(uri.getQueryParameter("chooser_title")) : j7Var.a();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Attempting to launch intent with configuration:\n" + a(c));
            }
            if (c.resolveActivity(a2.getPackageManager()) != null) {
                a2.startActivity(c);
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("UriUtils", "Successfully launched intent");
                }
                AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_success"), null);
                kVar.g().d(d2.a0, a(c, uri, bVar));
                return;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "No activity found to handle the intent");
            }
            a("noActivityToHandleIntent", null, uri, a(c, uri, bVar), bVar, a2, kVar);
        } catch (Throwable th3) {
            th = th3;
            intent = c;
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("UriUtils", "Exception while launching intent", th);
            }
            a("intentLaunchException", th, uri, a(intent, uri, bVar), bVar, a2, kVar);
        }
    }

    private static Context a(String str, AppLovinAdView appLovinAdView, com.applovin.impl.sdk.k kVar) {
        if ("application".equalsIgnoreCase(str)) {
            return com.applovin.impl.sdk.k.o();
        }
        if ("activity".equalsIgnoreCase(str)) {
            Activity b = e8.b(appLovinAdView, kVar);
            if (b != null) {
                return b;
            }
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().k("UriUtils", "Could not retrieve the activity context. Falling back to view context.");
            }
        }
        return appLovinAdView.getContext();
    }

    private static void a(String str, Throwable th, Uri uri, Map map, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_intent_launch_failure"), null);
        HashMap hashMap = new HashMap(map);
        if (th != null) {
            kVar.D().a("UriUtils", "launchCustomIntent", th, map);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
        }
        CollectionUtils.putStringIfValid("source", str, hashMap);
        kVar.g().d(d2.b0, (Map) hashMap);
        a(uri, bVar, context, kVar);
    }

    private static void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, Context context, com.applovin.impl.sdk.k kVar) {
        String queryParameter = uri.getQueryParameter("fallback_url");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("UriUtils", "Could not find fallback URL to open from query parameters");
                return;
            }
            return;
        }
        kVar.O();
        if (com.applovin.impl.sdk.o.a()) {
            kVar.O().a("UriUtils", "Opening fallback URL: " + queryParameter);
        }
        b(Uri.parse(queryParameter), bVar, context, kVar);
    }

    private static Map a(Intent intent, Uri uri, com.applovin.impl.sdk.ad.b bVar) {
        Map a2 = f2.a((AppLovinAdImpl) bVar);
        CollectionUtils.putStringIfValid("url", uri.toString(), a2);
        CollectionUtils.putStringIfValid("details", a(intent), a2);
        return a2;
    }

    private static String a(Intent intent) {
        if (intent == null) {
            return "Intent not available";
        }
        ComponentName component = intent.getComponent();
        StringBuilder sb = new StringBuilder();
        sb.append("Identifier: ");
        sb.append(o0.i() ? X1.a(intent) : null);
        sb.append("\nAction: ");
        sb.append(intent.getAction());
        sb.append("\nData: ");
        sb.append(intent.getData());
        sb.append("\nType: ");
        sb.append(intent.getType());
        sb.append("\nFlags: ");
        sb.append(intent.getFlags());
        sb.append("\nExtras: ");
        sb.append(intent.getExtras());
        sb.append("\nCategories: ");
        sb.append(intent.getCategories());
        sb.append("\nClipData: ");
        sb.append(intent.getClipData());
        sb.append("\nSourceBounds: ");
        sb.append(intent.getSourceBounds());
        sb.append("\nComponent: ");
        sb.append(component != null ? component.flattenToString() : intent.getPackage());
        sb.append("\nSelector: ");
        sb.append(intent.getSelector());
        return sb.toString();
    }

    private static void a(String str, String str2, com.applovin.impl.adview.a aVar, com.applovin.impl.sdk.k kVar) {
        a(Uri.parse(str), str2, aVar.g(), aVar.f().getContext(), kVar);
        t2.b(aVar.e(), aVar.g(), aVar.i());
    }

    public static Boolean a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            boolean z = true;
            packageManager.getPackageInfo("com.android.vending", 1);
            int applicationEnabledSetting = packageManager.getApplicationEnabledSetting("com.android.vending");
            if (applicationEnabledSetting != 2 && applicationEnabledSetting != 3) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (PackageManager.NameNotFoundException unused) {
            return Boolean.TRUE;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
