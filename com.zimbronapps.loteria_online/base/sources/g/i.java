package G;

import Da.D;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final t a(List list, u uVar, List list2, int i, int i2, int i3) {
        int index = ((t) D.f0(list)).getIndex();
        int size = list2.size();
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        while (i6 < size && ((Number) list2.get(i6)).intValue() <= index) {
            i5 = ((Number) list2.get(i6)).intValue();
            i6++;
            i4 = ((Number) ((i6 < 0 || i6 > Da.v.p(list2)) ? -1 : list2.get(i6))).intValue();
        }
        int size2 = list.size();
        int i7 = Integer.MIN_VALUE;
        int i8 = Integer.MIN_VALUE;
        int i9 = -1;
        for (int i10 = 0; i10 < size2; i10++) {
            t tVar = (t) list.get(i10);
            if (tVar.getIndex() == i5) {
                i7 = tVar.a();
                i9 = i10;
            } else if (tVar.getIndex() == i4) {
                i8 = tVar.a();
            }
        }
        if (i5 == -1) {
            return null;
        }
        t e = u.e(uVar, i5, 0L, 2, null);
        e.d(true);
        int max = i7 != Integer.MIN_VALUE ? Math.max(-i, i7) : -i;
        if (i8 != Integer.MIN_VALUE) {
            max = Math.min(max, i8 - e.getSize());
        }
        e.r(max, i2, i3);
        if (i9 != -1) {
            list.set(i9, e);
        } else {
            list.add(0, e);
        }
        return e;
    }
}
