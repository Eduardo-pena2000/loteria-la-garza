package com.revenuecat.purchases.common.verification;

import Ca.o;
import com.revenuecat.purchases.EntitlementVerificationMode;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class SignatureVerificationMode {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EntitlementVerificationMode.values().length];
                try {
                    iArr[EntitlementVerificationMode.DISABLED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EntitlementVerificationMode.INFORMATIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static final /* synthetic */ IntermediateSignatureHelper access$createIntermediateSignatureHelper(Companion companion) {
            return companion.createIntermediateSignatureHelper();
        }

        private final IntermediateSignatureHelper createIntermediateSignatureHelper() {
            return new IntermediateSignatureHelper(new DefaultSignatureVerifier(null, 1, null));
        }

        public static /* synthetic */ SignatureVerificationMode fromEntitlementVerificationMode$default(Companion companion, EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier, int i, Object obj) {
            if ((i & 2) != 0) {
                signatureVerifier = null;
            }
            return companion.fromEntitlementVerificationMode(entitlementVerificationMode, signatureVerifier);
        }

        public final SignatureVerificationMode fromEntitlementVerificationMode(EntitlementVerificationMode entitlementVerificationMode, SignatureVerifier signatureVerifier) {
            t.g(entitlementVerificationMode, "verificationMode");
            int i = WhenMappings.$EnumSwitchMapping$0[entitlementVerificationMode.ordinal()];
            if (i == 1) {
                return Disabled.INSTANCE;
            }
            if (i != 2) {
                throw new o();
            }
            if (signatureVerifier == null) {
                signatureVerifier = new DefaultSignatureVerifier(null, 1, null);
            }
            return new Informational(new IntermediateSignatureHelper(signatureVerifier));
        }

        private Companion() {
        }
    }

    public static final class Disabled extends SignatureVerificationMode {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    public static final class Enforced extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Enforced() {
            this(null, 1, null);
        }

        public static /* synthetic */ Enforced copy$default(Enforced enforced, IntermediateSignatureHelper intermediateSignatureHelper, int i, Object obj) {
            if ((i & 1) != 0) {
                intermediateSignatureHelper = enforced.intermediateSignatureHelper;
            }
            return enforced.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return this.intermediateSignatureHelper;
        }

        public final Enforced copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            t.g(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Enforced(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Enforced) && t.c(this.intermediateSignatureHelper, ((Enforced) obj).intermediateSignatureHelper);
        }

        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Enforced(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public /* synthetic */ Enforced(IntermediateSignatureHelper intermediateSignatureHelper, int i, k kVar) {
            this((i & 1) != 0 ? Companion.access$createIntermediateSignatureHelper(SignatureVerificationMode.Companion) : intermediateSignatureHelper);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Enforced(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            t.g(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    public static final class Informational extends SignatureVerificationMode {
        private final IntermediateSignatureHelper intermediateSignatureHelper;

        public Informational() {
            this(null, 1, null);
        }

        public static /* synthetic */ Informational copy$default(Informational informational, IntermediateSignatureHelper intermediateSignatureHelper, int i, Object obj) {
            if ((i & 1) != 0) {
                intermediateSignatureHelper = informational.intermediateSignatureHelper;
            }
            return informational.copy(intermediateSignatureHelper);
        }

        public final IntermediateSignatureHelper component1() {
            return this.intermediateSignatureHelper;
        }

        public final Informational copy(IntermediateSignatureHelper intermediateSignatureHelper) {
            t.g(intermediateSignatureHelper, "intermediateSignatureHelper");
            return new Informational(intermediateSignatureHelper);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Informational) && t.c(this.intermediateSignatureHelper, ((Informational) obj).intermediateSignatureHelper);
        }

        public IntermediateSignatureHelper getIntermediateSignatureHelper() {
            return this.intermediateSignatureHelper;
        }

        public int hashCode() {
            return this.intermediateSignatureHelper.hashCode();
        }

        public String toString() {
            return "Informational(intermediateSignatureHelper=" + this.intermediateSignatureHelper + ')';
        }

        public /* synthetic */ Informational(IntermediateSignatureHelper intermediateSignatureHelper, int i, k kVar) {
            this((i & 1) != 0 ? Companion.access$createIntermediateSignatureHelper(SignatureVerificationMode.Companion) : intermediateSignatureHelper);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Informational(IntermediateSignatureHelper intermediateSignatureHelper) {
            super(null);
            t.g(intermediateSignatureHelper, "intermediateSignatureHelper");
            this.intermediateSignatureHelper = intermediateSignatureHelper;
        }
    }

    public /* synthetic */ SignatureVerificationMode(k kVar) {
        this();
    }

    public IntermediateSignatureHelper getIntermediateSignatureHelper() {
        if (this instanceof Disabled) {
            return null;
        }
        if (this instanceof Informational) {
            return ((Informational) this).getIntermediateSignatureHelper();
        }
        if (this instanceof Enforced) {
            return ((Enforced) this).getIntermediateSignatureHelper();
        }
        throw new o();
    }

    public final boolean getShouldVerify() {
        if (t.c(this, Disabled.INSTANCE)) {
            return false;
        }
        if (this instanceof Informational ? true : this instanceof Enforced) {
            return true;
        }
        throw new o();
    }

    private SignatureVerificationMode() {
    }
}
