package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
LI11I1ll1Ii11.IIiLliI1l1li1: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:112)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:46)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:136)
	at jadx.core.dex.visitors.EnumVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public static final r A;
    public static final r B;
    public static final r C;
    public static final r D;
    public static final r E;
    public static final r F;
    public static final r G;
    public static final r H;
    public static final r I;
    public static final r J;
    public static final r K;
    public static final r L;
    public static final r M;
    public static final r N;
    public static final r O;
    public static final r P;
    public static final r Q;
    public static final r R;
    public static final r S;
    public static final r T;
    public static final r U;
    public static final r V;
    public static final r W;
    public static final r X;
    public static final r Y;
    public static final r Z;
    public static final r a0;
    public static final r b0;
    public static final r c0;
    public static final r d0;
    public static final r[] e0;
    public static final r f;
    public static final Type[] f0;
    public static final r g;
    public static final /* synthetic */ r[] g0;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    public static final r l;
    public static final r m;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    public static final r s;
    public static final r t;
    public static final r u;
    public static final r v;
    public static final r w;
    public static final r x;
    public static final r y;
    public static final r z;
    public final w a;
    public final int b;
    public final b c;
    public final Class d;
    public final boolean e;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[w.values().length];
            b = iArr;
            try {
                iArr[w.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[w.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[w.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        public final boolean a;

        b(boolean z) {
            this.a = z;
        }
    }

    static {
        b bVar = b.SCALAR;
        w wVar = w.h;
        r rVar = new r("DOUBLE", 0, 0, bVar, wVar);
        f = rVar;
        w wVar2 = w.g;
        r rVar2 = new r("FLOAT", 1, 1, bVar, wVar2);
        g = rVar2;
        w wVar3 = w.f;
        r rVar3 = new r("INT64", 2, 2, bVar, wVar3);
        h = rVar3;
        r rVar4 = new r("UINT64", 3, 3, bVar, wVar3);
        i = rVar4;
        w wVar4 = w.e;
        r rVar5 = new r("INT32", 4, 4, bVar, wVar4);
        j = rVar5;
        r rVar6 = new r("FIXED64", 5, 5, bVar, wVar3);
        k = rVar6;
        r rVar7 = new r("FIXED32", 6, 6, bVar, wVar4);
        l = rVar7;
        w wVar5 = w.i;
        r rVar8 = new r("BOOL", 7, 7, bVar, wVar5);
        m = rVar8;
        w wVar6 = w.j;
        r rVar9 = new r("STRING", 8, 8, bVar, wVar6);
        n = rVar9;
        w wVar7 = w.m;
        r rVar10 = new r("MESSAGE", 9, 9, bVar, wVar7);
        o = rVar10;
        w wVar8 = w.k;
        r rVar11 = new r("BYTES", 10, 10, bVar, wVar8);
        p = rVar11;
        r rVar12 = new r("UINT32", 11, 11, bVar, wVar4);
        q = rVar12;
        w wVar9 = w.l;
        r rVar13 = new r("ENUM", 12, 12, bVar, wVar9);
        r = rVar13;
        r rVar14 = new r("SFIXED32", 13, 13, bVar, wVar4);
        s = rVar14;
        r rVar15 = new r("SFIXED64", 14, 14, bVar, wVar3);
        t = rVar15;
        r rVar16 = new r("SINT32", 15, 15, bVar, wVar4);
        u = rVar16;
        r rVar17 = new r("SINT64", 16, 16, bVar, wVar3);
        v = rVar17;
        r rVar18 = new r("GROUP", 17, 17, bVar, wVar7);
        w = rVar18;
        b bVar2 = b.VECTOR;
        r rVar19 = new r("DOUBLE_LIST", 18, 18, bVar2, wVar);
        x = rVar19;
        r rVar20 = new r("FLOAT_LIST", 19, 19, bVar2, wVar2);
        y = rVar20;
        r rVar21 = new r("INT64_LIST", 20, 20, bVar2, wVar3);
        z = rVar21;
        r rVar22 = new r("UINT64_LIST", 21, 21, bVar2, wVar3);
        A = rVar22;
        r rVar23 = new r("INT32_LIST", 22, 22, bVar2, wVar4);
        B = rVar23;
        r rVar24 = new r("FIXED64_LIST", 23, 23, bVar2, wVar3);
        C = rVar24;
        r rVar25 = new r("FIXED32_LIST", 24, 24, bVar2, wVar4);
        D = rVar25;
        r rVar26 = new r("BOOL_LIST", 25, 25, bVar2, wVar5);
        E = rVar26;
        r rVar27 = new r("STRING_LIST", 26, 26, bVar2, wVar6);
        F = rVar27;
        r rVar28 = new r("MESSAGE_LIST", 27, 27, bVar2, wVar7);
        G = rVar28;
        r rVar29 = new r("BYTES_LIST", 28, 28, bVar2, wVar8);
        H = rVar29;
        r rVar30 = new r("UINT32_LIST", 29, 29, bVar2, wVar4);
        I = rVar30;
        r rVar31 = new r("ENUM_LIST", 30, 30, bVar2, wVar9);
        J = rVar31;
        r rVar32 = new r("SFIXED32_LIST", 31, 31, bVar2, wVar4);
        K = rVar32;
        r rVar33 = new r("SFIXED64_LIST", 32, 32, bVar2, wVar3);
        L = rVar33;
        r rVar34 = new r("SINT32_LIST", 33, 33, bVar2, wVar4);
        M = rVar34;
        r rVar35 = new r("SINT64_LIST", 34, 34, bVar2, wVar3);
        N = rVar35;
        b bVar3 = b.PACKED_VECTOR;
        r rVar36 = new r("DOUBLE_LIST_PACKED", 35, 35, bVar3, wVar);
        O = rVar36;
        r rVar37 = new r("FLOAT_LIST_PACKED", 36, 36, bVar3, wVar2);
        P = rVar37;
        r rVar38 = new r("INT64_LIST_PACKED", 37, 37, bVar3, wVar3);
        Q = rVar38;
        r rVar39 = new r("UINT64_LIST_PACKED", 38, 38, bVar3, wVar3);
        R = rVar39;
        r rVar40 = new r("INT32_LIST_PACKED", 39, 39, bVar3, wVar4);
        S = rVar40;
        r rVar41 = new r("FIXED64_LIST_PACKED", 40, 40, bVar3, wVar3);
        T = rVar41;
        r rVar42 = new r("FIXED32_LIST_PACKED", 41, 41, bVar3, wVar4);
        U = rVar42;
        r rVar43 = new r("BOOL_LIST_PACKED", 42, 42, bVar3, wVar5);
        V = rVar43;
        r rVar44 = new r("UINT32_LIST_PACKED", 43, 43, bVar3, wVar4);
        W = rVar44;
        r rVar45 = new r("ENUM_LIST_PACKED", 44, 44, bVar3, wVar9);
        X = rVar45;
        r rVar46 = new r("SFIXED32_LIST_PACKED", 45, 45, bVar3, wVar4);
        Y = rVar46;
        r rVar47 = new r("SFIXED64_LIST_PACKED", 46, 46, bVar3, wVar3);
        Z = rVar47;
        r rVar48 = new r("SINT32_LIST_PACKED", 47, 47, bVar3, wVar4);
        a0 = rVar48;
        r rVar49 = new r("SINT64_LIST_PACKED", 48, 48, bVar3, wVar3);
        b0 = rVar49;
        r rVar50 = new r("GROUP_LIST", 49, 49, bVar2, wVar7);
        c0 = rVar50;
        r rVar51 = new r("MAP", 50, 50, b.MAP, w.d);
        d0 = rVar51;
        g0 = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, rVar50, rVar51};
        f0 = new Type[0];
        r[] values = values();
        e0 = new r[values.length];
        for (r rVar52 : values) {
            e0[rVar52.b] = rVar52;
        }
    }

    public r(String str, int i2, int i3, b bVar, w wVar) {
        int i4;
        this.b = i3;
        this.c = bVar;
        this.a = wVar;
        int i5 = a.a[bVar.ordinal()];
        if (i5 == 1) {
            this.d = wVar.a();
        } else if (i5 != 2) {
            this.d = null;
        } else {
            this.d = wVar.a();
        }
        this.e = (bVar != b.SCALAR || (i4 = a.b[wVar.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : true;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) g0.clone();
    }

    public int a() {
        return this.b;
    }
}
