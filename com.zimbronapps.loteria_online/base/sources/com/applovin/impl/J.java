package com.applovin.impl;

import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class j implements AppLovinCommunicatorSubscriber {
    private final com.applovin.impl.sdk.k a;
    private final Object b = new Object();
    private final LinkedHashMap c = new a();
    private final Set d = Collections.synchronizedSet(new HashSet());

    public class a extends LinkedHashMap {
        public a() {
        }

        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 16;
        }
    }

    public interface b {
        void onCreativeIdGenerated(String str, String str2);
    }

    public j(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        if (c()) {
            AppLovinCommunicator.getInstance(com.applovin.impl.sdk.k.o()).subscribe(this, "safedk_ad_info");
        }
    }

    public static /* synthetic */ void a(j jVar, b bVar, String str, String str2) {
        jVar.a(bVar, str, str2);
    }

    public void b(b bVar) {
        this.d.remove(bVar);
    }

    public void c(String str) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Removing ad info for serve id: " + str);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.b) {
            this.c.remove(str);
        }
    }

    public String getCommunicatorId() {
        return j.class.getSimpleName();
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("safedk_ad_info".equals(appLovinCommunicatorMessage.getTopic())) {
            Bundle bundle = appLovinCommunicatorMessage.getMessageData().getBundle("public");
            if (bundle == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without public data");
                    return;
                }
                return;
            }
            Bundle bundle2 = appLovinCommunicatorMessage.getMessageData().getBundle("private");
            if (bundle2 == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without private data");
                    return;
                }
                return;
            }
            if (MaxAdFormat.formatFromString(bundle2.getString("ad_format")) == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without ad format");
                    return;
                }
                return;
            }
            String string = bundle2.getString("id");
            if (TextUtils.isEmpty(string)) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().k("AdReviewManager", "Received SafeDK ad info without serve id");
                    return;
                }
                return;
            }
            synchronized (this.b) {
                try {
                    this.a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.a.O().a("AdReviewManager", "Storing current SafeDK ad info for serve id: " + string + ", public data: " + bundle);
                    }
                    this.c.put(string, bundle);
                } catch (Throwable th) {
                    throw th;
                }
            }
            String string2 = bundle.getString("ad_review_creative_id");
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("AdReviewManager", "Received SafeDK ad info with Ad Review creative id: " + string2);
            }
            if (!StringUtils.isValidString(string2) || this.d.isEmpty()) {
                return;
            }
            HashSet hashSet = new HashSet(this.d);
            this.a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.a.O().a("AdReviewManager", "Notifying listeners: " + this.d);
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.a.q0().a((i5) new r6(this.a, "creativeIdGenerated", new Q1(this, (b) it.next(), string, string2)), d6.b.OTHER);
            }
        }
    }

    public static String b() {
        return b("getVersion");
    }

    public Bundle a(String str) {
        Bundle bundle;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.b) {
            bundle = (Bundle) this.c.get(str);
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Retrieved ad info (" + bundle + ") for serve id: " + str);
        }
        return bundle;
    }

    private static String b(String str) {
        Class cls;
        try {
            try {
                cls = Class.forName("com.applovin.quality.AppLovinQualityService");
            } catch (Throwable unused) {
                cls = Class.forName("com.safedk.android.SafeDK");
            }
            return (String) cls.getMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static boolean c() {
        return StringUtils.isValidString(b());
    }

    public void a(b bVar) {
        this.d.add(bVar);
    }

    public static String a() {
        return b("getSdkKey");
    }

    private /* synthetic */ void a(b bVar, String str, String str2) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("AdReviewManager", "Notifying Ad Review creative id generated for listener: " + bVar);
        }
        bVar.onCreativeIdGenerated(str, str2);
    }
}
