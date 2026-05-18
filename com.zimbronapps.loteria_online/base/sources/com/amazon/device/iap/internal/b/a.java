package com.amazon.device.iap.internal.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.a.a.o.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    private static a a = new a();
    private static final String b = a.class.getSimpleName();
    private static final String c = a.class.getName() + "_PREFS_";

    public static a a() {
        return a;
    }

    public void a(String str, String str2, String str3) {
        com.amazon.device.iap.internal.util.b.a(b, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
        try {
            f.a(str, "userId");
            f.a(str2, "receiptId");
            f.a(str3, "sku");
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            f.a(b2, "context");
            SharedPreferences.Editor edit = b2.getSharedPreferences(c + str, 0).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(b, "error in saving v1 Entitlement:" + str2 + "/" + str3 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(b, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + "/" + str3 + "], user [" + str + "]");
    }

    public String a(String str, String str2) {
        com.amazon.device.iap.internal.util.b.a(b, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + "]");
        String str3 = null;
        try {
            f.a(str, "userId");
            f.a(str2, "sku");
            Context b2 = com.amazon.device.iap.internal.d.f().b();
            f.a(b2, "context");
            str3 = b2.getSharedPreferences(c + str, 0).getString(str2, (String) null);
        } catch (Throwable th) {
            com.amazon.device.iap.internal.util.b.a(b, "error in saving v1 Entitlement:" + str2 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.b.a(b, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + "]");
        return str3;
    }
}
