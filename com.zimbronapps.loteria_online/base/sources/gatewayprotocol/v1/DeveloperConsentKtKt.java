package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.DeveloperConsentKt;
import gatewayprotocol.v1.DeveloperConsentOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class DeveloperConsentKtKt {
    public static final DeveloperConsentOuterClass.DeveloperConsent -initializedeveloperConsent(l block) {
        t.g(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        DeveloperConsentOuterClass.DeveloperConsent.Builder newBuilder = DeveloperConsentOuterClass.DeveloperConsent.newBuilder();
        t.f(newBuilder, "newBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final DeveloperConsentOuterClass.DeveloperConsent copy(DeveloperConsentOuterClass.DeveloperConsent developerConsent, l block) {
        t.g(developerConsent, "<this>");
        t.g(block, "block");
        DeveloperConsentKt.Dsl.Companion companion = DeveloperConsentKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = developerConsent.toBuilder();
        t.f(builder, "this.toBuilder()");
        DeveloperConsentKt.Dsl _create = companion._create((DeveloperConsentOuterClass.DeveloperConsent.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
