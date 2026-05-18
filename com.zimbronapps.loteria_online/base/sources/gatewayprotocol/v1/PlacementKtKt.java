package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.PlacementKt;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class PlacementKtKt {
    public static final InitializationResponseOuterClass.Placement -initializeplacement(l block) {
        t.g(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        InitializationResponseOuterClass.Placement.Builder newBuilder = InitializationResponseOuterClass.Placement.newBuilder();
        t.f(newBuilder, "newBuilder()");
        PlacementKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final InitializationResponseOuterClass.Placement copy(InitializationResponseOuterClass.Placement placement, l block) {
        t.g(placement, "<this>");
        t.g(block, "block");
        PlacementKt.Dsl.Companion companion = PlacementKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = placement.toBuilder();
        t.f(builder, "this.toBuilder()");
        PlacementKt.Dsl _create = companion._create((InitializationResponseOuterClass.Placement.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
