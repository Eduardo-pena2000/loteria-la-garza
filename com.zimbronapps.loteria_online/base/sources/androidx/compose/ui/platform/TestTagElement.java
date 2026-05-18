package androidx.compose.ui.platform;

import O0.Y;
import P0.N0;
import P0.i1;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class TestTagElement extends Y {
    public final String b;

    public TestTagElement(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestTagElement) {
            return t.c(this.b, ((TestTagElement) obj).b);
        }
        return false;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i1 create() {
        return new i1(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i1 i1Var) {
        i1Var.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("testTag");
        n0.b().c("tag", this.b);
    }
}
