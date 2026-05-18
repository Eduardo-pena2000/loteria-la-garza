package com.amazon.a.a.h.a;

import android.os.RemoteException;
import com.amazon.a.a.h.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends com.amazon.a.a.n.a.a {
    private static final c b = new c("SubmitMetricsTask");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.h.c c;
    private b d;

    public void a(h hVar) throws RemoteException, com.amazon.a.a.d.b {
    }

    public String a_() {
        return "submit_metrics";
    }

    public Map b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(this.d.c());
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.amazon.a.a.h.a) it.next()).a());
        }
        hashMap.put("metrics", arrayList);
        return hashMap;
    }

    public String c() {
        return "1.0";
    }

    public boolean d() {
        return !this.d.a();
    }

    public void e() throws com.amazon.a.a.d.b {
        this.d = this.c.a();
        if (c.a) {
            c cVar = b;
            cVar.a("--------------- SUBMIT METRICS -------------------");
            cVar.a("Size: " + this.d.c());
            cVar.a("--------------------------------------------------");
        }
    }

    public void a(j jVar) throws RemoteException, com.amazon.a.a.d.b {
    }
}
