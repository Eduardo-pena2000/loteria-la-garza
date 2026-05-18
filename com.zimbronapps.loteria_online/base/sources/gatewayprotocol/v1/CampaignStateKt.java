package gatewayprotocol.v1;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.v1.CampaignStateOuterClass;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CampaignStateKt {
    public static final CampaignStateKt INSTANCE = new CampaignStateKt();

    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final CampaignStateOuterClass.CampaignState.Builder _builder;

        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(CampaignStateOuterClass.CampaignState.Builder builder) {
                t.g(builder, "builder");
                return new Dsl(builder, null);
            }

            private Companion() {
            }
        }

        public static final class LoadedCampaignsProxy extends DslProxy {
            private LoadedCampaignsProxy() {
            }
        }

        public static final class ShownCampaignsProxy extends DslProxy {
            private ShownCampaignsProxy() {
            }
        }

        public /* synthetic */ Dsl(CampaignStateOuterClass.CampaignState.Builder builder, k kVar) {
            this(builder);
        }

        public final /* synthetic */ CampaignStateOuterClass.CampaignState _build() {
            GeneratedMessageLite build = this._builder.build();
            t.f(build, "_builder.build()");
            return (CampaignStateOuterClass.CampaignState) build;
        }

        public final /* synthetic */ void addAllLoadedCampaigns(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllLoadedCampaigns(values);
        }

        public final /* synthetic */ void addAllShownCampaigns(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            this._builder.addAllShownCampaigns(values);
        }

        public final /* synthetic */ void addLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addLoadedCampaigns(value);
        }

        public final /* synthetic */ void addShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.addShownCampaigns(value);
        }

        public final /* synthetic */ void clearLoadedCampaigns(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearLoadedCampaigns();
        }

        public final /* synthetic */ void clearShownCampaigns(DslList dslList) {
            t.g(dslList, "<this>");
            this._builder.clearShownCampaigns();
        }

        public final /* synthetic */ DslList getLoadedCampaigns() {
            List loadedCampaignsList = this._builder.getLoadedCampaignsList();
            t.f(loadedCampaignsList, "_builder.getLoadedCampaignsList()");
            return new DslList(loadedCampaignsList);
        }

        public final /* synthetic */ DslList getShownCampaigns() {
            List shownCampaignsList = this._builder.getShownCampaignsList();
            t.f(shownCampaignsList, "_builder.getShownCampaignsList()");
            return new DslList(shownCampaignsList);
        }

        public final /* synthetic */ void plusAssignAllLoadedCampaigns(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllLoadedCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignAllShownCampaigns(DslList dslList, Iterable values) {
            t.g(dslList, "<this>");
            t.g(values, "values");
            addAllShownCampaigns(dslList, values);
        }

        public final /* synthetic */ void plusAssignLoadedCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addLoadedCampaigns(dslList, value);
        }

        public final /* synthetic */ void plusAssignShownCampaigns(DslList dslList, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            addShownCampaigns(dslList, value);
        }

        public final /* synthetic */ void setLoadedCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setLoadedCampaigns(i, value);
        }

        public final /* synthetic */ void setShownCampaigns(DslList dslList, int i, CampaignStateOuterClass.Campaign value) {
            t.g(dslList, "<this>");
            t.g(value, "value");
            this._builder.setShownCampaigns(i, value);
        }

        private Dsl(CampaignStateOuterClass.CampaignState.Builder builder) {
            this._builder = builder;
        }
    }

    private CampaignStateKt() {
    }
}
