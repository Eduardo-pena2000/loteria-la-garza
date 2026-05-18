package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import android.util.Log;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import w8.s;
import w8.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public static final Date f = new Date(-1);
    public static final Date g = new Date(-1);
    public final SharedPreferences a;
    public final Object b = new Object();
    public final Object c = new Object();
    public final Object d = new Object();
    public final Object e = new Object();

    public static class a {
        public int a;
        public Date b;

        public a(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class b {
        public int a;
        public Date b;

        public b(int i, Date date) {
            this.a = i;
            this.b = date;
        }

        public Date a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public e(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public a a() {
        a aVar;
        synchronized (this.c) {
            aVar = new a(this.a.getInt("num_failed_fetches", 0), new Date(this.a.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public Map b() {
        try {
            JSONObject jSONObject = new JSONObject(this.a.getString("customSignals", "{}"));
            HashMap hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.optString(str));
            }
            return hashMap;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    public long c() {
        return this.a.getLong("fetch_timeout_in_seconds", 60L);
    }

    public s d() {
        f a2;
        synchronized (this.b) {
            long j = this.a.getLong("last_fetch_time_in_millis", -1L);
            int i = this.a.getInt("last_fetch_status", 0);
            a2 = f.d().c(i).d(j).b(new u.b().d(this.a.getLong("fetch_timeout_in_seconds", 60L)).e(this.a.getLong("minimum_fetch_interval_in_seconds", c.j)).c()).a();
        }
        return a2;
    }

    public String e() {
        return this.a.getString("last_fetch_etag", (String) null);
    }

    public Date f() {
        return new Date(this.a.getLong("last_fetch_time_in_millis", -1L));
    }

    public long g() {
        return this.a.getLong("last_template_version", 0L);
    }

    public long h() {
        return this.a.getLong("minimum_fetch_interval_in_seconds", c.j);
    }

    public b i() {
        b bVar;
        synchronized (this.d) {
            bVar = new b(this.a.getInt("num_failed_realtime_streams", 0), new Date(this.a.getLong("realtime_backoff_end_time_in_millis", -1L)));
        }
        return bVar;
    }

    public void j() {
        l(0, g);
    }

    public void k() {
        r(0, g);
    }

    public void l(int i, Date date) {
        synchronized (this.c) {
            this.a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void m(u uVar) {
        synchronized (this.b) {
            this.a.edit().putLong("fetch_timeout_in_seconds", uVar.a()).putLong("minimum_fetch_interval_in_seconds", uVar.b()).commit();
        }
    }

    public void n(Map map) {
        synchronized (this.e) {
            try {
                Map b2 = b();
                boolean z = false;
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str.length() <= 250 && (str2 == null || str2.length() <= 500)) {
                        boolean z2 = true;
                        if (str2 != null) {
                            z |= !Objects.equals(b2.put(str, str2), str2);
                        } else {
                            if (b2.remove(str) == null) {
                                z2 = false;
                            }
                            z |= z2;
                        }
                    }
                    Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", new Object[]{250, 500}));
                    return;
                }
                if (z) {
                    if (b2.size() > 100) {
                        Log.w("FirebaseRemoteConfig", String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", new Object[]{100}));
                        return;
                    }
                    this.a.edit().putString("customSignals", new JSONObject(b2).toString()).commit();
                    Log.d("FirebaseRemoteConfig", "Keys of updated custom signals: " + b().keySet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(String str) {
        synchronized (this.b) {
            this.a.edit().putString("last_fetch_etag", str).apply();
        }
    }

    public void p(long j) {
        synchronized (this.b) {
            this.a.edit().putLong("last_template_version", j).apply();
        }
    }

    public void q(Date date) {
        synchronized (this.d) {
            this.a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void r(int i, Date date) {
        synchronized (this.d) {
            this.a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public void s() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    public void t(Date date) {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    public void u() {
        synchronized (this.b) {
            this.a.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
