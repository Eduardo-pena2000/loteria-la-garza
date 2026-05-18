package J1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class e {

    public static class a {
        public static int a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    public interface b {
    }

    public static final class c implements b {
        public final d[] a;

        public c(d[] dVarArr) {
            this.a = dVarArr;
        }

        public d[] a() {
            return this.a;
        }
    }

    public static final class d {
        public final String a;
        public final int b;
        public final boolean c;
        public final String d;
        public final int e;
        public final int f;

        public d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    public static final class e implements b {
        public final Q1.e a;
        public final Q1.e b;
        public final int c;
        public final int d;
        public final String e;

        public e(Q1.e eVar, Q1.e eVar2, int i, int i2, String str) {
            this.a = eVar;
            this.b = eVar2;
            this.d = i;
            this.c = i2;
            this.e = str;
        }

        public Q1.e a() {
            return this.b;
        }

        public int b() {
            return this.d;
        }

        public Q1.e c() {
            return this.a;
        }

        public String d() {
            return this.e;
        }

        public int e() {
            return this.c;
        }
    }

    public static int a(TypedArray typedArray, int i) {
        return a.a(typedArray, i);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static b d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    public static b e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), F1.d.h);
        String string = obtainAttributes.getString(F1.d.i);
        String string2 = obtainAttributes.getString(F1.d.n);
        String string3 = obtainAttributes.getString(F1.d.o);
        String string4 = obtainAttributes.getString(F1.d.k);
        int resourceId = obtainAttributes.getResourceId(F1.d.j, 0);
        int integer = obtainAttributes.getInteger(F1.d.l, 1);
        int integer2 = obtainAttributes.getInteger(F1.d.m, 500);
        String string5 = obtainAttributes.getString(F1.d.p);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            List c2 = c(resources, resourceId);
            return new e(new Q1.e(string, string2, string3, c2), string4 != null ? new Q1.e(string, string2, string4, c2) : null, integer, integer2, string5);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new c((d[]) arrayList.toArray(new d[0]));
    }

    public static d f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), F1.d.q);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(F1.d.z) ? F1.d.z : F1.d.s, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(F1.d.x) ? F1.d.x : F1.d.t, 0);
        int i2 = obtainAttributes.hasValue(F1.d.A) ? F1.d.A : F1.d.u;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(F1.d.y) ? F1.d.y : F1.d.v);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(F1.d.w) ? F1.d.w : F1.d.r;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(string2, i, z, string, i3, resourceId);
    }

    public static void g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
