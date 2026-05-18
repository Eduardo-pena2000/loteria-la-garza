package t7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l extends I implements Serializable {
    public final Comparator[] a;

    public l(Comparator comparator, Comparator comparator2) {
        this.a = new Comparator[]{comparator, comparator2};
    }

    public int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            return Arrays.equals(this.a, ((l) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.a) + ")";
    }
}
