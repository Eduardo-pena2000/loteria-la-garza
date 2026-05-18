package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.a7;
import com.applovin.impl.b0;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class o3 extends s2 implements AppLovinCommunicatorSubscriber, b0.a {
    private List A;
    private List B;
    private List C;
    private com.applovin.impl.sdk.k e;
    private List f;
    private List g;
    private List h;
    private List i;
    private String j;
    private String k;
    private String l;
    private boolean m;
    private final StringBuilder n;
    private final AtomicBoolean o;
    private boolean p;
    private List q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b0.b.values().length];
            a = iArr;
            try {
                iArr[b0.b.APP_DETAILS_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b0.b.INVALID_DEVELOPER_URI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b0.b.APPADSTXT_NOT_FOUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b0.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b0.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    public enum c {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum d {
        CMP,
        NETWORK_CONSENT_STATUSES,
        DO_NOT_SELL,
        COUNT
    }

    public enum e {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public o3(Context context) {
        super(context);
        this.n = new StringBuilder("");
        this.o = new AtomicBoolean();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.C = new ArrayList();
    }

    private List g() {
        boolean c2 = this.e.s0().c();
        List b2 = this.e.s0().b();
        return c2 ? a((String) null, a(b2, false)) : a(a(b2, true), (String) null);
    }

    private List j() {
        ArrayList arrayList = new ArrayList(7);
        PackageInfo a2 = n7.a(this.a, 0);
        String str = a2 != null ? a2.versionName : null;
        arrayList.add(r2.a().d("Package Name").c(this.a.getPackageName()).a());
        r2.b d2 = r2.a().d("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(r2.a().d("OS").c(n7.d()).a());
        arrayList.add(r2.a().d("Account").c(StringUtils.isValidString(this.l) ? this.l : "None").a());
        arrayList.add(r2.a().d("Mediation Provider").c(StringUtils.isValidString(this.e.V()) ? this.e.V() : "None").a());
        arrayList.add(r2.a().d("OM SDK Version").c(this.e.e0().c()).a());
        arrayList.add(a(com.applovin.impl.sdk.k.F0()));
        return arrayList;
    }

    private r2 l() {
        String d2 = this.e.r0().d();
        boolean isValidString = StringUtils.isValidString(d2);
        boolean isValidString2 = StringUtils.isValidString(this.e.r0().j());
        r2.b d3 = r2.a(r2.c.e).d("CMP (Consent Management Platform)");
        if (!isValidString) {
            d2 = isValidString2 ? "Unknown" : "None";
        }
        r2.b c2 = d3.c(d2);
        if (this.m) {
            c2.a(true);
            if (isValidString2) {
                c2.a(this.a);
            } else {
                c2.b("TC Data Not Found");
                c2.a("By January 16, 2024, if you use Google AdMob or Google Ad Manager, you must also use a Google-certified CMP. Test your app in EEA and UK regions to ensure that this warning doesn't appear in those regions.\n\nFor more details, see:\nhttps://support.google.com/admob/answer/13554116");
                boolean z = this.e.v().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
                c2.a(z ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning);
                c2.b(m0.a(z ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.a));
            }
        }
        return c2.a();
    }

    private r2 m() {
        return r2.a().d("MAX Terms and Privacy Policy Flow").a(this.a).a(true).a();
    }

    private r2 n() {
        boolean hasSupportedCmp = this.e.s().hasSupportedCmp();
        return r2.a().d("Google UMP SDK").a(hasSupportedCmp ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(hasSupportedCmp ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.a)).b("Google UMP SDK").a("In order to use MAX Terms and Privacy Policy Flow, you must add the Google User Messaging Platform SDK as a dependency.\n\nFor more details, see:\nhttps://support.axon.ai/en/max/android/overview/terms-and-privacy-policy-flow").a(!hasSupportedCmp).a();
    }

    private List q() {
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(r2.a().d("SDK Version").c(AppLovinSdk.VERSION).a());
        String str = (String) this.e.a(x4.L3);
        r2.b d2 = r2.a().d("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(d2.c(str).a());
        arrayList.add(e());
        if (this.e.H0()) {
            String a2 = n7.a(this.e.n0());
            arrayList.add(b("Unity Version", StringUtils.isValidString(a2) ? a2 : "None"));
        }
        if (this.e.x().j()) {
            arrayList.add(m());
            arrayList.add(n());
        } else if (this.e.x().l()) {
            arrayList.add(u());
        }
        return arrayList;
    }

    private r2 r() {
        return r2.a().d("Network Consent Statuses").a(this.a).a(true).a();
    }

    private List s() {
        ArrayList arrayList = new ArrayList(d.COUNT.ordinal());
        arrayList.add(l());
        if (StringUtils.isValidString(this.e.r0().j())) {
            arrayList.add(r());
        } else {
            arrayList.add(new r4(p0.b(), false, this.a));
        }
        arrayList.add(new r4(p0.a(), true, this.a));
        return arrayList;
    }

    private r2 u() {
        return r2.a().d("Terms Flow").a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.a)).b("Terms Flow has been replaced").a(this.e.x().g()).a(true).a();
    }

    private void z() {
        StringBuilder sb = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb.append("\n========== APP INFO ==========");
        sb.append("\nDev Build - " + n7.c(this.e));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nTest Mode - ");
        sb2.append(this.e.s0().c() ? "enabled" : "disabled");
        sb.append(sb2.toString());
        sb.append("\nTarget SDK - " + this.e.A().G().get("target_sdk"));
        sb.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.e.a(x4.L3);
        String b2 = j.b();
        sb.append("\nSDK Version - " + str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb3.append(str2);
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(b2)) {
            b2 = "Disabled";
        }
        sb4.append(b2);
        sb.append(sb4.toString());
        if (this.e.H0()) {
            String a2 = n7.a(this.e.n0());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("\nUnity Version - ");
            sb5.append(StringUtils.isValidString(a2) ? a2 : "None");
            sb.append(sb5.toString());
        }
        sb.append("\n========== PRIVACY ==========");
        sb.append(p0.a(this.a));
        sb.append(this.e.x().e());
        sb.append("\n========== CMP (CONSENT MANAGEMENT PLATFORM) ==========");
        sb.append(this.e.r0().i());
        sb.append("\n========== NETWORK CONSENT STATUSES ==========");
        Iterator it = d().iterator();
        while (it.hasNext()) {
            sb.append(((a7) it.next()).e());
        }
        sb.append("\n========== NETWORKS ==========");
        Iterator it2 = this.r.iterator();
        while (it2.hasNext()) {
            a(sb, ((e3) it2.next()).j());
        }
        Iterator it3 = this.q.iterator();
        while (it3.hasNext()) {
            a(sb, ((e3) it3.next()).j());
        }
        sb.append("\n========== AD UNITS ==========");
        Iterator it4 = this.g.iterator();
        while (it4.hasNext()) {
            a(sb, ((n) it4.next()).e());
        }
        sb.append("\n========== END ==========");
        com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb.toString());
        this.n.append(sb.toString());
    }

    public boolean a(r2 r2Var) {
        if (r2Var.k() == null) {
            return false;
        }
        return "MAX Terms and Privacy Policy Flow".equals(r2Var.k().toString());
    }

    public void b(boolean z) {
        this.p = z;
    }

    public List c(int i) {
        return i == e.APP_INFO.ordinal() ? this.w : i == e.MAX.ordinal() ? this.x : i == e.PRIVACY.ordinal() ? this.y : i == e.ADS.ordinal() ? this.z : i == e.INCOMPLETE_NETWORKS.ordinal() ? this.A : i == e.COMPLETED_NETWORKS.ordinal() ? this.B : this.C;
    }

    public List d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            arrayList.add(((e3) it.next()).t());
        }
        String k = this.e.r0().k();
        if (k != null) {
            String c2 = this.e.r0().c();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a7 a7Var = (a7) it2.next();
                if (a7Var.f() == a7.a.TCF_VENDOR && a7Var.d() != null) {
                    a7Var.a(Boolean.valueOf(c7.a(k, a7Var.d().intValue() - 1)));
                } else if (a7Var.f() == a7.a.ATP_NETWORK && a7Var.d() != null) {
                    a7Var.a(c7.a(a7Var.d().intValue(), c2));
                }
            }
        } else {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((a7) it3.next()).a(null);
            }
        }
        return arrayList;
    }

    public r2 e(int i) {
        return i == e.APP_INFO.ordinal() ? new v4("APP INFO") : i == e.MAX.ordinal() ? new v4("MAX") : i == e.PRIVACY.ordinal() ? new v4("PRIVACY") : i == e.ADS.ordinal() ? new v4("ADS") : i == e.INCOMPLETE_NETWORKS.ordinal() ? new v4("INCOMPLETE SDK INTEGRATIONS") : i == e.COMPLETED_NETWORKS.ordinal() ? new v4("COMPLETED SDK INTEGRATIONS") : new v4("MISSING SDK INTEGRATIONS");
    }

    public List f() {
        return this.g;
    }

    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.j;
    }

    public List k() {
        return this.t;
    }

    public List o() {
        return this.h;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.y = s();
            c();
            return;
        }
        if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.A = a(this.q);
            this.B = a(this.r);
            c();
        } else if ("live_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = a(a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("live_networks"), true), (String) null);
            c();
        } else if ("test_mode_networks_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.z = a((String) null, a((List) appLovinCommunicatorMessage.getMessageData().getStringArrayList("test_mode_networks"), false));
            c();
        }
    }

    public String p() {
        return this.n.toString();
    }

    public com.applovin.impl.sdk.k t() {
        return this.e;
    }

    public String toString() {
        return "MediationDebuggerListAdapter{isInitialized=" + this.o.get() + "}";
    }

    public List v() {
        return this.v;
    }

    public List w() {
        return this.u;
    }

    public boolean x() {
        return this.p;
    }

    public boolean y() {
        return this.o.get();
    }

    public int b() {
        return e.COUNT.ordinal();
    }

    private void b(List list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o f = ((n) it.next()).f();
            Iterator it2 = f.a().iterator();
            while (it2.hasNext()) {
                hashSet.add(((i8) it2.next()).b());
            }
            Iterator it3 = f.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(((i8) it3.next()).b());
            }
        }
        this.t = new ArrayList(hashSet);
        this.u = new ArrayList(hashSet2);
        Collections.sort(this.t);
        Collections.sort(this.u);
    }

    public void a(List list, List list2, List list3, List list4, String str, String str2, String str3, boolean z, com.applovin.impl.sdk.k kVar) {
        this.e = kVar;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = z;
        if (list != null && this.o.compareAndSet(false, true)) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("MediationDebuggerListAdapter", "Populating networks...");
            }
            c(list);
            b(list2);
            d(this.r);
            this.w.addAll(j());
            this.x.addAll(q());
            this.y.addAll(s());
            this.z.addAll(g());
            this.A = a(this.q);
            this.B = a(this.r);
            this.C = a(this.s);
            List arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_networks_updated");
            arrayList.add("test_mode_networks_updated");
            AppLovinCommunicator.getInstance(this.a).subscribe(this, arrayList);
            z();
        }
        AppLovinSdkUtils.runOnUiThread(new O3(this));
    }

    public int d(int i) {
        if (i == e.APP_INFO.ordinal()) {
            return this.w.size();
        }
        if (i == e.MAX.ordinal()) {
            return this.x.size();
        }
        if (i == e.PRIVACY.ordinal()) {
            return this.y.size();
        }
        if (i == e.ADS.ordinal()) {
            return this.z.size();
        }
        if (i == e.INCOMPLETE_NETWORKS.ordinal()) {
            return this.A.size();
        }
        if (i == e.COMPLETED_NETWORKS.ordinal()) {
            return this.B.size();
        }
        return this.C.size();
    }

    private void c(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (!e3Var.G()) {
                if (e3Var.q() != e3.a.INCOMPLETE_INTEGRATION && e3Var.q() != e3.a.INVALID_INTEGRATION) {
                    if (e3Var.q() == e3.a.COMPLETE) {
                        this.r.add(e3Var);
                    } else if (e3Var.q() == e3.a.MISSING) {
                        this.s.add(e3Var);
                    }
                } else {
                    this.q.add(e3Var);
                }
            }
        }
    }

    private r2 e() {
        String str;
        r2.b d2 = r2.a().d("Ad Review Version");
        String b2 = j.b();
        if (StringUtils.isValidString(b2)) {
            String a2 = j.a();
            if (!StringUtils.isValidString(a2) || a2.equals(this.e.i0())) {
                str = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("MAX Ad Review integrated with wrong SDK key. Please check that your ");
                sb.append(this.e.H0() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated");
                sb.append(" from the correct account.");
                str = sb.toString();
            }
        } else {
            str = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        }
        if (str != null) {
            d2.b("MAX Ad Review").a(str).a(R.drawable.applovin_ic_x_mark).b(m0.a(R.color.applovin_sdk_xmarkColor, this.a)).a(true);
        } else {
            d2.c(b2);
        }
        return d2.a();
    }

    private r2 b(String str, String str2) {
        r2.b d2 = r2.a().d(str);
        if (StringUtils.isValidString(str2)) {
            d2.c(str2);
        } else {
            d2.a(R.drawable.applovin_ic_x_mark);
            d2.b(m0.a(R.color.applovin_sdk_xmarkColor, this.a));
        }
        return d2.a();
    }

    private r2 b(String str) {
        r2.b a2 = r2.a();
        if (this.e.s0().c()) {
            a2.a(this.a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Test Mode Network");
        r2.b d2 = a2.d(sb.toString());
        if (!this.e.s0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private void d(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e3 e3Var = (e3) it.next();
            if (e3Var.y() == e3.b.READY) {
                this.v.add(e3Var);
            }
        }
    }

    public void a(z zVar, String str) {
        String a2;
        c a3;
        c cVar;
        String str2;
        List<a0> a4 = b0.a(zVar, this.i);
        if (a4.isEmpty()) {
            str2 = "All required entries found at " + str + ".";
            cVar = c.SUCCESS;
        } else {
            a0 a0Var = null;
            for (a0 a0Var2 : a4) {
                this.e.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.e.O().b("MediationDebuggerListAdapter", str + " is missing a required entry: " + a0Var2.d());
                }
                if (a0Var2.g()) {
                    a0Var = a0Var2;
                }
            }
            if (a0Var != null) {
                b0.b bVar = b0.b.MISSING_APPLOVIN_ENTRIES;
                a2 = a(bVar, str, a0Var.d());
                a3 = a(bVar);
            } else {
                b0.b bVar2 = b0.b.MISSING_NON_APPLOVIN_ENTRIES;
                a2 = a(bVar2, str, null);
                a3 = a(bVar2);
            }
            String str3 = a2;
            cVar = a3;
            str2 = str3;
        }
        this.x.add(a(str2, cVar));
        c();
    }

    public void a(b0.b bVar, String str) {
        if (bVar == b0.b.APP_DETAILS_NOT_FOUND) {
            this.e.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.e.O().a("MediationDebuggerListAdapter", "Could not retrieve app details for this package name; app-ads.txt row will not show on the mediation debugger.");
                return;
            }
            return;
        }
        this.x.add(a(a(bVar, str, null), a(bVar)));
        c();
    }

    private void a(StringBuilder sb, String str) {
        String sb2 = sb.toString();
        if (sb2.length() + str.length() >= ((Integer) this.e.a(x4.r)).intValue()) {
            com.applovin.impl.sdk.o.g("MediationDebuggerListAdapter", sb2);
            this.n.append(sb2);
            sb.setLength(1);
        }
        sb.append(str);
    }

    private List a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(r2.a().d("View Ad Units (" + this.g.size() + ")").a(this.a).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.h.isEmpty()) {
            arrayList.add(r2.a().d("Selective Init Ad Units (" + this.h.size() + ")").a(this.a).a(true).a());
        }
        arrayList.add(r2.a().d("Test Mode Enabled").c(String.valueOf(this.e.s0().c())).a());
        return arrayList;
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z3((e3) it.next(), this.a));
        }
        return arrayList;
    }

    private r2 a(String str) {
        r2.b a2 = r2.a();
        if (!this.e.s0().c()) {
            a2.a(this.a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb.append("Live Network");
        r2.b d2 = a2.d(sb.toString());
        if (this.e.s0().c()) {
            str = "Enable";
        }
        return d2.c(str).c(-16776961).a("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private r2 a(boolean z) {
        return r2.a().d("Java 8").a(z ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).b(m0.a(z ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.a)).b("Upgrade to Java 8").a("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://support.axon.ai/en/max/android/overview/integration").a(!z).a();
    }

    private r2 a(String str, c cVar) {
        int i;
        int a2;
        if (cVar == c.SUCCESS) {
            i = R.drawable.applovin_ic_check_mark_bordered;
            a2 = m0.a(R.color.applovin_sdk_checkmarkColor, this.a);
        } else if (cVar == c.WARNING) {
            i = R.drawable.applovin_ic_warning;
            a2 = m0.a(R.color.applovin_sdk_warningColor, this.a);
        } else {
            i = R.drawable.applovin_ic_x_mark;
            a2 = m0.a(R.color.applovin_sdk_xmarkColor, this.a);
        }
        return r2.a().d("app-ads.txt").a(i).b(a2).b("app-ads.txt").a(str).a(true).a();
    }

    private String a(b0.b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i = a.a[bVar.ordinal()];
        if (i == 1) {
            return "Could not retrieve app details from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i == 2) {
            return "Unable to find a valid developer URL from the Play Store listing.";
        }
        if (i == 3) {
            return "Unable to find app-ads.txt file or parse entries of the file at " + str + ".\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        if (i != 4) {
            if (i != 5) {
                return "";
            }
            return "Text file at " + str + " is missing some of the suggested lines.\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
        }
        return "Text file at " + str + " is missing the required AppLovin line:\n\n" + str2 + "\n\nFor more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt";
    }

    private c a(b0.b bVar) {
        int i = a.a[bVar.ordinal()];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            return c.ERROR;
        }
        if (i != 5) {
            return c.ERROR;
        }
        return c.WARNING;
    }

    private String a(List list, boolean z) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (z) {
            for (u2 u2Var : this.t) {
                if (list.equals(u2Var.b())) {
                    return u2Var.a();
                }
            }
            for (u2 u2Var2 : this.u) {
                if (list.equals(u2Var2.b())) {
                    return u2Var2.a();
                }
            }
        } else {
            for (e3 e3Var : this.v) {
                if (list.equals(e3Var.u())) {
                    return e3Var.g();
                }
            }
        }
        return H3.a(",", list);
    }
}
