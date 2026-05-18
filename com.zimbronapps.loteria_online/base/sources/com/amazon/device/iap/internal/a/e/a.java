package com.amazon.device.iap.internal.a.e;

import android.app.Activity;
import android.content.Intent;
import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.util.MetricsHelper;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
abstract class a extends h {
    protected static final String b = "purchase_item";
    private static final String f = "a";

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b c;

    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a d;
    protected final String e;

    public class 1 implements com.amazon.a.a.n.a {
        final /* synthetic */ Intent a;

        public 1(Intent intent) {
            this.a = intent;
        }

        public void a() {
            try {
                Activity b = a.this.d.b();
                if (b == null) {
                    b = a.this.d.a();
                }
                com.amazon.device.iap.internal.util.b.a(a.o(), "About to fire intent with activity " + b);
                b.startActivity(this.a);
            } catch (Exception e) {
                MetricsHelper.submitExceptionMetrics(a.a(a.this), a.o() + ".onResult().execute()", e);
                com.amazon.device.iap.internal.util.b.b(a.o(), "Exception when attempting to fire intent: " + e);
            }
        }
    }

    public a(com.amazon.device.iap.internal.a.c cVar, String str, String str2) {
        super(cVar, "purchase_item", str, cVar.d().toString(), "2.10.5.0");
        this.e = str2;
        boolean d = com.amazon.device.iap.internal.d.f().d();
        a("sku", str2);
        a("enablePendingPurchases", Boolean.valueOf(d));
    }

    public static /* synthetic */ String a(a aVar) {
        return aVar.k();
    }

    public static /* synthetic */ String o() {
        return f;
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        Map b2 = jVar.b();
        String str = f;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + b2);
        if (!b2.containsKey("purchaseItemIntent")) {
            com.amazon.device.iap.internal.util.b.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.b.a(str, "found intent");
        this.c.b(com.amazon.a.a.n.b.d.a, new 1((Intent) b2.remove("purchaseItemIntent")));
        return true;
    }
}
