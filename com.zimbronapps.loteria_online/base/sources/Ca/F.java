package ca;

import da.j;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class f {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public Map a = new HashMap();

        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (f.a(f.this) == null) {
                dVar.a(this.a);
                return;
            }
            String str = iVar.a;
            str.hashCode();
            if (!str.equals("getKeyboardState")) {
                dVar.c();
                return;
            }
            try {
                this.a = f.a(f.this).b();
            } catch (IllegalStateException e) {
                dVar.b("error", e.getMessage(), null);
            }
            dVar.a(this.a);
        }
    }

    public interface b {
        Map b();
    }

    public f(da.b bVar) {
        a aVar = new a();
        this.c = aVar;
        da.j jVar = new da.j(bVar, "flutter/keyboard", da.p.b);
        this.a = jVar;
        jVar.e(aVar);
    }

    public static /* synthetic */ b a(f fVar) {
        return fVar.b;
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
