package com.applovin.impl;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c3 extends y2 implements t1 {
    private final AtomicReference A;
    private final AtomicBoolean B;
    private final AtomicBoolean C;
    private final AtomicBoolean D;
    private boolean E;
    private String F;
    private final Bundle z;

    public c3(a3 a3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.k kVar) {
        super(a3Var, jSONObject, jSONObject2, null, kVar);
        this.z = new Bundle();
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.A = new AtomicReference();
        this.B = new AtomicBoolean();
    }

    private long k0() {
        long a = a("ad_expiration_ms", -1L);
        return a < 0 ? b("ad_expiration_ms", ((Long) this.a.a(r3.R7)).longValue()) : a;
    }

    public y2 a(com.applovin.impl.mediation.h hVar) {
        return new c3(this, hVar);
    }

    public long getTimeToLiveMillis() {
        return k0() - (SystemClock.elapsedRealtime() - I());
    }

    public void j(String str) {
        this.F = str;
    }

    public void j0() {
        this.B.set(true);
    }

    public long l0() {
        return a("ahdm", ((Long) this.a.a(r3.L7)).longValue());
    }

    public long m0() {
        long a = a("ad_hidden_on_ad_dismiss_callback_delay_ms", -1L);
        return a >= 0 ? a : b("ad_hidden_on_ad_dismiss_callback_delay_ms", ((Long) this.a.a(r3.Z7)).longValue());
    }

    public long n0() {
        long a = a("ad_hidden_timeout_ms", -1L);
        return a >= 0 ? a : b("ad_hidden_timeout_ms", ((Long) this.a.a(r3.W7)).longValue());
    }

    public o4 o0() {
        return (o4) this.A.getAndSet((Object) null);
    }

    public long p0() {
        if (I() > 0) {
            return SystemClock.elapsedRealtime() - I();
        }
        return -1L;
    }

    public Bundle q0() {
        return this.z;
    }

    public long r0() {
        long a = a("fullscreen_display_delay_ms", -1L);
        return a >= 0 ? a : ((Long) this.a.a(r3.J7)).longValue();
    }

    public String s0() {
        return b("mcode", "");
    }

    public void setExpired() {
        this.E = true;
    }

    public AtomicBoolean t0() {
        return this.C;
    }

    public String u0() {
        return this.F;
    }

    public AtomicBoolean v0() {
        return this.D;
    }

    public boolean w0() {
        return this.B.get();
    }

    public boolean x0() {
        if (a("schedule_ad_hidden_on_ad_dismiss", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_ad_dismiss", (Boolean) this.a.a(r3.X7)).booleanValue();
    }

    public boolean y0() {
        if (a("schedule_ad_hidden_on_single_task_app_relaunch", Boolean.FALSE).booleanValue()) {
            return true;
        }
        return b("schedule_ad_hidden_on_single_task_app_relaunch", (Boolean) this.a.a(r3.Y7)).booleanValue();
    }

    public boolean z0() {
        return a("susaode", (Boolean) this.a.a(r3.K7)).booleanValue();
    }

    public void a(Bundle bundle) {
        Bundle bundle2;
        super.a(bundle);
        if (bundle == null || (bundle2 = bundle.getBundle("applovin_ad_view_info")) == null) {
            return;
        }
        this.z.putBundle("applovin_ad_view_info", bundle2);
    }

    public void a(o4 o4Var) {
        this.A.set(o4Var);
    }

    private c3(c3 c3Var, com.applovin.impl.mediation.h hVar) {
        super(c3Var.N(), c3Var.a(), c3Var.g(), hVar, c3Var.a);
        this.z = new Bundle();
        this.C = new AtomicBoolean();
        this.D = new AtomicBoolean();
        this.A = c3Var.A;
        this.B = c3Var.B;
    }
}
