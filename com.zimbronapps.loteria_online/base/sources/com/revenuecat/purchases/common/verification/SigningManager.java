package com.revenuecat.purchases.common.verification;

import Ca.I;
import Ca.o;
import Ca.q;
import Da.D;
import Da.v;
import Da.w;
import Qa.l;
import Za.E;
import Za.c;
import android.util.Base64;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.Endpoint;
import com.revenuecat.purchases.utils.Result;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class SigningManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int NONCE_BYTES_SIZE = 12;

    @Deprecated
    public static final String POST_PARAMS_ALGORITHM = "sha256";

    @Deprecated
    public static final byte POST_PARAMS_SEPARATOR = 0;
    private final String apiKey;
    private final AppConfig appConfig;
    private final SignatureVerificationMode signatureVerificationMode;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public static final class Parameters {
        private final String apiKey;
        private final String body;
        private final String eTag;
        private final String nonce;
        private final String postParamsHashHeader;
        private final String requestTime;
        private final byte[] salt;
        private final String urlPath;

        public Parameters(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            t.g(bArr, "salt");
            t.g(str, "apiKey");
            t.g(str3, "urlPath");
            t.g(str5, "requestTime");
            this.salt = bArr;
            this.apiKey = str;
            this.nonce = str2;
            this.urlPath = str3;
            this.postParamsHashHeader = str4;
            this.requestTime = str5;
            this.eTag = str6;
            this.body = str7;
        }

        public static /* synthetic */ Parameters copy$default(Parameters parameters, byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            return parameters.copy((i & 1) != 0 ? parameters.salt : bArr, (i & 2) != 0 ? parameters.apiKey : str, (i & 4) != 0 ? parameters.nonce : str2, (i & 8) != 0 ? parameters.urlPath : str3, (i & 16) != 0 ? parameters.postParamsHashHeader : str4, (i & 32) != 0 ? parameters.requestTime : str5, (i & 64) != 0 ? parameters.eTag : str6, (i & 128) != 0 ? parameters.body : str7);
        }

        public final byte[] component1() {
            return this.salt;
        }

        public final String component2() {
            return this.apiKey;
        }

        public final String component3() {
            return this.nonce;
        }

        public final String component4() {
            return this.urlPath;
        }

        public final String component5() {
            return this.postParamsHashHeader;
        }

        public final String component6() {
            return this.requestTime;
        }

        public final String component7() {
            return this.eTag;
        }

        public final String component8() {
            return this.body;
        }

        public final Parameters copy(byte[] bArr, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            t.g(bArr, "salt");
            t.g(str, "apiKey");
            t.g(str3, "urlPath");
            t.g(str5, "requestTime");
            return new Parameters(bArr, str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!t.c(Parameters.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            t.e(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.verification.SigningManager.Parameters");
            Parameters parameters = (Parameters) obj;
            return Arrays.equals(this.salt, parameters.salt) && t.c(this.apiKey, parameters.apiKey) && t.c(this.nonce, parameters.nonce) && t.c(this.urlPath, parameters.urlPath) && t.c(this.postParamsHashHeader, parameters.postParamsHashHeader) && t.c(this.requestTime, parameters.requestTime) && t.c(this.eTag, parameters.eTag) && t.c(this.body, parameters.body);
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final String getBody() {
            return this.body;
        }

        public final String getETag() {
            return this.eTag;
        }

        public final String getNonce() {
            return this.nonce;
        }

        public final String getPostParamsHashHeader() {
            return this.postParamsHashHeader;
        }

        public final String getRequestTime() {
            return this.requestTime;
        }

        public final byte[] getSalt() {
            return this.salt;
        }

        public final String getUrlPath() {
            return this.urlPath;
        }

        public int hashCode() {
            int hashCode = ((Arrays.hashCode(this.salt) * 31) + this.apiKey.hashCode()) * 31;
            String str = this.nonce;
            int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.urlPath.hashCode()) * 31;
            String str2 = this.postParamsHashHeader;
            int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.requestTime.hashCode()) * 31;
            String str3 = this.eTag;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.body;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final byte[] toSignatureToVerify() {
            /*
                r5 = this;
                byte[] r0 = r5.salt
                java.lang.String r1 = r5.apiKey
                java.nio.charset.Charset r2 = Za.c.b
                byte[] r1 = r1.getBytes(r2)
                java.lang.String r3 = "getBytes(...)"
                kotlin.jvm.internal.t.f(r1, r3)
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.nonce
                r4 = 0
                if (r1 == 0) goto L1d
                byte[] r1 = android.util.Base64.decode(r1, r4)
                goto L1e
            L1d:
                r1 = 0
            L1e:
                if (r1 != 0) goto L22
                byte[] r1 = new byte[r4]
            L22:
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.urlPath
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.t.f(r1, r3)
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.postParamsHashHeader
                if (r1 == 0) goto L40
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.t.f(r1, r3)
                if (r1 != 0) goto L42
            L40:
                byte[] r1 = new byte[r4]
            L42:
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.requestTime
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.t.f(r1, r3)
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.eTag
                if (r1 == 0) goto L60
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.t.f(r1, r3)
                if (r1 != 0) goto L62
            L60:
                byte[] r1 = new byte[r4]
            L62:
                byte[] r0 = Da.p.y(r0, r1)
                java.lang.String r1 = r5.body
                if (r1 == 0) goto L73
                byte[] r1 = r1.getBytes(r2)
                kotlin.jvm.internal.t.f(r1, r3)
                if (r1 != 0) goto L75
            L73:
                byte[] r1 = new byte[r4]
            L75:
                byte[] r0 = Da.p.y(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.verification.SigningManager.Parameters.toSignatureToVerify():byte[]");
        }

        public String toString() {
            return "Parameters(salt=" + Arrays.toString(this.salt) + ", apiKey=" + this.apiKey + ", nonce=" + this.nonce + ", urlPath=" + this.urlPath + ", postParamsHashHeader=" + this.postParamsHashHeader + ", requestTime=" + this.requestTime + ", eTag=" + this.eTag + ", body=" + this.body + ')';
        }
    }

    public SigningManager(SignatureVerificationMode signatureVerificationMode, AppConfig appConfig, String str) {
        t.g(signatureVerificationMode, "signatureVerificationMode");
        t.g(appConfig, "appConfig");
        t.g(str, "apiKey");
        this.signatureVerificationMode = signatureVerificationMode;
        this.appConfig = appConfig;
        this.apiKey = str;
    }

    public final String createRandomNonce() {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        byte[] encode = Base64.encode(bArr, 0);
        t.f(encode, "encode(bytes, Base64.DEFAULT)");
        return E.j1(new String(encode, c.b)).toString();
    }

    public final String getPostParamsForSigningHeaderIfNeeded(Endpoint endpoint, List list) {
        t.g(endpoint, "endpoint");
        if (list == null || list.isEmpty() || !shouldVerifyEndpoint(endpoint)) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        ArrayList arrayList = new ArrayList(w.y(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                v.x();
            }
            q qVar = (q) obj;
            if (i > 0) {
                messageDigest.update((byte) 0);
            }
            byte[] bytes = ((String) qVar.d()).getBytes(c.b);
            t.f(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            arrayList.add(I.a);
            i = i2;
        }
        byte[] digest = messageDigest.digest();
        t.f(digest, "sha256Digest.digest()");
        String str = "";
        for (byte b : digest) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            t.f(format, "format(...)");
            sb.append(format);
            str = sb.toString();
        }
        return D.n0(v.q(new String[]{D.n0(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, SigningManager$getPostParamsForSigningHeaderIfNeeded$header$1.INSTANCE, 30, (Object) null), "sha256", str}), ":", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null);
    }

    public final SignatureVerificationMode getSignatureVerificationMode() {
        return this.signatureVerificationMode;
    }

    public final boolean shouldVerifyEndpoint(Endpoint endpoint) {
        t.g(endpoint, "endpoint");
        return endpoint.getSupportsSignatureVerification() && this.signatureVerificationMode.getShouldVerify();
    }

    public final VerificationResult verifyResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        t.g(str, "urlPath");
        if (this.appConfig.getForceSigningErrors()) {
            LogLevel logLevel = LogLevel.WARN;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.w("[Purchases] - " + logLevel.name(), "Forcing signing error for request with path: " + str);
            }
            return VerificationResult.FAILED;
        }
        IntermediateSignatureHelper intermediateSignatureHelper = this.signatureVerificationMode.getIntermediateSignatureHelper();
        if (intermediateSignatureHelper == null) {
            return VerificationResult.NOT_REQUESTED;
        }
        if (str2 == null) {
            LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Verification: Request to '%s' requires a signature but none provided.", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format, "format(...)");
            currentLogHandler2.e("[Purchases] - ERROR", format, null);
            return VerificationResult.FAILED;
        }
        if (str5 == null) {
            LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
            String format2 = String.format("Verification: Request to '%s' requires a request time but none provided.", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format2, "format(...)");
            currentLogHandler3.e("[Purchases] - ERROR", format2, null);
            return VerificationResult.FAILED;
        }
        if (str4 == null && str6 == null) {
            LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
            String format3 = String.format("Verification: Request to '%s' requires a body or etag but none provided.", Arrays.copyOf(new Object[]{str}, 1));
            t.f(format3, "format(...)");
            currentLogHandler4.e("[Purchases] - ERROR", format3, null);
            return VerificationResult.FAILED;
        }
        try {
            Signature fromString$purchases_defaultsBc8Release = Signature.Companion.fromString$purchases_defaultsBc8Release(str2);
            Result.Error createIntermediateKeyVerifierIfVerified = intermediateSignatureHelper.createIntermediateKeyVerifierIfVerified(fromString$purchases_defaultsBc8Release);
            if (createIntermediateKeyVerifierIfVerified instanceof Result.Error) {
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                String format4 = String.format("Verification: Request to '%s' provided an intermediate key that did not verify correctly. Reason %s", Arrays.copyOf(new Object[]{str, ((PurchasesError) createIntermediateKeyVerifierIfVerified.getValue()).getUnderlyingErrorMessage()}, 2));
                t.f(format4, "format(...)");
                currentLogHandler5.e("[Purchases] - ERROR", format4, null);
                return VerificationResult.FAILED;
            }
            if (!(createIntermediateKeyVerifierIfVerified instanceof Result.Success)) {
                throw new o();
            }
            if (!((SignatureVerifier) ((Result.Success) createIntermediateKeyVerifierIfVerified).getValue()).verify(fromString$purchases_defaultsBc8Release.getPayload(), new Parameters(fromString$purchases_defaultsBc8Release.getSalt(), this.apiKey, str3, str, str7, str5, str6, str4).toSignatureToVerify())) {
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                String format5 = String.format("Verification: Request to '%s' failed verification.", Arrays.copyOf(new Object[]{str}, 1));
                t.f(format5, "format(...)");
                currentLogHandler6.e("[Purchases] - ERROR", format5, null);
                return VerificationResult.FAILED;
            }
            LogLevel logLevel2 = LogLevel.VERBOSE;
            LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                String str8 = "[Purchases] - " + logLevel2.name();
                String format6 = String.format("Verification: Request to '%s' verified successfully.", Arrays.copyOf(new Object[]{str}, 1));
                t.f(format6, "format(...)");
                currentLogHandler7.v(str8, format6);
            }
            return VerificationResult.VERIFIED;
        } catch (InvalidSignatureSizeException e) {
            LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
            String format7 = String.format("Verification: Request to '%s' has signature with wrong size. '%s'", Arrays.copyOf(new Object[]{str, e.getMessage()}, 2));
            t.f(format7, "format(...)");
            currentLogHandler8.e("[Purchases] - ERROR", format7, null);
            return VerificationResult.FAILED;
        }
    }
}
