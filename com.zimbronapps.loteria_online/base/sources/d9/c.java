package D9;

import L5.j;
import android.content.Context;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c extends a {
    public RelativeLayout g;
    public int h;
    public int i;
    public j j;

    public c(Context context, RelativeLayout relativeLayout, C9.a aVar, v9.c cVar, int i, int i2, com.unity3d.scar.adapter.common.d dVar, com.unity3d.scar.adapter.common.g gVar) {
        super(context, cVar, aVar, dVar);
        this.g = relativeLayout;
        this.h = i;
        this.i = i2;
        this.j = new j(this.b);
        this.e = new d(gVar, this);
    }

    public void c(AdRequest adRequest, v9.b bVar) {
        j jVar;
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout == null || (jVar = this.j) == null) {
            return;
        }
        relativeLayout.addView(jVar);
        this.j.setAdSize(new L5.h(this.h, this.i));
        this.j.setAdUnitId(this.c.b());
        this.j.setAdListener(((d) this.e).d());
        this.j.b(adRequest);
    }

    public void e() {
        j jVar;
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout == null || (jVar = this.j) == null) {
            return;
        }
        relativeLayout.removeView(jVar);
    }
}
