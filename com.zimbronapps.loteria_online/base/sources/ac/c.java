package ac;

import Y9.a;
import android.app.Activity;
import da.i;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c implements j.c, Y9.a, Z9.a {
    public b a;
    public Z9.c b;

    public b a(Activity activity) {
        b bVar = new b(activity);
        this.a = bVar;
        return bVar;
    }

    public final void b(da.b bVar) {
        new j(bVar, "plugins.hunghd.vn/image_cropper").e(this);
    }

    public void onAttachedToActivity(Z9.c cVar) {
        a(cVar.getActivity());
        this.b = cVar;
        cVar.f(this.a);
    }

    public void onAttachedToEngine(a.b bVar) {
        b(bVar.b());
    }

    public void onDetachedFromActivity() {
        this.b.e(this.a);
        this.b = null;
        this.a = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    public void onMethodCall(i iVar, j.d dVar) {
        if (iVar.a.equals("cropImage")) {
            this.a.j(iVar, dVar);
        } else if (iVar.a.equals("recoverImage")) {
            this.a.h(iVar, dVar);
        }
    }

    public void onReattachedToActivityForConfigChanges(Z9.c cVar) {
        onAttachedToActivity(cVar);
    }

    public void onDetachedFromEngine(a.b bVar) {
    }
}
