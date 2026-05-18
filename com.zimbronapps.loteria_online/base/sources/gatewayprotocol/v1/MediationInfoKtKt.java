package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.MediationInfoKt;
import gatewayprotocol.v1.MediationInfoOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MediationInfoKtKt {
    public static final MediationInfoOuterClass.MediationInfo -initializemediationInfo(l block) {
        t.g(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        MediationInfoOuterClass.MediationInfo.Builder newBuilder = MediationInfoOuterClass.MediationInfo.newBuilder();
        t.f(newBuilder, "newBuilder()");
        MediationInfoKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final MediationInfoOuterClass.MediationInfo copy(MediationInfoOuterClass.MediationInfo mediationInfo, l block) {
        t.g(mediationInfo, "<this>");
        t.g(block, "block");
        MediationInfoKt.Dsl.Companion companion = MediationInfoKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = mediationInfo.toBuilder();
        t.f(builder, "this.toBuilder()");
        MediationInfoKt.Dsl _create = companion._create((MediationInfoOuterClass.MediationInfo.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
