package com.applovin.impl;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import v.a;
import v.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f1 {
    private final com.applovin.impl.sdk.k a;
    private v.c b;

    public class a extends v.e {
        public a() {
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, v.c cVar) {
            f1.a(f1.this).O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.a(f1.this).O().a("CustomTabsManager", "Connection successful: " + componentName);
            }
            f1.a(f1.this, cVar);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            f1.a(f1.this).O();
            if (com.applovin.impl.sdk.o.a()) {
                f1.a(f1.this).O().a("CustomTabsManager", "Service disconnected: " + componentName);
            }
            f1.a(f1.this, (v.c) null);
        }
    }

    public class b extends v.b {
        private final WeakReference a;

        public b(com.applovin.impl.adview.a aVar) {
            this.a = new WeakReference(aVar);
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            com.applovin.impl.adview.a aVar = (com.applovin.impl.adview.a) this.a.get();
            if (aVar == null) {
                f1.a(f1.this).O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.a(f1.this).O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Controller is null.");
                }
                return;
            }
            com.applovin.impl.sdk.ad.b g = aVar.g();
            if (g == null) {
                f1.a(f1.this).O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.a(f1.this).O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). No ad specified.");
                    return;
                }
                return;
            }
            switch (i) {
                case 1:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsNavigationStarted(g);
                        break;
                    }
                    break;
                case 2:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsNavigationFinished(g);
                        break;
                    }
                    break;
                case 3:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsNavigationFailed(g);
                        break;
                    }
                    break;
                case 4:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsNavigationAborted(g);
                        break;
                    }
                    break;
                case 5:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsTabShown(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    t2.c(aVar.e(), g, aVar.i());
                    break;
                case 6:
                    if (g.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackCustomTabsTabHidden(g);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    t2.a(aVar.e(), g, aVar.i());
                    break;
                default:
                    f1.a(f1.this).O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.a(f1.this).O().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            f1.a(f1.this).O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o O = f1.a(f1.this).O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                O.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public class c extends v.b {
        private final WeakReference a;

        public c(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.a = new WeakReference(appLovinNativeAdImpl);
        }

        public void onNavigationEvent(int i, Bundle bundle) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) this.a.get();
            if (appLovinNativeAdImpl == null) {
                f1.a(f1.this).O();
                if (com.applovin.impl.sdk.o.a()) {
                    f1.a(f1.this).O().b("CustomTabsManager", "Unable to track navigation event (" + i + "). Native ad is null.");
                }
                return;
            }
            switch (i) {
                case 1:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsNavigationStarted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 2:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsNavigationFinished(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 3:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsNavigationFailed(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 4:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsNavigationAborted(appLovinNativeAdImpl);
                        break;
                    }
                    break;
                case 5:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsTabShown(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_shown"), null);
                    break;
                case 6:
                    if (appLovinNativeAdImpl.shouldCustomTabsTrackEvents()) {
                        f1.a(f1.this).k().trackNativeAdCustomTabsTabHidden(appLovinNativeAdImpl);
                    }
                    AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_hidden"), null);
                    break;
                default:
                    f1.a(f1.this).O();
                    if (com.applovin.impl.sdk.o.a()) {
                        f1.a(f1.this).O().a("CustomTabsManager", "Unknown navigation event: " + i);
                        break;
                    }
                    break;
            }
        }

        public void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
            f1.a(f1.this).O();
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o O = f1.a(f1.this).O();
                StringBuilder sb = new StringBuilder();
                sb.append("Validation ");
                sb.append(z ? "succeeded" : "failed");
                sb.append(" for session-URL relation(");
                sb.append(i);
                sb.append("), requestedOrigin(");
                sb.append(uri);
                sb.append(")");
                O.a("CustomTabsManager", sb.toString());
            }
        }
    }

    public f1(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public static /* synthetic */ void a(f1 f1Var, List list, v.f fVar) {
        f1Var.a(list, fVar);
    }

    public static /* synthetic */ void b(f1 f1Var, g1 g1Var, v.f fVar) {
        f1Var.b(g1Var, fVar);
    }

    public static /* synthetic */ void c(f1 f1Var, com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        f1Var.a(aVar, activity, uri);
    }

    public static /* synthetic */ void d(f1 f1Var, AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        f1Var.a(appLovinNativeAdImpl, activity, uri);
    }

    public static /* synthetic */ com.applovin.impl.sdk.k a(f1 f1Var) {
        return f1Var.a;
    }

    public void b(List list, v.f fVar) {
        if (list.isEmpty()) {
            return;
        }
        if (fVar != null) {
            a("warmup urls", new R0(this, list, fVar));
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Custom Tabs session is null, cannot warmup urls");
        }
    }

    public static /* synthetic */ v.c a(f1 f1Var, v.c cVar) {
        f1Var.b = cVar;
        return cVar;
    }

    public void a() {
        if (((Boolean) this.a.a(x4.d7)).booleanValue() && this.b == null) {
            String d = v.c.d(com.applovin.impl.sdk.k.o(), this.a.c(x4.e7), true);
            String c2 = v.c.c(com.applovin.impl.sdk.k.o(), (List) null);
            LinkedList linkedList = new LinkedList();
            if (((Boolean) this.a.a(x4.f7)).booleanValue()) {
                CollectionUtils.addUniqueObjectIfExists(c2, linkedList);
                CollectionUtils.addUniqueObjectIfExists(d, linkedList);
            } else {
                CollectionUtils.addUniqueObjectIfExists(d, linkedList);
                CollectionUtils.addUniqueObjectIfExists(c2, linkedList);
            }
            if (linkedList.isEmpty()) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("CustomTabsManager", "Unable to find a supported Custom Tabs package name");
                    return;
                }
                return;
            }
            a(linkedList);
        }
    }

    private /* synthetic */ void b(g1 g1Var, v.f fVar) {
        this.b.g(0L);
        if (g1Var == null) {
            return;
        }
        Integer e = g1Var.e();
        String b2 = g1Var.b();
        if (e == null || TextUtils.isEmpty(b2)) {
            return;
        }
        if (fVar == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Cannot validate session-URL relation because the session is null");
                return;
            }
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Validating session-URL relation: " + e + " with digital asset link: " + b2);
        }
        fVar.k(e.intValue(), Uri.parse(b2), (Bundle) null);
    }

    private void a(LinkedList linkedList) {
        boolean isEmpty;
        boolean z = false;
        try {
            z = v.c.a(com.applovin.impl.sdk.k.o(), (String) linkedList.poll(), new a());
            if (!z) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("CustomTabsManager", "Custom Tabs service not available");
                }
            }
        } catch (Throwable th) {
            try {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().a("CustomTabsManager", "Failed to bind to service", th);
                }
                if (z) {
                    return;
                } else {
                    if (isEmpty) {
                        return;
                    }
                }
            } finally {
                if (!z && !linkedList.isEmpty()) {
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("CustomTabsManager", "Retrying with next package name...");
                    }
                    a(linkedList);
                }
            }
        }
        if (z || linkedList.isEmpty()) {
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
        }
    }

    public v.f a(com.applovin.impl.adview.a aVar) {
        if (this.b == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            v.f e = this.b.e(new b(aVar));
            a(e, aVar.g());
            return e;
        } catch (Exception e2) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    public v.f a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (this.b == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Custom Tabs service is not connected, cannot start session");
            }
            return null;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Starting Custom Tabs session");
        }
        try {
            v.f e = this.b.e(new c(appLovinNativeAdImpl));
            a(e, appLovinNativeAdImpl);
            return e;
        } catch (Exception e2) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to create Custom Tabs session", e2);
            }
            return null;
        }
    }

    private /* synthetic */ void a(List list, v.f fVar) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Warming up URLs: " + list);
        }
        String str = (String) list.remove(0);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(str2));
            arrayList.add(bundle);
        }
        boolean g = fVar.g(Uri.parse(str), (Bundle) null, arrayList);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o O = this.a.O();
            StringBuilder sb = new StringBuilder();
            sb.append("Warmup for URLs ");
            sb.append(g ? "succeeded" : "failed");
            O.a("CustomTabsManager", sb.toString());
        }
    }

    public void a(Uri uri, com.applovin.impl.adview.a aVar, Activity activity) {
        if (aVar.h() == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return;
        }
        if (a("launch uri", new T0(this, aVar, activity, uri))) {
            this.a.m0().pauseForClick();
            return;
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
        }
        a(uri, activity);
    }

    private /* synthetic */ void a(com.applovin.impl.adview.a aVar, Activity activity, Uri uri) {
        a(aVar, activity).a(activity, uri);
    }

    public boolean a(Uri uri, AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        if (appLovinNativeAdImpl.getCustomTabsSession() == null) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Unable to launch URL in Custom Tabs. No Custom Tabs session found.");
            }
            a(uri, activity);
            return false;
        }
        boolean a2 = a("launch uri", new U0(this, appLovinNativeAdImpl, activity, uri));
        if (a2) {
            this.a.m0().pauseForClick();
        } else {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().b("CustomTabsManager", "Opening in Custom Tabs failed: " + uri);
            }
            a(uri, activity);
        }
        return a2;
    }

    private /* synthetic */ void a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity, Uri uri) {
        a(appLovinNativeAdImpl, activity).a(activity, uri);
    }

    private void a(v.f fVar, com.applovin.impl.sdk.ad.b bVar) {
        if (bVar == null || !bVar.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(bVar.getCustomTabsSettings(), fVar);
    }

    private void a(v.f fVar, AppLovinNativeAdImpl appLovinNativeAdImpl) {
        if (appLovinNativeAdImpl == null || !appLovinNativeAdImpl.isCustomTabsClientWarmupEnabled()) {
            return;
        }
        a(appLovinNativeAdImpl.getCustomTabsSettings(), fVar);
    }

    private void a(g1 g1Var, v.f fVar) {
        a("client warmup", new S0(this, g1Var, fVar));
    }

    private v.d a(com.applovin.impl.adview.a aVar, Activity activity) {
        com.applovin.impl.sdk.ad.b g = aVar.g();
        return a(g != null ? g.getCustomTabsSettings() : null, g != null ? g.getCustomTabsHeaders() : Bundle.EMPTY, aVar.h(), activity);
    }

    private v.d a(AppLovinNativeAdImpl appLovinNativeAdImpl, Activity activity) {
        return a(appLovinNativeAdImpl.getCustomTabsSettings(), appLovinNativeAdImpl.getCustomTabsHeaders(), appLovinNativeAdImpl.getCustomTabsSession(), activity);
    }

    private v.d a(g1 g1Var, Bundle bundle, v.f fVar, Activity activity) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CustomTabsManager", "Creating Custom Tabs intent");
        }
        d.d dVar = new d.d(fVar);
        if (((Boolean) this.a.a(x4.g7)).booleanValue()) {
            dVar.o(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
            dVar.f(activity, R.anim.applovin_slide_up_animation, R.anim.applovin_slide_down_animation);
        }
        if (g1Var != null) {
            Integer h = g1Var.h();
            if (h != null) {
                dVar.e(new a.a().b(h.intValue()).a());
            }
            Integer a2 = g1Var.a();
            if (a2 != null) {
                dVar.c(2, new a.a().b(a2.intValue()).a());
            }
            Boolean i = g1Var.i();
            if (i != null) {
                dVar.p(i.booleanValue());
            }
            Boolean g = g1Var.g();
            if (g != null) {
                dVar.n(g.booleanValue());
            }
            Boolean c2 = g1Var.c();
            if (c2 != null) {
                dVar.i(c2.booleanValue());
            }
            Integer f = g1Var.f();
            if (f != null) {
                dVar.m(f.intValue());
            }
        }
        v.d a3 = dVar.a();
        if (g1Var != null) {
            String d = g1Var.d();
            if (d != null) {
                a3.a.putExtra("android.intent.extra.REFERRER", Uri.parse(d));
            }
            if (!bundle.isEmpty()) {
                a3.a.putExtra("com.android.browser.headers", bundle);
            }
        }
        return a3;
    }

    private void a(Uri uri, Activity activity) {
        if (((Boolean) this.a.a(x4.h7)).booleanValue()) {
            k7.a(uri, (Context) activity, this.a);
        }
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.custom_tabs_failure"), CollectionUtils.map("url", uri));
    }

    private boolean a(String str, Runnable runnable) {
        try {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Running operation: " + str);
            }
            runnable.run();
            this.a.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return true;
            }
            this.a.O().a("CustomTabsManager", "Finished operation: " + str);
            return true;
        } catch (Throwable th) {
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("CustomTabsManager", "Failed to run operation: " + str, th);
            }
            this.a.D().c("CustomTabsManager", str, th);
            return false;
        }
    }
}
