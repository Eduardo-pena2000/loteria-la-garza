package d1;

import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface t0 extends h2 {

    public static final class a implements t0, h2 {
        public final m a;

        public a(m mVar) {
            this.a = mVar;
        }

        public Object getValue() {
            return this.a.getValue();
        }

        public boolean i() {
            return this.a.e();
        }
    }

    public static final class b implements t0 {
        public final Object a;
        public final boolean b;

        public b(Object obj, boolean z) {
            this.a = obj;
            this.b = z;
        }

        public Object getValue() {
            return this.a;
        }

        public boolean i() {
            return this.b;
        }

        public /* synthetic */ b(Object obj, boolean z, int i, kotlin.jvm.internal.k kVar) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }

    boolean i();
}
