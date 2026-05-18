package X2;

import M2.m;
import M2.q;
import M2.t;
import M2.y;
import M2.z;
import P2.G;
import P2.K;
import P2.L;
import X2.k;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k3.n;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import t7.r;
import t7.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d extends DefaultHandler implements n.a {
    public static final Pattern b = Pattern.compile("(\\d+)(?:/(\\d+))?");
    public static final Pattern c = Pattern.compile("CC([1-4])=.*");
    public static final Pattern d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    public static final int[] e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};
    public final XmlPullParserFactory a;

    public static final class a {
        public final q a;
        public final r b;
        public final k c;
        public final String d;
        public final ArrayList e;
        public final ArrayList f;
        public final long g;
        public final List h;
        public final List i;

        public a(q qVar, List list, k kVar, String str, ArrayList arrayList, ArrayList arrayList2, List list2, List list3, long j) {
            this.a = qVar;
            this.b = r.n(list);
            this.c = kVar;
            this.d = str;
            this.e = arrayList;
            this.f = arrayList2;
            this.h = list2;
            this.i = list3;
            this.g = j;
        }
    }

    public d() {
        try {
            this.a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int D(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.a) && (str = eVar.b) != null) {
                Matcher matcher = c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                P2.o.h("MpdParser", "Unable to parse CEA-608 channel number from: " + eVar.b);
            }
        }
        return -1;
    }

    public static int E(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.a) && (str = eVar.b) != null) {
                Matcher matcher = d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                P2.o.h("MpdParser", "Unable to parse CEA-708 service block number from: " + eVar.b);
            }
        }
        return -1;
    }

    public static long H(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : K.R0(attributeValue);
    }

    public static e I(XmlPullParser xmlPullParser, String str) {
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", null);
        String r03 = r0(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!L.d(xmlPullParser, str));
        return new e(r0, r02, r03);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "value"
            java.lang.String r4 = r4.getAttributeValue(r2, r3)
            r2 = -1
            if (r4 != 0) goto Ld
            return r2
        Ld:
            java.lang.String r4 = s7.c.e(r4)
            r4.hashCode()
            int r3 = r4.hashCode()
            switch(r3) {
                case 1596796: goto L49;
                case 2937391: goto L3e;
                case 3094034: goto L33;
                case 3094035: goto L28;
                case 3133436: goto L1d;
                default: goto L1b;
            }
        L1b:
            r4 = r2
            goto L53
        L1d:
            java.lang.String r3 = "fa01"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            goto L1b
        L26:
            r4 = 4
            goto L53
        L28:
            java.lang.String r3 = "f801"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L31
            goto L1b
        L31:
            r4 = 3
            goto L53
        L33:
            java.lang.String r3 = "f800"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L3c
            goto L1b
        L3c:
            r4 = r0
            goto L53
        L3e:
            java.lang.String r3 = "a000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L47
            goto L1b
        L47:
            r4 = r1
            goto L53
        L49:
            java.lang.String r3 = "4000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L52
            goto L1b
        L52:
            r4 = 0
        L53:
            switch(r4) {
                case 0: goto L5f;
                case 1: goto L5e;
                case 2: goto L5c;
                case 3: goto L5a;
                case 4: goto L57;
                default: goto L56;
            }
        L56:
            return r2
        L57:
            r4 = 8
            return r4
        L5a:
            r4 = 6
            return r4
        L5c:
            r4 = 5
            return r4
        L5e:
            return r0
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.J(org.xmlpull.v1.XmlPullParser):int");
    }

    public static int K(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    public static int L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    public static long M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : K.S0(attributeValue);
    }

    public static String N(List list) {
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            String str = eVar.a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(eVar.b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(eVar.b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? f : Float.parseFloat(attributeValue);
    }

    public static float S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        return !TextUtils.isEmpty(matcher.group(2)) ? parseInt / Integer.parseInt(r2) : parseInt;
    }

    public static int U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long W(List list) {
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            if (s7.c.a("http://dashif.org/guidelines/last-segment-number", eVar.a)) {
                return Long.parseLong(eVar.b);
            }
        }
        return -1L;
    }

    public static long X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int Z(XmlPullParser xmlPullParser) {
        int U = U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    public static int p(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        P2.a.f(i == i2);
        return i;
    }

    public static String q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        P2.a.f(str.equals(str2));
        return str;
    }

    public static void r(ArrayList arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            m.b bVar = (m.b) arrayList.get(i);
            if (M2.g.c.equals(bVar.b) && (str = bVar.c) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            m.b bVar2 = (m.b) arrayList.get(i2);
            if (M2.g.b.equals(bVar2.b) && bVar2.c == null) {
                arrayList.set(i2, new m.b(M2.g.c, str, bVar2.d, bVar2.e));
            }
        }
    }

    public static String r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m.b bVar = (m.b) arrayList.get(size);
            if (!bVar.d()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((m.b) arrayList.get(i)).b(bVar)) {
                        arrayList.remove(size);
                        break;
                    }
                    i++;
                }
            }
        }
    }

    public static String s0(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                w(xmlPullParser);
            }
        } while (!L.d(xmlPullParser, str));
        return str2;
    }

    public static long t(long j, long j2) {
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    public static String u(String str, String str2) {
        if (y.o(str)) {
            return y.c(str2);
        }
        if (y.s(str)) {
            return y.n(str2);
        }
        if (y.r(str)) {
            return str;
        }
        if (y.p(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String g = y.g(str2);
        return "text/vtt".equals(g) ? "application/x-mp4-vtt" : g;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (L.e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (L.e(xmlPullParser)) {
                    i++;
                } else if (L.c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = r0(r4, r0, r1)
            r0.hashCode()
            r1 = -1
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128649360: goto L56;
                case -1352850286: goto L4b;
                case -1138141449: goto L40;
                case -986633423: goto L35;
                case -79006963: goto L2a;
                case 312179081: goto L1f;
                case 2036691300: goto L14;
                default: goto L12;
            }
        L12:
            r0 = r1
            goto L60
        L14:
            java.lang.String r2 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L1d
            goto L12
        L1d:
            r0 = 6
            goto L60
        L1f:
            java.lang.String r2 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L28
            goto L12
        L28:
            r0 = 5
            goto L60
        L2a:
            java.lang.String r2 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L33
            goto L12
        L33:
            r0 = 4
            goto L60
        L35:
            java.lang.String r2 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            r0 = 3
            goto L60
        L40:
            java.lang.String r2 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L49
            goto L12
        L49:
            r0 = 2
            goto L60
        L4b:
            java.lang.String r2 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L54
            goto L12
        L54:
            r0 = 1
            goto L60
        L56:
            java.lang.String r2 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L5f
            goto L12
        L5f:
            r0 = 0
        L60:
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L73;
                case 2: goto L6e;
                case 3: goto L69;
                case 4: goto L7a;
                case 5: goto L64;
                case 6: goto L6e;
                default: goto L63;
            }
        L63:
            goto L7e
        L64:
            int r1 = L(r4)
            goto L7e
        L69:
            int r1 = Z(r4)
            goto L7e
        L6e:
            int r1 = J(r4)
            goto L7e
        L73:
            java.lang.String r0 = "value"
            int r1 = U(r4, r0, r1)
            goto L7e
        L7a:
            int r1 = K(r4)
        L7e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = P2.L.d(r4, r0)
            if (r0 == 0) goto L7e
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.A(org.xmlpull.v1.XmlPullParser):int");
    }

    public long B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List C(XmlPullParser xmlPullParser, List list, boolean z) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : z ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        int parseInt2 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String s0 = s0(xmlPullParser, "BaseURL");
        if (G.c(s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = s0;
            }
            return x.j(new b[]{new b(s0, attributeValue3, parseInt, parseInt2)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            b bVar = (b) list.get(i);
            String e2 = G.e(bVar.a, s0);
            String str = attributeValue3 == null ? e2 : attributeValue3;
            if (z) {
                parseInt = bVar.c;
                parseInt2 = bVar.d;
                str = bVar.b;
            }
            arrayList.add(new b(e2, str, parseInt, parseInt2));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0099  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair F(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair O(XmlPullParser xmlPullParser, String str, String str2, long j, long j2, ByteArrayOutputStream byteArrayOutputStream) {
        long X = X(xmlPullParser, "id", 0L);
        long X2 = X(xmlPullParser, "duration", -9223372036854775807L);
        long X3 = X(xmlPullParser, "presentationTime", 0L);
        long X0 = K.X0(X2, 1000L, j);
        long X02 = K.X0(X3 - j2, 1000000L, j);
        String r0 = r0(xmlPullParser, "messageData", null);
        byte[] P = P(xmlPullParser, byteArrayOutputStream);
        Long valueOf = Long.valueOf(X02);
        if (r0 != null) {
            P = K.r0(r0);
        }
        return Pair.create(valueOf, d(str, str2, X, X0, P));
    }

    public byte[] P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, s7.e.c.name());
        xmlPullParser.nextToken();
        while (!L.d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public f Q(XmlPullParser xmlPullParser) {
        ByteArrayOutputStream byteArrayOutputStream;
        long j;
        List list;
        String r0 = r0(xmlPullParser, "schemeIdUri", "");
        String r02 = r0(xmlPullParser, "value", "");
        long X = X(xmlPullParser, "timescale", 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", 0L);
        List arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Event")) {
                byteArrayOutputStream = byteArrayOutputStream2;
                long j2 = X2;
                j = X2;
                list = arrayList;
                list.add(O(xmlPullParser, r0, r02, X, j2, byteArrayOutputStream));
            } else {
                byteArrayOutputStream = byteArrayOutputStream2;
                j = X2;
                list = arrayList;
                w(xmlPullParser);
            }
            if (L.d(xmlPullParser, "EventStream")) {
                break;
            }
            arrayList = list;
            byteArrayOutputStream2 = byteArrayOutputStream;
            X2 = j;
        }
        long[] jArr = new long[list.size()];
        z3.a[] aVarArr = new z3.a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Pair pair = (Pair) list.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            aVarArr[i] = (z3.a) pair.second;
        }
        return e(r0, r02, X, jArr, aVarArr);
    }

    public i T(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "sourceURL", "range");
    }

    public t V(XmlPullParser xmlPullParser) {
        return new t(xmlPullParser.getAttributeValue((String) null, "lang"), s0(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x01e6 A[LOOP:0: B:18:0x00a2->B:26:0x01e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X2.c Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):X2.c");
    }

    public Pair a0(XmlPullParser xmlPullParser, List list, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        List list2;
        List list3;
        ArrayList arrayList;
        Object obj;
        long j6;
        k l0;
        d dVar = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long M = M(xmlPullParser2, "start", j);
        long j7 = -9223372036854775807L;
        long j8 = j3 != -9223372036854775807L ? j3 + M : -9223372036854775807L;
        long M2 = M(xmlPullParser2, "duration", -9223372036854775807L);
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List arrayList4 = new ArrayList();
        long j9 = j2;
        boolean z2 = false;
        long j10 = -9223372036854775807L;
        k kVar = null;
        e eVar = null;
        while (true) {
            xmlPullParser.next();
            if (L.f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j9 = dVar.B(xmlPullParser2, j9);
                    z2 = true;
                }
                arrayList4.addAll(dVar.C(xmlPullParser2, list, z));
                arrayList = arrayList3;
                list2 = arrayList4;
                j6 = j7;
                obj = obj2;
                list3 = arrayList2;
            } else {
                if (L.f(xmlPullParser2, "AdaptationSet")) {
                    j5 = j9;
                    list2 = arrayList4;
                    list3 = arrayList2;
                    list3.add(y(xmlPullParser, !arrayList4.isEmpty() ? arrayList4 : list, kVar, M2, j9, j10, j8, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList = arrayList3;
                } else {
                    j5 = j9;
                    ArrayList arrayList5 = arrayList3;
                    list2 = arrayList4;
                    list3 = arrayList2;
                    xmlPullParser2 = xmlPullParser;
                    if (L.f(xmlPullParser2, "EventStream")) {
                        arrayList5.add(Q(xmlPullParser));
                        arrayList = arrayList5;
                    } else if (L.f(xmlPullParser2, "SegmentBase")) {
                        arrayList = arrayList5;
                        kVar = j0(xmlPullParser2, null);
                        obj = null;
                        j9 = j5;
                        j6 = -9223372036854775807L;
                    } else {
                        arrayList = arrayList5;
                        if (L.f(xmlPullParser2, "SegmentList")) {
                            long B = B(xmlPullParser2, -9223372036854775807L);
                            obj = null;
                            l0 = k0(xmlPullParser, null, j8, M2, j5, B, j4);
                            j10 = B;
                            j9 = j5;
                            j6 = -9223372036854775807L;
                        } else {
                            obj = null;
                            if (L.f(xmlPullParser2, "SegmentTemplate")) {
                                long B2 = B(xmlPullParser2, -9223372036854775807L);
                                j6 = -9223372036854775807L;
                                l0 = l0(xmlPullParser, null, r.s(), j8, M2, j5, B2, j4);
                                j10 = B2;
                                j9 = j5;
                            } else {
                                j6 = -9223372036854775807L;
                                if (L.f(xmlPullParser2, "AssetIdentifier")) {
                                    eVar = I(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    w(xmlPullParser);
                                }
                                j9 = j5;
                            }
                        }
                        kVar = l0;
                    }
                }
                obj = null;
                j6 = -9223372036854775807L;
                j9 = j5;
            }
            if (L.d(xmlPullParser2, "Period")) {
                return Pair.create(h(attributeValue, M, list3, arrayList, eVar), Long.valueOf(M2));
            }
            arrayList2 = list3;
            arrayList4 = list2;
            obj2 = obj;
            arrayList3 = arrayList;
            j7 = j6;
            dVar = this;
        }
    }

    public final long b(List list, long j, long j2, int i, long j3) {
        int l = i >= 0 ? i + 1 : (int) K.l(j3 - j, j2);
        for (int i2 = 0; i2 < l; i2++) {
            list.add(m(j, j2));
            j += j2;
        }
        return j;
    }

    public String[] b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public X2.a c(long j, int i, List list, List list2, List list3, List list4) {
        return new X2.a(j, i, list, list2, list3, list4);
    }

    public h c0(XmlPullParser xmlPullParser) {
        String str = null;
        String r0 = r0(xmlPullParser, "moreInformationURL", null);
        String r02 = r0(xmlPullParser, "lang", null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (L.f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (L.f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                w(xmlPullParser);
            }
            String str4 = str3;
            if (L.d(xmlPullParser, "ProgramInformation")) {
                return new h(str, str2, str4, r0, r02);
            }
            str3 = str4;
        }
    }

    public z3.a d(String str, String str2, long j, long j2, byte[] bArr) {
        return new z3.a(str, str2, j2, j, bArr);
    }

    public i d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
            }
            return i(attributeValue, j, j2);
        }
        j = 0;
        j2 = -1;
        return i(attributeValue, j, j2);
    }

    public f e(String str, String str2, long j, long[] jArr, z3.a[] aVarArr) {
        return new f(str, str2, j, jArr, aVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01ee A[LOOP:0: B:2:0x006a->B:11:0x01ee, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0198 A[EDGE_INSN: B:12:0x0198->B:13:0x0198 BREAK  A[LOOP:0: B:2:0x006a->B:11:0x01ee], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X2.d.a e0(org.xmlpull.v1.XmlPullParser r36, java.util.List r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List r46, java.util.List r47, java.util.List r48, java.util.List r49, X2.k r50, long r51, long r53, long r55, long r57, long r59, boolean r61) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, X2.k, long, long, long, long, long, boolean):X2.d$a");
    }

    public q f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List list, List list2, String str4, List list3, List list4) {
        String str5 = str4;
        String u = u(str2, str5);
        if ("audio/eac3".equals(u)) {
            u = N(list4);
            if ("audio/eac3-joc".equals(u)) {
                str5 = "ec+3";
            }
        }
        int p0 = p0(list);
        int i0 = i0(list) | f0(list2) | h0(list3) | h0(list4);
        Pair t0 = t0(list3);
        q.b e0 = new q.b().a0(str).Q(str2).o0(u).O(str5).j0(i5).q0(p0).m0(i0).e0(str3);
        int i6 = -1;
        q.b u0 = e0.t0(t0 != null ? ((Integer) t0.first).intValue() : -1).u0(t0 != null ? ((Integer) t0.second).intValue() : -1);
        if (y.s(u)) {
            u0.v0(i).Y(i2).X(f);
        } else if (y.o(u)) {
            u0.N(i3).p0(i4);
        } else if (y.r(u)) {
            if ("application/cea-608".equals(u)) {
                i6 = D(list2);
            } else if ("application/cea-708".equals(u)) {
                i6 = E(list2);
            }
            u0.L(i6);
        } else if (y.p(u)) {
            u0.v0(i).Y(i2);
        }
        return u0.K();
    }

    public int f0(List list) {
        int u0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = (e) list.get(i2);
            if (s7.c.a("urn:mpeg:dash:role:2011", eVar.a)) {
                u0 = g0(eVar.b);
            } else if (s7.c.a("urn:tva:metadata:cs:AudioPurposeCS:2007", eVar.a)) {
                u0 = u0(eVar.b);
            }
            i |= u0;
        }
        return i;
    }

    public c g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, h hVar, o oVar, l lVar, Uri uri, List list) {
        return new c(j, j2, j3, z, j4, j5, j6, j7, hVar, oVar, lVar, uri, list);
    }

    public int g0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public g h(String str, long j, List list, List list2, e eVar) {
        return new g(str, j, list, list2, eVar);
    }

    public int h0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (s7.c.a("http://dashif.org/guidelines/trickmode", ((e) list.get(i2)).a)) {
                i = 16384;
            }
        }
        return i;
    }

    public i i(String str, long j, long j2) {
        return new i(str, j, j2);
    }

    public int i0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = (e) list.get(i2);
            if (s7.c.a("urn:mpeg:dash:role:2011", eVar.a)) {
                i |= g0(eVar.b);
            }
        }
        return i;
    }

    public j j(a aVar, String str, List list, String str2, ArrayList arrayList, ArrayList arrayList2) {
        q.b a2 = aVar.a.a();
        if (str == null || !list.isEmpty()) {
            a2.d0(list);
        } else {
            a2.c0(str);
        }
        String str3 = aVar.d;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList arrayList3 = aVar.e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            r(arrayList3);
            s(arrayList3);
            a2.U(new M2.m(str3, (List) arrayList3));
        }
        ArrayList arrayList4 = aVar.f;
        arrayList4.addAll(arrayList2);
        return j.o(aVar.g, a2.K(), aVar.b, aVar.c, arrayList4, aVar.h, aVar.i, null);
    }

    public k.e j0(XmlPullParser xmlPullParser, k.e eVar) {
        long j;
        long j2;
        long X = X(xmlPullParser, "timescale", eVar != null ? eVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", eVar != null ? eVar.c : 0L);
        long j3 = eVar != null ? eVar.d : 0L;
        long j4 = eVar != null ? eVar.e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            j2 = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - j2) + 1;
        } else {
            j = j4;
            j2 = j3;
        }
        i iVar = eVar != null ? eVar.a : null;
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else {
                w(xmlPullParser);
            }
        } while (!L.d(xmlPullParser, "SegmentBase"));
        return n(iVar, X, X2, j2, j);
    }

    public k.b k(i iVar, long j, long j2, long j3, long j4, List list, long j5, List list2, long j6, long j7) {
        return new k.b(iVar, j, j2, j3, j4, list, j5, list2, K.K0(j6), K.K0(j7));
    }

    public k.b k0(XmlPullParser xmlPullParser, k.b bVar, long j, long j2, long j3, long j4, long j5) {
        long X = X(xmlPullParser, "timescale", bVar != null ? bVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", bVar != null ? bVar.c : 0L);
        long X3 = X(xmlPullParser, "duration", bVar != null ? bVar.e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", bVar != null ? bVar.d : 1L);
        long t = t(j3, j4);
        List list = null;
        List list2 = null;
        i iVar = null;
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (L.f(xmlPullParser, "SegmentTimeline")) {
                list = m0(xmlPullParser, X, j2);
            } else if (L.f(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(n0(xmlPullParser));
            } else {
                w(xmlPullParser);
            }
        } while (!L.d(xmlPullParser, "SegmentList"));
        if (bVar != null) {
            if (iVar == null) {
                iVar = bVar.a;
            }
            if (list == null) {
                list = bVar.f;
            }
            if (list2 == null) {
                list2 = bVar.j;
            }
        }
        return k(iVar, X, X2, X4, X3, list, t, list2, j5, j);
    }

    public k.c l(i iVar, long j, long j2, long j3, long j4, long j5, List list, long j6, n nVar, n nVar2, long j7, long j8) {
        return new k.c(iVar, j, j2, j3, j4, j5, list, j6, nVar, nVar2, K.K0(j7), K.K0(j8));
    }

    public k.c l0(XmlPullParser xmlPullParser, k.c cVar, List list, long j, long j2, long j3, long j4, long j5) {
        long X = X(xmlPullParser, "timescale", cVar != null ? cVar.b : 1L);
        long X2 = X(xmlPullParser, "presentationTimeOffset", cVar != null ? cVar.c : 0L);
        long X3 = X(xmlPullParser, "duration", cVar != null ? cVar.e : -9223372036854775807L);
        long X4 = X(xmlPullParser, "startNumber", cVar != null ? cVar.d : 1L);
        long W = W(list);
        long t = t(j3, j4);
        List list2 = null;
        n v0 = v0(xmlPullParser, "media", cVar != null ? cVar.k : null);
        n v02 = v0(xmlPullParser, "initialization", cVar != null ? cVar.j : null);
        i iVar = null;
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Initialization")) {
                iVar = T(xmlPullParser);
            } else if (L.f(xmlPullParser, "SegmentTimeline")) {
                list2 = m0(xmlPullParser, X, j2);
            } else {
                w(xmlPullParser);
            }
        } while (!L.d(xmlPullParser, "SegmentTemplate"));
        if (cVar != null) {
            if (iVar == null) {
                iVar = cVar.a;
            }
            if (list2 == null) {
                list2 = cVar.f;
            }
        }
        return l(iVar, X, X2, X4, W, X3, list2, t, v02, v0, j5, j);
    }

    public k.d m(long j, long j2) {
        return new k.d(j, j2);
    }

    public List m0(XmlPullParser xmlPullParser, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "S")) {
                long X = X(xmlPullParser, "t", -9223372036854775807L);
                if (z) {
                    j3 = b(arrayList, j3, j4, i, X);
                }
                if (X == -9223372036854775807L) {
                    X = j3;
                }
                j4 = X(xmlPullParser, "d", -9223372036854775807L);
                i = U(xmlPullParser, "r", 0);
                z = true;
                j3 = X;
            } else {
                w(xmlPullParser);
            }
        } while (!L.d(xmlPullParser, "SegmentTimeline"));
        if (z) {
            b(arrayList, j3, j4, i, K.X0(j2, j, 1000L));
        }
        return arrayList;
    }

    public k.e n(i iVar, long j, long j2, long j3, long j4) {
        return new k.e(iVar, j, j2, j3, j4);
    }

    public i n0(XmlPullParser xmlPullParser) {
        return d0(xmlPullParser, "media", "mediaRange");
    }

    public o o(String str, String str2) {
        return new o(str, str2);
    }

    public int o0(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int p0(List list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            e eVar = (e) list.get(i2);
            if (s7.c.a("urn:mpeg:dash:role:2011", eVar.a)) {
                i |= o0(eVar.b);
            }
        }
        return i;
    }

    public l q0(XmlPullParser xmlPullParser) {
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "Latency")) {
                j = X(xmlPullParser, "target", -9223372036854775807L);
                j2 = X(xmlPullParser, "min", -9223372036854775807L);
                j3 = X(xmlPullParser, "max", -9223372036854775807L);
            } else if (L.f(xmlPullParser, "PlaybackRate")) {
                f = R(xmlPullParser, "min", -3.4028235E38f);
                f2 = R(xmlPullParser, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (L.d(xmlPullParser, "ServiceDescription")) {
                return new l(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    public Pair t0(List list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            e eVar = (e) list.get(i);
            if ((s7.c.a("http://dashif.org/thumbnail_tile", eVar.a) || s7.c.a("http://dashif.org/guidelines/thumbnail_tile", eVar.a)) && (str = eVar.b) != null) {
                String[] c1 = K.c1(str, "x");
                if (c1.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(c1[0])), Integer.valueOf(Integer.parseInt(c1[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int u0(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public final boolean v(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public n v0(XmlPullParser xmlPullParser, String str, n nVar) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        return attributeValue != null ? n.b(attributeValue) : nVar;
    }

    public o w0(XmlPullParser xmlPullParser) {
        return o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return Y(newPullParser, uri);
            }
            throw z.c("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e2) {
            throw z.c(null, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0352 A[LOOP:0: B:2:0x007f->B:10:0x0352, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0310 A[EDGE_INSN: B:11:0x0310->B:12:0x0310 BREAK  A[LOOP:0: B:2:0x007f->B:10:0x0352], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X2.a y(org.xmlpull.v1.XmlPullParser r57, java.util.List r58, X2.k r59, long r60, long r62, long r64, long r66, long r68, boolean r70) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.d.y(org.xmlpull.v1.XmlPullParser, java.util.List, X2.k, long, long, long, long, long, boolean):X2.a");
    }

    public void z(XmlPullParser xmlPullParser) {
        w(xmlPullParser);
    }
}
