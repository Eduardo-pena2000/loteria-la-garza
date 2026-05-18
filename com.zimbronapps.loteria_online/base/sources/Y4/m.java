package Y4;

import V4.p;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends h {
    public final p a;
    public final String b;
    public final V4.f c;

    public m(p pVar, String str, V4.f fVar) {
        super(null);
        this.a = pVar;
        this.b = str;
        this.c = fVar;
    }

    public final V4.f a() {
        return this.c;
    }

    public final p b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (t.c(this.a, mVar.a) && t.c(this.b, mVar.b) && this.c == mVar.c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }
}
