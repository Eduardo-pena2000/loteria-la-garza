package com.applovin.shadow.okhttp3.internal.publicsuffix;

import Ca.I;
import Da.D;
import Da.u;
import Da.v;
import Na.c;
import Qa.l;
import Ya.r;
import Za.E;
import com.applovin.shadow.okhttp3.internal.Util;
import com.applovin.shadow.okhttp3.internal.platform.Platform;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.GzipSource;
import com.applovin.shadow.okio.Okio;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List PREVAILING_RULE = u.e("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ String access$binarySearch(Companion companion, byte[] bArr, byte[][] bArr2, int i) {
            return companion.binarySearch(bArr, bArr2, i);
        }

        private final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            int and;
            boolean z;
            int and2;
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
                        and = 46;
                        z = false;
                    } else {
                        boolean z3 = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                        z = z3;
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
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
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset charset = StandardCharsets.UTF_8;
                                t.f(charset, "UTF_8");
                                return new String(bArr, i5, i7, charset);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i4;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.access$getInstance$cp();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ PublicSuffixDatabase access$getInstance$cp() {
        return instance;
    }

    private final List findMatchingRule(List list) {
        String str;
        String str2;
        String str3;
        List n;
        List n2;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes == null) {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i = 0; i < size; i++) {
            String str4 = (String) list.get(i);
            Charset charset = StandardCharsets.UTF_8;
            t.f(charset, "UTF_8");
            byte[] bytes = str4.getBytes(charset);
            t.f(bytes, "this as java.lang.String).getBytes(charset)");
            bArr[i] = bytes;
        }
        int i2 = 0;
        while (true) {
            str = null;
            if (i2 >= size) {
                str2 = null;
                break;
            }
            Companion companion = Companion;
            byte[] bArr2 = this.publicSuffixListBytes;
            if (bArr2 == null) {
                t.v("publicSuffixListBytes");
                bArr2 = null;
            }
            str2 = Companion.access$binarySearch(companion, bArr2, bArr, i2);
            if (str2 != null) {
                break;
            }
            i2++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i3 = 0; i3 < length; i3++) {
                bArr3[i3] = WILDCARD_LABEL;
                Companion companion2 = Companion;
                byte[] bArr4 = this.publicSuffixListBytes;
                if (bArr4 == null) {
                    t.v("publicSuffixListBytes");
                    bArr4 = null;
                }
                String access$binarySearch = Companion.access$binarySearch(companion2, bArr4, bArr3, i3);
                if (access$binarySearch != null) {
                    str3 = access$binarySearch;
                    break;
                }
            }
            str3 = null;
        } else {
            str3 = null;
        }
        if (str3 != null) {
            int i4 = size - 1;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    break;
                }
                Companion companion3 = Companion;
                byte[] bArr5 = this.publicSuffixExceptionListBytes;
                if (bArr5 == null) {
                    t.v("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String access$binarySearch2 = Companion.access$binarySearch(companion3, bArr5, bArr, i5);
                if (access$binarySearch2 != null) {
                    str = access$binarySearch2;
                    break;
                }
                i5++;
            }
        }
        if (str != null) {
            return E.L0('!' + str, new char[]{'.'}, false, 0, 6, (Object) null);
        }
        if (str2 == null && str3 == null) {
            return PREVAILING_RULE;
        }
        if (str2 == null || (n = E.L0(str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            n = v.n();
        }
        if (str3 == null || (n2 = E.L0(str3, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
            n2 = v.n();
        }
        return n.size() > n2.size() ? n : n2;
    }

    private final void readTheList() throws IOException {
        try {
            O o = new O();
            O o2 = new O();
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream == null) {
                return;
            }
            BufferedSource buffer = Okio.buffer(new GzipSource(Okio.source(resourceAsStream)));
            try {
                o.a = buffer.readByteArray(buffer.readInt());
                o2.a = buffer.readByteArray(buffer.readInt());
                I i = I.a;
                c.a(buffer, (Throwable) null);
                synchronized (this) {
                    Object obj = o.a;
                    t.d(obj);
                    this.publicSuffixListBytes = (byte[]) obj;
                    Object obj2 = o2.a;
                    t.d(obj2);
                    this.publicSuffixExceptionListBytes = (byte[]) obj2;
                }
            } finally {
            }
        } finally {
            this.readCompleteLatch.countDown();
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
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

    private final List splitDomain(String str) {
        List L0 = E.L0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return t.c(D.p0(L0), "") ? D.b0(L0, 1) : L0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        t.g(str, "domain");
        String unicode = IDN.toUnicode(str);
        t.f(unicode, "unicodeDomain");
        List splitDomain = splitDomain(unicode);
        List findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && ((String) findMatchingRule.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) findMatchingRule.get(0)).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        return r.y(r.q(D.W(splitDomain(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        t.g(bArr, "publicSuffixListBytes");
        t.g(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
