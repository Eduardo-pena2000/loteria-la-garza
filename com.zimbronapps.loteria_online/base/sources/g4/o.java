package G4;

import G4.x;
import androidx.work.OverwritingInputMerger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o extends x {
    public o(a aVar) {
        super(aVar.b, aVar.c, aVar.d);
    }

    public static o d(Class cls) {
        return (o) new a(cls).b();
    }

    public static final class a extends x.a {
        public a(Class cls) {
            super(cls);
            this.c.d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public o c() {
            if (this.a && this.c.j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new o(this);
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
