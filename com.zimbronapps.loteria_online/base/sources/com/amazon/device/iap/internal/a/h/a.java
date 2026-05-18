package com.amazon.device.iap.internal.a.h;

import android.os.RemoteException;
import com.amazon.a.a.d.b;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends h {
    private static final String b = "submit_metric";
    private static final String c = "metricName";
    private static final String d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, "submit_metric", "1.0", cVar.d().toString(), "2.10.5.0");
        a("metricName", str);
        a("metricAttributes", str2);
        b(false);
    }

    public boolean b(j jVar) throws RemoteException, b {
        return true;
    }
}
