package o3;

import Q2.d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public d(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static byte[] a(P2.z zVar) {
        int M = zVar.M();
        int f = zVar.f();
        zVar.U(M);
        return P2.d.d(zVar.e(), f, M);
    }

    public static d b(P2.z zVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        String str;
        int i8;
        try {
            zVar.U(4);
            int G = (zVar.G() & 3) + 1;
            if (G == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int G2 = zVar.G() & 31;
            for (int i9 = 0; i9 < G2; i9++) {
                arrayList.add(a(zVar));
            }
            int G3 = zVar.G();
            for (int i10 = 0; i10 < G3; i10++) {
                arrayList.add(a(zVar));
            }
            if (G2 > 0) {
                d.c l = Q2.d.l((byte[]) arrayList.get(0), G, ((byte[]) arrayList.get(0)).length);
                int i11 = l.f;
                int i12 = l.g;
                int i13 = l.i + 8;
                int i14 = l.j + 8;
                int i15 = l.q;
                int i16 = l.r;
                int i17 = l.s;
                int i18 = l.t;
                float f2 = l.h;
                str = P2.d.a(l.a, l.b, l.c);
                i7 = i17;
                i8 = i18;
                f = f2;
                i4 = i14;
                i5 = i15;
                i6 = i16;
                i = i11;
                i2 = i12;
                i3 = i13;
            } else {
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                f = 1.0f;
                str = null;
                i8 = 16;
            }
            return new d(arrayList, G, i, i2, i3, i4, i5, i6, i7, i8, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw M2.z.a("Error parsing AVC config", e);
        }
    }
}
