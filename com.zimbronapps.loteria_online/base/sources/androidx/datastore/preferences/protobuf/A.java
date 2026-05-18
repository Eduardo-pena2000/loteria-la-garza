package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.K;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a implements K {
    protected int memoizedHashCode = 0;

    public static abstract class a implements K.a {
        public static void b(Iterable iterable, List list) {
            u.a(iterable);
            if (!(iterable instanceof y)) {
                if (iterable instanceof U) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    c(iterable, list);
                    return;
                }
            }
            List underlyingElements = ((y) iterable).getUnderlyingElements();
            android.support.v4.media.session.b.a(list);
            list.size();
            Iterator it = underlyingElements.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    new StringBuilder().append("Element at index ");
                    throw null;
                }
                if (next instanceof f) {
                    throw null;
                }
                if (next instanceof byte[]) {
                    f.f((byte[]) next);
                    throw null;
                }
                throw null;
            }
        }

        public static void c(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        public static g0 d(K k) {
            return new g0(k);
        }
    }

    public static void b(Iterable iterable, List list) {
        a.b(iterable, list);
    }

    public abstract int c(a0 a0Var);

    public g0 d() {
        return new g0(this);
    }

    public void e(OutputStream outputStream) {
        i Y = i.Y(outputStream, i.C(getSerializedSize()));
        a(Y);
        Y.V();
    }
}
