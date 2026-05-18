package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.a;
import java.util.Map;
import s8.S;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class d extends y6.a {
    public static final Parcelable.Creator CREATOR = new S();
    public Bundle a;
    public Map b;
    public c c;

    public static class b {
        public final Bundle a;
        public final Map b;

        public b(String str) {
            Bundle bundle = new Bundle();
            this.a = bundle;
            this.b = new w.a();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public d a() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new d(bundle);
        }

        public b b(String str) {
            this.a.putString("collapse_key", str);
            return this;
        }

        public b c(Map map) {
            this.b.clear();
            this.b.putAll(map);
            return this;
        }

        public b d(String str) {
            this.a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.a.putString("message_type", str);
            return this;
        }

        public b f(int i) {
            this.a.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    public static class c {
        public final String a;
        public final String b;
        public final String[] c;
        public final String d;
        public final String e;
        public final String[] f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final Uri n;
        public final String o;
        public final Integer p;
        public final Integer q;
        public final Integer r;
        public final int[] s;
        public final Long t;
        public final boolean u;
        public final boolean v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final long[] z;

        public /* synthetic */ c(com.google.firebase.messaging.c cVar, a aVar) {
            this(cVar);
        }

        public static String[] j(com.google.firebase.messaging.c cVar, String str) {
            Object[] g = cVar.g(str);
            if (g == null) {
                return null;
            }
            String[] strArr = new String[g.length];
            for (int i = 0; i < g.length; i++) {
                strArr[i] = String.valueOf(g[i]);
            }
            return strArr;
        }

        public String a() {
            return this.d;
        }

        public String[] b() {
            return this.f;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.m;
        }

        public String e() {
            return this.l;
        }

        public String f() {
            return this.k;
        }

        public String g() {
            return this.g;
        }

        public Uri h() {
            String str = this.h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.n;
        }

        public Integer k() {
            return this.r;
        }

        public Integer l() {
            return this.p;
        }

        public String m() {
            return this.i;
        }

        public String n() {
            return this.j;
        }

        public String o() {
            return this.o;
        }

        public String p() {
            return this.a;
        }

        public String[] q() {
            return this.c;
        }

        public String r() {
            return this.b;
        }

        public Integer s() {
            return this.q;
        }

        public c(com.google.firebase.messaging.c cVar) {
            this.a = cVar.p("gcm.n.title");
            this.b = cVar.h("gcm.n.title");
            this.c = j(cVar, "gcm.n.title");
            this.d = cVar.p("gcm.n.body");
            this.e = cVar.h("gcm.n.body");
            this.f = j(cVar, "gcm.n.body");
            this.g = cVar.p("gcm.n.icon");
            this.i = cVar.o();
            this.j = cVar.p("gcm.n.tag");
            this.k = cVar.p("gcm.n.color");
            this.l = cVar.p("gcm.n.click_action");
            this.m = cVar.p("gcm.n.android_channel_id");
            this.n = cVar.f();
            this.h = cVar.p("gcm.n.image");
            this.o = cVar.p("gcm.n.ticker");
            this.p = cVar.b("gcm.n.notification_priority");
            this.q = cVar.b("gcm.n.visibility");
            this.r = cVar.b("gcm.n.notification_count");
            this.u = cVar.a("gcm.n.sticky");
            this.v = cVar.a("gcm.n.local_only");
            this.w = cVar.a("gcm.n.default_sound");
            this.x = cVar.a("gcm.n.default_vibrate_timings");
            this.y = cVar.a("gcm.n.default_light_settings");
            this.t = cVar.j("gcm.n.event_time");
            this.s = cVar.e();
            this.z = cVar.q();
        }
    }

    public d(Bundle bundle) {
        this.a = bundle;
    }

    public String M1() {
        return this.a.getString("collapse_key");
    }

    public Map N1() {
        if (this.b == null) {
            this.b = a.a.a(this.a);
        }
        return this.b;
    }

    public String O1() {
        return this.a.getString("from");
    }

    public String P1() {
        String string = this.a.getString("google.message_id");
        return string == null ? this.a.getString("message_id") : string;
    }

    public final int Q1(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public String R1() {
        return this.a.getString("message_type");
    }

    public c S1() {
        if (this.c == null && com.google.firebase.messaging.c.t(this.a)) {
            this.c = new c(new com.google.firebase.messaging.c(this.a), null);
        }
        return this.c;
    }

    public int T1() {
        String string = this.a.getString("google.original_priority");
        if (string == null) {
            string = this.a.getString("google.priority");
        }
        return Q1(string);
    }

    public long U1() {
        Object obj = this.a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0L;
        }
    }

    public String V1() {
        return this.a.getString("google.to");
    }

    public int W1() {
        Object obj = this.a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public void X1(Intent intent) {
        intent.putExtras(this.a);
    }

    public void writeToParcel(Parcel parcel, int i) {
        S.c(this, parcel, i);
    }
}
