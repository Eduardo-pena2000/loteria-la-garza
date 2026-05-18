package z7;

import java.security.GeneralSecurityException;
import y7.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c {
    public static final b.b b = b.b.a;
    public final A7.a a;

    public c(byte[] bArr) {
        if (!b.a()) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException(String.format("Given public key's length is not %s.", new Object[]{32}));
        }
        this.a = A7.a.a(bArr);
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 64) {
            throw new GeneralSecurityException(String.format("The length of the signature is not %s.", new Object[]{64}));
        }
        if (!a.s(bArr2, bArr, this.a.c())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }
}
