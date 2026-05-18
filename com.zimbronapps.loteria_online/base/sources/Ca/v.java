package ca;

import da.j;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class v {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (v.a(v.this) == null) {
                Q9.b.f("SpellCheckChannel", "No SpellCheckeMethodHandler registered, call not forwarded to spell check API.");
                return;
            }
            String str = iVar.a;
            Object obj = iVar.b;
            Q9.b.f("SpellCheckChannel", "Received '" + str + "' message.");
            str.hashCode();
            if (!str.equals("SpellCheck.initiateSpellCheck")) {
                dVar.c();
                return;
            }
            try {
                ArrayList arrayList = (ArrayList) obj;
                v.a(v.this).a((String) arrayList.get(0), (String) arrayList.get(1), dVar);
            } catch (IllegalStateException e) {
                dVar.b("error", e.getMessage(), null);
            }
        }
    }

    public interface b {
        void a(String str, String str2, j.d dVar);
    }

    public v(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/spellcheck", da.p.b);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(v vVar) {
        return vVar.b;
    }

    public void b(b bVar) {
        this.b = bVar;
    }
}
