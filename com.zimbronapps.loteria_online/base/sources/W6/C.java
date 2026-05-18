package w6;

import com.google.android.gms.common.internal.t;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class c implements Iterator {
    public final b a;
    public int b = -1;

    public c(b bVar) {
        this.a = (b) t.l(bVar);
    }

    public final boolean hasNext() {
        return this.b < this.a.getCount() + (-1);
    }

    public Object next() {
        if (hasNext()) {
            b bVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return bVar.get(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.b);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
