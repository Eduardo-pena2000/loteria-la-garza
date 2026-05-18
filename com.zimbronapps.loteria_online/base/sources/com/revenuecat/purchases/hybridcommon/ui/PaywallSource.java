package com.revenuecat.purchases.hybridcommon.ui;

import Da.D;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PresentedOfferingContext;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class PaywallSource {

    public static final class DefaultOffering extends PaywallSource {
        public static final DefaultOffering INSTANCE = new DefaultOffering();

        private DefaultOffering() {
            super(null);
        }
    }

    public static final class Offering extends PaywallSource {
        private final com.revenuecat.purchases.Offering value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Offering(com.revenuecat.purchases.Offering offering) {
            super(null);
            t.g(offering, "value");
            this.value = offering;
        }

        public final PresentedOfferingContext getPresentedOfferingContext$hybridcommon_ui_bc8Release() {
            Package r0 = (Package) D.h0(this.value.getAvailablePackages());
            if (r0 != null) {
                return r0.getPresentedOfferingContext();
            }
            return null;
        }

        public final com.revenuecat.purchases.Offering getValue() {
            return this.value;
        }
    }

    @Ca.e
    public static final class OfferingIdentifier extends PaywallSource {
        private final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingIdentifier(String str) {
            super(null);
            t.g(str, "value");
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public static final class OfferingIdentifierWithPresentedOfferingContext extends PaywallSource {
        private final String offeringIdentifier;
        private final PresentedOfferingContext presentedOfferingContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OfferingIdentifierWithPresentedOfferingContext(String str, PresentedOfferingContext presentedOfferingContext) {
            super(null);
            t.g(str, "offeringIdentifier");
            t.g(presentedOfferingContext, "presentedOfferingContext");
            this.offeringIdentifier = str;
            this.presentedOfferingContext = presentedOfferingContext;
        }

        public final String getOfferingIdentifier() {
            return this.offeringIdentifier;
        }

        public final PresentedOfferingContext getPresentedOfferingContext() {
            return this.presentedOfferingContext;
        }
    }

    public /* synthetic */ PaywallSource(k kVar) {
        this();
    }

    private PaywallSource() {
    }
}
