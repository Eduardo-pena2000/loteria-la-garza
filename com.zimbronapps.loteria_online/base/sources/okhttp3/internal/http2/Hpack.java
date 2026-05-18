package okhttp3.internal.http2;

import Da.D;
import Da.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.Util;
import xb.L;
import xb.e;
import xb.g;
import xb.h;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Hpack {
    public static final Hpack a;
    public static final Header[] b;
    public static final Map c;

    static {
        Hpack hpack = new Hpack();
        a = hpack;
        Header header = new Header(Header.j, "");
        h hVar = Header.g;
        Header header2 = new Header(hVar, "GET");
        Header header3 = new Header(hVar, "POST");
        h hVar2 = Header.h;
        Header header4 = new Header(hVar2, "/");
        Header header5 = new Header(hVar2, "/index.html");
        h hVar3 = Header.i;
        Header header6 = new Header(hVar3, "http");
        Header header7 = new Header(hVar3, "https");
        h hVar4 = Header.f;
        b = new Header[]{header, header2, header3, header4, header5, header6, header7, new Header(hVar4, "200"), new Header(hVar4, "204"), new Header(hVar4, "206"), new Header(hVar4, "304"), new Header(hVar4, "400"), new Header(hVar4, "404"), new Header(hVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        c = hpack.d();
    }

    private Hpack() {
    }

    public final h a(h name) {
        t.g(name, "name");
        int size = name.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            byte f = name.f(i);
            if (65 <= f && f <= 90) {
                throw new IOException(t.o("PROTOCOL_ERROR response malformed: mixed case name: ", name.H()));
            }
            i = i2;
        }
        return name;
    }

    public final Map b() {
        return c;
    }

    public final Header[] c() {
        return b;
    }

    public final Map d() {
        Header[] headerArr = b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Header[] headerArr2 = b;
            if (!linkedHashMap.containsKey(headerArr2[i].a)) {
                linkedHashMap.put(headerArr2[i].a, Integer.valueOf(i));
            }
            i = i2;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t.f(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    public static final class Reader {
        public final int a;
        public int b;
        public final List c;
        public final g d;
        public Header[] e;
        public int f;
        public int g;
        public int h;

        public Reader(L source, int i, int i2) {
            t.g(source, "source");
            this.a = i;
            this.b = i2;
            this.c = new ArrayList();
            this.d = x.d(source);
            this.e = new Header[8];
            this.f = r2.length - 1;
        }

        public final void a() {
            int i = this.b;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        public final void b() {
            p.x(this.e, null, 0, 0, 6, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        public final int c(int i) {
            return this.f + 1 + i;
        }

        public final int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    t.d(header);
                    int i4 = header.c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                Header[] headerArr = this.e;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public final List e() {
            List L0 = D.L0(this.c);
            this.c.clear();
            return L0;
        }

        public final h f(int i) {
            if (h(i)) {
                return Hpack.a.c()[i].a;
            }
            int c = c(i - Hpack.a.c().length);
            if (c >= 0) {
                Header[] headerArr = this.e;
                if (c < headerArr.length) {
                    Header header = headerArr[c];
                    t.d(header);
                    return header.a;
                }
            }
            throw new IOException(t.o("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final void g(int i, Header header) {
            this.c.add(header);
            int i2 = header.c;
            if (i != -1) {
                Header header2 = this.e[c(i)];
                t.d(header2);
                i2 -= header2.c;
            }
            int i3 = this.b;
            if (i2 > i3) {
                b();
                return;
            }
            int d = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                Header[] headerArr = this.e;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.f = this.e.length - 1;
                    this.e = headerArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = header;
                this.g++;
            } else {
                this.e[i + c(i) + d] = header;
            }
            this.h += i2;
        }

        public final boolean h(int i) {
            return i >= 0 && i <= Hpack.a.c().length - 1;
        }

        public final int i() {
            return Util.d(this.d.readByte(), 255);
        }

        public final h j() {
            int i = i();
            boolean z = (i & 128) == 128;
            long m = m(i, 127);
            if (!z) {
                return this.d.readByteString(m);
            }
            e eVar = new e();
            Huffman.a.b(this.d, m, eVar);
            return eVar.y();
        }

        public final void k() {
            while (!this.d.exhausted()) {
                int d = Util.d(this.d.readByte(), 255);
                if (d == 128) {
                    throw new IOException("index == 0");
                }
                if ((d & 128) == 128) {
                    l(m(d, 127) - 1);
                } else if (d == 64) {
                    o();
                } else if ((d & 64) == 64) {
                    n(m(d, 63) - 1);
                } else if ((d & 32) == 32) {
                    int m = m(d, 31);
                    this.b = m;
                    if (m < 0 || m > this.a) {
                        throw new IOException(t.o("Invalid dynamic table size update ", Integer.valueOf(this.b)));
                    }
                    a();
                } else if (d == 16 || d == 0) {
                    q();
                } else {
                    p(m(d, 15) - 1);
                }
            }
        }

        public final void l(int i) {
            if (h(i)) {
                this.c.add(Hpack.a.c()[i]);
                return;
            }
            int c = c(i - Hpack.a.c().length);
            if (c >= 0) {
                Header[] headerArr = this.e;
                if (c < headerArr.length) {
                    List list = this.c;
                    Header header = headerArr[c];
                    t.d(header);
                    list.add(header);
                    return;
                }
            }
            throw new IOException(t.o("Header index too large ", Integer.valueOf(i + 1)));
        }

        public final int m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & 127) << i4;
                i4 += 7;
            }
        }

        public final void n(int i) {
            g(-1, new Header(f(i), j()));
        }

        public final void o() {
            g(-1, new Header(Hpack.a.a(j()), j()));
        }

        public final void p(int i) {
            this.c.add(new Header(f(i), j()));
        }

        public final void q() {
            this.c.add(new Header(Hpack.a.a(j()), j()));
        }

        public /* synthetic */ Reader(L l, int i, int i2, int i3, k kVar) {
            this(l, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    public static final class Writer {
        public int a;
        public final boolean b;
        public final e c;
        public int d;
        public boolean e;
        public int f;
        public Header[] g;
        public int h;
        public int i;
        public int j;

        public Writer(int i, boolean z, e out) {
            t.g(out, "out");
            this.a = i;
            this.b = z;
            this.c = out;
            this.d = Integer.MAX_VALUE;
            this.f = i;
            this.g = new Header[8];
            this.h = r2.length - 1;
        }

        public final void a() {
            int i = this.f;
            int i2 = this.j;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        public final void b() {
            p.x(this.g, null, 0, 0, 6, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        public final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    i2 = this.h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.g[length];
                    t.d(header);
                    i -= header.c;
                    int i4 = this.j;
                    Header header2 = this.g[length];
                    t.d(header2);
                    this.j = i4 - header2.c;
                    this.i--;
                    i3++;
                }
                Header[] headerArr = this.g;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.i);
                Header[] headerArr2 = this.g;
                int i5 = this.h;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.h += i3;
            }
            return i3;
        }

        public final void d(Header header) {
            int i = header.c;
            int i2 = this.f;
            if (i > i2) {
                b();
                return;
            }
            c((this.j + i) - i2);
            int i3 = this.i + 1;
            Header[] headerArr = this.g;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.h = this.g.length - 1;
                this.g = headerArr2;
            }
            int i4 = this.h;
            this.h = i4 - 1;
            this.g[i4] = header;
            this.i++;
            this.j += i;
        }

        public final void e(int i) {
            this.a = i;
            int min = Math.min(i, 16384);
            int i2 = this.f;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.d = Math.min(this.d, min);
            }
            this.e = true;
            this.f = min;
            a();
        }

        public final void f(h data) {
            t.g(data, "data");
            if (this.b) {
                Huffman huffman = Huffman.a;
                if (huffman.d(data) < data.size()) {
                    e eVar = new e();
                    huffman.c(data, eVar);
                    h y = eVar.y();
                    h(y.size(), 127, 128);
                    this.c.m0(y);
                    return;
                }
            }
            h(data.size(), 127, 0);
            this.c.m0(data);
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r14) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.g(java.util.List):void");
        }

        public final void h(int i, int i2, int i3) {
            if (i < i2) {
                this.c.writeByte(i | i3);
                return;
            }
            this.c.writeByte(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.c.writeByte(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.c.writeByte(i4);
        }

        public /* synthetic */ Writer(int i, boolean z, e eVar, int i2, k kVar) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, eVar);
        }
    }
}
