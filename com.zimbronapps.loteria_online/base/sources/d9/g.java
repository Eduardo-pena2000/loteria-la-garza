package D9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.unity3d.scar.adapter.common.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g extends a implements v9.a {
    public g(Context context, C9.a aVar, v9.c cVar, com.unity3d.scar.adapter.common.d dVar, i iVar) {
        super(context, cVar, aVar, dVar);
        this.e = new h(iVar, this);
    }

    public void a(Activity activity) {
        Object obj = this.a;
        if (obj != null) {
            ((f6.c) obj).show(activity, ((h) this.e).f());
        } else {
            this.f.handleError(com.unity3d.scar.adapter.common.b.a(this.c));
        }
    }

    public void c(AdRequest adRequest, v9.b bVar) {
        f6.c.load(this.b, this.c.b(), adRequest, ((h) this.e).e());
    }
}
