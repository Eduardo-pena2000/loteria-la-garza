package com.revenuecat.purchases.ui.revenuecatui.views;

import Ca.q;
import Ca.x;
import Da.S;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PaywallViewAttributesReader {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final boolean DEFAULT_CONDENSED = false;
    private static final Map styleablesByStyleSet;

    public static final class Companion {

        public enum Attributes {
            OfferingId,
            ShouldDisplayDismissButton,
            FontFamily
        }

        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.PaywallViewAttributes parseAttributes(android.content.Context r6, android.util.AttributeSet r7, int[] r8) {
            /*
                r5 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.t.g(r6, r0)
                java.lang.String r0 = "styleAttrs"
                kotlin.jvm.internal.t.g(r8, r0)
                r0 = 0
                if (r7 != 0) goto Le
                return r0
            Le:
                kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                r1.<init>()
                kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
                r2.<init>()
                r3 = 0
                android.content.res.TypedArray r7 = r6.obtainStyledAttributes(r7, r8, r3, r3)
                java.util.Map r4 = com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.access$getStyleablesByStyleSet$cp()     // Catch: java.lang.Throwable -> L34
                java.lang.Object r8 = r4.get(r8)     // Catch: java.lang.Throwable -> L34
                java.util.Map r8 = (java.util.Map) r8     // Catch: java.lang.Throwable -> L34
                if (r8 != 0) goto L37
                com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE     // Catch: java.lang.Throwable -> L34
                java.lang.String r8 = "Styleable not found for PaywallView"
                r6.e(r8)     // Catch: java.lang.Throwable -> L34
                r7.recycle()
                return r0
            L34:
                r6 = move-exception
                goto Ld1
            L37:
                com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$Companion$Attributes r4 = com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.Companion.Attributes.FontFamily     // Catch: java.lang.Throwable -> L34
                java.lang.Object r4 = r8.get(r4)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L34
                if (r4 == 0) goto L4e
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L34
                int r4 = r7.getResourceId(r4, r3)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L34
                goto L4f
            L4e:
                r4 = r0
            L4f:
                r1.a = r4     // Catch: java.lang.Throwable -> L34
                com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$Companion$Attributes r4 = com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.Companion.Attributes.OfferingId     // Catch: java.lang.Throwable -> L34
                java.lang.Object r4 = r8.get(r4)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L34
                if (r4 == 0) goto L64
                int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L34
                java.lang.String r4 = r7.getString(r4)     // Catch: java.lang.Throwable -> L34
                goto L65
            L64:
                r4 = r0
            L65:
                r2.a = r4     // Catch: java.lang.Throwable -> L34
                com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$Companion$Attributes r4 = com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.Companion.Attributes.ShouldDisplayDismissButton     // Catch: java.lang.Throwable -> L34
                java.lang.Object r8 = r8.get(r4)     // Catch: java.lang.Throwable -> L34
                java.lang.Integer r8 = (java.lang.Integer) r8     // Catch: java.lang.Throwable -> L34
                if (r8 == 0) goto L84
                int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L34
                boolean r4 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L34
                if (r4 == 0) goto L84
                boolean r8 = r7.getBoolean(r8, r3)     // Catch: java.lang.Throwable -> L34
                java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L34
                goto L85
            L84:
                r8 = r0
            L85:
                int r4 = com.revenuecat.purchases.ui.revenuecatui.R.styleable.PaywallFooterView_condensed     // Catch: java.lang.Throwable -> L34
                boolean r4 = r7.hasValue(r4)     // Catch: java.lang.Throwable -> L34
                if (r4 == 0) goto L98
                int r4 = com.revenuecat.purchases.ui.revenuecatui.R.styleable.PaywallFooterView_condensed     // Catch: java.lang.Throwable -> L34
                boolean r3 = r7.getBoolean(r4, r3)     // Catch: java.lang.Throwable -> L34
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L34
                goto L99
            L98:
                r3 = r0
            L99:
                r7.recycle()
                java.lang.Object r7 = r1.a
                java.lang.Integer r7 = (java.lang.Integer) r7
                if (r7 == 0) goto Lc7
                int r1 = r7.intValue()
                if (r1 <= 0) goto La9
                goto Laa
            La9:
                r7 = r0
            Laa:
                if (r7 == 0) goto Lc7
                int r7 = r7.intValue()
                android.graphics.Typeface r6 = J1.h.f(r6, r7)
                if (r6 != 0) goto Lbe
                com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
                java.lang.String r7 = "Font given for PaywallView not found"
                r6.e(r7)
                goto Lc7
            Lbe:
                com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider r0 = new com.revenuecat.purchases.ui.revenuecatui.fonts.CustomFontProvider
                d1.u r6 = d1.l.a(r6)
                r0.<init>(r6)
            Lc7:
                com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$PaywallViewAttributes r6 = new com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$PaywallViewAttributes
                java.lang.Object r7 = r2.a
                java.lang.String r7 = (java.lang.String) r7
                r6.<init>(r7, r0, r8, r3)
                return r6
            Ld1:
                r7.recycle()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.Companion.parseAttributes(android.content.Context, android.util.AttributeSet, int[]):com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$PaywallViewAttributes");
        }

        private Companion() {
        }
    }

    public static final class PaywallViewAttributes {
        public static final int $stable = 8;
        private final Boolean condensed;
        private final FontProvider fontProvider;
        private final String offeringId;
        private final Boolean shouldDisplayDismissButton;

        public PaywallViewAttributes(String str, FontProvider fontProvider, Boolean bool, Boolean bool2) {
            this.offeringId = str;
            this.fontProvider = fontProvider;
            this.shouldDisplayDismissButton = bool;
            this.condensed = bool2;
        }

        public static /* synthetic */ PaywallViewAttributes copy$default(PaywallViewAttributes paywallViewAttributes, String str, FontProvider fontProvider, Boolean bool, Boolean bool2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paywallViewAttributes.offeringId;
            }
            if ((i & 2) != 0) {
                fontProvider = paywallViewAttributes.fontProvider;
            }
            if ((i & 4) != 0) {
                bool = paywallViewAttributes.shouldDisplayDismissButton;
            }
            if ((i & 8) != 0) {
                bool2 = paywallViewAttributes.condensed;
            }
            return paywallViewAttributes.copy(str, fontProvider, bool, bool2);
        }

        public final String component1() {
            return this.offeringId;
        }

        public final FontProvider component2() {
            return this.fontProvider;
        }

        public final Boolean component3() {
            return this.shouldDisplayDismissButton;
        }

        public final Boolean component4() {
            return this.condensed;
        }

        public final PaywallViewAttributes copy(String str, FontProvider fontProvider, Boolean bool, Boolean bool2) {
            return new PaywallViewAttributes(str, fontProvider, bool, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallViewAttributes)) {
                return false;
            }
            PaywallViewAttributes paywallViewAttributes = (PaywallViewAttributes) obj;
            return t.c(this.offeringId, paywallViewAttributes.offeringId) && t.c(this.fontProvider, paywallViewAttributes.fontProvider) && t.c(this.shouldDisplayDismissButton, paywallViewAttributes.shouldDisplayDismissButton) && t.c(this.condensed, paywallViewAttributes.condensed);
        }

        public final Boolean getCondensed() {
            return this.condensed;
        }

        public final FontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final Boolean getShouldDisplayDismissButton() {
            return this.shouldDisplayDismissButton;
        }

        public int hashCode() {
            String str = this.offeringId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            FontProvider fontProvider = this.fontProvider;
            int hashCode2 = (hashCode + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
            Boolean bool = this.shouldDisplayDismissButton;
            int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.condensed;
            return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "PaywallViewAttributes(offeringId=" + this.offeringId + ", fontProvider=" + this.fontProvider + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", condensed=" + this.condensed + ')';
        }
    }

    static {
        int[] iArr = R.styleable.PaywallView;
        Companion.Attributes attributes = Companion.Attributes.OfferingId;
        q a = x.a(attributes, Integer.valueOf(R.styleable.PaywallView_offeringIdentifier));
        q a2 = x.a(Companion.Attributes.ShouldDisplayDismissButton, Integer.valueOf(R.styleable.PaywallView_shouldDisplayDismissButton));
        Companion.Attributes attributes2 = Companion.Attributes.FontFamily;
        styleablesByStyleSet = S.l(x.a(iArr, S.l(a, a2, x.a(attributes2, Integer.valueOf(R.styleable.PaywallView_android_fontFamily)))), x.a(R.styleable.PaywallFooterView, S.l(x.a(attributes, Integer.valueOf(R.styleable.PaywallFooterView_offeringIdentifier)), x.a(attributes2, Integer.valueOf(R.styleable.PaywallFooterView_android_fontFamily)))));
    }

    public static final /* synthetic */ Map access$getStyleablesByStyleSet$cp() {
        return styleablesByStyleSet;
    }
}
