package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class F extends k0 {
    public final boolean m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String name, E generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.t.g(name, "name");
        kotlin.jvm.internal.t.g(generatedSerializer, "generatedSerializer");
        this.m = true;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            qb.e eVar = (qb.e) obj;
            if (kotlin.jvm.internal.t.c(h(), eVar.h())) {
                F f = (F) obj;
                if (f.isInline() && Arrays.equals(t(), f.t()) && d() == eVar.d()) {
                    int d = d();
                    for (0; i < d; i + 1) {
                        i = (kotlin.jvm.internal.t.c(g(i).h(), eVar.g(i).h()) && kotlin.jvm.internal.t.c(g(i).getKind(), eVar.g(i).getKind())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean isInline() {
        return this.m;
    }
}
