package H;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b {

    public static final class a implements b {
        public final float a;

        public /* synthetic */ a(float f, kotlin.jvm.internal.k kVar) {
            this(f);
        }

        public List a(n1.d dVar, int i, int i2) {
            return h.b(i, Math.max((i + i2) / (dVar.s0(this.a) + i2), 1), i2);
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && n1.h.i(this.a, ((a) obj).a);
        }

        public int hashCode() {
            return n1.h.k(this.a);
        }

        public a(float f) {
            this.a = f;
            if (n1.h.f(f, n1.h.g(0)) > 0) {
                return;
            }
            throw new IllegalArgumentException(("Provided min size " + n1.h.l(f) + " should be larger than zero.").toString());
        }
    }

    List a(n1.d dVar, int i, int i2);
}
