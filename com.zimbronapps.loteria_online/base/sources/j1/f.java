package J1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static a a(a aVar, int i, int i2, boolean z, int i3) {
        return aVar != null ? aVar : z ? new a(i, i3, i2) : new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray q = k.q(resources, theme, attributeSet, F1.d.B);
        float j = k.j(q, xmlPullParser, "startX", F1.d.K, 0.0f);
        float j2 = k.j(q, xmlPullParser, "startY", F1.d.L, 0.0f);
        float j3 = k.j(q, xmlPullParser, "endX", F1.d.M, 0.0f);
        float j4 = k.j(q, xmlPullParser, "endY", F1.d.N, 0.0f);
        float j5 = k.j(q, xmlPullParser, "centerX", F1.d.F, 0.0f);
        float j6 = k.j(q, xmlPullParser, "centerY", F1.d.G, 0.0f);
        int k = k.k(q, xmlPullParser, "type", F1.d.E, 0);
        int f = k.f(q, xmlPullParser, "startColor", F1.d.C, 0);
        boolean p = k.p(xmlPullParser, "centerColor");
        int f2 = k.f(q, xmlPullParser, "centerColor", F1.d.J, 0);
        int f3 = k.f(q, xmlPullParser, "endColor", F1.d.D, 0);
        int k2 = k.k(q, xmlPullParser, "tileMode", F1.d.I, 0);
        float j7 = k.j(q, xmlPullParser, "gradientRadius", F1.d.H, 0.0f);
        q.recycle();
        a a2 = a(c(resources, xmlPullParser, attributeSet, theme), f, f3, p, f2);
        if (k != 1) {
            return k != 2 ? new LinearGradient(j, j2, j3, j4, a2.a, a2.b, d(k2)) : new SweepGradient(j5, j6, a2.a, a2.b);
        }
        if (j7 > 0.0f) {
            return new RadialGradient(j5, j6, j7, a2.a, a2.b, d(k2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static J1.f.a c(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L85
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L85
        L21:
            r6 = 2
            if (r3 == r6) goto L25
            goto L12
        L25:
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L34
            goto L12
        L34:
            int[] r3 = F1.d.O
            android.content.res.TypedArray r3 = J1.k.q(r8, r11, r10, r3)
            int r5 = F1.d.P
            boolean r5 = r3.hasValue(r5)
            int r6 = F1.d.Q
            boolean r6 = r3.hasValue(r6)
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L6a
            int r5 = F1.d.P
            r6 = 0
            int r5 = r3.getColor(r5, r6)
            int r6 = F1.d.Q
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6a:
            org.xmlpull.v1.XmlPullParserException r8 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r10.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L85:
            int r8 = r4.size()
            if (r8 <= 0) goto L91
            J1.f$a r8 = new J1.f$a
            r8.<init>(r4, r2)
            return r8
        L91:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.f.c(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):J1.f$a");
    }

    public static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(List list, List list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = ((Integer) list.get(i)).intValue();
                this.b[i] = ((Float) list2.get(i)).floatValue();
            }
        }

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
