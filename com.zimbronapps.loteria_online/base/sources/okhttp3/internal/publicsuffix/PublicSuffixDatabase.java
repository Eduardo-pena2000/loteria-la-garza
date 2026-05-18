package okhttp3.internal.publicsuffix;

import Ca.I;
import Da.D;
import Da.u;
import Da.v;
import Na.c;
import Ya.r;
import Za.E;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import xb.g;
import xb.q;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PublicSuffixDatabase {
    public static final Companion e = new Companion(null);
    public static final byte[] f = {42};
    public static final List g = u.e("*");
    public static final PublicSuffixDatabase h = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ String a(Companion companion, byte[] bArr, byte[][] bArr2, int i) {
            return companion.b(bArr, bArr2, i);
        }

        public final String b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int d;
            boolean z;
            int d2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        d = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        d = Util.d(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    d2 = d - Util.d(bArr[i5 + i10], 255);
                    if (d2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length != i9) {
                        z2 = z;
                    } else {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    }
                }
                if (d2 >= 0) {
                    if (d2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                t.f(UTF_8, "UTF_8");
                                return new String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase c() {
            return PublicSuffixDatabase.a();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ PublicSuffixDatabase a() {
        return h;
    }

    public final List b(List list) {
        CharSequence charSequence;
        String str;
        String str2;
        if (this.a.get() || !this.a.compareAndSet(false, true)) {
            try {
                this.b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.c == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str3 = (String) list.get(i);
            Charset UTF_8 = StandardCharsets.UTF_8;
            t.f(UTF_8, "UTF_8");
            byte[] bytes = str3.getBytes(UTF_8);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                charSequence = null;
                break;
            }
            int i3 = i2 + 1;
            Companion companion = e;
            byte[] bArr2 = this.c;
            if (bArr2 == null) {
                t.v("publicSuffixListBytes");
                bArr2 = null;
            }
            CharSequence a = Companion.a(companion, bArr2, bArr, i2);
            if (a != null) {
                charSequence = a;
                break;
            }
            i2 = i3;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4 + 1;
                bArr3[i4] = f;
                Companion companion2 = e;
                byte[] bArr4 = this.c;
                if (bArr4 == null) {
                    t.v("publicSuffixListBytes");
                    bArr4 = null;
                }
                String a2 = Companion.a(companion2, bArr4, bArr3, i4);
                if (a2 != null) {
                    str = a2;
                    break;
                }
                i4 = i5;
            }
            str = null;
        } else {
            str = null;
        }
        if (str != null) {
            int i6 = size - 1;
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i7 + 1;
                Companion companion3 = e;
                byte[] bArr5 = this.d;
                if (bArr5 == null) {
                    t.v("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                str2 = Companion.a(companion3, bArr5, bArr, i7);
                if (str2 != null) {
                    break;
                }
                i7 = i8;
            }
            str2 = null;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return E.L0(t.o("!", str2), new char[]{'.'}, false, 0, 6, null);
        }
        if (charSequence == null && str == null) {
            return g;
        }
        List L0 = charSequence == null ? null : E.L0(charSequence, new char[]{'.'}, false, 0, 6, null);
        if (L0 == null) {
            L0 = v.n();
        }
        List L02 = str != null ? E.L0(str, new char[]{'.'}, false, 0, 6, null) : null;
        if (L02 == null) {
            L02 = v.n();
        }
        return L0.size() > L02.size() ? L0 : L02;
    }

    public final String c(String domain) {
        int size;
        int size2;
        t.g(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        t.f(unicodeDomain, "unicodeDomain");
        List f2 = f(unicodeDomain);
        List b = b(f2);
        if (f2.size() == b.size() && ((String) b.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b.get(0)).charAt(0) == '!') {
            size = f2.size();
            size2 = b.size();
        } else {
            size = f2.size();
            size2 = b.size() + 1;
        }
        return r.y(r.q(D.W(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public final void d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        g d = x.d(new q(x.k(resourceAsStream)));
        try {
            byte[] readByteArray = d.readByteArray(d.readInt());
            byte[] readByteArray2 = d.readByteArray(d.readInt());
            I i = I.a;
            c.a(d, null);
            synchronized (this) {
                t.d(readByteArray);
                this.c = readByteArray;
                t.d(readByteArray2);
                this.d = readByteArray2;
            }
            this.b.countDown();
        } finally {
        }
    }

    public final void e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e2) {
                    Platform.a.g().k("Failed to read public suffix list", 5, e2);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final List f(String str) {
        List L0 = E.L0(str, new char[]{'.'}, false, 0, 6, null);
        return t.c(D.p0(L0), "") ? D.b0(L0, 1) : L0;
    }
}
