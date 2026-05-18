package com.amazon.a.a.b.b;

import android.os.RemoteException;
import com.amazon.a.a.d.b;
import com.amazon.a.a.o.c;
import com.amazon.d.a.h;
import com.amazon.d.a.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a extends com.amazon.a.a.n.a.a {
    private static final c b = new c("SubmitCrashReportsTask");

    @com.amazon.a.a.k.a
    private com.amazon.a.a.b.a c;
    private List d;

    public void a(h hVar) throws RemoteException, b {
    }

    public String a_() {
        return "submit_crash_reports";
    }

    public Map b() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.amazon.a.a.b.c) it.next()).a());
        }
        hashMap.put("reports", arrayList);
        return hashMap;
    }

    public String c() {
        return "1.0";
    }

    public boolean d() {
        return !this.d.isEmpty();
    }

    public void e() throws b {
        this.d = this.c.a();
        if (c.a) {
            c cVar = b;
            cVar.a("--------------- Crash Reports -------------------");
            cVar.a("Size: " + this.d.size());
            cVar.a("--------------------------------------------------");
        }
    }

    public void a(j jVar) throws RemoteException, b {
        this.c.a(this.d);
    }
}
