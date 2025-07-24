package serverwofacade;

public class ScheduleServerFacade {
    private ScheduleServer server = null;  

    public ScheduleServerFacade() {
        server = new ScheduleServer();
    }

    public void startServer() {
        server.startBooting();
        server.readSystemConfigFile();
        server.init();
        server.initializeContext();
        server.initializeListeners();
        server.createSystemObjects();
        System.out.println("Server started.");
    }

    public void stopServer() {
        server.releaseProcesses();
        server.destory();
        server.destroySystemObjects();
        server.destoryListeners();
        server.destoryContext();
        server.shutdown();
        System.out.println("Server stopped.");
    }
}

