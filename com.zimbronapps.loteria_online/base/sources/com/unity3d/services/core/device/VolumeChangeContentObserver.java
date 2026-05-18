package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class VolumeChangeContentObserver implements VolumeChange {
    private ContentObserver contentObserver;
    private List listeners = new ArrayList();

    public static final class 1 extends ContentObserver {
        public 1(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean z, Uri uri) {
            VolumeChangeContentObserver.access$triggerListeners(VolumeChangeContentObserver.this);
        }
    }

    public static final /* synthetic */ void access$triggerListeners(VolumeChangeContentObserver volumeChangeContentObserver) {
        volumeChangeContentObserver.triggerListeners();
    }

    private final synchronized void triggerListeners() {
        for (VolumeChangeListener volumeChangeListener : this.listeners) {
            volumeChangeListener.onVolumeChanged(Device.getStreamVolume(volumeChangeListener.getStreamType()));
        }
    }

    public synchronized void clearAllListeners() {
        this.listeners.clear();
        stopObserving();
    }

    public synchronized void registerListener(VolumeChangeListener volumeChangeListener) {
        t.g(volumeChangeListener, "volumeChangeListener");
        if (!this.listeners.contains(volumeChangeListener)) {
            startObserving();
            this.listeners.add(volumeChangeListener);
        }
    }

    public synchronized void startObserving() {
        ContentResolver contentResolver;
        if (this.contentObserver != null) {
            return;
        }
        this.contentObserver = new 1(new Handler(Looper.getMainLooper()));
        Context applicationContext = ClientProperties.getApplicationContext();
        if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
            Uri uri = Settings.System.CONTENT_URI;
            ContentObserver contentObserver = this.contentObserver;
            t.e(contentObserver, "null cannot be cast to non-null type android.database.ContentObserver");
            contentResolver.registerContentObserver(uri, true, contentObserver);
        }
    }

    public synchronized void stopObserving() {
        ContentResolver contentResolver;
        try {
            if (this.contentObserver == null) {
                return;
            }
            Context applicationContext = ClientProperties.getApplicationContext();
            if (applicationContext != null && (contentResolver = applicationContext.getContentResolver()) != null) {
                ContentObserver contentObserver = this.contentObserver;
                t.d(contentObserver);
                contentResolver.unregisterContentObserver(contentObserver);
            }
            this.contentObserver = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void unregisterListener(VolumeChangeListener volumeChangeListener) {
        t.g(volumeChangeListener, "volumeChangeListener");
        this.listeners.remove(volumeChangeListener);
        if (this.listeners.isEmpty()) {
            stopObserving();
        }
    }
}
