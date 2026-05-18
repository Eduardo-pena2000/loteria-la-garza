package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.AllowedPiiKt;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AllowedPiiKtKt {
    public static final AllowedPiiOuterClass.AllowedPii -initializeallowedPii(l block) {
        t.g(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        AllowedPiiOuterClass.AllowedPii.Builder newBuilder = AllowedPiiOuterClass.AllowedPii.newBuilder();
        t.f(newBuilder, "newBuilder()");
        AllowedPiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final AllowedPiiOuterClass.AllowedPii copy(AllowedPiiOuterClass.AllowedPii allowedPii, l block) {
        t.g(allowedPii, "<this>");
        t.g(block, "block");
        AllowedPiiKt.Dsl.Companion companion = AllowedPiiKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = allowedPii.toBuilder();
        t.f(builder, "this.toBuilder()");
        AllowedPiiKt.Dsl _create = companion._create((AllowedPiiOuterClass.AllowedPii.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
