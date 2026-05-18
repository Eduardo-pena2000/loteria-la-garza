package R3;

import L3.i;
import L3.k;
import L3.m;
import L3.s;
import P2.K;
import P2.L;
import P2.o;
import android.text.Layout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements s {
    public static final Pattern b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern f = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final a i = new a(30.0f, 1, 1);
    public final XmlPullParserFactory a;

    public static final class a {
        public final float a;
        public final int b;
        public final int c;

        public a(float f, int i, int i2) {
            this.a = f;
            this.b = i;
            this.c = i2;
        }
    }

    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public d() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.a = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static g d(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public static boolean e(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static Layout.Alignment f(String str) {
        String e2 = s7.c.e(str);
        e2.hashCode();
        switch (e2) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static int g(XmlPullParser xmlPullParser, int i2) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return i2;
        }
        Matcher matcher = h.matcher(attributeValue);
        if (!matcher.matches()) {
            o.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i2;
        }
        boolean z = true;
        try {
            int parseInt = Integer.parseInt((String) P2.a.e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) P2.a.e(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            P2.a.b(z, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            o.h("TtmlParser", "Ignoring malformed cell resolution: " + attributeValue);
            return i2;
        }
    }

    public static void h(String str, g gVar) {
        Matcher matcher;
        String str2;
        CharSequence[] c1 = K.c1(str, "\\s+");
        if (c1.length == 1) {
            matcher = d.matcher(str);
        } else {
            if (c1.length != 2) {
                throw new m("Invalid number of entries for fontSize: " + c1.length + ".");
            }
            matcher = d.matcher(c1[1]);
            o.h("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new m("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) P2.a.e(matcher.group(3));
        str2.hashCode();
        switch (str2) {
            case "%":
                gVar.z(3);
                break;
            case "em":
                gVar.z(2);
                break;
            case "px":
                gVar.z(1);
                break;
            default:
                throw new m("Invalid unit for fontSize: '" + str2 + "'.");
        }
        gVar.y(Float.parseFloat((String) P2.a.e(matcher.group(1))));
    }

    public static a i(XmlPullParser xmlPullParser) {
        float f2;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            P2.a.b(K.c1(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f2 = 1.0f;
        }
        a aVar = i;
        int i2 = aVar.b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = aVar.c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new a(parseInt * f2, i2, i3);
    }

    public static Map j(XmlPullParser xmlPullParser, Map map, int i2, b bVar, Map map2, Map map3) {
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "style")) {
                String a2 = L.a(xmlPullParser, "style");
                g o = o(xmlPullParser, new g());
                if (a2 != null) {
                    for (String str : p(a2)) {
                        o.a((g) map.get(str));
                    }
                }
                String g2 = o.g();
                if (g2 != null) {
                    map.put(g2, o);
                }
            } else if (L.f(xmlPullParser, "region")) {
                e m = m(xmlPullParser, i2, bVar);
                if (m != null) {
                    map2.put(m.a, m);
                }
            } else if (L.f(xmlPullParser, "metadata")) {
                k(xmlPullParser, map3);
            }
        } while (!L.d(xmlPullParser, "head"));
        return map;
    }

    public static void k(XmlPullParser xmlPullParser, Map map) {
        String a2;
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, "image") && (a2 = L.a(xmlPullParser, "id")) != null) {
                map.put(a2, xmlPullParser.nextText());
            }
        } while (!L.d(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R3.c l(org.xmlpull.v1.XmlPullParser r20, R3.c r21, java.util.Map r22, R3.d.a r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.d.l(org.xmlpull.v1.XmlPullParser, R3.c, java.util.Map, R3.d$a):R3.c");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R3.e m(org.xmlpull.v1.XmlPullParser r18, int r19, R3.d.b r20) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.d.m(org.xmlpull.v1.XmlPullParser, int, R3.d$b):R3.e");
    }

    public static float n(String str) {
        Matcher matcher = e.matcher(str);
        if (!matcher.matches()) {
            o.h("TtmlParser", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) P2.a.e(matcher.group(1)))));
        } catch (NumberFormatException e2) {
            o.i("TtmlParser", "Failed to parse shear: " + str, e2);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static R3.g o(org.xmlpull.v1.XmlPullParser r13, R3.g r14) {
        /*
            Method dump skipped, instructions count: 930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.d.o(org.xmlpull.v1.XmlPullParser, R3.g):R3.g");
    }

    public static String[] p(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : K.c1(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long q(java.lang.String r13, R3.d.a r14) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.d.q(java.lang.String, R3.d$a):long");
    }

    public static b r(XmlPullParser xmlPullParser) {
        String a2 = L.a(xmlPullParser, "extent");
        if (a2 == null) {
            return null;
        }
        Matcher matcher = g.matcher(a2);
        if (!matcher.matches()) {
            o.h("TtmlParser", "Ignoring non-pixel tts extent: " + a2);
            return null;
        }
        try {
            return new b(Integer.parseInt((String) P2.a.e(matcher.group(1))), Integer.parseInt((String) P2.a.e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            o.h("TtmlParser", "Ignoring malformed tts extent: " + a2);
            return null;
        }
    }

    public k a(byte[] bArr, int i2, int i3) {
        char c2;
        a aVar;
        try {
            XmlPullParser newPullParser = this.a.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new e(""));
            b bVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i2, i3), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            a aVar2 = i;
            h hVar = null;
            int i4 = 0;
            int i5 = 15;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                c cVar = (c) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar2 = i(newPullParser);
                            c2 = 15;
                            i5 = g(newPullParser, 15);
                            bVar = r(newPullParser);
                        } else {
                            c2 = 15;
                        }
                        b bVar2 = bVar;
                        a aVar3 = aVar2;
                        int i6 = i5;
                        if (e(name)) {
                            if ("head".equals(name)) {
                                aVar = aVar3;
                                j(newPullParser, hashMap, i6, bVar2, hashMap2, hashMap3);
                            } else {
                                aVar = aVar3;
                                try {
                                    c l = l(newPullParser, cVar, hashMap2, aVar);
                                    arrayDeque.push(l);
                                    if (cVar != null) {
                                        cVar.a(l);
                                    }
                                } catch (m e2) {
                                    o.i("TtmlParser", "Suppressing parser error", e2);
                                    i4++;
                                }
                            }
                            aVar2 = aVar;
                            bVar = bVar2;
                            i5 = i6;
                        } else {
                            o.f("TtmlParser", "Ignoring unsupported tag: " + newPullParser.getName());
                            i4++;
                            aVar2 = aVar3;
                            bVar = bVar2;
                            i5 = i6;
                        }
                    } else if (eventType == 4) {
                        ((c) P2.a.e(cVar)).a(c.d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            hVar = new h((c) P2.a.e((c) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            return (k) P2.a.e(hVar);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        } catch (IOException e4) {
            throw new IllegalStateException("Unexpected error when reading input.", e4);
        }
    }

    public void b(byte[] bArr, int i2, int i3, s.b bVar, P2.g gVar) {
        i.c(a(bArr, i2, i3), bVar, gVar);
    }

    public int c() {
        return 1;
    }
}
