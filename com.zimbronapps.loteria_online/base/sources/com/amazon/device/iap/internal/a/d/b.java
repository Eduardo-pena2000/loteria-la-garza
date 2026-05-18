package com.amazon.device.iap.internal.a.d;

import android.os.RemoteException;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.c;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b extends h {
    private static final String d = "purchase_fulfilled";
    protected final Set b;
    protected final String c;

    public b(c cVar, Set set, String str) {
        super(cVar, "purchase_fulfilled", "2.0", cVar.d().toString(), "2.10.5.0");
        this.b = set;
        this.c = str;
        b(false);
        a("receiptIds", set);
        a("fulfillmentStatus", str);
    }

    public boolean b(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        return true;
    }

    public void l() {
        Object a = j().a().a("notifyListenerResult");
        if (a != null && Boolean.FALSE.equals(a)) {
            a("fulfillmentStatus", com.amazon.device.iap.internal.model.a.b.toString());
        }
        super.l();
    }
}
