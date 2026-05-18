package androidx.compose.ui;

import O0.Y;
import P0.N0;
import b0.I;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class CompositionLocalMapInjectionElement extends Y {
    public final I b;

    public CompositionLocalMapInjectionElement(I i) {
        this.b = i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && t.c(((CompositionLocalMapInjectionElement) obj).b, this.b);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public d create() {
        return new d(this.b);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(d dVar) {
        dVar.E1(this.b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("<Injected CompositionLocalMap>");
    }
}
