package com.unity3d.services.core.lifecycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.E;
import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import com.unity3d.scar.adapter.common.l;
import com.unity3d.services.core.configuration.ConfigurationReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@TargetApi(14)
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LifecycleCache implements Application.ActivityLifecycleCallbacks, o {
    private boolean _newLifecycle;
    private LifecycleEvent _currentState = LifecycleEvent.RESUMED;
    private boolean _appActive = true;
    private boolean _lifecycleAppActive = true;
    private int _numStarted = 0;
    private final Set _appActiveListeners = new HashSet();
    private final Set _appStateListeners = new HashSet();

    public class 1 implements Runnable {
        public 1() {
        }

        public void run() {
            LifecycleCache.access$000(LifecycleCache.this);
        }
    }

    public static /* synthetic */ class 2 {
        static final /* synthetic */ int[] $SwitchMap$androidx$lifecycle$Lifecycle$Event;

        static {
            int[] iArr = new int[k.a.values().length];
            $SwitchMap$androidx$lifecycle$Lifecycle$Event = iArr;
            try {
                iArr[k.a.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$lifecycle$Lifecycle$Event[k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public LifecycleCache(ConfigurationReader configurationReader) {
        this._newLifecycle = false;
        this._newLifecycle = configurationReader.getCurrentConfiguration().getExperiments().isJetpackLifecycle();
        startProcessLifecycleObserving();
    }

    public static /* synthetic */ void access$000(LifecycleCache lifecycleCache) {
        lifecycleCache.registerLifecycleObserver();
    }

    private void registerLifecycleObserver() {
        E.l().getLifecycle().addObserver(this);
    }

    private void startProcessLifecycleObserving() {
        l.a(new 1());
    }

    public synchronized void addActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.add(iAppActiveListener);
    }

    public synchronized void addStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.add(iAppEventListener);
    }

    public LifecycleEvent getCurrentState() {
        return this._currentState;
    }

    public boolean isAppActive() {
        return this._newLifecycle ? this._lifecycleAppActive : this._appActive;
    }

    public synchronized void notifyActiveListeners() {
        Iterator it = this._appActiveListeners.iterator();
        while (it.hasNext()) {
            ((IAppActiveListener) it.next()).onAppStateChanged(this._appActive);
        }
    }

    public synchronized void notifyStateListeners(LifecycleEvent lifecycleEvent) {
        Iterator it = this._appStateListeners.iterator();
        while (it.hasNext()) {
            ((IAppEventListener) it.next()).onLifecycleEvent(lifecycleEvent);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.CREATED;
    }

    public void onActivityDestroyed(Activity activity) {
        this._currentState = LifecycleEvent.DESTROYED;
    }

    public void onActivityPaused(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.PAUSED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    public void onActivityResumed(Activity activity) {
        LifecycleEvent lifecycleEvent = LifecycleEvent.RESUMED;
        this._currentState = lifecycleEvent;
        notifyStateListeners(lifecycleEvent);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this._currentState = LifecycleEvent.SAVE_INSTANCE_STATE;
    }

    public void onActivityStarted(Activity activity) {
        this._currentState = LifecycleEvent.STARTED;
        if (this._numStarted == 0) {
            this._appActive = true;
            if (!this._newLifecycle) {
                notifyActiveListeners();
            }
        }
        this._numStarted++;
    }

    public void onActivityStopped(Activity activity) {
        this._currentState = LifecycleEvent.STOPPED;
        int i = this._numStarted - 1;
        this._numStarted = i;
        if (i <= 0) {
            this._numStarted = 0;
            this._appActive = false;
            if (this._newLifecycle) {
                return;
            }
            notifyActiveListeners();
        }
    }

    public void onStateChanged(r rVar, k.a aVar) {
        int i = 2.$SwitchMap$androidx$lifecycle$Lifecycle$Event[aVar.ordinal()];
        if (i == 1) {
            this._lifecycleAppActive = false;
            if (this._newLifecycle) {
                notifyActiveListeners();
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        this._lifecycleAppActive = true;
        if (this._newLifecycle) {
            notifyActiveListeners();
        }
    }

    public synchronized void removeActiveListener(IAppActiveListener iAppActiveListener) {
        this._appActiveListeners.remove(iAppActiveListener);
    }

    public synchronized void removeStateListener(IAppEventListener iAppEventListener) {
        this._appStateListeners.remove(iAppEventListener);
    }
}
