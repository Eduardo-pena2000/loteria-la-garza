package n0;

import Za.B;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class x {
    public static final boolean a(v vVar) {
        return vVar.g() < vVar.f().length() - 1 && Character.isLetter(vVar.f().charAt(vVar.g())) && vVar.f().charAt(vVar.g() + 1) == '(';
    }

    public static final List b(v vVar) {
        boolean z;
        Integer num;
        ArrayList arrayList = new ArrayList();
        while (!vVar.c() && !vVar.h(':')) {
            if (vVar.h('*')) {
                v.b(vVar, 0, 1, null);
                z = true;
            } else {
                z = false;
            }
            Integer valueOf = !vVar.h('@') ? Integer.valueOf(vVar.j("@") + 1) : null;
            v.b(vVar, 0, 1, null);
            int j = vVar.j("L,:");
            if (vVar.h('L')) {
                v.b(vVar, 0, 1, null);
                num = Integer.valueOf(vVar.j(",:"));
            } else {
                num = null;
            }
            arrayList.add(new p(valueOf != null ? valueOf.intValue() : -1, j, num != null ? num.intValue() : -1, z));
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    public static final List c(v vVar) {
        String str;
        vVar.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!vVar.c() && !vVar.h(')')) {
            if (vVar.h('!')) {
                v.b(vVar, 0, 1, null);
                String k = vVar.k("!,)");
                if (k.length() != 0) {
                    int parseInt = Integer.parseInt(k);
                    int i = 0;
                    while (parseInt > 0) {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                arrayList.add(new s(i, null, null, 6, null));
                                parseInt--;
                                break;
                            }
                            if (((s) arrayList.get(i2)).a() == i) {
                                i++;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    z = true;
                }
            } else {
                int j = vVar.j("!:,)");
                if (vVar.h(':')) {
                    v.b(vVar, 0, 1, null);
                    str = g(vVar.k("!,)"));
                } else {
                    str = null;
                }
                if (z) {
                    int i3 = 0;
                    while (i3 < j) {
                        int size2 = arrayList.size();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size2) {
                                arrayList.add(new s(i3, null, null, 6, null));
                                break;
                            }
                            if (((s) arrayList.get(i4)).a() == i3) {
                                i3++;
                                break;
                            }
                            i4++;
                        }
                    }
                    z = false;
                }
                arrayList.add(new s(j, null, str, 2, null));
            }
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        vVar.e(')');
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    public static final List d(v vVar) {
        String str;
        vVar.a(2);
        ArrayList arrayList = new ArrayList();
        while (!vVar.c() && !vVar.h(')')) {
            String k = vVar.k(":,)");
            if (vVar.h(':')) {
                v.b(vVar, 0, 1, null);
                str = g(vVar.k(",)"));
            } else {
                str = null;
            }
            arrayList.add(new s(arrayList.size(), k, str));
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        vVar.e(')');
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    public static final w e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (t e) {
            j0.y.a(e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final n0.w f(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.x.f(java.lang.String):n0.w");
    }

    public static final String g(String str) {
        return B.J(str, "c#", "androidx.compose.", false, 4, (Object) null);
    }
}
