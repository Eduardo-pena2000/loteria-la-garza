package o1;

import java.util.Arrays;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements o1.a {
    public static final a c = new a(null);
    public static final int d = 8;
    public final float[] a;
    public final float[] b;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public static final /* synthetic */ float a(a aVar, float f, float[] fArr, float[] fArr2) {
            return aVar.b(f, fArr, fArr2);
        }

        public final float b(float f, float[] fArr, float[] fArr2) {
            float f2;
            float f3;
            float f4;
            float a;
            float abs = Math.abs(f);
            float signum = Math.signum(f);
            int binarySearch = Arrays.binarySearch(fArr, abs);
            if (binarySearch >= 0) {
                a = fArr2[binarySearch];
            } else {
                int i = -(binarySearch + 1);
                int i2 = i - 1;
                float f5 = 0.0f;
                if (i2 >= fArr.length - 1) {
                    float f6 = fArr[fArr.length - 1];
                    float f7 = fArr2[fArr.length - 1];
                    if (f6 == 0.0f) {
                        return 0.0f;
                    }
                    return f * (f7 / f6);
                }
                if (i2 == -1) {
                    float f8 = fArr[0];
                    f4 = fArr2[0];
                    f3 = f8;
                    f2 = 0.0f;
                } else {
                    float f9 = fArr[i2];
                    float f10 = fArr[i];
                    f2 = fArr2[i2];
                    f5 = f9;
                    f3 = f10;
                    f4 = fArr2[i];
                }
                a = d.a.a(f2, f4, f5, f3, abs);
            }
            return signum * a;
        }

        public a() {
        }
    }

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.b = fArr2;
    }

    public float a(float f) {
        return a.a(c, f, this.b, this.a);
    }

    public float b(float f) {
        return a.a(c, f, this.a, this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.a, cVar.a) && Arrays.equals(this.b, cVar.b);
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.a);
        t.f(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.b);
        t.f(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
