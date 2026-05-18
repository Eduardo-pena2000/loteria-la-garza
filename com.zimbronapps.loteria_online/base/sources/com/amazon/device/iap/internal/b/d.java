package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.amazon.a.a.o.f;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    private static final String a = "d";
    private static final String d = "LAST_CLEANING_TIME";
    private static final String b = d.class.getName() + "_PREFS";
    private static final String c = d.class.getName() + "_CLEANER_PREFS";
    private static int e = 604800000;
    private static final d f = new d();

    public class 1 implements Runnable {
        final /* synthetic */ Context a;

        public 1(Context context) {
            this.a = context;
        }

        public void run() {
            try {
                com.amazon.device.iap.internal.util.b.a(d.b(), "perform house keeping! ");
                SharedPreferences sharedPreferences = this.a.getSharedPreferences(d.c(), 0);
                for (String str : sharedPreferences.getAll().keySet()) {
                    try {
                        if (System.currentTimeMillis() - c.a(sharedPreferences.getString(str, (String) null)).d() > d.d()) {
                            com.amazon.device.iap.internal.util.b.a(d.b(), "house keeping - try remove Receipt:" + str + " since it's too old");
                            d.this.a(str);
                        }
                    } catch (b unused) {
                        com.amazon.device.iap.internal.util.b.a(d.b(), "house keeping - try remove Receipt:" + str + " since it's invalid ");
                        d.this.a(str);
                    }
                }
            } catch (Throwable th) {
                com.amazon.device.iap.internal.util.b.a(d.b(), "Error in running cleaning job:" + th);
            }
        }
    }

    public static /* synthetic */ String b() {
        return a;
    }

    public static /* synthetic */ String c() {
        return b;
    }

    public static /* synthetic */ int d() {
        return e;
    }

    private void e() {
        com.amazon.device.iap.internal.util.b.a(a, "enter old receipts cleanup! ");
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        a(System.currentTimeMillis());
        new Handler().post(new 1(b2));
    }

    private long f() {
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        long currentTimeMillis = System.currentTimeMillis();
        long j = b2.getSharedPreferences(c, 0).getLong("LAST_CLEANING_TIME", 0L);
        if (j != 0) {
            return j;
        }
        a(currentTimeMillis);
        return currentTimeMillis;
    }

    public void a(String str, String str2, String str3, String str4) {
        com.amazon.device.iap.internal.util.b.a(a, "enter saveReceipt for receipt [" + str4 + "]");
        try {
            f.a(str2, "userId");
            f.a(str3, "receiptId");
            f.a(str4, "receiptString");
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            f.a(b2, "context");
            c cVar = new c(str2, str4, str, System.currentTimeMillis());
            SharedPreferences.Editor edit = b2.getSharedPreferences(b, 0).edit();
            edit.putString(str3, cVar.e());
            edit.commit();
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(a, "error in saving pending receipt:" + str + "/" + str4 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(a, "leaving saveReceipt for receipt id [" + str3 + "]");
    }

    public Set b(String str) {
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        String str2 = a;
        com.amazon.device.iap.internal.util.b.a(str2, "enter getLocalReceipts for user[" + str + "]");
        HashSet hashSet = new HashSet();
        if (f.a(str)) {
            com.amazon.device.iap.internal.util.b.b(str2, "empty UserId: " + str);
            throw new RuntimeException("Invalid UserId:" + str);
        }
        Map all = b2.getSharedPreferences(b, 0).getAll();
        for (String str3 : all.keySet()) {
            String str4 = (String) all.get(str3);
            try {
                c a2 = c.a(str4);
                hashSet.add(com.amazon.device.iap.internal.util.c.a(new JSONObject(a2.c()), str, a2.b()));
            } catch (JSONException unused) {
                a(str3);
                com.amazon.device.iap.internal.util.b.b(a, "failed to convert string to JSON object:[" + str4 + "]");
            } catch (com.amazon.device.iap.internal.a.f unused2) {
                a(str3);
                com.amazon.device.iap.internal.util.b.b(a, "failed to verify signature:[" + str4 + "]");
            } catch (Throwable unused3) {
                com.amazon.device.iap.internal.util.b.b(a, "failed to load the receipt from SharedPreference:[" + str4 + "]");
            }
        }
        com.amazon.device.iap.internal.util.b.a(a, "leaving getLocalReceipts for user[" + str + "], " + hashSet.size() + " local receipts found.");
        if (System.currentTimeMillis() - f() > e) {
            e();
        }
        return hashSet;
    }

    public String c(String str) {
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        if (!f.a(str)) {
            String string = b2.getSharedPreferences(b, 0).getString(str, (String) null);
            if (string != null) {
                try {
                    return c.a(string).b();
                } catch (b unused) {
                }
            }
            return null;
        }
        com.amazon.device.iap.internal.util.b.b(a, "empty receiptId: " + str);
        throw new RuntimeException("Invalid ReceiptId:" + str);
    }

    public void a(String str) {
        String str2 = a;
        com.amazon.device.iap.internal.util.b.a(str2, "enter removeReceipt for receipt[" + str + "]");
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        SharedPreferences.Editor edit = b2.getSharedPreferences(b, 0).edit();
        edit.remove(str);
        edit.commit();
        com.amazon.device.iap.internal.util.b.a(str2, "leave removeReceipt for receipt[" + str + "]");
    }

    private void a(long j) {
        Context b2 = com.amazon.device.iap.internal.d.f().b();
        f.a(b2, "context");
        SharedPreferences.Editor edit = b2.getSharedPreferences(c, 0).edit();
        edit.putLong("LAST_CLEANING_TIME", j);
        edit.commit();
    }

    public static d a() {
        return f;
    }
}
