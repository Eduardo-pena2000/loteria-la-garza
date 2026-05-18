package ca;

import da.j;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (i.a(i.this) == null) {
                return;
            }
            String str = iVar.a;
            Q9.b.f("MouseCursorChannel", "Received '" + str + "' message.");
            try {
                if (str.hashCode() == -1307105544 && str.equals("activateSystemCursor")) {
                    try {
                        i.a(i.this).a((String) ((HashMap) iVar.b).get("kind"));
                        dVar.a(Boolean.TRUE);
                    } catch (Exception e) {
                        dVar.b("error", "Error when setting cursors: " + e.getMessage(), null);
                    }
                }
            } catch (Exception e2) {
                dVar.b("error", "Unhandled error: " + e2.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str);
    }

    public i(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/mousecursor", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(i iVar) {
        return iVar.b;
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
