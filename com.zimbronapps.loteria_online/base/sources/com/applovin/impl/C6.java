package com.applovin.impl;

import android.app.Activity;
import com.applovin.impl.d6;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c6 extends i5 {
    private final com.applovin.impl.sdk.k g;

    public c6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.g = kVar;
    }

    private /* synthetic */ void a(boolean z, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.g.D().a("license_validation", (Throwable) exc);
        }
        this.g.q0().a(new s6(this.g, p2Var, exc));
    }

    public static /* synthetic */ void e(c6 c6Var) {
        c6Var.e();
    }

    public static /* synthetic */ void f(c6 c6Var, boolean z, p2 p2Var, Exception exc) {
        c6Var.a(z, p2Var, exc);
    }

    private void g() {
        String str;
        boolean c = this.g.o0().c();
        Map p = this.g.A().p();
        Map M = this.g.A().M();
        String a = c ? this.g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (c) {
            str = p.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.g.a(x4.L3)).a("Ad Review Version", j.b()).a("OM SDK Version", this.g.e0().c());
        v2Var.a("===Device Info===").a("OS", n7.d()).a("GAID", a).a("App Set ID", str).a("Model", p.get("model")).a("Locale", p.get("locale")).a("Emulator", p.get("sim")).a("Tablet", p.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", M.get("package_name")).a("Target SDK", M.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.g.i0()).a("Mediation Provider", this.g.V()).a("TG", m7.a(this.g)).a("MD", this.g.a(x4.t)).a("Test Mode On", Boolean.valueOf(this.g.s0().c())).a("Verbose Logging On", Boolean.valueOf(c));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        u0 x = this.g.x();
        boolean j = x.j();
        v2Var.a("Enabled", Boolean.valueOf(j));
        if (j) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography d = x.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (n7.c(this.g)) {
                if (d == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = "None";
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", x.f()).a("Terms of Service URI", x.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.g.r0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l = (Long) this.g.a(x4.y);
        if (l.longValue() < 0) {
            return;
        }
        Boolean bool = (Boolean) a5.a(z4.i, Boolean.FALSE, com.applovin.impl.sdk.k.o());
        Boolean bool2 = (Boolean) this.g.a(x4.z);
        if (!bool.booleanValue() || bool2.booleanValue()) {
            this.g.N().a(l.longValue()).a(this.g.q0().a("lv_task"), new U(this));
        }
    }

    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sb;
        str = "failed";
        long currentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a(this.b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.g.G().b(a());
            this.g.G().e(a());
            this.g.q0().a((i5) new j5(this.g), d6.b.e);
            this.g.A().b0();
            this.g.l0().c();
            this.g.y().l();
            if (n7.c(this.g)) {
                this.g.a();
            }
            this.g.X0();
            g();
            f();
            this.g.a(true);
            h();
            this.g.f0().b();
            this.g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.g.a(x4.C2)).booleanValue()) {
                this.g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.g.F().maybeTrackAppOpenEvent();
            this.g.z().a();
            if (((Boolean) this.g.a(x4.P2)).booleanValue()) {
                this.g.x0().b();
            }
            if (((Boolean) this.g.a(x4.X0)).booleanValue()) {
                this.g.h().b();
            } else {
                this.g.h().g();
            }
            if (this.g.U().g() || (((Boolean) this.g.a(r3.u7)).booleanValue() && n7.c(this.g) && this.g.G0())) {
                this.g.U().e();
            }
            this.g.e0().i();
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.g.a(false);
                a(th);
                if (((Boolean) this.g.a(x4.i)).booleanValue()) {
                    this.g.f0().a();
                }
                if (((Boolean) this.g.a(x4.h)).booleanValue()) {
                    this.g.T0();
                }
                this.g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.c;
                str2 = this.b;
                sb = new StringBuilder();
                sb.append("AppLovin SDK ");
                sb.append(AppLovinSdk.VERSION);
                sb.append(" initialization ");
                if (this.g.B0()) {
                }
            } catch (Throwable th2) {
                this.g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.c;
                    String str3 = this.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.g.B0() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - currentTimeMillis);
                    sb2.append("ms");
                    oVar2.a(str3, sb2.toString());
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.c;
            str2 = this.b;
            sb = new StringBuilder();
            sb.append("AppLovin SDK ");
            sb.append(AppLovinSdk.VERSION);
            sb.append(" initialization ");
            if (this.g.B0()) {
                str = "succeeded";
            }
            sb.append(str);
            sb.append(" in ");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append("ms");
            oVar.a(str2, sb.toString());
        }
    }

    private /* synthetic */ void e() {
        this.g.S().a(this.g.e().b());
    }

    private void f() {
        if (this.g.S().c()) {
            return;
        }
        Activity u0 = this.g.u0();
        if (u0 != null) {
            this.g.S().a(u0);
            return;
        }
        this.g.D().a(d2.D0, this.b + ":maybeInitializeAdapters()");
        this.g.q0().a(new r6(this.g, true, "initializeAdapters", new T(this)), d6.b.a, TimeUnit.SECONDS.toMillis(1L));
    }
}
