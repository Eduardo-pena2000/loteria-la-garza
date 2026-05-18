package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.ErrorKt;
import gatewayprotocol.v1.ErrorOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ErrorKtKt {
    public static final ErrorOuterClass.Error -initializeerror(l block) {
        t.g(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        ErrorOuterClass.Error.Builder newBuilder = ErrorOuterClass.Error.newBuilder();
        t.f(newBuilder, "newBuilder()");
        ErrorKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final ErrorOuterClass.Error copy(ErrorOuterClass.Error error, l block) {
        t.g(error, "<this>");
        t.g(block, "block");
        ErrorKt.Dsl.Companion companion = ErrorKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = error.toBuilder();
        t.f(builder, "this.toBuilder()");
        ErrorKt.Dsl _create = companion._create((ErrorOuterClass.Error.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
