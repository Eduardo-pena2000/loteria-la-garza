package com.amazon.a;

import android.os.RemoteException;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class c extends com.amazon.a.a.n.a.a {
    private static final com.amazon.a.a.o.c b = new com.amazon.a.a.o.c("CheckIfAppisBlockedTask");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.i.e c;

    public void a(j jVar) throws RemoteException, com.amazon.a.a.d.b {
        if (jVar.b() == null || !jVar.b().containsKey("verbose")) {
            return;
        }
        boolean booleanValue = ((Boolean) jVar.b().get("verbose")).booleanValue();
        com.amazon.a.a.o.c.b = booleanValue;
        com.amazon.a.a.o.c.a = booleanValue;
    }

    public String a_() {
        return "check_blocked_status";
    }

    public Map b() {
        return null;
    }

    public String c() {
        return "1.0";
    }

    public boolean d() {
        return true;
    }

    public void a(h hVar) throws RemoteException, com.amazon.a.a.d.b {
        if (m()) {
            n();
        }
        b.c("app is blocked, killing");
        this.c.a((com.amazon.a.a.i.b) new com.amazon.a.a.i.g(new com.amazon.a.a.i.c(hVar.b(), hVar.c(), hVar.d(), hVar.e())));
    }
}
