package androidx.compose.foundation.text.modifiers;

import O0.Y;
import P0.N0;
import S.i;
import Z0.Y0;
import d1.u;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l1.v;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class TextStringSimpleElement extends Y {
    public final String b;
    public final Y0 c;
    public final u.b d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final t0 i;

    public /* synthetic */ TextStringSimpleElement(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, t0 t0Var, k kVar) {
        this(str, y0, bVar, i, z, i2, i3, t0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return t.c(this.i, textStringSimpleElement.i) && t.c(this.b, textStringSimpleElement.b) && t.c(this.c, textStringSimpleElement.c) && t.c(this.d, textStringSimpleElement.d) && v.g(this.e, textStringSimpleElement.e) && this.f == textStringSimpleElement.f && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public i create() {
        return new i(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(i iVar) {
        iVar.M1(iVar.R1(this.i, this.c), iVar.T1(this.b), iVar.S1(this.c, this.h, this.g, this.f, this.d, this.e));
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + v.h(this.e)) * 31) + Boolean.hashCode(this.f)) * 31) + this.g) * 31) + this.h) * 31;
        t0 t0Var = this.i;
        return hashCode + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public TextStringSimpleElement(String str, Y0 y0, u.b bVar, int i, boolean z, int i2, int i3, t0 t0Var) {
        this.b = str;
        this.c = y0;
        this.d = bVar;
        this.e = i;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = t0Var;
    }

    public void inspectableProperties(N0 n0) {
    }
}
