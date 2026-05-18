package X2;

import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g {
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final e e;

    public g(String str, long j, List list, List list2) {
        this(str, j, list, list2, null);
    }

    public int a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((a) this.c.get(i2)).b == i) {
                return i2;
            }
        }
        return -1;
    }

    public g(String str, long j, List list, List list2, e eVar) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
        this.e = eVar;
    }
}
