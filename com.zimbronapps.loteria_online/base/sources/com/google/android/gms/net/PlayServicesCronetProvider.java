package com.google.android.gms.net;

import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import l7.a;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import v6.i;
import v6.j;

@Keep
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            a.e(((CronetProvider) this).mContext);
        } catch (j unused) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        } catch (i unused2) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }

    @Keep
    public CronetEngine.Builder createBuilder() {
        ExperimentalCronetEngine.Builder builder;
        try {
            a.e(((CronetProvider) this).mContext);
            Throwable th = null;
            try {
                builder = new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) ((ClassLoader) t.l(((DynamiteModule) t.l(a.c())).b().getClassLoader())).loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{((CronetProvider) this).mContext}));
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                builder = null;
                th = e;
            }
            if (th != null) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
            }
            t.m(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (i e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (j e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof PlayServicesCronetProvider) && ((CronetProvider) this).mContext.equals(((CronetProvider) ((PlayServicesCronetProvider) obj)).mContext);
        }
        return true;
    }

    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Keep
    public String getVersion() {
        tryToInstallCronetProvider();
        return a.d();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, ((CronetProvider) this).mContext});
    }

    @Keep
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return a.b();
    }
}
