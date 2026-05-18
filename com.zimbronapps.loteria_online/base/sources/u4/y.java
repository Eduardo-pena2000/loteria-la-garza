package u4;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u4.a;
import u4.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class y {
    public static final a.b a = new a.b("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK");
    public static final a.b b = new a.b("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER");
    public static final a.e c = new a.e("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE");
    public static final a.c d = new a.c("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS");
    public static final a.f e = new a.f("START_SAFE_BROWSING", "START_SAFE_BROWSING");
    public static final a.f f = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST");
    public static final a.f g = new a.f("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST");
    public static final a.f h = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST");
    public static final a.f i = new a.f("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST");
    public static final a.f j = new a.f("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL");
    public static final a.c k = new a.c("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE");
    public static final a.c l = new a.c("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE");
    public static final a.c m = new a.c("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS");
    public static final a.c n = new a.c("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS");
    public static final a.c o = new a.c("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS");
    public static final a.c p = new a.c("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST");
    public static final a.b q = new a.b("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR");
    public static final a.b r = new a.b("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR");
    public static final a.c s = new a.c("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS");
    public static final a.f t = new a.f("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT");
    public static final a.c u = new a.c("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT");
    public static final a.b v = new a.b("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION");
    public static final a.b w = new a.b("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE");
    public static final a.f x = new a.f("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY");
    public static final a.f y = new a.f("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED");
    public static final a.f z = new a.f("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL");
    public static final a.b A = new a.b("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE");
    public static final a.b B = new a.b("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE");
    public static final a.d C = new a.d("WEB_MESSAGE_ARRAY_BUFFER", "WEB_MESSAGE_ARRAY_BUFFER");
    public static final a.b D = new a.b("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK");
    public static final a.b E = new a.b("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL");
    public static final a.b F = new a.b("POST_WEB_MESSAGE", "POST_WEB_MESSAGE");
    public static final a.b G = new a.b("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE");
    public static final a.e H = new a.e("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT");
    public static final a.e I = new a.e("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT");
    public static final a.h J = new a.h("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER");
    public static final a.h K = new a.h("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE");
    public static final a.g L = new a.g("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
    public static final r.b M = new r.b("STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX", "STARTUP_FEATURE_SET_DATA_DIRECTORY_SUFFIX");
    public static final r.a N = new r.a("STARTUP_FEATURE_SET_DIRECTORY_BASE_PATHS", "STARTUP_FEATURE_SET_DIRECTORY_BASE_PATH");
    public static final r.a O = new r.a("STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES", "STARTUP_FEATURE_CONFIGURE_PARTITIONED_COOKIES");
    public static final a.h P = new a.h("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE");
    public static final a.i Q = new a("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
    public static final a.d R = new a.d("PROXY_OVERRIDE", "PROXY_OVERRIDE:3");
    public static final a.d S = new a.d("MULTI_PROCESS", "MULTI_PROCESS_QUERY");
    public static final a.h T = new a.h("FORCE_DARK", "FORCE_DARK");
    public static final a.d U = new a.d("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR");
    public static final a.d V = new a.d("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER");
    public static final a.d W = new a.d("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    public static final a.d X = new a.d("PROXY_OVERRIDE_REVERSE_BYPASS", "PROXY_OVERRIDE_REVERSE_BYPASS");
    public static final a.d Y = new a.d("GET_VARIATIONS_HEADER", "GET_VARIATIONS_HEADER");
    public static final a.d Z = new a.d("ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY", "ENTERPRISE_AUTHENTICATION_APP_LINK_POLICY");
    public static final a.d a0 = new a.d("GET_COOKIE_INFO", "GET_COOKIE_INFO");
    public static final a.d b0 = new a.d("REQUESTED_WITH_HEADER_ALLOW_LIST", "REQUESTED_WITH_HEADER_ALLOW_LIST");
    public static final a.d c0 = new a.d("USER_AGENT_METADATA", "USER_AGENT_METADATA");
    public static final a.d d0 = new b("USER_AGENT_METADATA_FORM_FACTORS", "USER_AGENT_METADATA");
    public static final a.d e0 = new c("MULTI_PROFILE", "MULTI_PROFILE");
    public static final a.d f0 = new a.d("ATTRIBUTION_REGISTRATION_BEHAVIOR", "ATTRIBUTION_BEHAVIOR");
    public static final a.d g0 = new a.d("WEBVIEW_MEDIA_INTEGRITY_API_STATUS", "WEBVIEW_INTEGRITY_API_STATUS");
    public static final a.d h0 = new a.d("MUTE_AUDIO", "MUTE_AUDIO");
    public static final a.d i0 = new a.d("WEB_AUTHENTICATION", "WEB_AUTHENTICATION");
    public static final a.d j0 = new a.d("SPECULATIVE_LOADING_STATUS", "SPECULATIVE_LOADING");
    public static final a.d k0 = new a.d("BACK_FORWARD_CACHE", "BACK_FORWARD_CACHE");
    public static final a.d l0 = new a.d("BACK_FORWARD_CACHE_SETTINGS", "BACK_FORWARD_CACHE_SETTINGS");
    public static final a.d m0 = new a.d("DELETE_BROWSING_DATA", "WEB_STORAGE_DELETE_BROWSING_DATA");
    public static final a.d n0 = new d("PREFETCH_URL_V5", "PREFETCH_URL_V5");
    public static final a.d o0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP");
    public static final a.d p0 = new a.d("IMPLEMENTATION_ONLY_FEATURE", "ASYNC_WEBVIEW_STARTUP_ASYNC_STARTUP_LOCATIONS");
    public static final a.d q0 = new a.d("DEFAULT_TRAFFICSTATS_TAGGING", "DEFAULT_TRAFFICSTATS_TAGGING");
    public static final a.d r0 = new a.d("PRERENDER_URL_V2", "PRERENDER_URL_V3");
    public static final a.d s0 = new a.d("SPECULATIVE_LOADING_CONFIG_V2", "SPECULATIVE_LOADING_CONFIG_V2");
    public static final a.d t0 = new a.d("SAVE_STATE", "SAVE_STATE");
    public static final a.d u0 = new a.d("WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE", "WEB_VIEW_NAVIGATION_CLIENT_BASIC_USAGE");
    public static final a.d v0 = new a.d("NAVIGATION_LISTENER_V1", "WEB_VIEW_NAVIGATION_LISTENER_V1");
    public static final a.d w0 = new a.d("PROVIDER_WEAKLY_REF_WEBVIEW", "PROVIDER_WEAKLY_REF_WEBVIEW");
    public static final a.d x0 = new a.d("PAYMENT_REQUEST", "PAYMENT_REQUEST");
    public static final a.d y0 = new a.d("WEBVIEW_BUILDER_EXPERIMENTAL_V1", "WEBVIEW_BUILDER_V1");
    public static final a.d z0 = new a.d("COOKIE_INTERCEPT", "COOKIE_INTERCEPT");
    public static final a.d A0 = new a.d("WARM_UP_RENDERER_PROCESS", "WARM_UP_RENDERER_PROCESS");
    public static final a.d B0 = new a.d("ORIGIN_MATCHED_HEADERS", "EXTRA_HEADER_FOR_ORIGINS");
    public static final a.d C0 = new a.d("CUSTOM_REQUEST_HEADERS", "CUSTOM_REQUEST_HEADERS");
    public static final r.a D0 = new r.a("STARTUP_FEATURE_SET_PROFILES_TO_LOAD", "STARTUP_FEATURE_SET_PROFILES_TO_LOAD");
    public static final r.a E0 = new r.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE");
    public static final r.a F0 = new r.a("STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2", "STARTUP_FEATURE_SET_UI_THREAD_STARTUP_MODE_V2");
    public static final a.d G0 = new a.d("PRECONNECT", "PRECONNECT");
    public static final a.d H0 = new a.d("ADD_QUIC_HINTS", "ADD_QUIC_HINTS_V1");
    public static final a.d I0 = new a.d("HYPERLINK_CONTEXT_MENU_ITEMS", "HYPERLINK_CONTEXT_MENU_ITEMS");

    public class a extends a.i {
        public final Pattern d;

        public a(String str, String str2) {
            super(str, str2);
            this.d = Pattern.compile("\\A\\d+");
        }

        public boolean c() {
            boolean c = super.c();
            if (!c || Build.VERSION.SDK_INT >= 29) {
                return c;
            }
            PackageInfo e = t4.i.e();
            if (e == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(e.versionName);
            return matcher.find() && Integer.parseInt(e.versionName.substring(matcher.start(), matcher.end())) >= 105;
        }
    }

    public class b extends a.d {
        public b(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            PackageInfo e;
            return super.c() && (e = t4.i.e()) != null && I1.a.a(e) >= 636700000;
        }
    }

    public class c extends a.d {
        public c(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            if (super.c() && t4.j.a("MULTI_PROCESS")) {
                return t4.i.k();
            }
            return false;
        }
    }

    public class d extends a.d {
        public d(String str, String str2) {
            super(str, str2);
        }

        public boolean c() {
            if (t4.j.a("MULTI_PROFILE")) {
                return super.c();
            }
            return false;
        }
    }

    public static UnsupportedOperationException a() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    public static boolean b(String str) {
        return c(str, u4.a.d());
    }

    public static boolean c(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (jVar.a().equals(str)) {
                hashSet.add(jVar);
            }
        }
        if (hashSet.isEmpty()) {
            throw new RuntimeException("Unknown feature " + str);
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            if (((j) it2.next()).isSupported()) {
                return true;
            }
        }
        return false;
    }
}
