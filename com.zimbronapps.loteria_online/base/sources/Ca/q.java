package ca;

import android.content.pm.PackageManager;
import da.j;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class q {
    public final da.j a;
    public final PackageManager b;
    public b c;
    public final j.c d;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (q.a(q.this) == null) {
                return;
            }
            String str = iVar.a;
            Object obj = iVar.b;
            str.hashCode();
            if (!str.equals("ProcessText.processTextAction")) {
                if (!str.equals("ProcessText.queryTextActions")) {
                    dVar.c();
                    return;
                }
                try {
                    dVar.a(q.a(q.this).b());
                    return;
                } catch (IllegalStateException e) {
                    dVar.b("error", e.getMessage(), null);
                    return;
                }
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                q.a(q.this).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), dVar);
            } catch (IllegalStateException e2) {
                dVar.b("error", e2.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, boolean z, j.d dVar);

        Map b();
    }

    public q(T9.a aVar, PackageManager packageManager) {
        a aVar2 = new a();
        this.d = aVar2;
        this.b = packageManager;
        da.j jVar = new da.j(aVar, "flutter/processtext", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(q qVar) {
        return qVar.c;
    }

    public void b(b bVar) {
        this.c = bVar;
    }
}
