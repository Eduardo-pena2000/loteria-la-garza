package org.apache.tika.pipes;

import Db.h;
import Wb.e;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.pipes.PipesResult;
import org.apache.tika.pipes.PipesServer;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.EmitKey;
import org.apache.tika.utils.ProcessUtils;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PipesClient implements Closeable {
    private static final int MAX_BYTES_BEFORE_READY = 20000;
    private static final long WAIT_ON_DESTROY_MS = 10000;
    private DataInputStream input;
    private DataOutputStream output;
    private final PipesConfigBase pipesConfig;
    private Process process;
    private static final Wb.c LOG = e.l(PipesClient.class);
    private static AtomicInteger CLIENT_COUNTER = new AtomicInteger(0);
    private final Object[] executorServiceLock = new Object[0];
    private volatile boolean closed = false;
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    private int filesProcessed = 0;
    private final int pipesClientId = CLIENT_COUNTER.getAndIncrement();

    public static /* synthetic */ class 1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS;

        static {
            int[] iArr = new int[PipesServer.STATUS.values().length];
            $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS = iArr;
            try {
                iArr[PipesServer.STATUS.OOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_EXCEPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMITTER_NOT_FOUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCHER_INITIALIZATION_EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FETCH_EXCEPTION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.INTERMEDIATE_RESULT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_SUCCESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PARSE_EXCEPTION_NO_EMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.EMPTY_OUTPUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.READY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.CALL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.PING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[PipesServer.STATUS.FAILED_TO_START.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public PipesClient(PipesConfigBase pipesConfigBase) {
        this.pipesConfig = pipesConfigBase;
    }

    public static /* synthetic */ Integer a(PipesClient pipesClient, Eb.e eVar) {
        return pipesClient.lambda$restart$1(eVar);
    }

    private PipesResult actuallyProcess(FetchEmitTuple fetchEmitTuple) throws InterruptedException {
        long currentTimeMillis = System.currentTimeMillis();
        PipesResult[] pipesResultArr = new PipesResult[1];
        FutureTask futureTask = new FutureTask(new b(this, fetchEmitTuple, currentTimeMillis, pipesResultArr));
        try {
            try {
                try {
                    if (!this.closed) {
                        this.executorService.execute(futureTask);
                        PipesResult pipesResult = (PipesResult) futureTask.get(this.pipesConfig.getTimeoutMillis(), TimeUnit.MILLISECONDS);
                        futureTask.cancel(true);
                        return pipesResult;
                    }
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                } catch (InterruptedException e) {
                    destroyForcibly();
                    throw e;
                }
            } catch (TimeoutException unused) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                destroyForcibly();
                LOG.e("pipesClientId={} client timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis2));
                PipesResult buildFatalResult = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                futureTask.cancel(true);
                return buildFatalResult;
            } catch (ExecutionException e2) {
                Wb.c cVar = LOG;
                cVar.error("pipesClientId=" + this.pipesClientId + ": execution exception", e2);
                long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                pauseThenDestroy();
                if (!a.a(this.process) && 17 == this.process.exitValue()) {
                    cVar.e("pipesClientId={} server timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3));
                    PipesResult buildFatalResult2 = buildFatalResult(PipesResult.TIMEOUT, pipesResultArr);
                    futureTask.cancel(true);
                    return buildFatalResult2;
                }
                org.apache.tika.parser.external.a.a(this.process, 500L, TimeUnit.MILLISECONDS);
                if (a.a(this.process)) {
                    cVar.e("pipesClientId={} crash: {} in {} ms with no exit code available", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3));
                } else {
                    cVar.e("pipesClientId={} crash: {} in {} ms with exit code {}", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis3), Integer.valueOf(this.process.exitValue()));
                }
                PipesResult buildFatalResult3 = buildFatalResult(PipesResult.UNSPECIFIED_CRASH, pipesResultArr);
                futureTask.cancel(true);
                return buildFatalResult3;
            }
        } catch (Throwable th) {
            futureTask.cancel(true);
            throw th;
        }
    }

    public static /* synthetic */ PipesResult b(PipesClient pipesClient, FetchEmitTuple fetchEmitTuple, long j, PipesResult[] pipesResultArr) {
        return pipesClient.lambda$actuallyProcess$0(fetchEmitTuple, j, pipesResultArr);
    }

    private PipesResult buildFatalResult(PipesResult pipesResult, PipesResult[] pipesResultArr) {
        if (pipesResultArr[0] == null) {
            return pipesResult;
        }
        Wb.c cVar = LOG;
        if (cVar.h()) {
            cVar.q("intermediate result: {}", pipesResultArr[0].getEmitData());
        }
        ((Metadata) pipesResultArr[0].getEmitData().getMetadataList().get(0)).set(TikaCoreProperties.PIPES_RESULT, pipesResult.getStatus().toString());
        return new PipesResult(pipesResult.getStatus(), pipesResultArr[0].getEmitData(), true);
    }

    private PipesResult deserializeEmitData() throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().q(bArr).p());
            try {
                EmitData emitData = (EmitData) objectInputStream.readObject();
                String containerStackTrace = emitData.getContainerStackTrace();
                if (StringUtils.isBlank(containerStackTrace)) {
                    PipesResult pipesResult = new PipesResult(emitData);
                    objectInputStream.close();
                    return pipesResult;
                }
                PipesResult pipesResult2 = new PipesResult(emitData, containerStackTrace);
                objectInputStream.close();
                return pipesResult2;
            } finally {
            }
        } catch (ClassNotFoundException e) {
            LOG.error("class not found exception deserializing data", e);
            throw new RuntimeException(e);
        }
    }

    private PipesResult deserializeIntermediateResult(EmitKey emitKey, ParseContext parseContext) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(h.a().q(bArr).p());
            try {
                PipesResult pipesResult = new PipesResult(PipesResult.STATUS.INTERMEDIATE_RESULT, new EmitData(emitKey, Collections.singletonList((Metadata) objectInputStream.readObject())), true);
                objectInputStream.close();
                return pipesResult;
            } finally {
            }
        } catch (ClassNotFoundException e) {
            LOG.error("class not found exception deserializing data", e);
            throw new RuntimeException(e);
        }
    }

    private void destroyForcibly() throws InterruptedException {
        org.apache.tika.fork.c.a(this.process);
        org.apache.tika.parser.external.a.a(this.process, 10000L, TimeUnit.MILLISECONDS);
        try {
            this.input.close();
        } catch (IOException unused) {
        }
        try {
            this.output.close();
        } catch (IOException unused2) {
        }
        if (a.a(this.process)) {
            LOG.u("Process still alive after {}ms", 10000L);
        }
    }

    private String[] getCommandline() {
        List<String> forkedJvmArgs = this.pipesConfig.getForkedJvmArgs();
        String str = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        String str2 = null;
        for (String str3 : forkedJvmArgs) {
            if (str3.startsWith("-Djava.awt.headless")) {
                z2 = true;
            }
            if (str3.equals("-cp") || str3.equals("--classpath")) {
                z = true;
            }
            if (str3.equals("-XX:+ExitOnOutOfMemoryError") || str3.equals("-XX:+CrashOnOutOfMemoryError")) {
                z3 = true;
            }
            if (str3.startsWith("-Dlog4j.configuration")) {
                z4 = true;
            }
            if (str3.startsWith("-Xloggc:")) {
                str2 = str3.replace("${pipesClientId}", "id-" + this.pipesClientId);
                str = str3;
            }
        }
        if (str != null && str2 != null) {
            forkedJvmArgs.remove(str);
            forkedJvmArgs.add(str2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ProcessUtils.escapeCommandLine(this.pipesConfig.getJavaPath()));
        if (!z) {
            arrayList.add("-cp");
            arrayList.add(System.getProperty("java.class.path"));
        }
        if (!z2) {
            arrayList.add("-Djava.awt.headless=true");
        }
        if (z3) {
            LOG.w("I notice that you have an exit/crash on OOM. If you run heavy external processes like tesseract, this setting may result in orphaned processes which could be disastrous for performance.");
        }
        if (!z4) {
            arrayList.add("-Dlog4j.configurationFile=classpath:pipes-fork-server-default-log4j2.xml");
        }
        arrayList.add("-DpipesClientId=" + this.pipesClientId);
        arrayList.addAll(forkedJvmArgs);
        arrayList.add("org.apache.tika.pipes.PipesServer");
        arrayList.add(ProcessUtils.escapeCommandLine(org.apache.tika.detect.b.a(org.apache.tika.detect.a.a(this.pipesConfig.getTikaConfig()))));
        arrayList.add(Long.toString(this.pipesConfig.getMaxForEmitBatchBytes()));
        arrayList.add(Long.toString(this.pipesConfig.getTimeoutMillis()));
        arrayList.add(Long.toString(this.pipesConfig.getShutdownClientAfterMillis()));
        LOG.b("pipesClientId={}: commandline: {}", Integer.valueOf(this.pipesClientId), arrayList);
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static String getMsg(String str, Eb.e eVar) {
        String f = eVar.f(StandardCharsets.UTF_8);
        if (StringUtils.isBlank(f)) {
            return str;
        }
        return str + "So far, I've read: >" + f + "<";
    }

    private /* synthetic */ PipesResult lambda$actuallyProcess$0(FetchEmitTuple fetchEmitTuple, long j, PipesResult[] pipesResultArr) throws Exception {
        Eb.e l = Eb.e.k().l();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(l);
        try {
            objectOutputStream.writeObject(fetchEmitTuple);
            objectOutputStream.close();
            byte[] b = l.b();
            this.output.write(PipesServer.STATUS.CALL.getByte());
            this.output.writeInt(b.length);
            this.output.write(b);
            this.output.flush();
            Wb.c cVar = LOG;
            if (cVar.h()) {
                cVar.d("pipesClientId={}: timer -- write tuple: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - j));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedException("thread interrupt");
            }
            PipesResult readResults = readResults(fetchEmitTuple, j);
            while (readResults.getStatus().equals(PipesResult.STATUS.INTERMEDIATE_RESULT)) {
                pipesResultArr[0] = readResults;
                readResults = readResults(fetchEmitTuple, j);
            }
            Wb.c cVar2 = LOG;
            if (cVar2.c()) {
                cVar2.t("finished reading result in {} ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            if (cVar2.h()) {
                cVar2.d("pipesClientId={}: timer -- read result: {} ms", Integer.valueOf(this.pipesClientId), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            return readResults.getStatus() == PipesResult.STATUS.OOM ? buildFatalResult(readResults, pipesResultArr) : readResults;
        } catch (Throwable th) {
            try {
                objectOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private /* synthetic */ Integer lambda$restart$1(Eb.e eVar) throws Exception {
        int read = this.input.read();
        int i = 1;
        while (i < 20000 && read != PipesServer.STATUS.READY.getByte()) {
            if (read == -1) {
                throw new RuntimeException(getMsg("pipesClientId=" + this.pipesClientId + ": Couldn't start server -- read EOF before 'ready' byte.\n process isAlive=" + a.a(this.process), eVar));
            }
            eVar.write(read);
            read = this.input.read();
            i++;
        }
        if (i < 20000) {
            if (eVar.m() > 0) {
                LOG.g("pipesClientId={}: From forked process before start byte: {}", Integer.valueOf(this.pipesClientId), eVar.f(StandardCharsets.UTF_8));
            }
            return 1;
        }
        throw new RuntimeException(getMsg("pipesClientId=" + this.pipesClientId + ": Couldn't start server: read too many bytes before 'ready' byte.\n Make absolutely certain that your logger is not writing to stdout.\n", eVar));
    }

    private void pauseThenDestroy() throws InterruptedException {
        try {
            org.apache.tika.parser.external.a.a(this.process, 200L, TimeUnit.MILLISECONDS);
        } finally {
            destroyForcibly();
        }
    }

    private boolean ping() {
        Process process = this.process;
        if (process != null && a.a(process)) {
            try {
                DataOutputStream dataOutputStream = this.output;
                PipesServer.STATUS status = PipesServer.STATUS.PING;
                dataOutputStream.write(status.getByte());
                this.output.flush();
                if (this.input.read() == status.getByte()) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private PipesResult readMessage(PipesResult.STATUS status) throws IOException {
        byte[] bArr = new byte[this.input.readInt()];
        this.input.readFully(bArr);
        return new PipesResult(status, new String(bArr, StandardCharsets.UTF_8));
    }

    private PipesResult readResults(FetchEmitTuple fetchEmitTuple, long j) throws IOException {
        int read = this.input.read();
        long currentTimeMillis = System.currentTimeMillis() - j;
        try {
            PipesServer.STATUS lookup = PipesServer.STATUS.lookup(read);
            switch (1.$SwitchMap$org$apache$tika$pipes$PipesServer$STATUS[lookup.ordinal()]) {
                case 1:
                    LOG.e("pipesClientId={} oom: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.OOM;
                case 2:
                    LOG.e("pipesClientId={} server response timeout: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.TIMEOUT;
                case 3:
                    LOG.e("pipesClientId={} emit exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.EMIT_EXCEPTION);
                case 4:
                    LOG.e("pipesClientId={} emitter not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_EMITTER_FOUND);
                case 5:
                    LOG.e("pipesClientId={} fetcher not found: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.NO_FETCHER_FOUND);
                case 6:
                    LOG.e("pipesClientId={} fetcher initialization exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCHER_INITIALIZATION_EXCEPTION);
                case 7:
                    LOG.e("pipesClientId={} fetch exception: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return readMessage(PipesResult.STATUS.FETCH_EXCEPTION);
                case 8:
                    LOG.j("pipesClientId={} intermediate success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return deserializeIntermediateResult(fetchEmitTuple.getEmitKey(), fetchEmitTuple.getParseContext());
                case 9:
                    LOG.j("pipesClientId={} parse success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return deserializeEmitData();
                case 10:
                    return readMessage(PipesResult.STATUS.PARSE_EXCEPTION_NO_EMIT);
                case 11:
                    LOG.j("pipesClientId={} emit success: {} in {} ms", Integer.valueOf(this.pipesClientId), fetchEmitTuple.getId(), Long.valueOf(currentTimeMillis));
                    return PipesResult.EMIT_SUCCESS;
                case 12:
                    return readMessage(PipesResult.STATUS.EMIT_SUCCESS_PARSE_EXCEPTION);
                case 13:
                    return PipesResult.EMPTY_OUTPUT;
                case 14:
                case 15:
                case 16:
                case 17:
                    throw new IOException("Not expecting this status: " + String.valueOf(lookup));
                default:
                    throw new IOException("Need to handle procesing for: " + String.valueOf(lookup));
            }
        } catch (IllegalArgumentException e) {
            throw new IOException("problem reading response from server: " + (read > -1 ? String.format(Locale.US, "%02x", new Object[]{Byte.valueOf((byte) read)}) : "-1"), e);
        }
    }

    private void restart() throws IOException, InterruptedException, TimeoutException {
        if (this.process != null) {
            Wb.c cVar = LOG;
            cVar.debug("process still alive; trying to destroy it");
            destroyForcibly();
            Process process = this.process;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!org.apache.tika.parser.external.a.a(process, 30L, timeUnit)) {
                cVar.p("pipesClientId={}: process has not yet ended", Integer.valueOf(this.pipesClientId));
            }
            this.executorService.shutdownNow();
            if (!this.executorService.awaitTermination(30L, timeUnit)) {
                cVar.p("pipesClientId={}: executorService has not yet shutdown", Integer.valueOf(this.pipesClientId));
            }
            synchronized (this.executorServiceLock) {
                if (this.closed) {
                    throw new IllegalArgumentException("pipesClientId=" + this.pipesClientId + ": PipesClient closed");
                }
                this.executorService = Executors.newFixedThreadPool(1);
            }
            cVar.o("pipesClientId={}: restarting process", Integer.valueOf(this.pipesClientId));
        } else {
            LOG.o("pipesClientId={}: starting process", Integer.valueOf(this.pipesClientId));
        }
        ProcessBuilder processBuilder = new ProcessBuilder(getCommandline());
        org.apache.tika.fork.e.a(processBuilder, org.apache.tika.fork.d.a());
        try {
            this.process = processBuilder.start();
            this.input = new DataInputStream(this.process.getInputStream());
            this.output = new DataOutputStream(this.process.getOutputStream());
            Eb.e l = Eb.e.k().l();
            FutureTask futureTask = new FutureTask(new c(this, l));
            long currentTimeMillis = System.currentTimeMillis();
            this.executorService.submit(futureTask);
            try {
                try {
                    try {
                        futureTask.get(this.pipesConfig.getStartupTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } finally {
                        futureTask.cancel(true);
                    }
                } catch (InterruptedException e) {
                    destroyForcibly();
                    throw e;
                }
            } catch (ExecutionException e2) {
                LOG.error("pipesClientId=" + this.pipesClientId + ": couldn't start server", e2);
                destroyForcibly();
                throw new RuntimeException(e2);
            } catch (TimeoutException e3) {
                LOG.i("pipesClientId={} didn't receive ready byte from server within StartupTimeoutMillis {}; ms elapsed {}; did read >{}<", Integer.valueOf(this.pipesClientId), Long.valueOf(this.pipesConfig.getStartupTimeoutMillis()), Long.valueOf(System.currentTimeMillis() - currentTimeMillis), l.f(StandardCharsets.UTF_8));
                destroyForcibly();
                throw e3;
            }
        } catch (Exception e4) {
            LOG.error("failed to start client", e4);
            throw new FailedToStartClientException(e4);
        }
    }

    public void close() throws IOException {
        if (this.process != null) {
            try {
                destroyForcibly();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this.executorServiceLock) {
            try {
                ExecutorService executorService = this.executorService;
                if (executorService != null) {
                    executorService.shutdownNow();
                }
                this.closed = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int getFilesProcessed() {
        return this.filesProcessed;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.apache.tika.pipes.PipesResult process(org.apache.tika.pipes.FetchEmitTuple r6) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r5 = this;
            boolean r0 = r5.ping()
            if (r0 != 0) goto L7
            goto L2c
        L7:
            org.apache.tika.pipes.PipesConfigBase r0 = r5.pipesConfig
            int r0 = r0.getMaxFilesProcessedPerProcess()
            if (r0 <= 0) goto L55
            int r0 = r5.filesProcessed
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            int r1 = r1.getMaxFilesProcessedPerProcess()
            if (r0 < r1) goto L55
            Wb.c r0 = org.apache.tika.pipes.PipesClient.LOG
            int r1 = r5.pipesClientId
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.filesProcessed
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "pipesClientId={}: restarting server after hitting max files: {}"
            r0.n(r3, r1, r2)
        L2c:
            r0 = 0
        L2d:
            if (r0 != 0) goto L55
            r5.restart()     // Catch: java.util.concurrent.TimeoutException -> L34
            r0 = 1
            goto L2d
        L34:
            Wb.c r1 = org.apache.tika.pipes.PipesClient.LOG
            int r2 = r5.pipesClientId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            org.apache.tika.pipes.PipesConfigBase r3 = r5.pipesConfig
            long r3 = r3.getStartupTimeoutMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "pipesClientId={}: couldn't restart within {} ms (startupTimeoutMillis)"
            r1.g(r4, r2, r3)
            org.apache.tika.pipes.PipesConfigBase r1 = r5.pipesConfig
            long r1 = r1.getSleepOnStartupTimeoutMillis()
            java.lang.Thread.sleep(r1)
            goto L2d
        L55:
            org.apache.tika.pipes.PipesResult r6 = r5.actuallyProcess(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.tika.pipes.PipesClient.process(org.apache.tika.pipes.FetchEmitTuple):org.apache.tika.pipes.PipesResult");
    }
}
