package w3;

import M2.z;
import P2.L;
import P2.o;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import t7.r;
import w3.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (XmlPullParserException | z | NumberFormatException unused) {
            o.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    public static c b(String str) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        newPullParser.next();
        if (!L.f(newPullParser, "x:xmpmeta")) {
            throw z.a("Couldn't find xmp metadata", null);
        }
        r s = r.s();
        long j = -9223372036854775807L;
        do {
            newPullParser.next();
            if (L.f(newPullParser, "rdf:Description")) {
                if (!d(newPullParser)) {
                    return null;
                }
                j = e(newPullParser);
                s = c(newPullParser);
            } else if (L.f(newPullParser, "Container:Directory")) {
                s = f(newPullParser, "Container", "Item");
            } else if (L.f(newPullParser, "GContainer:Directory")) {
                s = f(newPullParser, "GContainer", "GContainerItem");
            }
        } while (!L.d(newPullParser, "x:xmpmeta"));
        if (s.isEmpty()) {
            return null;
        }
        return new c(j, s);
    }

    public static r c(XmlPullParser xmlPullParser) {
        for (String str : c) {
            String a2 = L.a(xmlPullParser, str);
            if (a2 != null) {
                return r.u(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(a2), 0L));
            }
        }
        return r.s();
    }

    public static boolean d(XmlPullParser xmlPullParser) {
        for (String str : a) {
            String a2 = L.a(xmlPullParser, str);
            if (a2 != null) {
                return Integer.parseInt(a2) == 1;
            }
        }
        return false;
    }

    public static long e(XmlPullParser xmlPullParser) {
        for (String str : b) {
            String a2 = L.a(xmlPullParser, str);
            if (a2 != null) {
                long parseLong = Long.parseLong(a2);
                if (parseLong == -1) {
                    return -9223372036854775807L;
                }
                return parseLong;
            }
        }
        return -9223372036854775807L;
    }

    public static r f(XmlPullParser xmlPullParser, String str, String str2) {
        r.a j = r.j();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (L.f(xmlPullParser, str3)) {
                String a2 = L.a(xmlPullParser, str2 + ":Mime");
                String a3 = L.a(xmlPullParser, str2 + ":Semantic");
                String a4 = L.a(xmlPullParser, str2 + ":Length");
                String a5 = L.a(xmlPullParser, str2 + ":Padding");
                if (a2 == null || a3 == null) {
                    return r.s();
                }
                j.h(new c.a(a2, a3, a4 != null ? Long.parseLong(a4) : 0L, a5 != null ? Long.parseLong(a5) : 0L));
            }
        } while (!L.d(xmlPullParser, str4));
        return j.k();
    }
}
