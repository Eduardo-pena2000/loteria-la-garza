package X2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class n {
    public final List a;
    public final List b;
    public final List c;

    public n(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public static n b(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        c(str, arrayList, arrayList2, arrayList3);
        return new n(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(java.lang.String r11, java.util.List r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.n.c(java.lang.String, java.util.List, java.util.List, java.util.List):void");
    }

    public String a(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            sb.append((String) this.a.get(i2));
            if (((Integer) this.b.get(i2)).intValue() == 1) {
                sb.append(str);
            } else if (((Integer) this.b.get(i2)).intValue() == 2) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), new Object[]{Long.valueOf(j)}));
            } else if (((Integer) this.b.get(i2)).intValue() == 3) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), new Object[]{Integer.valueOf(i)}));
            } else if (((Integer) this.b.get(i2)).intValue() == 4) {
                sb.append(String.format(Locale.US, (String) this.c.get(i2), new Object[]{Long.valueOf(j2)}));
            }
        }
        sb.append((String) this.a.get(this.b.size()));
        return sb.toString();
    }
}
