package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DeveloperConsentOptionKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeveloperConsentOptionKtKt {
    public static final DeveloperConsentOuterClass.DeveloperConsentOption -initializedeveloperConsentOption(l block) {
        t.g(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsentOption.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsentOption.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsentOption copy(DeveloperConsentOuterClass.DeveloperConsentOption developerConsentOption, l block) {
        t.g(developerConsentOption, "<this>");
        t.g(block, "block");
        DeveloperConsentOptionKt.Dsl.Companion companion = DeveloperConsentOptionKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = developerConsentOption.toBuilder();
        t.f(builder, "this.toBuilder()");
        DeveloperConsentOptionKt.Dsl _create = companion._create((DeveloperConsentOuterClass.DeveloperConsentOption.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
