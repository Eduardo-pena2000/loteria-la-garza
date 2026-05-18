package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (TestDataOuterClass.TestData) build;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            t.f(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            t.f(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            t.f(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(String value) {
            t.g(value, "value");
            this._builder.setForceCampaignId(value);
        }

        public final void setForceCountry(String value) {
            t.g(value, "value");
            this._builder.setForceCountry(value);
        }

        public final void setForceCountrySubdivision(String value) {
            t.g(value, "value");
            this._builder.setForceCountrySubdivision(value);
        }

        public final void setForceExchangeTestMode(int i) {
            this._builder.setForceExchangeTestMode(i);
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }
    }

    private TestDataKt() {
    }
}
