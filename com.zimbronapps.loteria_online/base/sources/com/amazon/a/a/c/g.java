package com.amazon.a.a.c;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g implements f {
    private static final com.amazon.a.a.o.c a = new com.amazon.a.a.o.c("EventManagerImpl");
    private final Map b = new HashMap();

    public void a(c cVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "listener");
        com.amazon.a.a.o.a.a.a();
        b a2 = cVar.a();
        a.a("Registering listener for event: " + a2 + ", " + cVar);
        e eVar = (e) this.b.get(a2);
        if (eVar == null) {
            eVar = new e();
            this.b.put(a2, eVar);
        }
        eVar.a(cVar);
    }

    public void a(a aVar) {
        b a2 = aVar.a();
        if (com.amazon.a.a.o.c.a) {
            a.a("Posting event: " + a2);
        }
        if (!this.b.containsKey(a2)) {
            if (com.amazon.a.a.o.c.a) {
                a.a("No registered listeners, returning");
                return;
            }
            return;
        }
        ((e) this.b.get(a2)).a(aVar);
    }
}
