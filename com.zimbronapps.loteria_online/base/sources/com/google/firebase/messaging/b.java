package com.google.firebase.messaging;

import B7.g;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import s8.I;
import t8.a;
import w5.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {
    public static void A(String str, Bundle bundle) {
        try {
            g.o();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String d = d(bundle);
            if (d != null) {
                bundle2.putString("_nmid", d);
            }
            String e = e(bundle);
            if (e != null) {
                bundle2.putString("_nmn", e);
            }
            String i = i(bundle);
            if (!TextUtils.isEmpty(i)) {
                bundle2.putString("label", i);
            }
            String g = g(bundle);
            if (!TextUtils.isEmpty(g)) {
                bundle2.putString("message_channel", g);
            }
            String r = r(bundle);
            if (r != null) {
                bundle2.putString("_nt", r);
            }
            String l = l(bundle);
            if (l != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(l));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e2);
                }
            }
            String t = t(bundle);
            if (t != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(t));
                } catch (NumberFormatException e3) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e3);
                }
            }
            String n = n(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", n);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            F7.a aVar = (F7.a) g.o().k(F7.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void B(boolean z) {
        g.o().m().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    public static void C(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        F7.a aVar = (F7.a) g.o().k(F7.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        aVar.c("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        aVar.a("fcm", "_cmp", bundle2);
    }

    public static boolean D(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return a();
    }

    public static boolean E(Intent intent) {
        if (intent == null || u(intent)) {
            return false;
        }
        return F(intent.getExtras());
    }

    public static boolean F(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            g.o();
            Context m = g.o().m();
            SharedPreferences sharedPreferences = m.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static t8.a b(a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        a.a j = t8.a.p().n(s(extras)).e(bVar).f(f(extras)).i(o()).l(a.d.c).h(m(extras)).j(k(extras));
        String h = h(extras);
        if (h != null) {
            j.g(h);
        }
        String r = r(extras);
        if (r != null) {
            j.m(r);
        }
        String c = c(extras);
        if (c != null) {
            j.c(c);
        }
        String i = i(extras);
        if (i != null) {
            j.b(i);
        }
        String e = e(extras);
        if (e != null) {
            j.d(e);
        }
        long q = q(extras);
        if (q > 0) {
            j.k(q);
        }
        return j.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(m8.g.q(g.o()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static int j(String str) {
        if ("high".equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    public static int k(Bundle bundle) {
        int p = p(bundle);
        if (p == 2) {
            return 5;
        }
        return p == 1 ? 10 : 0;
    }

    public static String l(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static a.c m(Bundle bundle) {
        return (bundle == null || !c.t(bundle)) ? a.c.c : a.c.e;
    }

    public static String n(Bundle bundle) {
        return (bundle == null || !c.t(bundle)) ? "data" : "display";
    }

    public static String o() {
        return g.o().m().getPackageName();
    }

    public static int p(Bundle bundle) {
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if ("1".equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString("google.priority");
        }
        return j(string);
    }

    public static long q(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        g o = g.o();
        String f = o.r().f();
        if (f != null) {
            try {
                return Long.parseLong(f);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String c = o.r().c();
        if (c.startsWith("1:")) {
            String[] split = c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            try {
                return Long.parseLong(c);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    public static String r(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int s(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
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

    public static String t(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean u(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void v(Intent intent) {
        A("_nd", intent.getExtras());
    }

    public static void w(Intent intent) {
        A("_nf", intent.getExtras());
    }

    public static void x(Bundle bundle) {
        C(bundle);
        A("_no", bundle);
    }

    public static void y(Intent intent) {
        if (E(intent)) {
            A("_nr", intent.getExtras());
        }
        if (D(intent)) {
            z(a.b.c, intent, FirebaseMessaging.w());
        }
    }

    public static void z(a.b bVar, Intent intent, j jVar) {
        if (jVar == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        t8.a b = b(bVar, intent);
        if (b == null) {
            return;
        }
        try {
            jVar.a("FCM_CLIENT_EVENT_LOGGING", t8.b.class, w5.c.b("proto"), new I()).b(w5.d.g(t8.b.b().b(b).a(), w5.g.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }
}
