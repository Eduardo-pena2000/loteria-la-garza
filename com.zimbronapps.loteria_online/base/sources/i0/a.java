package I0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements x {
    public final int b;

    public a(int i) {
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.t.c(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        return this.b == ((a) obj).b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.b + ')';
    }
}
