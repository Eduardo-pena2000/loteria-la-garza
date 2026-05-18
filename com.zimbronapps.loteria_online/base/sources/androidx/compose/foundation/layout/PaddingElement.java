package androidx.compose.foundation.layout;

import F.K;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import n1.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
final class PaddingElement extends Y {
    public float b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public final l g;

    public /* synthetic */ PaddingElement(float f, float f2, float f3, float f4, boolean z, l lVar, k kVar) {
        this(f, f2, f3, f4, z, lVar);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && h.i(this.b, paddingElement.b) && h.i(this.c, paddingElement.c) && h.i(this.d, paddingElement.d) && h.i(this.e, paddingElement.e) && this.f == paddingElement.f;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public K create() {
        return new K(this.b, this.c, this.d, this.e, this.f, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(K k) {
        k.K1(this.b);
        k.L1(this.c);
        k.I1(this.d);
        k.H1(this.e);
        k.J1(this.f);
    }

    public int hashCode() {
        return (((((((h.k(this.b) * 31) + h.k(this.c)) * 31) + h.k(this.d)) * 31) + h.k(this.e)) * 31) + Boolean.hashCode(this.f);
    }

    public void inspectableProperties(N0 n0) {
        this.g.invoke(n0);
    }

    public PaddingElement(float f, float f2, float f3, float f4, boolean z, l lVar) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.g = lVar;
        if (f >= 0.0f || h.i(f, h.b.c())) {
            float f5 = this.c;
            if (f5 >= 0.0f || h.i(f5, h.b.c())) {
                float f6 = this.d;
                if (f6 >= 0.0f || h.i(f6, h.b.c())) {
                    float f7 = this.e;
                    if (f7 >= 0.0f || h.i(f7, h.b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
