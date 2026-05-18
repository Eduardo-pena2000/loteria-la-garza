package t7;

import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class a extends V {
    public final int a;
    public int b;

    public a(int i, int i2) {
        s7.m.l(i2, i);
        this.a = i;
        this.b = i2;
    }

    public abstract Object a(int i);

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.b = i + 1;
        return a(i);
    }

    public final int nextIndex() {
        return this.b;
    }

    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return a(i);
    }

    public final int previousIndex() {
        return this.b - 1;
    }
}
