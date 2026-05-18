package androidx.compose.ui.input.pointer;

import O0.Y;
import P0.N0;
import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class SuspendPointerInputElement extends Y {
    public final Object b;
    public final Object c;
    public final Object[] d;
    public final PointerInputEventHandler e;

    public /* synthetic */ SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i, k kVar) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuspendPointerInputElement)) {
            return false;
        }
        SuspendPointerInputElement suspendPointerInputElement = (SuspendPointerInputElement) obj;
        if (!t.c(this.b, suspendPointerInputElement.b) || !t.c(this.c, suspendPointerInputElement.c)) {
            return false;
        }
        Object[] objArr = this.d;
        if (objArr != null) {
            Object[] objArr2 = suspendPointerInputElement.d;
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (suspendPointerInputElement.d != null) {
            return false;
        }
        return this.e == suspendPointerInputElement.e;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public I0.Y create() {
        return new I0.Y(this.b, this.c, this.d, this.e);
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void update(I0.Y y) {
        y.L1(this.b, this.c, this.d, this.e);
    }

    public int hashCode() {
        Object obj = this.b;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        int hashCode2 = (hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.d;
        return ((hashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.e.hashCode();
    }

    public void inspectableProperties(N0 n0) {
        n0.d("pointerInput");
        n0.b().c("key1", this.b);
        n0.b().c("key2", this.c);
        n0.b().c("keys", this.d);
        n0.b().c("pointerInputEventHandler", this.e);
    }

    public SuspendPointerInputElement(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.b = obj;
        this.c = obj2;
        this.d = objArr;
        this.e = pointerInputEventHandler;
    }
}
