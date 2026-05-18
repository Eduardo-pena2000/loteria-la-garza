package com.revenuecat.purchases.common.verification;

import Da.p;
import ab.b;
import ab.d;
import ab.e;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.IntExtensionsKt;
import com.revenuecat.purchases.utils.Result;
import java.util.Date;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class IntermediateSignatureHelper {
    private final SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(SignatureVerifier signatureVerifier) {
        t.g(signatureVerifier, "rootSignatureVerifier");
        this.rootSignatureVerifier = signatureVerifier;
    }

    private final Date getIntermediateKeyExpirationDate(byte[] bArr) {
        b.a aVar = b.b;
        return new Date(b.q(d.s(IntExtensionsKt.fromLittleEndianBytes(s.a, bArr), e.h)));
    }

    public final Result createIntermediateKeyVerifierIfVerified(Signature signature) {
        t.g(signature, "signature");
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), p.y(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (!intermediateKeyExpirationDate.before(new Date())) {
            return new Result.Success(new DefaultSignatureVerifier(signature.getIntermediateKey()));
        }
        return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Intermediate key expired at " + intermediateKeyExpirationDate));
    }
}
