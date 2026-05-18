package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.impl.d6;
import com.applovin.impl.e3;
import com.applovin.impl.q0;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxDebuggerActivity;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class p3 implements q0.e {
    private static WeakReference l;
    private static final AtomicBoolean m = new AtomicBoolean();
    private final com.applovin.impl.sdk.k a;
    private final com.applovin.impl.sdk.o b;
    private final Context c;
    private final o3 d;
    private boolean g;
    private boolean i;
    private Map j;
    private final b0 k;
    private final Map e = new HashMap();
    private final AtomicBoolean f = new AtomicBoolean();
    private int h = 2;

    public class a extends b {
        public a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started mediation debugger");
                if (!p3.a(p3.this) || p3.a().get() != activity) {
                    MaxDebuggerActivity maxDebuggerActivity = (MaxDebuggerActivity) activity;
                    p3.a(new WeakReference(maxDebuggerActivity));
                    maxDebuggerActivity.setListAdapter(p3.b(p3.this), p3.c(p3.this).e());
                }
                p3.b().set(false);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Mediation debugger destroyed");
                p3.a((WeakReference) null);
            }
        }
    }

    public p3(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        this.b = kVar.O();
        Context o = com.applovin.impl.sdk.k.o();
        this.c = o;
        o3 o3Var = new o3(o);
        this.d = o3Var;
        this.k = new b0(kVar, o3Var);
    }

    public static /* synthetic */ boolean a(p3 p3Var) {
        return p3Var.c();
    }

    public static /* synthetic */ o3 b(p3 p3Var) {
        return p3Var.d;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k c(p3 p3Var) {
        return p3Var.a;
    }

    public static /* synthetic */ void d(p3 p3Var) {
        p3Var.d();
    }

    public static /* synthetic */ void e(p3 p3Var, DialogInterface dialogInterface, int i) {
        p3Var.a(dialogInterface, i);
    }

    private void f() {
        this.a.e().a(new a());
    }

    public boolean g() {
        return this.g;
    }

    public void h() {
        a((Map) null);
    }

    public String toString() {
        return "MediationDebuggerService{, listAdapter=" + this.d + "}";
    }

    public static /* synthetic */ WeakReference a() {
        return l;
    }

    public static /* synthetic */ AtomicBoolean b() {
        return m;
    }

    private boolean c() {
        WeakReference weakReference = l;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private /* synthetic */ void d() {
        Activity u0 = this.a.u0();
        if (u0 == null || u0.isFinishing()) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "MAX Mediation Debugger has flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this log will only be shown in your development builds. Live apps will not be affected.");
        } else {
            new AlertDialog.Builder(u0).setTitle("Review Integration Errors").setMessage("Looks like MAX Mediation Debugger flagged several errors in your build. Make sure to resolve these before you go live.\n\nNote that this prompt will only be shown in your development builds. Live apps will not be affected.").setPositiveButton("Show Mediation Debugger", new Z3(this)).setNegativeButton("DISMISS", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    public void e() {
        if (this.f.compareAndSet(false, true)) {
            this.a.q0().a((i5) new w5(this, this.a), d6.b.OTHER);
        }
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        l = weakReference;
        return weakReference;
    }

    public void a(boolean z, int i) {
        this.g = z;
        this.h = i;
    }

    public void a(Map map) {
        this.j = map;
        e();
        if (!c() && m.compareAndSet(false, true)) {
            if (!this.i) {
                f();
                this.i = true;
            }
            Intent intent = new Intent(this.c, MaxDebuggerActivity.class);
            intent.setFlags(268435456);
            com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting mediation debugger...");
            this.c.startActivity(intent);
            return;
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Mediation debugger is already showing");
    }

    public List a(String str) {
        Map map = this.j;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return (List) this.j.get(str);
    }

    private void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.z() && e3Var.q() == e3.a.INVALID_INTEGRATION) {
                AppLovinSdkUtils.runOnUiThreadDelayed(new A4(this), TimeUnit.SECONDS.toMillis(2L));
                return;
            }
        }
    }

    private /* synthetic */ void a(DialogInterface dialogInterface, int i) {
        h();
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "networks", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                e3 e3Var = new e3(jSONObject2, kVar);
                arrayList.add(e3Var);
                this.e.put(e3Var.b(), e3Var);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(JSONObject jSONObject, List list, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "ad_units", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new n(jSONObject2, this.e, kVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private List a(List list, com.applovin.impl.sdk.k kVar) {
        List adUnitIds = kVar.J() != null ? kVar.J().getAdUnitIds() : null;
        if (adUnitIds != null && !adUnitIds.isEmpty()) {
            ArrayList arrayList = new ArrayList(adUnitIds.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (adUnitIds.contains(nVar.c())) {
                    arrayList.add(nVar);
                }
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    private List a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        for (String str : JsonUtils.getList(jSONObject, "required_app_ads_txt_entries", new ArrayList())) {
            a0 a0Var = new a0(str);
            if (a0Var.h()) {
                arrayList.add(a0Var);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.b.b("MediationDebuggerService", "app-ads.txt entry passed down for validation is misformatted: " + str);
            }
        }
        return arrayList;
    }

    public void a(String str, JSONObject jSONObject, int i) {
        List a2 = a(jSONObject, this.a);
        List a3 = a(jSONObject, a2, this.a);
        List a4 = a(a3, this.a);
        List a5 = a(jSONObject);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "alert", (JSONObject) null);
        this.d.a(a2, a3, a4, a5, JsonUtils.getString(jSONObject2, "title", null), JsonUtils.getString(jSONObject2, "message", null), JsonUtils.getString(jSONObject, "account_id", null), JsonUtils.getBoolean(jSONObject, "should_display_cmp_details", Boolean.TRUE).booleanValue(), this.a);
        if (!a5.isEmpty()) {
            this.k.a();
        }
        if (g()) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Y3(this), TimeUnit.SECONDS.toMillis(this.h));
        } else {
            a(a2);
        }
    }

    public void a(String str, int i, String str2, JSONObject jSONObject) {
        if (com.applovin.impl.sdk.o.a()) {
            this.b.b("MediationDebuggerService", "Unable to fetch mediation debugger info: server returned " + i);
        }
        com.applovin.impl.sdk.o.h("AppLovinSdk", "Unable to show mediation debugger.");
        this.a.D().a("fetchMediationDebuggerInfo", str, i, str2);
        this.d.a(null, null, null, null, null, null, null, false, this.a);
        this.f.set(false);
    }
}
