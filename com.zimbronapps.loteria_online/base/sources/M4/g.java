package M4;

import G4.n;
import P4.p;
import android.content.Context;
import android.os.Build;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends c {
    public g(Context context, S4.a aVar) {
        super(N4.g.c(context, aVar).d());
    }

    public boolean b(p pVar) {
        return pVar.j.b() == n.c || (Build.VERSION.SDK_INT >= 30 && pVar.j.b() == n.f);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean c(L4.b bVar) {
        return !bVar.a() || bVar.b();
    }
}
