package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.PrivacyUpdateRequestKt;
import gatewayprotocol.v1.PrivacyUpdateRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PrivacyUpdateRequestKtKt {
    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest -initializeprivacyUpdateRequest(l block) {
        t.g(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder newBuilder = PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        PrivacyUpdateRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest copy(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest, l block) {
        t.g(privacyUpdateRequest, "<this>");
        t.g(block, "block");
        PrivacyUpdateRequestKt.Dsl.Companion companion = PrivacyUpdateRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = privacyUpdateRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        PrivacyUpdateRequestKt.Dsl _create = companion._create((PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
