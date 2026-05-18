package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class TestDataKtKt {
    public static final TestDataOuterClass.TestData -initializetestData(l block) {
        t.g(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder newBuilder = TestDataOuterClass.TestData.newBuilder();
        t.f(newBuilder, "newBuilder()");
        TestDataKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final TestDataOuterClass.TestData copy(TestDataOuterClass.TestData testData, l block) {
        t.g(testData, "<this>");
        t.g(block, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = testData.toBuilder();
        t.f(builder, "this.toBuilder()");
        TestDataKt.Dsl _create = companion._create((TestDataOuterClass.TestData.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
