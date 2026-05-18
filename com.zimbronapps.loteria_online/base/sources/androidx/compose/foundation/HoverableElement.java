package androidx.compose.foundation;

import A.K;
import E.m;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class HoverableElement extends Y {
    public final m b;

    public HoverableElement(m mVar) {
        this.b = mVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && t.c(((HoverableElement) obj).b, this.b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public K create() {
        return new K(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(K k) {
        k.J1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode() * 31;
    }

    public void inspectableProperties(N0 n0) {
        n0.d("hoverable");
        n0.b().c("interactionSource", this.b);
        n0.b().c("enabled", Boolean.TRUE);
    }
}
