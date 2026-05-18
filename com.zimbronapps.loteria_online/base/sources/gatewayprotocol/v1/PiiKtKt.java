package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PiiKtKt {
    public static final PiiOuterClass.Pii -initializepii(l block) {
        t.g(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder newBuilder = PiiOuterClass.Pii.newBuilder();
        t.f(newBuilder, "newBuilder()");
        PiiKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final PiiOuterClass.Pii copy(PiiOuterClass.Pii pii, l block) {
        t.g(pii, "<this>");
        t.g(block, "block");
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = pii.toBuilder();
        t.f(builder, "this.toBuilder()");
        PiiKt.Dsl _create = companion._create((PiiOuterClass.Pii.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
