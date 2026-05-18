package s7;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b implements Iterator {
    public b a = b.NOT_READY;
    public Object b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    public abstract Object a();

    public final Object b() {
        this.a = b.DONE;
        return null;
    }

    public final boolean c() {
        this.a = b.FAILED;
        this.b = a();
        if (this.a == b.DONE) {
            return false;
        }
        this.a = b.READY;
        return true;
    }

    public final boolean hasNext() {
        m.o(this.a != b.FAILED);
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return c();
        }
        return true;
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = b.NOT_READY;
        Object a2 = j.a(this.b);
        this.b = null;
        return a2;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
