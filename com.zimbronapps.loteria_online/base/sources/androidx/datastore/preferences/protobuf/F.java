package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f implements Iterable, Serializable {
    public static final f b = new i(u.d);
    public static final f c;
    public static final Comparator d;
    public int a = 0;

    public class a extends c {
        public int a = 0;
        public final int b;

        public a() {
            this.b = f.this.size();
        }

        public boolean hasNext() {
            return this.a < this.b;
        }

        public byte nextByte() {
            int i = this.a;
            if (i >= this.b) {
                throw new NoSuchElementException();
            }
            this.a = i + 1;
            return f.this.j(i);
        }
    }

    public class b implements Comparator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            g k = fVar.k();
            g k2 = fVar2.k();
            while (k.hasNext() && k2.hasNext()) {
                int compareTo = Integer.valueOf(f.a(k.nextByte())).compareTo(Integer.valueOf(f.a(k2.nextByte())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(fVar.size()).compareTo(Integer.valueOf(fVar2.size()));
        }
    }

    public static abstract class c implements g {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(nextByte());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static final class d implements f {
        public d() {
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e extends i {
        public final int f;
        public final int g;

        public e(byte[] bArr, int i, int i2) {
            super(bArr);
            f.e(i, i + i2, bArr.length);
            this.f = i;
            this.g = i2;
        }

        public byte b(int i) {
            f.c(i, size());
            return this.e[this.f + i];
        }

        public void i(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, w() + i, bArr, i2, i3);
        }

        public byte j(int i) {
            return this.e[this.f + i];
        }

        public int size() {
            return this.g;
        }

        public int w() {
            return this.f;
        }
    }

    public interface f {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface g extends Iterator {
        byte nextByte();
    }

    public static abstract class h extends f {
        public /* synthetic */ h(a aVar) {
            this();
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.k();
        }

        public h() {
        }
    }

    public static class i extends h {
        public final byte[] e;

        public i(byte[] bArr) {
            super(null);
            bArr.getClass();
            this.e = bArr;
        }

        public byte b(int i) {
            return this.e[i];
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f) || size() != ((f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int n = n();
            int n2 = iVar.n();
            if (n == 0 || n2 == 0 || n == n2) {
                return v(iVar, 0, size());
            }
            return false;
        }

        public void i(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.e, i, bArr, i2, i3);
        }

        public byte j(int i) {
            return this.e[i];
        }

        public final int l(int i, int i2, int i3) {
            return u.g(i, this.e, w() + i2, i3);
        }

        public final f o(int i, int i2) {
            int e = f.e(i, i2, size());
            return e == 0 ? f.b : new e(this.e, w() + i, e);
        }

        public int size() {
            return this.e.length;
        }

        public final void u(androidx.datastore.preferences.protobuf.e eVar) {
            eVar.a(this.e, w(), size());
        }

        public final boolean v(f fVar, int i, int i2) {
            if (i2 > fVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
            int i3 = i + i2;
            if (i3 > fVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + fVar.size());
            }
            if (!(fVar instanceof i)) {
                return fVar.o(i, i3).equals(o(0, i2));
            }
            i iVar = (i) fVar;
            byte[] bArr = this.e;
            byte[] bArr2 = iVar.e;
            int w = w() + i2;
            int w2 = w();
            int w3 = iVar.w() + i;
            while (w2 < w) {
                if (bArr[w2] != bArr2[w3]) {
                    return false;
                }
                w2++;
                w3++;
            }
            return true;
        }

        public int w() {
            return 0;
        }
    }

    public static final class j implements f {
        public j() {
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        public /* synthetic */ j(a aVar) {
            this();
        }
    }

    static {
        c = androidx.datastore.preferences.protobuf.d.c() ? new j(null) : new d(null);
        d = new b();
    }

    public static /* synthetic */ int a(byte b2) {
        return q(b2);
    }

    public static void c(int i2, int i3) {
        if (((i3 - (i2 + 1)) | i2) < 0) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i2);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }
    }

    public static int e(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        }
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        }
        throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
    }

    public static f f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static f g(byte[] bArr, int i2, int i3) {
        e(i2, i2 + i3, bArr.length);
        return new i(c.a(bArr, i2, i3));
    }

    public static f h(String str) {
        return new i(str.getBytes(u.b));
    }

    public static int q(byte b2) {
        return b2 & 255;
    }

    public static f s(byte[] bArr) {
        return new i(bArr);
    }

    public static f t(byte[] bArr, int i2, int i3) {
        return new e(bArr, i2, i3);
    }

    public abstract byte b(int i2);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.a;
        if (i2 == 0) {
            int size = size();
            i2 = l(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
        }
        return i2;
    }

    public abstract void i(byte[] bArr, int i2, int i3, int i4);

    public abstract byte j(int i2);

    public g k() {
        return new a();
    }

    public abstract int l(int i2, int i3, int i4);

    public final int n() {
        return this.a;
    }

    public abstract f o(int i2, int i3);

    public final byte[] p() {
        int size = size();
        if (size == 0) {
            return u.d;
        }
        byte[] bArr = new byte[size];
        i(bArr, 0, 0, size);
        return bArr;
    }

    public final String r() {
        if (size() <= 50) {
            return f0.a(this);
        }
        return f0.a(o(0, 47)) + "...";
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), r()});
    }

    public abstract void u(androidx.datastore.preferences.protobuf.e eVar);
}
