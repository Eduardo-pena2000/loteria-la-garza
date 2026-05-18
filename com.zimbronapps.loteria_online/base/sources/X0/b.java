package x0;

import u0.l;
import v0.e1;
import v0.j0;
import v0.m1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {

    public static final class a implements h {
        public final /* synthetic */ d a;

        public a(d dVar) {
            this.a = dVar;
        }

        public void a(float[] fArr) {
            this.a.f().u(fArr);
        }

        public void b(m1 m1Var, int i) {
            this.a.f().b(m1Var, i);
        }

        public void c(float f, float f2, float f3, float f4, int i) {
            this.a.f().c(f, f2, f3, f4, i);
        }

        public void d(float f, float f2) {
            this.a.f().d(f, f2);
        }

        public void f(float f, float f2, long j) {
            j0 f3 = this.a.f();
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            f3.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            f3.e(f, f2);
            f3.d(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        public void h(float f, long j) {
            j0 f2 = this.a.f();
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            f2.d(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            f2.r(f);
            f2.d(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
        }

        public void i(float f, float f2, float f3, float f4) {
            j0 f5 = this.a.f();
            d dVar = this.a;
            float intBitsToFloat = Float.intBitsToFloat((int) (j() >> 32)) - (f3 + f);
            long d = l.d((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j() & 4294967295L)) - (f4 + f2)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            if (!(Float.intBitsToFloat((int) (d >> 32)) >= 0.0f && Float.intBitsToFloat((int) (d & 4294967295L)) >= 0.0f)) {
                e1.a("Width and height must be greater than or equal to zero");
            }
            dVar.g(d);
            f5.d(f, f2);
        }

        public long j() {
            return this.a.e();
        }
    }

    public static final /* synthetic */ h a(d dVar) {
        return b(dVar);
    }

    public static final h b(d dVar) {
        return new a(dVar);
    }
}
