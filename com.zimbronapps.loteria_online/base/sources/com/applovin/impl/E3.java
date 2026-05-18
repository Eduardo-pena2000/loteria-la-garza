package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final a7 G;
    private final boolean H;
    private final String I;
    private final Map J;
    private final com.applovin.impl.sdk.k a;
    private final a b;
    private int c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private String r;
    private String s;
    private final String t;
    private final String u;
    private final String v;
    private final String w;
    private final int x;
    private final List y;
    private final List z;

    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");

        private final String a;

        a(String str) {
            this.a = str;
        }

        private String b() {
            return this.a;
        }

        public static /* synthetic */ String a(a aVar) {
            return aVar.b();
        }
    }

    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");

        private final String a;
        private final int b;
        private final String c;

        b(String str, int i2, String str2) {
            this.a = str;
            this.b = i2;
            this.c = str2;
        }

        public String b() {
            return this.c;
        }

        public String c() {
            return this.a;
        }

        public int d() {
            return this.b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e3(org.json.JSONObject r20, com.applovin.impl.sdk.k r21) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.e3.<init>(org.json.JSONObject, com.applovin.impl.sdk.k):void");
    }

    private a a() {
        a aVar = this.d ? this.e ? a.COMPLETE : this.g ? a.MISSING : a.INCOMPLETE_INTEGRATION : this.e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        if (aVar == a.MISSING) {
            return aVar;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            if (!((p4) it.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        Iterator it2 = this.A.iterator();
        while (it2.hasNext()) {
            if (!((k1) it2.next()).c()) {
                return a.INVALID_INTEGRATION;
            }
        }
        return (!this.o || com.applovin.impl.sdk.k.F0()) ? E() ? a.INCOMPLETE_INTEGRATION : aVar : a.INVALID_INTEGRATION;
    }

    public boolean A() {
        return this.f;
    }

    public boolean B() {
        return this.h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.o;
    }

    public boolean E() {
        if (!this.n || !StringUtils.isValidString(this.s)) {
            return false;
        }
        return !n7.d(this.s).equals(n7.a(this.t, this.s.split("\\.").length));
    }

    public boolean F() {
        return this.d;
    }

    public boolean G() {
        return this.b == a.MISSING && this.k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.l;
    }

    public boolean J() {
        return this.m;
    }

    public String b() {
        return this.r;
    }

    public String c() {
        return this.t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.q;
    }

    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.x;
    }

    public int i() {
        return this.c;
    }

    public final String j() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- ");
        sb.append(this.p);
        sb.append(" ----------");
        sb.append("\nStatus  - ");
        sb.append(a.a(this.b));
        sb.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb.append((!this.d || TextUtils.isEmpty(this.s)) ? "UNAVAILABLE" : this.s);
        sb.append("\nAdapter - ");
        if (this.e && !TextUtils.isEmpty(this.t)) {
            str = this.t;
        }
        sb.append(str);
        for (p4 p4Var : n()) {
            if (!p4Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(p4Var.b());
                sb.append(": ");
                sb.append(p4Var.a());
            }
        }
        for (k1 k1Var : f()) {
            if (!k1Var.c()) {
                sb.append("\n* MISSING ");
                sb.append(k1Var.b());
                sb.append(": ");
                sb.append(k1Var.a());
            }
        }
        return sb.toString();
    }

    public String k() {
        return this.u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.p;
    }

    public List n() {
        return this.z;
    }

    public final com.applovin.impl.sdk.k o() {
        return this.a;
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.r.equals(string)) {
            this.c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter a2 = w3.a(string, this.a);
            if (a2 != null) {
                String a3 = w3.a(a2);
                if (this.s.equals(a3)) {
                    return;
                }
                this.s = a3;
                this.a.t().a(this.s, string);
            }
        }
    }

    public String p() {
        return this.s;
    }

    public a q() {
        return this.b;
    }

    public List r() {
        return this.y;
    }

    public List s() {
        return this.B;
    }

    public a7 t() {
        return this.G;
    }

    public String toString() {
        return "MediatedNetwork{name=" + this.p + ", displayName=" + this.q + ", sdkAvailable=" + this.d + ", sdkVersion=" + this.s + ", adapterAvailable=" + this.e + ", adapterVersion=" + this.t + "}";
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.v;
    }

    public String w() {
        return this.w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.b;
        return (aVar == a.COMPLETE || (aVar == a.INCOMPLETE_INTEGRATION && F() && z())) ? !this.a.s0().c() ? b.DISABLED : (this.j && (this.c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY : b.INVALID_INTEGRATION;
    }

    public boolean z() {
        return this.e;
    }

    private List a(MaxAdapter maxAdapter, boolean z) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        ArrayList arrayList = new ArrayList();
        if (this.r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            p4 p4Var = new p4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.k.o());
            if (p4Var.c()) {
                arrayList.add(p4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            try {
                String str = (String) keys.next();
                arrayList.add(new p4(str, jSONObject2.getString(str), com.applovin.impl.sdk.k.o()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.k kVar) {
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "dependencies", new JSONArray());
        JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "dependencies_v2", new JSONArray());
        ArrayList arrayList = new ArrayList(jSONArray.length() + jSONArray2.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new k1(jSONObject2, kVar));
            }
        }
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray2, i2, (JSONObject) null);
            if (jSONObject3 != null && k1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new k1(jSONObject3, kVar));
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(e3 e3Var) {
        return this.q.compareToIgnoreCase(e3Var.q);
    }
}
