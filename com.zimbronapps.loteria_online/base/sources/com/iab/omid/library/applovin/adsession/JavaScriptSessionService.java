package com.iab.omid.library.applovin.adsession;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.iab.omid.library.applovin.utils.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;
import t4.e;
import t4.i;
import t4.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class JavaScriptSessionService {
    private static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    private static String JS_MESSAGE_KEY_DATA = "data";
    private static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    private static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    private static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static i webViewUtil = new i();
    private final HashMap adSessions = new HashMap();
    private final f friendlyObstructions = new f();
    private final boolean isHtmlAdView;
    private final Partner partner;
    private com.iab.omid.library.applovin.weakreference.a weakAdView;
    private final WebView webView;

    public class 1 extends TimerTask {
        final /* synthetic */ TearDownHandler val$tearDownHandler;
        final /* synthetic */ Timer val$timer;

        public 1(TearDownHandler tearDownHandler, Timer timer) {
            this.val$tearDownHandler = tearDownHandler;
            this.val$timer = timer;
        }

        public void run() {
            JavaScriptSessionService.access$000(JavaScriptSessionService.this);
            this.val$tearDownHandler.onTearDown(true);
            this.val$timer.cancel();
        }
    }

    public class 2 implements i.a {
        public 2() {
        }

        public void onPostMessage(WebView webView, e eVar, Uri uri, boolean z, t4.a aVar) {
            try {
                JSONObject jSONObject = new JSONObject(eVar.b());
                String string = jSONObject.getString(JavaScriptSessionService.access$100());
                String string2 = jSONObject.getJSONObject(JavaScriptSessionService.access$200()).getString(JavaScriptSessionService.access$300());
                if (string.equals(JavaScriptSessionService.access$400())) {
                    JavaScriptSessionService.access$500(JavaScriptSessionService.this, string2);
                } else if (string.equals(JavaScriptSessionService.access$600())) {
                    JavaScriptSessionService.access$700(JavaScriptSessionService.this, string2);
                } else {
                    d.b("Unexpected method in JavaScriptSessionService: " + string);
                }
            } catch (JSONException e) {
                d.a("Error parsing JS message in JavaScriptSessionService.", e);
            }
        }
    }

    public interface TearDownHandler {
        void onTearDown(boolean z);
    }

    private JavaScriptSessionService(Partner partner, WebView webView, boolean z) {
        g.a();
        g.a(partner, "Partner is null");
        g.a(webView, "WebView is null");
        this.partner = partner;
        this.webView = webView;
        this.isHtmlAdView = z;
        if (z) {
            setAdView(webView);
        }
        addWebViewListener();
    }

    public static /* synthetic */ void access$000(JavaScriptSessionService javaScriptSessionService) {
        javaScriptSessionService.removeWebViewListener();
    }

    public static /* synthetic */ String access$100() {
        return JS_MESSAGE_KEY_METHOD;
    }

    public static /* synthetic */ String access$200() {
        return JS_MESSAGE_KEY_DATA;
    }

    public static /* synthetic */ String access$300() {
        return JS_MESSAGE_DATA_AD_SESSION_ID;
    }

    public static /* synthetic */ String access$400() {
        return JS_MESSAGE_METHOD_START_SESSION;
    }

    public static /* synthetic */ void access$500(JavaScriptSessionService javaScriptSessionService, String str) {
        javaScriptSessionService.startSession(str);
    }

    public static /* synthetic */ String access$600() {
        return JS_MESSAGE_METHOD_FINISH_SESSION;
    }

    public static /* synthetic */ void access$700(JavaScriptSessionService javaScriptSessionService, String str) {
        javaScriptSessionService.finishSession(str);
    }

    private void addWebViewListener() {
        if (!j.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        removeWebViewListener();
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new HashSet(Arrays.asList(new String[]{"*"})), new 2());
    }

    public static JavaScriptSessionService create(Partner partner, WebView webView, boolean z) {
        return new JavaScriptSessionService(partner, webView, z);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, null, null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, null, null);
    }

    private void finishSession(String str) {
        AdSession adSession = (AdSession) this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    private void removeWebViewListener() {
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    private void startSession(String str) {
        a aVar = new a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(getAdView());
        for (com.iab.omid.library.applovin.internal.e eVar : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction((View) eVar.c().get(), eVar.b(), eVar.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        Iterator it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            ((AdSession) it.next()).addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    public View getAdView() {
        com.iab.omid.library.applovin.weakreference.a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return (View) aVar.get();
    }

    public void removeAllFriendlyObstructions() {
        Iterator it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            ((AdSession) it.next()).removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view) {
        Iterator it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            ((AdSession) it.next()).removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(View view) {
        if (getAdView() == view) {
            return;
        }
        Iterator it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            ((AdSession) it.next()).registerAdView(view);
        }
        this.weakAdView = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void tearDown(TearDownHandler tearDownHandler) {
        Iterator it = this.adSessions.values().iterator();
        while (it.hasNext()) {
            ((AdSession) it.next()).finish();
        }
        Timer timer = new Timer();
        timer.schedule(new 1(tearDownHandler, timer), 1000L);
    }
}
