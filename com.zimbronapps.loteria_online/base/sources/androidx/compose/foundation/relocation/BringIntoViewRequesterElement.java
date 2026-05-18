package androidx.compose.foundation.relocation;

import K.b;
import K.f;
import O0.Y;
import P0.N0;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class BringIntoViewRequesterElement extends Y {
    public final b b;

    public BringIntoViewRequesterElement(b bVar) {
        this.b = bVar;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && t.c(this.b, ((BringIntoViewRequesterElement) obj).b));
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f create() {
        return new f(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(f fVar) {
        fVar.F1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("bringIntoViewRequester");
        n0.b().c("bringIntoViewRequester", this.b);
    }
}
