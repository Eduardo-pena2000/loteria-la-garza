package androidx.compose.foundation.layout;

import F.s;
import F.u;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class FillElement extends Y {
    public static final a e = new a(null);
    public final s b;
    public final float c;
    public final String d;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final FillElement a(float f) {
            return new FillElement(s.Vertical, f, "fillMaxHeight");
        }

        public final FillElement b(float f) {
            return new FillElement(s.Both, f, "fillMaxSize");
        }

        public final FillElement c(float f) {
            return new FillElement(s.Horizontal, f, "fillMaxWidth");
        }

        public a() {
        }
    }

    public FillElement(s sVar, float f, String str) {
        this.b = sVar;
        this.c = f;
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public u create() {
        return new u(this.b, this.c);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(u uVar) {
        uVar.E1(this.b);
        uVar.F1(this.c);
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + Float.hashCode(this.c);
    }

    public void inspectableProperties(N0 n0) {
        n0.d(this.d);
        n0.b().c("fraction", Float.valueOf(this.c));
    }
}
