package ca;

import android.os.Build;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s {
    public final da.j a;
    public b b;
    public final j.c c;

    public class a implements j.c {
        public a() {
        }

        public void onMethodCall(da.i iVar, j.d dVar) {
            if (s.a(s.this) == null) {
                Q9.b.f("ScribeChannel", "No ScribeMethodHandler registered. Scribe call not handled.");
            }
            String str = iVar.a;
            Q9.b.f("ScribeChannel", "Received '" + str + "' message.");
            str.hashCode();
            switch (str) {
                case "Scribe.isFeatureAvailable":
                    s.b(s.this, iVar, dVar);
                    break;
                case "Scribe.startStylusHandwriting":
                    s.d(s.this, iVar, dVar);
                    break;
                case "Scribe.isStylusHandwritingAvailable":
                    s.c(s.this, iVar, dVar);
                    break;
                default:
                    dVar.c();
                    break;
            }
        }
    }

    public interface b {
        boolean a();

        boolean b();

        void d();
    }

    public s(T9.a aVar) {
        a aVar2 = new a();
        this.c = aVar2;
        da.j jVar = new da.j(aVar, "flutter/scribe", da.f.a);
        this.a = jVar;
        jVar.e(aVar2);
    }

    public static /* synthetic */ b a(s sVar) {
        return sVar.b;
    }

    public static /* synthetic */ void b(s sVar, da.i iVar, j.d dVar) {
        sVar.e(iVar, dVar);
    }

    public static /* synthetic */ void c(s sVar, da.i iVar, j.d dVar) {
        sVar.f(iVar, dVar);
    }

    public static /* synthetic */ void d(s sVar, da.i iVar, j.d dVar) {
        sVar.h(iVar, dVar);
    }

    public final void e(da.i iVar, j.d dVar) {
        try {
            dVar.a(Boolean.valueOf(this.b.b()));
        } catch (IllegalStateException e) {
            dVar.b("error", e.getMessage(), null);
        }
    }

    public final void f(da.i iVar, j.d dVar) {
        if (Build.VERSION.SDK_INT < 34) {
            dVar.b("error", "Requires API level 34 or higher.", null);
            return;
        }
        try {
            dVar.a(Boolean.valueOf(this.b.a()));
        } catch (IllegalStateException e) {
            dVar.b("error", e.getMessage(), null);
        }
    }

    public void g(b bVar) {
        this.b = bVar;
    }

    public final void h(da.i iVar, j.d dVar) {
        if (Build.VERSION.SDK_INT < 33) {
            dVar.b("error", "Requires API level 33 or higher.", null);
            return;
        }
        try {
            this.b.d();
            dVar.a(null);
        } catch (IllegalStateException e) {
            dVar.b("error", e.getMessage(), null);
        }
    }
}
