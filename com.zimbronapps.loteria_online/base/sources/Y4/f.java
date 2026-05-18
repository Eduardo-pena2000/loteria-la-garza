package Y4;

import Y4.i;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements i {
    public final Drawable a;
    public final e5.m b;

    public static final class a implements i.a {
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i a(Drawable drawable, e5.m mVar, T4.d dVar) {
            return new f(drawable, mVar);
        }
    }

    public f(Drawable drawable, e5.m mVar) {
        this.a = drawable;
        this.b = mVar;
    }

    public Object a(Ga.e eVar) {
        BitmapDrawable bitmapDrawable;
        boolean t = j5.j.t(this.a);
        if (t) {
            bitmapDrawable = new BitmapDrawable(this.b.g().getResources(), j5.l.a.a(this.a, this.b.f(), this.b.n(), this.b.m(), this.b.c()));
        } else {
            bitmapDrawable = this.a;
        }
        return new g(bitmapDrawable, t, V4.f.b);
    }
}
