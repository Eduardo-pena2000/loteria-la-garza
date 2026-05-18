package q9;

import Y9.a;
import android.content.Context;
import da.j;
import io.flutter.embedding.engine.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class h implements Y9.a {
    public j a;
    public i b;

    public static /* bridge */ /* synthetic */ i a(h hVar) {
        return hVar.b;
    }

    public void onAttachedToEngine(a.b bVar) {
        Context a2 = bVar.a();
        da.b b = bVar.b();
        this.b = new i(a2, b);
        j jVar = new j(b, "com.ryanheise.just_audio.methods");
        this.a = jVar;
        jVar.e(this.b);
        bVar.d().f(new a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.b.a();
        this.b = null;
        this.a.e(null);
    }

    public class a implements a.b {
        public a() {
        }

        public void a() {
            h.a(h.this).a();
        }

        public void b() {
        }
    }
}
