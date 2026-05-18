package com.revenuecat.purchases;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public enum EntitlementVerificationMode {
    DISABLED,
    INFORMATIONAL;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final EntitlementVerificationMode getDefault() {
            return EntitlementVerificationMode.INFORMATIONAL;
        }

        private Companion() {
        }
    }

    public final boolean isEnabled() {
        return this != DISABLED;
    }
}
