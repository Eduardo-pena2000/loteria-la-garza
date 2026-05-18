package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c extends AbstractList implements u.b {
    public boolean a;

    public c(boolean z) {
        this.a = z;
    }

    public void a() {
        if (!this.a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean addAll(Collection collection) {
        a();
        return super/*java.util.AbstractCollection*/.addAll(collection);
    }

    public void clear() {
        a();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean isModifiable() {
        return this.a;
    }

    public final void makeImmutable() {
        if (this.a) {
            this.a = false;
        }
    }

    public abstract Object remove(int i);

    public boolean remove(Object obj) {
        a();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection collection) {
        a();
        return super/*java.util.AbstractCollection*/.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        a();
        return super/*java.util.AbstractCollection*/.retainAll(collection);
    }

    public boolean addAll(int i, Collection collection) {
        a();
        return super.addAll(i, collection);
    }
}
