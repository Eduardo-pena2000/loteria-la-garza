package ca;

import da.j;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class j {
    public final da.j a;
    public final j.c b;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            dVar.a(null);
        }
    }

    public j(T9.a aVar) {
        a aVar2 = new a();
        this.b = aVar2;
        da.j jVar = new da.j(aVar, "flutter/navigation", da.f.a);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public void a() {
        Q9.b.f("NavigationChannel", "Sending message to pop route.");
        this.a.c("popRoute", null);
    }

    public void b(String str) {
        Q9.b.f("NavigationChannel", "Sending message to push route information '" + str + "'");
        HashMap hashMap = new HashMap();
        hashMap.put("location", str);
        this.a.c("pushRouteInformation", hashMap);
    }

    public void c(String str) {
        Q9.b.f("NavigationChannel", "Sending message to set initial route to '" + str + "'");
        this.a.c("setInitialRoute", str);
    }
}
