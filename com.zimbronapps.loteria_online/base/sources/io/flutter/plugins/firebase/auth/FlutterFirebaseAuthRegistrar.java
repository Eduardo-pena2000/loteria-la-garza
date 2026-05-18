package io.flutter.plugins.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import v8.h;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterFirebaseAuthRegistrar implements ComponentRegistrar {
    public List getComponents() {
        return Collections.singletonList(h.b("flutter-fire-auth", "6.2.0"));
    }
}
