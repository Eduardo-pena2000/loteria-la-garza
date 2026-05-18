package a3;

import I3.o;
import M2.m;
import M2.z;
import P2.G;
import P2.K;
import a3.f;
import a3.g;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.n;
import t7.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class i implements n.a {
    public final g a;
    public final f b;
    public static final Pattern c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    public static final Pattern d = Pattern.compile("VIDEO=\"(.+?)\"");
    public static final Pattern e = Pattern.compile("AUDIO=\"(.+?)\"");
    public static final Pattern f = Pattern.compile("SUBTITLES=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern i = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern k = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern l = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    public static final Pattern o = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    public static final Pattern p = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern q = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern r = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    public static final Pattern s = c("CAN-SKIP-DATERANGES");
    public static final Pattern t = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    public static final Pattern u = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern v = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    public static final Pattern w = c("CAN-BLOCK-RELOAD");
    public static final Pattern x = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern y = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern z = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern A = Pattern.compile("LAST-MSN=(\\d+)\\b");
    public static final Pattern B = Pattern.compile("LAST-PART=(\\d+)\\b");
    public static final Pattern C = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern D = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern E = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern F = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    public static final Pattern G = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    public static final Pattern H = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern I = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern L = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern M = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern N = Pattern.compile("TYPE=(PART|MAP)");
    public static final Pattern O = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern P = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern Q = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern R = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern S = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern T = c("AUTOSELECT");
    public static final Pattern U = c("DEFAULT");
    public static final Pattern V = c("FORCED");
    public static final Pattern W = c("INDEPENDENT");
    public static final Pattern X = c("GAP");
    public static final Pattern Y = c("PRECISE");
    public static final Pattern Z = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern a0 = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern b0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public static final class a extends IOException {
    }

    public static class b {
        public final BufferedReader a;
        public final Queue b;
        public String c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.b = queue;
            this.a = bufferedReader;
        }

        public boolean a() {
            String trim;
            if (this.c != null) {
                return true;
            }
            if (!this.b.isEmpty()) {
                this.c = (String) P2.a.e((String) this.b.poll());
                return true;
            }
            do {
                String readLine = this.a.readLine();
                this.c = readLine;
                if (readLine == null) {
                    return false;
                }
                trim = readLine.trim();
                this.c = trim;
            } while (trim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.c;
            this.c = null;
            return str;
        }
    }

    public i() {
        this(g.n, null);
    }

    public static long A(String str, Pattern pattern) {
        return new BigDecimal(z(str, pattern, Collections.emptyMap())).multiply(new BigDecimal(1000000L)).longValue();
    }

    public static String B(String str, Map map) {
        Matcher matcher = b0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int C(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !K.C0(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    public static boolean b(BufferedReader bufferedReader) {
        int read = bufferedReader.read();
        if (read == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            read = bufferedReader.read();
        }
        int C2 = C(bufferedReader, true, read);
        for (int i2 = 0; i2 < 7; i2++) {
            if (C2 != "#EXTM3U".charAt(i2)) {
                return false;
            }
            C2 = bufferedReader.read();
        }
        return K.C0(C(bufferedReader, false, C2));
    }

    public static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static m d(String str, m.b[] bVarArr) {
        m.b[] bVarArr2 = new m.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = bVarArr[i2].c(null);
        }
        return new m(str, bVarArr2);
    }

    public static String e(long j2, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j2);
    }

    public static g.b f(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g.b bVar = (g.b) arrayList.get(i2);
            if (str.equals(bVar.d)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b g(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g.b bVar = (g.b) arrayList.get(i2);
            if (str.equals(bVar.e)) {
                return bVar;
            }
        }
        return null;
    }

    public static g.b h(ArrayList arrayList, String str) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            g.b bVar = (g.b) arrayList.get(i2);
            if (str.equals(bVar.c)) {
                return bVar;
            }
        }
        return null;
    }

    public static double j(String str, Pattern pattern) {
        return Double.parseDouble(z(str, pattern, Collections.emptyMap()));
    }

    public static m.b k(String str, String str2, Map map) {
        String u2 = u(str, J, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String z2 = z(str, K, map);
            return new m.b(M2.g.d, "video/mp4", Base64.decode(z2.substring(z2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new m.b(M2.g.d, "hls", K.r0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(u2)) {
            return null;
        }
        String z3 = z(str, K, map);
        byte[] decode = Base64.decode(z3.substring(z3.indexOf(44)), 0);
        UUID uuid = M2.g.e;
        return new m.b(uuid, "video/mp4", o.a(uuid, decode));
    }

    public static String l(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int m(String str, Pattern pattern) {
        return Integer.parseInt(z(str, pattern, Collections.emptyMap()));
    }

    public static long n(String str, Pattern pattern) {
        return Long.parseLong(z(str, pattern, Collections.emptyMap()));
    }

    public static f o(g gVar, f fVar, b bVar, String str) {
        ArrayList arrayList;
        List list;
        String str2;
        long j2;
        boolean z2;
        int i2;
        f.b bVar2;
        int i3;
        String v2;
        long j3;
        long j4;
        long j5;
        long j6;
        boolean z3;
        m mVar;
        g gVar2 = gVar;
        f fVar2 = fVar;
        boolean z4 = gVar2.c;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        List arrayList5 = new ArrayList();
        f.f fVar3 = new f.f(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap = new TreeMap();
        boolean z5 = false;
        String str3 = "";
        boolean z6 = z4;
        f.f fVar4 = fVar3;
        int i4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        int i5 = 0;
        boolean z9 = false;
        boolean z10 = false;
        int i6 = 0;
        boolean z11 = false;
        String str4 = str3;
        m mVar2 = null;
        long j7 = -9223372036854775807L;
        long j8 = 0;
        long j9 = 0;
        int i7 = 1;
        long j10 = -9223372036854775807L;
        long j11 = -9223372036854775807L;
        m mVar3 = null;
        long j12 = 0;
        m mVar4 = null;
        long j13 = 0;
        long j14 = -1;
        String str5 = null;
        String str6 = null;
        long j15 = 0;
        long j16 = 0;
        f.d dVar = null;
        long j17 = 0;
        long j18 = 0;
        ArrayList arrayList6 = arrayList3;
        f.b bVar3 = null;
        while (bVar.a()) {
            String b2 = bVar.b();
            if (b2.startsWith("#EXT")) {
                arrayList5.add(b2);
            }
            if (b2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String z12 = z(b2, q, hashMap);
                if ("VOD".equals(z12)) {
                    i4 = 1;
                } else if ("EVENT".equals(z12)) {
                    i4 = 2;
                }
            } else if (b2.equals("#EXT-X-I-FRAMES-ONLY")) {
                z11 = true;
            } else if (b2.startsWith("#EXT-X-START")) {
                j7 = (long) (j(b2, C) * 1000000.0d);
                z7 = q(b2, Y, z5);
            } else if (b2.startsWith("#EXT-X-SERVER-CONTROL")) {
                fVar4 = y(b2);
            } else if (b2.startsWith("#EXT-X-PART-INF")) {
                j11 = (long) (j(b2, o) * 1000000.0d);
            } else if (b2.startsWith("#EXT-X-MAP")) {
                String z13 = z(b2, K, hashMap);
                String v3 = v(b2, E, hashMap);
                if (v3 != null) {
                    String[] c1 = K.c1(v3, "@");
                    j14 = Long.parseLong(c1[z5 ? 1 : 0]);
                    if (c1.length > 1) {
                        j12 = Long.parseLong(c1[1]);
                    }
                }
                if (j14 == -1) {
                    j12 = 0;
                }
                String str7 = str5;
                if (mVar2 != null && str7 == null) {
                    throw z.c("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                }
                dVar = new f.d(z13, j12, j14, mVar2, str7);
                if (j14 != -1) {
                    j12 += j14;
                }
                str5 = str7;
                j14 = -1;
            } else {
                String str8 = str5;
                if (b2.startsWith("#EXT-X-TARGETDURATION")) {
                    j10 = 1000000 * m(b2, m);
                } else {
                    if (b2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        j16 = n(b2, x);
                        str5 = str8;
                        j9 = j16;
                    } else if (b2.startsWith("#EXT-X-VERSION")) {
                        i7 = m(b2, p);
                    } else {
                        if (b2.startsWith("#EXT-X-DEFINE")) {
                            String v4 = v(b2, a0, hashMap);
                            if (v4 != null) {
                                String str9 = (String) gVar2.l.get(v4);
                                if (str9 != null) {
                                    hashMap.put(v4, str9);
                                }
                            } else {
                                hashMap.put(z(b2, P, hashMap), z(b2, Z, hashMap));
                            }
                            arrayList = arrayList6;
                            list = arrayList5;
                            str2 = str6;
                            j2 = j16;
                            z2 = false;
                            i2 = i4;
                        } else if (b2.startsWith("#EXTINF")) {
                            j17 = A(b2, y);
                            str4 = u(b2, z, str3, hashMap);
                        } else {
                            String str10 = str3;
                            if (b2.startsWith("#EXT-X-SKIP")) {
                                int m2 = m(b2, t);
                                P2.a.f(fVar2 != null && arrayList2.isEmpty());
                                int i8 = (int) (j9 - ((f) K.i(fVar)).k);
                                int i9 = m2 + i8;
                                if (i8 < 0 || i9 > fVar2.r.size()) {
                                    throw new a();
                                }
                                str3 = str10;
                                String str11 = str8;
                                long j19 = j15;
                                while (i8 < i9) {
                                    f.d dVar2 = (f.d) fVar2.r.get(i8);
                                    ArrayList arrayList7 = arrayList6;
                                    List list2 = arrayList5;
                                    if (j9 != fVar2.k) {
                                        dVar2 = dVar2.b(j19, (fVar2.j - i5) + dVar2.d);
                                    }
                                    arrayList2.add(dVar2);
                                    j19 += dVar2.c;
                                    long j20 = dVar2.j;
                                    if (j20 != -1) {
                                        i3 = i9;
                                        j12 = dVar2.i + j20;
                                    } else {
                                        i3 = i9;
                                    }
                                    int i10 = dVar2.d;
                                    f.d dVar3 = dVar2.b;
                                    m mVar5 = dVar2.f;
                                    m mVar6 = dVar2.g;
                                    String str12 = dVar2.h;
                                    if (str12 == null || !str12.equals(Long.toHexString(j16))) {
                                        str11 = dVar2.h;
                                    }
                                    j16++;
                                    i8++;
                                    fVar2 = fVar;
                                    mVar4 = mVar5;
                                    mVar2 = mVar6;
                                    j13 = j19;
                                    i9 = i3;
                                    i6 = i10;
                                    dVar = dVar3;
                                    arrayList6 = arrayList7;
                                    arrayList5 = list2;
                                }
                                gVar2 = gVar;
                                fVar2 = fVar;
                                j15 = j19;
                                str5 = str11;
                            } else {
                                ArrayList arrayList8 = arrayList6;
                                list = arrayList5;
                                str3 = str10;
                                if (b2.startsWith("#EXT-X-KEY")) {
                                    String z14 = z(b2, H, hashMap);
                                    String u2 = u(b2, I, "identity", hashMap);
                                    if ("NONE".equals(z14)) {
                                        treeMap.clear();
                                        v2 = null;
                                        mVar2 = null;
                                    } else {
                                        v2 = v(b2, L, hashMap);
                                        if ("identity".equals(u2)) {
                                            if ("AES-128".equals(z14)) {
                                                mVar2 = z(b2, K, hashMap);
                                            }
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            str5 = v2;
                                        } else {
                                            String str13 = str6;
                                            str6 = str13 == null ? l(z14) : str13;
                                            m.b k2 = k(b2, u2, hashMap);
                                            if (k2 != null) {
                                                treeMap.put(u2, k2);
                                                mVar2 = null;
                                            }
                                        }
                                        mVar2 = null;
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        str5 = v2;
                                    }
                                    mVar4 = mVar2;
                                    gVar2 = gVar;
                                    fVar2 = fVar;
                                    str5 = v2;
                                } else {
                                    String str14 = str6;
                                    if (b2.startsWith("#EXT-X-BYTERANGE")) {
                                        String[] c12 = K.c1(z(b2, D, hashMap), "@");
                                        j14 = Long.parseLong(c12[0]);
                                        if (c12.length > 1) {
                                            j12 = Long.parseLong(c12[1]);
                                        }
                                    } else if (b2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                        i5 = Integer.parseInt(b2.substring(b2.indexOf(58) + 1));
                                        gVar2 = gVar;
                                        fVar2 = fVar;
                                        str6 = str14;
                                        str5 = str8;
                                        arrayList6 = arrayList8;
                                        arrayList5 = list;
                                        z5 = false;
                                        z8 = true;
                                    } else if (b2.equals("#EXT-X-DISCONTINUITY")) {
                                        i6++;
                                    } else {
                                        if (b2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                            if (j8 == 0) {
                                                j8 = K.K0(K.R0(b2.substring(b2.indexOf(58) + 1))) - j15;
                                            } else {
                                                i2 = i4;
                                                str2 = str14;
                                            }
                                        } else if (b2.equals("#EXT-X-GAP")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            str6 = str14;
                                            str5 = str8;
                                            arrayList6 = arrayList8;
                                            arrayList5 = list;
                                            z5 = false;
                                            z10 = true;
                                        } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            str6 = str14;
                                            str5 = str8;
                                            arrayList6 = arrayList8;
                                            arrayList5 = list;
                                            z5 = false;
                                            z6 = true;
                                        } else if (b2.equals("#EXT-X-ENDLIST")) {
                                            gVar2 = gVar;
                                            fVar2 = fVar;
                                            str6 = str14;
                                            str5 = str8;
                                            arrayList6 = arrayList8;
                                            arrayList5 = list;
                                            z5 = false;
                                            z9 = true;
                                        } else if (b2.startsWith("#EXT-X-RENDITION-REPORT")) {
                                            i2 = i4;
                                            str2 = str14;
                                            arrayList4.add(new f.c(Uri.parse(G.e(str, z(b2, K, hashMap))), t(b2, A, -1L), s(b2, B, -1)));
                                        } else {
                                            i2 = i4;
                                            str2 = str14;
                                            if (!b2.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                j2 = j16;
                                                if (b2.startsWith("#EXT-X-PART")) {
                                                    String e2 = e(j2, mVar2, str8);
                                                    String z15 = z(b2, K, hashMap);
                                                    long j21 = (long) (j(b2, n) * 1000000.0d);
                                                    f.b bVar4 = bVar3;
                                                    boolean q2 = q(b2, W, false) | (z6 && arrayList8.isEmpty());
                                                    boolean q3 = q(b2, X, false);
                                                    String v5 = v(b2, E, hashMap);
                                                    if (v5 != null) {
                                                        String[] c13 = K.c1(v5, "@");
                                                        j4 = Long.parseLong(c13[0]);
                                                        if (c13.length > 1) {
                                                            j18 = Long.parseLong(c13[1]);
                                                        }
                                                        j3 = -1;
                                                    } else {
                                                        j3 = -1;
                                                        j4 = -1;
                                                    }
                                                    if (j4 == j3) {
                                                        j18 = 0;
                                                    }
                                                    if (mVar4 == null && !treeMap.isEmpty()) {
                                                        m.b[] bVarArr = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                        m mVar7 = new m(str2, bVarArr);
                                                        if (mVar3 == null) {
                                                            mVar3 = d(str2, bVarArr);
                                                        }
                                                        mVar4 = mVar7;
                                                    }
                                                    arrayList8.add(new f.b(z15, dVar, j21, i6, j13, mVar4, mVar2, e2, j18, j4, q3, q2, false));
                                                    j13 += j21;
                                                    if (j4 != j3) {
                                                        j18 += j4;
                                                    }
                                                    gVar2 = gVar;
                                                    fVar2 = fVar;
                                                    str5 = str8;
                                                    i4 = i2;
                                                    bVar3 = bVar4;
                                                    j16 = j2;
                                                    str6 = str2;
                                                    arrayList6 = arrayList8;
                                                    arrayList5 = list;
                                                } else {
                                                    bVar2 = bVar3;
                                                    arrayList = arrayList8;
                                                    if (b2.startsWith("#")) {
                                                        z2 = false;
                                                        gVar2 = gVar;
                                                        str5 = str8;
                                                        i4 = i2;
                                                        bVar3 = bVar2;
                                                        j16 = j2;
                                                        str6 = str2;
                                                        arrayList6 = arrayList;
                                                        arrayList5 = list;
                                                        z5 = z2;
                                                        fVar2 = fVar;
                                                    } else {
                                                        String e3 = e(j2, mVar2, str8);
                                                        long j22 = j2 + 1;
                                                        String B2 = B(b2, hashMap);
                                                        f.d dVar4 = (f.d) hashMap2.get(B2);
                                                        if (j14 == -1) {
                                                            j5 = 0;
                                                        } else {
                                                            if (z11 && dVar == null && dVar4 == null) {
                                                                dVar4 = new f.d(B2, 0L, j12, null, null);
                                                                hashMap2.put(B2, dVar4);
                                                            }
                                                            j5 = j12;
                                                        }
                                                        if (mVar4 != null || treeMap.isEmpty()) {
                                                            j6 = j22;
                                                            z3 = false;
                                                            mVar = mVar4;
                                                        } else {
                                                            j6 = j22;
                                                            z3 = false;
                                                            m.b[] bVarArr2 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                            mVar = new m(str2, bVarArr2);
                                                            if (mVar3 == null) {
                                                                mVar3 = d(str2, bVarArr2);
                                                            }
                                                        }
                                                        arrayList2.add(new f.d(B2, dVar != null ? dVar : dVar4, str4, j17, i6, j15, mVar, mVar2, e3, j5, j14, z10, arrayList));
                                                        j13 = j15 + j17;
                                                        arrayList6 = new ArrayList();
                                                        if (j14 != -1) {
                                                            j5 += j14;
                                                        }
                                                        j12 = j5;
                                                        gVar2 = gVar;
                                                        z10 = z3;
                                                        str5 = str8;
                                                        mVar4 = mVar;
                                                        str4 = str3;
                                                        j15 = j13;
                                                        i4 = i2;
                                                        bVar3 = bVar2;
                                                        arrayList5 = list;
                                                        j14 = -1;
                                                        j17 = 0;
                                                        str6 = str2;
                                                        j16 = j6;
                                                        fVar2 = fVar;
                                                        z5 = z10;
                                                    }
                                                }
                                            } else if (bVar3 == null && "PART".equals(z(b2, N, hashMap))) {
                                                String z16 = z(b2, K, hashMap);
                                                long t2 = t(b2, F, -1L);
                                                long t3 = t(b2, G, -1L);
                                                long j23 = j16;
                                                String e4 = e(j23, mVar2, str8);
                                                if (mVar4 == null && !treeMap.isEmpty()) {
                                                    m.b[] bVarArr3 = (m.b[]) treeMap.values().toArray(new m.b[0]);
                                                    m mVar8 = new m(str2, bVarArr3);
                                                    if (mVar3 == null) {
                                                        mVar3 = d(str2, bVarArr3);
                                                    }
                                                    mVar4 = mVar8;
                                                }
                                                if (t2 == -1 || t3 != -1) {
                                                    bVar3 = new f.b(z16, dVar, 0L, i6, j13, mVar4, mVar2, e4, t2 != -1 ? t2 : 0L, t3, false, false, true);
                                                }
                                                gVar2 = gVar;
                                                fVar2 = fVar;
                                                j16 = j23;
                                                str5 = str8;
                                                arrayList6 = arrayList8;
                                                i4 = i2;
                                                arrayList5 = list;
                                                str6 = str2;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        j2 = j16;
                                        z2 = false;
                                    }
                                    gVar2 = gVar;
                                    fVar2 = fVar;
                                    str6 = str14;
                                    str5 = str8;
                                }
                                arrayList6 = arrayList8;
                                arrayList5 = list;
                            }
                        }
                        bVar2 = bVar3;
                        gVar2 = gVar;
                        str5 = str8;
                        i4 = i2;
                        bVar3 = bVar2;
                        j16 = j2;
                        str6 = str2;
                        arrayList6 = arrayList;
                        arrayList5 = list;
                        z5 = z2;
                        fVar2 = fVar;
                    }
                    z5 = false;
                }
                str5 = str8;
                z5 = false;
            }
        }
        int i11 = i4;
        f.b bVar5 = bVar3;
        ArrayList arrayList9 = arrayList6;
        List list3 = arrayList5;
        int i12 = z5 ? 1 : 0;
        HashMap hashMap3 = new HashMap();
        for (int i13 = i12; i13 < arrayList4.size(); i13++) {
            f.c cVar = (f.c) arrayList4.get(i13);
            long j24 = cVar.b;
            if (j24 == -1) {
                j24 = (j9 + arrayList2.size()) - (arrayList9.isEmpty() ? 1L : 0L);
            }
            int i14 = cVar.c;
            if (i14 == -1 && j11 != -9223372036854775807L) {
                i14 = (arrayList9.isEmpty() ? ((f.d) u.d(arrayList2)).m : arrayList9).size() - 1;
            }
            Uri uri = cVar.a;
            hashMap3.put(uri, new f.c(uri, j24, i14));
        }
        if (bVar5 != null) {
            arrayList9.add(bVar5);
        }
        return new f(i11, str, list3, j7, z7, j8, z8, i5, j9, i7, j10, j11, z6, z9, j8 != 0, mVar3, arrayList2, arrayList9, fVar4, hashMap3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:85:0x033e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static a3.g p(a3.i.b r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.i.p(a3.i$b, java.lang.String):a3.g");
    }

    public static boolean q(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z2;
    }

    public static double r(String str, Pattern pattern, double d2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) P2.a.e(matcher.group(1))) : d2;
    }

    public static int s(String str, Pattern pattern, int i2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) P2.a.e(matcher.group(1))) : i2;
    }

    public static long t(String str, Pattern pattern, long j2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) P2.a.e(matcher.group(1))) : j2;
    }

    public static String u(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) P2.a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : B(str2, map);
    }

    public static String v(String str, Pattern pattern, Map map) {
        return u(str, pattern, null, map);
    }

    public static int w(String str, Map map) {
        String v2 = v(str, R, map);
        if (TextUtils.isEmpty(v2)) {
            return 0;
        }
        String[] c1 = K.c1(v2, ",");
        int i2 = K.s(c1, "public.accessibility.describes-video") ? 512 : 0;
        if (K.s(c1, "public.accessibility.transcribes-spoken-dialog")) {
            i2 |= 4096;
        }
        if (K.s(c1, "public.accessibility.describes-music-and-sound")) {
            i2 |= 1024;
        }
        return K.s(c1, "public.easy-to-read") ? i2 | 8192 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static int x(String str) {
        boolean q2 = q(str, U, false);
        ?? r0 = q2;
        if (q(str, V, false)) {
            r0 = (q2 ? 1 : 0) | 2;
        }
        return q(str, T, false) ? r0 | 4 : r0;
    }

    public static f.f y(String str) {
        double r2 = r(str, r, -9.223372036854776E18d);
        long j2 = r2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r2 * 1000000.0d);
        boolean q2 = q(str, s, false);
        double r3 = r(str, u, -9.223372036854776E18d);
        long j3 = r3 == -9.223372036854776E18d ? -9223372036854775807L : (long) (r3 * 1000000.0d);
        double r4 = r(str, v, -9.223372036854776E18d);
        return new f.f(j2, q2, j3, r4 != -9.223372036854776E18d ? (long) (r4 * 1000000.0d) : -9223372036854775807L, q(str, w, false));
    }

    public static String z(String str, Pattern pattern, Map map) {
        String v2 = v(str, pattern, map);
        if (v2 != null) {
            return v2;
        }
        throw z.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public h a(Uri uri, InputStream inputStream) {
        String trim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw z.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    K.m(bufferedReader);
                    throw z.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                trim = readLine.trim();
                if (!trim.isEmpty()) {
                    if (!trim.startsWith("#EXT-X-STREAM-INF")) {
                        if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                            break;
                        }
                        arrayDeque.add(trim);
                    } else {
                        arrayDeque.add(trim);
                        return p(new b(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(trim);
            return o(this.a, this.b, new b(arrayDeque, bufferedReader), uri.toString());
        } finally {
            K.m(bufferedReader);
        }
    }

    public i(g gVar, f fVar) {
        this.a = gVar;
        this.b = fVar;
    }
}
