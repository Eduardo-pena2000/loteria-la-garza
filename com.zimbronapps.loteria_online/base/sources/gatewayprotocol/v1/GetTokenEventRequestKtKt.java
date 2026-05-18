package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class GetTokenEventRequestKtKt {
    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest -initializegetTokenEventRequest(l block) {
        t.g(block, "block");
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder newBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        t.f(newBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final GetTokenEventRequestOuterClass.GetTokenEventRequest copy(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest, l block) {
        t.g(getTokenEventRequest, "<this>");
        t.g(block, "block");
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = getTokenEventRequest.toBuilder();
        t.f(builder, "this.toBuilder()");
        GetTokenEventRequestKt.Dsl _create = companion._create((GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
