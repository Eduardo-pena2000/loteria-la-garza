package ca;

import da.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c {
    public final da.j a;
    public Map b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            c.a(c.this);
        }
    }

    public c(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/deferredcomponent", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
        Q9.a.e().a();
        this.b = new HashMap();
    }

    public static /* synthetic */ U9.a a(c cVar) {
        cVar.getClass();
        return null;
    }
}
