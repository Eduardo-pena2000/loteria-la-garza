package D9;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class e extends a implements v9.a {
    public e(Context context, C9.a aVar, v9.c cVar, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.h hVar) {
        super(context, cVar, aVar, dVar);
        this.e = new f(hVar, this);
    }

    public void a(Activity activity) {
        Object obj = this.a;
        if (obj != null) {
            ((X5.a) obj).show(activity);
        } else {
            this.f.handleError(com.unity3d.scar.adapter.common.b.a(this.c));
        }
    }

    public void c(AdRequest adRequest, v9.b bVar) {
        X5.a.load(this.b, this.c.b(), adRequest, ((f) this.e).e());
    }
}
