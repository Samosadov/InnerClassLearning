package ru_synergy.anonimous;

public class Main {
    public static void main(String[] args) {
/*        GeneralIndicatorMonitoringModule genmodule = new GeneralIndicatorMonitoringModule();
        ErrorMonitoringModule errmodule = new ErrorMonitoringModule();
        SecurityMonitoringModule secmodule = new SecurityMonitoringModule();

        genmodule.startMonitoring();
        errmodule.startMonitoring();
        secmodule.startMonitoring();*/

        MonitoringSystem genmodule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("General monitoring started.");
            }
        };
        MonitoringSystem secmodule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Security monitoring started.");
            }
        };
        MonitoringSystem errmodule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Error monitoring started.");
            }
        };
        genmodule.startMonitoring();
        secmodule.startMonitoring();
        errmodule.startMonitoring();

    }
}
