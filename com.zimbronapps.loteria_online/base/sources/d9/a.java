package D9;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class a {
    public Object a;
    public Context b;
    public v9.c c;
    public C9.a d;
    public b e;
    public com.unity3d.scar.adapter.common.d f;

    public a(Context context, v9.c cVar, C9.a aVar, com.unity3d.scar.adapter.common.d dVar) {
        this.b = context;
        this.c = cVar;
        this.d = aVar;
        this.f = dVar;
    }

    public void b(v9.b bVar) {
        AdRequest b = this.d.b(this.c.a());
        if (bVar != null) {
            this.e.a(bVar);
        }
        c(b, bVar);
    }

    public abstract void c(AdRequest adRequest, v9.b bVar);

    public void d(Object obj) {
        this.a = obj;
    }
}
