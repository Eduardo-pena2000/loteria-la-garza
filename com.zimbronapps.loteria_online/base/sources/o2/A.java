package O2;

import P2.K;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import s7.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public static final a r = new b().o("").a();
    public static final String s = K.w0(0);
    public static final String t = K.w0(17);
    public static final String u = K.w0(1);
    public static final String v = K.w0(2);
    public static final String w = K.w0(3);
    public static final String x = K.w0(18);
    public static final String y = K.w0(4);
    public static final String z = K.w0(5);
    public static final String A = K.w0(6);
    public static final String B = K.w0(7);
    public static final String C = K.w0(8);
    public static final String D = K.w0(9);
    public static final String E = K.w0(10);
    public static final String F = K.w0(11);
    public static final String G = K.w0(12);
    public static final String H = K.w0(13);
    public static final String I = K.w0(14);
    public static final String J = K.w0(15);
    public static final String K = K.w0(16);

    public static final class b {
        public CharSequence a;
        public Bitmap b;
        public Layout.Alignment c;
        public Layout.Alignment d;
        public float e;
        public int f;
        public int g;
        public float h;
        public int i;
        public int j;
        public float k;
        public float l;
        public float m;
        public boolean n;
        public int o;
        public int p;
        public float q;

        public /* synthetic */ b(a aVar, a aVar2) {
            this(aVar);
        }

        public a a() {
            return new a(this.a, this.c, this.d, this.b, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, null);
        }

        public b b() {
            this.n = false;
            return this;
        }

        public int c() {
            return this.g;
        }

        public int d() {
            return this.i;
        }

        public CharSequence e() {
            return this.a;
        }

        public b f(Bitmap bitmap) {
            this.b = bitmap;
            return this;
        }

        public b g(float f) {
            this.m = f;
            return this;
        }

        public b h(float f, int i) {
            this.e = f;
            this.f = i;
            return this;
        }

        public b i(int i) {
            this.g = i;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.d = alignment;
            return this;
        }

        public b k(float f) {
            this.h = f;
            return this;
        }

        public b l(int i) {
            this.i = i;
            return this;
        }

        public b m(float f) {
            this.q = f;
            return this;
        }

        public b n(float f) {
            this.l = f;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.c = alignment;
            return this;
        }

        public b q(float f, int i) {
            this.k = f;
            this.j = i;
            return this;
        }

        public b r(int i) {
            this.p = i;
            return this;
        }

        public b s(int i) {
            this.o = i;
            this.n = true;
            return this;
        }

        public b() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = -3.4028235E38f;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = -3.4028235E38f;
            this.i = Integer.MIN_VALUE;
            this.j = Integer.MIN_VALUE;
            this.k = -3.4028235E38f;
            this.l = -3.4028235E38f;
            this.m = -3.4028235E38f;
            this.n = false;
            this.o = -16777216;
            this.p = Integer.MIN_VALUE;
        }

        public b(a aVar) {
            this.a = aVar.a;
            this.b = aVar.d;
            this.c = aVar.b;
            this.d = aVar.c;
            this.e = aVar.e;
            this.f = aVar.f;
            this.g = aVar.g;
            this.h = aVar.h;
            this.i = aVar.i;
            this.j = aVar.n;
            this.k = aVar.o;
            this.l = aVar.j;
            this.m = aVar.k;
            this.n = aVar.l;
            this.o = aVar.m;
            this.p = aVar.p;
            this.q = aVar.q;
        }
    }

    public /* synthetic */ a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, a aVar) {
        this(charSequence, alignment, alignment2, bitmap, f, i, i2, f2, i3, i4, f3, f4, f5, z2, i5, i6, f6);
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(t);
            if (parcelableArrayList != null) {
                SpannableString valueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), valueOf);
                }
                bVar.o(valueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = y;
        if (bundle.containsKey(str)) {
            String str2 = z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = E;
        if (bundle.containsKey(str6)) {
            String str7 = D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(I, false)) {
            bVar.b();
        }
        String str11 = J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    public b a() {
        return new b(this, null);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            Spanned spanned = this.a;
            if (spanned instanceof Spanned) {
                ArrayList a2 = c.a(spanned);
                if (!a2.isEmpty()) {
                    bundle.putParcelableArrayList(t, a2);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        return bundle;
    }

    public Bundle d() {
        Bundle c = c();
        if (this.d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            P2.a.f(this.d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            c.putByteArray(x, byteArrayOutputStream.toByteArray());
        }
        return c;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && ((bitmap = this.d) != null ? !((bitmap2 = aVar.d) == null || !bitmap.sameAs(bitmap2)) : aVar.d == null) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && this.p == aVar.p && this.q == aVar.q;
    }

    public int hashCode() {
        return k.b(new Object[]{this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q)});
    }

    public a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6) {
        if (charSequence == null) {
            P2.a.e(bitmap);
        } else {
            P2.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
    }
}
