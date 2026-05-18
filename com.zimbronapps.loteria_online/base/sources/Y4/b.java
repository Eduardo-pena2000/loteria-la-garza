package Y4;

import Y4.i;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements i {
    public final Bitmap a;
    public final e5.m b;

    public static final class a implements i.a {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Bitmap bitmap, e5.m mVar, T4.d dVar) {
            return new b(bitmap, mVar);
        }
    }

    public b(Bitmap bitmap, e5.m mVar) {
        this.a = bitmap;
        this.b = mVar;
    }

    public Object a(Ga.e eVar) {
        return new g(new BitmapDrawable(this.b.g().getResources(), this.a), false, V4.f.b);
    }
}
