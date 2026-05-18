package androidx.compose.foundation.layout;

import F.L;
import F.N;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class PaddingValuesElement extends Y {
    public final L b;
    public final l c;

    public PaddingValuesElement(L l, l lVar) {
        this.b = l;
        this.c = lVar;
    }

    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return t.c(this.b, paddingValuesElement.b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public N create() {
        return new N(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(N n) {
        n.F1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        this.c.invoke(n0);
    }
}
