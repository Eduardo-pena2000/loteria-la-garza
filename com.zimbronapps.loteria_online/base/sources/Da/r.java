package Da;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r extends p {

    public static final class a implements Iterable, Ra.a {
        public final /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        public Iterator iterator() {
            return kotlin.jvm.internal.c.a(this.a);
        }
    }

    public static final class b implements Ya.h {
        public final /* synthetic */ Object[] a;

        public b(Object[] objArr) {
            this.a = objArr;
        }

        public Iterator iterator() {
            return kotlin.jvm.internal.c.a(this.a);
        }
    }

    public static /* synthetic */ String A0(long[] jArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return t0(jArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static /* synthetic */ String B0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return u0(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static /* synthetic */ String C0(short[] sArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return v0(sArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static Object D0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[a0(objArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static int E0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i < 0) {
                        break;
                    }
                    length = i;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (kotlin.jvm.internal.t.c(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static Object F0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[objArr.length - 1];
    }

    public static char G0(char[] cArr) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static /* synthetic */ Iterator H(Object[] objArr) {
        return d1(objArr);
    }

    public static Object H0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static Iterable I(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length == 0 ? v.n() : new a(objArr);
    }

    public static final Object[] I0(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        if (objArr.length == 0) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        p.F(copyOf, comparator);
        return copyOf;
    }

    public static Ya.h J(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length == 0 ? Ya.o.g() : new b(objArr);
    }

    public static List J0(Object[] objArr, Comparator comparator) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        return p.c(I0(objArr, comparator));
    }

    public static boolean K(byte[] bArr, byte b2) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        return c0(bArr, b2) >= 0;
    }

    public static List K0(short[] sArr, int i) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return v.n();
        }
        if (i >= sArr.length) {
            return T0(sArr);
        }
        if (i == 1) {
            return u.e(Short.valueOf(sArr[0]));
        }
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean L(char[] cArr, char c) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        return d0(cArr, c) >= 0;
    }

    public static final List L0(Object[] objArr, int i) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return v.n();
        }
        int length = objArr.length;
        if (i >= length) {
            return S0(objArr);
        }
        if (i == 1) {
            return u.e(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
        }
        return arrayList;
    }

    public static boolean M(int[] iArr, int i) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return e0(iArr, i) >= 0;
    }

    public static final Collection M0(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        for (Object obj : objArr) {
            destination.add(obj);
        }
        return destination;
    }

    public static boolean N(long[] jArr, long j) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return f0(jArr, j) >= 0;
    }

    public static List N0(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        int length = bArr.length;
        return length != 0 ? length != 1 ? U0(bArr) : u.e(Byte.valueOf(bArr[0])) : v.n();
    }

    public static boolean O(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return g0(objArr, obj) >= 0;
    }

    public static List O0(double[] dArr) {
        kotlin.jvm.internal.t.g(dArr, "<this>");
        int length = dArr.length;
        return length != 0 ? length != 1 ? V0(dArr) : u.e(Double.valueOf(dArr[0])) : v.n();
    }

    public static boolean P(short[] sArr, short s) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        return h0(sArr, s) >= 0;
    }

    public static List P0(float[] fArr) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        int length = fArr.length;
        return length != 0 ? length != 1 ? W0(fArr) : u.e(Float.valueOf(fArr[0])) : v.n();
    }

    public static List Q(Object[] objArr, int i) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i >= 0) {
            return L0(objArr, Wa.n.e(objArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static List Q0(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        int length = iArr.length;
        return length != 0 ? length != 1 ? X0(iArr) : u.e(Integer.valueOf(iArr[0])) : v.n();
    }

    public static List R(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return S(objArr, new ArrayList());
    }

    public static List R0(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        int length = jArr.length;
        return length != 0 ? length != 1 ? Y0(jArr) : u.e(Long.valueOf(jArr[0])) : v.n();
    }

    public static final Collection S(Object[] objArr, Collection destination) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        for (Object obj : objArr) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static List S0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? Z0(objArr) : u.e(objArr[0]) : v.n();
    }

    public static int T(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List T0(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        int length = sArr.length;
        return length != 0 ? length != 1 ? a1(sArr) : u.e(Short.valueOf(sArr[0])) : v.n();
    }

    public static Object U(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List U0(byte[] bArr) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b2 : bArr) {
            arrayList.add(Byte.valueOf(b2));
        }
        return arrayList;
    }

    public static Object V(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final List V0(double[] dArr) {
        kotlin.jvm.internal.t.g(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static Wa.i W(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return new Wa.i(0, Y(iArr));
    }

    public static final List W0(float[] fArr) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static Wa.i X(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new Wa.i(0, a0(objArr));
    }

    public static final List X0(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static int Y(int[] iArr) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        return iArr.length - 1;
    }

    public static final List Y0(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static int Z(long[] jArr) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        return jArr.length - 1;
    }

    public static List Z0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new ArrayList(v.i(objArr));
    }

    public static int a0(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return objArr.length - 1;
    }

    public static final List a1(short[] sArr) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static Object b0(Object[] objArr, int i) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final Set b1(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? M0(objArr, new LinkedHashSet(Q.e(objArr.length))) : X.a(objArr[0]) : Y.b();
    }

    public static final int c0(byte[] bArr, byte b2) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b2 == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static Iterable c1(Object[] objArr) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        return new K(new q(objArr));
    }

    public static final int d0(char[] cArr, char c) {
        kotlin.jvm.internal.t.g(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final Iterator d1(Object[] objArr) {
        return kotlin.jvm.internal.c.a(objArr);
    }

    public static int e0(int[] iArr, int i) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static List e1(Object[] objArr, Object[] other) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(other, "other");
        int min = Math.min(objArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(Ca.x.a(objArr[i], other[i]));
        }
        return arrayList;
    }

    public static final int f0(long[] jArr, long j) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int g0(Object[] objArr, Object obj) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (kotlin.jvm.internal.t.c(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int h0(short[] sArr, short s) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final Appendable i0(byte[] bArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (byte b2 : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Byte.valueOf(b2)));
            } else {
                buffer.append(String.valueOf(b2));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable j0(double[] dArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(dArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (double d : dArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Double.valueOf(d)));
            } else {
                buffer.append(String.valueOf(d));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable k0(float[] fArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (float f : fArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Float.valueOf(f)));
            } else {
                buffer.append(String.valueOf(f));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable l0(int[] iArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Integer.valueOf(i3)));
            } else {
                buffer.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable m0(long[] jArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Long.valueOf(j)));
            } else {
                buffer.append(String.valueOf(j));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable n0(Object[] objArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Za.r.a(buffer, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final Appendable o0(short[] sArr, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (short s : sArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (lVar != null) {
                buffer.append((CharSequence) lVar.invoke(Short.valueOf(s)));
            } else {
                buffer.append(String.valueOf(s));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String p0(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(bArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return i0(bArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String q0(double[] dArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(dArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return j0(dArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String r0(float[] fArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(fArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return k0(fArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String s0(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(iArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return l0(iArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String t0(long[] jArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(jArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return m0(jArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String u0(Object[] objArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(objArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return n0(objArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static final String v0(short[] sArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(sArr, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return o0(sArr, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static /* synthetic */ String w0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return p0(bArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static /* synthetic */ String x0(double[] dArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return q0(dArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static /* synthetic */ String y0(float[] fArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return r0(fArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static /* synthetic */ String z0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return s0(iArr, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }
}
