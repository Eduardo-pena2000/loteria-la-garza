package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.PrivacyUpdateResponseKt;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PrivacyUpdateResponseKtKt {
    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse -initializeprivacyUpdateResponse(l block) {
        t.g(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder newBuilder = PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.newBuilder();
        t.f(newBuilder, "newBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse copy(PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse, l block) {
        t.g(privacyUpdateResponse, "<this>");
        t.g(block, "block");
        PrivacyUpdateResponseKt.Dsl.Companion companion = PrivacyUpdateResponseKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = privacyUpdateResponse.toBuilder();
        t.f(builder, "this.toBuilder()");
        PrivacyUpdateResponseKt.Dsl _create = companion._create((PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
