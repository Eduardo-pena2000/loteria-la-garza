package z7;

import java.lang.reflect.Array;
import java.math.BigInteger;
import z7.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class b {
    public static final long[] a;
    public static final long[] b;
    public static final long[] c;
    public static final a.a[][] d;
    public static final a.a[] e;
    public static final BigInteger f;
    public static final BigInteger g;
    public static final BigInteger h;
    public static final BigInteger i;

    public static class b {
        public BigInteger a;
        public BigInteger b;

        public b() {
        }

        public static /* synthetic */ BigInteger a(b bVar) {
            return bVar.b;
        }

        public static /* synthetic */ BigInteger b(b bVar, BigInteger bigInteger) {
            bVar.b = bigInteger;
            return bigInteger;
        }

        public static /* synthetic */ BigInteger c(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ BigInteger d(b bVar, BigInteger bigInteger) {
            bVar.a = bigInteger;
            return bigInteger;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        b bVar = new b(null);
        b.b(bVar, BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract));
        b.d(bVar, c(b.a(bVar)));
        a = f.c(d(mod));
        b = f.c(d(mod2));
        c = f.c(d(modPow));
        d = (a.a[][]) Array.newInstance(a.a.class, new int[]{32, 8});
        b bVar2 = bVar;
        for (int i2 = 0; i2 < 32; i2++) {
            b bVar3 = bVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = b(bVar3);
                bVar3 = a(bVar3, bVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bVar2 = a(bVar2, bVar2);
            }
        }
        b a2 = a(bVar, bVar);
        e = new a.a[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = b(bVar);
            bVar = a(bVar, a2);
        }
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b(null);
        BigInteger multiply = g.multiply(b.c(bVar).multiply(b.c(bVar2)).multiply(b.a(bVar)).multiply(b.a(bVar2)));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        BigInteger add = b.c(bVar).multiply(b.a(bVar2)).add(b.c(bVar2).multiply(b.a(bVar)));
        BigInteger bigInteger2 = BigInteger.ONE;
        b.d(bVar3, add.multiply(bigInteger2.add(mod).modInverse(bigInteger)).mod(bigInteger));
        b.b(bVar3, b.a(bVar).multiply(b.a(bVar2)).add(b.c(bVar).multiply(b.c(bVar2))).multiply(bigInteger2.subtract(mod).modInverse(bigInteger)).mod(bigInteger));
        return bVar3;
    }

    public static a.a b(b bVar) {
        BigInteger add = b.a(bVar).add(b.c(bVar));
        BigInteger bigInteger = f;
        return new a.a(f.c(d(add.mod(bigInteger))), f.c(d(b.a(bVar).subtract(b.c(bVar)).mod(bigInteger))), f.c(d(h.multiply(b.c(bVar)).multiply(b.a(bVar)).mod(bigInteger))));
    }

    public static BigInteger c(BigInteger bigInteger) {
        BigInteger pow = bigInteger.pow(2);
        BigInteger bigInteger2 = BigInteger.ONE;
        BigInteger subtract = pow.subtract(bigInteger2);
        BigInteger add = g.multiply(bigInteger.pow(2)).add(bigInteger2);
        BigInteger bigInteger3 = f;
        BigInteger multiply = subtract.multiply(add.modInverse(bigInteger3));
        BigInteger modPow = multiply.modPow(bigInteger3.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), bigInteger3);
        if (!modPow.pow(2).subtract(multiply).mod(bigInteger3).equals(BigInteger.ZERO)) {
            modPow = modPow.multiply(i).mod(bigInteger3);
        }
        return modPow.testBit(0) ? bigInteger3.subtract(modPow) : modPow;
    }

    public static byte[] d(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }
}
