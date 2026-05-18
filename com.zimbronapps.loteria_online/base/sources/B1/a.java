package b1;

import android.text.SegmentFinder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a a = new a();

    public static final class a extends SegmentFinder {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public int nextEndBoundary(int i) {
            return this.a.c(i);
        }

        public int nextStartBoundary(int i) {
            return this.a.a(i);
        }

        public int previousEndBoundary(int i) {
            return this.a.d(i);
        }

        public int previousStartBoundary(int i) {
            return this.a.b(i);
        }
    }

    public final SegmentFinder a(f fVar) {
        return a1.c.a(new a(fVar));
    }
}
