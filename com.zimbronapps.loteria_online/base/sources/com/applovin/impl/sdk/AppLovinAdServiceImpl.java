package com.applovin.impl.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.a6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e6;
import com.applovin.impl.e8;
import com.applovin.impl.i5;
import com.applovin.impl.k;
import com.applovin.impl.k7;
import com.applovin.impl.m2;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t1;
import com.applovin.impl.t2;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.y5;
import com.applovin.impl.z4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdService;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinBidTokenCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinAdServiceImpl implements AppLovinAdService, a.a {
    private final k a;
    private final o b;
    private final Map c;
    private final Object d = new Object();
    private final Map e = Collections.synchronizedMap(new HashMap());
    private final AtomicReference f = new AtomicReference();

    public class b implements m2 {
        private final c a;

        public /* synthetic */ b(AppLovinAdServiceImpl appLovinAdServiceImpl, c cVar, a aVar) {
            this(cVar);
        }

        public void adReceived(AppLovinAd appLovinAd) {
            if (!(appLovinAd instanceof com.applovin.impl.sdk.ad.c)) {
                AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
                AppLovinAdServiceImpl.a(AppLovinAdServiceImpl.this).i().a(appLovinAdImpl);
                if (appLovinAdImpl.canExpire()) {
                    AppLovinAdServiceImpl.a(AppLovinAdServiceImpl.this).f().a(appLovinAdImpl, AppLovinAdServiceImpl.this);
                }
                appLovinAd = new com.applovin.impl.sdk.ad.c(appLovinAdImpl.getAdZone(), AppLovinAdServiceImpl.a(AppLovinAdServiceImpl.this));
            }
            HashSet emptySet = Collections.emptySet();
            synchronized (this.a.a) {
                try {
                    if (!this.a.c) {
                        emptySet = new HashSet(this.a.d);
                        this.a.d.clear();
                    }
                    c cVar = this.a;
                    cVar.b = false;
                    cVar.c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.a(AppLovinAdServiceImpl.this, appLovinAd, (AppLovinAdLoadListener) it.next());
            }
        }

        public void failedToReceiveAd(int i) {
            failedToReceiveAdV2(new AppLovinError(i, ""));
        }

        public void failedToReceiveAdV2(AppLovinError appLovinError) {
            HashSet emptySet = Collections.emptySet();
            synchronized (this.a.a) {
                try {
                    if (!this.a.c) {
                        emptySet = new HashSet(this.a.d);
                        this.a.d.clear();
                    }
                    c cVar = this.a;
                    cVar.b = false;
                    cVar.c = false;
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = emptySet.iterator();
            while (it.hasNext()) {
                AppLovinAdServiceImpl.a(AppLovinAdServiceImpl.this, appLovinError, (AppLovinAdLoadListener) it.next());
            }
        }

        private b(c cVar) {
            this.a = cVar;
        }
    }

    public AppLovinAdServiceImpl(k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        HashMap hashMap = new HashMap(6);
        this.c = hashMap;
        hashMap.put(com.applovin.impl.u.c(), new c(null));
        hashMap.put(com.applovin.impl.u.k(), new c(null));
        hashMap.put(com.applovin.impl.u.j(), new c(null));
        hashMap.put(com.applovin.impl.u.m(), new c(null));
        hashMap.put(com.applovin.impl.u.b(), new c(null));
        hashMap.put(com.applovin.impl.u.h(), new c(null));
    }

    public static /* synthetic */ void a(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar) {
        appLovinAdServiceImpl.a(appLovinAdLoadListener, jSONObject, uVar, bVar);
    }

    public static /* synthetic */ void b(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdServiceImpl.a(appLovinError, appLovinAdLoadListener);
    }

    public static /* synthetic */ void c(b bVar, com.applovin.impl.sdk.ad.b bVar2) {
        a(bVar, bVar2);
    }

    public static /* synthetic */ void d(AppLovinAdServiceImpl appLovinAdServiceImpl, b bVar, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar2) {
        appLovinAdServiceImpl.a(bVar, uVar, bVar2);
    }

    public static /* synthetic */ void e(AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.ad.b bVar) {
        a(appLovinAdLoadListener, bVar);
    }

    public static /* synthetic */ void f(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        appLovinAdServiceImpl.a(appLovinAdLoadListener, appLovinAd);
    }

    public void addCustomQueryParams(Map map) {
        this.e.putAll(map);
    }

    public void collectBidToken(AppLovinBidTokenCollectionListener appLovinBidTokenCollectionListener) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "collectBidToken(listener=" + appLovinBidTokenCollectionListener + ")");
        }
        this.a.A().a(appLovinBidTokenCollectionListener);
    }

    public AppLovinAd dequeueAd(com.applovin.impl.u uVar) {
        AppLovinAdImpl a2 = this.a.i().a(uVar);
        if (o.a()) {
            this.b.a("AppLovinAdService", "Dequeued ad: " + a2 + " for zone: " + uVar + "...");
        }
        return a2;
    }

    public JSONObject getAndResetCustomPostBody() {
        return (JSONObject) this.f.getAndSet((Object) null);
    }

    public Map getAndResetCustomQueryParams() {
        Map map;
        synchronized (this.e) {
            map = CollectionUtils.map(this.e);
            this.e.clear();
        }
        return map;
    }

    public String getBidToken() {
        if (o.a()) {
            this.b.a("AppLovinAdService", "getBidToken()");
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        String I = this.a.A().I();
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        if (StringUtils.isValidString(I) && o.a()) {
            this.b.a("AppLovinAdService", "Successfully retrieved bid token");
        }
        return I;
    }

    public void loadNextAd(AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR), appLovinAdLoadListener);
    }

    public void loadNextAdForAdToken(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            o.h("AppLovinAdService", "Empty ad token");
            c(new AppLovinError(-8, "Empty ad token"), appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.k kVar = new com.applovin.impl.k(trim, this.a);
        if (kVar.c() == k.a.REGULAR) {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Loading next ad for token: " + kVar);
            }
            a(new a6(kVar, appLovinAdLoadListener, this.a));
            return;
        }
        if (kVar.c() != k.a.AD_RESPONSE_JSON) {
            AppLovinError appLovinError = new AppLovinError(-8, "Invalid token type");
            o.h("AppLovinAdService", "Invalid token type");
            c(appLovinError, appLovinAdLoadListener);
            return;
        }
        JSONObject a2 = kVar.a();
        if (a2 == null) {
            String str2 = "Unable to retrieve ad response JSON from token: " + kVar.b();
            AppLovinError appLovinError2 = new AppLovinError(-8, str2);
            o.h("AppLovinAdService", str2);
            c(appLovinError2, appLovinAdLoadListener);
            return;
        }
        com.applovin.impl.r0.c(a2, this.a);
        com.applovin.impl.r0.b(a2, this.a);
        com.applovin.impl.r0.a(a2, this.a);
        this.a.m().a();
        if (JsonUtils.getJSONArray(a2, "ads", new JSONArray()).length() <= 0) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "No ad returned from the server for token: " + kVar);
            }
            c(AppLovinError.NO_FILL, appLovinAdLoadListener);
            return;
        }
        if (o.a()) {
            this.b.a("AppLovinAdService", "Rendering ad for token: " + kVar);
        }
        com.applovin.impl.u a3 = n7.a(a2, this.a);
        MaxAdFormat d = a3.d();
        if (((Boolean) this.a.a(x4.X0)).booleanValue() && d != null && d.isFullscreenAd()) {
            this.a.h().a(a3, new s(this, appLovinAdLoadListener, a2, a3));
        } else {
            a(new e6(a2, a3, appLovinAdLoadListener, this.a));
        }
    }

    public void loadNextAdForZoneId(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("No zone id specified");
        }
        if (o.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.a(str), appLovinAdLoadListener);
    }

    public void loadNextIncentivizedAd(String str, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Loading next incentivized ad of zone {" + str + "}");
        }
        a(com.applovin.impl.u.b(str), appLovinAdLoadListener);
    }

    public void maybeFireAppKilledWhilePlayingAdPostback() {
        Long l;
        if (((Boolean) this.a.a(x4.x2)).booleanValue() && (l = (Long) this.a.b(z4.N)) != null && System.currentTimeMillis() - l.longValue() <= ((Long) this.a.a(x4.B2)).longValue()) {
            if (((Boolean) this.a.a(x4.A2)).booleanValue() || b()) {
                a();
            }
        }
    }

    public void maybeSubmitPersistentPostbacks(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((com.applovin.impl.e) it.next());
        }
    }

    public void onAdExpired(t1 t1Var) {
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) t1Var;
        com.applovin.impl.u adZone = appLovinAdImpl.getAdZone();
        if (o.a()) {
            this.b.k("AppLovinAdService", "Ad expired for zone: " + adZone);
        }
        this.a.i().b(appLovinAdImpl);
        if (this.a.G0() || !((Boolean) this.a.a(x4.d1)).booleanValue()) {
            return;
        }
        c a2 = a(adZone);
        synchronized (a2.a) {
            try {
                if (!a2.b) {
                    this.a.O();
                    if (o.a()) {
                        this.a.O().a("AppLovinAdService", "Reloading ad after expiration for zone {" + adZone + "}...");
                    }
                    a2.b = true;
                    a2.c = true;
                    a(adZone, new b(this, a2, null));
                } else if (o.a()) {
                    this.b.a("AppLovinAdService", "Cancelled expired ad reload. Already waiting on an ad load...");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setCustomPostBody(JSONObject jSONObject) {
        this.f.set(jSONObject);
    }

    public String toString() {
        return "AppLovinAdService{adLoadStates=" + this.c + '}';
    }

    public void trackAndLaunchClick(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri, MotionEvent motionEvent) {
        if (bVar == null) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad view click. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking click on an ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.a(motionEvent));
        if (appLovinAdView != null && uri != null) {
            a(bVar, appLovinAdView, aVar, uri);
        } else if (o.a()) {
            this.b.b("AppLovinAdService", "Unable to launch click - adView has been prematurely destroyed");
        }
    }

    public void trackAndLaunchVideoClick(com.applovin.impl.sdk.ad.b bVar, Uri uri, MotionEvent motionEvent, w1 w1Var, Context context) {
        if (bVar == null) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "Unable to track video click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Tracking VIDEO click on an ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.b(motionEvent));
            a(w1Var.b().getController(), uri, context);
        }
    }

    public void trackCustomTabsNavigationAborted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackCustomTabsNavigationFailed(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackCustomTabsNavigationFinished(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackCustomTabsNavigationStarted(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackCustomTabsTabHidden(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabHiddenPostbacks());
    }

    public void trackCustomTabsTabShown(com.applovin.impl.sdk.ad.b bVar) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on ad...");
        }
        maybeSubmitPersistentPostbacks(bVar.getCustomTabsTabShownPostbacks());
    }

    public void trackFullScreenAdClosed(com.applovin.impl.sdk.ad.b bVar, long j, List list, long j2, boolean z, int i) {
        if (bVar == null) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "Unable to track ad closed. No ad specified.");
                return;
            }
            return;
        }
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking ad closed...");
        }
        List<com.applovin.impl.e> e = bVar.e();
        if (e == null || e.isEmpty()) {
            if (o.a()) {
                this.b.k("AppLovinAdService", "Unable to track ad closed for AD #" + bVar.getAdIdNumber() + ". Missing ad close tracking URL." + bVar.getAdIdNumber());
                return;
            }
            return;
        }
        for (com.applovin.impl.e eVar : e) {
            String a2 = a(eVar.c(), j, j2, list, bVar.v(), z, i);
            String a3 = a(eVar.a(), j, j2, list, bVar.v(), z, i);
            if (StringUtils.isValidString(a2)) {
                a(new com.applovin.impl.e(a2, a3));
            } else if (o.a()) {
                this.b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
            }
        }
    }

    public void trackImpression(com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "Unable to track impression click. No ad specified");
            }
        } else {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Tracking impression on ad...");
            }
            maybeSubmitPersistentPostbacks(bVar.A());
        }
    }

    public void trackNativeAdCustomTabsNavigationAborted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation aborted on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationAbortedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFailed(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation failed on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFailedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationFinished(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation finished on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationFinishedPostbacks());
    }

    public void trackNativeAdCustomTabsNavigationStarted(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs navigation started on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsNavigationStartedPostbacks());
    }

    public void trackNativeAdCustomTabsTabHidden(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab hidden on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabHiddenPostbacks());
    }

    public void trackNativeAdCustomTabsTabShown(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking Custom Tabs tab shown on native ad...");
        }
        maybeSubmitPersistentPostbacks(appLovinNativeAdImpl.getCustomTabsTabShownPostbacks());
    }

    public void trackVideoEnd(com.applovin.impl.sdk.ad.b bVar, long j, int i, boolean z) {
        if (bVar == null) {
            if (o.a()) {
                this.b.b("AppLovinAdService", "Unable to track video end. No ad specified");
                return;
            }
            return;
        }
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking video end on ad...");
        }
        List<com.applovin.impl.e> g0 = bVar.g0();
        if (g0 == null || g0.isEmpty()) {
            if (o.a()) {
                this.b.k("AppLovinAdService", "Unable to submit persistent postback for AD #" + bVar.getAdIdNumber() + ". Missing video end tracking URL.");
                return;
            }
            return;
        }
        String l = Long.toString(System.currentTimeMillis());
        for (com.applovin.impl.e eVar : g0) {
            if (StringUtils.isValidString(eVar.c())) {
                String a2 = a(eVar.c(), j, i, l, z);
                String a3 = a(eVar.a(), j, i, l, z);
                if (a2 != null) {
                    a(new com.applovin.impl.e(a2, a3));
                } else if (o.a()) {
                    this.b.b("AppLovinAdService", "Failed to parse url: " + eVar.c());
                }
            } else if (o.a()) {
                this.b.k("AppLovinAdService", "Requested a postback dispatch for an empty video end URL; nothing to do...");
            }
        }
    }

    public static /* synthetic */ k a(AppLovinAdServiceImpl appLovinAdServiceImpl) {
        return appLovinAdServiceImpl.a;
    }

    private void b(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new u(this, appLovinError, appLovinAdLoadListener));
    }

    private void c(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener instanceof m2) {
            ((m2) appLovinAdLoadListener).failedToReceiveAdV2(appLovinError);
        } else {
            appLovinAdLoadListener.failedToReceiveAd(appLovinError.getCode());
        }
    }

    public void loadNextAd(String str, AppLovinAdSize appLovinAdSize, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (o.a()) {
            this.b.a("AppLovinAdService", "Loading next ad of zone {" + str + "} with size " + appLovinAdSize);
        }
        a(com.applovin.impl.u.a(appLovinAdSize, AppLovinAdType.REGULAR, str), appLovinAdLoadListener);
    }

    public static class c {
        final Object a;
        boolean b;
        boolean c;
        final Collection d;

        private c() {
            this.a = new Object();
            this.d = new HashSet();
        }

        public String toString() {
            return "AdLoadState{, isWaitingForAd=" + this.b + ", isReloadingExpiredAd=" + this.c + ", pendingAdListeners=" + this.d + '}';
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdServiceImpl.a(appLovinAd, appLovinAdLoadListener);
    }

    private Uri b(Uri uri, String str) {
        try {
            return Uri.parse(uri.getQueryParameter(str));
        } catch (Throwable th) {
            this.a.O();
            if (o.a()) {
                this.a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
            }
            this.a.D().a("AppLovinAdService", "buildDeepLinkPlusUrl", th);
            return null;
        }
    }

    public static /* synthetic */ void a(AppLovinAdServiceImpl appLovinAdServiceImpl, AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        appLovinAdServiceImpl.b(appLovinError, appLovinAdLoadListener);
    }

    private static /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.ad.b bVar) {
        appLovinAdLoadListener.adReceived(bVar);
    }

    private /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, JSONObject jSONObject, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar != null) {
            AppLovinSdkUtils.runOnUiThread(new t(appLovinAdLoadListener, bVar));
        } else {
            a(new e6(jSONObject, uVar, appLovinAdLoadListener, this.a));
        }
    }

    private boolean b() {
        if (!com.applovin.impl.o0.b()) {
            return true;
        }
        Context o = k.o();
        ApplicationExitInfo a2 = Q4.d.a(Q4.c.a((ActivityManager) o.getSystemService("activity"), o.getPackageName(), 0, 1).get(0));
        return Q4.e.a(a2) == 10 || Q4.e.a(a2) == 11;
    }

    private void a(com.applovin.impl.u uVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        if (uVar == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        if (appLovinAdLoadListener != null) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinAdService", "Loading next ad of zone {" + uVar + "}...");
            }
            c a2 = a(uVar);
            synchronized (a2.a) {
                try {
                    a2.d.add(appLovinAdLoadListener);
                    if (!a2.b) {
                        a2.b = true;
                        a(uVar, new b(this, a2, null));
                    } else if (o.a()) {
                        this.b.a("AppLovinAdService", "Already waiting on an ad load...");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new IllegalArgumentException("No callback specified");
    }

    private void a(i5 i5Var) {
        if (!this.a.B0()) {
            o.j("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
        }
        this.a.c();
        this.a.q0().a(i5Var, d6.b.CORE);
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdLoadListener appLovinAdLoadListener) {
        AppLovinSdkUtils.runOnUiThread(true, new r(this, appLovinAdLoadListener, appLovinAd));
    }

    private /* synthetic */ void a(AppLovinAdLoadListener appLovinAdLoadListener, AppLovinAd appLovinAd) {
        try {
            appLovinAdLoadListener.adReceived(appLovinAd);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about a newly loaded ad", th);
            this.a.D().a("AppLovinAdService", "notifyAdLoadedCallback", th);
        }
    }

    private /* synthetic */ void a(AppLovinError appLovinError, AppLovinAdLoadListener appLovinAdLoadListener) {
        try {
            c(appLovinError, appLovinAdLoadListener);
        } catch (Throwable th) {
            o.c("AppLovinAdService", "Unable to notify listener about ad load failure", th);
            StringBuilder sb = new StringBuilder();
            sb.append("notifyAdLoadFailedCallback");
            sb.append(appLovinAdLoadListener instanceof m2 ? "V2" : "");
            this.a.D().a("AppLovinAdService", sb.toString(), th);
        }
    }

    private void a(com.applovin.impl.adview.a aVar, Uri uri, Context context) {
        com.applovin.impl.sdk.ad.b g = aVar.g();
        if (k7.a(uri)) {
            a(uri, g, aVar.i(), aVar, context, this.a);
        } else if (g != null && g.isCustomTabsEnabled()) {
            this.a.z().a(uri, aVar, this.a.u0());
        } else {
            k7.b(uri, g, context, this.a);
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Uri uri) {
        Context context;
        if (((Boolean) this.a.a(x4.w)).booleanValue()) {
            context = e8.b(appLovinAdView, this.a);
            if (context == null) {
                context = appLovinAdView.getContext();
            }
        } else {
            context = appLovinAdView.getContext();
        }
        Context context2 = context;
        if (k7.a(uri)) {
            a(uri, bVar, appLovinAdView, aVar, context2, this.a);
        } else if (bVar != null && bVar.isCustomTabsEnabled()) {
            this.a.z().a(uri, aVar, this.a.u0());
        } else {
            a(uri, bVar, appLovinAdView, aVar, context2);
        }
    }

    private String a(String str, long j, int i, String str2, boolean z) {
        try {
            if (!StringUtils.isValidString(str)) {
                return null;
            }
            if (i < 0 || i > 100) {
                i = 0;
            }
            return Uri.parse(str).buildUpon().appendQueryParameter("et_s", Long.toString(j)).appendQueryParameter("pv", Integer.toString(i)).appendQueryParameter("vid_ts", str2).appendQueryParameter("uvs", Boolean.toString(z)).build().toString();
        } catch (Throwable th) {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Unknown error parsing the video end url: " + str, th);
            }
            this.a.D().a("AppLovinAdService", "buildVideoEndUrl", th);
            return null;
        }
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context) {
        if (k7.b(uri, bVar, context, this.a)) {
            t2.b(aVar.e(), bVar, appLovinAdView);
        }
        aVar.w();
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        if (uri != null && StringUtils.isValidString(uri.getQuery())) {
            Uri b2 = b(uri, "primaryUrl");
            List a2 = a(uri, "primaryTrackingUrl");
            Uri b3 = b(uri, "fallbackUrl");
            List a3 = a(uri, "fallbackTrackingUrl");
            if (b2 == null && b3 == null) {
                kVar.O();
                if (o.a()) {
                    kVar.O().b("AppLovinAdService", "Failed to parse both primary and backup URLs for Deep Link+ command");
                    return;
                }
                return;
            }
            if (!a(b2, "primary", a2, bVar, appLovinAdView, aVar, context, kVar)) {
                a(b3, "backup", a3, bVar, appLovinAdView, aVar, context, kVar);
            }
            if (aVar != null) {
                aVar.w();
                return;
            }
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().b("AppLovinAdService", "Failed to execute Deep Link+ command - no query parameters found");
        }
    }

    private boolean a(Uri uri, String str, List list, com.applovin.impl.sdk.ad.b bVar, AppLovinAdView appLovinAdView, com.applovin.impl.adview.a aVar, Context context, k kVar) {
        kVar.O();
        if (o.a()) {
            kVar.O().a("AppLovinAdService", "Opening " + str + " URL: " + uri);
        }
        boolean b2 = k7.b(uri, bVar, context, kVar);
        if (b2) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinAdService", "URL opened successfully, dispatching tracking URLs: " + list);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kVar.g0().dispatchPostbackAsync(((Uri) it.next()).toString(), null);
            }
            if (aVar != null) {
                t2.b(aVar.e(), bVar, appLovinAdView);
            }
        } else {
            kVar.O();
            if (o.a()) {
                kVar.O().b("AppLovinAdService", "URL failed to open");
            }
        }
        return b2;
    }

    private List a(Uri uri, String str) {
        List queryParameters = uri.getQueryParameters(str);
        ArrayList arrayList = new ArrayList(queryParameters.size());
        Iterator it = queryParameters.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add(Uri.parse((String) it.next()));
            } catch (Throwable th) {
                this.a.O();
                if (o.a()) {
                    this.a.O().k("AppLovinAdService", "Unable to parse query parameter into Uri: " + str);
                }
                this.a.D().a("AppLovinAdService", "buildDeepLinkPlusUrlList", th);
            }
        }
        return arrayList;
    }

    private String a(String str, long j, long j2, List list, String str2, boolean z, int i) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        Uri.Builder appendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("et_ms", Long.toString(j)).appendQueryParameter("vs_ms", Long.toString(j2));
        if (list != null && list.size() > 0) {
            appendQueryParameter.appendQueryParameter("ec_ms", list.toString());
        }
        if (StringUtils.isValidString(str2)) {
            appendQueryParameter.appendQueryParameter("ds", str2);
        }
        if (i != i.h) {
            appendQueryParameter.appendQueryParameter("musw_ch", Boolean.toString(z));
            appendQueryParameter.appendQueryParameter("musw_st", Boolean.toString(i.a(i)));
        }
        return appendQueryParameter.build().toString();
    }

    private void a() {
        Map tryToStringMap;
        if (o.a()) {
            this.b.a("AppLovinAdService", "Tracking app killed during ad from previous run.");
        }
        String str = (String) this.a.b(z4.Q);
        if (TextUtils.isEmpty(str)) {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Couldn't get last ad data. Tracking event with empty data.");
            }
            tryToStringMap = null;
        } else {
            tryToStringMap = JsonUtils.tryToStringMap(JsonUtils.jsonObjectFromJsonString(str, new JSONObject()));
        }
        this.a.D().d(d2.H0, tryToStringMap);
        String str2 = (String) this.a.b(z4.P);
        if (str2 != null) {
            JSONObject jsonObjectFromJsonString = JsonUtils.jsonObjectFromJsonString(str2, null);
            String string = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_url", null);
            String string2 = JsonUtils.getString(jsonObjectFromJsonString, "app_killed_postback_backup_url", null);
            Long l = (Long) this.a.b(z4.O);
            if (l != null) {
                string = StringUtils.appendQueryParameter(string, "imp_duration_ms", String.valueOf(l));
                string2 = StringUtils.appendQueryParameter(string2, "imp_duration_ms", String.valueOf(l));
            }
            a(new com.applovin.impl.e(string, string2));
            return;
        }
        if (o.a()) {
            this.b.k("AppLovinAdService", "Unable to track app killed during ad from previous run. Missing app killed tracking URLs.");
        }
    }

    private void a(com.applovin.impl.e eVar) {
        if (StringUtils.isValidString(eVar.c())) {
            this.a.f0().e(com.applovin.impl.sdk.network.d.b().d(eVar.c()).a(StringUtils.isValidString(eVar.a()) ? eVar.a() : null).a(eVar.b()).a(false).b(eVar.d()).a());
        } else if (o.a()) {
            this.b.k("AppLovinAdService", "Requested a postback dispatch for a null URL; nothing to do...");
        }
    }

    private void a(com.applovin.impl.u uVar, b bVar) {
        AppLovinAdImpl e = this.a.i().e(uVar);
        if (e != null && !e.isExpired()) {
            if (o.a()) {
                this.b.a("AppLovinAdService", "Using pre-loaded ad: " + e + " for " + uVar);
            }
            bVar.adReceived(e);
            return;
        }
        MaxAdFormat d = uVar.d();
        if (((Boolean) this.a.a(x4.X0)).booleanValue() && d != null && d.isFullscreenAd()) {
            this.a.h().a(uVar, new v(this, bVar, uVar));
        } else {
            a(new y5(uVar, bVar, this.a));
        }
    }

    private static /* synthetic */ void a(b bVar, com.applovin.impl.sdk.ad.b bVar2) {
        bVar.adReceived(bVar2);
    }

    private /* synthetic */ void a(b bVar, com.applovin.impl.u uVar, com.applovin.impl.sdk.ad.b bVar2) {
        if (bVar2 != null) {
            AppLovinSdkUtils.runOnUiThread(new w(bVar, bVar2));
        } else {
            a(new y5(uVar, bVar, this.a));
        }
    }

    private c a(com.applovin.impl.u uVar) {
        c cVar;
        synchronized (this.d) {
            try {
                cVar = (c) this.c.get(uVar);
                if (cVar == null) {
                    cVar = new c(null);
                    this.c.put(uVar, cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
