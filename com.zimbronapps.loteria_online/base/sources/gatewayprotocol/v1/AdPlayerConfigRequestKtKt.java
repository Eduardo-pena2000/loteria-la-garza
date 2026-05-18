package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AdPlayerConfigRequestKt;
import gatewayprotocol.v1.AdPlayerConfigRequestOuterClass;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AdPlayerConfigRequestKtKt {
    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest -initializeadPlayerConfigRequest(l block) {
        t.g(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder newBuilder = AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AdPlayerConfigRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest copy(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest, l block) {
        t.g(adPlayerConfigRequest, "<this>");
        t.g(block, "block");
        AdPlayerConfigRequestKt.Dsl.Companion companion = AdPlayerConfigRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = adPlayerConfigRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        AdPlayerConfigRequestKt.Dsl _create = companion._create((AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo getMediationInfoOrNull(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequestOrBuilder adPlayerConfigRequestOrBuilder) {
        t.g(adPlayerConfigRequestOrBuilder, "<this>");
        if (adPlayerConfigRequestOrBuilder.hasMediationInfo()) {
            return adPlayerConfigRequestOrBuilder.getMediationInfo();
        }
        return null;
    }
}
