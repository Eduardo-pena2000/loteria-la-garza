package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class d1 extends s2 {
    private com.applovin.impl.sdk.k e;
    private List f;
    private final AtomicBoolean g;
    private List h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.g = new AtomicBoolean();
        this.h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity u0;
        this.e = kVar;
        this.f = list;
        if (!(this.a instanceof Activity) && (u0 = kVar.u0()) != null) {
            this.a = u0;
        }
        if (list != null && this.g.compareAndSet(false, true)) {
            this.h = a(this.f);
        }
        AppLovinSdkUtils.runOnUiThread(new Z(this));
    }

    public int b() {
        return a.COUNT.ordinal();
    }

    public List c(int i) {
        return this.h;
    }

    public List d() {
        return this.f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.e;
    }

    public boolean f() {
        return this.h.size() == 0;
    }

    public void g() {
        this.g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.g.get() + "}";
    }

    public int d(int i) {
        return this.h.size();
    }

    public r2 e(int i) {
        return new v4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.a));
        }
        return arrayList;
    }
}
