package androidx.compose.foundation.gestures;

import C.m;
import C.q;
import I0.C;
import O0.Y;
import P0.N0;
import Qa.l;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class DraggableElement extends Y {
    public static final b j = new b(null);
    public static final l k = a.a;
    public final m b;
    public final q c;
    public final boolean d;
    public final E.m e;
    public final boolean f;
    public final Qa.q g;
    public final Qa.q h;
    public final boolean i;

    public static final class a extends u implements l {
        public static final a a = new a();

        public a() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C c) {
            return Boolean.TRUE;
        }
    }

    public static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        public b() {
        }
    }

    public DraggableElement(m mVar, q qVar, boolean z, E.m mVar2, boolean z2, Qa.q qVar2, Qa.q qVar3, boolean z3) {
        this.b = mVar;
        this.c = qVar;
        this.d = z;
        this.e = mVar2;
        this.f = z2;
        this.g = qVar2;
        this.h = qVar3;
        this.i = z3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return t.c(this.b, draggableElement.b) && this.c == draggableElement.c && this.d == draggableElement.d && t.c(this.e, draggableElement.e) && this.f == draggableElement.f && t.c(this.g, draggableElement.g) && t.c(this.h, draggableElement.h) && this.i == draggableElement.i;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.b, k, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(c cVar) {
        cVar.m2(this.b, k, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public int hashCode() {
        int hashCode = ((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
        E.m mVar = this.e;
        return ((((((((hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31) + Boolean.hashCode(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + Boolean.hashCode(this.i);
    }

    public void inspectableProperties(N0 n0) {
        n0.d("draggable");
        n0.b().c("orientation", this.c);
        n0.b().c("enabled", Boolean.valueOf(this.d));
        n0.b().c("reverseDirection", Boolean.valueOf(this.i));
        n0.b().c("interactionSource", this.e);
        n0.b().c("startDragImmediately", Boolean.valueOf(this.f));
        n0.b().c("onDragStarted", this.g);
        n0.b().c("onDragStopped", this.h);
        n0.b().c("state", this.b);
    }
}
