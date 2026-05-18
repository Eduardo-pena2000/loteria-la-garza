package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d {
    public static final int[] g = {0, 4, 8};
    public static SparseIntArray h = new SparseIntArray();
    public static SparseIntArray i = new SparseIntArray();
    public String a = "";
    public String[] b = new String[0];
    public int c = 0;
    public HashMap d = new HashMap();
    public boolean e = true;
    public HashMap f = new HashMap();

    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap g = new HashMap();
        public a h;

        public static class a {
            public int[] a = new int[10];
            public int[] b = new int[10];
            public int c = 0;
            public int[] d = new int[10];
            public float[] e = new float[10];
            public int f = 0;
            public int[] g = new int[5];
            public String[] h = new String[5];
            public int i = 0;
            public int[] j = new int[4];
            public boolean[] k = new boolean[4];
            public int l = 0;

            public void a(int i, float f) {
                int i2 = this.f;
                int[] iArr = this.d;
                if (i2 >= iArr.length) {
                    this.d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.e;
                    this.e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.d;
                int i3 = this.f;
                iArr2[i3] = i;
                float[] fArr2 = this.e;
                this.f = i3 + 1;
                fArr2[i3] = f;
            }

            public void b(int i, int i2) {
                int i3 = this.c;
                int[] iArr = this.a;
                if (i3 >= iArr.length) {
                    this.a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.b;
                    this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.a;
                int i4 = this.c;
                iArr3[i4] = i;
                int[] iArr4 = this.b;
                this.c = i4 + 1;
                iArr4[i4] = i2;
            }

            public void c(int i, String str) {
                int i2 = this.i;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.h;
                    this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.g;
                int i3 = this.i;
                iArr2[i3] = i;
                String[] strArr2 = this.h;
                this.i = i3 + 1;
                strArr2[i3] = str;
            }

            public void d(int i, boolean z) {
                int i2 = this.l;
                int[] iArr = this.j;
                if (i2 >= iArr.length) {
                    this.j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.k;
                    this.k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.j;
                int i3 = this.l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.k;
                this.l = i3 + 1;
                zArr2[i3] = z;
            }
        }

        public static /* synthetic */ void a(a aVar, int i, ConstraintLayout.b bVar) {
            aVar.d(i, bVar);
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.e;
            bVar.e = bVar2.j;
            bVar.f = bVar2.k;
            bVar.g = bVar2.l;
            bVar.h = bVar2.m;
            bVar.i = bVar2.n;
            bVar.j = bVar2.o;
            bVar.k = bVar2.p;
            bVar.l = bVar2.q;
            bVar.m = bVar2.r;
            bVar.n = bVar2.s;
            bVar.o = bVar2.t;
            bVar.s = bVar2.u;
            bVar.t = bVar2.v;
            bVar.u = bVar2.w;
            bVar.v = bVar2.x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.x = bVar2.P;
            bVar.z = bVar2.R;
            bVar.G = bVar2.y;
            bVar.H = bVar2.z;
            bVar.p = bVar2.B;
            bVar.q = bVar2.C;
            bVar.r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.a0 = bVar2.n0;
            bVar.b0 = bVar2.o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.a0;
            bVar.T = bVar2.b0;
            bVar.U = bVar2.c0;
            bVar.R = bVar2.d0;
            bVar.S = bVar2.e0;
            bVar.V = bVar2.f0;
            bVar.W = bVar2.g0;
            bVar.Z = bVar2.G;
            bVar.c = bVar2.h;
            bVar.a = bVar2.f;
            bVar.b = bVar2.g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.e;
            String str = bVar2.m0;
            if (str != null) {
                bVar.c0 = str;
            }
            bVar.d0 = bVar2.q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.e.L);
            bVar.a();
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public final void d(int i, ConstraintLayout.b bVar) {
            this.a = i;
            b bVar2 = this.e;
            bVar2.j = bVar.e;
            bVar2.k = bVar.f;
            bVar2.l = bVar.g;
            bVar2.m = bVar.h;
            bVar2.n = bVar.i;
            bVar2.o = bVar.j;
            bVar2.p = bVar.k;
            bVar2.q = bVar.l;
            bVar2.r = bVar.m;
            bVar2.s = bVar.n;
            bVar2.t = bVar.o;
            bVar2.u = bVar.s;
            bVar2.v = bVar.t;
            bVar2.w = bVar.u;
            bVar2.x = bVar.v;
            bVar2.y = bVar.G;
            bVar2.z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.p;
            bVar2.C = bVar.q;
            bVar2.D = bVar.r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.h = bVar.c;
            bVar2.f = bVar.a;
            bVar2.g = bVar.b;
            bVar2.d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.n0 = bVar.a0;
            bVar2.o0 = bVar.b0;
            bVar2.Z = bVar.P;
            bVar2.a0 = bVar.Q;
            bVar2.b0 = bVar.T;
            bVar2.c0 = bVar.U;
            bVar2.d0 = bVar.R;
            bVar2.e0 = bVar.S;
            bVar2.f0 = bVar.V;
            bVar2.g0 = bVar.W;
            bVar2.m0 = bVar.c0;
            bVar2.P = bVar.x;
            bVar2.R = bVar.z;
            bVar2.O = bVar.w;
            bVar2.Q = bVar.y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.q0 = bVar.d0;
            bVar2.L = bVar.getMarginEnd();
            this.e.M = bVar.getMarginStart();
        }
    }

    public static class b {
        public static SparseIntArray r0;
        public int d;
        public int e;
        public int[] k0;
        public String l0;
        public String m0;
        public boolean a = false;
        public boolean b = false;
        public boolean c = false;
        public int f = -1;
        public int g = -1;
        public float h = -1.0f;
        public boolean i = true;
        public int j = -1;
        public int k = -1;
        public int l = -1;
        public int m = -1;
        public int n = -1;
        public int o = -1;
        public int p = -1;
        public int q = -1;
        public int r = -1;
        public int s = -1;
        public int t = -1;
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public int x = -1;
        public float y = 0.5f;
        public float z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public int U = Integer.MIN_VALUE;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;
        public int a0 = 0;
        public int b0 = 0;
        public int c0 = 0;
        public int d0 = 0;
        public int e0 = 0;
        public float f0 = 1.0f;
        public float g0 = 1.0f;
        public int h0 = -1;
        public int i0 = 0;
        public int j0 = -1;
        public boolean n0 = false;
        public boolean o0 = false;
        public boolean p0 = true;
        public int q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            r0 = sparseIntArray;
            sparseIntArray.append(E1.d.b5, 24);
            r0.append(E1.d.c5, 25);
            r0.append(E1.d.e5, 28);
            r0.append(E1.d.f5, 29);
            r0.append(E1.d.k5, 35);
            r0.append(E1.d.j5, 34);
            r0.append(E1.d.K4, 4);
            r0.append(E1.d.J4, 3);
            r0.append(E1.d.H4, 1);
            r0.append(E1.d.s5, 6);
            r0.append(E1.d.t5, 7);
            r0.append(E1.d.R4, 17);
            r0.append(E1.d.S4, 18);
            r0.append(E1.d.T4, 19);
            r0.append(E1.d.D4, 90);
            r0.append(E1.d.p4, 26);
            r0.append(E1.d.g5, 31);
            r0.append(E1.d.h5, 32);
            r0.append(E1.d.Q4, 10);
            r0.append(E1.d.P4, 9);
            r0.append(E1.d.w5, 13);
            r0.append(E1.d.z5, 16);
            r0.append(E1.d.x5, 14);
            r0.append(E1.d.u5, 11);
            r0.append(E1.d.y5, 15);
            r0.append(E1.d.v5, 12);
            r0.append(E1.d.n5, 38);
            r0.append(E1.d.Z4, 37);
            r0.append(E1.d.Y4, 39);
            r0.append(E1.d.m5, 40);
            r0.append(E1.d.X4, 20);
            r0.append(E1.d.l5, 36);
            r0.append(E1.d.O4, 5);
            r0.append(E1.d.a5, 91);
            r0.append(E1.d.i5, 91);
            r0.append(E1.d.d5, 91);
            r0.append(E1.d.I4, 91);
            r0.append(E1.d.G4, 91);
            r0.append(E1.d.s4, 23);
            r0.append(E1.d.u4, 27);
            r0.append(E1.d.w4, 30);
            r0.append(E1.d.x4, 8);
            r0.append(E1.d.t4, 33);
            r0.append(E1.d.v4, 2);
            r0.append(E1.d.q4, 22);
            r0.append(E1.d.r4, 21);
            r0.append(E1.d.o5, 41);
            r0.append(E1.d.U4, 42);
            r0.append(E1.d.F4, 87);
            r0.append(E1.d.E4, 88);
            r0.append(E1.d.A5, 76);
            r0.append(E1.d.L4, 61);
            r0.append(E1.d.N4, 62);
            r0.append(E1.d.M4, 63);
            r0.append(E1.d.r5, 69);
            r0.append(E1.d.W4, 70);
            r0.append(E1.d.B4, 71);
            r0.append(E1.d.z4, 72);
            r0.append(E1.d.A4, 73);
            r0.append(E1.d.C4, 74);
            r0.append(E1.d.y4, 75);
            r0.append(E1.d.p5, 84);
            r0.append(E1.d.q5, 86);
            r0.append(E1.d.p5, 83);
            r0.append(E1.d.V4, 85);
            r0.append(E1.d.o5, 87);
            r0.append(E1.d.U4, 88);
            r0.append(E1.d.R1, 89);
            r0.append(E1.d.D4, 90);
        }

        public void a(b bVar) {
            this.a = bVar.a;
            this.d = bVar.d;
            this.b = bVar.b;
            this.e = bVar.e;
            this.f = bVar.f;
            this.g = bVar.g;
            this.h = bVar.h;
            this.i = bVar.i;
            this.j = bVar.j;
            this.k = bVar.k;
            this.l = bVar.l;
            this.m = bVar.m;
            this.n = bVar.n;
            this.o = bVar.o;
            this.p = bVar.p;
            this.q = bVar.q;
            this.r = bVar.r;
            this.s = bVar.s;
            this.t = bVar.t;
            this.u = bVar.u;
            this.v = bVar.v;
            this.w = bVar.w;
            this.x = bVar.x;
            this.y = bVar.y;
            this.z = bVar.z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.a0 = bVar.a0;
            this.b0 = bVar.b0;
            this.c0 = bVar.c0;
            this.d0 = bVar.d0;
            this.e0 = bVar.e0;
            this.f0 = bVar.f0;
            this.g0 = bVar.g0;
            this.h0 = bVar.h0;
            this.i0 = bVar.i0;
            this.j0 = bVar.j0;
            this.m0 = bVar.m0;
            int[] iArr = bVar.k0;
            if (iArr == null || bVar.l0 != null) {
                this.k0 = null;
            } else {
                this.k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.l0 = bVar.l0;
            this.n0 = bVar.n0;
            this.o0 = bVar.o0;
            this.p0 = bVar.p0;
            this.q0 = bVar.q0;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E1.d.o4);
            this.b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = r0.get(index);
                switch (i2) {
                    case 1:
                        this.r = d.a(obtainStyledAttributes, index, this.r);
                        break;
                    case 2:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.q = d.a(obtainStyledAttributes, index, this.q);
                        break;
                    case 4:
                        this.p = d.a(obtainStyledAttributes, index, this.p);
                        break;
                    case 5:
                        this.A = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.x = d.a(obtainStyledAttributes, index, this.x);
                        break;
                    case 10:
                        this.w = d.a(obtainStyledAttributes, index, this.w);
                        break;
                    case 11:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                        break;
                    case 18:
                        this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                        break;
                    case 19:
                        this.h = obtainStyledAttributes.getFloat(index, this.h);
                        break;
                    case 20:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 21:
                        this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                        break;
                    case 22:
                        this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                        break;
                    case 23:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.j = d.a(obtainStyledAttributes, index, this.j);
                        break;
                    case 25:
                        this.k = d.a(obtainStyledAttributes, index, this.k);
                        break;
                    case 26:
                        this.G = obtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.l = d.a(obtainStyledAttributes, index, this.l);
                        break;
                    case 29:
                        this.m = d.a(obtainStyledAttributes, index, this.m);
                        break;
                    case 30:
                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.u = d.a(obtainStyledAttributes, index, this.u);
                        break;
                    case 32:
                        this.v = d.a(obtainStyledAttributes, index, this.v);
                        break;
                    case 33:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.o = d.a(obtainStyledAttributes, index, this.o);
                        break;
                    case 35:
                        this.n = d.a(obtainStyledAttributes, index, this.n);
                        break;
                    case 36:
                        this.z = obtainStyledAttributes.getFloat(index, this.z);
                        break;
                    case 37:
                        this.W = obtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.k(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.k(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.B = d.a(obtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = obtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.g0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.h0 = obtainStyledAttributes.getInt(index, this.h0);
                                        break;
                                    case 73:
                                        this.i0 = obtainStyledAttributes.getDimensionPixelSize(index, this.i0);
                                        break;
                                    case 74:
                                        this.l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.p0 = obtainStyledAttributes.getBoolean(index, this.p0);
                                        break;
                                    case 76:
                                        this.q0 = obtainStyledAttributes.getInt(index, this.q0);
                                        break;
                                    case 77:
                                        this.s = d.a(obtainStyledAttributes, index, this.s);
                                        break;
                                    case 78:
                                        this.t = d.a(obtainStyledAttributes, index, this.t);
                                        break;
                                    case 79:
                                        this.U = obtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.a0 = obtainStyledAttributes.getInt(index, this.a0);
                                        break;
                                    case 83:
                                        this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                        break;
                                    case 84:
                                        this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                        break;
                                    case 85:
                                        this.e0 = obtainStyledAttributes.getDimensionPixelSize(index, this.e0);
                                        break;
                                    case 86:
                                        this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                        break;
                                    case 87:
                                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                        break;
                                    case 88:
                                        this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                        break;
                                    case 89:
                                        this.m0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.i = obtainStyledAttributes.getBoolean(index, this.i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + r0.get(index));
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {
        public static SparseIntArray o;
        public boolean a = false;
        public int b = -1;
        public int c = 0;
        public String d = null;
        public int e = -1;
        public int f = 0;
        public float g = Float.NaN;
        public int h = -1;
        public float i = Float.NaN;
        public float j = Float.NaN;
        public int k = -1;
        public String l = null;
        public int m = -3;
        public int n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(E1.d.G5, 1);
            o.append(E1.d.I5, 2);
            o.append(E1.d.M5, 3);
            o.append(E1.d.F5, 4);
            o.append(E1.d.E5, 5);
            o.append(E1.d.D5, 6);
            o.append(E1.d.H5, 7);
            o.append(E1.d.L5, 8);
            o.append(E1.d.K5, 9);
            o.append(E1.d.J5, 10);
        }

        public void a(c cVar) {
            this.a = cVar.a;
            this.b = cVar.b;
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.i = cVar.i;
            this.g = cVar.g;
            this.h = cVar.h;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E1.d.C5);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    case 2:
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.d = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.d = w1.a.c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.b = d.a(obtainStyledAttributes, index, this.b);
                        break;
                    case 6:
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    case 7:
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    case 8:
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    case 9:
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.n = resourceId;
                            if (resourceId != -1) {
                                this.m = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i2 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") > 0) {
                                this.n = obtainStyledAttributes.getResourceId(index, -1);
                                this.m = -2;
                                break;
                            } else {
                                this.m = -1;
                                break;
                            }
                        } else {
                            this.m = obtainStyledAttributes.getInteger(index, this.n);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.d = dVar.d;
            this.e = dVar.e;
            this.c = dVar.c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E1.d.V5);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == E1.d.X5) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == E1.d.W5) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = d.b()[this.b];
                } else if (index == E1.d.Z5) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == E1.d.Y5) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {
        public static SparseIntArray o;
        public boolean a = false;
        public float b = 0.0f;
        public float c = 0.0f;
        public float d = 0.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = Float.NaN;
        public float h = Float.NaN;
        public int i = -1;
        public float j = 0.0f;
        public float k = 0.0f;
        public float l = 0.0f;
        public boolean m = false;
        public float n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            o = sparseIntArray;
            sparseIntArray.append(E1.d.m6, 1);
            o.append(E1.d.n6, 2);
            o.append(E1.d.o6, 3);
            o.append(E1.d.k6, 4);
            o.append(E1.d.l6, 5);
            o.append(E1.d.g6, 6);
            o.append(E1.d.h6, 7);
            o.append(E1.d.i6, 8);
            o.append(E1.d.j6, 9);
            o.append(E1.d.p6, 10);
            o.append(E1.d.q6, 11);
            o.append(E1.d.r6, 12);
        }

        public void a(e eVar) {
            this.a = eVar.a;
            this.b = eVar.b;
            this.c = eVar.c;
            this.d = eVar.d;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.h = eVar.h;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.l = eVar.l;
            this.m = eVar.m;
            this.n = eVar.n;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, E1.d.f6);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (o.get(index)) {
                    case 1:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    case 3:
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    case 4:
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    case 5:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 6:
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    case 7:
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    case 8:
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    case 9:
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    case 10:
                        this.l = obtainStyledAttributes.getDimension(index, this.l);
                        break;
                    case 11:
                        this.m = true;
                        this.n = obtainStyledAttributes.getDimension(index, this.n);
                        break;
                    case 12:
                        this.i = d.a(obtainStyledAttributes, index, this.i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        h.append(E1.d.i0, 25);
        h.append(E1.d.j0, 26);
        h.append(E1.d.l0, 29);
        h.append(E1.d.m0, 30);
        h.append(E1.d.s0, 36);
        h.append(E1.d.r0, 35);
        h.append(E1.d.P, 4);
        h.append(E1.d.O, 3);
        h.append(E1.d.K, 1);
        h.append(E1.d.M, 91);
        h.append(E1.d.L, 92);
        h.append(E1.d.B0, 6);
        h.append(E1.d.C0, 7);
        h.append(E1.d.W, 17);
        h.append(E1.d.X, 18);
        h.append(E1.d.Y, 19);
        h.append(E1.d.G, 99);
        h.append(E1.d.c, 27);
        h.append(E1.d.n0, 32);
        h.append(E1.d.o0, 33);
        h.append(E1.d.V, 10);
        h.append(E1.d.U, 9);
        h.append(E1.d.F0, 13);
        h.append(E1.d.I0, 16);
        h.append(E1.d.G0, 14);
        h.append(E1.d.D0, 11);
        h.append(E1.d.H0, 15);
        h.append(E1.d.E0, 12);
        h.append(E1.d.v0, 40);
        h.append(E1.d.g0, 39);
        h.append(E1.d.f0, 41);
        h.append(E1.d.u0, 42);
        h.append(E1.d.e0, 20);
        h.append(E1.d.t0, 37);
        h.append(E1.d.T, 5);
        h.append(E1.d.h0, 87);
        h.append(E1.d.q0, 87);
        h.append(E1.d.k0, 87);
        h.append(E1.d.N, 87);
        h.append(E1.d.J, 87);
        h.append(E1.d.h, 24);
        h.append(E1.d.j, 28);
        h.append(E1.d.v, 31);
        h.append(E1.d.w, 8);
        h.append(E1.d.i, 34);
        h.append(E1.d.k, 2);
        h.append(E1.d.f, 23);
        h.append(E1.d.g, 21);
        h.append(E1.d.w0, 95);
        h.append(E1.d.Z, 96);
        h.append(E1.d.e, 22);
        h.append(E1.d.l, 43);
        h.append(E1.d.y, 44);
        h.append(E1.d.t, 45);
        h.append(E1.d.u, 46);
        h.append(E1.d.s, 60);
        h.append(E1.d.q, 47);
        h.append(E1.d.r, 48);
        h.append(E1.d.m, 49);
        h.append(E1.d.n, 50);
        h.append(E1.d.o, 51);
        h.append(E1.d.p, 52);
        h.append(E1.d.x, 53);
        h.append(E1.d.x0, 54);
        h.append(E1.d.a0, 55);
        h.append(E1.d.y0, 56);
        h.append(E1.d.b0, 57);
        h.append(E1.d.z0, 58);
        h.append(E1.d.c0, 59);
        h.append(E1.d.Q, 61);
        h.append(E1.d.S, 62);
        h.append(E1.d.R, 63);
        h.append(E1.d.z, 64);
        h.append(E1.d.S0, 65);
        h.append(E1.d.F, 66);
        h.append(E1.d.T0, 67);
        h.append(E1.d.L0, 79);
        h.append(E1.d.d, 38);
        h.append(E1.d.K0, 68);
        h.append(E1.d.A0, 69);
        h.append(E1.d.d0, 70);
        h.append(E1.d.J0, 97);
        h.append(E1.d.D, 71);
        h.append(E1.d.B, 72);
        h.append(E1.d.C, 73);
        h.append(E1.d.E, 74);
        h.append(E1.d.A, 75);
        h.append(E1.d.M0, 76);
        h.append(E1.d.p0, 77);
        h.append(E1.d.U0, 78);
        h.append(E1.d.I, 80);
        h.append(E1.d.H, 81);
        h.append(E1.d.N0, 82);
        h.append(E1.d.R0, 83);
        h.append(E1.d.Q0, 84);
        h.append(E1.d.P0, 85);
        h.append(E1.d.O0, 86);
        i.append(E1.d.x3, 6);
        i.append(E1.d.x3, 7);
        i.append(E1.d.s2, 27);
        i.append(E1.d.A3, 13);
        i.append(E1.d.D3, 16);
        i.append(E1.d.B3, 14);
        i.append(E1.d.y3, 11);
        i.append(E1.d.C3, 15);
        i.append(E1.d.z3, 12);
        i.append(E1.d.r3, 40);
        i.append(E1.d.k3, 39);
        i.append(E1.d.j3, 41);
        i.append(E1.d.q3, 42);
        i.append(E1.d.i3, 20);
        i.append(E1.d.p3, 37);
        i.append(E1.d.c3, 5);
        i.append(E1.d.l3, 87);
        i.append(E1.d.o3, 87);
        i.append(E1.d.m3, 87);
        i.append(E1.d.Z2, 87);
        i.append(E1.d.Y2, 87);
        i.append(E1.d.x2, 24);
        i.append(E1.d.z2, 28);
        i.append(E1.d.L2, 31);
        i.append(E1.d.M2, 8);
        i.append(E1.d.y2, 34);
        i.append(E1.d.A2, 2);
        i.append(E1.d.v2, 23);
        i.append(E1.d.w2, 21);
        i.append(E1.d.s3, 95);
        i.append(E1.d.d3, 96);
        i.append(E1.d.u2, 22);
        i.append(E1.d.B2, 43);
        i.append(E1.d.O2, 44);
        i.append(E1.d.J2, 45);
        i.append(E1.d.K2, 46);
        i.append(E1.d.I2, 60);
        i.append(E1.d.G2, 47);
        i.append(E1.d.H2, 48);
        i.append(E1.d.C2, 49);
        i.append(E1.d.D2, 50);
        i.append(E1.d.E2, 51);
        i.append(E1.d.F2, 52);
        i.append(E1.d.N2, 53);
        i.append(E1.d.t3, 54);
        i.append(E1.d.e3, 55);
        i.append(E1.d.u3, 56);
        i.append(E1.d.f3, 57);
        i.append(E1.d.v3, 58);
        i.append(E1.d.g3, 59);
        i.append(E1.d.b3, 62);
        i.append(E1.d.a3, 63);
        i.append(E1.d.P2, 64);
        i.append(E1.d.O3, 65);
        i.append(E1.d.V2, 66);
        i.append(E1.d.P3, 67);
        i.append(E1.d.G3, 79);
        i.append(E1.d.t2, 38);
        i.append(E1.d.H3, 98);
        i.append(E1.d.F3, 68);
        i.append(E1.d.w3, 69);
        i.append(E1.d.h3, 70);
        i.append(E1.d.T2, 71);
        i.append(E1.d.R2, 72);
        i.append(E1.d.S2, 73);
        i.append(E1.d.U2, 74);
        i.append(E1.d.Q2, 75);
        i.append(E1.d.I3, 76);
        i.append(E1.d.n3, 77);
        i.append(E1.d.Q3, 78);
        i.append(E1.d.X2, 80);
        i.append(E1.d.W2, 81);
        i.append(E1.d.J3, 82);
        i.append(E1.d.N3, 83);
        i.append(E1.d.M3, 84);
        i.append(E1.d.L3, 85);
        i.append(E1.d.K3, 86);
        i.append(E1.d.E3, 97);
    }

    public static /* synthetic */ int a(TypedArray typedArray, int i2, int i3) {
        return j(typedArray, i2, i3);
    }

    public static /* synthetic */ int[] b() {
        return g;
    }

    public static int j(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L3
            return
        L3:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L71
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L2a
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L26
            r6 = -3
            if (r5 == r6) goto L20
            if (r5 == r0) goto L22
            r6 = -1
            if (r5 == r6) goto L22
        L20:
            r5 = r2
            goto L2f
        L22:
            r3 = r2
            r2 = r5
            r5 = r3
            goto L2f
        L26:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2f
        L2a:
            int r5 = r5.getDimensionPixelSize(r6, r2)
            goto L22
        L2f:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r6 == 0) goto L41
            androidx.constraintlayout.widget.ConstraintLayout$b r4 = (androidx.constraintlayout.widget.ConstraintLayout.b) r4
            if (r7 != 0) goto L3c
            r4.width = r2
            r4.a0 = r5
            goto L70
        L3c:
            r4.height = r2
            r4.b0 = r5
            goto L70
        L41:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.b
            if (r6 == 0) goto L53
            androidx.constraintlayout.widget.d$b r4 = (androidx.constraintlayout.widget.d.b) r4
            if (r7 != 0) goto L4e
            r4.d = r2
            r4.n0 = r5
            goto L70
        L4e:
            r4.e = r2
            r4.o0 = r5
            goto L70
        L53:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.d.a.a
            if (r6 == 0) goto L70
            androidx.constraintlayout.widget.d$a$a r4 = (androidx.constraintlayout.widget.d.a.a) r4
            if (r7 != 0) goto L66
            r6 = 23
            r4.b(r6, r2)
            r6 = 80
            r4.d(r6, r5)
            goto L70
        L66:
            r6 = 21
            r4.b(r6, r2)
            r6 = 81
            r4.d(r6, r5)
        L70:
            return
        L71:
            java.lang.String r5 = r5.getString(r6)
            l(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.k(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void l(Object obj, String str, int i2) {
        if (str == null) {
            return;
        }
        int indexOf = str.indexOf(61);
        int length = str.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = str.substring(0, indexOf);
        String substring2 = str.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if ("ratio".equalsIgnoreCase(trim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    m(bVar, trim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = trim2;
                    return;
                } else {
                    if (obj instanceof a.a) {
                        ((a.a) obj).c(5, trim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = parseFloat;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i2 == 0) {
                            bVar3.d = 0;
                            bVar3.W = parseFloat;
                        } else {
                            bVar3.e = 0;
                            bVar3.V = parseFloat;
                        }
                    } else if (obj instanceof a.a) {
                        a.a aVar = (a.a) obj;
                        if (i2 == 0) {
                            aVar.b(23, 0);
                            aVar.a(39, parseFloat);
                        } else {
                            aVar.b(21, 0);
                            aVar.a(40, parseFloat);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(trim)) {
                        return;
                    }
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = max;
                            bVar4.P = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = max;
                            bVar4.Q = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i2 == 0) {
                            bVar5.d = 0;
                            bVar5.f0 = max;
                            bVar5.Z = 2;
                        } else {
                            bVar5.e = 0;
                            bVar5.g0 = max;
                            bVar5.a0 = 2;
                        }
                    } else if (obj instanceof a.a) {
                        a.a aVar2 = (a.a) obj;
                        if (i2 == 0) {
                            aVar2.b(23, 0);
                            aVar2.b(54, 2);
                        } else {
                            aVar2.b(21, 0);
                            aVar2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void m(ConstraintLayout.b bVar, String str) {
        float f = Float.NaN;
        int i2 = -1;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (substring.equalsIgnoreCase("W")) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i3);
                    if (substring2.length() > 0) {
                        f = Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i3, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            f = i2 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = f;
        bVar.K = i2;
    }

    public static void o(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.a aVar2 = new a.a();
        aVar.h = aVar2;
        aVar.d.a = false;
        aVar.e.b = false;
        aVar.c.a = false;
        aVar.f.a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (i.get(index)) {
                case 2:
                    aVar2.b(2, typedArray.getDimensionPixelSize(index, aVar.e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + h.get(index));
                    break;
                case 5:
                    aVar2.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.b(6, typedArray.getDimensionPixelOffset(index, aVar.e.E));
                    break;
                case 7:
                    aVar2.b(7, typedArray.getDimensionPixelOffset(index, aVar.e.F));
                    break;
                case 8:
                    aVar2.b(8, typedArray.getDimensionPixelSize(index, aVar.e.L));
                    break;
                case 11:
                    aVar2.b(11, typedArray.getDimensionPixelSize(index, aVar.e.R));
                    break;
                case 12:
                    aVar2.b(12, typedArray.getDimensionPixelSize(index, aVar.e.S));
                    break;
                case 13:
                    aVar2.b(13, typedArray.getDimensionPixelSize(index, aVar.e.O));
                    break;
                case 14:
                    aVar2.b(14, typedArray.getDimensionPixelSize(index, aVar.e.Q));
                    break;
                case 15:
                    aVar2.b(15, typedArray.getDimensionPixelSize(index, aVar.e.T));
                    break;
                case 16:
                    aVar2.b(16, typedArray.getDimensionPixelSize(index, aVar.e.P));
                    break;
                case 17:
                    aVar2.b(17, typedArray.getDimensionPixelOffset(index, aVar.e.f));
                    break;
                case 18:
                    aVar2.b(18, typedArray.getDimensionPixelOffset(index, aVar.e.g));
                    break;
                case 19:
                    aVar2.a(19, typedArray.getFloat(index, aVar.e.h));
                    break;
                case 20:
                    aVar2.a(20, typedArray.getFloat(index, aVar.e.y));
                    break;
                case 21:
                    aVar2.b(21, typedArray.getLayoutDimension(index, aVar.e.e));
                    break;
                case 22:
                    aVar2.b(22, g[typedArray.getInt(index, aVar.c.b)]);
                    break;
                case 23:
                    aVar2.b(23, typedArray.getLayoutDimension(index, aVar.e.d));
                    break;
                case 24:
                    aVar2.b(24, typedArray.getDimensionPixelSize(index, aVar.e.H));
                    break;
                case 27:
                    aVar2.b(27, typedArray.getInt(index, aVar.e.G));
                    break;
                case 28:
                    aVar2.b(28, typedArray.getDimensionPixelSize(index, aVar.e.I));
                    break;
                case 31:
                    aVar2.b(31, typedArray.getDimensionPixelSize(index, aVar.e.M));
                    break;
                case 34:
                    aVar2.b(34, typedArray.getDimensionPixelSize(index, aVar.e.J));
                    break;
                case 37:
                    aVar2.a(37, typedArray.getFloat(index, aVar.e.z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.a);
                    aVar.a = resourceId;
                    aVar2.b(38, resourceId);
                    break;
                case 39:
                    aVar2.a(39, typedArray.getFloat(index, aVar.e.W));
                    break;
                case 40:
                    aVar2.a(40, typedArray.getFloat(index, aVar.e.V));
                    break;
                case 41:
                    aVar2.b(41, typedArray.getInt(index, aVar.e.X));
                    break;
                case 42:
                    aVar2.b(42, typedArray.getInt(index, aVar.e.Y));
                    break;
                case 43:
                    aVar2.a(43, typedArray.getFloat(index, aVar.c.d));
                    break;
                case 44:
                    aVar2.d(44, true);
                    aVar2.a(44, typedArray.getDimension(index, aVar.f.n));
                    break;
                case 45:
                    aVar2.a(45, typedArray.getFloat(index, aVar.f.c));
                    break;
                case 46:
                    aVar2.a(46, typedArray.getFloat(index, aVar.f.d));
                    break;
                case 47:
                    aVar2.a(47, typedArray.getFloat(index, aVar.f.e));
                    break;
                case 48:
                    aVar2.a(48, typedArray.getFloat(index, aVar.f.f));
                    break;
                case 49:
                    aVar2.a(49, typedArray.getDimension(index, aVar.f.g));
                    break;
                case 50:
                    aVar2.a(50, typedArray.getDimension(index, aVar.f.h));
                    break;
                case 51:
                    aVar2.a(51, typedArray.getDimension(index, aVar.f.j));
                    break;
                case 52:
                    aVar2.a(52, typedArray.getDimension(index, aVar.f.k));
                    break;
                case 53:
                    aVar2.a(53, typedArray.getDimension(index, aVar.f.l));
                    break;
                case 54:
                    aVar2.b(54, typedArray.getInt(index, aVar.e.Z));
                    break;
                case 55:
                    aVar2.b(55, typedArray.getInt(index, aVar.e.a0));
                    break;
                case 56:
                    aVar2.b(56, typedArray.getDimensionPixelSize(index, aVar.e.b0));
                    break;
                case 57:
                    aVar2.b(57, typedArray.getDimensionPixelSize(index, aVar.e.c0));
                    break;
                case 58:
                    aVar2.b(58, typedArray.getDimensionPixelSize(index, aVar.e.d0));
                    break;
                case 59:
                    aVar2.b(59, typedArray.getDimensionPixelSize(index, aVar.e.e0));
                    break;
                case 60:
                    aVar2.a(60, typedArray.getFloat(index, aVar.f.b));
                    break;
                case 62:
                    aVar2.b(62, typedArray.getDimensionPixelSize(index, aVar.e.C));
                    break;
                case 63:
                    aVar2.a(63, typedArray.getFloat(index, aVar.e.D));
                    break;
                case 64:
                    aVar2.b(64, j(typedArray, index, aVar.d.b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar2.c(65, typedArray.getString(index));
                        break;
                    } else {
                        aVar2.c(65, w1.a.c[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    aVar2.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.a(67, typedArray.getFloat(index, aVar.d.i));
                    break;
                case 68:
                    aVar2.a(68, typedArray.getFloat(index, aVar.c.e));
                    break;
                case 69:
                    aVar2.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aVar2.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aVar2.b(72, typedArray.getInt(index, aVar.e.h0));
                    break;
                case 73:
                    aVar2.b(73, typedArray.getDimensionPixelSize(index, aVar.e.i0));
                    break;
                case 74:
                    aVar2.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.d(75, typedArray.getBoolean(index, aVar.e.p0));
                    break;
                case 76:
                    aVar2.b(76, typedArray.getInt(index, aVar.d.e));
                    break;
                case 77:
                    aVar2.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.b(78, typedArray.getInt(index, aVar.c.c));
                    break;
                case 79:
                    aVar2.a(79, typedArray.getFloat(index, aVar.d.g));
                    break;
                case 80:
                    aVar2.d(80, typedArray.getBoolean(index, aVar.e.n0));
                    break;
                case 81:
                    aVar2.d(81, typedArray.getBoolean(index, aVar.e.o0));
                    break;
                case 82:
                    aVar2.b(82, typedArray.getInteger(index, aVar.d.c));
                    break;
                case 83:
                    aVar2.b(83, j(typedArray, index, aVar.f.i));
                    break;
                case 84:
                    aVar2.b(84, typedArray.getInteger(index, aVar.d.k));
                    break;
                case 85:
                    aVar2.a(85, typedArray.getFloat(index, aVar.d.j));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        aVar2.b(89, aVar.d.n);
                        c cVar = aVar.d;
                        if (cVar.n != -1) {
                            cVar.m = -2;
                            aVar2.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        aVar2.c(90, aVar.d.l);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar2.b(89, aVar.d.n);
                            aVar.d.m = -2;
                            aVar2.b(88, -2);
                            break;
                        } else {
                            aVar.d.m = -1;
                            aVar2.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = aVar.d;
                        cVar2.m = typedArray.getInteger(index, cVar2.n);
                        aVar2.b(88, aVar.d.m);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + h.get(index));
                    break;
                case 93:
                    aVar2.b(93, typedArray.getDimensionPixelSize(index, aVar.e.N));
                    break;
                case 94:
                    aVar2.b(94, typedArray.getDimensionPixelSize(index, aVar.e.U));
                    break;
                case 95:
                    k(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    k(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.b(97, typedArray.getInt(index, aVar.e.q0));
                    break;
                case 98:
                    if (D1.b.z) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.a);
                        aVar.a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.b = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.b = typedArray.getString(index);
                        break;
                    } else {
                        aVar.a = typedArray.getResourceId(index, aVar.a);
                        break;
                    }
                case 99:
                    aVar2.d(99, typedArray.getBoolean(index, aVar.e.i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + D1.a.a(childAt));
            } else {
                if (this.e && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        a aVar = (a) this.f.get(Integer.valueOf(id));
                        if (aVar != null) {
                            if (childAt instanceof androidx.constraintlayout.widget.a) {
                                aVar.e.j0 = 1;
                                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                                aVar2.setId(id);
                                aVar2.setType(aVar.e.h0);
                                aVar2.setMargin(aVar.e.i0);
                                aVar2.setAllowsGoneWidget(aVar.e.p0);
                                b bVar = aVar.e;
                                int[] iArr = bVar.k0;
                                if (iArr != null) {
                                    aVar2.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.l0;
                                    if (str != null) {
                                        bVar.k0 = f(aVar2, str);
                                        aVar2.setReferencedIds(aVar.e.k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z) {
                                androidx.constraintlayout.widget.b.c(childAt, aVar.g);
                            }
                            childAt.setLayoutParams(bVar2);
                            d dVar = aVar.c;
                            if (dVar.c == 0) {
                                childAt.setVisibility(dVar.b);
                            }
                            childAt.setAlpha(aVar.c.d);
                            childAt.setRotation(aVar.f.b);
                            childAt.setRotationX(aVar.f.c);
                            childAt.setRotationY(aVar.f.d);
                            childAt.setScaleX(aVar.f.e);
                            childAt.setScaleY(aVar.f.f);
                            e eVar = aVar.f;
                            if (eVar.i != -1) {
                                if (childAt.getParent().findViewById(aVar.f.i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.g)) {
                                    childAt.setPivotX(aVar.f.g);
                                }
                                if (!Float.isNaN(aVar.f.h)) {
                                    childAt.setPivotY(aVar.f.h);
                                }
                            }
                            childAt.setTranslationX(aVar.f.j);
                            childAt.setTranslationY(aVar.f.k);
                            childAt.setTranslationZ(aVar.f.l);
                            e eVar2 = aVar.f;
                            if (eVar2.m) {
                                childAt.setElevation(eVar2.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = (a) this.f.get(num);
            if (aVar3 != null) {
                if (aVar3.e.j0 == 1) {
                    androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                    aVar4.setId(num.intValue());
                    b bVar3 = aVar3.e;
                    int[] iArr2 = bVar3.k0;
                    if (iArr2 != null) {
                        aVar4.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.l0;
                        if (str2 != null) {
                            bVar3.k0 = f(aVar4, str2);
                            aVar4.setReferencedIds(aVar3.e.k0);
                        }
                    }
                    aVar4.setType(aVar3.e.h0);
                    aVar4.setMargin(aVar3.e.i0);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    aVar4.m();
                    aVar3.b(generateDefaultLayoutParams);
                    constraintLayout.addView(aVar4, generateDefaultLayoutParams);
                }
                if (aVar3.e.a) {
                    androidx.constraintlayout.widget.e eVar3 = new androidx.constraintlayout.widget.e(constraintLayout.getContext());
                    eVar3.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.b(generateDefaultLayoutParams2);
                    constraintLayout.addView(eVar3, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof androidx.constraintlayout.widget.c) {
                ((androidx.constraintlayout.widget.c) childAt2).d(constraintLayout);
            }
        }
    }

    public void d(Context context, int i2) {
        e((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b layoutParams = childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f.containsKey(Integer.valueOf(id))) {
                this.f.put(Integer.valueOf(id), new a());
            }
            a aVar = (a) this.f.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = androidx.constraintlayout.widget.b.a(this.d, childAt);
                a.a(aVar, id, layoutParams);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.b = childAt.getRotation();
                aVar.f.c = childAt.getRotationX();
                aVar.f.d = childAt.getRotationY();
                aVar.f.e = childAt.getScaleX();
                aVar.f.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f;
                    eVar.g = pivotX;
                    eVar.h = pivotY;
                }
                aVar.f.j = childAt.getTranslationX();
                aVar.f.k = childAt.getTranslationY();
                aVar.f.l = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.m) {
                    eVar2.n = childAt.getElevation();
                }
                if (childAt instanceof androidx.constraintlayout.widget.a) {
                    androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                    aVar.e.p0 = aVar2.getAllowsGoneWidget();
                    aVar.e.k0 = aVar2.getReferencedIds();
                    aVar.e.h0 = aVar2.getType();
                    aVar.e.i0 = aVar2.getMargin();
                }
            }
        }
    }

    public final int[] f(View view, String str) {
        int i2;
        Object h2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = E1.c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (h2 = view.getParent().h(0, trim)) != null && (h2 instanceof Integer)) {
                i2 = ((Integer) h2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    public final a g(Context context, AttributeSet attributeSet, boolean z) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? E1.d.r2 : E1.d.b);
        n(aVar, obtainStyledAttributes, z);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void h(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a g2 = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        g2.e.a = true;
                    }
                    this.f.put(Integer.valueOf(g2.a), g2);
                }
            }
        } catch (IOException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:140)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:35)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.i(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void n(a aVar, TypedArray typedArray, boolean z) {
        if (z) {
            o(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            if (index != E1.d.d && E1.d.v != index && E1.d.w != index) {
                aVar.d.a = true;
                aVar.e.b = true;
                aVar.c.a = true;
                aVar.f.a = true;
            }
            switch (h.get(index)) {
                case 1:
                    b bVar = aVar.e;
                    bVar.r = j(typedArray, index, bVar.r);
                    break;
                case 2:
                    b bVar2 = aVar.e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.e;
                    bVar3.q = j(typedArray, index, bVar3.q);
                    break;
                case 4:
                    b bVar4 = aVar.e;
                    bVar4.p = j(typedArray, index, bVar4.p);
                    break;
                case 5:
                    aVar.e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.e;
                    bVar8.x = j(typedArray, index, bVar8.x);
                    break;
                case 10:
                    b bVar9 = aVar.e;
                    bVar9.w = j(typedArray, index, bVar9.w);
                    break;
                case 11:
                    b bVar10 = aVar.e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.e;
                    bVar16.f = typedArray.getDimensionPixelOffset(index, bVar16.f);
                    break;
                case 18:
                    b bVar17 = aVar.e;
                    bVar17.g = typedArray.getDimensionPixelOffset(index, bVar17.g);
                    break;
                case 19:
                    b bVar18 = aVar.e;
                    bVar18.h = typedArray.getFloat(index, bVar18.h);
                    break;
                case 20:
                    b bVar19 = aVar.e;
                    bVar19.y = typedArray.getFloat(index, bVar19.y);
                    break;
                case 21:
                    b bVar20 = aVar.e;
                    bVar20.e = typedArray.getLayoutDimension(index, bVar20.e);
                    break;
                case 22:
                    d dVar = aVar.c;
                    dVar.b = typedArray.getInt(index, dVar.b);
                    d dVar2 = aVar.c;
                    dVar2.b = g[dVar2.b];
                    break;
                case 23:
                    b bVar21 = aVar.e;
                    bVar21.d = typedArray.getLayoutDimension(index, bVar21.d);
                    break;
                case 24:
                    b bVar22 = aVar.e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.e;
                    bVar23.j = j(typedArray, index, bVar23.j);
                    break;
                case 26:
                    b bVar24 = aVar.e;
                    bVar24.k = j(typedArray, index, bVar24.k);
                    break;
                case 27:
                    b bVar25 = aVar.e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.e;
                    bVar27.l = j(typedArray, index, bVar27.l);
                    break;
                case 30:
                    b bVar28 = aVar.e;
                    bVar28.m = j(typedArray, index, bVar28.m);
                    break;
                case 31:
                    b bVar29 = aVar.e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.e;
                    bVar30.u = j(typedArray, index, bVar30.u);
                    break;
                case 33:
                    b bVar31 = aVar.e;
                    bVar31.v = j(typedArray, index, bVar31.v);
                    break;
                case 34:
                    b bVar32 = aVar.e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.e;
                    bVar33.o = j(typedArray, index, bVar33.o);
                    break;
                case 36:
                    b bVar34 = aVar.e;
                    bVar34.n = j(typedArray, index, bVar34.n);
                    break;
                case 37:
                    b bVar35 = aVar.e;
                    bVar35.z = typedArray.getFloat(index, bVar35.z);
                    break;
                case 38:
                    aVar.a = typedArray.getResourceId(index, aVar.a);
                    break;
                case 39:
                    b bVar36 = aVar.e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    d dVar3 = aVar.c;
                    dVar3.d = typedArray.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = aVar.f;
                    eVar.m = true;
                    eVar.n = typedArray.getDimension(index, eVar.n);
                    break;
                case 45:
                    e eVar2 = aVar.f;
                    eVar2.c = typedArray.getFloat(index, eVar2.c);
                    break;
                case 46:
                    e eVar3 = aVar.f;
                    eVar3.d = typedArray.getFloat(index, eVar3.d);
                    break;
                case 47:
                    e eVar4 = aVar.f;
                    eVar4.e = typedArray.getFloat(index, eVar4.e);
                    break;
                case 48:
                    e eVar5 = aVar.f;
                    eVar5.f = typedArray.getFloat(index, eVar5.f);
                    break;
                case 49:
                    e eVar6 = aVar.f;
                    eVar6.g = typedArray.getDimension(index, eVar6.g);
                    break;
                case 50:
                    e eVar7 = aVar.f;
                    eVar7.h = typedArray.getDimension(index, eVar7.h);
                    break;
                case 51:
                    e eVar8 = aVar.f;
                    eVar8.j = typedArray.getDimension(index, eVar8.j);
                    break;
                case 52:
                    e eVar9 = aVar.f;
                    eVar9.k = typedArray.getDimension(index, eVar9.k);
                    break;
                case 53:
                    e eVar10 = aVar.f;
                    eVar10.l = typedArray.getDimension(index, eVar10.l);
                    break;
                case 54:
                    b bVar40 = aVar.e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.e;
                    bVar41.a0 = typedArray.getInt(index, bVar41.a0);
                    break;
                case 56:
                    b bVar42 = aVar.e;
                    bVar42.b0 = typedArray.getDimensionPixelSize(index, bVar42.b0);
                    break;
                case 57:
                    b bVar43 = aVar.e;
                    bVar43.c0 = typedArray.getDimensionPixelSize(index, bVar43.c0);
                    break;
                case 58:
                    b bVar44 = aVar.e;
                    bVar44.d0 = typedArray.getDimensionPixelSize(index, bVar44.d0);
                    break;
                case 59:
                    b bVar45 = aVar.e;
                    bVar45.e0 = typedArray.getDimensionPixelSize(index, bVar45.e0);
                    break;
                case 60:
                    e eVar11 = aVar.f;
                    eVar11.b = typedArray.getFloat(index, eVar11.b);
                    break;
                case 61:
                    b bVar46 = aVar.e;
                    bVar46.B = j(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.d;
                    cVar.b = j(typedArray, index, cVar.b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.d.d = typedArray.getString(index);
                        break;
                    } else {
                        aVar.d.d = w1.a.c[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    aVar.d.f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.d;
                    cVar2.i = typedArray.getFloat(index, cVar2.i);
                    break;
                case 68:
                    d dVar4 = aVar.c;
                    dVar4.e = typedArray.getFloat(index, dVar4.e);
                    break;
                case 69:
                    aVar.e.f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.e.g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.e;
                    bVar49.h0 = typedArray.getInt(index, bVar49.h0);
                    break;
                case 73:
                    b bVar50 = aVar.e;
                    bVar50.i0 = typedArray.getDimensionPixelSize(index, bVar50.i0);
                    break;
                case 74:
                    aVar.e.l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.e;
                    bVar51.p0 = typedArray.getBoolean(index, bVar51.p0);
                    break;
                case 76:
                    c cVar3 = aVar.d;
                    cVar3.e = typedArray.getInt(index, cVar3.e);
                    break;
                case 77:
                    aVar.e.m0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.c;
                    dVar5.c = typedArray.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = aVar.d;
                    cVar4.g = typedArray.getFloat(index, cVar4.g);
                    break;
                case 80:
                    b bVar52 = aVar.e;
                    bVar52.n0 = typedArray.getBoolean(index, bVar52.n0);
                    break;
                case 81:
                    b bVar53 = aVar.e;
                    bVar53.o0 = typedArray.getBoolean(index, bVar53.o0);
                    break;
                case 82:
                    c cVar5 = aVar.d;
                    cVar5.c = typedArray.getInteger(index, cVar5.c);
                    break;
                case 83:
                    e eVar12 = aVar.f;
                    eVar12.i = j(typedArray, index, eVar12.i);
                    break;
                case 84:
                    c cVar6 = aVar.d;
                    cVar6.k = typedArray.getInteger(index, cVar6.k);
                    break;
                case 85:
                    c cVar7 = aVar.d;
                    cVar7.j = typedArray.getFloat(index, cVar7.j);
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        aVar.d.n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.d;
                        if (cVar8.n != -1) {
                            cVar8.m = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        aVar.d.l = typedArray.getString(index);
                        if (aVar.d.l.indexOf("/") > 0) {
                            aVar.d.n = typedArray.getResourceId(index, -1);
                            aVar.d.m = -2;
                            break;
                        } else {
                            aVar.d.m = -1;
                            break;
                        }
                    } else {
                        c cVar9 = aVar.d;
                        cVar9.m = typedArray.getInteger(index, cVar9.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.e;
                    bVar54.s = j(typedArray, index, bVar54.s);
                    break;
                case 92:
                    b bVar55 = aVar.e;
                    bVar55.t = j(typedArray, index, bVar55.t);
                    break;
                case 93:
                    b bVar56 = aVar.e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    k(aVar.e, typedArray, index, 0);
                    break;
                case 96:
                    k(aVar.e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.e;
                    bVar58.q0 = typedArray.getInt(index, bVar58.q0);
                    break;
            }
        }
        b bVar59 = aVar.e;
        if (bVar59.l0 != null) {
            bVar59.k0 = null;
        }
    }
}
