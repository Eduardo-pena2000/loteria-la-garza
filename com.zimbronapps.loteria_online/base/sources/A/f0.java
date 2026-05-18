package A;

import android.view.View;
import android.widget.Magnifier;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f0 implements e0 {
    public static final f0 b = new f0();
    public static final boolean c = false;

    public static class a implements d0 {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        public long a() {
            return n1.s.a(this.a.getWidth(), this.a.getHeight());
        }

        public void b(long j, long j2, float f) {
            this.a.show(u0.f.m(j), u0.f.n(j));
        }

        public void c() {
            this.a.update();
        }

        public final Magnifier d() {
            return this.a;
        }

        public void dismiss() {
            this.a.dismiss();
        }
    }

    public boolean b() {
        return c;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean z, long j, float f, float f2, boolean z2, n1.d dVar, float f3) {
        return new a(new Magnifier(view));
    }
}
