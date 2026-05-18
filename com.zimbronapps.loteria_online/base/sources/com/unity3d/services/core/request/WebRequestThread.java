package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class WebRequestThread {
    private static int _corePoolSize = 1;
    private static long _keepAliveTime = 1000;
    private static int _maximumPoolSize = 1;
    private static CancelableThreadPoolExecutor _pool = null;
    private static LinkedBlockingQueue _queue = null;
    private static boolean _ready = false;
    private static final Object _readyLock = new Object();

    public class 1 implements Runnable {
        public void run() {
            WebRequestThread.access$002(true);
            synchronized (WebRequestThread.access$100()) {
                WebRequestThread.access$100().notifyAll();
            }
        }
    }

    public class 2 implements Runnable {
        final /* synthetic */ String val$host;
        final /* synthetic */ IResolveHostListener val$listener;

        public class 1 implements Runnable {
            final /* synthetic */ ConditionVariable val$cv;

            public 1(ConditionVariable conditionVariable) {
                this.val$cv = conditionVariable;
            }

            public void run() {
                try {
                    String hostAddress = InetAddress.getByName(2.this.val$host).getHostAddress();
                    2 r1 = 2.this;
                    r1.val$listener.onResolve(r1.val$host, hostAddress);
                } catch (UnknownHostException e) {
                    DeviceLog.exception("Unknown host", e);
                    2 r12 = 2.this;
                    r12.val$listener.onFailed(r12.val$host, ResolveHostError.UNKNOWN_HOST, e.getMessage());
                }
                this.val$cv.open();
            }
        }

        public 2(String str, IResolveHostListener iResolveHostListener) {
            this.val$host = str;
            this.val$listener = iResolveHostListener;
        }

        public void run() {
            Thread thread;
            Exception e;
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                thread = new Thread(new 1(conditionVariable));
            } catch (Exception e2) {
                thread = null;
                e = e2;
            }
            try {
                thread.start();
            } catch (Exception e3) {
                e = e3;
                DeviceLog.exception("Exception while resolving host", e);
                this.val$listener.onFailed(this.val$host, ResolveHostError.UNEXPECTED_EXCEPTION, e.getMessage());
                if (conditionVariable.block(20000L)) {
                    return;
                } else {
                    return;
                }
            }
            if (conditionVariable.block(20000L) || thread == null) {
                return;
            }
            thread.interrupt();
            this.val$listener.onFailed(this.val$host, ResolveHostError.TIMEOUT, "Timeout");
        }
    }

    public static /* synthetic */ boolean access$002(boolean z) {
        _ready = z;
        return z;
    }

    public static /* synthetic */ Object access$100() {
        return _readyLock;
    }

    public static synchronized void cancel() {
        synchronized (WebRequestThread.class) {
            try {
                CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
                if (cancelableThreadPoolExecutor != null) {
                    cancelableThreadPoolExecutor.cancel();
                    Iterator it = _queue.iterator();
                    while (it.hasNext()) {
                        Runnable runnable = (Runnable) it.next();
                        if (runnable instanceof WebRequestRunnable) {
                            ((WebRequestRunnable) runnable).setCancelStatus(true);
                        }
                    }
                    _queue.clear();
                    _pool.purge();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static synchronized void init() {
        synchronized (WebRequestThread.class) {
            _queue = new LinkedBlockingQueue();
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = new CancelableThreadPoolExecutor(_corePoolSize, _maximumPoolSize, _keepAliveTime, TimeUnit.MILLISECONDS, _queue);
            _pool = cancelableThreadPoolExecutor;
            cancelableThreadPoolExecutor.prestartAllCoreThreads();
            _queue.add(new 1());
            while (!_ready) {
                try {
                    Object obj = _readyLock;
                    synchronized (obj) {
                        obj.wait();
                    }
                } catch (InterruptedException unused) {
                    DeviceLog.debug("Couldn't synchronize thread");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map map, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            request(str, requestType, map, null, num, num2, iWebRequestListener);
        }
    }

    public static synchronized void reset() {
        synchronized (WebRequestThread.class) {
            cancel();
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
            if (cancelableThreadPoolExecutor != null) {
                cancelableThreadPoolExecutor.shutdown();
                try {
                    _pool.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                _queue.clear();
                _pool = null;
                _queue = null;
                _ready = false;
            }
        }
    }

    public static synchronized boolean resolve(String str, IResolveHostListener iResolveHostListener) {
        synchronized (WebRequestThread.class) {
            if (str != null) {
                if (str.length() >= 3) {
                    new Thread(new 2(str, iResolveHostListener)).start();
                    return true;
                }
            }
            iResolveHostListener.onFailed(str, ResolveHostError.INVALID_HOST, "Host is NULL");
            return false;
        }
    }

    public static synchronized void setConcurrentRequestCount(int i) {
        synchronized (WebRequestThread.class) {
            _corePoolSize = i;
            _maximumPoolSize = i;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
            if (cancelableThreadPoolExecutor != null) {
                cancelableThreadPoolExecutor.setCorePoolSize(i);
                _pool.setMaximumPoolSize(_maximumPoolSize);
            }
        }
    }

    public static synchronized void setKeepAliveTime(long j) {
        synchronized (WebRequestThread.class) {
            _keepAliveTime = j;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
            if (cancelableThreadPoolExecutor != null) {
                cancelableThreadPoolExecutor.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
            }
        }
    }

    public static synchronized void setMaximumPoolSize(int i) {
        synchronized (WebRequestThread.class) {
            _maximumPoolSize = i;
            CancelableThreadPoolExecutor cancelableThreadPoolExecutor = _pool;
            if (cancelableThreadPoolExecutor != null) {
                cancelableThreadPoolExecutor.setMaximumPoolSize(i);
            }
        }
    }

    public static synchronized void request(String str, WebRequest.RequestType requestType, Map map, String str2, Integer num, Integer num2, IWebRequestListener iWebRequestListener) {
        synchronized (WebRequestThread.class) {
            try {
                if (!_ready) {
                    init();
                }
                if (str != null && str.length() >= 3) {
                    _queue.add(new WebRequestRunnable(str, requestType.name(), str2, num.intValue(), num2.intValue(), map, iWebRequestListener));
                    return;
                }
                iWebRequestListener.onFailed(str, "Request is NULL or too short");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
