package androidx.compose.foundation.text.modifiers;

import O0.Y;
import P0.N0;
import Qa.l;
import S.g;
import Z0.Y0;
import Z0.e;
import d1.u;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import l1.v;
import v0.t0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class SelectableTextAnnotatedStringElement extends Y {
    public final e b;
    public final Y0 c;
    public final u.b d;
    public final l e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final List j;
    public final l k;
    public final g l;
    public final t0 m;

    public /* synthetic */ SelectableTextAnnotatedStringElement(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var, k kVar) {
        this(eVar, y0, bVar, lVar, i, z, i2, i3, list, lVar2, gVar, t0Var);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return t.c(this.m, selectableTextAnnotatedStringElement.m) && t.c(this.b, selectableTextAnnotatedStringElement.b) && t.c(this.c, selectableTextAnnotatedStringElement.c) && t.c(this.j, selectableTextAnnotatedStringElement.j) && t.c(this.d, selectableTextAnnotatedStringElement.d) && this.e == selectableTextAnnotatedStringElement.e && v.g(this.f, selectableTextAnnotatedStringElement.f) && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.k == selectableTextAnnotatedStringElement.k && t.c(this.l, selectableTextAnnotatedStringElement.l);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a create() {
        return new a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null, 4096, null);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(a aVar) {
        aVar.K1(this.b, this.c, this.j, this.i, this.h, this.g, this.d, this.f, this.e, this.k, this.l, this.m);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        l lVar = this.e;
        int hashCode2 = (((((((((hashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + v.h(this.f)) * 31) + Boolean.hashCode(this.g)) * 31) + this.h) * 31) + this.i) * 31;
        List list = this.j;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l lVar2 = this.k;
        int hashCode4 = (((hashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31) + 0) * 31;
        t0 t0Var = this.m;
        return hashCode4 + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + this.b + ", style=" + this.c + ", fontFamilyResolver=" + this.d + ", onTextLayout=" + this.e + ", overflow=" + v.i(this.f) + ", softWrap=" + this.g + ", maxLines=" + this.h + ", minLines=" + this.i + ", placeholders=" + this.j + ", onPlaceholderLayout=" + this.k + ", selectionController=" + this.l + ", color=" + this.m + ')';
    }

    public SelectableTextAnnotatedStringElement(e eVar, Y0 y0, u.b bVar, l lVar, int i, boolean z, int i2, int i3, List list, l lVar2, g gVar, t0 t0Var) {
        this.b = eVar;
        this.c = y0;
        this.d = bVar;
        this.e = lVar;
        this.f = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = list;
        this.k = lVar2;
        this.m = t0Var;
    }

    public void inspectableProperties(N0 n0) {
    }
}
