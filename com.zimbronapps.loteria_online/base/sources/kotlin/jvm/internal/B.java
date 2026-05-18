package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b implements Iterator, Ra.a {
    public final Object[] a;
    public int b;

    public b(Object[] array) {
        t.g(array, "array");
        this.a = array;
    }

    public boolean hasNext() {
        return this.b < this.a.length;
    }

    public Object next() {
        try {
            Object[] objArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return objArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
